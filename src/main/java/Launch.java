import entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Launch {
    public static void main(String[] args) {
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
        Session session = sessionFactory.getCurrentSession();
        session.beginTransaction();
        Author author1 = new Author();
        author1.setName("Sasa");
        session.save(author1);
        session.getTransaction().commit();
        sessionFactory.close();

    }
}
