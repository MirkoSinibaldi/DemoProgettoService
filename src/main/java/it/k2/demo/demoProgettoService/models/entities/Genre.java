package it.k2.demo.demoProgettoService.models.entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "genre")
public class Genre
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String description;

    @OneToMany(mappedBy = "genre")
    private List<Book> books;

    public Genre() {  }

    public Genre(Integer id, @NotNull String description, List<Book> books)
    {
        this.id = id;
        this.description = description;
        this.books = books;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public String getDescription() {
        return description;
    }

    public List<Book> getBooks() {
        return books;
    }
}
