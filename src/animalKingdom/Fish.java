package animalKingdom;

public class Fish extends AnimalsAbs
{
	public Fish(String name,int food,int yearDiscovered)
	{
		super(name,food,yearDiscovered);
	}

	public String  move()
	{
		return "Swim";
	}
	public String breath()
	{
		return "Gills";
	}
	public String reproduce()
	{
		return "Eggs";
	}
	
}