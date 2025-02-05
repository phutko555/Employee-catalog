package com.epam.rd.autotasks.springemployeecatalog.data;

import com.epam.rd.autotasks.springemployeecatalog.entity.EmployeeEntity;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, Long> {
    List<EmployeeEntity> findAllByManagerId(Long id, Pageable pageable);

    List<EmployeeEntity> findAllByDepartmentId(Long id, Pageable pageable);

    List<EmployeeEntity> findAllByDepartmentName(String name, Pageable pageable);
}