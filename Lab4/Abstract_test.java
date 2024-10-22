abstract class Animal {
	public  abstract void eat();
	public abstract void sleep();

	public static void main(String args[]) {
		Lion l = new Lion();
		Dear d = new Dear();
		Tiger t = new Tiger();
	
		l.eat();
		l.sleep();

		d.eat();
		d.sleep();

		t.eat();
		t.sleep();
	}

}

class Lion extends Animal {
	public void eat() {
		System.out.println("Lion eats the other animals");
	}
	
	public void sleep() {
		System.out.println("Lion sleeps alone");
	}
}

class Dear extends Animal {
	public void eat() {
		System.out.println("Dear eats plants");
	}
	
	public void sleep() {
		System.out.println("Dear sleeps at night");
	}
}

class Tiger extends Animal {
	public void eat() {
		System.out.println("Tiger eats meats");
	}

	public void sleep() {
		System.out.println("Tiger sleeps at midnight");
	}
}

class Abstract_test {
	public static void main(String args[]) {
		
	}
}
