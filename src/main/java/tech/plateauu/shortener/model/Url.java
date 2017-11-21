package tech.plateauu.shortener.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import tech.plateauu.shortener.utils.LocalDateTimeDeserializer;
import tech.plateauu.shortener.utils.LocalDateTimeSerializer;

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
