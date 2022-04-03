public class Rectangle extends Shape {
	public double width;
	public double length;
	
	Rectangle(){
		width = 1.0;
		length = 1.0;
		color = "green";
		filled = true;
	}
	Rectangle(double panjang, double lebar){
		width = lebar;
		length = panjang;
		color = "green";
		filled = true;
	}
	Rectangle(double panjang, double lebar, String warna, boolean terisi){
		width = lebar;
		length = panjang;
		color = warna;
		filled = terisi;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		return width*length;
	}
	public double getPerimeter() {
		return 2*(width + length);
	}
	@Override
	public String toString() {
		return "A rectangle with width "+width+" and length "+length+", which is a subclass of "+super.toString(); 
	}
}
