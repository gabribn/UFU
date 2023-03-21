package entities;

public class ClassD {
		int x1,y1;
		
		
		public ClassD(int x1, int y1) {
			this.x1 = x1;
			this.y1 = y1;	
		}

		public double distancia(int x2,int y2) {
			return  Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));

		}
		
}

