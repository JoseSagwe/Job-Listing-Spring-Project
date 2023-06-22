package com.example.joblistingproject.Repository;

import com.example.joblistingproject.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);
}
