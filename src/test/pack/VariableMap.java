package test.pack;

public class VariableMap{
    private MyList<Variable> varList = new MyList<Variable>(Variable.class);
	
	public  Variable get(String name){
		for(int i = 0;i < varList.count();i++){
			if(name.equals(varList.get(i).name)) return varList.get(i);
		}
        return null;
	}
	
	public int count(){
		return varList.count();
	}
	
	public void add(Variable item){
		for(int i = 0;i < varList.count();i++){
			if(varList.get(i).name.equals(item.name)) {
				varList.get(i).value=item.value;
				varList.get(i).isEmpty = false;
				break;
			}
		}
		varList.add(item);
	}
		
}