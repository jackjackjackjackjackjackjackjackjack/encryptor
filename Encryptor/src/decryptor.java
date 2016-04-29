import java.util.Scanner;
import java.util.Scanner;
public class decryptor
	{
		static String sentence;
		public static void main(String[] args)
			{
				getSentence();
				decrypt();
			}
		public static void getSentence()
			{
				Scanner userSentence = new Scanner(System.in);
				System.out.println("Type a encrypted sentence");
				sentence = userSentence.nextLine();
			}
public static void decrypt()
	{
		sentence = sentence.replace("516", " ");
		sentence = sentence.replace("419", "a");
		sentence = sentence.replace("073", "b");
		sentence = sentence.replace("546", "c");
		sentence = sentence.replace("753", "d");
		sentence = sentence.replace("863", "e");
		sentence = sentence.replace("005", "f");
		sentence = sentence.replace("514", "g");
		sentence = sentence.replace("128", "h");
		sentence = sentence.replace("597", "i");
		sentence = sentence.replace("155", "j");
		sentence = sentence.replace("390", "k");
		sentence = sentence.replace("684", "l");
		sentence = sentence.replace("120", "m");
		sentence = sentence.replace("012", "n");
		sentence = sentence.replace("231", "o");
		sentence = sentence.replace("789", "p");
		sentence = sentence.replace("098", "q");
		sentence = sentence.replace("229", "r");
		sentence = sentence.replace("776", "s");
		sentence = sentence.replace("909", "t");
		sentence = sentence.replace("049", "u");
		sentence = sentence.replace("935", "v");
		sentence = sentence.replace("024", "w");
		sentence = sentence.replace("678", "x");
		sentence = sentence.replace("097", "y");
		sentence = sentence.replace("990", "z");
		// that's pretty neat
		System.out.println(sentence);
	}
}