package tech.plateauu.shortener.write;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.plateauu.shortener.model.Url;
import tech.plateauu.shortener.model.UrlRepository;
import tech.plateauu.shortener.utils.MockImplementation;

/**
 * Controller responsible for add new Urls
 */
@RestController
class WriterController {

    private final UrlRepository repository;

    @Autowired
    public WriterController(UrlRepository repository) {
        this.repository = repository;
    }

    @PostMapping(path = "/add", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    Url addUrl(@RequestBody Url url) {
        return repository.save(url);
    }

}
