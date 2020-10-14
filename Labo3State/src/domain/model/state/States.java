package domain.model.state;

public abstract class States {
    public void uitlenen(){
        throw new IllegalStateException("dit object kan niet uitgeleend worden.");
    }
    public void terugbrengen(){
        throw new IllegalStateException("dit object kan niet terug gebracht worden.");
    }
    public void herstellen(){
        throw new IllegalStateException("Dit object kan niet herstelt worden.");
    }
    public void verwijderen(){
        throw new IllegalStateException("Dit object kan niet verwijderd worden.");
    }
}
