package rooms.model;

import org.springframework.format.annotation.DateTimeFormat;

import javax.validation.constraints.NotNull;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Calendar {


    private long id;

    private Room room;
    @NotNull
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate date;

    @NotNull
    private LocalTime startTime;

    @NotNull
    private LocalTime endTime;


    private boolean availableFrom0Till1;
    private boolean availableFrom1Till2;
    private boolean availableFrom2Till3;
    private boolean availableFrom3Till4;
    private boolean availableFrom4Till5;
    private boolean availableFrom5Till6;
    private boolean availableFrom6Till7;
    private boolean availableFrom7Till8;
    private boolean availableFrom8Till9;

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
    private boolean availableFrom22Till23;
    private boolean availableFrom23Till24;
    public Calendar() {
    }

    public Calendar(LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
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

    @DateTimeFormat(pattern="yyyy-MM-dd")
    public LocalDate getDate() {
        return date;
    }

    @DateTimeFormat(pattern="yyyy-MM-dd")
    public void setDate(LocalDate date) {
        this.date = date;
    }

    public boolean isAvailableFrom0Till1() {
        return availableFrom0Till1;
    }

    public void setAvailableFrom0Till1(boolean availableFrom0Till1) {
        this.availableFrom0Till1 = availableFrom0Till1;
    }

    public boolean isAvailableFrom1Till2() {
        return availableFrom1Till2;
    }

    public void setAvailableFrom1Till2(boolean availableFrom1Till2) {
        this.availableFrom1Till2 = availableFrom1Till2;
    }

    public boolean isAvailableFrom2Till3() {
        return availableFrom2Till3;
    }

    public void setAvailableFrom2Till3(boolean availableFrom2Till3) {
        this.availableFrom2Till3 = availableFrom2Till3;
    }

    public boolean isAvailableFrom3Till4() {
        return availableFrom3Till4;
    }

    public void setAvailableFrom3Till4(boolean availableFrom3Till4) {
        this.availableFrom3Till4 = availableFrom3Till4;
    }

    public boolean isAvailableFrom4Till5() {
        return availableFrom4Till5;
    }

    public void setAvailableFrom4Till5(boolean availableFrom4Till5) {
        this.availableFrom4Till5 = availableFrom4Till5;
    }

    public boolean isAvailableFrom5Till6() {
        return availableFrom5Till6;
    }

    public void setAvailableFrom5Till6(boolean availableFrom5Till6) {
        this.availableFrom5Till6 = availableFrom5Till6;
    }

    public boolean isAvailableFrom6Till7() {
        return availableFrom6Till7;
    }

    public void setAvailableFrom6Till7(boolean availableFrom6Till7) {
        this.availableFrom6Till7 = availableFrom6Till7;
    }

    public boolean isAvailableFrom7Till8() {
        return availableFrom7Till8;
    }

    public void setAvailableFrom7Till8(boolean availableFrom7Till8) {
        this.availableFrom7Till8 = availableFrom7Till8;
    }

    public boolean isAvailableFrom8Till9() {
        return availableFrom8Till9;
    }

    public void setAvailableFrom8Till9(boolean availableFrom8Till9) {
        this.availableFrom8Till9 = availableFrom8Till9;
    }

    public boolean isAvailableFrom9Till10() {
        return availableFrom9Till10;
    }

    public void setAvailableFrom9Till10(boolean availableFrom9Till10) {
        this.availableFrom9Till10 = availableFrom9Till10;
    }

    public boolean isAvailableFrom10Till11() {
        return availableFrom10Till11;
    }

    public void setAvailableFrom10Till11(boolean availableFrom10Till11) {
        this.availableFrom10Till11 = availableFrom10Till11;
    }

    public boolean isAvailableFrom11Till12() {
        return availableFrom11Till12;
    }

    public void setAvailableFrom11Till12(boolean availableFrom11Till12) {
        this.availableFrom11Till12 = availableFrom11Till12;
    }

    public boolean isAvailableFrom12Till13() {
        return availableFrom12Till13;
    }

    public void setAvailableFrom12Till13(boolean availableFrom12Till13) {
        this.availableFrom12Till13 = availableFrom12Till13;
    }

    public boolean isAvailableFrom13Till14() {
        return availableFrom13Till14;
    }

    public void setAvailableFrom13Till14(boolean availableFrom13Till14) {
        this.availableFrom13Till14 = availableFrom13Till14;
    }

    public boolean isAvailableFrom14Till15() {
        return availableFrom14Till15;
    }

    public void setAvailableFrom14Till15(boolean availableFrom14Till15) {
        this.availableFrom14Till15 = availableFrom14Till15;
    }

    public boolean isAvailableFrom15Till16() {
        return availableFrom15Till16;
    }

    public void setAvailableFrom15Till16(boolean availableFrom15Till16) {
        this.availableFrom15Till16 = availableFrom15Till16;
    }

    public boolean isAvailableFrom16Till17() {
        return availableFrom16Till17;
    }

    public void setAvailableFrom16Till17(boolean availableFrom16Till17) {
        this.availableFrom16Till17 = availableFrom16Till17;
    }

    public boolean isAvailableFrom17Till18() {
        return availableFrom17Till18;
    }

    public void setAvailableFrom17Till18(boolean availableFrom17Till18) {
        this.availableFrom17Till18 = availableFrom17Till18;
    }

    public boolean isAvailableFrom18Till19() {
        return availableFrom18Till19;
    }

    public void setAvailableFrom18Till19(boolean availableFrom18Till19) {
        this.availableFrom18Till19 = availableFrom18Till19;
    }

    public boolean isAvailableFrom19Till20() {
        return availableFrom19Till20;
    }

    public void setAvailableFrom19Till20(boolean availableFrom19Till20) {
        this.availableFrom19Till20 = availableFrom19Till20;
    }

    public boolean isAvailableFrom20Till21() {
        return availableFrom20Till21;
    }

    public void setAvailableFrom20Till21(boolean availableFrom20Till21) {
        this.availableFrom20Till21 = availableFrom20Till21;
    }

    public boolean isAvailableFrom21Till22() {
        return availableFrom21Till22;
    }

    public void setAvailableFrom21Till22(boolean availableFrom21Till22) {
        this.availableFrom21Till22 = availableFrom21Till22;
    }

    public boolean isAvailableFrom22Till23() {
        return availableFrom22Till23;
    }

    public void setAvailableFrom22Till23(boolean availableFrom22Till23) {
        this.availableFrom22Till23 = availableFrom22Till23;
    }

    public boolean isAvailableFrom23Till24() {
        return availableFrom23Till24;
    }

    public void setAvailableFrom23Till24(boolean availableFrom23Till24) {
        this.availableFrom23Till24 = availableFrom23Till24;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }


}
