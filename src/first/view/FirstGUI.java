package first.view;

import javax.swing.JOptionPane;

import first.model.ThatOnetThing;
import first.model.Friend;
public class FirstGUI
{
	private ThatOnetThing myGUIThingy;
	private Friend ben;
	private Friend palmer;
	private Friend jordan;
	private Friend kamran;
	private Friend manuel;
	private Friend michael;
	
	public FirstGUI()
	{
		myGUIThingy = new ThatOnetThing();
		ben = new Friend();
		palmer = new Friend();
		jordan = new Friend();
		kamran = new Friend();
		manuel = new Friend();
		michael = new Friend();
	}
	
	private void findOutAboutFriends()
	{
		//This is Ben.
		ben.setName("Ben");
		ben.setAge(17);
		ben.setHumorStyle("Sarcasm");
		ben.setInterest("Snowboarding");
		ben.setLikesPineapple(true);
		ben.setWeight(140.0);
		
		//This is Palmer.
		palmer.setName("Palmer");
		palmer.setAge(18);
		palmer.setHumorStyle("clever");
		palmer.setLikesPineapple(true);
		palmer.setInterest("Rock Climbing");
		palmer.setWeight(145.0);
		
		//This is Jordan.
		jordan.setName("Jordan");
		jordan.setAge(12);
		jordan.setHumorStyle("No Humor");
		jordan.setLikesPineapple(true);
		jordan.setInterest("Magic");
		jordan.setWeight(35.0);
		
		//This is kamran
		kamran.setName("Kamran");
		kamran.setAge(14);
		kamran.setHumorStyle("Communists");
		kamran.setLikesPineapple(true);
		kamran.setInterest("Computer Science");
		kamran.setWeight(33.3);
		
		//This is Manuel
		manuel.setName("Manuel");
		manuel.setAge(17);
		manuel.setHumorStyle("kamran");
		manuel.setLikesPineapple(false);
		manuel.setInterest("Pokemon");
		manuel.setWeight(200.0);
		
		//This is michael
		michael.setName("Michael");
		michael.setAge(16);
		michael.setHumorStyle("Funny Stuff");
		michael.setLikesPineapple(true);
		michael.setInterest("Gaming");
		michael.setWeight(150.3);
	}
	
	private void showAndTell()
	{
		String pineapple = "Likes Pineapple";
		
		JOptionPane.showMessageDialog(null, "This is " + michael.getName() + ". \n He is " + michael.getAge() + " years old. \n His humor style is " + michael.getHumorStyle() + ". \n His interest is " + michael.getInterest() + ". \n He " + pineapple + ". \n And he weighs " + michael.getWeight() + ".");
		JOptionPane.showMessageDialog(null, "This is " + ben.getName() + ". \n He is " + ben.getAge() + " years old. \n His humor style is " + ben.getHumorStyle() + ". \n His interest is " + ben.getInterest() + ". \n He " + pineapple + ". \n And he weighs " + ben.getWeight() + ".");
		JOptionPane.showMessageDialog(null, "This is " + palmer.getName() + ". \n He is " + palmer.getAge() + " years old. \n His humor style is " + palmer.getHumorStyle() + ". \n His interest is " + palmer.getInterest() + ". \n He " + pineapple + ". \n And he weighs " + palmer.getWeight() + ".");
		JOptionPane.showMessageDialog(null, "This is " + jordan.getName() + ". \n He is " + jordan.getAge() + " years old. \n His humor style is " + jordan.getHumorStyle() + ". \n His interest is " + jordan.getInterest() + ". \n He " + pineapple + ". \n And he weighs " + jordan.getWeight() + ".");
		JOptionPane.showMessageDialog(null, "This is " + kamran.getName() + ". \n He is " + kamran.getAge() + " years old. \n His humor style is " + kamran.getHumorStyle() + ". \n His interest is " + kamran.getInterest() + ". \n He " + pineapple + ". \n And he weighs " + kamran.getWeight() + ".");
		JOptionPane.showMessageDialog(null, "This is " + manuel.getName() + ". \n He is " + manuel.getAge() + " years old. \n His humor style is " + manuel.getHumorStyle() + ". \n His interest is " + manuel.getInterest() + ". \n He does not like pineapple" + ". \n And he weighs " + manuel.getWeight() + ".");
		
	}
	
