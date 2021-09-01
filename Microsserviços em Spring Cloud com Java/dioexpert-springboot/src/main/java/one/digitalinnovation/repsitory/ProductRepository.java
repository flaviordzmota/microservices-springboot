package one.digitalinnovation.repsitory;

import org.springframework.data.repository.CrudRepository;

import one.digitalinnovation.model.Product;

public interface ProductRepository  extends CrudRepository<Product, Integer>{
    
}