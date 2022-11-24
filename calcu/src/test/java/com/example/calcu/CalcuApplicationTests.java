package com.example.calcu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

@SpringBootTest
class CalcuApplicationTests {
	public class testCalcu{
		private Calcu calcu;
	}
	@BeforeEach
	public void messi(){
		Calcu calcu = new Calcu();
	}
	@Test
	public void suma() {
		assertEquals(Calcu.suma(2,5),7);
		

	}
	@Test
	public void sumaMAL(){
		assertNotEquals(Calcu.suma(9,4),3);

	}
	@Test

	public void resta(){
		assertEquals(Calcu.resta(4,2),2);

	}
	@Test 
	public void restaMal(){
			assertNotEquals(Calcu.resta(9,4),351);

	}
	@Test
	public void multi(){
		assertEquals(Calcu.multi(5,2),10);

	}
	@Test public void multiMal(){
			assertNotEquals(Calcu.multi(10,7),50);

	}
	
	@Test
	public void div (){
		assertEquals(Calcu.div(8,1),8);
	}
	@Test 
	public void divMal(){
		assertNotEquals(Calcu.div(20,30),5);
	}
		
	@Test 
	public void divException(){
		Assertions.assertThrows(ArithmeticException.class,() -> {Calcu.div(2,0);});
	
	}



	}


