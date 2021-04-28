package com.vladimirsimek.educode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void part1() {
        //Declaration
        String rawText = "assam. enodc erolm utetcesnocr at iuds uiravs utciDm ca. enodc ores evl iuqs inicala utnemidnocm otroTr rotcua. epmesr arcs a illavnocs uqene divarGa tema. ist eget euqilat rreviva esm Ut te. enodc ilefs ac auqesnoct eu ugnoce atiVe sillavnoc. rterahpa aneceams atseges ipruts ac emaFs ropmet. iduticillosn aidm a elo otittroPr saneceam. rreviva dommoco usirs evl nunc dauselaMa isin. onn allunm eget nudicnitt sinl ubicuafs id rebilo utetcesnoCr rolod. uspim erolm reusope udretnim ubicuaFs suten. et utceness uqitsirte bromi natibaht uqsetnellepe ilEt subicuaf. nunc inem bromi uiravs uqsirelecse aigueft egetnIr niduticillos. uqitsirte iuds ilet nicsipidag utetcesnocr emat ist olodr uspIm ibrom. eprocmallur esd ilevt eprocmallur ittaMs rotcua. ative ecirtlus eu uqsirelecse sini siNl alugil. et eipasn anivlupr nunc nudicnitt ssama eidrepmit iuqs dommoCo di. auqilam emat ist rterahpa ut tatupluve aidm inem enoDc cnun. itselome ullets binh utnemelem itrobols eu croi opmeTr essidnepsus. rreviva uiterpm otrotr ut ilevt Id auqila. ngama rolode et robale ut nudidicnit opmetr omsuied do esd tile, nicsipidag utetcesnocr tema, ist olodr uspim eroLm";
        String[] rawTextArray = rawText.split(" ");
        ArrayList<String> rotatedWordsList = new ArrayList<>();
        //Reversing text
        Collections.reverse(Arrays.asList(rawTextArray));
        //Flipping words
        for (int i = 0; i < rawTextArray.length; i++) {
            String currentRawWord = rawTextArray[i];
            StringBuilder currentRawWordBuilder = new StringBuilder();
            currentRawWordBuilder.append(currentRawWord);
            rotatedWordsList.add(currentRawWordBuilder.reverse().toString());
        }
        //Setting first word last
        for (int i = 0; i < rotatedWordsList.size(); i++) {
            String currentRawWord = rotatedWordsList.get(i);
            int currentWordLength = currentRawWord.length();
            StringBuilder currentRawWordBuilder = new StringBuilder();
            for (int j = 1; j < currentWordLength; j++) {
                currentRawWordBuilder.append(currentRawWord.charAt(j));
            }
            currentRawWordBuilder.append(currentRawWord.charAt(0));
            rotatedWordsList.set(i,currentRawWordBuilder.toString());
        }

        for (int i = 0; i < rotatedWordsList.size(); i++) {
            System.out.println(rotatedWordsList.get(i));
        }

    }

    public static void main(String[] args) {
	    part1();
    }
}
