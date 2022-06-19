package spring_exemple;

public class Controller {
    @Autowired
    private IMetier metier;//=new TransactionalProxy();
    //Sprint va injecter le proxy pour un besoir de (securité, transaction, controlle d'accés, gestion de cache...)

    public String index(){
        metier.process();
        return "index";
    }
}
