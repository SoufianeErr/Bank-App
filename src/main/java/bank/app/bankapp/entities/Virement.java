package bank.app.bankapp.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("VIR")
public class Virement extends Operation{
}
