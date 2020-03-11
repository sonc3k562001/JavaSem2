package T1908a.lap3.Employee1_4;

public class InvoiceItem {
    private String id;
    private  String desc;
    private  int qty;
    private  double unitPrice;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    public int getQty() {
        return qty;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }
    public InvoiceItem(String id, String desc, double unitPrice,int qty) {
        this.id = id;
        this.desc = desc;
        this.qty =qty;
        this.unitPrice = unitPrice;
    }
    public double getTotal(){
        return unitPrice *qty;
    }
    public String toString(){
        return  "InvoiceItem[ id = \t"+id+",desc=\t"+desc+",uniPrice = \t"+unitPrice+"]";
    }

    public static void main(String[] args) {
        InvoiceItem i1 = new InvoiceItem("Th031","abcxyz",1313,1313);
        System.out.println(i1.toString());
    }

}
