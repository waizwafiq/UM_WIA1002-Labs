package past_2019.Q2;

public class SortSalesList {
    private String[] region; //region
    private String[] sales_repr_names; //sales representative name
    private int[] sales_amnt; //sales amount

    public SortSalesList(SalesList list) {
        this.region = list.getRegion();
        this.sales_amnt = list.getSales_amnt();
        this.sales_repr_names = list.getSales_repr_names();

    }

    public void sortRegion() {
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

            String temp1 = this.sales_repr_names[min_idx];
            this.sales_repr_names[min_idx] = this.sales_repr_names[i];
            this.sales_repr_names[i] = temp1;

            int temp2 = this.sales_amnt[min_idx];
            this.sales_amnt[min_idx] = this.sales_amnt[i];
            this.sales_amnt[i] = temp2;
        }
    }

    public void sortSalesAmount() {
        int n = sales_amnt.length, j;

        for (int i = 1; i < n; i++) {
            int key = sales_amnt[i];
            String key1 = sales_repr_names[i];
            String key2 = region[i];

            /* Move elements of the unsorted , which are
               greater than key, to one position ahead
               of their current position */
            for (j = i - 1; j >= 0 && sales_amnt[j] > key; j--) {
                sales_amnt[j + 1] = sales_amnt[j];
                sales_repr_names[j + 1] = sales_repr_names[j];
                region[j + 1] = region[j];
            }

            sales_amnt[j + 1] = key;
            sales_repr_names[j + 1] = key1;
            region[j + 1] = key2;
        }

    }

    public void sortSalesRepresent() {
        int n = sales_repr_names.length;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - j - 1; j++) {
                if (sales_repr_names[j].compareTo(sales_repr_names[j + 1]) > 0) {
                    String temp = region[j + 1];
                    region[j + 1] = region[j];
                    region[j] = temp;

                    String temp1 = this.sales_repr_names[j + 1];
                    this.sales_repr_names[j + 1] = this.sales_repr_names[j];
                    this.sales_repr_names[j] = temp1;

                    int temp2 = this.sales_amnt[j + 1];
                    this.sales_amnt[j + 1] = this.sales_amnt[j];
                    this.sales_amnt[j] = temp2;
                }
            }
        }
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

    @Override
    public String toString() {
        SalesList sorted = new SalesList(region, sales_repr_names, sales_amnt);
        return sorted.toString();
    }
}
