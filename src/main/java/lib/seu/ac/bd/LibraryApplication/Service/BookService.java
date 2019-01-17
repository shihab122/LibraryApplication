package lib.seu.ac.bd.LibraryApplication.Service;

import lib.seu.ac.bd.LibraryApplication.Model.Book;
import lib.seu.ac.bd.LibraryApplication.Repository.BookRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class BookService {

    private BookRepository bookRepository;

    public List<Book> getAllBooks(){
        Iterable<Book> bookIterable = bookRepository.findAll();
        List<Book> booksList = new ArrayList<>();
        bookIterable.forEach(booksList::add);
        return booksList;
    }

    public Book getBook(int id){
        return bookRepository.findById(id).get();
    }

    public void saveBook(Book book){
        bookRepository.save(book);
    }

}
