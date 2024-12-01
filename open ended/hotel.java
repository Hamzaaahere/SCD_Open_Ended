class Hotel {
    private int availableRooms;

    public Hotel(int totalRooms) {
        this.availableRooms = totalRooms;
    }

    // Synchronized method to book a room
    public synchronized void bookRoom(String userName) {
        if (availableRooms > 0) {
            availableRooms--;
            System.out.println(userName + " successfully booked a room. Rooms left: " + availableRooms);
        } else {
            System.out.println(userName + " attempted to book a room, but none are available.");
        }
    }

    // Synchronized method to cancel a room booking
    public synchronized void cancelRoom(String userName) {
        availableRooms++;
        System.out.println(userName + " successfully canceled a booking. Rooms left: " + availableRooms);
    }

    // Synchronized method to view available rooms
    public synchronized int getAvailableRooms() {
        return availableRooms;
    }
}
