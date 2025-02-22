package Exceptions;

public class Custome_Exceptions_Bank {
    private String currency;
    private Integer amount;

    public Custome_Exceptions_Bank(String currency, Integer amount) {
        this.currency = currency;
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer add(Custome_Exceptions_Bank bankName) {
        if (bankName.currency.equalsIgnoreCase("INR")) {
            return bankName.amount + this.amount;
        } else {
            try {
                throw new Exception("Currency Mismatch");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        return 0;
    }
}
