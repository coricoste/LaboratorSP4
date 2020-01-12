package align;

import pack.AlignStrategy;
public class LeftAlign implements AlignStrategy{

    public void print(String txt){
        System.out.println("+++++" + txt);
    }
}
