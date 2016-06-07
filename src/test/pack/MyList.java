package test.pack;

import java.lang.reflect.Array;
import java.util.Arrays;

// MyList<Variable> varList = new MyList<Variable>(Variable.class)

public class MyList<T>
{
    private final Class type;

    private T[] myStringList;
    private int stringSize = 0;

    public MyList(Class type)
    {
        this.type = type;
        myStringList = (T[]) Array.newInstance(type, 0);
    }

    public int count()
    {
        return this.stringSize;
    }

    public boolean equals(MyList<T> list)
    {
        if (this == list) return true;
        if (this.stringSize != list.stringSize) return false;
        for (int i = 0; i < this.stringSize; i++)
        {
            if (!this.myStringList[i].equals(list.myStringList[i])) return false;
        }
        return true;
    }

    public T get(int index)
    {
        if (index >= this.stringSize)
        {
            throw new ArrayIndexOutOfBoundsException("You can't get element more then you have elements in list");
        }
        return this.myStringList[index];
    }

    public void set(int index, T element)
    {
        if (index >= this.stringSize)
        {
            throw new ArrayIndexOutOfBoundsException("You can't set element more then you have elements in list");
        }
        this.myStringList[index] = element;
    }

    public void add(T element)
    {
        if (this.stringSize == this.myStringList.length)
        {
            int newSize = this.myStringList.length == 0 ? 4 : this.myStringList.length * 2;
            T[] newList = new T[newSize];
            for (int i = 0; i < this.stringSize; i++)
            {
                newList[i] = this.myStringList[i];
            }
            this.myStringList = newList;
        }
        this.myStringList[this.stringSize] = element;
        this.stringSize++;
    }

    public void sort()
    {
        Arrays.sort(this.myStringList, 0, this.stringSize);
    }

    public void remove(int index, int count)
    {
        if (index >= this.stringSize) throw new IndexOutOfBoundsException("You can,t remove elments from more then you have elments place!");
        if (this.stringSize - index < count) count = this.stringSize - index;
        for (int dstIdx = index, srcIdx = index + count; srcIdx < this.stringSize; srcIdx++, dstIdx++)
        {
            this.myStringList[dstIdx] = this.myStringList[srcIdx];
        }
        for (int i = this.stringSize - 1, end = this.stringSize - count; i >= end; i--) this.myStringList[i] = null;
        this.stringSize = this.stringSize - count;

    }
}
