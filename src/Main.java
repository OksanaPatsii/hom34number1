public class Main {
    public static void main(String[] args) {
        printAllZodiacs();
        System.out.println(getDescriptionByZodiacSign(ZodiacSigns.AQUARIUS));
    }
    public static void printAllZodiacs(){
        for (ZodiacSigns zodiacSign: ZodiacSigns.values()){
            System.out.println(" Дата рождения" + zodiacSign.getDateOfBirth() + "-" + "это " + zodiacSign.getZodiac());
        }
    }
    public static ZodiacSigns getDescriptionByZodiacSign(ZodiacSigns zodiac){
        switch (zodiac){
            case ARIES: System.out.println(zodiac + " управитель Марс дает знаку такие черты как резкость, яркость, живость, энергичность и стремительность.");
            break;
            case TAURUS:System.out.println(zodiac + " управитель Венера дарует стабильность, уверенность и материальную гармонию.");
                break;
            case GEMINI:
                System.out.println(zodiac + " управитель Меркурий отвечает за любознательность, общительность, умение налаживать контакты.");
                break;
            case CANCER:
                System.out.println(zodiac + " управитель Луна несет душевность, чувственность, внутреннее спокойствие и умение заботиться о других.");
                break;
            case LEO:
                System.out.println(zodiac + " управитель Солнце наделяет энергичностью, страстностью, умением быть в центре внимания, устойчивостью и творческим началом.");
                break;
            case VIRGO:
                System.out.println(zodiac + " управитель Нептун дарит внимательность, стремление к идеальности и порядку, аккуратность и перфекционизм.");
                break;
            case LIBRA:
                System.out.println(zodiac + " управитель Венера отвечает за плавность, мягкость, баланс, красоту и утонченность.");
                break;
            case SCORPIUS:
                System.out.println(zodiac + " управитель Плутон несет страсть, интуицию, загадочность, умение видеть суть событий.");
            case SAGITTARIUS:
                System.out.println(zodiac + " управитель Юпитер дает человеку сообразительность, широту души, тягу к расширению границ, умение вести за собой.");
                break;
            case CAPRICCORNUS:
                System.out.println(zodiac + " управитель Сатурн привнесет в характер конкретность и дисциплину, умение видеть цель и идти к ней.");
                break;
            case AQUARIUS:
                System.out.println(zodiac + " управитель Уран отвечает за революционность, новые прорывные идеи, предвосхищение будущего и внутреннюю свобода.");
                break;
            case PISCES:
                System.out.println(zodiac + " управитель Плутон подарит творческую жилку, вдохновение, умение копнуть глубоко и наличие своей философии.");
        }
        return zodiac;
    }
}