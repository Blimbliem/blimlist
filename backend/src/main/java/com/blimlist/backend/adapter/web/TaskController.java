package com.blimlist.backend.adapter.web;

import com.blimlist.backend.application.usecase.CreateTaskUseCase;
import com.blimlist.backend.domain.entity.Task;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController // Define que a classe é uma API REST
@RequestMapping("/tasks") // endereço: http://localhost:8080/tasks

public class TaskController {
    private final CreateTaskUseCase createTaskUseCase;

    public TaskController(CreateTaskUseCase createTaskUseCase){
        this.createTaskUseCase = createTaskUseCase;

    }

    @PostMapping // mapeia o método HTTP POST - CRIAÇÃO
    @ResponseStatus(HttpStatus.CREATED) // Retorna o status 201 Created quando a tarefa for criada com sucesso
    public Task create(@RequestBody TaskRequest request) {
        return createTaskUseCase.execute(request.getTitle(),request.getDescription());
    }

    static class TaskRequest {
        private String title;
        private String description;

        public String getTitle(){return title;}
        public String getDescription(){return description;}

        public void setTitle(String title){this.title = title;}
        public void setDescription(String description){this.description = description;}
    }


}
