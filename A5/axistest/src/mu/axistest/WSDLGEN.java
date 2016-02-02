package mu.axistest;
import java.util.ArrayList;
import org.apache.axis.wsdl.WSDL2Java;


public class WSDLGEN {
	public static void main(String[] args) {
		//ArrayList<String> classes = new ArrayList<String>();
		//classes.add("Calculator");
		//classes.add("Calculator2");
		//classes.add("Calculator3");
		//classes.add("Calculator4");
		String currentClass = "Calculator4";
		//for(String currentClass: classes) {
			ArrayList<String> argsList = new ArrayList<String>();
			System.out.println(currentClass);
			argsList.add("-o"); //Generated WSDL File name
			argsList.add("XML//" + currentClass + "Off.wsdl");
			argsList.add("-l");// Target URL
			argsList.add("http://localhost:8080/axis/services/"+currentClass);
			argsList.add("mu.axistest."+currentClass); //Class for which to generate a WSDL. Include package.
			String[] argsar = argsList.toArray(new String[argsList.size()]);
			org.apache.axis.wsdl.Java2WSDL.main(argsar);
			//org.apache.axis.wsdl.Java2WSDL generator;
		//}
	}
}
