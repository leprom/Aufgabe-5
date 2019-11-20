import java.util.Iterator;

public class Test {


    public static void main(String[] args) {
        // 1. Erzeugen Sie mindestens je ein Objekt sinngemäß folgender Typen:
        Sequence<String> strings = new Sequence<>();
        Sequence<Stop> stops = new Sequence<>();
        Sequence<SimpleStop> simpleStops = new Sequence<>();
        Sequence<Station> stations = new Sequence<>();
        Line<Stop> line = new Line<>();
        Line<SimpleStop> simpleStopLine = new Line<>();
        Line<Station> stationLine = new Line<>();
        Sequence<Line<Stop>> lineSequence = new Sequence<>();
        Sequence<Line<SimpleStop>> lineSequence1 = new Sequence<>();
        Sequence<Line<Station>> lineSequence2 = new Sequence<>();

        // 2. Überprüfen Sie die Funktionalität der Sequence-Objekte
        stations.add(new Station(10,"Station",42));
        System.out.println(stations.getContainer().get(0).exits());
        simpleStops.add(new SimpleStop(12,"SimpleStop", true));
        System.out.println(simpleStops.getContainer().get(0).tickets());

        // 3. Überprüfen Sie die Funktionalität der Line-Objekte
        line.add(new Station(10,"Station",42));
        System.out.println(stations.getContainer().get(0).exits());
        simpleStopLine.add(new SimpleStop(12,"SimpleStop", true));
        System.out.println(simpleStops.getContainer().get(0).tickets());

        // 4.
        stops.add(new Station(10,"Station",42));
        stops.add(new SimpleStop(12,"SimpleStop", true));
        Iterator iterator = stops.iterator();
        /*while (iterator.hasNext()){
            System.out.println();
            return iterator.next();
        }*/




    }

    /** Cooperating and responsibilities:
     *
     * Aleksa Glamocanin, e11722602@student.tuwien.ac.at : Creating Test-Data, Creating classes via UML diagram,
     * class Line
     *
     * Ana Kubat, e01651143@student.tuwien.ac.at : Creating UML diagram for the task, classes Simple, Stop, Station
     *
     * Roman Lepilov, e01529676@student.tuwien.ac.at : Creating classes via UML diagram, classes LinkedList, Sequence
     *
     */
}
