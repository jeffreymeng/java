/*
 * Programmer: Jeffrey Meng
 * Date: Mar 20, 2018
 * Purpose:
 */

package proofofconcept;

import java.util.stream.IntStream;

class Method {
	String name;
	public Method(String name) {
		 this.name = name;
	}
}
class PrintMethod extends Method {
	String arg;
	public PrintMethod(String arg) {
		super("print");
		this.arg = arg;
	}
	public String run() {
		System.out.println(arg);
		return "";
	}
}
class MutiplyMethod extends Method {
	int[] args;
	public MutiplyMethod(int... args) {
		super("mutiply");
		this.args = args;
	}
	public int run() {
		int result = 1;
		for (int i = 0; i < args.length; i ++) {
			result *= args[i];
		}
		return result;
	}
}
class AddMethod extends Method {
	int[] args;
	public AddMethod(int... args) {
		super("add");
		this.args = args;
	}
	public int run() {
		return IntStream.of(args).sum();
	}
}
public class ProofOfConcept {

	public static void main(String[] args) {
		String[] program = { "print", "hi", "print", "mutiply", "add", "2",
				"3"};
		for (int i = 0; i < program.length; i++) {
			switch (program[i]) {
			case "print":
				i += parse(program[i + 1]);
				break;
			case "add":
				i += parse(program[i + 1], program[i + 2]);
				break;
			case "mutiply":
				i += parse( program[i + 1], program[i + 2]);
				break;
			}
		}

	}
	public static int parse(String... args) {
		String[] tokens = {"print", "add", "mutiply"};
		switch(args[0]) {
			case "print":
				return i + 1;
				break;
				
		}
	}

	private static void print(String text) {
		System.out.println(text);
	}

	private static int mutiply(int x, int y) {
		return x * y;
	}

	private static int add(int x, int y) {
		return x + y;
	}

}