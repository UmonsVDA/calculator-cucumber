package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestMinus {

	private final int value1 = 8;
	private final int value2 = 6;
	private Minus op;
	private List<Expression> params;

	@BeforeEach
	void setUp() throws IllegalConstruction {
		  params = Arrays.asList(new MyInteger(value1),new MyInteger(value2));
		  try { op = new Minus(params); }
		  catch(IllegalOperationException e) { fail(); }
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create an expression without null parameter list
		assertThrows(IllegalOperationException.class, () -> op = new Minus(null));
	}

	@SuppressWarnings("AssertBetweenInconvertibleTypes")
	@Test
	void testConstructor2() throws IllegalConstruction, IllegalOperationException {
		// A Times expression should not be the same as a Minus expression
		assertNotSame(op, new Times(new ArrayList<>()));
	}

	@Test
	void testEquals() throws IllegalConstruction {
		// Two similar expressions, constructed separately (and using different constructors) should not be equal
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Minus e = new Minus(p, Notation.INFIX);
			assertEquals(op, e);
		}
		catch(IllegalOperationException e) { fail(); }
	}

	@SuppressWarnings("ConstantConditions")
	@Test
	void testNull() {
		assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
	}

	@Test
	void testHashCode() throws IllegalConstruction {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		List<Expression> p = Arrays.asList(new MyInteger(value1), new MyInteger(value2));
		try {
			Minus e = new Minus(p, Notation.INFIX);
			assertEquals(e.hashCode(), op.hashCode());
		}
		catch(IllegalOperationException e) { fail(); }
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalOperationException.class, () -> op = new Minus(params));
	}

}
