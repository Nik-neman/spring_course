package aop;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Data
public class Book {
    @Value("Преступление и наказание")
    private  String name;
    @Value("Ф.М.Достоевский")
    private String author;
    @Value("1866")
    private  int earOfPublication;
}
