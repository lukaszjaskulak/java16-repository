package pl.mpas.advanced_programming.abstract_class.stream;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {

    // Todo refactor to builder

    public static void main(String[] args) {


        List<Item> saturdayItems = Arrays.asList(
                new Item("Chleb", BigDecimal.valueOf(2.50),
                        Arrays.asList(new Ingredients("Woda"), new Ingredients("Mąka"), new Ingredients("Zakwas"))),
                new Item("Jajka", BigDecimal.valueOf(7.21),
                        Arrays.asList(new Ingredients("Białko"), new Ingredients("Żółtko"), new Ingredients("Skorupka"))),
                new Item("Cola", BigDecimal.valueOf(4.35),
                        Arrays.asList(new Ingredients("Woda"), new Ingredients("Kokaina"), new Ingredients("Czarna magia"))));

        Order saturdayShopping = new Order(saturdayItems);

        List<Item> sundayItems = Arrays.asList(
                new Item("Chleb razowy", BigDecimal.valueOf(2.50),
                        Arrays.asList(new Ingredients("Woda razowa"), new Ingredients("Mąka razowa"), new Ingredients("Zakwas razowy"))));

        List<Order> orderList = new ArrayList<>();
        orderList.add(saturdayShopping);
        Order sundayShopping = new Order(sundayItems);
        orderList.add(sundayShopping);



        getIngredientsNames(Arrays.asList(saturdayShopping, sundayShopping));



       getPriceForShopping(Arrays.asList(saturdayShopping, sundayShopping));
    }


    public static BigDecimal getPriceForShopping(List<Order> orders){

        return orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .map((item -> item.getPrice()))
                .reduce(BigDecimal.ZERO, (price1, price2) -> price1.add(price2));
    }


    public static List<String> getIngredientsNames(List<Order> orders){

        return    orders.stream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngredientsList().stream())
                .map(Ingredients::getName)
                .distinct()
                .collect(Collectors.toList());
    }

    public static List<String> getIngredientsNamesParallel(List<Order> orders){
                List<String> result = new ArrayList<>();

        return    orders.parallelStream()
                .flatMap(order -> order.getMyItems().stream())
                .flatMap(item -> item.getIngredientsList().stream())
                .map(Ingredients::getName)
                .distinct()
                .reduce(result,
                        ((strings, s) -> {
                            strings.add(s);
                            System.out.println("aaa");
                            System.out.println(strings);
                            return strings;
                        }), ((strings, strings2) -> {
                            strings.addAll(strings2);
                            return strings;}));
        
    }
}