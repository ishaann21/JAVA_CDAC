
import java.lang.Math;
class Point2D{
		double x;
		double y;
		public Point2D(double x, double y){
			this.x=x;
			this.y=y;
		}
		public String show(){
			return "X ="+x+" Y ="+y;
		}
		public Boolean isEqual(Point2D obj){
			if((this.x==obj.x) && (this.y==obj.y)){
				return true;
			}
			else{
				return false;
			}
		}
		public double calculateDistance(Point2D obj){
			//double dis,x3,y3;
			//x3=(this.x-obj.x)*(this.x-obj.x);
			//y3=(this.y-obj.y)*(this.y-obj.y);
			//dis=x3+y3;
			//dis=Math.sqrt((this.x-obj.x)*(this.x-obj.x)+(this.y-obj.y)*(this.y-obj.y));
			return Math.sqrt((this.x-obj.x)*(this.x-obj.x)+(this.y-obj.y)*(this.y-obj.y));
		}

}