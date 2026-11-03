public static void main(String[] args) {
    MyStringBuilder sb = new MyStringBuilder("Hello");
    System.out.println(sb);

    sb.append(" World");
    System.out.println(sb);

    sb.append("!");
    System.out.println(sb);

    sb.undo();
    System.out.println(sb);

    sb.undo();
    System.out.println(sb);
}