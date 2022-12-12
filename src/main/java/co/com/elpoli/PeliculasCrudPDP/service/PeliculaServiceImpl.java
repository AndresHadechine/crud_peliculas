package co.com.elpoli.PeliculasCrudPDP.service;

import co.com.elpoli.PeliculasCrudPDP.models.Pelicula;
import co.com.elpoli.PeliculasCrudPDP.repository.PeliculaRespository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PeliculaServiceImpl implements PeliculaService {
    private final PeliculaRespository peliculaRespository;

    @Override
    public Iterable<Pelicula> buscarTodo() {
        return peliculaRespository.findAll();
    }

    @Override
    public void guardar(Pelicula pelicula) {
        peliculaRespository.save(pelicula);
    }

    @Override
    public Pelicula buscarId(Integer id) {
        return peliculaRespository.findById(id).orElse(null);
    }

    @Override
    public void editar(Pelicula pelicula) {
        peliculaRespository.save(pelicula);
    }

    @Override
    public void eliminar(Integer id) {
        peliculaRespository.deleteById(id);
    }
}
