package Main;

public class Triangle extends GeometricObject {
	
	double side1;
	double side2;
	double side3;
	
	Triangle() {
		side1 = 1.0;
		side2 = 1.0;
		side3 = 1.0;
	}
	
	Triangle(double newSide1, double newSide2, double newSide3){
		side1 = newSide1;
		side2 = newSide2;
		side3 = newSide3;
	}
	
	public double getSide1(){
		return side1;
	}
	
	public double getSide2(){
		return side2;
	}
	
	public double getSide3(){
		return side3;
	}
	
	public void setSide1(double newSide1){
		side1 = newSide1;
	}
	
	public void setSide2(double newSide2){
		side2 = newSide2;
	}
	
	public void setSide3(double newSide3){
		side3 = newSide3;
	}
	
	public double getArea(){
		double p = (side1+side2+side3)/2;
		double a = (p*(p-side1)*(p-side2)*(p-side3));
		return java.lang.Math.sqrt(a);
	}

	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	public String toString(){
		System.out.println("side one= "+ side1+
				"side two= "+ side2+
				"side three= "+ side3);
		return null;
	}
}


