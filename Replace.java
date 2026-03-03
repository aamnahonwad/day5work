class Replace {
    public static void main(String[] args){
        StringBuffer dev=new StringBuffer("Java Developer");
        dev.replace(0,5,"Python");
        System.out.println(dev);
    }
}
