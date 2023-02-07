public class InnerNestedClassEx1 {
	private String name;
	public InnerNestedClassEx1(String name) {
		this.name = name;
	}
	class Prefixer {
		private String prefix;            // this is private member for InnerNestedClassEx1
		private Prefixer(String prefix) { 
			this.prefix = prefix;
		}
		private String getCompleteName() {
			return prefix + " " + name;
		}

	}
	
	static class Suffixer {
		InnerNestedClassEx1 namer = new InnerNestedClassEx1("Doodle");
	    InnerNestedClassEx1.Prefixer prefixer = namer.new Prefixer("Mr.");
		private String suffix;
		private Suffixer(String suffix) {
			this.suffix = suffix;
		}
		private String getCompleteName() {
			return prefixer.getCompleteName() + suffix;
		}
		}
	public static void main(String[] args) {
		InnerNestedClassEx1.Suffixer suffix = new Suffixer("Doctor");
		System.out.println(suffix.getCompleteName());
		System.out.println(suffix.suffix);

	}
}