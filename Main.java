package com.skillx.main;

import com.skillx.umpier.Umpier;

public class Main {
	public static void main(String[] args) {
		Umpier u = new Umpier();
		u.collectNumberFRomGuesser();
		u.collectNumberFRomPlayer();
		u.Compare();
	}
}
