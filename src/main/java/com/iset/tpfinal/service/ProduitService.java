package com.iset.tpfinal.service;

import com.iset.tpfinal.entities.Produit;
import com.iset.tpfinal.entities.Produit;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProduitService {
    Produit saveProduit(Produit p);
    Produit updateProduit(Produit p);
    void deleteProduit(Produit p);
    void deleteProduitById(Long id);
    Produit getProduit(Long id);
    List<Produit> getAllProduits();

    Page<Produit> getAllProduitsParPage(int page, int size);

}

