package mariuszs.spock;

public class MachineDaoImpl implements MachineDao {
    @Override
    public int save(int sum) {
        System.out.println("Saved " + sum);
        return sum + 1;
    }
}
