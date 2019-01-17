package lib.seu.ac.bd.LibraryApplication.Service;

import lib.seu.ac.bd.LibraryApplication.Model.Author;
import lib.seu.ac.bd.LibraryApplication.Repository.AuthorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class AuthorService {
    private AuthorRepository authorRepository;

    public List<Author> getAllAuthor(){
        Iterable<Author> authorIterable = authorRepository.findAll();
        List<Author> authorList = new ArrayList<>();
        authorIterable.forEach(authorList::add);
        return authorList;
    }

    public Author getAuthor(String firstName){
        return authorRepository.findById(firstName).get();
    }

    public void saveAuthor(Author author){
        authorRepository.save(author);
    }

}
