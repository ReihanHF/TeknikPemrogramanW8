public class Circle extends Shape {
	public double radius;
	
	public Circle() {
		radius = 1.0;
		color = "green";
		filled = true;
	}
	Circle(double jarijari){
		radius = jarijari;
		color = "green";
		filled = true;
	}
	Circle(double jarijari, String warna, boolean terisi){
		radius = jarijari;
		color = warna;
		filled = terisi;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getArea() {
		return radius*radius*Math.PI;
	}
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	@Override
	public String toString() {
		return "A circle with radius "+radius+", which is a subclass of "+super.toString();
	}
}
