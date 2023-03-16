package com.iset.tpfinal.Repository;

import com.iset.tpfinal.entities.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduitRepository extends JpaRepository<Produit, Long> {
}