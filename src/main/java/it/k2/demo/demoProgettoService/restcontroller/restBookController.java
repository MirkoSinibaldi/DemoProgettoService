package it.k2.demo.demoProgettoService.restcontroller;

import it.k2.demo.demoProgettoService.models.AuthorDto;
import it.k2.demo.demoProgettoService.models.BookDto;
import it.k2.demo.demoProgettoService.models.entities.Author;
import it.k2.demo.demoProgettoService.models.entities.Book;
import it.k2.demo.demoProgettoService.services.AuthorService;
import it.k2.demo.demoProgettoService.services.BookService;
import it.k2.demo.demoProgettoService.services.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@RestController
@RequestMapping("/books")
public class restBookController {

    @Autowired
    BookService bookService;

    @Autowired
    AuthorService authorService;

    @Autowired
    LibrarianService librarianService;

    @RequestMapping(value = "/getAllBooks", method = RequestMethod.GET)
    public List<BookDto> getAllBooks()
    {
        List<Book> entityBooks = bookService.getBookInDatabase();
        List<BookDto> modelBooks = new ArrayList<>();

        List<Author> entityAuthor = authorService.getAuthorInDataBase();
        Set<AuthorDto> modelAuthor = new HashSet<>();

        for(int j = 0; j < entityAuthor.size(); j++)
        {
            modelAuthor.add(librarianService.fromAuthorEntityToAuthorDto(entityAuthor.get(j)));

                for(int i = 0; i < entityBooks.size(); i++)
                {
                    modelBooks.add(librarianService.fromBookEntityToBookDto(entityBooks.get(i), ));
                }
        }

        return modelBooks;
    }












}
