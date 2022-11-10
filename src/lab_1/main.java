package lab_1;

import java.util.ArrayList;

public class main {
	public static void main(String args[ ]) {
		ArrayList<Triangel> list = new ArrayList<>();
		int numRectan=0,numRavno=0,numRavnobed=0,numRandom=0;
		Triangel maxSquareRectan=null,maxSquareRavno=null,maxSquareRavnobed=null,maxSquareRandom=null;
		Triangel minSquareRectan=null,minSquareRavno=null,minSquareRavnobed=null,minSquareRandom=null;
		
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
				if(maxSquareRectan==null) {
					maxSquareRectan=Tre;
					minSquareRectan=Tre;
				}
				if(Tre.getSquare()>maxSquareRectan.getSquare())
					maxSquareRectan=Tre;
				if(Tre.getSquare()<minSquareRectan.getSquare())
					minSquareRectan=Tre;
				break;
			case "Равнобедренный":
				numRavnobed++;
				if(maxSquareRavnobed==null) {
					maxSquareRavnobed=Tre;
					minSquareRavnobed=Tre;
				}
				if(Tre.getSquare()>maxSquareRavnobed.getSquare())
					maxSquareRavnobed=Tre;
				if(Tre.getSquare()<minSquareRavnobed.getSquare())
					minSquareRavnobed=Tre;
				break;
			case "Равносториний":
				numRavno++;
				if(maxSquareRavno==null) {
					maxSquareRavno=Tre;
				    minSquareRavno=Tre;
				    }
				if(Tre.getSquare()>maxSquareRavno.getSquare())
					maxSquareRavno=Tre;
				if(Tre.getSquare()<minSquareRavno.getSquare())
					minSquareRavno=Tre;
				break;
			case "Произвольный":
				numRandom++;
				if(maxSquareRandom==null) {
					maxSquareRandom=Tre;
				    minSquareRandom=Tre;
				    }
				if(Tre.getSquare()>maxSquareRandom.getSquare())
					maxSquareRandom=Tre;
				if(Tre.getSquare()<minSquareRandom.getSquare())
					minSquareRandom=Tre;
				break;
			}
		}
		
		if(numRectan!=0) {
		System.out.println("Прямоугольных: "+numRectan);
		System.out.println("Максималный: "+maxSquareRectan);
		System.out.println("Минимальный: "+minSquareRectan);
		}
		if(numRavnobed!=0) {
		
		System.out.println("Равнобедренных: "+numRavnobed);
		System.out.println("Максималный: "+maxSquareRavnobed);
		System.out.println("Минимальный: "+minSquareRavnobed);
		}
		if(numRavno!=0) {
		System.out.println("Равностороних: "+numRavno);
		System.out.println("Максималный: "+maxSquareRavno);
		System.out.println("Минимальный: "+minSquareRavno);
		}
		if(numRandom!=0) {
		System.out.println("Произвольных: "+numRandom);
		System.out.println("Максималный: "+maxSquareRandom);
		System.out.println("Минимальный: "+minSquareRandom);
		}
		
		
	}
}
