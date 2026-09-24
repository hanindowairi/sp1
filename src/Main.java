void main(){
    String bandName = "The Static Waves";
    int fans = 8500;
    int maxFans = 15000;
    int fameLevel = 2;
    int experiencePoints = 3200;
    double money = 4750.50;
    boolean isActive = true;
    char genre = 'P';

    String[] repertoire = {"Happy Days", "Boy With Love", "Magic Shop", "Swim"};

    System.out.println("=== Band Profile ===");
    System.out.println("Name: " + bandName);
    System.out.println("Fans: "+ fans + "/" + maxFans);
    System.out.println("Fame: " + fameLevel);
    System.out.println("XP: " + experiencePoints);
    System.out.println("Money: " + money);
    System.out.println("Genre: " + genre);
    System.out.println("Active: "+ isActive);

    System.out.println("Repertoire: " + "-" + repertoire[0]);
    System.out.println("-" + repertoire[1]);
    System.out.println("-" + repertoire[2]);
    System.out.println("-" + repertoire[3]);

    System.out.println("=== System Check ===");
    if (fans < (0.25 * maxFans)){
        System.out.println("WARNING: Losing revelence! Consider a comeback stragety");
    }

    if(fans <= 0){
        isActive = false;
        System.out.println("The band has broken up");
    }
    if (genre == 'R'){
        System.out.println(" Rock Band ");
    } if (genre == 'E'){
        System.out.println("Electroninc Band");
    } if (genre == 'H'){
        System.out.println(" Hiphop Band");
    } if(genre == 'P') {
        System.out.println("Pop Band");
    }

    System.out.println("=== Fame System ===");
    if (experiencePoints > 2000 * fameLevel){
        System.out.println("Ready to level up!");
    }
    if(fameLevel == 1){
        System.out.println("Unknown - Playing in garages");
    } if(fameLevel == 2){
        System.out.println("Local Hero - Small venues await");
    } if (fameLevel == 3){
        System.out.println("Rising Star - festival invitations coming in");
    } if (fameLevel==4){
        System.out.println("Mainstream - Arena tours possible");
    } if (fameLevel==5){
        System.out.println("Superstar - Stadium glory");
    }

    System.out.println("=== Repertoire ===");
    for (String song : repertoire){
        System.out.println(song);
    }
    System.out.println("The number of songs the band has is " + repertoire.length);

    System.out.println("=== Gig Night ===");

    int venueCapacity = 500;
    int attendance = 420;
    int percentage = (attendance * 100)/ venueCapacity;

    System.out.println("Playing at a venue with capacity of" + venueCapacity);
    System.out.println("The attendance is " + attendance + ", which is " + percentage + "%");
    if (percentage > 0.80){
        fans+=200;
    }else {
        fans += 50;
    }
    System.out.println("Fans has increased to " + fans);
    int extraMoney = (int) (money + 1500);

    System.out.println("Money has increased to " + extraMoney);

    System.out.println("=== Random Event ===");

    int eventType = 1;
    if (eventType == 1){
        System.out.println("Great review!");
        System.out.println("Fans increased with 500");
        System.out.println( "Fans --> " + ((int) fans+ 500));
    }else if(eventType == 2){
        System.out.println("Quiet week. Nothing happens");
    }else if(eventType == 3){
        System.out.println("Scandal! -300 fans");
    }


}
