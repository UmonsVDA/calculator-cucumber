package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestTimes {

	private final int value1 = 8;
	private final int value2 = 6;
	private Times op;
	private List<Expression> params;

	@BeforeEach
	void setUp() throws IllegalOperationException {
		  params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
		  try { op = new Times(params); }
		  catch(IllegalConstruction e) { fail(); }
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create an expression without null parameter list
		assertThrows(IllegalOperationException.class, () -> op = new Times(null));
	}

	@Test
	void testConstructor2() throws IllegalConstruction, IllegalOperationException {
		// A Plus expression should not be the same as a Times expression
		assertNotSame(op, new Plus(new ArrayList<>()));
	}

	@Test
	void testEquals() throws IllegalConstruction, IllegalOperationException {
		// Two similar expressions, constructed separately (and using different constructors) should not be equal
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		Times e = new Times(p, Notation.INFIX);
		assertEquals(op, e);
	}

	@Test
	void testNull() {
		assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
	}

	@Test
	void testHashCode() throws IllegalConstruction, IllegalOperationException {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		Times e = new Times(p, Notation.INFIX);
		assertEquals(e.hashCode(), op.hashCode());
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalOperationException.class, () -> op = new Times(params));
	}

}
