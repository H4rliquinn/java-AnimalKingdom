package animalKingdom;

public abstract class AnimalsAbs
{
	static int maxId=0;
	int id;
	String name;
	int yearDiscovered;

	public AnimalsAbs(String name,int yearDiscovered)
	{
		maxId++;
		id=maxId;
		this.name=name;
		this.yearDiscovered=yearDiscovered;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
	public int getYearDiscovered()
	{
		return yearDiscovered;
	}


	public String eat()
	{
		return "Yum";
	}

	abstract String  move();
	abstract String breath();
	abstract String reproduce();

}