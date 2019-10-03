package animalKingdom;

public class Mammals extends AnimalsAbs implements MoverInt
{
	public Mammals(String name,int yearDiscovered)
	{
		super(name,yearDiscovered);
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

	@Override
	public String toString()
	{
		return "Mammal{ID:"+id+" Name:"+name+" Year:"+yearDiscovered+"}";
	}	
}