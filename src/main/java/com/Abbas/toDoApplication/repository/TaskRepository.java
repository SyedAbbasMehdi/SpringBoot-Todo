package com.Abbas.toDoApplication.repository;

import com.Abbas.toDoApplication.models.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {
}
