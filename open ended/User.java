
class User implements Runnable {
    private Hotel hotel;
    private String userName;
    private boolean isBooking;

    public User(Hotel hotel, String userName, boolean isBooking) {
        this.hotel = hotel;
        this.userName = userName;
        this.isBooking = isBooking;
    }

    @Override
    public void run() {
        if (isBooking) {
            hotel.bookRoom(userName);
        } else {
            hotel.cancelRoom(userName);
        }
    }
}
