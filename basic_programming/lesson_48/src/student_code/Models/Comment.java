package student_code.Models;

import java.time.LocalDateTime;
import java.util.Objects;

public class Comment {
    private int ID;
    private Article article;
    private String text;
    private LocalDateTime publishDate;
    private Author author;
    private static int count;

    public Comment(int ID, Article article, String text, Author author) {
        this.ID = ID;
        this.article = article;
        this.text = text;
        this.publishDate = LocalDateTime.now();
        this.author = author;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public Article getArticle() {
        return article;
    }

    public void setArticle(Article article) {
        this.article = article;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
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
        Comment.count = count;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Comment comment = (Comment) o;
        return ID == comment.ID && Objects.equals(article, comment.article) && Objects.equals(text, comment.text) && Objects.equals(publishDate, comment.publishDate) && Objects.equals(author, comment.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(ID, article, text, publishDate, author);
    }

    @Override
    public String toString() {
        return "Comment{" +
                "ID=" + ID +
                ", article=" + article +
                ", text='" + text + '\'' +
                ", publishDate=" + publishDate +
                ", author=" + author +
                '}';
    }
}
