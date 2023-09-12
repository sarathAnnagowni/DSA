package com.java8.streams.intermediateFunctions;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class MapDemo {
    public static void main(String[] args) {
        Item i1 = new Item("powder", 25.0);
        Item i2 = new Item("book", 35.0);
        Item i3 = new Item("helmet", 1000.0);
        Item i4 = new Item("charger", 125.0);
        List<Item> itemList = new ArrayList<>();
        itemList.add(i1);
        itemList.add(i2);
        itemList.add(i3);
        itemList.add(i4);

        //Get names of items which price > 100
        List<String> itemNames = itemList.stream()
                .filter(item -> item.price > 100)
                .map(Item :: getItem)
                .collect(Collectors.toList());

        List<String> itemNames1 = itemList.stream()
                        .filter(item -> item.price > 100)
                        .map(item -> mapByFunction(item))
                        .collect(Collectors.toList());

        System.out.println(itemNames);

        //sort the names
        List<String> itemNames2 = itemList.stream()
                .map(item -> mapByFunction(item))
                .sorted()
                .collect(Collectors.toList())
                ;
        System.out.println("==================== Sorted");

        System.out.println(itemNames2);

        //find lowest price ITem
        Optional<Double> min = itemList.stream().map(Item::getPrice).min(Double::compare);
      System.out.println("Cheaper Item is  ::  "+min.orElse(10.0));

    }

    public static String  mapByFunction(Item item){
        return item.getItem();

    }
}
class Item{
    String item;
    Double price;

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Item(String item, Double price) {
        this.item = item;
        this.price = price;
    }
}