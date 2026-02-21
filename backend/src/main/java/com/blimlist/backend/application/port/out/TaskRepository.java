package com.blimlist.backend.application.port.out;

import com.blimlist.backend.domain.entity.Task;
import java.util.List;
import java.util.Optional;

public interface TaskRepository {

    Task save(Task task);
    Optional<Task> findById(Long id);
    List<Task> findAll();
    void deleteById(Long id);

}
