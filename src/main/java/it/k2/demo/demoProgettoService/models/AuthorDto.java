package it.k2.demo.demoProgettoService.models;

import it.k2.demo.demoProgettoService.models.entities.Book;

import java.util.Set;

public class AuthorDto {

    private String name;
    private Set<BookDto> booksDto;

    public AuthorDto(){ }
    public AuthorDto(String name, Set<Book> books) {this.name = name;this.booksDto = booksDto;}

    public String getName() {return name;}
    public Set<BookDto> getBooksDto() {return booksDto;}

    public void setName(String name) {this.name = name;}
    public void setBooksDto(Set<BookDto> booksDto) {this.booksDto = booksDto;}
}
