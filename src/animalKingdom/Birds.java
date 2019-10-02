package animalKingdom;

public class Birds extends AnimalsAbs implements MoverInt
{
	public Birds(String name,int yearDiscovered)
	{
		super(name,yearDiscovered);
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
