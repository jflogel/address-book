package address.book


class ContactBuilder {

    String firstName = 'jason'
    String lastName = 'flogel'

    Contact build() {
        new Contact(firstName: firstName, lastName: lastName)
    }
}
