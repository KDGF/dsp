package com.mw.mw.dao;

import com.mw.mw.domain.H5Plan;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface H5PlanDao {

    List<H5Plan> findH5PalnListById(Integer id);
}
