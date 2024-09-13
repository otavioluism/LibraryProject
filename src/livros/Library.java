package livros;

import java.time.LocalDate;
import java.util.List;

public class Library {

    private Integer codeBook;
    private String bookName;
    private LocalDate dateBorrowed;
    private Boolean isAvailable = Boolean.TRUE;

    public Library(String bookName, LocalDate dateBorrowed, Integer code) {
        this.codeBook = code;
        this.bookName = bookName;
        this.dateBorrowed = dateBorrowed;
    }

    public static void getBorrowedBook(Integer codeBook, List<Library> allBooks){ // Emprestar livro

        for (Library book: allBooks) {
            if (codeBook.equals(book.codeBook) && Boolean.TRUE.equals(book.isAvailable)){
                System.out.println("Livro encontrado, podendo ser emprestado!");
                System.out.println(String.format("Nome do Livro: %s ", book.bookName));
                book.isAvailable = Boolean.FALSE;
                System.out.println(System.lineSeparator());
                break;
            }
        }

        System.out.println(System.lineSeparator());
        // Retorna null se nenhum livro for encontrado
        System.out.println("Livro não encontrado ou não disponível para empréstimo.");

    }

    public static void showAllBooksLibrary(List<Library> allBooks){
        for (Library book:allBooks) {
            System.out.println(String.format("%-5d   |  Nome Livro: %-30.30s  |   %-10s", book.codeBook, book.bookName, book.isAvailable ? "Disponível" : "Indisponível"));
        }
        System.out.println(System.lineSeparator());
    }
}
