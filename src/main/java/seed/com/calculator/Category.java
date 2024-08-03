package seed.com.calculator;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table
public class Category {
 
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer Id;
	
	@Column(length=30)
	private String CategoryName;
	
	@OneToMany(fetch=FetchType.EAGER,cascade=CascadeType.ALL)
	@JoinColumn(name="PC")
	private List<Product> prod;
	
	public Category()
	{
		super();
	}

	public Category(Integer id, String categoryName, List<Product> prod) {
		super();
		Id = id;
		CategoryName = categoryName;
		this.prod = prod;
	}

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getCategoryName() {
		return CategoryName;
	}

	public void setCategoryName(String categoryName) {
		CategoryName = categoryName;
	}

	public List<Product> getProd() {
		return prod;
	}

	public void setProd(List<Product> prod) {
		this.prod = prod;
	}

	@Override
	public String toString() {
		return "Category [Id=" + Id + ", CategoryName=" + CategoryName + ", prod=" + prod + "]";
	}
	
	
	
}
