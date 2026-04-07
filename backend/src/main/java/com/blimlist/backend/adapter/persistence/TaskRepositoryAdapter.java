package com.blimlist.backend.adapter.persistence;

import com.blimlist.backend.application.port.out.TaskRepository;
import com.blimlist.backend.domain.entity.Task;
import org.springframework.stereotype.Component;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Component
public class TaskRepositoryAdapter implements TaskRepository {

    private final TaskJpaRepository jpaRepository;

    public TaskRepositoryAdapter(TaskJpaRepository jpaRepository) {
        this.jpaRepository = jpaRepository;
    }

    @Override
    public Task save(Task task) {
        TaskJpaEntity entity = new TaskJpaEntity();
        entity.setId(task.getId());
        entity.setTitle(task.getTitle());
        entity.setDescription(task.getDescription());
        entity.setCompleted(task.isCompleted());

        TaskJpaEntity savedEntity = jpaRepository.save(entity);

        return new Task(
            savedEntity.getId(), 
            savedEntity.getTitle(), 
            savedEntity.getDescription(), 
            savedEntity.isCompleted()
        );
    }

    // Métodos obrigatórios pelo contrato da interface:
    @Override
    public Optional<Task> findById(Long id) {
        return jpaRepository.findById(id)
                .map(entity -> new Task(entity.getId(), entity.getTitle(), entity.getDescription(), entity.isCompleted()));
    }

    @Override
    public List<Task> findAll() {
        return jpaRepository.findAll().stream()
                .map(entity -> new Task(entity.getId(), entity.getTitle(), entity.getDescription(), entity.isCompleted()))
                .collect(Collectors.toList());
    }

    @Override
    public void deleteById(Long id) {
        jpaRepository.deleteById(id);
    }
}