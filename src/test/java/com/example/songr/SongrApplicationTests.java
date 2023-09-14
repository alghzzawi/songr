package com.example.songr;

import com.example.songr.model.Album;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SongrApplicationTests {

	@Test
	void contextLoads() {
	}

	@Test
	public void ablumsTest(){
		Album newAlbum = new Album("Sad Life","Osaid",24,8,"image URL");

		Assertions.assertEquals("Sad Life",newAlbum.getTitle());
		Assertions.assertEquals("Osaid",newAlbum.getArtist());
		Assertions.assertEquals(24,newAlbum.getSongCount());
		Assertions.assertEquals(8,newAlbum.getLength());
		Assertions.assertEquals("image URL",newAlbum.getImageUrl());


	}

}
