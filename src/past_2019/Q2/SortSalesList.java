package past_2019.Q2;

public class SortSalesList {
    private String[] region; //region
    private String[] sales_repr_names; //sales representative name
    private double[] sales_amnt; //sales amount

    public void sortRegion(String[] unsorted) {
        int n = unsorted.length;

        //move the boundary of unsorted sub-array sequentially
        for (int i = 0; i < n - 1; i++) {
            // Find the minimum element in unsorted array
            int min_idx = i;
            for (int j = i + 1; j < n; j++)
                if (unsorted[j].compareTo(unsorted[min_idx]) > 0)
                    min_idx = j;

            //Swap minimum element with the first element
            String temp = unsorted[min_idx];
            unsorted[min_idx] = unsorted[i];
            unsorted[i] = temp;
        }

        this.region = unsorted;
    }

    public void sortSalesAmount(double[] unsorted) {
        int n = unsorted.length, j;

        for (int i = 1; i < n; i++) {
            double key = unsorted[i];

            /* Move elements of the unsorted , which are
               greater than key, to one position ahead
               of their current position */
            for (j = i - 1; j >= 0 && unsorted[j] > key; j--)
                unsorted[j + 1] = unsorted[j];

            unsorted[j + 1] = key;
        }

        this.sales_amnt = unsorted;
    }




}
