package com.abderazak.films.repos;
import org.springframework.data.jpa.repository.JpaRepository;

import com.abderazak.films.entities.Genre;
public interface GenreRepository extends JpaRepository<Genre, Long>{
	

}
