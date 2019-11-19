public class Stop implements Comparable<Stop> {

    private int capacity;
    private String name;

    public Stop(int capacity,String name){
        this.name=name;
        this.capacity=capacity;
    }

    public String toString(){
        return this.name;
    }

    public int capacity(){
        return this.capacity;
    }

    public int compareTo(Stop o) {
        if(this.capacity >= o.capacity){
            return this.capacity;
        }else return o.capacity;
    }
}