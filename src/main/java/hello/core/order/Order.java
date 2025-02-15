package hello.core.order;

public class Order {

    private Long memberId;
    private String itemName;
    private int itermPrice;
    private int discountPrice;

    public Order(Long memberId, String itemName, int itermPrice, int discountPrice) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.itermPrice = itermPrice;
        this.discountPrice = discountPrice;
    }

    public int calculatePrice() {
        return itermPrice - discountPrice;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getItermPrice() {
        return itermPrice;
    }

    public void setItermPrice(int itermPrice) {
        this.itermPrice = itermPrice;
    }

    public int getDiscountPrice() {
        return discountPrice;
    }

    public void setDiscountPrice(int discountPrice) {
        this.discountPrice = discountPrice;
    }

    @Override
    public String toString() {
        return "Order{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", itermPrice=" + itermPrice +
                ", discountPrice=" + discountPrice +
                '}';
    }
}
