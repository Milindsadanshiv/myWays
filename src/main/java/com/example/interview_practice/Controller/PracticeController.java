package com.example.interview_practice.Controller;

import com.example.interview_practice.Service.PracticeService;
import com.example.interview_practice.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/jsonplaceholder.typicode.com")
public class PracticeController {

    @Autowired
    PracticeService practiceService;
    @PostMapping("/add")
       public void addPost(@RequestBody Post post)
       {
           practiceService.addPost(post);
       }
       @GetMapping("/posts/1")
    public String getUser() throws Exception {
           return practiceService.getPost();
       }
}
