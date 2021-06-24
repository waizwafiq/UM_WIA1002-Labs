package past_2019.Q2;

public class SalesList {
    private String[] region; //region
    private String[] sales_repr_names; //sales representative name
    private double[] sales_amnt; //sales amount

    public SalesList() {
    }

    public SalesList(String[] region, String[] sales_repr_names, double[] sales_amnt) {
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

    public double[] getSales_amnt() {
        return sales_amnt;
    }

    public void setRegion(String[] region) {
        this.region = region;
    }

    public void setSales_repr_names(String[] sales_repr_names) {
        this.sales_repr_names = sales_repr_names;
    }

    public void setSales_amnt(double[] sales_amnt) {
        this.sales_amnt = sales_amnt;
    }
}
