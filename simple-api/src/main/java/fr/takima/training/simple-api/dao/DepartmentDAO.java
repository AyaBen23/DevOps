package fr.takima.training.simple-api.dao;

import fr.takima.training.simple-api.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentDAO extends JpaRepository<Department, Long> {
    Department findDepartmentByName(String name);
}
