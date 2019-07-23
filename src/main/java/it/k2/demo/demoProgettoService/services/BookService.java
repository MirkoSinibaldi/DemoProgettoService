package it.k2.demo.demoProgettoService.services;

import it.k2.demo.demoProgettoService.models.entities.Author;
import it.k2.demo.demoProgettoService.models.entities.Book;
import it.k2.demo.demoProgettoService.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
@Transactional
public class BookService {

    @Autowired
    BookRepository bookRepository;


    public List<Author> getAuthorsByBook(String titleBook) {

        List<Author> authorList = new ArrayList<>();

        authorList.addAll(bookRepository.findByTitle(titleBook).getAuthors());

        return authorList;


    }
/* *****************************************************************************************/


    public List<String> getBookInDatabaseToString()
    {

        List<Book> books = getBookInDatabase();
        List<String> newBooksList = new ArrayList<>();

        for(int i = 0; i < books.size(); i++)
        {
            Book book = books.get(i);

            newBooksList.add(book.getTitle() + " " + books.get(i).getGenre().getDescription() + " " + books.get(i).getPublisher().getName() + "\n");

        }

        return newBooksList;
    }


    /* ******************************************************************************************/

    public List<Book> getBookInDatabase() {

        List<Book> listaLibri = new ArrayList<>();

        listaLibri = bookRepository.findAll();

        return listaLibri;
    }
/* *********************************************************************************************/








}
