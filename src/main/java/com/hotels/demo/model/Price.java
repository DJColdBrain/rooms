package com.hotels.demo.model;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
public class Price {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @ManyToOne
    private Room room;
    private LocalDate date;
    private BigDecimal priceFrom9Till10;
    private BigDecimal priceFrom10Till11;
    private BigDecimal priceFrom11Till12;
    private BigDecimal priceFrom12Till13;
    private BigDecimal priceFrom13Till14;
    private BigDecimal priceFrom14Till15;
    private BigDecimal priceFrom15Till16;
    private BigDecimal priceFrom16Till17;
    private BigDecimal priceFrom17Till18;
    private BigDecimal priceFrom18Till19;
    private BigDecimal priceFrom19Till20;
    private BigDecimal priceFrom20Till21;
    private BigDecimal priceFrom21Till22;

    public Price() {
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

    public BigDecimal getPriceFrom9Till10() {
        return priceFrom9Till10;
    }

    public void setPriceFrom9Till10(BigDecimal priceFrom9Till10) {
        this.priceFrom9Till10 = priceFrom9Till10;
    }

    public BigDecimal getPriceFrom10Till11() {
        return priceFrom10Till11;
    }

    public void setPriceFrom10Till11(BigDecimal priceFrom10Till11) {
        this.priceFrom10Till11 = priceFrom10Till11;
    }

    public BigDecimal getPriceFrom11Till12() {
        return priceFrom11Till12;
    }

    public void setPriceFrom11Till12(BigDecimal priceFrom11Till12) {
        this.priceFrom11Till12 = priceFrom11Till12;
    }

    public BigDecimal getPriceFrom12Till13() {
        return priceFrom12Till13;
    }

    public void setPriceFrom12Till13(BigDecimal priceFrom12Till13) {
        this.priceFrom12Till13 = priceFrom12Till13;
    }

    public BigDecimal getPriceFrom13Till14() {
        return priceFrom13Till14;
    }

    public void setPriceFrom13Till14(BigDecimal priceFrom13Till14) {
        this.priceFrom13Till14 = priceFrom13Till14;
    }

    public BigDecimal getPriceFrom14Till15() {
        return priceFrom14Till15;
    }

    public void setPriceFrom14Till15(BigDecimal priceFrom14Till15) {
        this.priceFrom14Till15 = priceFrom14Till15;
    }

    public BigDecimal getPriceFrom15Till16() {
        return priceFrom15Till16;
    }

    public void setPriceFrom15Till16(BigDecimal priceFrom15Till16) {
        this.priceFrom15Till16 = priceFrom15Till16;
    }

    public BigDecimal getPriceFrom16Till17() {
        return priceFrom16Till17;
    }

    public void setPriceFrom16Till17(BigDecimal priceFrom16Till17) {
        this.priceFrom16Till17 = priceFrom16Till17;
    }

    public BigDecimal getPriceFrom17Till18() {
        return priceFrom17Till18;
    }

    public void setPriceFrom17Till18(BigDecimal priceFrom17Till18) {
        this.priceFrom17Till18 = priceFrom17Till18;
    }

    public BigDecimal getPriceFrom18Till19() {
        return priceFrom18Till19;
    }

    public void setPriceFrom18Till19(BigDecimal priceFrom18Till19) {
        this.priceFrom18Till19 = priceFrom18Till19;
    }

    public BigDecimal getPriceFrom19Till20() {
        return priceFrom19Till20;
    }

    public void setPriceFrom19Till20(BigDecimal priceFrom19Till20) {
        this.priceFrom19Till20 = priceFrom19Till20;
    }

    public BigDecimal getPriceFrom20Till21() {
        return priceFrom20Till21;
    }

    public void setPriceFrom20Till21(BigDecimal priceFrom20Till21) {
        this.priceFrom20Till21 = priceFrom20Till21;
    }

    public BigDecimal getPriceFrom21Till22() {
        return priceFrom21Till22;
    }

    public void setPriceFrom21Till22(BigDecimal priceFrom21Till22) {
        this.priceFrom21Till22 = priceFrom21Till22;
    }
}
