package bank.app.bankapp.service;

import bank.app.bankapp.dao.ClientRepository;
import bank.app.bankapp.entities.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientService implements IClientService{

@Autowired
private ClientRepository clientRepository;

public boolean addClient(Client client) {
   if (!clientRepository.findById(client.getCode()).isPresent()) {
      clientRepository.save(client);
      return true;
   }
   return false;
}

@Override
public List<Client> getAllClients() {
      return clientRepository.findAll();
}
@Override
public List<Client> getClientsByName(String nom) {
      return clientRepository.getClientsHasName(nom);
}
}
