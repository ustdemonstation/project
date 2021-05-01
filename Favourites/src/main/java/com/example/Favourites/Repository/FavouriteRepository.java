package com.example.Favourites.Repository;

import com.example.Favourites.Model.Favourites;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavouriteRepository extends MongoRepository<Favourites,Integer> {
}
