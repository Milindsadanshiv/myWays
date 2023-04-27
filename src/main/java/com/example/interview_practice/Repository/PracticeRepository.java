package com.example.interview_practice.Repository;

import com.example.interview_practice.Post;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

@Repository
public class PracticeRepository {

    HashMap<Integer, Post> userMap=new HashMap<>();

    Post post=new Post(1,1,"sunt aut facere repellat provident occaecati excepturi optio reprehenderit","quia et suscipit\nsuscipit recusandae consequuntur expedita et cum\nreprehenderit molestiae ut ut quas totam\nnostrum rerum est autem sunt rem eveniet architecto");
    public void addPost(Post post)
    {
        userMap.put(post.getUserId(),post);
    }

    public String getPost() {
        userMap.put(post.getUserId(),post);
      return userMap.get(1).getTitle();
    }
}
