package no.stoyle.strange;

public class GenericFactory<T, U> {

	private final T t;
	private final U u;

	public GenericFactory(T t, U u){
		this.t = t;
		this.u = u;
	}
	
	public static <T,U> GenericFactory<T,U> nw(T t, U u) {
		return new GenericFactory<T, U>(t, u);
	}

	public static void main(String[] args) {
		GenericFactory<String, Integer> type = new GenericFactory<String, Integer>("String", 1);
		
		GenericFactory<String, Integer> type2 = GenericFactory.nw("String", 1);
	}
	
}
