class payment {
    double  dis, t,cost=500;

    // public void pay(){}
    public void pay1() {
        //cost=cost1;
        if (cost == 500) {
            cost = cost+((cost * 5 )/ 100) - ((cost * 10) / 100);
            System.out.println("Payment now="+cost);
        }
        else if(cost==1000)
        {
            cost = cost+((cost * 7.5 )/ 100) - ((cost * 15 )/ 100);
            System.out.println("Payment now"+cost);
            
        }
        else if(cost==1500)
        {
            cost = cost+((cost * 10)/ 100) - ((cost * 17.2 )/ 100);
            System.out.println("Payment now="+cost);
        }
        else{
            System.out.println("enter the 500,1000,1500 cost");
        }

    }
}

public class pro_1 {
    public static void main(String[] args) {
        payment p=new payment();
        p.pay1();
    }
}
