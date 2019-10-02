package animalKingdom;

public abstract class AnimalsAbs
{
	static int maxId=0;
	int food;
	int id;
	String name;
	int yearDiscovered;

	public AnimalsAbs(String name,int food,int yearDiscovered)
	{
		maxId++;
		id=maxId;
		this.food=food;
		this.name=name;
		this.yearDiscovered=yearDiscovered;
	}
	public String eat()
	{
		return "Yum";
	}
	
	abstract String  move();
	abstract String breath();
	abstract String reproduce();
}