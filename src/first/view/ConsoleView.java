package first.view;

import first.model.ThatOnetThing;

import java.util.Scanner;

public class ConsoleView
{
	private ThatOnetThing testThingy;
	private Scanner wordScanner;
	private String input;
	
	public ConsoleView()
	{
		testThingy = new ThatOnetThing();
		wordScanner = new Scanner(System.in);
	}
	
	public void start()
	{
		//System.out.println("Hi there, lets talk!");
		//getWords();
		//getWords();
		//meetTheThingy();
		meetTheRealThingy();
	}
	
	private void getWords()
	{
		input = wordScanner.nextLine();
		System.out.print("You typed this to me: ");
		System.out.println(input);
		
	}
	
	public void questionsAndAnswer()
	{
		System.out.println("What is 2 + 2?");
		getWords();
		System.out.println("Why is the sky blue?");
		getWords();
		System.out.println("What is fish + fish?");
		getWords();
		System.out.println("What is the answer to life the universe and everything?");
		getWords();
		if(input.equals("42"))
			System.out.println("Dont we all love that movie. :)");
	}
	
	public void show()
	{
		System.out.println("show this on my screen.");
		System.out.print("This is what you see now.");
		System.out.println("");
		System.out.println("Hello");
	}
	
	private void meetTheRealThingy()
	{
		System.out.println("My name is: " + testThingy.getName());
		System.out.println("my favorite movie is " + testThingy.getMovie());
		System.out.println("My favorite food is " + testThingy.getFood());
		System.out.println("What do you want to change my name to?");
		String newName = wordScanner.nextLine();
		testThingy.setName(newName);
		System.out.println("What should my new favorite movie be?");
		String newMovie = wordScanner.nextLine();
		testThingy.setMovie(newMovie);
		System.out.println("What should my new favorite food be?");
		String newFood = wordScanner.nextLine();
		testThingy.setFood(newFood);
		
		System.out.println("My new name is " + newName);
		System.out.println("My new favorite movie is " + newMovie);
		System.out.println("My new favorite food is " + newFood);
		System.out.println("is this all correct?");
		
		String uInput = wordScanner.nextLine();
		
		if (uInput.equalsIgnoreCase("yes"))
		{
			System.out.println("YAY IM A NEW THINGY!!");
		}
		else if (uInput.equalsIgnoreCase("no"))
		{
			System.out.println("Ok try again then.");
			testThingy.setName("That one name");
			testThingy.setMovie("Donnie Darko");
			testThingy.setFood("Peanut butter and Jelly Sammiches");
			meetTheRealThingy();
		}
	}
	
	public void meetTheThingy()
	{
		System.out.println("My name is: " + testThingy.getName());
		System.out.println("What do you want to change my name to?");
		String newName = wordScanner.nextLine();
		testThingy.setName(newName);
		
		System.out.println("My new name is " + newName);
		System.out.println("is this correct?");
		String uInput = wordScanner.nextLine();
		
		if (uInput.equalsIgnoreCase("yes") )
		{
			//actions
			System.out.println("Ok " + newName + " will be my new name. :)");
		}
		else if (uInput.equalsIgnoreCase("no"))
		{
			meetTheThingy();
		}
		else 
		{
			System.out.println("Stop typing gibberish!");
			
		}
		
	}
}
