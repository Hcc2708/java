public class InnerNestedClassEx {
	private String name;
	public InnerNestedClassEx(String name) {
		this.name = name;
	}
	class Prefixer {
		private String prefix;
		private Prefixer(String prefix) {
			this.prefix = prefix;
		}
		private String getCompleteName() {
			return prefix + " " + name;
		}

	}
	/*static class Suffixer {
		Suffixer(*/
	public static void main(String[] args) {
		InnerNestedClassEx namer = new InnerNestedClass("Doodle");
		InnerNestedClassEx.Prefixer prefixer = namer.new Prefixer("Mr.");
		System.out.println(prefixer.getCompleteName());
	}
}