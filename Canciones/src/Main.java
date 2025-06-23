public class Main {
    public static void main(String[] args) {
        Cancion c1 = new Cancion("Crowded House", "Don't Dream It's Over", "Capitol", "Crowded House");
        Cancion c2 = new Cancion("Miguel Bosé", "Si Tú No Vuelves", "WEA Latina", "Bajo el Signo de Caín");
        Cancion c3 = new Cancion("Robbie Williams", "Feel", "Chrysalis", "Escapology");
        Cancion c4 = new Cancion("Wu-Tang Clan", "Gravel Pit", "RCA Records", "The W");
        Cancion c5 = new Cancion("Dua Lipa", "Happy For You", "Warner Records", "Future Nostalgia");

        System.out.println("Mis 5 canciones favoritas:\n");
        c1.mostrarInfo();
        c2.mostrarInfo();
        c3.mostrarInfo();
        c4.mostrarInfo();
        c5.mostrarInfo();
    }
}
