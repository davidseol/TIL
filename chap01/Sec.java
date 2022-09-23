public class Sec {
    public static void main(String[] args) {
        int x=10;
        int y=20;
        int z = (++x) + (y--);
        System.out.println(z);
    }
}

//++x는 x를 먼저 +1증가 시킨후에 그 값을 사용하니 11
//y--는 y값을 먼저 사용하고 -1감소 시킨다 그래서 20
//
//z값은 31