package com.stackroute.musicservice.Controller;

import com.stackroute.musicservice.Service.MusicService;
import com.stackroute.musicservice.model.Music;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
public class MusicController
{
    @Autowired
    private MusicService service;
    @GetMapping("/songs")
    public List<Music> getSongs(){
        return service.getAllSongs();
    }

    @PostMapping("/song")
    public ResponseEntity<Music> saveSong(@RequestBody Music music){
        return new ResponseEntity<Music>(service.saveSong(music), HttpStatus.CREATED);
    }


    @DeleteMapping("/song/{id}")
    public void deleteSong(@PathVariable int id){
        service.deleteSong(id);
    }


    @PutMapping("song")
    public ResponseEntity<Music> updateSong(@RequestBody Music music){
        return  new ResponseEntity<Music>(service.updateSong(music),HttpStatus.OK);
    }



}
