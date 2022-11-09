package lab_1;

public class Point {
private double coordinateX;
private double coordinateY;

public Point(double x,double y) {
	this.coordinateX = x;
	this.coordinateY = y;
}

public void setCoordinatesX(double coordinateX) {
	this.coordinateX = coordinateX;
}

public void setCoordinatesY(double coordinateY) {
	this.coordinateY = coordinateY;
}

public double getCoordinateX() {
	return coordinateX;
}

public double getCoordinateY() {
	return coordinateY;
}

public double getLenghtToPoint(Point pointOne) {
	double lenght=Math.sqrt(Math.abs (Math.pow(coordinateX-pointOne.coordinateX,2)
			+Math.pow(coordinateY-pointOne.coordinateY,2)));
	return lenght;
}

public double getAngelToPoints(Point pointOne, Point pointTwo) {
	double vectorOneX = coordinateX-pointOne.coordinateX;
	double vectorOneY = coordinateY-pointOne.coordinateY;
	double vectorTwoX = coordinateX-pointTwo.coordinateX;
	double vectorTwoY = coordinateY-pointTwo.coordinateY;
	
	double angel=Math.acos((vectorOneX*vectorTwoX+vectorOneY*vectorTwoY)
			/((Math.pow(vectorOneX,2)+Math.pow(vectorOneY,2))
					*(Math.pow(vectorTwoX,2)+Math.pow(vectorTwoY,2))));
	return angel;
}

@Override
public boolean equals(Object obj) {
	if(obj==this)
		return true;
	if(obj==null||obj.getClass()!=getClass())
		return false;
	Point point=(Point) obj;
	return point.coordinateX==this.coordinateX &&
			point.coordinateY==this.coordinateY;
}

}
