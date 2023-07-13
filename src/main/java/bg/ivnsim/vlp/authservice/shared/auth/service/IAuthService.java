package bg.ivnsim.vlp.authservice.shared.auth.service;

import bg.ivnsim.vlp.authservice.shared.auth.payload.request.AuthenticationRequest;
import bg.ivnsim.vlp.authservice.shared.auth.payload.request.RegisterRequest;
import bg.ivnsim.vlp.authservice.shared.auth.payload.response.AuthenticationResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.auth.service
 * <br>
 * Interface:IAuthService
 *
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 22:18
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface IAuthService {

    AuthenticationResponse register(RegisterRequest request);
    AuthenticationResponse authenticate(AuthenticationRequest request);
    void refreshToken(
            HttpServletRequest request,
            HttpServletResponse response
    ) throws IOException;
}