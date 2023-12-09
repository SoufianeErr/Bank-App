package bank.app.bankapp.entities;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("RET")
public class Retrait extends Operation{
}
