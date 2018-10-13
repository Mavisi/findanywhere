package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("Seguranca")
@Table(name="segurancas")
public class Seguranca extends Usuario {

}
