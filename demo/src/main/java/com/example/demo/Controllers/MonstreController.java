package com.example.demo.Controllers;


import com.example.demo.Models.Monstre;
import com.example.demo.Service.MonstreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.swing.plaf.PanelUI;
import java.util.List;
@CrossOrigin(originPatterns = "*")
@RestController
public class MonstreController {
    @Autowired
private MonstreService monstreService;

    @RequestMapping("/monstres")
    public List<Monstre> getMonstres(){

        return monstreService.getMonstre();
    }

    @RequestMapping("/chercher/{id}")
    public Monstre chercher(@PathVariable int id){
        return monstreService.chercher(id);
    }
    @RequestMapping("/delete/{id}")
    public void delete (@PathVariable int id){
        monstreService.delete(id);
    }

    @RequestMapping("/add")
    public void add (@RequestBody Monstre monstre){
        monstreService.add(monstre);
    }

    @RequestMapping(method = RequestMethod.PUT, value="update/{id}")
    public void update (@RequestBody Monstre monstre, @PathVariable int id){
        monstreService.update(monstre,id);
    }
}
