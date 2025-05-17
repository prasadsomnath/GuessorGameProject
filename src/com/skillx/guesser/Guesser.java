package com.skillx.guesser;

import java.util.Random;
import java.util.Scanner;
//import java.util.Random;

public class Guesser {
	int guessNum;

	public int guessNumber() {
		// Scanner SC = new Scanner(System.in);
		Random ra = new Random();
		guessNum = ra.nextInt(1, 10);// 1,10 Means it select up to(10-1) element
		System.out.println("guesser!  guessed the no bt 1- 10");
		return guessNum;
	}

}
