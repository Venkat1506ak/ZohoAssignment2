class PlayerDTO {

    
    private String name;
    private String position;
    private int jersy;

    public PlayerDTO(String name, String position, int jersy) {
        this.name = name;
        this.position = position;
        this.jersy = jersy;
    }
    
    public void playGame(){
        System.out.println(name+"is playing at position "+position);
    }

    public void train(){
        System.out.println(name+" is training hard");
    }

    public void diplayPlayerInformation(){
        System.out.println("Name : "+name+",Position : "+position+",Jersy : "+jersy);
    }

}
