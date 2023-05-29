package coda.controller;

import coda.model.Publisher;
import coda.service.PublisherService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PublisherController {

    private PublisherService publisherService;

    public PublisherController(PublisherService publisherService) {
        this.publisherService = publisherService;
    }

    @GetMapping("/")
    public List<Publisher> getAll()
    {
        return publisherService.getAll();
    }

    @GetMapping("/{id}")
    public Publisher getById(@PathVariable("id") int id)
    {
        return publisherService.getById(id);
    }

    @PostMapping("/")
    public Publisher addPublisher(@RequestBody Publisher publisher)
    {
        return publisherService.createPublisher(publisher);
    }

    @PutMapping("/{id}")
    public Publisher updatePublisher(@PathVariable int id,@RequestParam String name)
    {
        return publisherService.updatePublisher(id,name);
    }

    @DeleteMapping ("/{id}")
    public String deletePublisher(@PathVariable("id") int id)
    {
         return publisherService.delete(id);
    }


}
