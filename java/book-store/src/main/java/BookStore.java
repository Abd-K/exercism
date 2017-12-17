import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookStore {
    private final static int bookPrice = 8;
    private double finalCost;
    Map<Integer, Integer> basketBooksList = new HashMap<Integer, Integer>();

    public double calculateBasketCost(List<Integer> books) {
        countBooksInBasket(books);
        applyDiscountToBasket( 0);
        return finalCost;
    }

    //recursive function
    private void applyDiscountToBasket(double cost) {
        //loop till 0
        if(basketBooksList.size() == 0) {
            finalCost = cost;
        } else {
            //count num of books left
            int bookSetSize = basketBooksList.size();
            applyDiscountToBasket(calculateCost(cost, getDiscountFactor(bookSetSize), bookSetSize));
        }
    }

    private double calculateCost(double cost, int discountFactor, int bookSetSize) {
        removeDiscountedBooksFromBasket();
        return cost + (bookSetSize * bookPrice * (1.00-discountFactor/100.00));
    }

    //deduct one from all
    private void removeDiscountedBooksFromBasket() {
        basketBooksList.entrySet().forEach(entry -> basketBooksList.put(entry.getKey(), entry.getValue()-1));
        basketBooksList.entrySet().removeIf(entry -> entry.getValue().equals(0));
    }

    //apply discount by num of books left
    private int getDiscountFactor(int bookSetSize) {
        switch(bookSetSize) {
            case 2:
                return 5;
            case 3:
                return 10;
            case 4:
                return 20;
            case 5:
                return 25;
            default:
                return 0;
        }
    }

    //fill basket with count for each book
    private void countBooksInBasket(List<Integer> books) {
        for (Integer book: books) {
            if(basketBooksList.containsKey(book)) {
                basketBooksList.put(book, Integer.valueOf(basketBooksList.get(book)+1));
            } else {
                basketBooksList.put(book, 1);
            }
        }
    }
}
