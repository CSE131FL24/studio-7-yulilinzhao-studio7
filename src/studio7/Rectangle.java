package studio7;

public class Rectangle {
	private double length;
	private double width;


	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double getArea() {
		return length * width;
	}

	public double getPerimeter() {
		return 2 * (length + width);
	}

	public boolean isSquare() {
		return length == width;
	}

	public boolean isSmallerThan(Rectangle other) {
		return this.getArea() < other.getArea();
	}

	@Override
	public String toString() {
		return "Rectangle[length=" + length + ", width=" + width + ", area=" + getArea() + ", perimeter=" + getPerimeter() + "]";
	}

	public static void main(String[] args) {
		Rectangle rect1 = new Rectangle(5, 3);
		Rectangle rect2 = new Rectangle(4, 4);
		System.out.println(rect1);
		System.out.println("Is square: " + rect1.isSquare());


	}
}