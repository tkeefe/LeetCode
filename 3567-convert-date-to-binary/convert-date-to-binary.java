class Solution {
    public String convertDateToBinary(String date) {
        String[] parts = date.split("-");
        int year = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int day = Integer.parseInt(parts[2]);

        return toBinary(year) + "-" + toBinary(month) + "-" + toBinary(day);
    }

    private String toBinary(int num) {
        return Integer.toBinaryString(num);
    }
}