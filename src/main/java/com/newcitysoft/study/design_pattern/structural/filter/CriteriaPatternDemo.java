package com.newcitysoft.study.design_pattern.structural.filter;

import com.newcitysoft.study.design_pattern.structural.filter.criteria.AndCriteria;
import com.newcitysoft.study.design_pattern.structural.filter.criteria.Criteria;
import com.newcitysoft.study.design_pattern.structural.filter.criteria.CriteriaFemale;
import com.newcitysoft.study.design_pattern.structural.filter.criteria.CriteriaMale;
import com.newcitysoft.study.design_pattern.structural.filter.criteria.CriteriaSingle;
import com.newcitysoft.study.design_pattern.structural.filter.criteria.OrCriteria;
import com.newcitysoft.study.design_pattern.structural.filter.entity.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 过滤器模式的Demo
 * 过滤器的形象比喻：筛子，筛选有用的东西留下。
 * @author lixin.tian@renren-inc.com
 * @date 2018/2/23 11:23
 */
public class CriteriaPatternDemo {
    public static void main(String[] args) {
        List<Person> persons = new ArrayList<Person>();

        persons.add(new Person("Robert","Male", "Single"));
        persons.add(new Person("John","Male", "Married"));
        persons.add(new Person("Laura","Female", "Married"));
        persons.add(new Person("Diana","Female", "Single"));
        persons.add(new Person("Mike","Male", "Single"));
        persons.add(new Person("Bobby","Male", "Single"));

        Criteria male = new CriteriaMale();
        Criteria female = new CriteriaFemale();
        Criteria single = new CriteriaSingle();
        Criteria singleMale = new AndCriteria(single, male);
        Criteria singleOrFemale = new OrCriteria(single, female);

        System.out.println("Males: ");
        printPersons(male.meetCriteria(persons));

        System.out.println("\nFemales: ");
        printPersons(female.meetCriteria(persons));

        System.out.println("\nSingle Males: ");
        printPersons(singleMale.meetCriteria(persons));

        System.out.println("\nSingle Or Females: ");
        printPersons(singleOrFemale.meetCriteria(persons));
    }

    public static void printPersons(List<Person> persons){
        for (Person person : persons) {
            System.out.println("Person : [ Name : " + person.getName()
                    +", Gender : " + person.getGender()
                    +", Marital Status : " + person.getMaritalStatus()
                    +" ]");
        }
    }
}
