import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

import org.junit.jupiter.api.Test;

class MainTest {

	@Test
	void test() {
		String data = """
				7
				0 0
				1 1
				2 0
				3 1
				4 2
				6 6
				3 4
				""";
		System.setIn(new ByteArrayInputStream(data.getBytes()));
		Main.main(null);
	}

}
