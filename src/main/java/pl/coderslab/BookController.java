package pl.coderslab;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")
public class BookController {
    private final MockBookService mockBookService;

    public BookController(MockBookService mockBookService) {
        this.mockBookService = mockBookService;
    }

    @GetMapping("/books")
    public List<Book> helloBook() {
        return mockBookService.getBooks();
    }
    @GetMapping("/{id}")
    public Book getBookById(@PathVariable Long id) {
        Optional<Book> optionalBook = mockBookService.get(id);
        if (optionalBook.isPresent()) {
            return optionalBook.get();
        } else {
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);
        }
    }
    @PostMapping("")
    public void addBook(@RequestBody Book book) {
        mockBookService.add(book);
    }
    @PutMapping("")
    @ResponseBody
    public void updateBook(@RequestBody Book book) {
        mockBookService.update(book);
    }


    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable Long id) {
        mockBookService.delete(id);
    }
}
