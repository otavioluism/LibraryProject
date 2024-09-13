import livros.Library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {


        Library newBook1 = new Library("Harry Potter", LocalDate.of(2023, 10, 5), 1);
        Library newBook2 = new Library("Ferrari 1", LocalDate.of(2014, 10, 5), 2);
        Library newBook3 = new Library("Baby Shark", LocalDate.of(2001, 10, 6), 3);
        Library newBook4 = new Library("1 Milion Pessoas", LocalDate.of(2023, 10, 7), 4);
        Library newBook5 = new Library("Passando na sua tela", LocalDate.of(2023, 10, 10), 5);
        Library newBook6 = new Library("o Inimigo", LocalDate.of(2008, 10, 25), 6);
        Library newBook7 = new Library("Dekster", LocalDate.of(2023, 10, 9), 7);
        Library newBook8 = new Library("Pocahontas", LocalDate.of(2006, 10, 19), 8);


        List<Library> listBooks = new ArrayList<>();

        listBooks.add(newBook1);
        listBooks.add(newBook2);
        listBooks.add(newBook3);
        listBooks.add(newBook4);
        listBooks.add(newBook5);
        listBooks.add(newBook6);
        listBooks.add(newBook7);
        listBooks.add(newBook8);


        Library.showAllBooksLibrary(listBooks);
        Library.getBorrowedBook(4, listBooks);
        Library.showAllBooksLibrary(listBooks);
        Library.getBorrowedBook(4, listBooks);

        }
    }