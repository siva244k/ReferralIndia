package com.ric.persistence.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ric.persistence.dao.IReferrMeDao;
import com.ric.persistence.dao.common.IOperations;
import com.ric.persistence.model.ReferrMe;
import com.ric.persistence.service.IReferrMeService;
import com.ric.persistence.service.common.RicAbstractService;

@Service
public class ReferrMeService extends RicAbstractService<ReferrMe> implements IReferrMeService {

	@Autowired
    private IReferrMeDao dao;

    public ReferrMeService() {
        super();
    }

    @Override
    protected IOperations<ReferrMe> getDao() {
        return dao;
    }
    
    // API
}
