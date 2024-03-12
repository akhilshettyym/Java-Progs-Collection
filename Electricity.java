public class Electricity {
    String ConsumerName;
    int ConsumerNo;
    int pmr;
    int cmr;
    float amount;
    char type;
    int unit;
    void initial(int cNo,String cName,int pmr,int cmr,char type)
    {
        ConsumerNo=cNo;
        ConsumerName=cName;
        pmr=pmr;
        cmr=cmr;
        type=type;
    }
    void process()
    {
        unit=(cmr-pmr);
        if(type=='d')
        {
            if(unit>100)
            {
                amount=unit*1;
            }
            if(unit>100 && unit<200)
            {
                amount=100+(unit-100)*2.50f;
            }
            if(unit>200 && unit<500)
            {
                amount=350+(unit-200)*4;
            }
            if(unit>500)
            {
                amount=1550+(unit-500)*6;
            }
        }
        if(type=='c')
        {
            if(unit>100)
            {
                amount=unit*2;
            }
            if(unit>100 && unit<200)
            {
                amount=200+(unit-100)*4.50f;
            }
            if(unit>200 && unit<500)
            {
                amount=650+(unit-200)*6;
            }
            if(unit>500)
            {
                amount=2450+(unit-500)*7;
            }
        }
    }
    void display()
    {
        System.out.println("Bill Amount:"+amount);
    }
    public static void main(String[] args)
    {
      Electricity e = new Electricity();
      e.initial(1234,"ABCD",1000,3000,'d');
      //  e.initial(5678,"EFGH",1000,4000,'c');
        e.process();
        e.display();

    }
}
