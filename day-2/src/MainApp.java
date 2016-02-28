
public class MainApp {

	public static void main(String[] args) {

		Shape shape1 = new Circle();
		Shape shape2 = new Triangle();
		
		disPlayInformation(shape1);
		disPlayInformation(shape2);


	}

	public static void disPlayInformation(Shape shape)
	{
		shape.draw();
		shape.fillColor();

	}

}
