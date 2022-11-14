package com.example.calcu;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

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
		Assertions.assertEquals(Calcu.suma(2,5),7);
		Assertions.assertEquals(Calcu.suma(845,100),945);
		Assertions.assertNotEquals(Calcu.suma(9,4),80);

	}
	@Test

	public void resta(){
		Assertions.assertEquals(Calcu.resta(4,2),2);
		Assertions.assertEquals(Calcu.resta(4,2),2);
		Assertions.assertNotEquals(Calcu.resta(9,4),3);

	}
	@Test
	public void multi(){
		Assertions.assertEquals(Calcu.multi(5,2),10);
		Assertions.assertEquals(Calcu.multi(-4,10),-40);
		Assertions.assertNotEquals(Calcu.multi(10,7),50);

	}
	@Test
	public void div (){
		Assertions.assertEquals(Calcu.div(8,1),8);
		Assertions.assertEquals(Calcu.div(-8,-2),4);
		Assertions.assertEquals(Calcu.div(-8,2),-4);
		Assertions.assertNotEquals(Calcu.div(20,30),5);
		Assertions.assertThrows(ArithmeticException.class,() -> {Calcu.div(2,0);});




	}

}
