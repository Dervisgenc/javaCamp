package kodlamaio.hrms.business.abstracts;

import java.util.List;

import org.springframework.stereotype.Service;

import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.entities.concretes.JobSeeker;
@Service
public interface JobSeekerService {
	DataResult<List<JobSeeker>> getAll();
	
	Result add(JobSeeker jobSeeker,String passwordRepeat);
	
	Result delete(JobSeeker jobSeeker) ;
	
	DataResult<JobSeeker> getJobSeekerByNationalId(String nationalId);
	
	DataResult<JobSeeker> getJobSeekerByEmail(String email);
	
	
}
