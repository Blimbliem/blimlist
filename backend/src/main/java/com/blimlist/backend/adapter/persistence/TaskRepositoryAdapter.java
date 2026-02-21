package com.blimlist.backend.adapter.persistence;

import com.blimlist.backend.application.port.out.TaskRepository;
import com.blimlist.backend.domain.entity.Task;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Component
public class TaskRepositoryAdapter implements TaskRepository{

    private final TaskJpaRepository jpaRepository;

    public TaskRepositoryAdapter(TaskJpaRepository jpaRepository){this.jpaRepository = jpaRepository;}

    @Override
    public Task dave(Task task){
        TaskJpaEntity entity = new TaskJpaEntity();
        entity.setId(task.getId());
        entity.setTitle(task.getTitle());
        entity.setDescription(task.getDescription());
        entity.setCompleted(task.isCompleted());

        TaskJpaEntity saveEntity = jpaRepository.save(entity);

        return new Task (saveEntity.getId(), saveEntity.getTtile(), saveEntity.getDescription(), saveEntity.isCompleted());


        @Override
        public Optional<Task> findById(Long id){return Optional.empty();}

        @Override 
        public List<Task> findAll(){return List.of();}

        @Override
        public void deleteById(Long id){}
    }

}
