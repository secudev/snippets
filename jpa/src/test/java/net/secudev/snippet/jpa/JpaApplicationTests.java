package net.secudev.snippet.jpa;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class JpaApplicationTests {
	
	@Autowired
	private ProduitRepository produits;

	@Test
	void contextLoads() {
		
		produits.save(new Produit("truc"));
	}

}
