package livros;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Library {

    private List<Book> bookList = new ArrayList<>();


    public void addBookInList(Book book) {
        this.bookList.add(book);
        System.out.println(System.lineSeparator());
        System.out.println("Livro cadastrado com sucesso...");
    }

    public void getBookInList() {
        if (!this.bookList.isEmpty()) {
            for (Book book : this.bookList) {
                if (book.getIsAvailable()){
                    System.out.println("Biblioteca Unique:");
                    System.out.println("------------------------------------------------------------");
                    System.out.println(String.format("Id: %-50.50s  |  Title: %-20.20s  |  Author :%s-20.20s  |  Data Emissão: %-10s ",
                            book.getId(), book.getTitle(), book.getAuthorNameBook(), book.getCreateDate()));
                } else {
                    System.out.println("No momento todos os livros emprestados!");
                }
            }
        } else {
            System.out.println("Biblioteca sem livros no momento!");
        }
    }

    public void setBookHire(String bookId) {
        if (!this.bookList.isEmpty()) {
            for (Book book : this.bookList) {
                if (bookId.equals(book.getId())){
                    book.setIsAvailable();
                    System.out.println(String.format("O livro %s esta sendo emprestado com sucesso!", book.getTitle().toUpperCase()));
                } else {
                    System.out.println("Não existe este livro na base!");
                }
            }
        } else {
            System.out.println("Não existe livros na livraria no momento!");
        }

    }
}


