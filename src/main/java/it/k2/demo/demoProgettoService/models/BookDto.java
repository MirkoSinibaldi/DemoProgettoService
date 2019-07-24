package it.k2.demo.demoProgettoService.models;

import it.k2.demo.demoProgettoService.models.entities.Author;
import it.k2.demo.demoProgettoService.models.entities.Genre;
import it.k2.demo.demoProgettoService.models.entities.Publisher;
import java.util.Set;

public class BookDto {

    private String title;
    private Integer quantity;
    private double price;
    private Genre genre;
    private Publisher publisher;
    private Set<AuthorDto> authorsDto;

    public BookDto() { }

    public BookDto(String title, Integer quantity, double price, Genre genre, Publisher publisher, Set<AuthorDto> authorsDto) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.genre = genre;
        this.publisher = publisher;
        this.authorsDto = authorsDto;
    }

    public String getTitle() {return title;}
    public void setTitle(String title) {this.title = title;}
    public Integer getQuantity() {return quantity;}
    public void setQuantity(Integer quantity) {this.quantity = quantity;}

    public double getPrice() {return price;}
    public void setPrice(double price) {this.price = price;}
    public Genre getGenre() {return genre;}
    public void setGenre(Genre genre) {this.genre = genre;}
    public Publisher getPublisher() {return publisher;}

    public void setPublisher(Publisher publisher) {this.publisher = publisher;}
    public Set<AuthorDto> getAuthorsDto() {return authorsDto;}
    public void setAuthorsDto(Set<AuthorDto> authorsDto) {this.authorsDto = authorsDto;}
}
