public class InnerNestedClass {
	private String name;
	public InnerNestedClass(String name) {
		this.name = name;
	}
	class Prefixer {
		private String prefix;
		private Prefixer(String prefix) {
			this.prefix = prefix;
		}
		public String getCompleteName() {
			return prefix + " " + name;
		}
	}
	public static void main(String[] args) {
		InnerNestedClass namer = new InnerNestedClass("Doodle");
		namer.Prefixer prefixer = namer.new Prefixer("Mr.");
		System.out.println(prefixer.getCompleteName());
	}
}