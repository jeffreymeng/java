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
		int result;
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
				print(program[i + 1]);
				i += 1;
				break;
			case "add":
				print( String.valueOf(add(Integer.parseInt(program[i + 1]), Integer.parseInt( program[i + 2]))));
				i += 2;
				break;
			}
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
