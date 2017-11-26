package tech.plateauu.shortener.model;


import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import lombok.Data;
import lombok.EqualsAndHashCode;
import tech.plateauu.shortener.utils.LocalDateTimeDeserializer;
import tech.plateauu.shortener.utils.LocalDateTimeSerializer;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDateTime;

/**
 * Model entity
 */
@Entity
@Data
@EqualsAndHashCode
public class Url {

    @GeneratedValue
    @Id
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
