package mu.axistest;
import static org.junit.Assert.assertEquals;

import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.xmlunit.diff.Difference;

public class WSDLCompareTest {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestCaseOne.class);
		for(Failure failure:result.getFailures()) {
			System.out.println(failure.toString());
		}
	}
	
	public static class TestCaseOne {
		@Test
		public void Test1() {
			WSDLCompare comparer = new WSDLCompare();
			List<Difference> differences = comparer.compareXML("XML//calculatorOff.wsdl", "XML//calculatorMod_impl.wsdl",true);
			System.out.println("-------------------");
			assertEquals("There should be no differences between the files.",0,differences.size());
		}
		@Test
		public void Test2() {
			WSDLCompare comparer = new WSDLCompare();
			List<Difference> differences = comparer.compareXML("XML//calculator2Off.wsdl", "XML//calculator2Mod_impl.wsdl",true);
			System.out.println("-------------------");
			assertEquals("There should be no differences between the files.",0,differences.size());
		}
		@Test
		public void Test3() {
			WSDLCompare comparer = new WSDLCompare();
			List<Difference> differences = comparer.compareXML("XML//calculator3Off.wsdl", "XML//calculator3Mod_impl.wsdl",true);
			System.out.println("-------------------");
			assertEquals("There should be no differences between the files.",0,differences.size());
		}
		@Test
		public void Test4() {
			WSDLCompare comparer = new WSDLCompare();
			List<Difference> differences = comparer.compareXML("XML//calculator4Off.wsdl", "XML//calculator4Mod_impl.wsdl",true);
			System.out.println("-------------------");
			assertEquals("There should be no differences between the files.",0,differences.size());
		}
	}
}
