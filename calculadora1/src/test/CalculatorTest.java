package test;

import calcu.Calculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest{
 Calculator calculator = new Calculator();

 @Test
    public void sumaTest(){
     assertEquals(calculator.suma(1,2),3);

 }
 @Test
  public void restaTest(){
  assertEquals(calculator.resta(2,1),1);

 }
 @Test
 public void multiplicacionTest(){
  assertEquals(calculator.multiplicacion(3,3),9);

 }
 @Test
 public void divicionTest(){
  assertEquals(calculator.divicion(4,2),2);

 }

}
