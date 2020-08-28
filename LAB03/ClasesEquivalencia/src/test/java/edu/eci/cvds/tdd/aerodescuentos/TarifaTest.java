package edu.eci.cvds.tdd.aerodescuentos;
import org.junit.Assert;
import org.junit.Test;
import edu.eci.cvds.tdd.aerodescuentos.CalculadorDescuentos;
import edu.eci.cvds.tdd.aerodescuentos.ExcepcionParametrosInvalidos;
import edu.eci.cvds.tdd.registry.RegisterResult;

public class TarifaTest {
	
	   
	    @Test
	    public void validatetarifainvalida() {
	    	CalculadorDescuentos tarifa = new CalculadorDescuentos();
	    	double result= tarifa.calculoTarifa(-55, 12 , 16);
	    	Assert.assertEquals(result, ExcepcionParametrosInvalidos.tarifaBase);
		
	    }
	 
	        
}
	    

	