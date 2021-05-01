package com.example.Favourites.Service;

import com.example.Favourites.Model.Favourites;
import com.example.Favourites.Repository.FavouriteRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class FavouriteServiceImpl implements FavouriteService{
    @Autowired
    private FavouriteRepository repository;
    @Override
    public Favourites saveSong(Favourites favourites) {
        return repository.save(favourites);
    }

    @Override
    public void deleteSong(int id) {
        repository.deleteById(id);

    }

    @Override
    public List<Favourites> getAllSongs() {
        return repository.findAll();
    }
}
