package mu.axistest;

import java.io.File;
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
	public static void main(String[] args) {
		File f1 = new File("XML//calculatorOff.wsdl");
		File f2 = new File("XML//calculatorMod.wsdl");
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
		
	    for(Difference d:list) {
	    	System.out.println(d.toString());
	    }
		//while(differences.iterator().hasNext()) {
		//    System.out.println((differences.iterator().next().toString()));
		//}
	}
}
