package tech.plateauu.shortener.model;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;

@Inheritance
@Data
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@MappedSuperclass
class BaseEntity {

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    Long id;

}
