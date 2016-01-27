package mu.axistest;
import java.util.ArrayList;
import org.apache.axis.wsdl.WSDL2Java;

public class WSDLGEN {
	public static void main(String[] args) {
			ArrayList<String> argsList = new ArrayList<String>();
			argsList.add("-o"); //Generated WSDL File name
			argsList.add("XML//calculatorOff.wsdl");
			argsList.add("-l");// Target URL
			argsList.add("http://localhost:8080/axis/services/calculator");
			argsList.add("mu.axistest.Calculator"); //Class for which to generate a WSDL. Include package.
			args = argsList.toArray(new String[argsList.size()]);
			org.apache.axis.wsdl.Java2WSDL.main(args);
			//org.apache.axis.wsdl.Java2WSDL generator;
	}
}
