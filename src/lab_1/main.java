package lab_1;

import java.util.ArrayList;

public class main {
	public static void main(String args[ ]) {
		ArrayList<Triangel> list = new ArrayList<>();
		int numRectan=0,numRavno=0,numRavnobed=0,numRandom=0;
		double maxSquareRectan=0,maxSquareRavno=0,maxSquareRavnobed=0,maxSquareRandom=0;
		double minSquareRectan=Double.MAX_VALUE,minSquareRavno=Double.MAX_VALUE,
				minSquareRavnobed=Double.MAX_VALUE,minSquareRandom=Double.MAX_VALUE;
		
		list.add(new Triangel(new Point(0,1),new Point(0,0),new Point(1,0)));
		list.add(new Triangel(new Point(0,10),new Point(0,0),new Point(5,0)));
		list.add(new Triangel(new Point(5,0),new Point(0,0),new Point(0,5)));
		list.add(new Triangel(new Point(1,1),new Point(4,2),new Point(6,1)));
		list.add(new Triangel(new Point(8,3),new Point(9,7),new Point(5,2)));
		list.add(new Triangel(new Point(0,0),new Point(3,8),new Point(6,0)));
		list.add(new Triangel(new Point(0,1),new Point(-4,1),new Point(-2,4)));
		
		for(int i=0;i<list.size();i++) {
			Triangel Tre=list.get(i);
			switch(Tre.getType()){
			case "Прямоугольный":
				numRectan++;
				if(Tre.getSquare()>maxSquareRectan)
					maxSquareRectan=Tre.getSquare();
				if(Tre.getSquare()<minSquareRectan)
					minSquareRectan=Tre.getSquare();
				break;
			case "Равнобедренный":
				numRavnobed++;
				if(Tre.getSquare()>maxSquareRavnobed)
					maxSquareRavnobed=Tre.getSquare();
				if(Tre.getSquare()<minSquareRavnobed)
					minSquareRavnobed=Tre.getSquare();
				break;
			case "Равносториний":
				numRavno++;
				if(Tre.getSquare()>maxSquareRavno)
					maxSquareRavno=Tre.getSquare();
				if(Tre.getSquare()<minSquareRavno)
					minSquareRavno=Tre.getSquare();
				break;
			case "Произвольный":
				numRandom++;
				if(Tre.getSquare()>maxSquareRandom)
					maxSquareRandom=Tre.getSquare();
				if(Tre.getSquare()<minSquareRandom)
					minSquareRandom=Tre.getSquare();
				break;
			}
		}
		if(numRectan!=0)
		System.out.println("Прямоугольных: "+numRectan+" Максималная: "+maxSquareRectan+" Минимальная: "+minSquareRectan);
		if(numRavnobed!=0)
		System.out.println("Равнобедренных: "+numRavnobed+" Максималная: "+maxSquareRavnobed+" Минимальная: "+minSquareRavnobed);
		if(numRavno!=0)
		System.out.println("Равносториних: "+numRavno+" Максималная: "+maxSquareRavno+" Минимальная: "+minSquareRavno);
		if(numRandom!=0)
		System.out.println("Произвольных: "+numRandom+" Максималная: "+maxSquareRandom+" Минимальная: "+minSquareRandom);
	}
}
