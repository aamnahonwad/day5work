class BuilderReplace {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Java Developer");
        sb.replace(0, 4, "Python");
        System.out.println(sb);
    }
}
