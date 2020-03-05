public class CipherCaesar {

    public static String decryption(String text, int key) {
        String alphabet = "АаБбВвГгДдЕеЁёЖжЗзИиЙйКкЛлМмНнОоПпРрСсТтУуФфХхЦцЧчШшЩщЪъЫыЬьЭэЮюЯя";
        StringBuilder textDecryption = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            if (Character.isLetter(text.charAt(i))) {
                int numberSymbol = ((alphabet.indexOf(text.charAt(i)) + 2 * key) % 66);
                textDecryption.append(alphabet.charAt(numberSymbol));
            } else {
                textDecryption.append(text.charAt(i));
            }
        }

        System.out.println(textDecryption);
        return textDecryption.toString();
    }
}
