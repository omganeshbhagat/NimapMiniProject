package seed.com.calculator;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService 
{	
	@Autowired  
	private CategoryRepository repoC;
	
	public Category addCategory(Category Cat)
	{
		return repoC.save(Cat);
	}
		
	public List<Category> getMulCategory()
	{
		return repoC.findAll();
	}
	
	public void deleteCategory(Integer di)
	{
		repoC.deleteById(di);
		System.out.println("Deleted Successfully");
	}

	public Optional<Category> getCategoryById(int di)
	{
		return repoC.findById(di);
	}
	
	public Optional<Category> updateCategory(int id)
	{
		return repoC.findById(id);
	}

}
