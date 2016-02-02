package mu.axistest;

import java.io.File;
import static org.junit.Assert.assertEquals;
import java.util.ArrayList;
import java.util.List;

import javax.xml.transform.Source;

import org.xmlunit.builder.DiffBuilder;
import org.xmlunit.builder.Input;
import org.xmlunit.diff.DefaultNodeMatcher;
import org.xmlunit.diff.Diff;
import org.xmlunit.diff.Difference;
import org.xmlunit.diff.DifferenceEngine;
import org.xmlunit.diff.ElementSelectors;
import org.xmlunit.matchers.CompareMatcher;

public class WSDLCompare {
	public List<Difference> compareXML (String name1, String name2, boolean showDifferences ) {
		//String name1 = "XML//calculatorOff.wsdl";
		//String name2 = "XML//calculatorMod_impl.wsdl";
		//boolean showDifferences = true;
		File f1 = new File(name1); //"XML//calculatorOff.wsdl"
		File f2 = new File(name2); //"XML//calculatorMod_impl.wsdl"
		Source xml1 = Input.fromFile(f1).build();
		Source xml2 = Input.fromFile(f2).build();
		Diff myDiff = DiffBuilder.compare(xml1)
				.ignoreComments()
				.ignoreWhitespace()
				.withNodeMatcher(new DefaultNodeMatcher(ElementSelectors.byNameAndText))
				.withTest(xml2).build();
		Iterable<Difference> differences = myDiff.getDifferences();
		
		List<Difference> list = new ArrayList<Difference>();
	    for (Difference item : differences) {
	        list.add(item);
	    }
		
	    if(showDifferences) {
	    	for(Difference d:list) {
		    	//System.out.println(d.toString(new SWTXMLComparisonFormatter()));
		    	System.out.println(d.toString());
		    }
	    }
	   return list;

	}
}
