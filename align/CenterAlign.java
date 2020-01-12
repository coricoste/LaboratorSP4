package align;

import pack.AlignStrategy;

public class CenterAlign implements AlignStrategy{

    public  void print(String txt){
        System.out.println("+++++" + txt + "+++++");
    }
}
