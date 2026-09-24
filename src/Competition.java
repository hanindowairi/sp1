public class Competition {
    void main() {

        Band band1 = new Band("The Static Waves", 'P');
        Band band2 = new Band("Golden Stars", 'H');

        band1.printBandProfile();
        band2.printBandProfile();


        band1.playGig(500, 420);
        band2.playGig(500, 350);
        if (band1.fans > band2.fans) {
            System.out.println("The Static Waves is more popular!");
        } else if (band2.fans > band1.fans) {
            System.out.println("Golden Stars is more popular!");
        } else {
            System.out.println("Both bands are on the same level!");


        }

        band1.printBandProfile();
        band2.printBandProfile();
    }




}

