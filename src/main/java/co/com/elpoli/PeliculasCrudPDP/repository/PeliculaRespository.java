package co.com.elpoli.PeliculasCrudPDP.repository;

import co.com.elpoli.PeliculasCrudPDP.models.Pelicula;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;


@Repository
public interface PeliculaRespository extends CrudRepository<Pelicula, Integer> {

}
