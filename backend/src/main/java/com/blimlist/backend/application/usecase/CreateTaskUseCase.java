package com.blimlist.backend.application.usecase;

import com.blimlist.backend.application.port.out.TaskRepository;
import com.blimlist.backend.domain.entity.Task;
import org.springframework.stereotype.Service;

@Service
public class CreateTaskUseCase {
 
    // Baseado na arquitetura hexagonal, o use case depende de uma interface de repositório, e não de uma implementação concreta. Isso permite que a lógica de negócio seja independente da camada de persistência, facilitando testes e manutenção.
    private final TaskRepository taskRepository;

    // Injeção de dependência via construtor 
    public CreateTaskUseCase(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public Task execute(String title, String description){

        // Validação simples de entrada - titulo não pode ser nulo ou vazio
        if(title == null || title.trim().isEmpty()){
            throw new IllegalArgumentException("O titulo da tarefa é obrigatório");
        }

        //Criação da entidade do dominio - estamos criando uma task com id null, pois o id será gerado pelo DB.

        Task newTask = new Task(null, title, description, false);

        return taskRepository.save(newTask);
    }
    
}
