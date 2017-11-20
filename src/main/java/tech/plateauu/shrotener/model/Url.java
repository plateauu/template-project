package tech.plateauu.shrotener.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import tech.plateauu.shrotener.utils.LocalDateTimeDeserializer;
import tech.plateauu.shrotener.utils.LocalDateTimeSerializer;

import java.time.LocalDateTime;

/**
 * Model entity
 */
@Data
public class Url {

    private final long id;
    private final String shortUrl;
    private final String longUrl;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private final LocalDateTime creationDate;

    @JsonSerialize(using = LocalDateTimeSerializer.class)
    @JsonDeserialize(using = LocalDateTimeDeserializer.class)
    private final LocalDateTime modificationDate;

}
