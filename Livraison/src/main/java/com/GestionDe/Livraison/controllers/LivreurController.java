package com.GestionDe.Livraison.controllers;

import com.GestionDe.Livraison.models.Livreur;
import com.GestionDe.Livraison.services.LivreurService;
import com.GestionDe.Livraison.services.LivreurServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivreurController {
    @Autowired
    private LivreurServiceImpl livreurServiceImp;
    @PostMapping("/ajouter")
    public String ajouterLivreur( @RequestBody Livreur l){
        livreurServiceImp.ajouterLivreur(l);
        return "le livreur a etait bien ajouter ";

    }
    @GetMapping("/livreurs")
    public List<Livreur> afficherLivreurs(){
        List list= livreurServiceImp.afficherLivreurs();
        return list;
    }
    @GetMapping("livreurs/{id}")
      public Livreur afficherLivreur( @PathVariable Long id){
        return livreurServiceImp.afficheLivreur(id);
    }
    @PutMapping("/livreur/{id}")
    public String modifierLivreur(  @PathVariable  Long id, @RequestBody Livreur l) {
        livreurServiceImp.modifierLivreur(l, id);
        return "le livreur est bien modifié";

    }
    @DeleteMapping("/delete/{id}")
        public String supprimerLivreur (@PathVariable Long id){
        livreurServiceImp.supprimerLivreur(id);
        return "livreur a était  bien supprimer";

        }

}
