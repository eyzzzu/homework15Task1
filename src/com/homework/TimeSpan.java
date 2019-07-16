package com.homework;

public class TimeSpan {

    private int hours;
    private int minutes;
    private final int ONE_HOUR = 60;

    public TimeSpan(int hours, int minutes) {
        // minutes < 60
        if (minutes > 59) {
            throw new IllegalArgumentException("need value minutes < 60");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    private int getAllMinutsTmp() {
        return (hours * ONE_HOUR) + minutes;
    }

    private int getAllMinutsTmpInputForAdd(int setHoursValue, int setMinutesValue) {
        return (setHoursValue * ONE_HOUR) + setMinutesValue;
    }

    //Методы добавления времени
    public void add(int setHoursValue, int setMinutesValue) {
        if (setMinutesValue > 59) {
            throw new IllegalArgumentException("need value minutes < 60");
        }
        int tmpAllMin = getAllMinutsTmp() + getAllMinutsTmpInputForAdd(setHoursValue, setMinutesValue);
        findAndPrintFormattedResult(tmpAllMin);
    }

    public void add(double setHoursValue) {
        int tmpAllMin = (int) Math.round(setHoursValue * ONE_HOUR);
        findAndPrintFormattedResult(tmpAllMin);
    }

    public void add(int setMinutesValue) {
        if (setMinutesValue > 59) {
            throw new IllegalArgumentException("need value minutes < 60");
        }
        int tmpAllMin = getAllMinutsTmp() + setMinutesValue;
        findAndPrintFormattedResult(tmpAllMin);
    }

    public void add(TimeSpan timeSpan) {
        int tmpAllMin = getAllMinutsTmp() + getAllMinutsTmpInputForAdd(timeSpan.hours, timeSpan.minutes);
        findAndPrintFormattedResult(tmpAllMin);
    }

    //Методы вычитания с разными параметрами ввода
    public void substract(TimeSpan timeSpan, int setHoursValue, int setMinutesValue) {
        if (setMinutesValue > 59) {
            throw new IllegalArgumentException("need value minutes < 60");
        }
        int tmpAllMin = getAllMinutsTmp() - ((setHoursValue * ONE_HOUR) + setMinutesValue);
        findAndPrintFormattedResult(tmpAllMin);
    }

    public void substract(TimeSpan timeSpan, double setHoursValue) {
        int tmpAllMin = getAllMinutsTmp() - (int) (setHoursValue * ONE_HOUR);
        if (tmpAllMin < 0) {
            throw new IllegalArgumentException("need hours value less TimeSpan value");
        }
        if (tmpAllMin < ONE_HOUR) {
            findAndPrintFormattedResult(tmpAllMin);
        } else {
            findAndPrintFormattedResult(tmpAllMin);
        }
    }

    public void substract(TimeSpan timeSpan, int setMinutesValue) {
        int tmpAllMin = getAllMinutsTmp() - setMinutesValue;
        if (tmpAllMin < 0) {
            throw new IllegalArgumentException("need minuts value less TimeSpan value");
        }
        findAndPrintFormattedResult(tmpAllMin);
    }

    //Метод умножения
    public void multiplicate(double times) {
        int tmpAllMin = (int) Math.round(getAllMinutsTmpInputForAdd(this.hours, this.minutes) * times);
        findAndPrintFormattedResult(tmpAllMin);
    }

    public void findAndPrintFormattedResult(int tmpAllMin) {
        int resultHours = tmpAllMin / 60;
        int resultMinuts = tmpAllMin % 60;
        System.out.printf("Результат - %02d:%02d часов\n\r", resultHours, resultMinuts);
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }
}