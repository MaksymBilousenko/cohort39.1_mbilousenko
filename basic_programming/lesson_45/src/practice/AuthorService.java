package practice;

import java.util.List;

public interface AuthorService {
    void addAuthor(Author author);
    List<Author> findAllAuthors();
}

