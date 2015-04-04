import java.util.Date;

import org.hibernate.Session;

import com.tjain.user.DBUser;
import com.tjain.util.HibernateUtil;


public class App {

	public static void main(String[] args) {
		System.out.println("Maven + Hibernate + Oracle");
		Session session = HibernateUtil.getSessionFactory().openSession();
		
		session.beginTransaction();
		DBUser user = new DBUser();
		
		user.setUserId(101);
		user.setUserName("superman1");
		user.setCreatedBy("system1");
		user.setCreatedDate(new Date());
		
		session.save(user);
		session.getTransaction().commit();
		System.out.println("Maven + Hibernate + Oracle");
	}

}
