package kr.hs.dgsw.web_back.Service;

import kr.hs.dgsw.web_back.Domain.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    User add(User user);

    User Login(User user);

    List findAll();

    int deleteById(User user);

    int modify(User user);

    Optional<User> findById(Long id);
}
