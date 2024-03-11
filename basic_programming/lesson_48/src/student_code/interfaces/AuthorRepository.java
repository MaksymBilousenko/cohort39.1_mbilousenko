package student_code.interfaces;

import student_code.Models.Author;

import java.util.Set;

public interface AuthorRepository {
    void addAuthor(Author author);
    boolean removeAuthor(Author author);
    Set<Author> findAllAuthors();
}
