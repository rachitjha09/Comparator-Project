public class Cat {
    private String name;
    private int lives;
    public Cat(){
        this.lives=9;
        this.name="Unknown Cat-" + (int)(Math.random()*1000);
    }
    public Cat(String name, int lives) {
        this.name=name;
        this.lives = lives;
    }
    public int getLives() {
        return lives;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "name: " + name + ", lives: " + lives;
    }
}
