package src.Homework;

public class InterfaceDemo{
    public static void main(String[] args) {
        Goods explosive = null;
        try {
            explosive = new Goods();
            explosive.setIsDanger(true);
            Tool.checkGoods(explosive);
        } catch (goodsException g) {
            g.toPrint();
        }

    }
}

class goodsException extends Exception{
    public void toPrint(){
        System.out.println("该物品是违禁品");
    }
}

class Tool{
    public static void checkGoods(Goods g) throws goodsException {
        if(g.isDanger())
            throw new goodsException();
    }
}

class Goods{
   private String Name;

   public boolean isDanger(){
       return getName() == "海洛因";

   }

   public void setIsDanger(boolean b){
       if(b)
           setName("海洛因");
       else
           setName("咖啡豆");
   }

    public String getName() {
        return Name;
    }

    public void setName(String n) {
        this.Name = n;
    }
}