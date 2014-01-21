package first.model;

public class ThatOnetThing
{
	//Declare Variables
	private String name;
	
	private String food;
	
	private String movie;
	
	public ThatOnetThing()
	{
		name = "That one name";
		food = "Peanut butter and Jelly Sammiches";
		movie = "Donnie Darko";
	}
	
	public void setFood(String food)
	{
		this.food = food;
	}
	
	public void setMovie(String movie)
	{
		this.movie = movie;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return name;
	}
	
	public String getFood()
	{
		return food;
	}
	
	public String getMovie()
	{
		return movie;
	}
	
	
}
