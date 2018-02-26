# 迭代器模式
迭代器模式（Iterator Pattern）是 Java 和 .Net 编程环境中非常常用的设计模式。这种模式用于顺序访问集合对象的元素，不需要知道集合对象的底层表示。
迭代器模式属于行为型模式。

# 介绍
**意图**：提供一种方法顺序访问一个聚合对象中各个元素, 而又无须暴露该对象的内部表示。

**主要解决**：不同的方式来遍历整个整合对象。

**何时使用**：遍历一个聚合对象。

**如何解决**：把在元素之间游走的责任交给迭代器，而不是聚合对象。

**关键代码**：定义接口：hasNext, next。

**应用实例**：JAVA 中的 iterator。

**优点**： 1、它支持以不同的方式遍历一个聚合对象。 2、迭代器简化了聚合类。 3、在同一个聚合上可以有多个遍历。 4、在迭代器模式中，增加新的聚合类和迭代器类都很方便，无须修改原有代码。

**缺点**：由于迭代器模式将存储数据和遍历数据的职责分离，增加新的聚合类需要对应增加新的迭代器类，类的个数成对增加，这在一定程度上增加了系统的复杂性。

**使用场景**： 1、访问一个聚合对象的内容而无须暴露它的内部表示。 2、需要为聚合对象提供多种遍历方式。 3、为遍历不同的聚合结构提供一个统一的接口。

**注意事项**：迭代器模式就是分离了集合对象的遍历行为，抽象出一个迭代器类来负责，这样既可以做到不暴露集合的内部结构，又可让外部代码透明地访问集合内部的数据。

# 实现
我们将创建一个叙述导航方法的 Iterator 接口和一个返回迭代器的 Container 接口。实现了 Container 接口的实体类将负责实现 Iterator 接口。
IteratorPatternDemo，我们的演示类使用实体类 NamesRepository 来打印 NamesRepository 中存储为集合的 Names。
![](http://www.runoob.com/wp-content/uploads/2014/08/iterator_pattern_uml_diagram.jpg)

## 步骤 1
创建接口。
Iterator.java

    public interface Iterator {
       public boolean hasNext();
       public Object next();
    }
    
Container.java

    public interface Container {
       public Iterator getIterator();
    }
    
## 步骤 2
创建实现了 Container 接口的实体类。该类有实现了 Iterator 接口的内部类 NameIterator。
NameRepository.java

    public class NameRepository implements Container {
       public String names[] = {"Robert" , "John" ,"Julie" , "Lora"};
    
       @Override
       public Iterator getIterator() {
          return new NameIterator();
       }
    
       private class NameIterator implements Iterator {
    
          int index;
    
          @Override
          public boolean hasNext() {
             if(index < names.length){
                return true;
             }
             return false;
          }
    
          @Override
          public Object next() {
             if(this.hasNext()){
                return names[index++];
             }
             return null;
          }        
       }
    }
    
步骤 3
使用 NameRepository 来获取迭代器，并打印名字。
IteratorPatternDemo.java

# 案例2
此案例增加了一个一种迭代器和容器，是Object类型的迭代器。实质是ArrayList的简单实现。

## 步骤1
创建实现Container接口的ObjRepository.java，其中还有增加对象数组的方法。

    public class ObjRepository implements Container{
    
        /**
         *
         */
        private static double ARRAY_GROWTH_MULTIPLES = 0.75;
        /**
         * 默认容量
         */
        private static int DEFAULT_CAPACITY = 10;
        /**
         * 对象数组
         */
        private static Object[] objects = new Object[DEFAULT_CAPACITY];
        /**
         * 已使用量=数组总量-剩余量
         */
        private static int used = 0;
        /**
         * 剩余量
         */
        private static int remaining = DEFAULT_CAPACITY;
    
        public ObjRepository(){
        }
    
        public ObjRepository(Object...objects){
            put(objects);
        }
    
        public void put(Object...obj){
            if(obj.length > remaining){
                reshape();
            }
            System.arraycopy(obj,0, objects, used, obj.length);
            used += obj.length;
            remaining = objects.length - used;
            System.out.println(String.format("used:%d,remaining:%d", used, remaining));
        }
    
        private static void reshape(){
            int newLength = (int) (objects.length* ARRAY_GROWTH_MULTIPLES);
            objects = Arrays.copyOf(objects, objects.length+newLength);
        }
    
        @Override
        public Iterator getIterator() {
            return new ObjIterator();
        }
    
        private class ObjIterator implements Iterator{
            int index;
    
            @Override
            public boolean hasNext() {
                if(index < objects.length){
                    return true;
                }
                return false;
            }
    
            @Override
            public Object next() {
                if(this.hasNext()){
                    return objects[index++];
                }
                return null;
            }
        }
    }

## 步骤2
创建Person类
    
    public class Person {
        private String name;
        private Gender gender;
        private int age;
    
        public Person(String name, Gender gender, int age){
            this.name = name;
            this.gender = gender;
            this.age = age;
        }
    
        public String getName() {
            return name;
        }
    
        public void setName(String name) {
            this.name = name;
        }
    
        public Gender getGender() {
            return gender;
        }
    
        public void setGender(Gender gender) {
            this.gender = gender;
        }
    
        public int getAge() {
            return age;
        }
    
        public void setAge(int age) {
            this.age = age;
        }
    
        public enum Gender{
            FAMALE, MALE;
        }
    
        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    ", age=" + age +
                    '}';
        }
    }

## 步骤3
创建ObjRepository对象，获取迭代器对象，进行迭代。

    public class ObjIteratorDemo {
        public static void main(String[] args){
            String[] names = {"Robert" , "John" ,"Julie" , "Lora", "Robert" , "John" ,"Julie" , "Lora", "Robert" , "John" ,"Julie" , "Lora"};
    
            Person[] persons = {
                    new Person("tianlixin", Person.Gender.MALE, 26),
                    new Person("anlihong", Person.Gender.FAMALE, 25),
                    new Person("zhaiyinghao", Person.Gender.MALE, 25),
                    new Person("wangshang", Person.Gender.MALE, 26),
            };
    
            Container container = new ObjRepository(persons);
    
            for(Iterator iterator = container.getIterator(); iterator.hasNext();){
                Object object = iterator.next();
                if(object!=null) {
                    System.out.println(object);
                }
            }
        }
    }

## 验证

    used:4,remaining:6
    Person{name='tianlixin', gender=MALE, age=26}
    Person{name='anlihong', gender=FAMALE, age=25}
    Person{name='zhaiyinghao', gender=MALE, age=25}
    Person{name='wangshang', gender=MALE, age=26}