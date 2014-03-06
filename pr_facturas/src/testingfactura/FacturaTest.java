package testingfactura;
import factura.Factura;
import factura.LineaFactura;
import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FacturaTest {

		

	@Before
	public void setUp() throws Exception {
	}

	@SuppressWarnings("null")
	@Test
	public void testGetTotal() {
			
			// Crear una factura
			LineaFactura[] lineas = new LineaFactura[]{
					new LineaFactura("P100", "Leche",	0.85f, 	6, 	0 ),
					new LineaFactura("P200", "Pan",		0.60f, 	1, 	0 ),
					new LineaFactura("P9000", "Miel", 0.70f,    8,  1 ),
					new LineaFactura("P600", "Cafe",		1.2f, 	1, 	0 )
				};														
			Factura factura1 = new Factura( "C100",  "Antonio Garcia", lineas);
			
			Factura f1 = null;
			assertEquals ( (double)f1.getTotal() ,(double)8.6f, (double)0.01f);
			// Escribir la factura
			System.out.println( factura1 );
	}
	// Test GetTotalProductoMultiples
	
	public void testGetTotalProductoMultiples() {
		@SuppressWarnings("unused")
		LineaFactura [] lineas;
		lineas = new LineaFactura[] {
				new LineaFactura("P138", "Azucar", 1f, 0.6f, 0f),
				new LineaFactura("P060", "Manzana", 2f, 1f, 0f),
				
				
		};
		Factura f2 = new Factura ("C101", "Maria Fernandez", lineas);
		assertEquals( (double)f2.getTotal() ,(double)2.6f, (double)0.01f);
		
	
 
		
		
	}
		
	}


