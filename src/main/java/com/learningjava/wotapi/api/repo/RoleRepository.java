package com.learningjava.wotapi.api.repo;

import com.learningjava.wotapi.api.model.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Long> {
}