package test.pack;

import java.util.Arrays;

/**
 * Created by MAN on 03.04.2016.
 */
public class MyDoubleList {
    private Double[] myDoubleList = new Double[5];
    private int doubleSize=0;

    public  int count()
    {
        return this.doubleSize;
    }

    public  Double get(int index)
    {
        if(index>=this.doubleSize)
            {
            throw new ArrayIndexOutOfBoundsException("You can't get element more then you have elements in list");
        }
        return this.myDoubleList[index];
    }

    public void  set(int index,double element)
    {
        if(index>=this.doubleSize)
        {
            throw new ArrayIndexOutOfBoundsException("You can't set element more then you have elements in list");
        }
        this.myDoubleList[index] = element;
    }

    public  void add(double element)
    {
        if (this.doubleSize==this.myDoubleList.length)
        {
            Double[] newList = new Double[this.doubleSize*2];
            for(int i=0;i<this.doubleSize;i++)
            {
                newList[i]=this.myDoubleList[i];
            }
            this.myDoubleList=newList;
        }
        this.myDoubleList[this.doubleSize]=element;
        this.doubleSize++;
    }
    public  void sort(){
        Arrays.sort(this.myDoubleList,0,this.doubleSize);
    }
}
