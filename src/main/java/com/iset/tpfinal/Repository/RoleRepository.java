package com.iset.tpfinal.Repository;

import com.iset.tpfinal.entities.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RoleRepository extends JpaRepository<Role, Integer> {
	@Query("SELECT r FROM Role r WHERE r.name = ?1")
	public Role findByName(String name);
}
