public class HotelBookingSystem {
    public static void main(String[] args) {
        // Initialize hotel with 5 rooms
        Hotel hotel = new Hotel(5);

        // Create threads for users
        Thread user1 = new Thread(new User(hotel, "Rashid", true));
        Thread user2 = new Thread(new User(hotel, "Subhan", true));
        Thread user3 = new Thread(new User(hotel, "Ali", false));
        Thread user4 = new Thread(new User(hotel, "Taqi", true));
        Thread user5 = new Thread(new User(hotel, "Faisal", true));
        Thread user6 = new Thread(new User(hotel, "Raza", true));

        // Start threads
        user1.start();
        user2.start();
        user3.start();
        user4.start();
        user5.start();
        user6.start();

        // Ensure all threads complete
        try {
            user1.join();
            user2.join();
            user3.join();
            user4.join();
            user5.join();
            user6.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Final room count
        System.out.println("Final available rooms: " + hotel.getAvailableRooms());
    }
}
