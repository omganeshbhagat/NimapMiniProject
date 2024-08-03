package seed.com.calculator;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {
	@Autowired
	private ProductRepository repo;
	
	public Product addProduct(Product prod) {
		return repo.save(prod);
	}
	
	public List<Product> getMulProduct()
	{
		return repo.findAll();
	}
	
	public void deleteProduct(Integer id)
	{
		repo.deleteById(id);
		System.out.println("Deleted Successfully");
	}
	
	
	public Optional<Product> getProductById(int id)
	{
		return repo.findById(id);
	}
		
	
	public Optional<Product> updateProduct(int id)
	{
		return repo.findById(id);
	}

}
