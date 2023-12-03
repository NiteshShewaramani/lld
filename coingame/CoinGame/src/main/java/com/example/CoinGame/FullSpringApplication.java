package com.example.CoinGame;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class FullSpringApplication {

	public static void main(String[] args) {
		SpringApplication.run(FullSpringApplication.class, args);
		CoinGame game = new CoinGame("mark","henry");
		String choice="";
		do{
			game.startGame();
			Scanner in = new Scanner(System.in);
			System.out.println("do you want to play another game enter y or n ?");
			System.out.println();
			choice = in.nextLine();
			System.out.println("your choice is "+choice);

		}while(choice.equals("y"));

	}

}
