import java.time.format.DateTimeFormatter;
import java.util.InputMismatchException;
import java.util.Scanner;

import livros.Author;
import livros.Book;
import livros.Library;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        int option = 1;
        Scanner scanner = new Scanner(System.in);
        Library library = new Library();
        try {

            while (option != 0){
                System.out.println("Verifique as opções abaixo: ");
                System.out.println("0 - Sair do programa");
                System.out.println("1 - Cadastrar Livro");
                System.out.println("2 - Verificar todos os livros");
                System.out.println("3 - Emprestar livro");
                System.out.println("4 - Deletar livro");

                option = scanner.nextInt(); // Lê uma linha de inteiro do scanner/captando linha do scanner

                switch (option) {
                    case 0:
                        System.out.println("Saindo do programa...");
                        break;
                    case 1:
                        addBookInLibrary(scanner, library);
                        break;
                    case 2:
                        getBookList(library);
                        break;
                    case 3:
                        getBookHire(scanner, library);
                        break;
                    case 4:
                        deleteBookList(scanner, library);
                        break;
                    default:
                        System.out.println("Opção inválida, digite outra opção");
                        break;
                }
                System.out.println(System.lineSeparator());
            }


        } catch (InputMismatchException e) {
            System.out.println("Entrada inválida. Por favor, insira o tipo de dado correto para a entrada.");
        }finally {
            scanner.close(); // Fecha o scanner para liberar recursos memoria
        }

        }

        public static void addBookInLibrary(Scanner scanner, Library library){
            System.out.println("...Cadastrar um livro...");
            scanner.nextLine(); // Solução para limpar o buffer do scanner por conta do nextInt

            System.out.println("Nome do autor:");
            String name = scanner.nextLine();

            System.out.println("Data de nascimento do autor: (dia/mês/ano)");
            String dateOfBirthString = scanner.nextLine();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            LocalDate dateOfBirth = LocalDate.parse(dateOfBirthString, formatter);

            Author author = new Author(name, dateOfBirth);

            System.out.println("Nome título do livro");
            String title = scanner.nextLine();

            Book book = new Book(title,author);

            library.addBookInList(book);

        }

        public static void getBookList(Library library){
            library.getBookInList();
        }

        public static void getBookHire(Scanner scanner, Library library){
            if (!library.isEmptyBookInList()){
                System.out.println("...Emprestar um livro...");
                scanner.nextLine(); // Solução para limpar o buffer do scanner por conta do nextInt
                System.out.println("Insira o id do livro: ");
                String bookId = scanner.nextLine();

                library.setBookHire(bookId);
            } else {
                System.out.println("Sem livros no momento para emprestar!");
            }

        }

        public static void deleteBookList(Scanner scanner, Library library){
            if (!library.isEmptyBookInList()) {
                System.out.println("...Deletar um livro...");
                scanner.nextLine(); // Solução para limpar o buffer do scanner por conta do nextInt
                System.out.println("Insira o id do livro: ");
                String bookId = scanner.nextLine();

                library.deleteBook(bookId);
            } else {
                System.out.println("Biblioteca vazia, não temos mais livros!");
            }
        }
    }