package coda.controller;

import coda.model.BorrowedBook;
import coda.service.BorrowedBookDto;
import coda.service.BorrowedBookService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BorrowedBookController {

   private final BorrowedBookService borrowedBookService;

    public BorrowedBookController(BorrowedBookService borrowedBookService) {
        this.borrowedBookService = borrowedBookService;
    }


    @PostMapping("/borrow")
    public BorrowedBook addBook(@RequestBody BorrowedBookDto bookDto)
    {
        return borrowedBookService.createBook(bookDto);
    }

    @GetMapping("/borrowers")
    public List<BorrowedBook> showBorrowers()
    {
        return borrowedBookService.getAll();
    }

    @DeleteMapping("borrow/delete/{id}")
    public String deleteBook(@PathVariable int id)
    {
        return borrowedBookService.delete(id);
    }
}
