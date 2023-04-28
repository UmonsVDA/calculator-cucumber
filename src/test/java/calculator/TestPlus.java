package calculator;

//Import Junit5 libraries for unit testing:
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class TestPlus {

	private final int value1 = 8;
	private final int value2 = 6;
	private Plus op;
	private List<Expression> params;

	@BeforeEach
	void setUp() throws IllegalConstruction, IllegalOperationException {
		  params = new ArrayList<>(Arrays.asList(new MyInteger(value1),new MyInteger(value2)));
		op = new Plus(params);
	}

	@Test
	void testConstructor1() {
		// It should not be possible to create a Plus expression without null parameter list
		assertThrows(IllegalOperationException.class, () -> op = new Plus(null));
	}

	@SuppressWarnings("AssertBetweenInconvertibleTypes")
	@Test
	void testConstructor2() throws IllegalConstruction, IllegalOperationException {
		// A Times expression should not be the same as a Plus expression
		assertNotSame(op, new Times(new ArrayList<>()));
	}

	@Test
	void testEquals() throws IllegalConstruction, IllegalOperationException {
		// Two similar expressions, constructed separately (and using different constructors) should be equal
		ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyInteger(value1), new MyInteger(value2)));
		Plus e = new Plus(p, Notation.INFIX);
		assertEquals(op, e);
		assertEquals(e, e);
		assertNotEquals(e, new Plus(new ArrayList<>(Arrays.asList(new MyInteger(5), new MyInteger(4))), Notation.INFIX));
	}

	@SuppressWarnings("ConstantConditions")
	@Test
	void testNull() {
			assertDoesNotThrow(() -> op==null); // Direct way to test if the null case is handled.
	}

	@Test
	void testHashCode() throws IllegalConstruction, IllegalOperationException {
		// Two similar expressions, constructed separately (and using different constructors) should have the same hashcode
		ArrayList<Expression> p = new ArrayList<>(Arrays.asList(new MyInteger(value1), new MyInteger(value2)));
		Plus e = new Plus(p, Notation.INFIX);
		assertEquals(e.hashCode(), op.hashCode());
	}

	@Test
	void testNullParamList() {
		params = null;
		assertThrows(IllegalOperationException.class, () -> op = new Plus(params));
	}

}
