package test;

import calcu.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest{
 Calculator calculator = new Calculator();

 @Test
    public void sumaTest(){
     assertEquals(calculator.suma(1,2),3);
     assertNotEquals(calculator.suma(7, 7),10);

 }
 @Test
  public void restaTest(){
  assertEquals(calculator.resta(2,1),1);
  assertNotEquals(calculator.resta(7, 7),2);

 }
 @Test
 public void multiplicacionTest(){
  assertEquals(calculator.multiplicacion(3,3),9);
  assertNotEquals(calculator.multiplicacion(7, 7),45);

 }
 @Test
 public void divisionTest(){
  assertEquals(calculator.division(4,2),2);
  assertNotEquals(calculator.division(80, 7),45);


 }
 @Test
 public void cuadraticaTest(){
  assertEquals(calculator.cuadratica(2,14,20),-2,-5);
  assertNotEquals(calculator.cuadratica(2,4,6),21,5);

}

}
