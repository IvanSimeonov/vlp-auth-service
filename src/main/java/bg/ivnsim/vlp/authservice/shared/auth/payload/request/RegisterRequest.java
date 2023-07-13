package bg.ivnsim.vlp.authservice.shared.auth.payload.request;

import bg.ivnsim.vlp.authservice.role.entity.Role;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.auth.payload.request
 * <br>
 * Class:RegisterRequest
 * A data transfer object for register request
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 22:08
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RegisterRequest {
    private String fullName;
    private String email;
    private String password;
    private List<Role> roles;
}