class AddBinary {
    String add(String a, String b) {

        if (a == null || b == null) return "";

        int first = a.length() - 1;
        int second = b.length() - 1;

        StringBuilder sb = new StringBuilder();
        int temp = 0;

        while (first >= 0 || second >= 0) {
            int sum = temp;
            if (first >= 0) {
                sum += a.charAt(first) - '0';
                first--;
            }
            if (second >= 0) {
                sum += b.charAt(second) - '0';
                second--;
            }
            temp = sum >> 1;
            sum = sum & 1;
            sb.append(sum == 0 ? '0' : '1');
        }
        if (temp > 0) {
            sb.append('1');
        }
        return String.valueOf(sb.reverse());
    }
}