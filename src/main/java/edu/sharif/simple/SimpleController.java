package edu.sharif.simple;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("")
public class SimpleController {

    private final SimpleRepository repository;

    @PostMapping("/")
    public String create(@RequestBody String message) {
        repository.save(new SimpleEntity(message));
        return message;
    }

    @GetMapping("/{id}")
    public SimpleEntity read(@PathVariable Long id) {
        return repository.findById(id).orElse(new SimpleEntity(0L, "Entity Not Found!"));
    }

    @PutMapping("/{id}")
    public String update(@PathVariable Long id, @RequestBody String message) {
        repository.findById(id).ifPresent(simpleEntity -> {
            simpleEntity.setMessage(message);
            repository.save(simpleEntity);
        });
        return message;
    }

    @GetMapping("/{id}")
    public String delete(@PathVariable Long id) {
        repository.deleteById(id);
        return "Done";
    }
}
