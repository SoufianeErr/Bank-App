package bank.app.bankapp.service;

import bank.app.bankapp.entities.Client;

import java.util.List;

public interface IClientService {
public boolean addClient(Client client);
public List<Client> getAllClients();
}
