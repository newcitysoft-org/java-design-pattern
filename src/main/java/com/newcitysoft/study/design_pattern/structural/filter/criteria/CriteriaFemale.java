package com.newcitysoft.study.design_pattern.structural.filter.criteria;

import com.newcitysoft.study.design_pattern.structural.filter.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准女性
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 11:18
 */
public class CriteriaFemale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
