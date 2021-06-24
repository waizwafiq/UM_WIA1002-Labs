package past_2019.Q2;

public class SortSalesList {
    private String[] region; //region
    private String[] sales_repr_names; //sales representative name
    private int[] sales_amnt; //sales amount

    public void sortRegion(String[] region) {
        int n = region.length;

        //move the boundary of unsorted sub-array sequentially
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (region[j].compareTo(region[min_idx]) > 0)
                    min_idx = j;

            //Swap minimum element with the first element
            String temp = region[min_idx];
            region[min_idx] = region[i];
            region[i] = temp;
        }

        this.region = region;
    }

    public void sortSalesAmount(int[] sales_amnt) {
        int n = sales_amnt.length, j;

        for (int i = 1; i < n; i++) {
            int key = sales_amnt[i];

            /* Move elements of the unsorted , which are
               greater than key, to one position ahead
               of their current position */
            for (j = i - 1; j >= 0 && sales_amnt[j] > key; j--)
                sales_amnt[j + 1] = sales_amnt[j];

            sales_amnt[j + 1] = key;
        }

        this.sales_amnt = sales_amnt;
    }

    public void sortSalesRepresent(String[] sales_repr_names) {
        int n = sales_repr_names.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (sales_repr_names[j].compareTo(sales_repr_names[j + 1]) > 0) {
                    String temp = sales_repr_names[j];
                    sales_repr_names[j] = sales_repr_names[j + 1];
                    sales_repr_names[j + 1] = temp;
                }
            }
        }

        this.sales_repr_names = sales_repr_names;
    }

    public String[] getRegion() {
        return region;
    }

    public String[] getSales_repr_names() {
        return sales_repr_names;
    }

    public int[] getSales_amnt() {
        return sales_amnt;
    }
}
