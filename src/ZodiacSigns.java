public enum ZodiacSigns {
    ARIES("Овен","21 марта – 20 апреля"),
    TAURUS("Телец", "21 апреля – 21 мая"),
    GEMINI("Близнецы", "22 мая – 21 июня"),
    CANCER("Рак", "22 июня – 22 июля"),
    LEO("Лев", "23 июля – 23 августа"),
    VIRGO("Дева", "24 августа – 22 сентября"),
    LIBRA("Весы", "23 сентября – 23 октября"),
    SCORPIUS("Скорпион", "24 октября – 22 ноября"),
    SAGITTARIUS("Стрелец", "23 ноября – 21 декабря"),
    CAPRICCORNUS("Козерог", "22 декабря – 20 января"),
    AQUARIUS("Водолей", "21 января – 18 февраля"),
    PISCES("Рыбы", "19 февраля – 20 марта");
    final String zodiacRu;
    final String dateOfBirth;
    ZodiacSigns(String zodiacRu, String dateOfBirth){
        this.zodiacRu=zodiacRu;
        this.dateOfBirth=dateOfBirth;
    }
    public String getZodiac(){
        return zodiacRu;
    }
    public String getDateOfBirth(){
        return dateOfBirth;
    }
}


