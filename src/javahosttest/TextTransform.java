package javahosttest;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TextTransform {

    private String content;

    public TextTransform(String content) {
        this.content = content;
    }

    public String[] createArrayFromString(String input) {
        String[] asd = input.split("\\.");
        return asd;
    }

    public void printArray(String asd[]) {
        int i = 0;
        for (String s : asd) {
            System.out.println(i++ + s + ".");
        }
    }

    public List<Integer> shuffleOrder(int inputCount) {
        List<Integer> asd = new ArrayList<Integer>();
        for (int i = 0; i < inputCount; i++) {
            asd.add(i);
        }
        Collections.shuffle(asd);      
        return asd;
    }

    public String appendAllText(List<Integer> inputOrder) {
        StringBuilder strb = new StringBuilder();
        String[] firstText = createArrayFromString(content);
        for (int j = 0; j < inputOrder.size(); j++) {
            strb.append(firstText[inputOrder.get(j)].trim()).append(". ");
        }
        return strb.toString();
    }

    public String mixUpAllText() {
        return appendAllText(shuffleOrder(createArrayFromString(content).length));
    }
}
