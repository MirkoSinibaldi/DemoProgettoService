package it.k2.demo.demoProgettoService.services;

import it.k2.demo.demoProgettoService.models.entities.Author;
import it.k2.demo.demoProgettoService.models.entities.Book;
import it.k2.demo.demoProgettoService.models.entities.Genre;
import it.k2.demo.demoProgettoService.models.entities.Publisher;
import it.k2.demo.demoProgettoService.repositories.AuthorRepository;
import it.k2.demo.demoProgettoService.repositories.BookRepository;
import it.k2.demo.demoProgettoService.repositories.GenreRepository;
import it.k2.demo.demoProgettoService.repositories.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;

@Service
@Transactional
public class SaveService {

    @Autowired
    PublisherRepository publisherRepository;

    @Autowired
    GenreRepository genreRepository;

    @Autowired
    AuthorRepository authorRepository;

    @Autowired
    BookRepository bookRepository;


    public void savePublisher(Publisher publisher) throws DataIntegrityViolationException {

        String publisherName = publisher.getName();

        if(!publisherRepository.existsByName(publisherName)) {
            publisherRepository.save(publisher);

        }
    }
/* ******************************************************************************/

    public void saveGenre(Genre genre) throws DataIntegrityViolationException {

        String genreDescription = genre.getDescription();

        if(!genreRepository.existsByDescription(genreDescription)) {
            genreRepository.save(genre);
        }
    }

 /* ******************************************************************************/


    public void saveAuthor(Author author) throws DataIntegrityViolationException {

        String authorName = author.getName();

        if(!authorRepository.existsByName(authorName)) {
            authorRepository.save(author);
        }


    }
/* ***********************************************************************************/

    public void saveBook(Book book) throws DataIntegrityViolationException {
        String titleBook = book.getTitle();

        if(!bookRepository.existsByTitle(titleBook)) {

            bookRepository.save(book);

        }
    }
/* ****************************************************************************************/







}
