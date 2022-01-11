package thiago.fortes.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import thiago.fortes.consumer.model.Book;
import thiago.fortes.consumer.service.BookEndpoint;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("/v1/book")
public class ConsumerController {

    @Autowired
    BookEndpoint bookEndpoint;

    @GetMapping
    public List<Book> getBook(){
        return Collections.singletonList(bookEndpoint.getBook());
    }


}
