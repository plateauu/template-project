package tech.plateauu.shortener.model;


import lombok.*;

import javax.persistence.Entity;

/**
 * Model entity
 */
@Entity
@Data
@EqualsAndHashCode(callSuper = true)
@ToString(callSuper = true)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class Url extends BaseEntity {

    private String shortUrl;

    private String longUrl;

}
