Inversion Of Control
------------
**Inversion Of Control mean outsourcing Configurations**
![screen shot 1939-09-29 at 11 45 04 pm](https://user-images.githubusercontent.com/14003377/34221958-d9bab4f8-e5df-11e7-97d9-bc7f8b20724d.png)

![screen shot 1939-09-29 at 11 47 13 pm](https://user-images.githubusercontent.com/14003377/34222038-29363ce6-e5e0-11e7-917c-5bfd3a85518f.png)


----
-----

Spring Bean Scope
----------------------------
**Singleton scope (Default)**
 The same object is returned each time it is injected
**Prototype scope** 
A new object is created each time it is injected/looked up.


![screen shot 1939-09-30 at 12 39 11 am](https://user-images.githubusercontent.com/14003377/34224022-656128e6-e5e7-11e7-878d-ea93c82c26db.png)
break
![screen shot 1939-09-30 at 12 50 22 am](https://user-images.githubusercontent.com/14003377/34224461-f708d112-e5e8-11e7-94f3-cc39ced4e30e.png)


```
<bean id="" class="" scope="prototype">
</bean>
```

![screen shot 1939-09-30 at 12 54 34 am](https://user-images.githubusercontent.com/14003377/34224701-c5db3dc2-e5e9-11e7-8875-582a66c4832e.png)
break
![screen shot 1939-09-30 at 12 55 24 am](https://user-images.githubusercontent.com/14003377/34224703-c8690f6a-e5e9-11e7-95ba-2d20670955af.png)

---------
--------

Annotations
------

```
- @Component
- @Autowire
- @Qualifier
- @Scope
- @PostConstruct, @PreConstruct
```

**@ Component**
**Enable Component Scanning in Spring Config file**
![screen shot 1939-09-30 at 1 02 41 am](https://user-images.githubusercontent.com/14003377/34224961-adb3fbfc-e5ea-11e7-86d2-0dffcd51f390.png)
**Giving Name Explicitly**
![screen shot 1939-09-30 at 1 04 21 am](https://user-images.githubusercontent.com/14003377/34225015-e82e9710-e5ea-11e7-9871-c15a9bd3f892.png)
**Default Bean ID name**
![screen shot 1939-09-30 at 1 07 42 am](https://user-images.githubusercontent.com/14003377/34225161-64480caa-e5eb-11e7-9d5f-0a4f861c7d6d.png)

**@Autowired**
![screen shot 1939-09-30 at 1 17 37 am](https://user-images.githubusercontent.com/14003377/34225621-13c06866-e5ed-11e7-8259-04ee078e09da.png)

**@Qualifier**
![screen shot 1939-09-30 at 1 22 51 am](https://user-images.githubusercontent.com/14003377/34225757-8a079cba-e5ed-11e7-8366-2ed8c584bec6.png)
break
![screen shot 1939-09-30 at 1 23 28 am](https://user-images.githubusercontent.com/14003377/34225777-990d6046-e5ed-11e7-8ff6-61b8f80b44aa.png)


**@Scope**
![screen shot 1939-09-30 at 1 26 08 am](https://user-images.githubusercontent.com/14003377/34225880-f2b4b7f2-e5ed-11e7-9725-fc13be30b8a2.png)

@PostConstruct
@PreDestroy
![screen shot 1939-09-30 at 1 27 41 am](https://user-images.githubusercontent.com/14003377/34225970-3ac2379a-e5ee-11e7-99dd-ef4971d694de.png)



-------
-------


SPRING MVC
---
![32266697-6031dc26-bf0e-11e7-9b8c-c887e007dd8f](https://user-images.githubusercontent.com/14003377/34329005-14ba57aa-e916-11e7-8475-f9052bc1c324.jpg)

@Controller inherits from @Component ...... Supports Scanning
![screen shot 1939-09-30 at 1 39 30 am](https://user-images.githubusercontent.com/14003377/34226477-d36b6b82-e5ef-11e7-8d74-9674a7672ef4.png)
----------
----------
----------

**Model is used to hold and move data to view.
@RequestParam("name") String theName**
![screen shot 1939-09-30 at 1 54 34 am](https://user-images.githubusercontent.com/14003377/34227092-fb1cb76a-e5f1-11e7-8f73-1633c8a1f73c.png)

You Can Add @ModelAttribute Student student to get it as JAVA Object , Make sure you have Student POJO class.
![screen shot 1939-09-30 at 2 25 41 am](https://user-images.githubusercontent.com/14003377/34228321-46b50174-e5f6-11e7-8cdc-06aa3cf151ef.png)
In JAVA
![screen shot 1939-09-30 at 2 26 26 am](https://user-images.githubusercontent.com/14003377/34228387-7fe8b0ee-e5f6-11e7-9e99-558f3ef96e02.png)

------
-------


TESTING Your JDBC Connection
----
![screen shot 1939-09-30 at 2 32 01 am](https://user-images.githubusercontent.com/14003377/34228610-3c43c0bc-e5f7-11e7-9635-0c3fc9913d4b.png)
----------
----------
----------
![screen shot 1939-09-30 at 2 45 31 am](https://user-images.githubusercontent.com/14003377/34229108-1799089c-e5f9-11e7-9159-5bc6e1de8f85.png)
----------
----------
----------
![screen shot 1939-09-30 at 2 47 20 am](https://user-images.githubusercontent.com/14003377/34229162-4f233724-e5f9-11e7-8867-b5796686f862.png)
----------
----------
----------
![screen shot 1939-09-30 at 2 48 12 am](https://user-images.githubusercontent.com/14003377/34229191-696764e8-e5f9-11e7-9ac1-7f461ccad347.png)
----------
----------
----------
![screen shot 1939-09-30 at 2 55 48 am](https://user-images.githubusercontent.com/14003377/34229500-823879a2-e5fa-11e7-8462-7af655fe8454.png)
----------
----------
----------

**Query Object with Hibernate**
![screen shot 1939-09-30 at 2 58 10 am](https://user-images.githubusercontent.com/14003377/34229580-db8cb3ec-e5fa-11e7-8fcd-2b39c330fd4f.png)

**Update Object with Hibernate**
![screen shot 1939-09-30 at 3 02 00 am](https://user-images.githubusercontent.com/14003377/34229753-656a4f16-e5fb-11e7-8bad-048c899591c4.png)
----------
----------
----------
![screen shot 1939-09-30 at 3 04 09 am](https://user-images.githubusercontent.com/14003377/34229805-a52553d0-e5fb-11e7-83f6-edd6e93b0511.png)
----------
----------
----------
![screen shot 1939-09-30 at 3 04 30 am](https://user-images.githubusercontent.com/14003377/34229823-af2165ea-e5fb-11e7-8491-d7047fca6e2a.png)

[HQL](https://www.tutorialspoint.com/hibernate/hibernate_query_language.htm)  ((Very Important))


------
-------

Hibernate Mapping
-------------------
**@OneToOne Mapping**
![screen shot 1939-09-30 at 3 13 24 am](https://user-images.githubusercontent.com/14003377/34230106-f258f6d8-e5fc-11e7-9f8d-2903789bbc5d.png)
----------
----------
----------
![screen shot 1939-09-30 at 3 13 48 am](https://user-images.githubusercontent.com/14003377/34230121-fcd53388-e5fc-11e7-89c8-44f39e6642d2.png)
----------
----------
----------
![screen shot 1939-09-30 at 3 14 25 am](https://user-images.githubusercontent.com/14003377/34230148-152d7d5a-e5fd-11e7-9756-aa4b76d134a5.png)
----------
----------
----------
![screen shot 1939-09-30 at 3 17 45 am](https://user-images.githubusercontent.com/14003377/34230278-9425c5ea-e5fd-11e7-9e99-0536759be07c.png)
----------
----------
----------
**@OneToOne Bidirectional**
![screen shot 1939-09-30 at 3 30 30 am](https://user-images.githubusercontent.com/14003377/34230774-525694b2-e5ff-11e7-8738-ebcf3dac9e3c.png)
----------
----------
----------
![screen shot 1939-09-30 at 3 31 25 am](https://user-images.githubusercontent.com/14003377/34230819-81eac39c-e5ff-11e7-92a4-20b9b9e3a075.png)
----------
----------
----------
**Delete Only Instructor_Details not Instructor , So use All Cascade type Except "REMOVE"**
![screen shot 1939-09-30 at 3 33 51 am](https://user-images.githubusercontent.com/14003377/34230915-f48b3774-e5ff-11e7-98f7-f7a2ecd3fa29.png)
----------
----------
----------
Some Error Might Come , So we Need To break Bi-Directional Link
![screen shot 1939-09-30 at 3 40 02 am](https://user-images.githubusercontent.com/14003377/34231102-ae007de0-e600-11e7-9a68-29b671cc2f70.png)
----------
----------
----------


---------
---------


OneToMany
-------

![screen shot 1939-09-30 at 3 59 32 am](https://user-images.githubusercontent.com/14003377/34231786-659c9004-e603-11e7-928c-66343bd4a33c.png)
---------
---------
---------
![screen shot 1939-09-30 at 4 00 27 am](https://user-images.githubusercontent.com/14003377/34231813-83a0dc86-e603-11e7-916b-541d41a96733.png)
-------
------
------
![screen shot 1939-09-30 at 4 08 10 am](https://user-images.githubusercontent.com/14003377/34232070-a2a2c774-e604-11e7-800c-0aea6431269f.png)
  

----------
-----------


EAGER AND LAZY LOADING
----------------------------
![screen shot 1939-09-30 at 4 14 00 am](https://user-images.githubusercontent.com/14003377/34232232-664f9a76-e605-11e7-8da0-c3c2cd00cf63.png)
-------
------
------
_Only LOAD Data from Absolutely Needed, So prefer Lazy Loading_
![screen shot 1939-09-30 at 4 15 40 am](https://user-images.githubusercontent.com/14003377/34232293-a1cf51e0-e605-11e7-9f6f-b9b49a5a86c9.png)
-------
------
------
![screen shot 1939-09-30 at 4 16 51 am](https://user-images.githubusercontent.com/14003377/34232343-e1877fc4-e605-11e7-93ca-d8204b9ace63.png)
-------
------
------
![screen shot 1939-09-30 at 4 18 28 am](https://user-images.githubusercontent.com/14003377/34232367-05c74de2-e606-11e7-81ba-80a9a81c018f.png)

-------
------
------
![screen shot 1939-09-30 at 4 18 49 am](https://user-images.githubusercontent.com/14003377/34232381-1212a48e-e606-11e7-820b-bb5daa50066b.png)
-------
------
------
![screen shot 1939-09-30 at 4 19 43 am](https://user-images.githubusercontent.com/14003377/34232422-35ee6712-e606-11e7-9e85-204e4097cb98.png)
-------
------
------
![screen shot 1939-09-30 at 4 21 23 am](https://user-images.githubusercontent.com/14003377/34232475-7516344c-e606-11e7-8531-9d284dbb6937.png)
-------
------
------


---------
----------


@OneToMany
--------------
![screen shot 1939-10-02 at 5 47 58 pm](https://user-images.githubusercontent.com/14003377/34319473-7ccc0fc2-e809-11e7-8979-2cf44363b696.png)
-----
----
----
![screen shot 1939-10-02 at 6 05 01 pm](https://user-images.githubusercontent.com/14003377/34319579-da8c0cd2-e80b-11e7-83b6-8f1a7d34db88.png)
-----
----
----
![screen shot 1939-10-02 at 6 05 31 pm](https://user-images.githubusercontent.com/14003377/34319581-e5966b04-e80b-11e7-9fb6-05d92c3ac0d0.png)
-----
----
----
![screen shot 1939-10-02 at 6 06 17 pm](https://user-images.githubusercontent.com/14003377/34319586-019eead8-e80c-11e7-8351-36f5066b9e2d.png)
-----
----
----
![screen shot 1939-10-02 at 6 07 27 pm](https://user-images.githubusercontent.com/14003377/34319594-30b9e070-e80c-11e7-95c0-5617adeafd1b.png)
-----
----
----
![screen shot 1939-10-02 at 6 06 40 pm](https://user-images.githubusercontent.com/14003377/34319587-0c2e5c22-e80c-11e7-939a-9238cd44783a.png)
-----
----
----


---------
---------

@ManyToMany
--------------
![screen shot 1939-10-02 at 6 10 50 pm](https://user-images.githubusercontent.com/14003377/34319607-a60e186e-e80c-11e7-994a-2bdc461c4ace.png)
-----
----
----
![screen shot 1939-10-02 at 6 16 41 pm](https://user-images.githubusercontent.com/14003377/34319646-74dbd474-e80d-11e7-9eeb-437ff6af82e0.png)
-----
----
----
![screen shot 1939-10-02 at 6 17 06 pm](https://user-images.githubusercontent.com/14003377/34319648-834742f0-e80d-11e7-912a-8001e86295c2.png)
**Inverse refer to the other side of the relation**
-----
----
----
![screen shot 1939-10-02 at 6 17 52 pm](https://user-images.githubusercontent.com/14003377/34319655-a5c2372c-e80d-11e7-94d1-f72fac4af4b2.png)
-----
----
----
For Course.java
![screen shot 1939-10-02 at 6 21 24 pm](https://user-images.githubusercontent.com/14003377/34319676-29cacc8c-e80e-11e7-97e8-e3cd7666c0a8.png)


---------
-----------

@ManyToMany
--------------
![screen shot 1939-10-02 at 6 10 50 pm](https://user-images.githubusercontent.com/14003377/34319607-a60e186e-e80c-11e7-994a-2bdc461c4ace.png)
-----
----
----
![screen shot 1939-10-02 at 6 16 41 pm](https://user-images.githubusercontent.com/14003377/34319646-74dbd474-e80d-11e7-9eeb-437ff6af82e0.png)
-----
----
----
![screen shot 1939-10-02 at 6 17 06 pm](https://user-images.githubusercontent.com/14003377/34319648-834742f0-e80d-11e7-912a-8001e86295c2.png)
**Inverse refer to the other side of the relation**
-----
----
----
![screen shot 1939-10-02 at 6 17 52 pm](https://user-images.githubusercontent.com/14003377/34319655-a5c2372c-e80d-11e7-94d1-f72fac4af4b2.png)
-----
----
----
For Course.java
![screen shot 1939-10-02 at 6 21 24 pm](https://user-images.githubusercontent.com/14003377/34319676-29cacc8c-e80e-11e7-97e8-e3cd7666c0a8.png)

-------
--------

Hibernate Criteria
------------------
```
Criteria cr = session.createCriteria(Employee.class);
cr.add(Restrictions.eq("salary", 2000));
List results = cr.list();
```

**Projection**
```
Criteria cr = session.createCriteria(Employee.class);

// To get total row count.
cr.setProjection(Projections.rowCount());

// To get average of a property.
cr.setProjection(Projections.avg("salary"));

// To get distinct count of a property.
cr.setProjection(Projections.countDistinct("firstName"));

// To get maximum of a property.
cr.setProjection(Projections.max("salary"));

// To get minimum of a property.
cr.setProjection(Projections.min("salary"));

// To get sum of a property.
cr.setProjection(Projections.sum("salary"));
```

-------
--------

Native SQL Query and With Named Query
---------

**Native SQL Query**
```
String sql = "SELECT * FROM EMPLOYEE WHERE id = :employee_id";
SQLQuery query = session.createSQLQuery(sql);
query.addEntity(Employee.class);
query.setParameter("employee_id", 10);
List<Employee> results = query.list();
```
**Native SQL NamedQuery**
In Mapping File Write Query and use it in Java class
```
<hibernate-mapping package="com.tutorial.hibernate">
 
    <query name="GET_ALL_EMPLOYEES" >
          <![CDATA[from Employee]]>
   </query>
 
   <query name="GET_EMPLOYEE_BY_ID" >
          <![CDATA[from Employee where id = :id]]>
   </query>

</hibernate-mapping>
```
```
Query query = session.getNamedQuery("GET_ALL_EMPLOYEES");
List<Employee> employees = query.list();
```


-------
-------

Extras
------

If you don't want some properties in POJO to be saved  in Database use @Transient
```
@Transient
private boolean valid;
```

**@Temporal**
![screen shot 1939-10-04 at 10 25 33 pm](https://user-images.githubusercontent.com/14003377/34341684-ae051eca-e9c2-11e7-899d-fed703f4a75e.png)



Rest Call from Java Code
------------------------
https://howtodoinjava.com/spring/spring-restful/spring-restful-client-resttemplate-example/

  







