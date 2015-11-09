package mariuszs.spock

import spock.lang.Specification

class MachineServiceImplTest extends Specification {

    MachineDao machineDao = Mock();
    MachineServiceImpl machineService = new MachineServiceImpl(machineDao);

    def "should calculate and persist"() {

        when:
            int sum = machineService.calculateAndPersist(2, 3);

        then:
            1 * machineDao.save(_) >> { int x -> x + 1 }
            sum == 6

    }

    def "should fail"() {

        when:
            machineService.calculateAndPersist(2, 3);

        then:
            1 * machineDao.save(_) >> { throw new RuntimeException("disk corrupted") }
            thrown RuntimeException

    }

}
