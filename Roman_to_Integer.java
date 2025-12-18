class Solution {
    public int romanToInt(String s) {
        int total = 0;
        int prev = 0;

        for (int i = s.length() - 1; i >= 0; i--) {
            int curr;
            switch (s.charAt(i)) {
                case 'I': curr = 1; break;
                case 'V': curr = 5; break;
                case 'X': curr = 10; break;
                case 'L': curr = 50; break;
                case 'C': curr = 100; break;
                case 'D': curr = 500; break;
                default: curr = 1000; // 'M'
            }

            if (curr < prev) total -= curr;
            else total += curr;

            prev = curr;
        }
        return total;
    }
}
