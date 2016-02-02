package mu.axistest;


import java.util.List;
import java.util.Map;


public class Calculator {
	  public int add(int i1, int i2) {
	    return i1 + i2; 
	  }

	  public int subtract(int i1, int i2) {
	    return i1 - i2;
	  }
	  
	  public int listSum(List<Integer> list) {
		  int ret = 0;
		  for(Integer i:list) {
			  ret+=i;
		  }
		  return ret;
	  }
	  

	  

	  
	}
