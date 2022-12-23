package practice;

public class TestProblems {

    protected int x, y;

    public static void main(String[] args) {
        TestProblems t = new TestProblems();
        System.out.println(t.x+" "+t.y);

        double result = 1.0/0.0;

        int result1 = 1/0;

        System.out.println(result1);
    }

}
