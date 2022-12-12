package co.com.elpoli.PeliculasCrudPDP.service;

import co.com.elpoli.PeliculasCrudPDP.models.Pelicula;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface PeliculaService {

    Iterable<Pelicula> buscarTodo();
    void guardar(Pelicula pelicula);
    Pelicula buscarId(Integer id);

    void editar(Pelicula pelicula);
    void eliminar(Integer id);
}
