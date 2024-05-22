

// Player & PlayerBuilder

class Player
{
    private final String id;
    private final String name;
        

    private Player(PlayerBuilder builder)
    {
        this.id = builder.id;
        this.name = builder.name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return this.id +" "+this.name;
    }


    // Static Inner class

    static class PlayerBuilder
    {
        private  String id;
        private  String name;
    
        
        public PlayerBuilder()
        {

        }

        public static PlayerBuilder getPlayerBuilder()
        {
            return new PlayerBuilder();
        }

        public PlayerBuilder setId(String id) {
            this.id = id;
            return this;
        }

        public PlayerBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public Player build()
        {
            Player player = new Player(this);
            return player;
        }
    }  
}




public class BuilderFactory2 {

    public static void main(String[] args) {

     Player p1  = new Player.PlayerBuilder().setId("11").setName("datta").build();
     System.out.println(p1);
     

     Player p2  = Player.PlayerBuilder.getPlayerBuilder().setId("12").setName("Nagesh").build();
     System.out.println(p2);
     

    }
    
}
