package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/repairs")
public class RepairController {

    private List<Repair> repairs = new ArrayList<>();

    public RepairController() {
        repairs.add(new Repair(1, "山田太郎", "エアコン", "受付"));
    }

    @GetMapping
    public List<Repair> getRepairs() {
        return repairs;
    }

    @PostMapping
    public Repair createRepair(@RequestBody Repair repair) {
        repairs.add(repair);
        return repair;
    }

    @PutMapping("/{id}")
    public Repair updateRepairStatus(@PathVariable int id, @RequestBody Repair request) {
        for (Repair repair : repairs) {
            if (repair.getId() == id) {
                repair.setStatus(request.getStatus());
                return repair;
            }
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public String deleteRepair(@PathVariable int id) {
        repairs.removeIf(repair -> repair.getId() == id);
        return "削除しました";
    }
}