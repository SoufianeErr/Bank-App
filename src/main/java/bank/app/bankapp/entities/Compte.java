package bank.app.bankapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.util.Lazy;

import java.util.*;

@Entity
@Inheritance(strategy = InheritanceType.TABLE_PER_CLASS)
@Data @NoArgsConstructor @AllArgsConstructor
public abstract class Compte {

@Id
private Long numCompte;
private Date dateCreation;
private double solde;

@ManyToOne
@JoinColumn(name = "code_client")
private Client client;

@OneToMany(mappedBy = "compte", fetch = FetchType.LAZY)
private List<Operation> operations;

}
