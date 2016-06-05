package quadratic;

/**
 * Created by MAN on 15.05.2016.
 */
public class Variable {
    private boolean isEmpty;
    private String name;
    private double value;


    // Methods for set  values of fields
    public void setIsEmpty(boolean flag) { this.isEmpty = flag; }
    public void setName(String name) { this.name = name; }
    public void setValue(double value) { this.value = value; }

    // Methods for  get values of fields
    public boolean getIsEmpty() { return this.isEmpty; }
    public String getName() { return this.name; }
    public double getValue() { return this.value; }

    //Methods for storage
    public void storage(){}

}
