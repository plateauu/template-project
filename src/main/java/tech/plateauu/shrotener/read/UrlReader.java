package tech.plateauu.shrotener.read;

import com.google.common.collect.Sets;
import org.springframework.stereotype.Service;
import tech.plateauu.shrotener.model.Url;
import tech.plateauu.shrotener.utils.MockImplementation;

import java.time.LocalDateTime;
import java.util.Set;

/**
 * Reader URL object component. Mock implementation
 */
@Service
@MockImplementation
class UrlReader {

    private final LocalDateTime NOW = LocalDateTime.now();

    Set<Url> findAll() {
        Set<Url> urlSet = Sets.newHashSet();
        urlSet.add(new Url(-1L, "http://eeee.jjjee.go", "http://mega.long.address.uri.some.in.the.world/dddd/", NOW, NOW));
        urlSet.add(new Url(-2L, "http://eeee.jjjee.go", "http://mega.long.address.uri.some.in.the.world/dddd/", NOW, NOW));
        urlSet.add(new Url(-3L, "http://eeee.jjjee.go", "http://mega.long.address.uri.some.in.the.world/dddd/", NOW, NOW));
        urlSet.add(new Url(-4L, "http://eeee.jjjee.go", "http://mega.long.address.uri.some.in.the.world/dddd/", NOW, NOW));
        urlSet.add(new Url(-5L, "http://eeee.jjjee.go", "http://mega.long.address.uri.some.in.the.world/dddd/", NOW, NOW));
        urlSet.add(new Url(-6L, "http://eeee.jjjee.go", "http://mega.long.address.uri.some.in.the.world/dddd/", NOW, NOW));
        return urlSet;
    }
}
