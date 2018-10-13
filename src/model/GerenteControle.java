package model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@DiscriminatorValue("GerenteControle")
@Table(name="gerentes_controle")
public class GerenteControle extends Usuario {

}
