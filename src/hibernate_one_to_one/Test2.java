package hibernate_one_to_one;

import hibernate_one_to_one.entity.Detail;
import hibernate_one_to_one.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Test2 {

    public static void main(String[] args) {
        SessionFactory factory = new Configuration()
                .configure("hibernate.cfg.xml")
                .addAnnotatedClass(Employee.class)
                .addAnnotatedClass(Detail.class)
                .buildSessionFactory();
        Session session = null;

        try {

            session = factory.getCurrentSession();
//            Employee employee = new Employee("Nikolay", "Ivanov", "HR", 850);
//            Detail detail = new Detail("New-York", "46774364", "nikolay@gmail.com");

//            employee.setEmpDetail(detail);
//            detail.setEmployee(employee);
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 1);
//            System.out.println(detail.getEmployee());
            detail.getEmployee().setEmpDetail(null);//Разрываеем связь между работником и деталями чтобы
            // удалить только детали
            session.delete(detail);


//            session.save(detail);
            session.getTransaction().commit();
            System.out.println("Done!");

        }finally {
            session.close();//Закрываем сессию
            factory.close();
        }
    }
}
