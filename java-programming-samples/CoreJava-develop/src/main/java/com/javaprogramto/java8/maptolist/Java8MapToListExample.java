    package com.javaprogramto.java8.maptolist;

    import java.util.HashMap;
    import java.util.List;
    import java.util.Map;
    import java.util.stream.Collectors;

    public class Java8MapToListExample {

        public static void main(String[] args) {

            Map<Integer, String> numbers = new HashMap<>();

            numbers.put(10, "ten");
            numbers.put(20, "twenty");
            numbers.put(30, "thirty");
            numbers.put(41, "forty one");
            numbers.put(50, "fifty");

            //java 8 - convert all keys to map
            List<Integer> keysList = numbers.keySet().stream().collect(Collectors.toList());

            System.out.println("Map keys List :");

            for (Integer integer : keysList) {
                System.out.println(integer);
            }

            // java 8 - convert all keys to map
            List<String> valuesList = numbers.values().stream().collect(Collectors.toList());

            System.out.println("Map values list :");

            for (String s : valuesList) {
                System.out.println(s);
            }

            System.out.println("removing odd even fruit id's as list : ");

            List<Integer> evenList = numbers.keySet().stream().filter(id -> id % 2 == 0).collect(Collectors.toList());
            evenList.forEach(id -> System.out.println(id));
        }
    }
