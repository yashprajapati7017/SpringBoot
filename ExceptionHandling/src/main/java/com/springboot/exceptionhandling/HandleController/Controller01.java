package com.springboot.exceptionhandling.HandleController;

import com.springboot.exceptionhandling.Entityes.Employes;
import com.springboot.exceptionhandling.Service.Service1;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller01 {

    private final Service1 service1;

    public Controller01(Service1 service1) {
        this.service1 = service1;
    }

    @GetMapping("/employes")
    public Iterable<Employes> findAllEmployes() {
        return service1.getEmployess();
    }

    @GetMapping("/employes/{id}")
    public Employes findEmployesById(@PathVariable int id) {
        return service1.getById(id);
    }

    @PostMapping("/employes")
    public Employes saveEmployes(@RequestBody Employes employes) {
        return service1.saveEmployes(employes);
    }

    @DeleteMapping("/employes/{id}")
    public void deleteEmployes(@PathVariable int id) {
        service1.deleteEmployes(id);
    }

    @PutMapping("/employes/{id}")
    public Employes updateEmployes(
            @RequestBody Employes employes,
            @PathVariable int id) {
        return service1.updateEmployes(employes, id);
    }
}
