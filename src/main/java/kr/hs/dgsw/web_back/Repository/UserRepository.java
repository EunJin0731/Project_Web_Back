package kr.hs.dgsw.web_back.Repository;

import kr.hs.dgsw.web_back.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByAccountAndPassword(String account, String password);

    User add(User user);

    User Login(User user);

    List findAll();

    int deleteById(User user);

    int modify(User user);

    Optional<User>findById(Long id);
}
