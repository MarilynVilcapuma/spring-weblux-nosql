package pe.edu.vallegrande.app.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document(collection = "product")
public class Product {

    @Id
    private String id;
    private String name;
    private String description;
    private Double price;
    private Integer stock;
    private String brand;
    private String category;
    private String state;
    
}
