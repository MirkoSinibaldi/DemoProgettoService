package it.k2.demo.demoProgettoService.services;

import it.k2.demo.demoProgettoService.models.entities.Author;
import it.k2.demo.demoProgettoService.models.entities.Book;
import it.k2.demo.demoProgettoService.models.entities.Genre;
import it.k2.demo.demoProgettoService.models.entities.Publisher;
import it.k2.demo.demoProgettoService.repositories.AuthorRepository;
import it.k2.demo.demoProgettoService.repositories.GenreRepository;
import it.k2.demo.demoProgettoService.repositories.PublisherRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.*;

@Service
@Transactional
public class LibrarianService {

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    GenreRepository genreRepository;

    @Autowired
    PublisherRepository publisherRepository;

    @Autowired
    SaveService saveManager;

    @Autowired
    BookService bookManager;

    @Autowired
    AuthorService authorManager;


    public void insertNewBook(Book book) {

        Logger log = LoggerFactory.getLogger(LibrarianService.class);


        Author author = new Author();

        Publisher publisher = new Publisher();

        Genre genre = new Genre();

        Set<Author> authorList = new HashSet<>();


        genre = book.getGenre();
        publisher = book.getPublisher();


        try {
            saveManager.saveGenre(genre);
        } catch (DataIntegrityViolationException e) {
            log.info("Errore salvataggio GENERE");

        }


        try {
            saveManager.savePublisher(publisher);
        } catch (DataIntegrityViolationException e1) {
            log.info("Errore salvataggio EDITORE");

        }

        book.setGenre(genreRepository.findByDescription(book.getGenre().getDescription()));
        book.setPublisher(publisherRepository.findByName(book.getPublisher().getName()));


        //prendo la lista degli autori dal libro:


        authorList.addAll(book.getAuthors());

        for (Author authorBook : authorList) {

            try {
                saveManager.saveAuthor(authorBook);
            } catch (DataIntegrityViolationException e3) {
                log.info("Errore salvataggio Autore");

            }


        }

        for (Author author3 : book.getAuthors()) {
            for (Iterator<Author> iterator = authorRepository.findAll().iterator(); iterator.hasNext(); author = iterator.next()) {
                if (author3.getName().equals(author.getName())) {
                    authorList.add(author);
                }
                book.setAuthors(authorList);
            }
            try {
                saveManager.saveBook(book);
            } catch (DataIntegrityViolationException e2) {
                log.info("Errore salvataggio LIBRO");
            }

        }
    }

    /*  ***********************************************************************************/

    public List<String> getBookInDatabaseToString() {

        List<Book> books = bookManager.getBookInDatabase();
        List<String> newBooksList = new ArrayList<>();

        for (int i = 0; i < books.size(); i++) {
            Book book = books.get(i);

            newBooksList.add(book.getTitle() + " " + books.get(i).getGenre().getDescription() + " " + books.get(i).getPublisher().getName() + "\n");

        }

        return newBooksList;
    }

    /* ***********************************************************************************************/
    public List<String> getAuthorInDatabaseToString() {

        List<Author> authors = authorManager.getAuthorInDataBase();
        List<String> newAuthorList = new ArrayList<>();

        for (int i = 0; i < authors.size(); i++) {
            Author author = authors.get(i);

            newAuthorList.add(author.getName() + " " + "\n");

        }

        return newAuthorList;
    }

    /* ****************************************************************************/

    public List<String> getAuthorsAndBooksToString() {

        List<Author> authors = authorManager.getAuthorInDataBase();

        List<String> authorsAndBooks = new ArrayList<>();

        List<Book> books = new ArrayList<>();


        for (Author author : authors) {
            author.getName();
            books = authorManager.getBooksByAuthor(author.getName());

            for(int i = 0; i < books.size(); i++) {
                authorsAndBooks.add("Autore: " + author.getName() + " " + "Titolo: " +  books.get(i).getTitle() + " " + "Genere: " +  books.get(i).getGenre().getDescription() + " " + "Editore: " + " " + books.get(i).getPublisher().getName());
            }
        }

        return authorsAndBooks;

    }

}