	public void start()
	{
		findOutAboutFriends();
		showAndTell();
		//tells a story
//		JOptionPane.showMessageDialog(null, "There once was a meteor");
//		JOptionPane.showMessageDialog(null, "He was falling from the sky");
//		JOptionPane.showMessageDialog(null, "Then he hit the floor");
//		JOptionPane.showMessageDialog(null, "The end");
//		JOptionPane.showMessageDialog(null, "OR IS IT??????? O.O");
//		JOptionPane.showMessageDialog(null, "DUHN DUN DUHNN!!!!");
		
		//interact();
		//meetTheThingyGUI();
		//checkWrapper();
	}
	
	private void checkWrapper()
	{
		//variables
		int age;
		
		//initialize
		JOptionPane.showMessageDialog(null, "Hi let's try something new.");
		String temp = JOptionPane.showInputDialog("How old are you?");
		age = Integer.parseInt(temp);//Reads a counting number from a parameter
		JOptionPane.showMessageDialog(null, "You are " + age + " years old. Next year you will be " + (age +1) + " years old");
	}
	
	private void interact()
	{
		String answer;//string object doesn't use the magic word "New"
		JOptionPane.showMessageDialog(null, "Let's chat");//show lets chat
		answer = JOptionPane.showInputDialog("What is your name?");//answer the question
		//If i do not type a response null will be stored in my variable
		//cancel is the same as pressing the red X in the corner
		JOptionPane.showMessageDialog(null, "Hi there " + answer);
	}
	
	private void meetTheThingyGUI()
	{
		JOptionPane.showMessageDialog(null, "I'm not a thingy right now.");
		JOptionPane.showMessageDialog(null, "Will you help me become a thingy?");
		String yesNo = JOptionPane.showInputDialog("yes or no?");
		if (yesNo.equalsIgnoreCase("yes"))
		{
			JOptionPane.showMessageDialog(null, "YAYY!! :)");
			JOptionPane.showMessageDialog(null, "Start by giving me a name please.");
			myGUIThingy.setName(JOptionPane.showInputDialog("What is my name?"));
			JOptionPane.showMessageDialog(null, "Yay my name is " + myGUIThingy.getName() + "!!!");
			JOptionPane.showMessageDialog(null, "I'm becoming a thingy!! :)");
			JOptionPane.showMessageDialog(null, "Next I need a favorite food. :)");
			myGUIThingy.setFood(JOptionPane.showInputDialog("What's my favorite food?"));
			JOptionPane.showMessageDialog(null, "Yay " + myGUIThingy.getFood() + " is my new favorite food!!! :)");
			JOptionPane.showMessageDialog(null, "Now to finish up I need a favorite movie. :)");
			myGUIThingy.setMovie(JOptionPane.showInputDialog("What's my favorite movie?"));
			JOptionPane.showMessageDialog(null, "Yay " + myGUIThingy.getMovie() + " is my new favorite movie!!! :)");
			JOptionPane.showMessageDialog(null, "My name is " + myGUIThingy.getName() + ".");
			JOptionPane.showMessageDialog(null, "My favorite food is " + myGUIThingy.getFood() + ".");
			JOptionPane.showMessageDialog(null, "My favorite movie is " + myGUIThingy.getMovie() + ".");
			JOptionPane.showMessageDialog(null, "HOORAY IM A NEW THINGY!!!!!");
		}
		else if(yesNo.equalsIgnoreCase("no"))
		{
			JOptionPane.showMessageDialog(null, "Awww i was hoping to become a thingy. :(");
		}
		
	}
	
//	public void meetTheThingy()
//	{
//		System.out.println("My name is: " + testThingy.getName());
//		System.out.println("What do you want to change my name to?");
//		String newName = wordScanner.nextLine();
//		testThingy.setName(newName);
//		
//		System.out.println("My new name is " + newName);
//		System.out.println("is this correct?");
//		String uInput = wordScanner.nextLine();
//		
//		if (uInput.equalsIgnoreCase("yes") )
//		{
//			//actions
//			System.out.println("Ok " + newName + " will be my new name. :)");
//		}
//		else if (uInput.equalsIgnoreCase("no"))
//		{
//			meetTheThingy();
//		}
//		else 
//		{
//			System.out.println("Stop typing gibberish!");
//			
//		}
//		
//	}
}
