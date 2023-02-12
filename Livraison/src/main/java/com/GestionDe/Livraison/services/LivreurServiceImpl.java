package com.GestionDe.Livraison.services;

import com.GestionDe.Livraison.models.Livreur;
import com.GestionDe.Livraison.repository.LivraisonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LivreurServiceImpl {
    @Autowired
    private LivraisonRepository livraisonRepository;

    public String ajouterLivreur(Livreur l){
        livraisonRepository.save(l);
        return "livreur bien ajouté";

    }
    public List <Livreur> afficherLivreurs (){
        return livraisonRepository.findAll();

    }
    public Livreur afficheLivreur(Long id){
        return livraisonRepository.findById(id).get();
    }
    public Livreur modifierLivreur(Livreur l,Long id){
           Livreur l1= livraisonRepository.findById(id).get();
          l1.setNom(l.getNom());
          l1.setPreNom(l.getPreNom());
          l1.setEmail(l.getEmail());
          l1.setVille(l.getVille());
          l1.setMotDePasse(l.getMotDePasse());
          l1.setTel(l.getTel());
          return livraisonRepository.save(l);
        }
        public String supprimerLivreur(Long id){
            livraisonRepository.deleteById(id);
            return " le livreur a était bien supprimer ";


        }
}
