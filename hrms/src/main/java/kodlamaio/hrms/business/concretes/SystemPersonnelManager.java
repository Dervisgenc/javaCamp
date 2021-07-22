package kodlamaio.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kodlamaio.hrms.business.abstracts.SystemPersonnelService;
import kodlamaio.hrms.core.utilities.results.DataResult;
import kodlamaio.hrms.core.utilities.results.Result;
import kodlamaio.hrms.core.utilities.results.SuccessDataResult;
import kodlamaio.hrms.core.utilities.results.SuccessResult;
import kodlamaio.hrms.dataAccess.abstracts.SystemPersonnelDao;
import kodlamaio.hrms.entities.concretes.SystemPersonnel;
@Service
public class SystemPersonnelManager implements SystemPersonnelService {
	private SystemPersonnelDao systemPersonnelDao;
	@Autowired
	public SystemPersonnelManager(SystemPersonnelDao systemPersonnelDao) {
		super();
		this.systemPersonnelDao = systemPersonnelDao;
	}

	@Override
	public DataResult<List<SystemPersonnel>> getAll() {
		return new SuccessDataResult<List<SystemPersonnel>>(this.systemPersonnelDao.findAll(),"Sistem çalışanları listelendi");
	}

	@Override
	public Result add(SystemPersonnel systemEmployee) {
		this.systemPersonnelDao.save(systemEmployee);
		return new SuccessResult("Çalışan sisteme kaydedildi");
	}

}
