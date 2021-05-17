package Market;

import java.util.Date;

public class Sale extends Main {
    private long number;
    private Product item;
    private Date date;
    private double fee;
    private double code;

    public Sale() {
        this.number = number;
        this.item = item;
        this.date = date;
        this.fee = fee;
        this.code = code;
    }

    public Sale(long number, Product item, Date date, double fee, double code) {
        super();
    }

    public double getCode() {
        return code;
    }

    public void setCode(double code) {
        this.code = code;
    }

    public long getNumber() {
        return number;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public Product getItem() {
        return item;
    }

    public void setItem(Product item) {
        this.item = item;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getFee() {
        return fee;
    }

    public void setFee(double fee) {
        this.fee = fee;
    }


    @Override
    public String toString() {
        return "Sale{" +
                "number=" + number +
                ", item=" + item +
                ", date=" + date +
                ", fee=" + fee +
                ", code=" + code +
                '}';
    }
}
