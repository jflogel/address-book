package address.book

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.Table


@Entity
@Table(name = 'contact')
class Contact {

    @Id @GeneratedValue Integer contactId
    String firstName
    String lastName
}
