package com.megha;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExp {

	public static void main(String... args) {

		String a = "I am a STring. yes I am";

		System.out.println(a);

		String b = a.replaceAll("I", "You");

		System.out.println(b);

		String alphanumeric = "jahfh176473ggfshjgf78232";

		System.out.println(alphanumeric.replaceAll(".", "Y"));

		System.out.println(alphanumeric.replaceAll("^jahfh", "1"));

		String secondString = "aa1276aa87aa";

		System.out.println(secondString.replaceAll("^aa", "bb"));

		System.out.println("q".matches("[^1]"));

		System.out.println(secondString.replaceAll("aa$", "qq"));

		System.out.println(alphanumeric.replaceAll("[^h]", "0"));

		String s = "dfsdhajhhgHGHSFGUTER67545";

		System.out.println(s.replaceAll("[a-f]", "X"));

		System.out.println(s.replaceAll("[a-fA-F]", "X"));

		System.out.println(s.replaceAll("(?i)[a-f]", "X"));

		System.out.println(s.replaceAll("[0-9]", "X"));

		System.out.println(s.replaceAll("\\d", "X"));

		System.out.println(s.replaceAll("\\D", "X"));

		String hasWhitespace = "I has whitespace\t a tab and also new line\n";

		System.out.println(hasWhitespace);

		System.out.println(hasWhitespace.replaceAll("\\s", "0"));
		System.out.println(hasWhitespace.replaceAll("\\S", "0"));

		String word = "asdjWUYEUI 8785345";

		System.out.println(word.replaceAll("\\w", "0"));
		System.out.println(word.replaceAll("\\W", "0"));

		System.out.println(hasWhitespace.replaceAll("\\w", "0"));

		System.out.println(hasWhitespace.replaceAll("\\W", "0"));

		System.out.println(hasWhitespace.replaceAll("\\b", "0"));

		// Quantifiers

		String g = "aasfgggfkjhkgj766574765";

		System.out.println(g.replaceAll("^aasfggg", "1"));

		System.out.println(g.replaceAll("^aasfg{3}", "1")); // 3 g

		System.out.println(g.replaceAll("^aasfg+", "1")); // any no. of g

		System.out.println(g.replaceAll("^aasfg*", "1")); // g is optional

		System.out.println(g.replaceAll("^aasfg{2,5}", "1"));

		System.out.println("END");

		String regex = ".*animal.*";

		String essay = "In the world there are two living things. One is animal and other is plants. There are two kind of animals wild and pet animals.";

		Pattern pattern = Pattern.compile(regex);

		Matcher matcher = pattern.matcher(essay);

		System.out.println(matcher.matches());

		String sample = "ahjjghfg ajhjggh";

		Pattern pattern2 = Pattern.compile("(a)");

		Matcher matcher2 = pattern2.matcher(sample);

		while (matcher2.find()) {

			System.out.println("gfhg:  " + matcher2.group());
		}
		String p = "okok-orokok okokok";

		Pattern pattern3 = Pattern.compile("(ok){3}.");

		Matcher matcher3 = pattern3.matcher(p);

		System.out.println(matcher3.find());

		// logical operators

		String logical = "thtvtnt";

		String loString = "t(?=v)";
		Pattern logPattern = Pattern.compile(loString);

		Matcher loMatcher = logPattern.matcher(logical);

		int count = 0;
		while (loMatcher.find()) {
			count++;
			System.out.println("occurences: " + count + " :: " + loMatcher.start() + " :: " + loMatcher.end());
		}

		// (123) 546-6765 USA phone number

		String phone = "^[\\(]\\d{3}[\\)]\\s\\d{3}\\-\\d{4}$";

		System.out.println("534535435".matches(phone));
	}
}
