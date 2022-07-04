package libraryone

import spock.lang.Specification

class LibraryOneTest extends Specification {

    def 'library one'() {
        expect:
            true
    }

    def 'failing test'() {
        expect:
            false
    }
}
