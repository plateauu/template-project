package tech.plateauu.shortener.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.MappedSuperclass;

@Inheritance
@Data
@NoArgsConstructor
@MappedSuperclass
class BaseEntity {

    @GeneratedValue
    @Id
    Long id;

}
