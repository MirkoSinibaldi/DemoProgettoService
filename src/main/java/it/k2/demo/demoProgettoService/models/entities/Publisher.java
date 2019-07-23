package it.k2.demo.demoProgettoService.models.entities;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Entity
@Table(name = "publisher")
public class Publisher
{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;

    @OneToMany(mappedBy = "publisher")
    private List<Book> books;

    public Publisher() {  }

    public Publisher(Integer id, @NotNull String name, List<Book> books)
    {
        this.id = id;
        this.name = name;
        this.books = books;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Book> getBooks() {
        return books;
    }
}
