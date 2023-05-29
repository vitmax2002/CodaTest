package coda.controller;

import coda.model.Client;
import coda.service.ClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

   private ClientService clientService;

   public ClientController(ClientService clientService)
   {
       this.clientService=clientService;
   }

    @GetMapping("/clients")
    public List<Client> showClients()
   {
       return clientService.showClients();
   }


   @PostMapping("/client/save")
    public Client createClient(@RequestBody Client client)
   {
       return clientService.createClient(client);
   }
}
