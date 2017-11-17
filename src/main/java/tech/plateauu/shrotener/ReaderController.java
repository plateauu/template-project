package tech.plateauu.shrotener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RequestMapping("/find")
@RestController
class ReaderController {

    private final UrlReader reader;

    @Autowired
    ReaderController(UrlReader reader) {
        this.reader = reader;
    }

    @GetMapping("/all")
    Set<Url> shortUrl() {
        return reader.findAll();
    }

}
