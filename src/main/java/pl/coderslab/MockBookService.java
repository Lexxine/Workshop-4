package pl.coderslab;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MockBookService implements BookService {
    private List<Book> list;
    private static Long nextId = 4L;


    public MockBookService() {
        this.list = new ArrayList<>();
        list.add(new Book(1L, "9788324631766", "Thinking in Java", "Bruce Eckel", "Helion", "programming"));
        list.add(new Book(2L, "9780134685991", "Harry Potter", "J.K.R.", "Some publisher", "Fantasy"));
        list.add(new Book(3L, "9780596009205", "Pride and prejudice", "Jane Austen", "Another publisher", "Novel"));
    }

    @Override
    public List<Book> getBooks() {
        return new ArrayList<>(list);
    }

    @Override
    public Optional<Book> get(Long id) {
        return list.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    @Override
    public void add(Book book) {
        book.setId(nextId++);
        list.add(book);
    }

    @Override
    public void delete(Long id) {
        if (get(id).isPresent()) {
            list.remove(this.get(id).get());
        }
    }

    @Override
    public void update(Book book) {
        if (this.get(book.getId()).isPresent()) {
            int indexOf = list.indexOf(this.get(book.getId()).get());
            list.set(indexOf, book);
        }
    }

}
