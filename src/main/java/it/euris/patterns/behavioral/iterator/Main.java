package it.euris.patterns.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        ChannelCollection channels = new ChannelCollectionImpl();
        channels.add(new Channel(100.0, ChannelType.ITALIAN));  // 0
        channels.add(new Channel(101.0, ChannelType.ENGLISH)); // 1
        channels.add(new Channel(102.0, ChannelType.ITALIAN));  // 2
        channels.add(new Channel(103.0, ChannelType.ITALIAN));  // 3
        channels.add(new Channel(104.0, ChannelType.ENGLISH)); // 4

        ChannelIterator it = channels.iterator(ChannelType.ITALIAN);
        while (it.hasNext()){
            Channel c = it.next();
            System.out.println(c);
        }

        // In java puro
        List<String> ss = new ArrayList<>();
        ss.add("a");
        ss.add("b");
        ss.add("c");
        ss.add("a");
        Iterator<String> stringIt = ss.iterator();
        while (stringIt.hasNext()){
            System.out.println(stringIt.next());
        }

    }

}
