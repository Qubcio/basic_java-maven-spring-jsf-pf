package pl.cubeitg.dao.hibernate;

import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;
import pl.cubeitg.dao.DocumentDao;
import pl.cubeitg.dao.HibernateUtil;
import pl.cubeitg.entity.Document;
import org.hibernate.Session;
import java.io.Serializable;

@Repository
public class DocumentDaoHibernate implements Serializable, DocumentDao {

    @Override
    public void save(Document document) {

        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            Transaction transaction = session.beginTransaction();
            session.save(document);
            transaction.commit();
        }
    }

    @Override
    public Document get(Long id) {
        try (Session session = HibernateUtil.getSessionFactory().openSession()){
            return session.get(Document.class, id);
        }
    }
}
