package bank.app.bankapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type", discriminatorType = DiscriminatorType.STRING,length = 3)
@Data @NoArgsConstructor @AllArgsConstructor
public class Operation {

@Id
private Long numOperation;
private Date dateOperation;
private double montant;

@ManyToOne
@JoinColumn(name = "num_compte")
private Compte compte;
}
