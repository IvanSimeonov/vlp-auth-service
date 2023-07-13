package bg.ivnsim.vlp.authservice.shared.config;

import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Map;
import java.util.function.Function;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.config
 * <br>
 * Interface:IJwtService
 *
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 22:25
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
public interface IJwtService {
    String extractUsername(String token);
    String generateToken(UserDetails userDetails);
    String generateToken(Map<String, Object> extraClaims, UserDetails userDetails);
    String generateRefreshToken(UserDetails userDetails);
    boolean validateToken(String token, UserDetails userDetails);
    <T> T extractClaim(String token, Function<Claims, T> claimsResolver);
}