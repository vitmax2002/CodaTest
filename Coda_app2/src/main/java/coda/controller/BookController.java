package coda.controller;

import coda.model.Book;
import coda.service.BookSaveDto;
import coda.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<Book> getAll() {
        return bookService.getAll();
    }

    @GetMapping("/books/{id}")
    public Book getById(@PathVariable("id") String id) {
        return bookService.getById(id);
    }
    @PostMapping("/books")
    public Book addBook(@RequestBody BookSaveDto dto) {
        return bookService.createBook(dto);
    }

    @PutMapping("/books/{id}")
    public Book updateBook(@PathVariable String id, @RequestBody BookSaveDto book) {
        return bookService.updateBook(id, book);
    }

    @DeleteMapping("/books/{id}")
    public String deleteBook(@PathVariable("id") String id) {
        return bookService.delete(id);
    }


}