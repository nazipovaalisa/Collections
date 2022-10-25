package CountOFLetters;

import java.util.HashMap;
import java.util.Locale;

public class LettersMain {
    public static void main(String[] args){
        String text = "�������� ������ � ��������� � �������� ������������, ������� ��������� ��� � ������ ������. �� ������ ������ � ������������ ����� �������� ��������, ����� ����������� ���������� �������� �� ���-�� ����� � ����� ��������� ���� ���������� �����. ��� ������ ������ ��� ����������� � ������, �� �������� ���������� ������� ������� � ������� �������������, � ����� ������� ������� �������� ������ ����� ����.";
        System.out.println(text);
        text = text.toLowerCase(Locale.ROOT);
        text = text.replaceAll("[^a-zA-Z�-���-ߨ]", "");
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
