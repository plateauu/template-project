package tech.plateauu.shortener.read;

import org.springframework.stereotype.Service;
import tech.plateauu.shortener.model.Url;
import tech.plateauu.shortener.model.UrlRepository;

import java.util.List;

/**
 * Reader URL object component. Mock implementation
 */
@Service
class UrlReader {

    private final UrlRepository repository;

    UrlReader(UrlRepository repository) {
        this.repository = repository;
    }

    List<Url> findAll() {
        return repository.findAll();
    }
}
