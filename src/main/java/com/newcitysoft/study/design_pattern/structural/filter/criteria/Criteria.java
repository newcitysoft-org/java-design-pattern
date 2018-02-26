package com.newcitysoft.study.design_pattern.structural.filter.criteria;

import com.newcitysoft.study.design_pattern.structural.filter.entity.Person;

import java.util.List;

/**
 * 标准接口
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 11:15
 */
public interface Criteria {

    /**
     * 见面
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);
}
