package bank.app.bankapp.web;

import bank.app.bankapp.dao.ClientRepository;
import bank.app.bankapp.entities.*;
import bank.app.bankapp.service.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.*;

@RestController
@RequestMapping("/client")
public class ClientController {

@Autowired
private IClientService clientService;

@RequestMapping(method = RequestMethod.GET, value = "/all")
public ResponseEntity<List<Client>> getAllClients() {
   return ResponseEntity.ok(clientService.getAllClients());
}

@RequestMapping(method = RequestMethod.GET, value = "/ClientsByName")
public ResponseEntity<List<Client>> getClientsByName(@RequestParam(defaultValue = "") String name) {
   return ResponseEntity.ok(clientService.getClientsByName(name));
}

@RequestMapping(method = RequestMethod.GET, value = "/ClientsByName/{name}")
public ResponseEntity<List<Client>> getClientsByName2(@PathVariable String name) {
   return ResponseEntity.ok(clientService.getClientsByName(name));
}

@RequestMapping(method = RequestMethod.POST, value = "/addClient")
public ResponseEntity<String> ajouterClient (@RequestBody Client client) {
   if (clientService.addClient(client))
      return ResponseEntity.status(HttpStatus.OK).body("Added");
   return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Already existe in the list");
}
}
