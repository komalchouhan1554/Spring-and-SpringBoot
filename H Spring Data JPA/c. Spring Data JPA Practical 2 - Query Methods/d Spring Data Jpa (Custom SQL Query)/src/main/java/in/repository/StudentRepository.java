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
	@Query(value = "SELECT * FROM std_query_details WHERE std_email = :stdEmail", nativeQuery = true)
	public Student getByEmail(@Param("stdEmail") String emain);
	
	@Query(value = "SELECT * FROM std_query_details WHERE std_marks > :stdMarks", nativeQuery = true)
	public List<Student> OtherNameByMarksGreaterThan(@Param("stdMarks") float marks);
}
