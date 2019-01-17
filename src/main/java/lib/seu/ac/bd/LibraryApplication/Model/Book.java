package lib.seu.ac.bd.LibraryApplication.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Book {
    private int id;
    private String name;
    private List<Author> author;
    private String issnNumber;
    private String isbnNumber;

}
