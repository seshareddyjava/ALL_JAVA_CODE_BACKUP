package proj03;

public class Helper {
	static public Calculator getObj(String type) {
	    Calculator calc =null;
	    if(type.equals("add")) {
	    	calc = new Add();
	    }
	    else if (type.equals("sub")) {
	    	calc = new Sub();
	    } else if(type.equals("mul")) {
	    	calc = new Mul();
	    } 
	   return calc;
	   
   }
}
