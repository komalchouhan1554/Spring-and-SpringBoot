package in.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	public Student findByEmail(String emain);
}
