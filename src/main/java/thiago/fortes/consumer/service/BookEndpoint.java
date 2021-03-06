package thiago.fortes.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import thiago.fortes.consumer.model.Book;
import thiago.fortes.consumer.model.Film;

import java.util.List;

@FeignClient(name = "book", url = "http://localhost:8081")
public interface BookEndpoint {
    @GetMapping("/")
    List<Book> findBooks();
}
