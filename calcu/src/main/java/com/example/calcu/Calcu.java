package com.example.calcu;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

public class Calcu {

	@GetMapping("/suma/{num1}/{num2}")
	public static int suma(@PathVariable int num1, @PathVariable int num2) {

		return num1 + num2;

	}

	@GetMapping("/resta/{num1}/{num2}")
	public static int resta(@PathVariable int num1, @PathVariable int num2) {

		return num1 - num2;

	}

	@GetMapping("/multiplication/{num1}/{num2}")
	public static int multi(@PathVariable int num1, @PathVariable int num2) {

		return num1 * num2;

	}

	@GetMapping("/divicion/{num1}/{num2}")
	public static int div(@PathVariable int num1, @PathVariable int num2) {

		if (num2 == 0) {
			throw new ArithmeticException("No se puede dividir por 0");
		}
		return num1 / num2;
	}
}