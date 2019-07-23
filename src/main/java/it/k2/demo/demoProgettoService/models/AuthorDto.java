package it.k2.demo.demoProgettoService.models;

import it.k2.demo.demoProgettoService.models.entities.Book;

import java.util.Set;

public class AuthorDto {

    private String name;
    private Set<Book> books;

    public AuthorDto(){ }
    public AuthorDto(String name, Set<Book> books) {this.name = name;this.books = books;}

    public String getName() {return name;}
    public Set<Book> getBooks() {return books;}

    public void setName(String name) {this.name = name;}
    public void setBooks(Set<Book> books) {this.books = books;}
}
