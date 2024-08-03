package seed.com.calculator;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	@Autowired
	private ProductService service;
	
	@Autowired
	private CategoryService service1;
	
	@PostMapping("/api/products")
	public Product addProduct(@RequestBody Product prod)
	{
		return service.addProduct(prod);
	}
	
	@PostMapping("/api/categories")
	public Category addCategory(@RequestBody Category cat)
	{
		return service1.addCategory(cat);
	}
	
	@GetMapping("/api/getproducts")
	public List<Product> getProduct()
	{
		return service.getMulProduct();
	}
	
	@GetMapping("/api/getcategories")
	public List<Category> getCategory()
	{
		return service1.getMulCategory();
	}
	
	@DeleteMapping("/api/products/{di}")
	public void deleteProduct(@PathVariable Integer di)
	{
		System.out.println("work on progress");
		service.deleteProduct(di);
		
	}
	
	@DeleteMapping("/api/categories/{di}")
	public void deleteCategory(@PathVariable Integer di)
	{
		System.out.println("work on progress");
		service.deleteProduct(di);
		
	}
	
	@GetMapping("/api/product/{di}")
	public Optional<Product> getProd(@PathVariable Integer di)
	{
		return service.getProductById(di);
	}
	
	@GetMapping("/api/categories/{di}")
	public Optional<Category> getCategory(@PathVariable Integer di)
	{
		return service1.getCategoryById(di);
	}
	
	@PutMapping("/api/products/{di}")
	@ResponseBody
	public Optional<Product> updateProduct(@PathVariable Integer di)
	{
		return service.updateProduct(di);
	}

	
	@PutMapping("/api/categories/{di}")
	public Optional<Category> updateCategory(@PathVariable Integer di)
	{
		return service1.updateCategory(di);
	}
		
	
	

}
