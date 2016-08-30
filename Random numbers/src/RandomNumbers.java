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
			String answer;
			int answersRight = 0;
			for (int i = 0; i<questions; i++)
				{
					if(i%2 == 0)
						{
							String realAnswer = Integer.toString(start) +  "-" + Integer.toString(range + start);
							System.out.println("What will the range of: int randomNumber = (int)(math.Random() * " + range + ") + " + start + " be?");
							answer = input2.nextLine();
								if (answer.equals(realAnswer))
									{
										System.out.println("That is correct");
										answersRight++;
										start = (int) (Math.random() * 10) + 1;
										range = (int) (Math.random() * 10) + 1;
									}
								else
									{
										System.out.println("That is incorrect");
										start = (int) (Math.random() * 10) + 1;
										range = (int) (Math.random() * 10) + 1;
									}
						}
					if(i%2 == 1)
						{
							String realAnswer = "int randomNumber = (int)(Math.random() * " + Integer.toString(range) + ") + " + Integer.toString(start);
							System.out.println("Type the code to generate random numbers that start at " + start + " and have a range of " + range + " with the variable name of randomNumber.");
							answer = input2.nextLine();
							if (answer.equals(realAnswer))
							{
								System.out.println("That was correct");
								answersRight++;
							}
							else
							{
								System.out.println("That was incorrect");
							}
						}
				}
			System.out.println("You got " + answersRight + " correct");
		}
	}

