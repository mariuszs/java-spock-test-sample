package mariuszs.spock;

/**
 * @author mariuszs
 * @since 26.05.13
 */
public class MachineDaoImpl implements MachineDao {
    @Override
    public int save(int sum) {
        System.out.println("Saved " + sum);
        return sum + 1;
    }
}
