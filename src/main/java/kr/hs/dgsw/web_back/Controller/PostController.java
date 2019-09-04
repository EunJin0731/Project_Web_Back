package kr.hs.dgsw.web_back.Controller;

import kr.hs.dgsw.web_back.Domain.Post;
import kr.hs.dgsw.web_back.Service.PostService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/board")
public class PostController {

    @Autowired
    private PostService postService;

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getSimpleName());

    @GetMapping("/user/{userId}") // list by user
    public List list(@PathVariable Long userId) {
        return this.postService.findByUserId(userId);
    }

    @GetMapping
    public List articles() {
        return this.postService.findAllPost();
    }

    @GetMapping("/{id}")
    public Post view(@PathVariable Long id) {
        return this.postService.findByPostId(id);
    }

    @PostMapping
    public Long addWithHashMap(@RequestBody Post post) {
        return this.postService.addWithHashMap(post);
    }

    @DeleteMapping("/{id}")
    public int delete(@PathVariable Long id) {
        return this.postService.deleteByPostId(id);
    }

    @PutMapping(value = "/{id}")
    public int modifyPost(@RequestBody Post post){
        return this.postService.modifyPost(post);
    }

}