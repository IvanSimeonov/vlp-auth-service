package bg.ivnsim.vlp.authservice.shared.auth.payload.response;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.auth.payload.response
 * <br>
 * Class:AuthenticationResponse
 * A data transfer object for authentication response
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
public class AuthenticationResponse {

    @JsonProperty("access_token")
    private String accessToken;

    @JsonProperty("refresh_token")
    private String refreshToken;
}