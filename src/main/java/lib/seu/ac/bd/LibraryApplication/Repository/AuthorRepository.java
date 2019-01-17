package lib.seu.ac.bd.LibraryApplication.Repository;

import lib.seu.ac.bd.LibraryApplication.Model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String>{
}
