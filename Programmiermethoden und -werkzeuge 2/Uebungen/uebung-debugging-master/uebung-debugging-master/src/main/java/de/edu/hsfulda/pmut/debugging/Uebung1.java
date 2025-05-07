package de.edu.hsfulda.pmut.debugging;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Uebung1 {
	private InputStream in;
	private PrintStream out;

	public Uebung1(InputStream in, PrintStream out) {
		this.in = in;
		this.out = out;
	}

	public static void main(String[] args) {
		new Uebung1(System.in, System.out).run();
	}

	private void run() {
		try (Scanner input = new Scanner(in)) {
			int nextInt = aquireUserInput(input, "enter an integer number: ");
			boolean isCheckPassed = checkNumber(nextInt);
			reportResult(String.format("number %d passed check: %b", nextInt,
					isCheckPassed));
		} ;
	}

	private void reportResult(String message) {
		out.print(message);
	}

	private boolean checkNumber(int nextInt) {
		for (int i = 2; i < nextInt; i++) {
			int result = nextInt % i;
			out.println(String.format(
					"input: %d, Schleifenvariable: %d, Ergebnis %d", nextInt, i,
					result));
			if (0 == result) {
				return false;
			}
		}
		return true;
	}

	private int aquireUserInput(Scanner input, String message) {
		reportResult(message);
		int nextInt = input.nextInt();
		return nextInt;
	}
}
