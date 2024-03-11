package student_code.repository;

import student_code.Models.Author;
import student_code.interfaces.AuthorRepository;

import java.util.*;

public class AuthorRepositoryImpl implements AuthorRepository {
    private Set<Author> authors;

    public AuthorRepositoryImpl(Set<Author> authors) {
        this.authors = authors;
    }


    public AuthorRepositoryImpl(Collection<Author> authors) {
        this.authors = new HashSet<>(authors);
    }

    @Override
    public void addAuthor(Author author) {
        if (authors.contains(author)){
            System.out.println("Author already exist");
        } else {
            authors.add(author);
        }
    }

    @Override
    public boolean removeAuthor(Author author) {
        return true;
    }

    @Override
    public Set<Author> findAllAuthors() {
        return null;
    }
}
