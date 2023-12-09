package bank.app.bankapp.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Data
@Entity
public class CompteCourant extends Compte{
private double decouvert;
}
