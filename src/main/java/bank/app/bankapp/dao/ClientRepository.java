package bank.app.bankapp.dao;

import bank.app.bankapp.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface ClientRepository extends JpaRepository<Client, Long> {

   @Transactional
   @Query("SELECT c FROM Client c where c.name  like %:x% ")
   public List<Client> getClientsHasName(@Param("x") String name);

}
