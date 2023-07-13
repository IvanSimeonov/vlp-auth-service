package bg.ivnsim.vlp.authservice.shared.auth.service;

import bg.ivnsim.vlp.authservice.shared.auth.payload.request.AuthenticationRequest;
import bg.ivnsim.vlp.authservice.shared.auth.payload.request.RegisterRequest;
import bg.ivnsim.vlp.authservice.shared.auth.payload.response.AuthenticationResponse;
import bg.ivnsim.vlp.authservice.shared.config.IJwtService;
import bg.ivnsim.vlp.authservice.user.entity.User;
import bg.ivnsim.vlp.authservice.user.repository.UserRepository;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.io.IOException;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.auth.service
 * <br>
 * Class:AuthService
 * A class responsible for registering and authenticating users
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 22:15
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Service
@RequiredArgsConstructor
public class AuthService implements IAuthService{

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final IJwtService jwtService;
    private final AuthenticationManager authenticationManager;

    @Override
    public AuthenticationResponse register(RegisterRequest request) {
        var user = User.builder()
                .fullName(request.getFullName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .roles(request.getRoles())
                .build();
        userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
        var jwtRefreshToken = jwtService.generateRefreshToken(user);
        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .refreshToken(jwtRefreshToken)
                .build();
    }

    @Override
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = userRepository.findByEmail(request.getEmail()).orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        var jwtRefreshToken = jwtService.generateRefreshToken(user);
        return AuthenticationResponse.builder()
                .accessToken(jwtToken)
                .refreshToken(jwtRefreshToken)
                .build();
    }

    @Override
    public void refreshToken(HttpServletRequest request, HttpServletResponse response) throws IOException {

    }
}