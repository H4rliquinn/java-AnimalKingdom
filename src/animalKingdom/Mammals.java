package animalKingdom;

public class Mammals extends AnimalsAbs
{
	public Mammals(String name,int food,int yearDiscovered)
	{
		super(name,food,yearDiscovered);
	}

	public String  move()
	{
		return "Walk";
	}
	public String breath()
	{
		return "Lungs";
	}
	public String reproduce()
	{
		return "Live Births";
	}
}