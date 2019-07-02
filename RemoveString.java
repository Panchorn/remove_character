import java.util.HashMap;

class RemoveString {
    public static void main(String[] args) {
      Long start = System.nanoTime();
      String result = removeString("Hello world!!", "eo");
      System.out.println("result of removeString is " + result);
      System.out.println("using " + (System.nanoTime() - start) + " nano");
    }

    private static String removeString(String content, String keyword) {
        HashMap<Character, Boolean> map = new HashMap<>();
        String result = "";
        for (Character k : keyword.toCharArray()) {
            map.put(k, true);
        }
        for (Character c : content.toCharArray()) {
            if (!map.containsKey(c)) {
                result += c;
            }
        }
        System.out.println(result);
        return result;
    }
}