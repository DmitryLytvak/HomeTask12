package ua.ithillel.java;

import ua.ithillel.java.controller.CoffeeOrderBoard;

public class Main {
	
	public static void main(String[] args) {
		
		CoffeeOrderBoard coffeeOrderBoard = new CoffeeOrderBoard();
		
		coffeeOrderBoard.deliver();
		coffeeOrderBoard.deliverForNumber(1);
		coffeeOrderBoard.add("Liza");
		coffeeOrderBoard.deliverForNumber(3);
		coffeeOrderBoard.add("Anna");
		coffeeOrderBoard.deliver();
		coffeeOrderBoard.add("Lena");
		coffeeOrderBoard.deliverForNumber(2);
		coffeeOrderBoard.add("Dima");
		coffeeOrderBoard.add("Vlad");
		coffeeOrderBoard.add("Max");
		coffeeOrderBoard.deliverForNumber(4);
		coffeeOrderBoard.draw();
	}
	
}
