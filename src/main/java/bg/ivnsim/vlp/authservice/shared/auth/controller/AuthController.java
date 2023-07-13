package bg.ivnsim.vlp.authservice.shared.auth.controller;

import bg.ivnsim.vlp.authservice.shared.auth.payload.request.AuthenticationRequest;
import bg.ivnsim.vlp.authservice.shared.auth.payload.request.RegisterRequest;
import bg.ivnsim.vlp.authservice.shared.auth.payload.response.AuthenticationResponse;
import bg.ivnsim.vlp.authservice.shared.auth.service.AuthService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.auth
 * <br>
 * Class:AuthController
 * A class allowing register and authenticate new user and also provide refresh token
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 22:00
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> registerUser(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthenticationResponse> authenticateUser (
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(authService.authenticate(request));
    }

    @PostMapping("/refresh-token")
    public void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException {
        authService.refreshToken(request, response);
    }

}