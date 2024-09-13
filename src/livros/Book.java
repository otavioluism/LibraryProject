package livros;

import java.time.LocalDate;
import java.util.UUID;

public class Book {
    private String id;
    private String authorId;
    private String title;
    private Author author;
    private Boolean isAvailable;
    private LocalDate dateCreate;
    private LocalDate dateUpdated;


    public Book(String title, Author author){
        this.id = UUID.randomUUID().toString();
        this.authorId = author.getId();
        this.title = title;
        this.author = author;
        this.isAvailable = Boolean.TRUE;
        this.dateCreate = LocalDate.now();
        this.dateUpdated = LocalDate.now();
    }

    public String getTitle(){
        return this.title;
    }

    public String getId(){
        return this.id;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public String getAuthorNameBook() {
        return this.author.getName();
    }

    public String getCreateDate(){
        return this.dateCreate.toString();
    }

    public void setIsAvailable(){
        this.isAvailable = Boolean.FALSE;
    }


}
