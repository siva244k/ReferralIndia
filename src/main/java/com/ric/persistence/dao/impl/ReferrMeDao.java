package com.ric.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.ric.persistence.dao.IReferrMeDao;
import com.ric.persistence.dao.common.RicAbstractDAO;
import com.ric.persistence.model.ReferrMe;

@Repository
public class ReferrMeDao extends RicAbstractDAO<ReferrMe> implements IReferrMeDao {

	public ReferrMeDao() {
        super();
        setClazz(ReferrMe.class);
    }
}
