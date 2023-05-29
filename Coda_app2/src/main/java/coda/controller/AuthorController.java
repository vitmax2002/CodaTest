package coda.controller;

import coda.model.Author;
import coda.service.AuthorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AuthorController {

    private final AuthorService authorService;

    public AuthorController(AuthorService authorService) {
        this.authorService = authorService;
    }

    @GetMapping("/authors")
    public List<Author> getAll() {
        return authorService.getAll();
    }

    @GetMapping("/authors/{id}")
    public Author getById(@PathVariable("id") int id) {
        return authorService.getById(id);
    }
    @PostMapping("/authors")
    public Author addBook(@RequestBody Author author) {
        return authorService.createAuthor(author);
    }

    @PutMapping("/authors/{id}")
    public Author updateBook(@PathVariable int id, @RequestBody Author author) {
        return authorService.updateAuthor(id, author);
    }

    @DeleteMapping("/authors/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        return authorService.delete(id);
    }
}