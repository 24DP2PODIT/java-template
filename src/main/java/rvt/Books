package rvt;

import java.util.*;

public class books {

public static void exBooks(){

Scanner input = new Scanner(System.in);

ArrayList title = new ArrayList<>();
ArrayList pageCount = new ArrayList<>();
ArrayList pubYear = new ArrayList<>();



while (true){
System.out.print("Title(Empty string to stop): ");
String inputTitle = input.nextLine();
if (input.equals("")){
break;
}
title.add(inputTitle);
System.out.print("Pages: ");
pageCount.add(Integer.valueOf(input.nextLine()));

System.out.print("Publication year: ");
pubYear.add(Integer.valueOf(input.nextLine()));


}
System.out.print("What to display?: ");
String whatToPrint = input.nextLine();
if (whatToPrint.equals("Everything")){
for (int i = 0; i System.out.println("Title: " + (title.get(i)));
System.out.println("Page count: " + (pageCount.get(i)));
System.out.println("Publication year: " + (pubYear.get(i)));
}

}else if(whatToPrint.equals("Title")){
for (int i = 0; i System.out.println("Title: " + (title.get(i)));
}
}else if(whatToPrint.equals("Publication year")){
for (int i = 0; i System.out.println("Publication year: " + (pubYear.get(i)));
}
}else if(whatToPrint.equals("Page count")){
for (int i = 0; i System.out.println("Page count: " + (pageCount.get(i)));
}
}


}
}
