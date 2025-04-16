import mypack1.demo1;
import mypack1.demo2;
import mypack1.inner.demo3;

public class test{
	public static void main(String args[]){
		demo1 d1=new demo1();
		d1.display();
		demo2 d2=new demo2();
		d2.display();
		demo3 d3=new demo3();
		d3.display();
	}
}