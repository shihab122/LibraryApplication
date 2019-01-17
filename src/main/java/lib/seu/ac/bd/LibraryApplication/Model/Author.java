package lib.seu.ac.bd.LibraryApplication.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document
public class Author {
    private String firstName;
    private String lastName;
    private String Country;
    private int age;


}
