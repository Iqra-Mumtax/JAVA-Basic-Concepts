
abstract class Building {

	private String Name;
	
	Building() {
		
		System.out.println("I am Building.");
	}
	
	public void SetName(String Name) {
		this.Name = Name;
	}
	
	public String GetName() {
		return this.Name;
	}
	
	abstract void Area();
	
}
