package Ex10;

public class Ex10_01_02 {
    public static void main(String[] args) {
        int[] aa = new int[3];
        try {
            aa[2] = 100 / 0;
            aa[3] = 100;

            // Exception 오류 잡이 조상
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("배열 첨자가 배열 크기보다 커요 ~~");
            System.out.println("오류 메세지 : " + e);
        } catch (ArithmeticException e) {
            System.out.println("0으로 나누어서 오류가 발생");
            System.out.println("오류 메세지 : " + e);
        } catch (Exception e) { // catch(Exception e)는 항상 제일 밑에 존재해야한다.
            System.out.println("자바에서 발생되는 모든 에러를 다 잡을 수 있어요.");
            System.out.println("오류 메세지 : " + e);
        }finally {
            System.out.println("정상동작 하던지 오류가 나던지 finally는 무조건 실행된다.");
        }
    }
}
