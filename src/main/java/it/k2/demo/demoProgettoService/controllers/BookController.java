package it.k2.demo.demoProgettoService.controllers;

import it.k2.demo.demoProgettoService.models.BookDto;
import it.k2.demo.demoProgettoService.restcontroller.RestBookController;
import it.k2.demo.demoProgettoService.services.LibrarianService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/archivio/libri")
public class BookController
{

    @GetMapping
    public String listaLibri()
    {
        return "bookList";
    }

}





