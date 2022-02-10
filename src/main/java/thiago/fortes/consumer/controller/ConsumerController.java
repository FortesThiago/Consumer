package thiago.fortes.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thiago.fortes.consumer.model.Book;
import thiago.fortes.consumer.model.Film;
import thiago.fortes.consumer.service.BookEndpoint;
import thiago.fortes.consumer.service.FilmEndpoint;

import java.util.List;

@RestController
@RequestMapping("/book")
public class ConsumerController {

    @Autowired
    BookEndpoint bookEndpoint;

    @Autowired
    FilmEndpoint filmEndpoint;

    @GetMapping
    public List<Book> getBook(){
        return bookEndpoint.findBooks();
    }


    @GetMapping
    public List<Film> getFilm(){
        return filmEndpoint.findFilm();
    }
}
