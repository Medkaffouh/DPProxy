package spring_exemple;

public class TransactionalProxy implements IMetier{
    private IMetier metier;
    @Override
    public void process() {
        System.out.println("Begin Transaction");
        metier=new MetierImpl(); //Spring peux instancier un autre proxy  par exemple proxy de cache
        metier.process();
        System.out.println("Rollback ou Commit");
    }
}
