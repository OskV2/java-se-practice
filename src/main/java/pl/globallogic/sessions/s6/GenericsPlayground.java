package pl.globallogic.sessions.s6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GenericsPlayground {
    public static void main(String[] args) {
        List<Integer> nonGenericList = new ArrayList(); // generic list
        HashMap map1 = new HashMap(); // non-generic map

        map1.put("a1", 1);
        map1.put(2, "s1");

        nonGenericList.add(1);
//        nonGenericList.add("String");
//        nonGenericList.add(new int[]{1,2,3,4,5});  CANNOT ADD IT BECAUSE ITS INTEGER LIST

//        for (Object item : nonGenericList) {
//            System.out.println((Integer) item);
//        }  THIS WILL THROW AN ERROR

//        printUppercaseWords(nonGenericList);  CANNOT USE THIS FUNCTION WITH THIS LIST BECAUSE I HAVE INTEGER LIST AND FUNCTION NEEDS STRING LIST


        //  BOX
        Box<String> stringBox = new Box<>();  //  USAGE OF GENERIC CLASS
        stringBox.set("Banana");
        System.out.println(stringBox.get());

        Box<List<String>> listBox = new Box<>();
        listBox.set(List.of("some", "string"));
        System.out.println(listBox.get());

        //  GENERIC LIST
        OurGenericList<String> ourList = new OurGenericClassImpl<>();
        ourList.add("One");
        ourList.add("Two");
        System.out.println(ourList.get(0).equals("one"));


        //  COLLECTION UTIL
        List<Integer> intList = new ArrayList<>(Arrays.asList(new Integer[5]));
        OurCollectionUtil.fill(intList, 7);
        System.out.println(intList);

        List<String> stringList = new ArrayList<>(Arrays.asList(new String[5]));
        OurCollectionUtil.fill(stringList, "Ok");
        System.out.println(stringList);


        //  DOUBLE VALUE SUPPLIER
        DoubleValueSupplier<Integer> fromIntSupplier = new DoubleValueSupplier<>();
        DoubleValueSupplier<Float> fromFloatSupplier = new DoubleValueSupplier<>();
        DoubleValueSupplier<Short> fromShortSupplier = new DoubleValueSupplier<>();
//        DoubleValueSupplier<String> fromStringSupplier = new DoubleValueSupplier<String>();  CANNOT DO THAT BECAUSE I EXTEND NUMBER IN MY DOUBLE VALUE SUPPLIER OBJECT

        fromIntSupplier.set(10);
        fromFloatSupplier.set(13.56f);
        fromShortSupplier.set((short) 26);
        System.out.println(fromIntSupplier.getDoubleFromValue() + " " + fromFloatSupplier.getDoubleFromValue() + " " + fromShortSupplier.getDoubleFromValue());
    }

    public static void printUppercaseWords(List<String> words) {
        for (Object word : words) {
            if (word instanceof String) {
                System.out.println(((String)word).toUpperCase());
            } else continue;
        }
    }
}
