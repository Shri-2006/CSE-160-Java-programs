//Shriyans Singh 114807762
import java.util.ArrayList;
public class AnimalShelter {
	private ArrayList<Dog> dogList;
	private ArrayList<Cat> catList;
	
	public AnimalShelter(ArrayList<Dog> dogList, ArrayList<Cat> catList){
		this.dogList=dogList;
		this.catList=catList;
	}
	public void addPet(Animal pet) {
		if(pet instanceof Dog) {
			Dog e= (Dog) pet;
			dogList.add(e);
		}
		else if(pet instanceof Cat) {
			Cat e= (Cat) pet;
			catList.add(e);
		}
		else {
			System.out.println("Pet is neither a cat or dog. ");
		}
	}
	public Dog adoptPuppy() {
		Dog youngestPuppy= dogList.get(0);
		for(Dog dog: dogList) {
			if (dog.getYear()< youngestPuppy.getYear()) {
				youngestPuppy=dog;
			}
		}
		if(youngestPuppy.getYear() <=1) {
			dogList.remove(youngestPuppy);
			return youngestPuppy;
		}
		else {
			return null;
		}
		
	}
	public Cat adoptLongestResidentCat() {
		Cat longestResidentCat= catList.get(0);
		for(Cat cat: catList) {
			if(cat.getYearsAtShelter()> longestResidentCat.getYear()) {
				longestResidentCat=cat;
			}
		}
		catList.remove(longestResidentCat);
		return longestResidentCat;
		
		
	}
	public static void main(String[] args) {
		AnimalShelter shelter= new AnimalShelter( new ArrayList<Dog>(), new ArrayList<Cat>());
		Dog dog1 = new Dog("Bob", 1, 3);

		Dog dog2 = new Dog("Toby", 0.8, 0.5);

		Dog dog3 = new Dog("Lola", 5, 8);

		Dog dog4 = new Dog("Ruby", 0.4, 0.3);

		Cat cat1 = new Cat("Lucky", 7, 6.5);

		Cat cat2 = new Cat("Ginger", 11, 10);

		Cat cat3 = new Cat("Bella", 2, 4);

		shelter.addPet(dog1);

		shelter.addPet(dog2);

		shelter.addPet(dog3);

		shelter.addPet(cat1);

		shelter.addPet(cat2);

		shelter.addPet(cat3);

		shelter.addPet(dog4);

		System.out.println(shelter.adoptLongestResidentCat());

	//	Ginger: 11 years old, 10 years at the shelter

		System.out.println(shelter.adoptPuppy());

		//Ruby: 0.4 years old, 0.3 years at the shelter

		System.out.println(shelter.adoptPuppy());

	//	Toby: 0.8 years old, 0.5 years at the shelter

		System.out.println(shelter.adoptPuppy());

	//	Bob: 1 years old, 3 years at the shelter

		System.out.println(shelter.adoptPuppy());
		System.out.println(shelter.adoptLongestResidentCat());

		//Lucky: 7 years old, 6.5 years at the shelter
	}
	

}
