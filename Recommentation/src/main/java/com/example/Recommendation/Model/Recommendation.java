package com.example.Recommendation.Model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Collection;

@Document(collection = "Recommentation_Record")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Recommendation
{
    @Id
    private int id;
    private String title;
    private String artist;
    private int releaseyear;
    private String genre;

}
