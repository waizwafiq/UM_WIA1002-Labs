package past_2019.Q2;

public class SalesList {
    private String[] region; //region
    private String[] sales_repr_names; //sales representative name
    private int[] sales_amnt; //sales amount

    public SalesList() {
    }

    public SalesList(String[] region, String[] sales_repr_names, int[] sales_amnt) {
        this.region = region;
        this.sales_repr_names = sales_repr_names;
        this.sales_amnt = sales_amnt;
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

    public void setRegion(String[] region) {
        this.region = region;
    }

    public void setSales_repr_names(String[] sales_repr_names) {
        this.sales_repr_names = sales_repr_names;
    }

    public void setSales_amnt(int[] sales_amnt) {
        this.sales_amnt = sales_amnt;
    }
}
