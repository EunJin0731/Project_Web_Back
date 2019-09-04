package kr.hs.dgsw.web_back.Repository;

import kr.hs.dgsw.web_back.Domain.Post;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.HashMap;
import java.util.List;

public interface PostRepository extends JpaRepository<Post, Long> {
    Long addWithHashMap(HashMap map);

    List<Post> findByUserId(Long userId);

    Post findByPostId(Long id);

    int modifyPost(Post post);

    Long addPost(Post post);

    int deleteByPostId(Long id);

    List<Post> findAllPost();
}
