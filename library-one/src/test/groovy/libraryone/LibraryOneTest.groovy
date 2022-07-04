package libraryone

import spock.lang.Ignore
import spock.lang.Specification

class LibraryOneTest extends Specification {

    def 'library one'() {
        expect:
            true
    }

    @Ignore
    def 'failing test'() {
        expect:
            false
    }
}
