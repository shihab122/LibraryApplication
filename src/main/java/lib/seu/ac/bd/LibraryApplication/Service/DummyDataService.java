package lib.seu.ac.bd.LibraryApplication.Service;


import lib.seu.ac.bd.LibraryApplication.Model.Author;
import lib.seu.ac.bd.LibraryApplication.Model.Book;
import lib.seu.ac.bd.LibraryApplication.Repository.AuthorRepository;
import lib.seu.ac.bd.LibraryApplication.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@AllArgsConstructor
public class DummyDataService {
    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;

    public void presistDummyData(){
        Author a1 = new Author("Ziaul", "Haque", "Bangladesh", 23);
        Author a2 = new Author("Rana", "Hossain", "Bangladesh", 23);
        Author a3 = new Author("Ebrahim", "Rian", "Bangladesh", 24);
        Book b1 = new Book(1, "C Language", Arrays.asList(a1, a2), "1sd12", "12434");
        Book b2 = new Book(2, "C++ Language", Arrays.asList(a2, a3), "1sd123", "12435");
        Book b3 = new Book(3, "C++ Language", Arrays.asList(a1, a3), "1sd124", "12436");

        authorRepository.save(a1);
        authorRepository.save(a2);
        authorRepository.save(a3);

        bookRepository.save(b1);
        bookRepository.save(b2);
        bookRepository.save(b3);


    }
}
