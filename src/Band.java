public class Band {
    String bandName;
    int fans = 10000;
    int maxFans = 15000;
    int fameLevel = 2;
    int experiencePoints = 3500;
    double money = 5000.0;
    boolean isActive = true;
    char genre;

    void printBandProfile() {

        System.out.println("=== Band Profile ===");
        System.out.println("Name: " + bandName);
        System.out.println("Fans: "+ fans + "/" + maxFans);
        System.out.println("Fame: " + fameLevel);
        System.out.println("XP: " + experiencePoints);
        System.out.println("Money: " + money);
        System.out.println("Genre: " + genre);
        System.out.println("Active: "+ isActive);


    }

    void playGig(int venueCapacity, int attendance){
        System.out.println("=== " + bandName + " Gig Night ===");

        int percentage = (attendance * 100)/ venueCapacity;

        System.out.println("Playing at a venue with capacity of " + venueCapacity);
        System.out.println("The attendance is " + attendance + ", which is " + percentage + "%");
        if (percentage > 80){
            gainFans(200);
        }else {
            gainFans(50);
        }
        earnMoney(1500);

    }

    void gainFans(int amount){
        fans+= amount;
        if(fans > maxFans){

            fans = maxFans;}
        System.out.println("Fans has increased to " + fans);
    }

    void loseFans(int amount){
        fans-=amount;
        if(fans <= 0){
            isActive = false;
            System.out.println("The band has broken up");

        }


    }

    void earnMoney(double amount){
        money+=amount;
        System.out.println("Money has increased to " + money);
    }

    boolean spendMoney(double amount) {
        if (amount <= money) {
            money -= amount;

            return true;
        } else {
            return false;

        }
    }

    void addXp(int amount){
        experiencePoints += amount;
        if (experiencePoints > 2000 * fameLevel){
            System.out.println("Ready to level up!");
            levelUp();
        }


    }

    void levelUp(){
        fameLevel += 1;
        experiencePoints = 0;

    }

    boolean isLosingRelevance(){
        if (fans < (0.25 * maxFans)){
            System.out.println("WARNING: Losing revelence! Consider a comeback stragety");
            return true;
        }else { return false;
        }


    }

    boolean isActive(){
        if(fans > 0){
            return true;
        }else {
            return false;
        }


    }

    double getFansPercentage(){
        double fansPercentage;
        fansPercentage = ((double)fans/maxFans)* 100;

        return fansPercentage;
    }

    void printRepertoire(){
        System.out.println("=== Repertoire ===");
        String[] repertoire = {"Happy Days", "Boy With Love", "Magic Shop", "Swim"};
        for (String song : repertoire){
            System.out.println(song);
        }

    }

    String getStatusTitle() {

        if (fameLevel == 1) {
            return ("Unknown - Playing in garages");
        }else if (fameLevel == 2) {
            return ("Local Hero - Small venues await");
        } else if (fameLevel == 3) {
            return ("Rising Star - festival invitations coming in");
        }else if (fameLevel == 4) {
            return ("Mainstream - Arena tours possible");
        }else if (fameLevel == 5) {
            return ("Superstar - Stadium glory");

        }
        return "default";
    }

    Band(String bandName, char genre){
        this.bandName = bandName;
        this.genre = genre;

    }

}
