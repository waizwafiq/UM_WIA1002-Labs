package past_2019.Q2;

public class Tester {
    public static void main(String[] args) {
        String[] region = new String[7];
        String[] sales_repr_names = new String[7];
        int[] sales_amnt = new int[7];

        region[0] = "Asia";         sales_repr_names[0] = "Ahmad"; sales_amnt[0] = 450;
        region[1] = "Europe";       sales_repr_names[1] = "Hemish"; sales_amnt[1] = 518;
        region[2] = "Europe";       sales_repr_names[2] = "Banny"; sales_amnt[2] = 650;
        region[3] = "Greenland";    sales_repr_names[3] = "Ain"; sales_amnt[3] = 200;
        region[4] = "Asia";         sales_repr_names[4] = "Ali"; sales_amnt[4] = 390;
        region[5] = "Greenland";    sales_repr_names[5] = "Ben"; sales_amnt[5] = 670;
        region[6] = "Asia";         sales_repr_names[6] = "Lee"; sales_amnt[6] = 790;

        SalesList aaa = new SalesList(region, sales_repr_names, sales_amnt);
        SortSalesList s = new SortSalesList(aaa);

        System.out.println("Original Data:\n"+aaa);
        s.sortRegion();
        System.out.println("\nSorting result on region using Selection Sort:\n" + s);
        s.sortSalesAmount();
        System.out.println("\nSorting result on sales using Insertion Sort:\n" + s);
        s.sortSalesRepresent();
        System.out.println("\nSorting result on SalesRep using Bubble Sort:\n" + s);
    }
}
