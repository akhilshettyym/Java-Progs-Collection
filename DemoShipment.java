public class DemoShipment {
    public static void main(String[] args)
    {
        Shipment Shipment1 = new Shipment(10,20,15.10,3.41);
        Shipment Shipment2 = new Shipment(2,3.4,0.76,1.28);
        double vol;
        vol = Shipment1.volume();
        System.out.println("vol of the Shipment1"+vol);
        System.out.println("weight of the Shipment1"+Shipment1.weight);
        System.out.println("shipping cost of Shipment1"+Shipment1.cost);
        System.out.println(".");
        vol = Shipment2.volume();
        System.out.println("vol of the Shipment2"+vol);
        System.out.println("weight of the Shipment2"+Shipment2.weight);
        System.out.println("shipping cost of Shipment2"+Shipment2.cost);
        System.out.println(".");
    }
}
class Box
{
    private double width;
    private double height;
    private double depth;
    Box(Box ob)
    {
        width=ob.width;
        height=ob.height;
        depth=ob.depth;
    }
    Box(double w,double h,double d)
    {
        width=w;
        height=h;
        depth=d;
    }
    Box()
    {
        width=-1;
        height=-1;
        depth=-1;
    }
    Box(double len)
    {
        width=height=depth=len;
    }
    double volume()
    {
        return width*height*depth;
    }
}
class BoxWeight extends Box
{
    double weight;
    BoxWeight(BoxWeight ob)
    {
        super(ob);
        weight=ob.weight;
    }
    BoxWeight(double w,double h,double d,double m)
    {
        super(w,h,d);
        weight=m;
    }
    BoxWeight()
    {
        super();
        weight=-1;
    }
    BoxWeight(double len,double m)
    {
        super(len);
        weight=m;
    }
}
class Shipment extends Box
{
    double cost;
    Shipment(Shipment ob)
    {
        super(ob);
        cost=ob.cost;
    }
    Shipment(double w,double h,double d,double m)
    {
        super(w,h,d);
        cost=m;
    }
    Shipment()
    {
        super();
        cost=-1;
    }
    Shipment(double len,double m)
    {
        super(len);
        cost=m;
    }
}