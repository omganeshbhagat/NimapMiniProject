package seed.com.calculator;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name="Products")
public class Product {

	@Id
	private Integer id;
	@Column(length=30)
	private String prodname;
	@Column(length=30)
	private Double prodprice;
	@OneToOne
	private Category Caty;
	
	public Product() 
	{
		super();
	}
	public Product(Integer id, String prodname, Double prodprice,Category caty) {
		super();
		this.id = id;
		this.prodname = prodname;
		this.prodprice = prodprice;
		this.Caty=Caty;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProdname() 
	{
		return prodname;
	}
	public void setProdname(String prodname) 
	{
		this.prodname = prodname;
	}
	public Double getProdprice() 
	{
		return prodprice;
	}
	public void setProdprice(Double prodprice) 
	{
		this.prodprice = prodprice;
	}
	public Category getCaty() {
		return Caty;
	}
	public void setCaty(Category caty) {
		Caty = caty;
	}
//	@Override
//	public String toString() {
//		return "Product [id=" + id + ", prodname=" + prodname + ", prodprice=" + prodprice + ", Caty=" + Caty + "]";
//	}
	
}
