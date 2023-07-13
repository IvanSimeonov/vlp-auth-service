package bg.ivnsim.vlp.authservice.shared.demo;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.shared.demo
 * <br>
 * Class:DemoController
 * Demo Controller
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 12.07.23
 * Time: 19:56
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@RestController
@RequestMapping("/api/v1/demo")
public class DemoController {

    @GetMapping
    public ResponseEntity<String> freeAccess() {
        return ResponseEntity.ok("Free Access");
    }
}