package tech.plateauu.shortener

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.context.ApplicationContext
import spock.lang.Specification
import tech.plateauu.shrotener.ShortenerApplication

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = [ShortenerApplication.class])
class ShortenerApplicationTest extends Specification{

    @Autowired
    ApplicationContext applicationContext

    def 'application context starts'() {
        expect:
        println applicationContext.displayName
    }
}
