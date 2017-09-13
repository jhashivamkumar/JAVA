package com.isaacsuntag.lookify.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.isaacsuntag.lookify.models.Song;

public interface SongRepository extends CrudRepository<Song, Long> {
	List<Song> findByArtist(String artist);
	
	List<Song> findTop10ByOrderByRatingDesc();
}
