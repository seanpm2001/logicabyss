package ruleml.translator.ruleml2drl;

import java.util.ArrayList;
import java.util.List;

public class DroolsBuilder {
	private static final String RULE_NAME = "#rulename#";
	private static final String WHEN_PART = "#whenpart#";
	private static final String THEN_PART = "#thenpart#";
	private static final String PACKAGE_PART = "#packagepart#";
	private static final String IMPORT_PART = "#importpart#";
	private static final String RULE_PART = "#rulepart#";

	public static final void main(String[] args) {
		Drl drl = new Drl("com.simple", new String[] {
				"com.sample.TestDataModel.*", "asdfd.sss" });
		
		Rule rule = new Rule();
		rule.setRuleName("test");
		rule.setWhenPart(new String[] {"........"});
		rule.setThenPart(new String[] {"---------"});
		drl.addRule(rule);
		
		rule.setRuleName("test");
		rule.setWhenPart(new String[] {"!!!!!!!!!"});
		rule.setThenPart(new String[] {"---------"});
		drl.addRule(rule);
		
		System.out.println(drl);
	}

	public static class Drl {

		private String package_;
		private String[] imports;
		private List<Rule> rules = new ArrayList<Rule>();

		private static String drlPattern = "#packagepart#\n" + "#importpart#\n"
				+ "#rulepart#";

		public Drl(String package_, String[] imports) {
			this.package_ = package_;
			this.imports = imports;
		}

		public void createRule(String ruleName, Object[] whenPart,
				Object[] thenPart) {
			Rule rule = new Rule();
			rule.setRuleName(ruleName);
			rule.setWhenPart(whenPart);
			rule.setThenPart(thenPart);
			rules.add(rule);
		}
		
		public void addRule (Rule rule) {
			rules.add(rule);
		}

		@Override
		public String toString() {
			String result = drlPattern;
			result = result.replace(PACKAGE_PART, "package " + package_);

			String importPart = "";
			for (String import_ : imports) {
				importPart += "import " + import_ + ";\n";
			}
			result = result.replace(IMPORT_PART, importPart);

			String rulePart = "";
			for (Rule rule : rules) {
				rulePart += rule.toString();
			}

			result = result.replace(RULE_PART, rulePart);

			return result;
		}
	}

	public static class Rule {
		private String ruleName;
		public String getRuleName() {
			return ruleName;
		}

		public void setRuleName(String ruleName) {
			this.ruleName = ruleName;
		}

		public Object[] getWhenPart() {
			return whenPart;
		}

		public void setWhenPart(Object[] whenPart) {
			this.whenPart = whenPart;
		}

		public Object[] getThenPart() {
			return thenPart;
		}

		public void setThenPart(Object[] thenPart) {
			this.thenPart = thenPart;
		}

		private Object[] whenPart;
		private Object[] thenPart;

		private static String rulePattern = "rule \"#rulename#\"\n"
				+ "\twhen\n" + "#whenpart#\n" + "\tthen\n" + "#thenpart#\n"
				+ "end\n";

		@Override
		public String toString() {
			String result = rulePattern;
			result = result.replace(RULE_NAME, ruleName);

			// serialize the when part
			String when = "";
			for (Object o : whenPart) {
				when += "\t\t" + o.toString() + "\n";
			}

			// serialize the then part
			String then = "";
			for (Object o : thenPart) {
				then += "\t\t" + o.toString() + "\n";
			}

			// replace in the pattern
			result = result.replace(WHEN_PART, when);
			result = result.replace(THEN_PART, then);

			return result;
		}
	}
}
