package mariuszs.spock

import spock.lang.Specification
import spock.lang.Unroll

import static mariuszs.spock.Calculator.take

@Unroll
class CalculatorTest extends Specification {

    def "should calculate: #x + #y = #sum"() {

        expect:
            take(x).add(y).calculate() == sum

        where:
            x | y  | sum
            1 | 2  | 3
            2 | 5  | 7
            3 | -1 | 2

    }

    def "should subtract numbers"() {

        given:
            Calculator calculator = new Calculator()
        when:
            calculator.add(4).subtract(4)
        then:
            calculator.calculate() == 0

    }

    def "should multiply"() {

        expect:
            take(2).multiply(2).calculate() == 4

    }
}
