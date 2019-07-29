package it.k2.demo.demoProgettoService.restcontroller;

import it.k2.demo.demoProgettoService.models.BookDto;
import it.k2.demo.demoProgettoService.services.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


    @RestController
    @RequestMapping("/books")
    public class RestBookController {

        @Autowired
        LibrarianService librarianService;


        @RequestMapping(value = "/getAllBooks", method = RequestMethod.GET)
        public List<BookDto> getAllBooks()
        {
            List<BookDto> booksDto = librarianService.getAllModelBooks();

            return booksDto;
        }
}

