package bg.ivnsim.vlp.authservice.shared.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: FiSCo
 * Package: bg.ivnsim.vlp.authservice.shared.demo
 * <br>
 * Class:AdminController
 * Admin Controller
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 12.07.23
 * Time: 19:57
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@RestController
@RequestMapping("/api/v1/admin")
@PreAuthorize("hasRole('ADMIN')")
public class AdminController {
    @GetMapping
    public ResponseEntity<String> adminAccess() {
        return ResponseEntity.ok("Admin Acces");
    }

}