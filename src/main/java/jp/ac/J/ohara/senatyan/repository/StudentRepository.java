package jp.ac.J.ohara.senatyan.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import jp.ac.J.ohara.senatyan.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{

}
