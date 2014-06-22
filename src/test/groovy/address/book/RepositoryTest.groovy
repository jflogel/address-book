package address.book

import address.book.repository.Repository
import org.hibernate.Session
import org.hibernate.SessionFactory
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.test.context.ContextConfiguration
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner
import org.springframework.transaction.annotation.Transactional

@RunWith(SpringJUnit4ClassRunner)
@ContextConfiguration(locations = 'classpath:contexts/appContext.xml')
@Transactional
//@TransactionConfiguration(defaultRollback = false)
class RepositoryTest {

    @Autowired SessionFactory sessionFactory
    @Autowired JdbcTemplate jdbcTemplate
    @Autowired Repository repository

    Contact contact

    @Before
    void setup() {
//        jdbcTemplate.execute("DELETE FROM contact")

        contact = new ContactBuilder().build()
        repository.saveOrUpdate(contact)
    }

    @Test
    void test1() {
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.firstName == contact.firstName
    }

    @Test
    void test2() {
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.lastName == contact.lastName
    }

    @Test
    void test3() {
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.lastName == contact.lastName
    }

    @Test
    void test4() {
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.lastName == contact.lastName
    }

    @Test
    void test5() {
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.lastName == contact.lastName
    }

    @Test
    void test6() {
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.lastName == contact.lastName
    }

    @Test
    void test7() {
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.lastName == contact.lastName
    }

    @Test
    void test8() {
        contact.firstName = 'notjason'
        getSession().update(contact)
        Contact actualContact = repository.find(Contact, contact.contactId) as Contact
        assert actualContact.firstName == 'notjason'
    }

    Session getSession() {
        sessionFactory.getCurrentSession()
    }

}
