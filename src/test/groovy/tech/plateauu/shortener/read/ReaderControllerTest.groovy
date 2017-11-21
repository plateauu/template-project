package tech.plateauu.shortener.read

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.test.web.servlet.setup.MockMvcBuilders
import org.springframework.web.context.WebApplicationContext
import tech.plateauu.shortener.SpringControllerTest

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status

class ReaderControllerTest extends SpringControllerTest {

    @Autowired
    WebApplicationContext context

    def setup() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build()
    }

    def "should return ok status"() {
        expect:
        mockMvc.perform(get("/find/all"))
                .andExpect(status().isOk())
    }

}
