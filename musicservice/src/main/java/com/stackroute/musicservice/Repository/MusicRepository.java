package com.stackroute.musicservice.Repository;

import com.stackroute.musicservice.model.Music;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MusicRepository extends MongoRepository<Music,Integer>
{


}
