package lib.seu.ac.bd.LibraryApplication.Controller;

import lib.seu.ac.bd.LibraryApplication.Model.Author;
import lib.seu.ac.bd.LibraryApplication.Service.AuthorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/author")
public class AuthorController {
    private AuthorService authorService;
    private List<Author> authorList;
    ///

    public AuthorController(AuthorService authorService){
        this.authorService = authorService;
        this.authorList = authorService.getAllAuthor();
    }

    @GetMapping(value = "/all")
    public ResponseEntity<List<Author>> getAllAuthor(){
        return ResponseEntity.status(HttpStatus.OK).body(authorList);

    }

    @PostMapping(value = "/new")
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
        authorService.saveAuthor(author);
        return ResponseEntity.status(HttpStatus.CREATED).body(author);
    }

}
