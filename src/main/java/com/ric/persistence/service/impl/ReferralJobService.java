package com.ric.persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ric.persistence.dao.IReferralJobDao;
import com.ric.persistence.dao.common.IOperations;
import com.ric.persistence.model.ReferralJob;
import com.ric.persistence.service.IReferralJobService;
import com.ric.persistence.service.common.RicAbstractService;

@Service
public class ReferralJobService extends RicAbstractService<ReferralJob> implements IReferralJobService {

	@Autowired
    private IReferralJobDao dao;

    public ReferralJobService() {
        super();
    }

    @Override
    protected IOperations<ReferralJob> getDao() {
        return dao;
    }
    
    // API
}
