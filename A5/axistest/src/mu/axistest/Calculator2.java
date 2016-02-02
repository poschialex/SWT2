package mu.axistest;

import java.util.Map;

public class Calculator2 {

	  public int[][] matrixAdd(int[][] m1, int[][] m2) {
		  if(m1.length != m2.length) {
			  throw new IllegalArgumentException();
		  }
		  return new int[2][2];
	  }
	  
	  public String textNumber(int number, String string) {
		  return string;
	  }
	  
	  public Map<String,Integer> mapTo(Map<String,Integer> map) {
		  return map;
	  }
	
}
