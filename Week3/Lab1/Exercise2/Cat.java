
public class Cat extends Animal{
	int livesLeft = 9;
	
	public int getLivesLeft() {
		return livesLeft;
	} 
	
	public void reduceLife() {
		livesLeft = livesLeft - 1;
	}
	
	public void loseLife() {		
		
		
		if (livesLeft == 1) {
			reduceLife();
			System.out.printf("The cat is dead, %s lives left :(\n", getLivesLeft());
		}else if (livesLeft>0){
			reduceLife();
			System.out.printf("The cat has %s lives left :)\n",getLivesLeft());
		} else {
			System.out.printf("The cat is already dead!!!!!!!! %s lives left :(\n", getLivesLeft());
		}
	}
	
	public String toString() {
		return super.toString() + ", Lives left: " + getLivesLeft();
	}
	
}
