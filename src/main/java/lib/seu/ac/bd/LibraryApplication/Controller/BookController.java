package lib.seu.ac.bd.LibraryApplication.Controller;


import lib.seu.ac.bd.LibraryApplication.Model.Author;
import lib.seu.ac.bd.LibraryApplication.Model.Book;
import lib.seu.ac.bd.LibraryApplication.Service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/book")
public class BookController {
    private BookService bookService;
    private List<Book> bookList;

    public BookController(BookService bookService){
        this.bookService = bookService;
        this.bookList = bookService.getAllBooks();
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.status(HttpStatus.OK).body(bookList);
    }

    @PostMapping(value = "/new")
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        bookService.saveBook(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }


}
