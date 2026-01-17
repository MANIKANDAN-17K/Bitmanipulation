class Solution {
    public String toHex(int num) {
        if(num == 0) return "0";
        String hex = "0123456789abcdef";
        String res = "";
        while(num != 0){
            int rem = num & 15;
            res = hex.charAt(rem) + res;
            num >>>= 4;
        }
        return res;
    }
}
