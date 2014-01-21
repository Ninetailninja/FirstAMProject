package first.controller;

//import first.view.ConsoleView;//imports class ConsoleView from package first.view

import first.view.FirstGUI;//imports class FirstGUI from package first.view

public class FirstRunner
{
	public static void main(String[] args)
	{
		FirstGUI myFirstGUI = new FirstGUI();
		myFirstGUI.start();
		//ConsoleView myView = new ConsoleView();
		//myView.questionsAndAnswer();
		//myView.start();
	}

}
