class Solution {
    public String defangIPaddr(String address) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < address.length(); i++) {
            char charCheck = address.charAt(i);
            if (charCheck == '.') {
                result.append("[.]");
            } else {
                result.append(charCheck);
            }
        }

        return result.toString();
    }
}