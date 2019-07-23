package it.k2.demo.demoProgettoService.models.entities;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Set;

@Entity
@Table(name = "author")
public class Author
{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @NotNull
    private String name;


    @ManyToMany(mappedBy = "authors", fetch = FetchType.EAGER)
    private Set<Book> books;

    public Author() {  }

    public Author(Integer id, @NotNull String name, Set<Book> books)
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

    public void setBooks(Set<Book> books) {
        this.books = books;
    }

    public Integer getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }
}

