import spock.lang.Specification

class CalculatorTest extends Specification {

    def "should add"() {

        expect:
        new Calculator(x).plus(y).result() == z

        where:
        x | y  | z
        1 | 2  | 3
        2 | 5  | 7
        3 | -1 | 2

    }

    def "plus minus"() {
        given:
        Calculator calculator = new Calculator()
        when:
        calculator.plus(4).minus(1)
        then:
        calculator.result() == 3
    }
}
