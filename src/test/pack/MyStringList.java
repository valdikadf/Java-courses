package test.pack;

import java.util.Arrays;

/**
 * Created by Vladyslav Khvorostianyi for training
 */
public class MyStringList {
    private final static String[] emptyArray =  new String[0];

    private String[] myStringList = emptyArray;
    private int stringSize =0;

    public  int count()
    {
        return this.stringSize;
    }

    public boolean equals(MyStringList list)
    {
        if (this==list) return true;
        if (this.stringSize!=list.stringSize) return false;
        for(int i=0;i<this.stringSize;i++){
            if(!this.myStringList[i].equals(list.myStringList[i])) return false;
        }
        return true;
    }

    public String get(int index)
    {
        if(index>=this.stringSize)
        {
            throw new ArrayIndexOutOfBoundsException("You can't get element more then you have elements in list");
        }    
        return this.myStringList[index];
    }

    public  void set(int index,String element)
    {
        if(index>=this.stringSize)
        {
            throw new ArrayIndexOutOfBoundsException("You can't set element more then you have elements in list");
        }
        this.myStringList[index] = element;
    }
    
    public  void add(String element)
    {
        if (this.stringSize ==this.myStringList.length)
        {
            int newSize = this.myStringList.length == 0 ? 4: this.myStringList.length*2;
            String[] newList = new String[newSize];
            for(int i = 0; i<this.stringSize; i++)
            {
                newList[i]=this.myStringList[i];
            }
            this.myStringList =newList;
        }
        this.myStringList[this.stringSize]=element;
        this.stringSize++;
    }
    public  void sort(){
        Arrays.sort(this.myStringList,0,this.stringSize);
    }

    public  void remove( int index,int count){
        if(index>=this.stringSize) throw new IndexOutOfBoundsException("You can,t remove elments from more then you have elments place!");
        if(this.stringSize-index<count) count=this.stringSize-index;
        for(int dstIdx=index, srcIdx = index+count; srcIdx<this.stringSize; srcIdx++, dstIdx++){
            this.myStringList[dstIdx]= this.myStringList[srcIdx];
        }
        for(int i = this.stringSize-1, end=this.stringSize-count; i>=end; i--) this.myStringList[i]=null;
        this.stringSize = this.stringSize - count;

    }

    public void upper(){
        for(int i=0;i<this.stringSize;i++){
            this.myStringList[i] = this.myStringList[i].toUpperCase();
        }
    }
    public boolean find(String text){
        for(int i=0;i<this.stringSize;i++){
            if(this.myStringList[i].equals(text)){
                return true;
            }
        }
        return false;
    }
    public Double findDouble(String text){
        try{
            for(int i=0;i<text.length();i++){
                text.charAt(i);
            }
        }catch (NumberFormatException e){
            return null;
        }
        return null;
    }

    public void lower(){
        for(int i=0;i<this.stringSize;i++){
            this.myStringList[i]=this.myStringList[i].toLowerCase();
        }
    }


}
