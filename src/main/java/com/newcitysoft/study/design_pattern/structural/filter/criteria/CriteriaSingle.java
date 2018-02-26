package com.newcitysoft.study.design_pattern.structural.filter.criteria;

import com.newcitysoft.study.design_pattern.structural.filter.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准单身
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 11:19
 */
public class CriteriaSingle implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> singlePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getMaritalStatus().equalsIgnoreCase("SINGLE")){
                singlePersons.add(person);
            }
        }
        return singlePersons;
    }
}
