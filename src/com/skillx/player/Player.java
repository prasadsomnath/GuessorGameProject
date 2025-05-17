package com.skillx.player;

import java.util.Scanner;

public class Player {
	int guessNum;

	public int guessNumber() {
		Scanner SC = new Scanner(System.in);
		System.out.println("player, kindly guess no bt 1- 10");
		guessNum = SC.nextInt();
		return guessNum;
	}

}
