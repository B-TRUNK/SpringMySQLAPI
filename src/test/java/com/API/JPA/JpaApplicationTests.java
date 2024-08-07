package com.API.JPA;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
class JpaApplicationTests {

	@Autowired
	private PlayerRepository playerRepository;

	@Test
	void testSavePlayer() {

		Player player = new Player();

		player.setName("Salah");
		player.setId(1);
		player.setScore(3);
		playerRepository.save(player);

		Player savedPlayer = playerRepository.findById(1).get();
		assertNotNull(savedPlayer);

	}

}
