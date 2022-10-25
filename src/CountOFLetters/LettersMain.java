package CountOFLetters;

import java.util.HashMap;
import java.util.Locale;

public class LettersMain {
    public static void main(String[] args){
        String text = "Короткие сказки — авторские и народные произведения, которые развлекут вас и вашего ребёнка. Их обычно читают и рассказывают детям младшего возраста, когда способность удерживать внимание на чём-то одном у ребят достигает лишь нескольких минут. Эти сказки хороши для развлечения в дороге, не утомляют слушателей обилием событий и деталей повествования, а также подарят малышам приятные эмоции перед сном.";
        System.out.println(text);
        text = text.toLowerCase(Locale.ROOT);
        text = text.replaceAll("[^a-zA-Zа-яёА-ЯЁ]", "");
        HashMap<Character, Integer> count = new HashMap<Character, Integer>();
        for(int i = 0; i<text.length(); i++){
            Character s = text.charAt(i);
            if(count.containsKey(s))
                count.put(s, count.get(s)+ 1);
            else
                count.put(s,1);
        }
        for(HashMap.Entry<Character, Integer> item : count.entrySet()){
            System.out.printf("Letter: %c  Count: %d \n", item.getKey(), item.getValue());
        }
    }
}
