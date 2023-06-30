package OuterIneer;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OuterClass myOuter=new OuterClass();
		OuterClass.InnerClass myInner=myOuter.new InnerClass();
		System.out.println(myOuter.x + myInner.y);
		

	}

}
