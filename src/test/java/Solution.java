class Solution {
    public String solution() {
        return "hello";
    }

    public String convert(String s, int numRows) {
        if (numRows == 1 || s == null || s.length() == 0) {
            return s;
        }
        StringBuilder[] rowBuilders = new StringBuilder[numRows];
        int row = 0;
        int factor = 1;
        for (int i = 0; i < s.length(); i++) {
            if (rowBuilders[row] == null) {
                rowBuilders[row] = new StringBuilder();
            }
            final StringBuilder sb = rowBuilders[row];
            sb.append(s.charAt(i));
            if (row == numRows - 1) {
                factor *= -1;
            } else if (row == 0) {
                factor = +1;
            }
            row += factor;
        }
        final StringBuilder out = new StringBuilder();
        for (StringBuilder rowBuilder : rowBuilders) {
            if (rowBuilder != null) out.append(rowBuilder);
        }
        return out.toString();
    }

}
