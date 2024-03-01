package practice;

import java.util.List;

public interface BookService {
    void addBook(Book book);
    List<Book> findAllBooks();
}

