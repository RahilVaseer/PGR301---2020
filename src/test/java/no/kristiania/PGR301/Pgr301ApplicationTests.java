package no.kristiania.PGR301;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
class Pgr301ApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	void shouldFailTest(){

		assertEquals(1, 2);
	}

	@Test
	void shouldPas(){
		assertEquals(1, 1);
	}

}
