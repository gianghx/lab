package gianghx.lab.repository;

import gianghx.lab.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    Integer deleteById (long id);
}
