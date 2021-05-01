package com.example.Favourites.Service;


import com.example.Favourites.Model.Favourites;

import java.util.List;

public interface FavouriteService
{
    Favourites saveSong(Favourites favourites);
    void deleteSong(int id);
    List<Favourites> getAllSongs();
}
