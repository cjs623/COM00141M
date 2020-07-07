
public class TestAnimals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		Cat c = new Cat();
		
		d.setName("Rex");
		d.exerciseTime = 60;		
		c.setName("Muffin");
		System.out.println(d.toString());
		
		
		System.out.println(c.toString());
		c.loseLife();
		c.loseLife();
		c.loseLife();
		System.out.println(c.toString());
		c.loseLife();
		c.loseLife();
		c.loseLife();
		c.loseLife();
		System.out.println(c.toString());
		c.loseLife();
		System.out.println(c.toString());
		c.loseLife();
		System.out.println(c.toString());
		c.loseLife();
		System.out.println(c.toString());		
	}

}
