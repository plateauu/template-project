package tech.plateauu.shortener.write;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import tech.plateauu.shortener.model.Url;
import tech.plateauu.shortener.utils.MockImplementation;

/**
 * Controller responsible for add new Urls
 */
@RestController
@MockImplementation
class WriterController {

    @PostMapping(path = "/add", consumes = "application/json")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    Url addUrl(@RequestBody Url url) {
        return url;
    }

}
