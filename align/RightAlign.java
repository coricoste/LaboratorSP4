package align;

import pack.AlignStrategy;
public class RightAlign implements AlignStrategy{

    public void print(String txt){
        System.out.println(txt + "+++++");
    }
}
