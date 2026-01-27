package collections;

class Data{
    private Integer num;
   private String name;
   private InternalData internalData;
   Data(int num, String name,int revenue){
    this.num= num;
    this.name = name;
    this.internalData = new InternalData(revenue);
   }
   public Integer getNum() {
    return num;
   }
   public String getName() {
    return name;
   }
   public Integer getRevenue() {
        return internalData.getRevenue();
    }

}

class InternalData{
    private Integer revenue;
    InternalData(int revenue){
        this.revenue=revenue;
    }
    public Integer getRevenue() {
        return revenue;
    }
    
}


public class CollectionsDemo {
    public static void main(String[] args) {
       Data obj1 = new Data(10, "java",500000);
       System.out.println(obj1.getName());
       System.out.println(obj1.getRevenue());

    }
    
}
