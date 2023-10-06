class Graph{
	public static void main(String[] args){
		double a=4,b=4;
		double c=5,d=5;
		Point2D p2;
		Point2D p1;
		p1=new Point2D(a,b);
		p2=new Point2D(c,d);
		System.out.print("point p1 is: ");
		System.out.println(p1.show());
		System.out.print("point p2 is: ");
		System.out.println(p2.show());
		System.out.print("Are these two points equal? : ");
		System.out.println(p1.isEqual(p2));
		System.out.println("Distance between these points is: "+p1.calculateDistance(p2)+" units.");
	}
}