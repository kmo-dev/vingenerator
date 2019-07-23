package de.klemensmorbe.vingenerator;

import org.junit.jupiter.api.Test;

import static org.hamcrest.Matchers.matchesPattern;
import static org.hamcrest.junit.MatcherAssert.assertThat;

class VinGeneratorTest {

	private static final String LEVEL_1_VIN_PATTERN = "[A-Z0-9]{17}";
	private static final String LEVEL_2_VIN_PATTERN = "[A-HJ-NPR-Z0-9]{17}";
	private static final String LEVEL_3_VIN_PATTERN = "[A-HJ-NPR-Z0-9]{9}[0-9]{8}";

	@Test
	void whenRandomVinThenReturnLevelOneVin() {
		final var result = VinGenerator.randomVin();

		assertThat(result, matchesPattern(LEVEL_1_VIN_PATTERN));
	}

	@Test
	void whenRandomVinGivenLevenOneThenReturnLevelOneVin() {
		final var result = VinGenerator.randomVin(VinLevel.ONE);

		assertThat(result, matchesPattern(LEVEL_1_VIN_PATTERN));
	}

	@Test
	void whenRandomVinGivenLevenTwoThenReturnLevelTwoVin() {
		final var result = VinGenerator.randomVin(VinLevel.TWO);

		assertThat(result, matchesPattern(LEVEL_2_VIN_PATTERN));
	}

	@Test
	void whenRandomVinGivenLevenThreeThenReturnLevelThreeVin() {
		final var result = VinGenerator.randomVin(VinLevel.THREE);

		assertThat(result, matchesPattern(LEVEL_3_VIN_PATTERN));
	}


}