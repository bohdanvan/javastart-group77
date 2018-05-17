package com.bvan.javastart.lesson8.switch_case;

/**
 * @author bvanchuhov
 */
public class DayNumberToName {

    public static void main(String[] args) {
        int dayNumber = 1;

        String dayName;

//        if (dayNumber == 1) {
//            dayName = "Monday";
//        } else if (dayNumber == 2) {
//            dayName = "Tuesday";
//        } else {
//            dayName = "undefined";
//        }

        switch (dayNumber) {
            case 1:
                dayName = "Monday";
                break;
            case 2:
                dayName = "Tuesday";
                break;
            default:
                dayName = "undefined";
        }

        System.out.println(dayName);
    }
}

//Monday - comes from the Old English Mōnandæg (day of the Moon) and is a translation of the Latin name dies Lunae
//        Tuesday - comes from the Old English Tīwesdæg (Tyr's day). Tyr (a.k.a. Tiw, Tew or Tiu), was the Nordic god of single combat and heroic glory in Norse mythology. The name is based on Latin dies Martis (Day of Mars). Mars was the Roman god of war.
//        Wednesday - comes from the Old English Wōdnesdæg (day of Woden). Woden or Odin was the top Norse god, and a prominent god of the Anglo-Saxons in England. It is based on Latin dies Mercurii (Day of Mercury).
//        Thursday - comes from the Old English Þunresdæg (the day of Þunor). Þunor or Thor was the Germanic and Norse god of thunder. It is based on the Latin dies Iovis (Day of Jupiter).
//        Friday - comes from the Old English Frigedæg (day of Frige). Frige was the Germanic goddess of beauty, who is a later incarnation of the Norse goddess Frigg, but also connected to the Goddess Freyja. It is based on the Latin dies Veneris (Day of Venus). Venus was the Roman god of beauty, love, and sex.
//        Saturday - named after the Roman god Saturn from the Latin it was diēs saturnī (Day of Saturn).
//        Sunday - comes from the Old English Sunnandæg (day of the Sun). This is a translation of the Latin phrase dies solis.