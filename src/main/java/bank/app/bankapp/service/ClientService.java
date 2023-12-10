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

   List<Client> clients = clientRepository.findAll();
   if (!clients.contains(client)) { //We don't ge true if the client existe
      clientRepository.save(client);
      //clients.add(client);
      return true;
   }
    return false;
}

@Override
public List<Client> getAllClients() {
      return clientRepository.findAll();
}
}
