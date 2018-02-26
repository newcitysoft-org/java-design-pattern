package com.newcitysoft.study.design_pattern.structural.filter.criteria;

import com.newcitysoft.study.design_pattern.structural.filter.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 标准男性
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 11:15
 */
public class CriteriaMale implements Criteria{

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}
