package com.ric.persistence.dao.impl;

import org.springframework.stereotype.Repository;

import com.ric.persistence.dao.IReferralJobDao;
import com.ric.persistence.dao.common.RicAbstractDAO;
import com.ric.persistence.model.ReferralJob;

@Repository
public class ReferralJobDao extends RicAbstractDAO<ReferralJob> implements IReferralJobDao {

	public ReferralJobDao() {
        super();
        setClazz(ReferralJob.class);
    }
}
