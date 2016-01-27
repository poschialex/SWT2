package mu.axistest;


import java.util.List;


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
	  
	  public int[][] matrixAdd(int[][] m1, int[][] m2) {
		  if(m1.length != m2.length) {
			  throw new IllegalArgumentException();
		  }
		  return new int[2][2];
	  }
	  
	}
