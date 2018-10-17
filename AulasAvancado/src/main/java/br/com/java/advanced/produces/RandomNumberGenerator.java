package br.com.java.advanced.produces;

import java.util.Random;

/**
 * @author Davi Maçana
 *
 */
public class RandomNumberGenerator {

	private Integer number;
	
	public RandomNumberGenerator(Integer number) {
		super();
		this.setNumber(new Random().nextInt(number));
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}
}
