class Met{
    public static void main(String[] args) {

        String s = "  Hello Java  ";

        System.out.println("Length = " + s.length());

        System.out.println("Character = " + s.charAt(2));

        System.out.println("Uppercase = " + s.toUpperCase());

        System.out.println("Lowercase = " + s.toLowerCase());

        char[] arr = s.toCharArray();

        System.out.println("Contains Java = " + s.contains("Java"));

        System.out.println("Index of Java = " + s.indexOf("Java"));

        System.out.println("Substring = " + s.substring(2, 7));

        System.out.println("Replace = " + s.replace("Java", "Python"));

        System.out.println("Trim = " + s.trim());
    }
}
