package kr.hs.dgsw.web_back.Service;

import kr.hs.dgsw.web_back.Domain.Post;
import kr.hs.dgsw.web_back.Repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class PostServiceImpl implements PostService {

    @Autowired
    PostRepository postRepository;

    @Override
    public List<Post> findAllPost() {
        return this.postRepository.findAllPost();
    }

    @Override
    public int deleteByPostId(Long id) {
        return this.postRepository.deleteByPostId(id);
    }

    @Override
    public Long addPost(Post post) {
        return this.postRepository.addPost(post);
    }

    @Override
    public int modifyPost(Post post) {
        return this.postRepository.modifyPost(post);
    }

    @Override
    public Post findByPostId(Long id) {
        return this.postRepository.findByPostId(id);
    }

    @Override
    public List<Post> findByUserId(Long userId) {
        return this.postRepository.findByUserId(userId);
    }

    @Override
    public Long addWithHashMap(Post post) {
        HashMap map = new HashMap<String, Object>();
        map.put("writer", post.getWriter());
        map.put("title", post.getTitle());
        map.put("content", post.getContent());
        return this.postRepository.addWithHashMap(map);
    }
}