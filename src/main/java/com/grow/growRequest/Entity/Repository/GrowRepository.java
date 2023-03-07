package com.grow.growRequest.Entity.Repository;

import com.grow.growRequest.Entity.Grow;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GrowRepository extends JpaRepository<Grow,Long> {
}
