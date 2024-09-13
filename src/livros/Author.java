package livros;

import java.time.LocalDate;
import java.util.UUID;

public class Author {
    private String id;
    private String name;
    private LocalDate dateOfBirth;


    public Author(String name, LocalDate dateOfBirth) {
        this.id = UUID.randomUUID().toString();
        this.name = name;
        this.dateOfBirth = dateOfBirth;
    }

    public String getId() {
        return this.id;
    }

    public String getName(){
        return this.name;
    }
}
