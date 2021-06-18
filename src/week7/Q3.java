package week7;

/**
  The capital gain/loss when 1 share of common stock of a company is sold:
  Capital gain/loss = (Sell price) - (Buy price)
  <p>
  The capital gain/loss when multiple shares are sold:
  - Use FIFO protocol (Queue)
  -> The shares sold are the ones that have been held the longest.
  <p>
  Concept:
  There are two queues, one holds the amount of shares bought
  and the other one holds the 'buy' price of the day the shares were bought.
  An example is given below, (+ve: buy; -ve: sell; ps: per share)
  Day 1, +100, $20ps
  Day 2,  +20, $24ps
  Day 3, +200, $36ps
  Day 4, -150, $30ps
  <p>
  Shares queue   :  -> | 200 | 20 | 100 | ->
  Buy price queue:  -> |  36 | 24 |  20 | ->
  <p>
  When we're selling 150 shares for $30ps, (in shares queue) we'd dequeue/peek 100 shares from the first element,
  20 shares from the second element, and 30 shares from the last element (the element will become 200 - 30 = 170)
  <p>
  Then, we'll dequeue/peek the buy price queue for all the shares sold.
  <p>
  Using the formula for single share (the one at the top):
  capital gain/loss = (100 * (30-20)) + (20 * (30-24)) + (30 * (30-36))
  capital gain = $940
  <p>
  The queue will become:
  Shares queue   :  -> | (200 - 30) | ->
  Buy price queue:  -> |  36 | ->

  @author Waiz Wafiq
 */

import java.util.InputMismatchException;
import java.util.Scanner;

class Capital {
    private static MyQueue<Integer> shares_q = new MyQueue<>();
    private static MyQueue<Double> prices_q = new MyQueue<>();
    private static double capital;

    public static void main(String[] args) {
        Scanner keyIn = new Scanner(System.in);
        String query;

        do {
            System.out.print("Enter your query (In format 'Buy / Sell x shares at $y each'): ");
            query = keyIn.nextLine();
            if (query.equalsIgnoreCase("exit"))
                break;

            String[] opt = query.split(" ");

            //opt[1]: amount of shares, opt[4]: price per share (transform string to int and double)
            int shares = Integer.parseInt(opt[1]);
            double price = Double.parseDouble(opt[4].replace("$", ""));

            if (opt[0].equalsIgnoreCase("buy")) {
                buyShare(shares, price);
            } else if (opt[0].equalsIgnoreCase("sell")) {
                sellShare(shares, price);
            } else
                throw new InputMismatchException("Wrong input!");
        } while (true);
    }

    private static void buyShare(int sharesToBuy, double buyPrice) {
        System.out.println("Buying now...");
        shares_q.enqueue(sharesToBuy);
        prices_q.enqueue(buyPrice);

        System.out.print("Queue for Shares: ");
        shares_q.display();

        System.out.print("Queue for Prices: ");
        prices_q.display();
    }

    private static void sellShare(int sharesToSell, double sellPrice) {
        System.out.println("Selling the shares now...");

        if (shares_q.isEmpty() || sharesToSell == 0) {
            System.out.println("No shares to sell!");
            return;
        }

        //TO AVOID NullPointerException when sharesToSell > shares_q.peek() and there's only 1 element in queue
        if (sharesToSell >= shares_q.peek() && shares_q.getSize() == 1) {
            capital += shares_q.peek() * (sellPrice - prices_q.dequeue());
            sharesToSell -= shares_q.dequeue(); //update the value while removing the shares queue

            System.out.print("Queue for Shares: ");
            shares_q.display();

            System.out.print("Queue for Prices: ");
            prices_q.display();

            System.out.println("Total Capital Gain/Loss: " + capital);
            return;
        }

        do {
            if (sharesToSell < shares_q.peek()) {
                shares_q.set(0, shares_q.peek() - sharesToSell);
                capital += sharesToSell * (sellPrice - prices_q.peek());

                sharesToSell = 0; //update the value
            } else if (sharesToSell >= shares_q.peek()) {
                capital += shares_q.peek() * (sellPrice - prices_q.dequeue());

                sharesToSell -= shares_q.dequeue(); //update the value while removing the shares queue
            }
        } while (sharesToSell > 0);

        System.out.print("Queue for Shares: ");
        shares_q.display();

        System.out.print("Queue for Prices: ");
        prices_q.display();

        System.out.println("Total Capital Gain/Loss: " + capital);
    }
}