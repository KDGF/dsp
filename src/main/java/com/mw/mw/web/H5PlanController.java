package com.mw.mw.web;

import com.mw.mw.domain.H5Plan;
import com.mw.mw.service.H5PlanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/mw")
public class H5PlanController {

    @Autowired
    private H5PlanService h5PlanService;

    @RequestMapping(value="/findH5PalnListById",method = RequestMethod.GET)
    public List<H5Plan> findH5PalnListById(Integer id){
        List<H5Plan> h5PlanList = h5PlanService.findH5PalnListById(id);
        return h5PlanList;
    }


}
