package bg.ivnsim.vlp.authservice.shared.auth.payload.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.auth.payload.request
 * <br>
 * Class:LoginRequest
 * A data transfer object for authentication(login) request
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 22:09
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AuthenticationRequest {
    private String email;
    private String password;
}