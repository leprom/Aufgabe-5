public class SimpleStop extends Stop{

    private boolean tickets;

    public SimpleStop(int cap, String name, boolean tickets){
        super(cap,name);
        this.tickets=tickets;
    }

    public boolean tickets(){
        return this.tickets;
    }

}