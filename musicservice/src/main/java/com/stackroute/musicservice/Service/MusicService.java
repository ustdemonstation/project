package com.stackroute.musicservice.Service;

import com.stackroute.musicservice.model.Music;

import java.util.List;

public interface MusicService
{
    Music saveSong(Music music);
    List<Music> getAllSongs();
    void deleteSong(int id);
    public Music updateSong(Music music);
}
