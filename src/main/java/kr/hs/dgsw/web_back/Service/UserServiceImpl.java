package kr.hs.dgsw.web_back.Service;

import kr.hs.dgsw.web_back.Domain.User;
import kr.hs.dgsw.web_back.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserRepository userRepository;

    @Override
    public User add(User user) {
        return this.userRepository.save(user);
    }

    @Override
    public User Login(User user) {
        Optional<User> found = this.userRepository.findByAccountAndPassword(user.getAccount(), user.getPassword());
        if(found.isPresent()){
            if(found.get().getPassword().equals(user.getPassword())){
                return found.get();
            }
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        return this.userRepository.findAll();
    }

    @Override
    public int deleteById(User user) {
        return this.userRepository.deleteById(user);
    }

    @Override
    public int modify(User user) {
        return this.userRepository.modify(user);
    }

    @Override
    public Optional<User> findById(Long id) {
        return this.userRepository.findById(id);
    }
}