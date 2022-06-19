package spring_exemple;
@Service
public class MetierImpl implements IMetier {
    @Override
    @Transactional
    @Cacheable
    public void process() {
        System.out.println("Traitement");
    }
}
