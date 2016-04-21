package cl.ubb.agil;


import org.junit.Before;
import org.junit.Test;

import cl.ubb.agil.Producto;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

public class ProductoTest {
	
	String nombre="sony";
	int stock=10;
	int stock_minimo=1;
	int stock_maximo=100;
	
private Producto producto;
	

	@Before
	public void setup() throws Exception {
		producto= new Producto(nombre, stock_minimo, stock_maximo);
		producto.setNombre(nombre);
	}
	
	@Test
 	public void setNombre(){
 		/*arrange*/
 		/*act*/
 		/*assert*/
 	  	assertNotNull(producto);
     	assertEquals(producto.getNombre(), nombre);
    
 	}
	
	@Test
 	public void getNombreSony(){
 		/*arrange*/
 		
 		/*act*/
 		String resultado=producto.getNombre();
 		
 		/*assert*/
 		assertThat(resultado,is("sony"));
 	 
 	}
	
	@Test
 	public void getStockdiez(){
 		/*arrange*/
 		
 		/*act*/
 		int resultado=producto.getStock();
 		
 		/*assert*/
 		assertThat(resultado,is(10));
 	 
 	}
 
	
	@Test
	
	public void stocknotnull (){
		/* Arrange */
		
		/* Act */	
	
		/* Assert */
		
	}

}
