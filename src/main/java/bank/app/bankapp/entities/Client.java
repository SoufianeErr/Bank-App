package bank.app.bankapp.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.*;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class Client implements Serializable{

   @Id
   private Long code;
   private String name;
   @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
   private List<Compte> comptes;

   public Client(Long code, String name) {
      this.code = code;
      this.name = name;
   }
}
