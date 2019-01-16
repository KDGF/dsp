package com.mw.mw.service.impl;

import com.mw.mw.dao.H5PlanDao;
import com.mw.mw.domain.H5Plan;
import com.mw.mw.service.H5PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class H5PlanServiceImpl implements H5PlanService {

    @Autowired
    private H5PlanDao h5PlanDao;

    @Override
    public List<H5Plan> findH5PalnListById(Integer id) {
        return h5PlanDao.findH5PalnListById(id);
    }
}
