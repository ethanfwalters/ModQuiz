import java.util.Random;
import java.util.Scanner;


public class ModQuiz
	{
		public static int numberRight = 0;
		public static int numberWrong = 0;
		public static void main(String[] args)
			{
				Scanner numberOfQuestionsScanner = new Scanner(System.in);
				
				System.out.println("Hello! \nLets play a game \nEnter the number of Mod questions you want.");
				
				int numberOfQuestions = numberOfQuestionsScanner.nextInt();
				
				
				for(int i = numberOfQuestions ; i > 0 ; i--){
				
					switch(i){
						case 1:
							{
								Random rad = new Random();
								
								int randomNumber = rad.nextInt(10) + 1;
								
								
								int firstSolution = randomNumber % randomNumber;
								
								System.out.println(randomNumber + " % " + randomNumber + " = ?" );
								
								Scanner solutionOne = new Scanner(System.in);
								
								int solutionOneInt = solutionOne.nextInt();
								
								if ( firstSolution == solutionOneInt){
									System.out.println("Youre right!");
									numberRight = numberRight + 1;
								}
								else{
									System.out.println("Youre wrong!");
									numberWrong = numberWrong +1;
								}
								
								}
							break;
						case 2:
								{
									Random rad = new Random();
									
									int randomNumber = rad.nextInt(10) + 20;
									int randomNumberOne = rad.nextInt(10) + 10;
									
									
									int firstSolution = randomNumberOne % randomNumber;
									
									System.out.println(randomNumberOne + " % " + randomNumber + " = ?" );
									
									Scanner solutionOne = new Scanner(System.in);
									
									int solutionOneInt = solutionOne.nextInt();
									
									if ( firstSolution == solutionOneInt){
										System.out.println("Youre right!");
										numberRight = numberRight + 1;
									}
									else{
										System.out.println("Youre wrong!");
										numberWrong = numberWrong +1;
									}
									
									}
							}

					
				
				
					Random radOne = new Random();
				
				int randomNumber = radOne.nextInt(10) + 10;
				int randomNumberOne = radOne.nextInt(10) + 1;
				
				
				int firstSolution = randomNumber % randomNumberOne;
				
				System.out.println(randomNumber + " % " + randomNumberOne + " = ?" );
				
				Scanner solutionOne = new Scanner(System.in);
				
				int solutionOneInt = solutionOne.nextInt();
				
				if ( firstSolution == solutionOneInt){
					System.out.println("Youre right!");
					numberRight = numberRight + 1;
				}
				else{
					System.out.println("Youre wrong!");
					numberWrong = numberWrong +1;
				}
				
				}
				
			
				
				System.out.println("All done you! \nYou got " + numberWrong + " wrong and " + numberRight + " correct.");
				
			}
		
	}
	
