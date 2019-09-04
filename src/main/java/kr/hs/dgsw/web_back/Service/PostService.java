package kr.hs.dgsw.web_back.Service;

import kr.hs.dgsw.web_back.Domain.Post;

import java.util.List;

public interface PostService {

    List<Post> findAllPost();
    Long addPost(Post post);
    int modifyPost(Post post);
    List<Post> findByUserId(Long userId);
    Long addWithHashMap(Post post);
    Post findByPostId(Long id);
    int deleteByPostId(Long id);
}