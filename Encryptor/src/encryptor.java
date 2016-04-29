import java.util.*;
public class encryptor
	{
		static String sentence;
		static ArrayList spaces = new ArrayList();
		public static void main(String[] args)
			{
				getSentence();
				recordSpaces();
				encrypt();

			}
		public static void getSentence()
			{
				Scanner userSentence = new Scanner(System.in);
				System.out.println("Type a sentence to encrypt");
				sentence = userSentence.nextLine();
			}
		public static void recordSpaces()
			{
				int counter = 0;
				for (int i=0; i<sentence.length(); i++)
					{
						if (sentence.substring(i, i+1).equals(" "))
							{
								spaces.add(i);
								counter ++;
							}
					}
				for (int i=0; i<spaces.size(); i++)
				System.out.println(spaces.get(i));
			}
		public static void addSpaces()
		{
			
		}
		public static void encrypt()
			{
				sentence = sentence.replace(" ", "516");
				sentence = sentence.replace("a", "419");
				sentence = sentence.replace("b", "073");
				sentence = sentence.replace("c", "546");
				sentence = sentence.replace("d", "753");
				sentence = sentence.replace("e", "863");
				sentence = sentence.replace("f", "005");
				sentence = sentence.replace("g", "514");
				sentence = sentence.replace("h", "128");
				sentence = sentence.replace("i", "597");
				sentence = sentence.replace("j", "155");
				sentence = sentence.replace("k", "390");
				sentence = sentence.replace("l", "684");
				sentence = sentence.replace("m", "120");
				sentence = sentence.replace("n", "012");
				sentence = sentence.replace("o", "231");
				sentence = sentence.replace("p", "789");
				sentence = sentence.replace("q", "098");
				sentence = sentence.replace("r", "229");
				sentence = sentence.replace("s", "776");
				sentence = sentence.replace("t", "909");
				sentence = sentence.replace("u", "049");
				sentence = sentence.replace("v", "935");
				sentence = sentence.replace("w", "024");
				sentence = sentence.replace("x", "678");
				sentence = sentence.replace("y", "097");
				sentence = sentence.replace("z", "990");
				System.out.println(sentence);
			}
	}
