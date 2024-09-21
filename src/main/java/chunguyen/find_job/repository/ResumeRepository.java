package chunguyen.find_job.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import chunguyen.find_job.domain.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long>,
        JpaSpecificationExecutor<Resume> {

}
