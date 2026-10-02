
class Solution {
    public static void main(String[] args) {
        var a = isPalindrome(1);
        System.out.println(a);
    }

    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        ArrayList<Integer> list = new ArrayList<>();

        int z = x;
        
        while (z > 0) {
            var mod = z % 10;
            var div = z / 10;
            z = div;

            list.add(mod);
        }

        System.out.println(list);

        int numberToReturn = 0;

        for (int i = 0; i < list.size(); i++) {

            if (i == 0) {
                numberToReturn = list.get(i);
                continue;
            }

            numberToReturn = (numberToReturn * 10) + list.get(i);
        }

        return numberToReturn == x;
    }
}