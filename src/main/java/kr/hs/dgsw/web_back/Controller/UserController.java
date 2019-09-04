package kr.hs.dgsw.web_back.Controller;

import kr.hs.dgsw.web_back.Domain.User;
import kr.hs.dgsw.web_back.Service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/addUser")
    public User addUser(@RequestBody User user){
        return this.userService.add(user);
    }

    @PostMapping("/login")
    public User login(@RequestBody User user){
        return this.userService.Login(user);
    }

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @GetMapping(value = "/users")
    public List findAll() {
        return this.userService.findAll();
    }

    @DeleteMapping(value = "/deleteUser/{user}")
    public int deleteUser(@PathVariable User user){
        return this.userService.deleteById(user);
    }

    @PutMapping(value = "/updateUser/{user}")
    public int updateUser(@RequestBody User user){
        return this.userService.modify(user);
    }

    @GetMapping(value = "/user/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return this.userService.findById(id);
    }
}
