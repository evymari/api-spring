package com.org.api.books;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/books")

public class BookController {

    private final BookRepository bookRepository;

    public BookController(BookRepository BOOKREPOSITORY) {
        this.bookRepository = BOOKREPOSITORY;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return this.bookRepository.findAll();

    }

    @GetMapping("/{isbn}")
    public ResponseEntity<Book> getBookByIsbn(@PathVariable String isbn) {
        Optional<Book> optionalBook =  bookRepository.findByIsbn(isbn);

        if (optionalBook.isPresent()) {
            return new ResponseEntity<>(optionalBook.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        bookRepository.save(book);
        return book;
    }

    @DeleteMapping("/{isbn}")

    public ResponseEntity<Object> deleteBookByIsbn(@PathVariable String isbn) {
        Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);
        if ((optionalBook.isEmpty())) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }

        bookRepository.deleteByIsbn(isbn);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping("/{isbn}")
    public ResponseEntity<Book> updateBookIsbn(@PathVariable String isbn, @RequestBody Book updateBookIsbn) {
        Optional<Book> optionalBook = bookRepository.findByIsbn(isbn);


        if (optionalBook.isEmpty()) {

            return new ResponseEntity<>(HttpStatus.NOT_FOUND); // Retorna el libro actualizado con código 200
        }


        Book book = optionalBook.get();
        book.setTitle(updateBookIsbn.getTitle());

        book.setAuthor(updateBookIsbn.getAuthor());

        return new ResponseEntity<>(book, HttpStatus.OK);
    }
}

