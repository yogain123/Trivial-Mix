@Component
      @Controller
      @Service
      @Repository   // always applied to DAO implemention

@Autowired
@Qualifier

info.properties

Web.xml    // Contains Info for project like dispatcher Servlet , Welcome File , .xml file name, Resource Path
somename.xml  // config file contains info like Base package scan, View Resolver, All beans
  
Dependency injection can be done using Bean Injection or Annotation

@Controller
public class HelloController {
   @RequestMapping(value = "/hello", method = RequestMethod.GET)
   public String printHello(ModelMap model) {
      model.addAttribute("message", "Hello Spring MVC Framework!");
      return "hello";
   }
}


 Saving java object in database
 ------------------------------
Customer customer1 = new Customer("Yogi",23);
Customer customer2 = new Customer("Amit",25);
session.save(customer1);    
session.save(customer2);



Retrive object from database
----------------------------
Student student = session.get(Student.class,id)    // id is a primary key to retrive that particular column



Query on Object : Retrive object from database
----------------------------------------------
List<Student> tempStudents = session.createQuery("from student s where s.lastName='yogi'").list();
for(Student tempStudent : tempStudents)
{
      sysout(tempStudent);
}



log4j.logger.org.hibernate=TRACE 
This allows you see a low-level trace of Hibernate and this allows you see the real SQL parameter values.



Query on Object : Update object from database
----------------------------------------------
Get object from database and set the updated value
Student student = session.get(Student.class,id);
student.setFirstName("Yogendra");
session.save(student);    //Optional , just committing traction will work

OOORRR,
session.createQuery("update student set email='yogendrasaxena56@gmail.com'").executeUpdate();


Delete Object
-------------
Student student = session.get(Student.class,id);
session.delete(student);

OOORR,
session.createQuery("delete from Student where id = 2").executeUpdate();



--------------------------------------------------------------------------------------------
CustomerService
CustomerServiceImpl
CustomerDAO
CustomerDAOImpl
--------------------------------------------------------------------------------------------



Named Queries
-------------
Added a Query that are frequently used i.e consolidate query

@Entity
@NamedQuery(name="abcd", query="from Customer where userId=?")
class Customer{}


In java Class
Query query = session.getNamedQuery("abc");
query.setInteger(0,2);   //passing userid as 2


You can write Native SQL query using Named Query

@Entity
@NamedNativeQuery(name="abcd", query="Select * from Customer_Details where userName=?",resultClass="CustomerDetails.class) //as it is native we use table name
Class CustomerDetails{}

in java class
Query query = session.getNamedQuery("abc");
query.setString(0,"Yogendra");   //passing username as yogendra



Hibernate Criteria
------------------
Criteria criteria = session.createCriteria(Student.class);
criteria.add(Restrictions.eq("userName","Yogendra"))
         add(Restrictions.ge("userID",5));
         
criteria.add(Restrictions.or(Restrictions.between(userId,2,8),Restrictions.like(userName,"%dra")));




Projection in Hibernate
------------------------
Criteria criteria = session.createCriteria(Student.class);
criteria.setProjection(Projections.property("userId")
        .add(Restrictions.eq("userName","Yogendra"))
        .add(Restrictions.ge("userID",5));
        
        
        
        
Mapping in Hibernate
--------------------
Primary key
Foreign key
Cascade   //Applying same operation to Related entity


One-to-One Mapping
------------------
Instruction Class
InstructionDetails Class

@Entity
@Table(name="instructor_details")
Class InstructionDetail
{
      @Id
      @Genera.....
      @column..
      int id;
      
      String youtube_channel;
      String hobby;
      
      //setter getter
      //constructor
      //tostring method
      
}


@Entity
@Table(name="instructor")
Class Instructor
{
      @Id
      @Genera.....
      @column..
      int id;
      
      String firstName;
      String lastName;
      String email;
      
      @OneToOne(cascade=CascadeType.ALL)
      @JoinColumn(name="instructor_detail_id")
      InstructionDetail instructionDetail
      
}


Main class
----------
Instructor tempInstructor  = new Instructor("chad","darby","sdfjh@gmail.com");
InstructorDetail tempInstructorDetail  = new Instructor("www.youtube.com","luv2code");

tempInstructor.setInstructorDetail(tempInstructorDetail);

session.save(tempInstructor);   // it will also save tempInstructorDetail because of "Cascade type All"



One to One Mapping Bidirectional
Class InstructorDetail
{
      ..
      ..
      @OneToOne(mappedBy="instructorDetails",cascade=cascadeType.ALL)  
      Instructor instructor;
}

Instructor Class same


Main Class
---------------

int theId=2;
InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class,theId);
sysout("Instructor Details"+tempInstructorDetail);
sysout("Instructor "+tempInstructorDetail.getInstructor());




let say you want to detete instructor details but not instructor
-----------------------------------------------------------------
Class InstructorDetail
{
      ..
      ..
 @OneToOne(mappedBy="instructorDetails",cascade={cascadeType.merge,cascadeType.distinct....}) // but not cascadeType.delete  
 Instructor instructor;

}


Main Class
----------

InstructorDetail tempInstructorDetail = session.get(InstructorDetail.class,theId);
tempInstructorDetail.getInstructor().setInstructorDetail(null);   //breaking the 2 way link for this relationship
session.delete(tempInstructorDetail);



----------------------------------------------------------------------------------------------------------------

Eager and Lazy Loading
----------------------
Eager Loading Fetches everything from database
Lazy Loading Fetches Data only on request.

When you lazy Load the data is fetched on demand  : Need open Hibernate Connecion


----------------------------------------------------------------------------------------------------------------


SessionFactory factory = new Configuration()
                        .configure("hibernate.cfg.xml")
                        .addAnnotatedClass("Student.class")
                        .buildSessionFactory();
                        
Session session = factory.getCurrentSession();

try
{
      Student s = new Student("yogi",23);
      session.beginTransaction();
      session.save(s);
      session.getTransaction().commit();
}
finally
{
      factory.close();
}





