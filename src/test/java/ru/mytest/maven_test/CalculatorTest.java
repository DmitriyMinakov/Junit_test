package ru.mytest.maven_test;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.Before;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import ru.mytest.maven_test.Calculator;
import ru.mytest.maven_test.ICalculator;

@RunWith(Parameterized.class)
public class CalculatorTest {
	private static ICalculator calculator;

	@Before
	public void beforeEachTest() {
		System.out.println("Начало теста. Входные параметры "+firstParameter+operation+secondParameter+"="+result);
	}

	@After
	public void afterEachTest() {
		System.out.println("Конец теста");
	}
	      public int firstParameter;
	      public int secondParameter;
	      public String operation;
	      public int result;

	  public CalculatorTest(int operand1, int operand2, String operation,  int result) {
	           this.firstParameter = operand1;
	           this.secondParameter = operand2;
	           this.operation = operation;
	           this.result = result;
	          
	  }
	@Test
	public void testSum() throws Exception {
		
		int res=0;
		if (operation=="+") 
			res=calculator.sum(firstParameter,secondParameter);
			else if (operation=="-")
				res=calculator.subtraction(firstParameter,secondParameter);	
			else if	(operation=="*")
				res=calculator.multiplication(firstParameter,secondParameter);	
			else if (operation=="/")
				res=calculator.divison(firstParameter,secondParameter);

		assertTrue("Результат(" + result + ") не равен ", res == result);
		
	}
	
	@Parameterized.Parameters
    public static Collection<Object[]> getTestData() {
          return Arrays.asList(new Object[][]{
        {2, 2,"+", 4},
        {2, 1,"+", 8},
        {5, 2,"-", 3},
        {0, 2,"*", 0},
        {9, 3,"/", 3},
    });
 }
}
