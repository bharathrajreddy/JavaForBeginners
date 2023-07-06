package String;

class builder {
    public static void main(String[] args) {
        // Java StringBuilder clas is used to create mutable/modifiable String.
        StringBuilder sb = new StringBuilder("i like coffee");
        sb.append(" and i like programming");
        System.out.println(sb);
        sb.insert(13, " gaming");
        System.out.println(sb);
        sb.replace(27, 31, "love");
        System.out.println(sb);

        sb.delete(14, 21);
        System.out.println(sb);

        String str = sb.toString();
        System.out.println(str);
        StringBuilder sb1 = new StringBuilder(sb);
        sb1.append("new SB");
        System.out.println(sb1);

    }
}
