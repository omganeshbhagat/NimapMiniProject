package seed.com.calculator;

import java.util.ArrayList;

import org.hibernate.mapping.List;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Mvc1Application 
{
	public static void main(String[] args) 
	{
		SpringApplication.run(Mvc1Application.class, args);
		System.out.println("MVC1Application");
	}
}
