package array03;

public class GuessNum {
	public static void main(String[] args) {

		int[] arr = new int[3]; // 배열 만드는법, 크기가 미리 정해져있어야 한다.
		arr[0] = 1;
		arr[1] = 2;
		arr[2] = 3;

		// try ~ catch - 예외처리
		try {
			for (int i = 0; i < 4; i++) {
				System.out.print(arr[i] + " ");
			}
		} catch (Exception e) {//상속
			System.out.println("배열의 크기를 넘어갔습니다.");
		}

	}

}
