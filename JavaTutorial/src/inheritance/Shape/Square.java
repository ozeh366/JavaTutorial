package inheritance.Shape;

public class Square extends Shape{
	
	private double length;
	
	public Square() {

	}
	
	public Square(double length, String color) {
		super(0, 0, color);
		this.length = length;
	}

	public double getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}
	
	public double getArea() {
		return calcArea();
	}
	
	public double getPerimeter() {
		return calcPerimeter();
	}
	
	public double getDiagonal() {
		return calcDiagonal();
	}
	
	private double calcArea() {
		return Math.pow(this.length, 2);
	}

	private double calcPerimeter() {
		return this.length * 4;
	}
	
	private double calcDiagonal() {
		return this.length * Math.sqrt(2);
	}
	public static void main(String[] args) {
		Square sq = new Square(10, "Blue");
		System.out.println("The Area of a square with length " + sq.length +" = " + sq.getArea());
		System.out.println("The Perimeter of a square with length " + sq.length +" = " + sq.getPerimeter());
		System.out.println("The Diagonal of a square with length " + sq.length +" = " + sq.getDiagonal());
		sq.setColor("Gold");
		System.out.println("The color of my square is " + sq.getColor());
	}
	

}
