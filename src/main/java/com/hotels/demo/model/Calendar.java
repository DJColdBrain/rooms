package com.hotels.demo.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

@Entity
public class Calendar {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Room room;
    private LocalDate date;
    private boolean availableFrom9Till10;
    private boolean availableFrom10Till11;
    private boolean availableFrom11Till12;
    private boolean availableFrom12Till13;
    private boolean availableFrom13Till14;
    private boolean availableFrom14Till15;
    private boolean availableFrom15Till16;
    private boolean availableFrom16Till17;
    private boolean availableFrom17Till18;
    private boolean availableFrom18Till19;
    private boolean availableFrom19Till20;
    private boolean availableFrom20Till21;
    private boolean availableFrom21Till22;

    public Calendar() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isavailableFrom9Till10() {
        return availableFrom9Till10;
    }

    public void setavailableFrom9Till10(boolean availableFrom9Till10) {
        this.availableFrom9Till10 = availableFrom9Till10;
    }

    public boolean isavailableFrom10Till11() {
        return availableFrom10Till11;
    }

    public void setavailableFrom10Till11(boolean availableFrom10Till11) {
        this.availableFrom10Till11 = availableFrom10Till11;
    }

    public boolean isavailableFrom11Till12() {
        return availableFrom11Till12;
    }

    public void setavailableFrom11Till12(boolean availableFrom11Till12) {
        this.availableFrom11Till12 = availableFrom11Till12;
    }

    public boolean isavailableFrom12Till13() {
        return availableFrom12Till13;
    }

    public void setavailableFrom12Till13(boolean availableFrom12Till13) {
        this.availableFrom12Till13 = availableFrom12Till13;
    }

    public boolean isavailableFrom13Till14() {
        return availableFrom13Till14;
    }

    public void setavailableFrom13Till14(boolean availableFrom13Till14) {
        this.availableFrom13Till14 = availableFrom13Till14;
    }

    public boolean isavailableFrom14Till15() {
        return availableFrom14Till15;
    }

    public void setavailableFrom14Till15(boolean availableFrom14Till15) {
        this.availableFrom14Till15 = availableFrom14Till15;
    }

    public boolean isavailableFrom15Till16() {
        return availableFrom15Till16;
    }

    public void setavailableFrom15Till16(boolean availableFrom15Till16) {
        this.availableFrom15Till16 = availableFrom15Till16;
    }

    public boolean isavailableFrom16Till17() {
        return availableFrom16Till17;
    }

    public void setavailableFrom16Till17(boolean availableFrom16Till17) {
        this.availableFrom16Till17 = availableFrom16Till17;
    }

    public boolean isavailableFrom17Till18() {
        return availableFrom17Till18;
    }

    public void setavailableFrom17Till18(boolean availableFrom17Till18) {
        this.availableFrom17Till18 = availableFrom17Till18;
    }

    public boolean isavailableFrom18Till19() {
        return availableFrom18Till19;
    }

    public void setavailableFrom18Till19(boolean availableFrom18Till19) {
        this.availableFrom18Till19 = availableFrom18Till19;
    }

    public boolean isavailableFrom19Till20() {
        return availableFrom19Till20;
    }

    public void setavailableFrom19Till20(boolean availableFrom19Till20) {
        this.availableFrom19Till20 = availableFrom19Till20;
    }

    public boolean isavailableFrom20Till21() {
        return availableFrom20Till21;
    }

    public void setavailableFrom20Till21(boolean availableFrom20Till21) {
        this.availableFrom20Till21 = availableFrom20Till21;
    }

    public boolean isavailableFrom21Till22() {
        return availableFrom21Till22;
    }

    public void setavailableFrom21Till22(boolean availableFrom21Till22) {
        this.availableFrom21Till22 = availableFrom21Till22;
    }
}
