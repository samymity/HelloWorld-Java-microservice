package com.example.helloworld.controller;

import com.example.helloworld.service.GitHubService;
import com.example.helloworld.model.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GitHubController {

    private final GitHubService gitHubService;

    @Autowired
    public GitHubController(GitHubService gitHubService) {
        this.gitHubService = gitHubService;
    }

    @GetMapping("/repos/{username}")
    public List<Repository> getUserRepos(@PathVariable String username) {
        return gitHubService.getRepositories(username);
    }
}