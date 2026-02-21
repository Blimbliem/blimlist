package com.blimlist.backend.adapter.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TaskJpaRepository extends JpaRepository<TaskJpaEntity, Long>{

}
