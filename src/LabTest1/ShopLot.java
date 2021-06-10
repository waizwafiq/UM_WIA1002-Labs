package LabTest1;

import java.util.Arrays;

public class ShopLot {
    private String shopName;
    private Person contact_person;
    private Person[] employee;

    public ShopLot(String shopName, Person contact_person, Person[] employee) {
        this.shopName = shopName;
        this.contact_person = contact_person;
        this.employee = employee;
    }

    public int getNumberOfEmployee(){
        return employee.length;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Person getContact_person() {
        return contact_person;
    }

    public void setContact_person(Person contact_person) {
        this.contact_person = contact_person;
    }

    public Person[] getEmployee() {
        return employee;
    }

    public void setEmployee(Person[] employee) {
        this.employee = employee;
    }

    @Override
    public String toString() {
        return "ShopLot{" +
                "shopName='" + shopName + '\'' +
                ", contact_person=" + contact_person +
                ", employee=" + Arrays.toString(employee) +
                '}';
    }
}

class FoodStore<A, B> extends ShopLot implements Comparable<FoodStore<A, B>> {
    private Item<A, B>[] menu;

    public FoodStore(String shopName, Person contact, Item<A, B>[] menu, Person[] employee) {
        super(shopName, contact, employee);
        this.menu = menu;
    }

    @Override
    public int compareTo(FoodStore<A, B> anotherStore) {
        return this.compareTo(anotherStore);
    }

    public boolean equals(FoodStore<A, B> anotherStore) {
        return this.getContact_person().getName().equals(anotherStore.getContact_person().getName());
    }

    public Item<A, B>[] getMenu() {
        return menu;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class FashionStore<A, B> extends ShopLot {
    private Item<A, B>[] clothes;

    public FashionStore(String shopName, Person contact, Item<A, B>[] clothes, Person[] employee) {
        super(shopName, contact, employee);
        this.clothes = clothes;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}

class ShoppingMall {
    public static void main(String[] args) {

        /*THIS IS FOR THE FOOD STORES IN THE SHOP LOT
         * IT HAS THESE ATTRIBUTES:
         * 1) The contact's details
         * 2) The menu
         * 3) The employee's details
         * */
        ShopLot[] foodStores = new ShopLot[3];

        Person contact1 = new Person("Mike", "0101122334");
        Item<String, Double>[] menu1 = new Item[]{new Item("Burger", 10), new Item("Friend Chicken", 12)};
        Person[] employee1 = new Person[]{new Person("Jack"), new Person("Jane")};
        foodStores[0] = new FoodStore<String, Double>("McDonalds", contact1, menu1, employee1);

        Person contact2 = new Person("Max", "0112233445");
        Item<String, Double>[] menu2 = new Item[]{new Item("Chicken Katsu Don", 15), new Item("Ramen", 12)};
        Person[] employee2 = new Person[]{new Person("Adam"), new Person("Alex"), new Person("Andrew")};
        foodStores[1] = new FoodStore<String, Double>("Sushi Mentai", contact2, menu2, employee2);

        Person contact3 = new Person("Mike", "0101122334");
        Item<String, Double>[] menu3 = new Item[]{new Item("Ayam Penyet", 10)};
        Person[] employee3 = new Person[]{new Person("Lex"), new Person("Leon")};
        foodStores[2] = new FoodStore<String, Double>("Waroeng Penyet", contact3, menu3, employee3);

        /*THIS IS FOR THE FASHION STORES IN THE SHOP LOT
         * IT HAS THESE ATTRIBUTES:
         * 1) The contact's details
         * 2) The clothes
         * 3) The employee's details
         * */
        ShopLot[] fashionStores = new ShopLot[3];

        Person contact11 = new Person("Nate", "0199988776S");
        Item<String, Double>[] clothes1 = new Item[]{new Item("Shirt", 80), new Item("T-shirt", 60)};
        Person[] employee11 = new Person[]{new Person("Kate"), new Person("Ken"), new Person("Kurt")};
        fashionStores[0] = new FashionStore<String, Double>("Uniqlo", contact11, clothes1, employee11);

        Person contact22 = new Person("Nick", "0195544332");
        Item<String, Double>[] clothes2 = new Item[]{new Item("Blouse", 100), new Item("Skirt", 80)};
        Person[] employee22 = new Person[]{new Person("Frank"), new Person("Felix")};
        fashionStores[1] = new FashionStore<String, Double>("Padini", contact22, clothes2, employee22);

        Person contact33 = new Person("Nicole", "0194433221");
        Item<String, Double>[] clothes3 = new Item[]{new Item("Dress", 100)};
        Person[] employee33 = new Person[]{new Person("Ron"), new Person("John")};
        fashionStores[2] = new FashionStore<String, Double>("Mango", contact33, clothes3, employee33);


        /*TESTING*/
        System.out.println(foodStores[1].toString()+"\n");

        System.out.println(fashionStores[2].toString());

        //compare if McDonalds and Sushi Mentai have the same contact person.
        System.out.print("\nThe contact person for McDonalds and Sushi Mentai is equal? : ");
        System.out.println(foodStores[0].getContact_person().getName().equals(foodStores[1].getContact_person().getName()));

        //compare if McDonalds and Waroeng Penyet have the same contact person.
        System.out.print("\nThe contact person for McDonalds and Waroeng Penyet is equal? : ");
        System.out.println(foodStores[0].getContact_person().getName().equals(foodStores[2].getContact_person().getName()));

        //compare most employees
        System.out.println("Between Sushi Mentai and Waroeng Penyet: "+mostEmployee(foodStores[1], fashionStores[2])+ " has the most employees");

    }

    public static String mostEmployee(ShopLot store1, ShopLot store2) {
        if(store1.getNumberOfEmployee() > store2.getNumberOfEmployee())
            return store1.getShopName();
        else
            return store2.getShopName();
    }
}

