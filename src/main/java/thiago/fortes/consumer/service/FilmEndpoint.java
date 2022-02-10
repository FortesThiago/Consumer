package thiago.fortes.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import thiago.fortes.consumer.model.Film;

import java.util.List;

@FeignClient(name = "film", url = "http://localhost:8080")
public interface FilmEndpoint {
    @GetMapping
    List<Film> findFilm();
}
