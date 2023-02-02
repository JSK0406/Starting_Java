
public class MultithreadExample3 {
	public static void main(String args[]) {
        SmallLetters obth = new SmallLetters();
		Thread thread = new Thread(obth));
        thread.start();  
        char arr[] = { 'ㄱ', 'ㄴ', 'ㄷ', 'ㄹ', 'ㅁ', 'ㅂ', 'ㅅ', 
                       'ㅇ', 'ㅈ', 'ㅊ', 'ㅋ', 'ㅌ', 'ㅍ', 'ㅎ' };
        for (char ch : arr)
            System.out.print(ch);
    }
}
