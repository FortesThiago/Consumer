package thiago.fortes.consumer.model;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Film {
    private Long id;
    private String title;
    private String author;
    private String country;
    private String releasedate;
    private String cinematography;
    private String type;
}
