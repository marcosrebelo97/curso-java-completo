package model.entities;

import model.exceptions.DomainException;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;


public class Reservation {

    private Integer number;
    private Date checkIn;
    private Date checkOut;

    public Reservation(Integer number, Date checkIn, Date checkOut) {
        if (!checkOut.after(checkIn)) {
            throw new DomainException("Check-out date must be after check-in date");
        }
        this.number = number;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration(){
        long diff = checkOut.getTime() - checkIn.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public void updateDates(Date checkIn, Date checkOut) {
        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            throw new DomainException(("Reservation dates for update must be future dates"));
        }
        if (!checkOut.after(checkIn)){
            throw new DomainException("Check-out date must be after check-in date");
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

}
