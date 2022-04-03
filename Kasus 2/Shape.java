public class Shape {
	public String color;
	public boolean filled;
	
	public Shape(){
		color = "green";
		filled = true;
	}
	public Shape(boolean filledStatus){
		filled = filledStatus;
		color = "green";
	}
	
	public void setFilled(boolean filled) {
		this.filled = filled;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	boolean isFilled() {
		return filled;
	}
	String getColor() {
		return color;
	}
	
	@Override
	public String toString() {
		return "A Shape with color of "+ getColor() +" and "+(filled ? "filled" :"not filled");
	}
}
