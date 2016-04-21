package cl.ubb.agil;
 

 import org.junit.Before;
 import org.junit.Test;
 
 import static org.hamcrest.CoreMatchers.is;
 import static org.junit.Assert.assertNotNull;
 import static org.junit.Assert.assertThat;
 import static org.junit.Assert.assertEquals;
 import cl.ubb.agil.Categoria;
 
 public class CategoriaTest {
 
 	private Categoria categoria;
 	private String codigo = "01010";
 	private String nombre = "radio";
 	
 
 	@Before 
 	public void setup() throws Exception{
 		categoria= new Categoria(nombre, codigo);
 		categoria.setCodigo(codigo);
 		categoria.setNombre(nombre);
 	}
 	
 	@Test
 	public void setNombre(){
 		/*arrange*/
 		/*act*/
 		/*assert*/
 	  	assertNotNull(categoria);
     	assertEquals(categoria.getNombre(), nombre);
    
 	}
 	
 	@Test
 	public void setCodigo(){
 		/*arrange*/
 		/*act*/
 		/*assert*/
 	  	assertNotNull(categoria);
     	assertEquals(categoria.getCodigo(),codigo);
    
 	}
 	
 	@Test
 	public void getNombreRadio(){
 		/*arrange*/
 		
 		/*act*/
 		String resultado=categoria.getNombre();
 		
 		/*assert*/
 		assertThat(resultado,is("radio"));
 	 
 	}
 
 	@Test
 	public void getCodigo01010(){
 		/*arrange*/
 	
 		/*act*/
 		String resultado=categoria.getCodigo();
 		
 		/*assert*/
 		assertThat(resultado,is("01010"));
 	 
 	}
 	
 	
 }