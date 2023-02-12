package com.GestionDe.Livraison.repository;

import com.GestionDe.Livraison.models.Livreur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LivraisonRepository extends JpaRepository<Livreur,Long> {
}
