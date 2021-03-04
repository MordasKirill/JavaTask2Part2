package net.epam.study.service.impl;

import net.epam.study.dao.ApplianceDAO;
import net.epam.study.dao.DAOFactory;
import net.epam.study.dao.impl.ApplianceDAOImpl;
import net.epam.study.entity.Appliance;
import net.epam.study.entity.criteria.Criteria;
import net.epam.study.service.ApplianceService;
import net.epam.study.service.validation.Validator;

import java.io.IOException;

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public Appliance find(Criteria criteria) throws IOException {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		ApplianceDAOImpl.fileReader();
		Appliance appliance = applianceDAO.find(criteria);

		// you may add your own code here
		
		return appliance;
	}

}

//you may add your own new classes
