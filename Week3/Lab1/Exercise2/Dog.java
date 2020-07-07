
public class Dog extends Animal{
	int exerciseTime;
	
	public int getExerciseTime() {
		return exerciseTime;
	} 
	
	public void setExerciseTime(int exerciseTimeIn) {
		exerciseTime = exerciseTimeIn;
	}
	
	public String toString() {
		return super.toString() + ", Exercise time is: " + getExerciseTime();
	}
}
