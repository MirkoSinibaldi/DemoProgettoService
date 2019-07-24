package it.k2.demo.demoProgettoService.models;

import java.util.Set;

public class BookDto {

    private String title;
    private Integer quantity;
    private double price;
    private GenreDto genreDto;
    private PublisherDto publisherDto;
    private Set<AuthorDto> authorsDto;

    public BookDto() {
    }

    public BookDto(String title, Integer quantity, double price, GenreDto genreDto, PublisherDto publisherDto, Set<AuthorDto> authorsDto) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
        this.genreDto = genreDto;
        this.publisherDto = publisherDto;
        this.authorsDto = authorsDto;
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

    public GenreDto getGenreDto() {
        return genreDto;
    }

    public PublisherDto getPublisherDto() {
        return publisherDto;
    }

    public Set<AuthorDto> getAuthorsDto() {
        return authorsDto;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void setGenreDto(GenreDto genreDto) {
        this.genreDto = genreDto;
    }

    public void setPublisherDto(PublisherDto publisherDto) {
        this.publisherDto = publisherDto;
    }

    public void setAuthorsDto(Set<AuthorDto> authorsDto) {
        this.authorsDto = authorsDto;
    }
}

