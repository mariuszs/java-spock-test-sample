package mariuszs.spock;

import static mariuszs.spock.Calculator.take;

public class MachineServiceImpl implements MachineService {

    private final MachineDao machineDao;

    public MachineServiceImpl(MachineDao machineDao) {
        this.machineDao = machineDao;
    }

    @Override
    public int calculateAndPersist(int x, int y) {

        int sum = take(x).add(y).calculate();

        sum = machineDao.save(sum);

        return sum;
    }
}
