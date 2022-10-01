public class Variables2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 5;

        int addResult = 3 + 5;
        System.out.println(addResult);

        int subResult = 3-5;
        int mulResult = 3*5;
        double divResult = 3.0/5;
        int modResult = 5%3;
        System.out.println(divResult);
        System.out.println(modResult);

        int result = (int) Math.pow(3,4);
        System.out.println(result);
        double result2 = Math.sqrt(4);
        System.out.println(result2);

        //묵시적 캐스팅
        long aLong = 3;
        double aDouble = 3.14F;

        //명시적 캐스팅
        int aInt = (int) 234L;
        float aFloat = (float) 3.14;

        String aStr = "Hello, World!";
        String aStr2 = " kim";
        String anotherStr = aStr.toUpperCase();
        System.out.println(aStr+aStr2);
        System.out.println(anotherStr);

    }
}
