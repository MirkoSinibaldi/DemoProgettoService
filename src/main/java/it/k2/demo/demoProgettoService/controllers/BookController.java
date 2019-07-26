package it.k2.demo.demoProgettoService.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/archivio/libri")
public class BookController {

    @GetMapping
    public String listaLibri()
    {
        return "bookList";
    }

}





