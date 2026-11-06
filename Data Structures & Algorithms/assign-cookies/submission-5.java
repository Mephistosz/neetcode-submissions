class Solution {
    public int findContentChildren(int[] children, int[] cookies) {

        int start = 0;
        int end = children.length;
        int currentCookie = -1;
        int res = 0;

        Arrays.sort(children);
        Arrays.sort(cookies);

        while (start < end) {
            currentCookie++;

            if (currentCookie > cookies.length - 1) {
                currentCookie = -1;
                start++;
                continue;
            }

            if (cookies[currentCookie] >= children[start]) {
                cookies[currentCookie] = 0;
                currentCookie = -1;
                start++;
                res++;
            }
        }

        return res;
    }
}

