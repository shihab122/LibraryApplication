package lib.seu.ac.bd.LibraryApplication.Repository;

import lib.seu.ac.bd.LibraryApplication.Model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends MongoRepository<Book, String>{
}
