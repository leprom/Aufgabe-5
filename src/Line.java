public class Line<Stop extends Comparable> extends Sequence<Stop> implements Comparable {


    public Line() {
        super(new LinkedList<Stop>());
    }

    @Override
    public int compareTo(Object o) {
        if(!(o instanceof Line)){
            throw new IllegalCallerException("d");
        }
        Line line = (Line) o;

        if(super.getContainer().size==line.getContainer().size) return 0;
        else if(super.getContainer().size>line.getContainer().size) return 1;
        else return -1;
    }


    public String toString(){
        return super.toString();
    }
}
