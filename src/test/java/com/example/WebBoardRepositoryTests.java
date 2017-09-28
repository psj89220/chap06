package com.example;

import javax.inject.Inject;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Commit;
import org.springframework.test.context.junit4.SpringRunner;

import com.example.persistence.WebBoardRepository;

@RunWith(SpringRunner.class)
@SpringBootTest
@Commit
public class WebBoardRepositoryTests {

	@Inject
	WebBoardRepository repo;

	@Test
	public void test() {
		System.out.println(repo);
	}

}
