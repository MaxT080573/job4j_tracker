package ru.job4j;

import java.time.format.DateTimeFormatter;

public class StartUI {

   public static void main(String[] args) {
   Item item = new Item();
   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MMMM-EEEE-yyyy HH:mm:ss");
   System.out.println(item.getCreated().format(formatter));

}
}