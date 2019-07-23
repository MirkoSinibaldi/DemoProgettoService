package it.k2.demo.demoProgettoService.models.entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "book")
public class Book
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String title;

    @NotNull
    private Integer quantity;

    @NotNull
    private double price;

    @ManyToOne
    @JoinColumn(name = "id_genre", nullable = false)
    private Genre genre;

    @ManyToOne
    @JoinColumn(name = "id_publisher", nullable = false)
    private Publisher publisher;

    @ManyToMany
    @JoinTable(
        name = " books_authors",
        joinColumns = @JoinColumn(name = "id_book", referencedColumnName = "id"),
        inverseJoinColumns = @JoinColumn(name = "id_author", referencedColumnName = "id"))
    private Set<Author> authors;

    public Book() { }

    public Book(Integer id, @NotNull String title, @NotNull Integer quantity, @NotNull double price, Genre genre, Publisher publisher, Set<Author> authors)
    {
        this.id = id;
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.genre = genre;
        this.publisher = publisher;
        this.authors = authors;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double prince) {
        this.price = prince;
    }

    public void setGenre(Genre genre) {
        this.genre = genre;
    }

    public void setPublisher(Publisher publisher) { this.publisher = publisher; }

    public void setAuthors(Set<Author> authors) {
        this.authors = authors;
    }

    public Integer getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public double getPrice() {
        return price;
    }

    public Genre getGenre() {
        return genre;
    }

    public Publisher getPublisher() {
        return publisher;
    }

    public Set<Author> getAuthors() {
        return authors;
    }
}
