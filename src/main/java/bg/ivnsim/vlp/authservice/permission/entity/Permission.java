package bg.ivnsim.vlp.authservice.permission.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.permission.entity
 * <br>
 * Class:Permission
 * A class describing the properties of permission entity
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 19:51
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "permissions")
public class Permission {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

}