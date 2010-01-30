package no.stoyle.strange;
public class TypeInference {

	public static void main(String args[]) {

		new TypeInference() {
			public void doIt() {
				System.out.println("Doing it");
			}
		}.doIt();

		TypeInference typeInference = new TypeInference() {
			public void doIt() {
				System.out.println("Unreachable");
			}
		};
		// typeInference.doit();
	}

}
