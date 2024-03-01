package practice;

import java.util.Scanner;

public class LibraryApplication {
    private final BookService bookService;
    private final AuthorService authorService;
    private final ReaderService readerService;
    private final Scanner scanner;

    public LibraryApplication(BookService bookService, AuthorService authorService, ReaderService readerService) {
        this.bookService = bookService;
        this.authorService = authorService;
        this.readerService = readerService;
        this.scanner = new Scanner(System.in);
    }

    public void run() {
        boolean running = true;
        while (running) {
            System.out.println("Добро пожаловать в систему управления библиотекой!");
            System.out.println("1. Показать список книг");
            System.out.println("2. Показать список авторов");
            System.out.println("3. Показать список читателей");
            System.out.println("4. Добавить новую книгу");
            System.out.println("5. Регистрация нового читателя");
            System.out.println("0. Выход");

            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    // Логика отображения списка книг
                    break;
                case 2:
                    // Логика отображения списка авторов
                    break;
                case 3:
                    // Логика отображения списка читателей
                    break;
                case 4:
                    // Логика добавления новой книги
                    break;
                case 5:
                    // Логика регистрации нового читателя
                    break;
                case 0:
                    running = false;
                    break;
                default:
                    System.out.println("Неверный ввод, попробуйте снова.");
            }
        }
    }

    public static void main(String[] args) {
        BookService bookService = new BookServiceImpl();
        AuthorService authorService = new AuthorServiceImpl();
        ReaderService readerService = new ReaderServiceImpl();

        LibraryApplication app = new LibraryApplication(bookService, authorService, readerService);
        app.run();
    }
}

