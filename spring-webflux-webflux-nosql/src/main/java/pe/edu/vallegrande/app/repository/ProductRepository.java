package pe.edu.vallegrande.app.repository;

import pe.edu.vallegrande.app.model.Product;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ProductRepository extends ReactiveMongoRepository<Product, String> {
    
}
