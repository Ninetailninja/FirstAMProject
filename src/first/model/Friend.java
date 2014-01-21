package first.model;

public class Friend
{
	//variables
	private String name;
	private String humorStyle;
	private int age;
	private String interest;
	private boolean likesPineapple;
	private double weight;
	
	//setters
	public void setName(String name)
	{
		this.name = name;
	}
	public void setHumorStyle(String humorStyle)
	{
		this.humorStyle = humorStyle;
	}
	public void setAge(int age)
	{
		this.age = age;
	}
	public void setInterest(String interest)
	{
		this.interest = interest;
	}
	public void setLikesPineapple(boolean likesPineapple)
	{
		this.likesPineapple = likesPineapple;
	}
	public void setWeight(double weight)
	{
		this.weight = weight;
	}
	
	//getters
	public String getName()
	{
		return name;
	}
	public String getHumorStyle()
	{
		return humorStyle;
	}
	public int getAge()
	{
		return age;
	}
	public String getInterest()
	{
		return interest;
	}
	public boolean getLikesPineapple()
	{
		return likesPineapple;
	}
	public double getWeight()
	{
		return weight;
	}
	
	public Friend()
	{
		name = "nameless";
		humorStyle = "less than none";
		age = -10;
		interest = "absolutely nothing";
		likesPineapple = false;
		weight = -99.99999;
	}
	
	public Friend(String name, String humorStyle, int age, String interest, boolean likesPineapple, double weight)
	{
		setName(name);
		setHumorStyle(humorStyle);
		setAge(age);
		setInterest(interest);
		setLikesPineapple(likesPineapple);
		setWeight(weight);
	}
}
