package TypesoFInheritance;

class Animal {
	int legs;
	String color;
	String food;

	void print() {
		System.out.println(legs + "\t\t" + color + "\t\t" + food);
	}
}

class Elephant extends Animal {
	void setElephant(int leg, String col, String food) {
		super.legs = leg;
		super.color = col;
		super.food = food;
	}

}

class Duck extends Animal {
	void setDuck(int leg, String col, String food) {
		super.legs = leg;
		super.color = col;
		super.food = food;
	}
}

public class HierarchicalInheritance {
	public static void main(String[] args) {
		Duck d = new Duck();
		d.setDuck(2, "white", "insect");
		System.out.println("Legs\t\tColor\t\tfood");

		d.print();
		Elephant e = new Elephant();
		e.setElephant(4, "Black", "Grass");
		e.print();
	}
}
