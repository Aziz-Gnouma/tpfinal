package com.iset.tpfinal.Repository;

import com.iset.tpfinal.entities.Categorie;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CategorieRepository  extends JpaRepository<Categorie, Long> {

}
