public class Station extends Stop {

    private int exits;


    public Station(int cap, String name, int exits){
        super(cap,name);
        this.exits=exits;
    }

    public int exits(){
        return exits;
    }


}