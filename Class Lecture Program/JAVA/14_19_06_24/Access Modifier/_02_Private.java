class Data{
    private String name;

    // it will be returning the name 
    public String getName(){
        return this.name;
    }

    // it will be setting the name
    public void setName(String name){
        this.name = name;
    }
}

class _02_Private {
    public static void main(String[] args) {
        Data d = new Data();
        
        d.setName("Sushant");
        System.out.println(d.getName());
    }
}
