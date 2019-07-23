package it.k2.demo.demoProgettoService;

import it.k2.demo.demoProgettoService.models.entities.Author;
import it.k2.demo.demoProgettoService.models.entities.Book;
import it.k2.demo.demoProgettoService.models.entities.Genre;
import it.k2.demo.demoProgettoService.models.entities.Publisher;
import it.k2.demo.demoProgettoService.services.LibrarianService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

// import org.springframework.context.annotation.Configuration;

@Component
// @Configuration
public class BooksComponent {

    Logger log = LoggerFactory.getLogger(BooksComponent.class);

    @Autowired
    LibrarianService librarian;

    @Bean
    public void saveNewBook()
    {
        Book book = new Book();
        Book book2 = new Book();
        Book book3 = new Book();
        Genre genre = new Genre();
        Publisher publisher = new Publisher();
        Author author = new Author();

        author.setName("Fedor Dostoevskij");

        Set<Author> authorList = new HashSet<>();

        authorList.add(author);

        genre.setDescription("Romanzo");
        publisher.setName("Mondadori");


        book.setAuthors(authorList);
        book.setGenre(genre);
        book.setPublisher(publisher);
        book.setTitle("Delitto e Castigo");
        book.setQuantity(1);
        book.setPrice(10.00);

        book2.setAuthors(authorList);
        book2.setGenre(genre);
        book2.setPublisher(publisher);
        book2.setTitle("Il Signore Degli Anelli");
        book2.setQuantity(5);
        book2.setPrice(50.00);

        book3.setAuthors(authorList);
        book3.setGenre(genre);
        book3.setPublisher(publisher);
        book3.setTitle("Harry Potter");
        book3.setQuantity(7);
        book3.setPrice(60.00);


            librarian.insertNewBook(book);
            librarian.insertNewBook(book2);
            librarian.insertNewBook(book3);

            log.info("Libro inserito");


        List<String> lista = librarian.getBookInDatabaseToString();

        for(String string : lista)
        {
            log.info(string);
        }
    }
}
