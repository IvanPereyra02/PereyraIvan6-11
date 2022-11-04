package test;

import calcu.Calculator;
import org.testng.annotations.Test;

import static org.junit.jupiter.api.Assertions.*;

public class CalculatorTest {
 Calculator calculator = new Calculator();

 @Test
<<<<<<< HEAD
 public void sumaTest() {
  assertEquals(calculator.suma(1, 2), 3);
  assertNotEquals(calculator.suma(5, 5), 9);

=======
    public void sumaTest(){
     assertEquals(calculator.suma(1,2),3);
     assertNotEquals(calculator.suma(7, 7),10);
>>>>>>> aeabc68e547e96793e090e45cdfdf6a6a494e415

 }

 @Test
<<<<<<< HEAD
 public void restaTest() {
  assertEquals(calculator.resta(2, 1), 1);
  assertNotEquals(calculator.resta(8, 5), 2);
=======
  public void restaTest(){
  assertEquals(calculator.resta(2,1),1);
  assertNotEquals(calculator.resta(7, 7),2);
>>>>>>> aeabc68e547e96793e090e45cdfdf6a6a494e415

 }

 @Test
<<<<<<< HEAD
 public void multiplicacionTest() {
  assertEquals(calculator.multiplicacion(3, 3), 9);
  assertNotEquals(calculator.multiplicacion(5, 3), 10);

=======
 public void multiplicacionTest(){
  assertEquals(calculator.multiplicacion(3,3),9);
  assertNotEquals(calculator.multiplicacion(7, 7),45);
>>>>>>> aeabc68e547e96793e090e45cdfdf6a6a494e415

 }

 @Test
<<<<<<< HEAD
 public void dividirTest() {
  assertEquals(calculator.dividir(4, 2), 2);
  assertEquals(calculator.dividir(18, 3), 2);
=======
 public void divisionTest(){
  assertEquals(calculator.division(4,2),2);
  assertNotEquals(calculator.division(80, 7),45);
>>>>>>> aeabc68e547e96793e090e45cdfdf6a6a494e415


 }

 @Test
<<<<<<< HEAD
 public void cuaTest() {
  double result[] = {1, -5};
  assertArrayEquals(calculator.cuadratica(1, 4, (-5)), result, 0);
 }
 @Test

 public void cuaTestM() {
  double var = 991;
  double var2 = 9;

  double result[] = {var, var2};
=======
 public void cuadraticaTest(){
  assertEquals(calculator.cuadratica(2,14,20),-2,-5);
  assertNotEquals(calculator.cuadratica(2,4,6),21,5);

}
>>>>>>> aeabc68e547e96793e090e45cdfdf6a6a494e415

  assertArrayEquals(calculator.cuadratica(1, 4, (-5)), result, 990);

 }
}


