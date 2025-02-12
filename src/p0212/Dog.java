package p0212;

public class Dog {
	private String name;
	private String species;
	private int age;
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getSpecies() {
		return species;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
	public String toString() {
		return "[name= " + name + ",species= " + species + ",age= " + age + "]";
	}

}
