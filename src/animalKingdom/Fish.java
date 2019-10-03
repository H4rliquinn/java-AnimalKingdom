package animalKingdom;

public class Fish extends AnimalsAbs implements MoverInt
{
	public Fish(String name,int yearDiscovered)
	{
		super(name,yearDiscovered);
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
	@Override
	public String toString()
	{
		return "Fish{ID:"+id+" Name:"+name+" Year:"+yearDiscovered+"}";
	}		
}