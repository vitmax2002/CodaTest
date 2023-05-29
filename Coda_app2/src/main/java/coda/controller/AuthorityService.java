package coda.controller;

import coda.model.Authority;
import coda.repository.AuthorityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AuthorityService {
    @Autowired
    private AuthorityRepository authorityRepository;

    @PostMapping("/authority/add")
    public Authority addAuthority(@RequestBody Authority authority)
    {
        return authorityRepository.save(authority);
    }
}
