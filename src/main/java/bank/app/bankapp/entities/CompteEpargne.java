package bank.app.bankapp.entities;

import jakarta.persistence.Entity;
import lombok.Data;

@Entity
@Data
public class CompteEpargne extends Compte{
private double taux;
}
