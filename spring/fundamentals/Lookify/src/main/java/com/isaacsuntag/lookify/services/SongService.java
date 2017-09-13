package com.isaacsuntag.lookify.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.isaacsuntag.lookify.models.Song;
import com.isaacsuntag.lookify.repositories.SongRepository;

@Service
public class SongService {
	private SongRepository songRepository;
	public SongService(SongRepository songRepository) {
		this.songRepository = songRepository;
	}
	public void addSong(Song song) {
		songRepository.save(song);
	}
	public List<Song> getAllSongs() {
		return (List<Song>) songRepository.findAll();
	}
	public Song getSong(Long id) {
		return songRepository.findOne(id);
	}
	public void deleteSong(Long id) {
		songRepository.delete(id);
	}
	public List<Song> getSearchSongs(String artist){
		return songRepository.findByArtist(artist);
	}
	public List<Song> getTopSongs(){
		return songRepository.findTop10ByOrderByRatingDesc();
	}
}