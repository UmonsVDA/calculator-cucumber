package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestDivides {

	private final int value1 = 8;
	private final int value2 = 6;
	private Divides op;
	private List<Expression> params;

	@BeforeEach
	void setUp() throws IllegalOperationException {
		  params = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		  try {
		  	op = new Divides(params);
			op.setNotation(Notation.INFIX); // reset the notation to infix (which is the default) before each test
		  }
		  catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create an expression without null parameter list
		assertThrows(IllegalOperationException.class, () -> op = new Divides(null));
	}

	@SuppressWarnings("AssertBetweenInconvertibleTypes")
	@Test
	void testConstructor2() throws IllegalConstruction, IllegalOperationException {
		// A Times expression should not be the same as a Divides expression
		assertNotSame(op, new Times(new ArrayList<>()));
	}

	@Test
	void testEquals() throws IllegalConstruction, IllegalOperationException {
		// Two similar expressions, constructed separately (and using different constructors) should be equal
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		Divides d = new Divides(p, Notation.INFIX);
		assertEquals(op, d);
	}

	@SuppressWarnings("ConstantConditions")
	@Test
	void testNull() {
		assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
	}

	@Test
	void testHashCode() throws IllegalConstruction, IllegalOperationException {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		Divides e = new Divides(p, Notation.INFIX);
		assertEquals(e.hashCode(), op.hashCode());
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalOperationException.class, () -> op = new Divides(params));
	}

}
