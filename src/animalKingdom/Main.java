package animalKingdom;
import java.util.*;

public class Main
{

	public static void main(String[] args) {
		Mammals panda = new Mammals("Panda",1869);
		Mammals zebra  = new Mammals("Zebra",1778);
		Mammals koala = new Mammals("Koala",1816);
		Mammals sloth = new Mammals("Sloth",1804);
		Mammals armadillo = new Mammals("Armadillo",1758);
		Mammals raccoon = new Mammals("Raccoon",1758);
		Mammals bigfoot = new Mammals("Bigfoot",2021);

		Birds pigeon = new Birds("Pigeon",1837);
		Birds peacock = new Birds("Peacock",1821);
		Birds toucan = new Birds("Toucan",1758);
		Birds parrot = new Birds("Parrot",1824);
		Birds swan = new Birds("Swan",1758);

		Fish salmon = new Fish("Salmon",1758);
		Fish catfish = new Fish("Catfish",1817);
		Fish perch = new Fish("Perch",1758);

		System.out.println(panda);
		System.out.println(zebra);
		System.out.println(toucan);
		System.out.println(perch);

		ArrayList<AnimalsAbs> animals = new ArrayList<AnimalsAbs>();
		//Mammals
		animals.add(panda);
		animals.add(zebra);
		animals.add(koala);
		animals.add(sloth);
		animals.add(armadillo);
		animals.add(raccoon);
		animals.add(bigfoot);
		//Birds
		animals.add(pigeon);
		animals.add(peacock);
		animals.add(toucan);
		animals.add(parrot);
		animals.add(swan);
		//Fish
		animals.add(salmon);
		animals.add(catfish);
		animals.add(perch);

		
		
		for(AnimalsAbs a:animals)
		{
			System.out.println(a.toString());
		}
	}
}