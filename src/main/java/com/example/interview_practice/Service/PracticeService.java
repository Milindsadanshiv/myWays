package com.example.interview_practice.Service;

import com.example.interview_practice.Repository.PracticeRepository;
import com.example.interview_practice.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PracticeService {
    @Autowired
    PracticeRepository practiceRepository;
    public void addPost(Post post)
    {
        practiceRepository.addPost(post);
    }
    public String getPost() {
        return practiceRepository.getPost();
    }
}
