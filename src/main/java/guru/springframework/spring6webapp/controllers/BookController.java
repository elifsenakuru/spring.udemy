package guru.springframework.spring6webapp.controllers;

import guru.springframework.spring6webapp.repositories.BookRepository;
import guru.springframework.spring6webapp.services.BookService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
class BookController {
    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }
    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookService.findAll());

        return "books";
    }

}
