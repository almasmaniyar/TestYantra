package testNGParallelExecution;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestNG2 {
  @Test
  public void m2() {
	  Reporter.log("m1 method",true);
  }
}
