package animalKingdom;

public class Birds extends AnimalsAbs
{
	public Birds(String name,int food,int yearDiscovered)
	{
		super(name,food,yearDiscovered);
	}

	public String  move()
	{
		return "Fly";
	}
	public String breath()
	{
		return "Lungs";
	}
	public String reproduce()
	{
		return "Eggs";
	}
}
