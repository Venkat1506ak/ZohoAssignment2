class TeamDTO{
    
    
    private String name;
    private String city;
    private String division;

    public TeamDTO(String name, String city, String division) {
        this.name = name;
        this.city = city;
        this.division = division;
    }

    public void playGame(){
        System.out.println(name + " from " + city + " is playing a game!");
    }

    public void hireCoach(){
        System.out.println("A new coach has been hired for " + name);
    }
    
    public static void main(String[] args){
        TeamDTO tt=new TeamDTO("Lakers", "trichy", "South");

        PlayerDTO pt=new PlayerDTO("Venkat", "middle", 7);
        pt.diplayPlayerInformation();
    }
}