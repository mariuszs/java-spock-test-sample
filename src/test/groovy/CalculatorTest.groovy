import spock.lang.Specification
import spock.lang.Unroll

@Unroll
class CalculatorTest extends Specification {

    def "should add"(int x, int y, int sum) {

        expect:
        new Calculator(x).plus(y).result() == sum

        where:
        x | y  | sum
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

    def "multiple"() {

        expect:
        new Calculator(2).multiply(2).result() == 4

    }
}
