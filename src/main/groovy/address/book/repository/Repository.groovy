package address.book.repository

import org.hibernate.Session
import org.hibernate.SessionFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component

@Component
class Repository {

    @Autowired SessionFactory sessionFactory

    public <T> T find(Class<T> type, Serializable id) {
        session().load(type, id)
    }

    public <T> T saveOrUpdate(T<T> object) {
        session().saveOrUpdate(object)
        object
    }

    private Session session() {
        sessionFactory.getCurrentSession()
    }
}
