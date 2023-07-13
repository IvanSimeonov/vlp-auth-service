package bg.ivnsim.vlp.authservice.role.entity;

import bg.ivnsim.vlp.authservice.permission.entity.Permission;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.role.entity
 * <br>
 * Class:Role
 * A class describing the properties of role entity
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 19:46
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "roles")
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "role_permissions",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private List<Permission> permissions;
}