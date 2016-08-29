import java.util.Scanner;
public class RandomNumbers
	{
		public static void main(String[] args)
			{
				A();
			}
		public static void A()
		{
			Scanner input = new Scanner(System.in);
			System.out.println("How many questions do you want to answer?");
			int questions = input.nextInt();
			int start = (int) (Math.random() * 10) + 1;
			int range = (int) (Math.random() * 10) + 1;
			Scanner input2 = new Scanner(System.in);
			int answer;
			int answersRight = 0;
			for (int i = 0; i<questions; i++)
				{
					if(i%2 == 0)
						{
							int realAnswer = start - (range + start);
							System.out.println("What will the range of: int randomNumber = (int)(math.Random() * " + range + ") + " + start + " be?");
							answer = input.nextInt();
								if (answer == realAnswer)
									{
										System.out.println("That is correct");
										answersRight++;
									}
								else
									{
										System.out.println("That is incorrect");
									}
						}
				}
		}
	}
