class BitWise {
    public static void main(String[] args) {
        int a = 5, b = 6;
        System.out.println("************ THE BITWISE OPERATORS ************");
        System.out.println("THE VALUES: a = " + a + ", b = " + b);
        System.out.println("THE (a|b) OR: " + (a | b));
        System.out.println("THE (a&b) AND: " + (a & b));
        System.out.println("THE (a^b) XOR: " + (a ^ b));
        System.out.println("THE (a<<1) LEFT SHIFT: " + (a << 1));
        System.out.println("THE (a>>1) RIGHT SHIFT: " + (a >> 1));

        System.out.println("************ THE RELATIONAL OPERATORS ************");
        System.out.println("THE VALUES: a = " + a + ", b = " + b);
        System.out.println("THE (>=) OPERATOR: " + (a >= b));
        System.out.println("THE (<=) OPERATOR: " + (a <= b));
        System.out.println("THE (<) OPERATOR: " + (a < b));
        System.out.println("THE (>) OPERATOR: " + (a > b));

        System.out.println("*********** THE UNARY OPERATOR ************");
        System.out.println("THE VALUES: a = " + a + ", b = " + b);
        System.out.println(" THE (++a): " + (++a) + " AFTER: " + a);
        System.out.println(" THE (b++): " + (b++) + " AFTER: " + b);
        System.out.println(" THE (a++)+(++b): " + ((a++) + (++b)));
        System.out.println(" THE (a++)+(++b)-(a++)+(b++): " + ((a++) + (++b) - (a++) + (b++)));
        
        System.out.println("********** THE TERNARY OPERATOR **********");
        System.out.println("THE ? : OPERATOR: "+((a>=b)? true : false));
        
        
    }
}

