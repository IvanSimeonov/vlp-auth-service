package bg.ivnsim.vlp.authservice.user.repository;

import bg.ivnsim.vlp.authservice.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 * Project: VLP
 * Package: bg.ivnsim.vlp.authservice.user.repository
 * <br>
 * Interface:UserRepository
 * A repository for users table
 * <br>
 *
 * @author ivansimeonov
 * @since 0.0.1
 * Date: 9.07.23
 * Time: 19:56
 * <br>
 * Created with IntelliJ IDEA
 * To change this template use File | Settings | File Templates.
 */

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
}