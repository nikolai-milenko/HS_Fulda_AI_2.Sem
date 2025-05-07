package de.edu.hsfulda.pmut.debugging;

import java.io.InputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Uebung2 {
	private InputStream in;
	private PrintStream out;
	private int count = 2;
	public Uebung2(InputStream in, PrintStream out) {
		this.in = in;
		this.out = out;
	}

	public static void main(String[] args) {
		new Uebung2(System.in, System.out).run();
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
		if (count > nextInt)
			return true;
		if (nextInt % count == 0)
			return false;
		nextInt = nextInt - (nextInt / count);
		count++;
		return checkNumber(nextInt);
	}

	private int aquireUserInput(Scanner input, String message) {
		reportResult(message);
		int nextInt = input.nextInt();
		return nextInt;
	}
}
