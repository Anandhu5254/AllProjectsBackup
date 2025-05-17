package loopingexamples;

public class FinalizeMethod {

		 public void finalize()
		 {
		 System.out.println("object is garbage collected");
		 }
		 public static void main(String args[]){
			 FinalizeMethod s1=new FinalizeMethod();
			 FinalizeMethod s2=new FinalizeMethod();
		 s1=null;
		 s2=null;
		 System.gc();
		 System.out.println(s1);
	  // System.out.println(s2);
		 }
}
		 
