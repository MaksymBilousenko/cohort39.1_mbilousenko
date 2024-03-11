package student_code.Models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Article {
    private int ID;
    private String title;
    private String conten;
    private LocalDateTime publishDate;
    private Author author;
    private static int count;

    public Article(String title, String conten, Author author) {
        this.title = title;
        this.conten = conten;
        this.author = author;
        this.publishDate = LocalDateTime.now();
        this.ID = count++;

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getConten() {
        return conten;
    }

    public void setConten(String conten) {
        this.conten = conten;
    }

    public LocalDateTime getPublishDate() {
        return publishDate;
    }

    public void setPublishDate(LocalDateTime publishDate) {
        this.publishDate = publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Article.count = count;
    }

    @Override
    public String toString() {
        return "Article{" +
                "ID=" + ID +
                ", title='" + title + '\'' +
                ", conten='" + conten + '\'' +
                ", publishDate=" + publishDate +
                ", author=" + author +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Article article = (Article) o;
        return ID == article.ID && Objects.equals(title, article.title) && Objects.equals(conten, article.conten) && Objects.equals(publishDate, article.publishDate) && Objects.equals(author, article.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, title, conten, publishDate, author);
    }
}
