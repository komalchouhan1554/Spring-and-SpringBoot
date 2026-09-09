package in.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import in.entity.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer>
{
	@Query("SELECT s FROM Student s WHERE s.email =:stdEmail")
	public Student getByEmail(@Param("stdEmail") String emain);
	
	@Query("SELECT s FROM Student s Where s.marks > :stdMarks")
	public List<Student> OtherNameByMarksGreaterThan(@Param("stdMarks") float marks);
}
