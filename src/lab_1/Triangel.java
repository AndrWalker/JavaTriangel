package lab_1;

public class Triangel {
	private Point pointOne;
	private Point pointTwo;
	private Point pointThree;
	private String triangelType;
	private double Perimetr;
	private double Square;

public Triangel(Point pointOne, Point pointTwo,Point pointThree) {
	this.setPointOne(pointOne);
	this.setPointTwo(pointTwo);
	this.setPointThree(pointThree);	
}

private void Square() {
	Square=Math.sqrt((Perimetr/2)*((Perimetr/2)-pointOne.getLenghtToPoint(pointTwo))
			*((Perimetr/2)-pointOne.getLenghtToPoint(pointThree))
			*((Perimetr/2)-pointTwo.getLenghtToPoint(pointThree)));
	/*this.triangelSquare = pointOne.getLenghtToPoint(pointTwo)*pointOne.getLenghtToPoint(pointThree)
	*Math.sin(pointOne.getAngelToPoints(pointThree, pointTwo));*/
}

private void Perimetr() {
	Perimetr = pointOne.getLenghtToPoint(pointTwo)+pointOne.getLenghtToPoint(pointThree)
	+pointTwo.getLenghtToPoint(pointThree);
}

private void triangelType() {
	if((pointOne.getAngelToPoints(pointThree, pointTwo)==1.5707963267948966)
			||(pointTwo.getAngelToPoints(pointThree, pointOne)==1.5707963267948966)
			||(pointThree.getAngelToPoints(pointOne, pointTwo)==1.5707963267948966))
		triangelType="Прямоугольный";
	
	
	else if((pointOne.getLenghtToPoint(pointTwo)==pointOne.getLenghtToPoint(pointThree))
			||(pointOne.getLenghtToPoint(pointTwo)==pointTwo.getLenghtToPoint(pointThree))
			||(pointOne.getLenghtToPoint(pointThree)==pointTwo.getLenghtToPoint(pointThree)))
		triangelType="Равнобедренный";
	
	else if((pointOne.getLenghtToPoint(pointTwo)==pointOne.getLenghtToPoint(pointThree))
			&&(pointOne.getLenghtToPoint(pointTwo)==pointTwo.getLenghtToPoint(pointThree))
			&&(pointOne.getLenghtToPoint(pointThree)==pointTwo.getLenghtToPoint(pointThree)))
		triangelType="Равносториний";
	else 
		
		triangelType="Произвольный";
	
	
}

public void setPointOne(Point pointOne) {
	if(pointOne.equals(pointThree)||pointOne.equals(pointTwo)) {
		throw new IllegalArgumentException();
	}
	
	this.pointOne = pointOne;
	
	if((this.pointThree!=null)&&(this.pointTwo!=null)) {
		this.Perimetr();
	    this.Square();
		this.triangelType();
		}
}

public void setPointTwo(Point pointTwo) {
	if(pointTwo.equals(pointThree)||pointTwo.equals(pointOne)) {
		throw new IllegalArgumentException();
	}
	this.pointTwo = pointTwo;
	if((this.pointOne!=null)&&(this.pointThree!=null)) {
		this.Perimetr();
	    this.Square();
		this.triangelType();
		}
}

public void setPointThree(Point pointThree) {
	if(pointThree.equals(pointTwo)||pointThree.equals(pointOne)) {
		throw new IllegalArgumentException();
		}
	
	this.pointThree = pointThree;
	
	if((this.pointOne!=null)&&(this.pointTwo!=null)) {
		this.Perimetr();
        this.Square();
        this.triangelType();
	}
}
public double getPerimetr() {
	return this.Perimetr;
}
public double getSquare() {
	return this.Square;
}
public String getType() {
	return this.triangelType;
}
@Override
public String toString() {
    return "Point1= " + pointOne
            + "Point2= " + pointTwo 
            + "Point3= " + pointThree
            + "Triangel Square =" + getSquare() + "]";
}
}
