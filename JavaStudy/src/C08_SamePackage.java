


public class C08_SamePackage {
	
	public int public_var = 1;
	int default_var = 2;	
	protected int protected_var = 1;
	private int private_var = 2;
	
	public void public_var() {
		System.out.println(public_var);
		System.out.println(default_var);
		System.out.println(protected_var);
		System.out.println(private_var);
	};
	void default_var() {};
	protected void protected_var() {};
	private void private_var() {
	};
}