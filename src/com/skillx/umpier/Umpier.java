package com.skillx.umpier;

import com.skillx.guesser.Guesser;
import com.skillx.player.Player;

public class Umpier {
	int numberFromGuesser;
	int numberFromPlayer1;
	int numberFromPlayer2;
	int numberFromPlayer3;

	public void collectNumberFRomGuesser() {
		Guesser g = new Guesser();
		numberFromGuesser = g.guessNumber();
	}

	public void collectNumberFRomPlayer() {
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		numberFromPlayer1 = p1.guessNumber();
		numberFromPlayer2 = p2.guessNumber();
		numberFromPlayer3 = p3.guessNumber();
	}

	public void Compare() {
		System.out.println("guesser selected no is :" + numberFromGuesser);
//		  if(numberFromGuesser ==numberFromPlayer1 && numberFromPlayer1!= numberFromPlayer2)
//			  System.out.println("player 1 win");
//		  else if(numberFromGuesser ==numberFromPlayer2 &&numberFromPlayer2 != numberFromPlayer1)
//			  System.out.println("player 2 win");
//		 else if(numberFromGuesser ==numberFromPlayer2 &&numberFromPlayer2 == numberFromPlayer1 )
//			  System.out.println("both players win");
//		  else 
//			  System.out.println("no one win pls try again");
		//// the above logic is helpful for only two player so to overcome we use multiple if block

		if (numberFromGuesser == numberFromPlayer1) {
			System.out.println("player 1 win");
		}
		if (numberFromGuesser == numberFromPlayer2) {
			System.out.println("player 2 win");
		}
		if (numberFromGuesser == numberFromPlayer3) {
			System.out.println("player 3 win");
		}
		if (numberFromGuesser != numberFromPlayer1 && numberFromGuesser != numberFromPlayer2
				&& numberFromGuesser != numberFromPlayer3) {
			System.out.println("no one win the game, pls try again");
		}
	}

}
