package com.vladimirsimek.educode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static void part1() {
        System.out.println("Part 1 :");
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
            rotatedWordsList.set(i,currentRawWordBuilder.toString() + " ");
        }

        for (int i = 0; i < rotatedWordsList.size(); i++) {
            System.out.print(rotatedWordsList.get(i));
        }
        System.out.println();

    }

    public static void part2() {
        System.out.println("Part 2:");
        //Declaration
        String rawTriangles = "68, 91, 56\n" +
                "83, 49, 61\n" +
                "23, 94, 45\n" +
                "72, 38, 16\n" +
                "61, 81, 13\n" +
                "58, 94, 91\n" +
                "89, 33, 4\n" +
                "96, 19, 28\n" +
                "43, 25, 20\n" +
                "18, 92, 57\n" +
                "5, 24, 63\n" +
                "75, 50, 96\n" +
                "87, 29, 3\n" +
                "86, 92, 94\n" +
                "44, 78, 63\n" +
                "23, 75, 26\n" +
                "68, 36, 44\n" +
                "57, 80, 48\n" +
                "52, 48, 38\n" +
                "16, 11, 73\n" +
                "64, 14, 61\n" +
                "8, 41, 42\n" +
                "22, 83, 90\n" +
                "59, 86, 26\n" +
                "20, 84, 92\n" +
                "61, 56, 9\n" +
                "86, 21, 47\n" +
                "98, 27, 76\n" +
                "56, 33, 36\n" +
                "100, 18, 76\n" +
                "86, 24, 46\n" +
                "61, 33, 43\n" +
                "4, 31, 35\n" +
                "15, 33, 72\n" +
                "94, 33, 80\n" +
                "58, 68, 41\n" +
                "86, 4, 48\n" +
                "50, 3, 30\n" +
                "54, 8, 79\n" +
                "70, 59, 16\n" +
                "66, 54, 44\n" +
                "79, 56, 6\n" +
                "77, 74, 65\n" +
                "54, 78, 73\n" +
                "36, 56, 11\n" +
                "70, 68, 18\n" +
                "38, 68, 43\n" +
                "61, 17, 70\n" +
                "83, 66, 65\n" +
                "41, 39, 75\n" +
                "72, 37, 49\n" +
                "23, 72, 47\n" +
                "48, 4, 69\n" +
                "42, 95, 82\n" +
                "85, 35, 80\n" +
                "21, 31, 6\n" +
                "26, 2, 60\n" +
                "57, 88, 96\n" +
                "29, 26, 99\n" +
                "14, 59, 23\n" +
                "52, 4, 43\n" +
                "53, 11, 25\n" +
                "50, 39, 95\n" +
                "3, 52, 60\n" +
                "41, 36, 86\n" +
                "35, 59, 39\n" +
                "91, 43, 100\n" +
                "49, 30, 35\n" +
                "55, 62, 68\n" +
                "78, 16, 94\n" +
                "25, 48, 17\n" +
                "55, 48, 52\n" +
                "39, 74, 55\n" +
                "36, 98, 90\n" +
                "17, 41, 76\n" +
                "62, 97, 23\n" +
                "100, 71, 52\n" +
                "100, 11, 20\n" +
                "82, 99, 80\n" +
                "39, 39, 41\n" +
                "55, 99, 86\n" +
                "80, 39, 58\n" +
                "10, 82, 47\n" +
                "46, 78, 58\n" +
                "94, 2, 65\n" +
                "60, 45, 37\n" +
                "97, 54, 3\n" +
                "65, 56, 10\n" +
                "3, 6, 79\n" +
                "51, 41, 20\n" +
                "53, 43, 66\n" +
                "5, 13, 10\n" +
                "47, 42, 49\n" +
                "70, 25, 13\n" +
                "90, 17, 11\n" +
                "38, 81, 9\n" +
                "2, 34, 77\n" +
                "48, 2, 50\n" +
                "77, 36, 14\n" +
                "79, 47, 23\n" +
                "27, 9, 59\n" +
                "6, 64, 80\n" +
                "32, 7, 78\n" +
                "91, 34, 83\n" +
                "8, 61, 27\n" +
                "21, 87, 45\n" +
                "72, 82, 80\n" +
                "72, 78, 92\n" +
                "87, 26, 72\n" +
                "87, 85, 27\n" +
                "64, 29, 23\n" +
                "16, 66, 71\n" +
                "40, 95, 30\n" +
                "10, 67, 92\n" +
                "39, 27, 88\n" +
                "61, 37, 95\n" +
                "91, 66, 45\n" +
                "88, 12, 32\n" +
                "20, 83, 19\n" +
                "97, 65, 48\n" +
                "87, 19, 85\n" +
                "88, 34, 14\n" +
                "84, 7, 14\n" +
                "59, 53, 37\n" +
                "93, 34, 44\n" +
                "91, 56, 52\n" +
                "2, 58, 19\n" +
                "100, 16, 16\n" +
                "77, 47, 84\n" +
                "67, 93, 97\n" +
                "22, 5, 69\n" +
                "37, 35, 55\n" +
                "53, 12, 61\n" +
                "54, 64, 94\n" +
                "99, 21, 96\n" +
                "66, 78, 73\n" +
                "64, 98, 42\n" +
                "2, 25, 93\n" +
                "60, 77, 95\n" +
                "81, 100, 69\n" +
                "56, 38, 68\n" +
                "65, 75, 16\n" +
                "47, 95, 45\n" +
                "1, 56, 34\n" +
                "44, 43, 50\n" +
                "27, 34, 86\n" +
                "90, 57, 6\n" +
                "67, 63, 84\n" +
                "31, 11, 95\n" +
                "34, 82, 93\n" +
                "67, 1, 16\n" +
                "75, 52, 88\n" +
                "99, 66, 9\n" +
                "70, 77, 34\n" +
                "91, 75, 100\n" +
                "49, 28, 21\n" +
                "10, 51, 30\n" +
                "22, 28, 53\n" +
                "95, 36, 57\n" +
                "24, 97, 82\n" +
                "99, 94, 65\n" +
                "16, 46, 1\n" +
                "9, 38, 74\n" +
                "49, 63, 11\n" +
                "26, 10, 56\n" +
                "36, 4, 60\n" +
                "52, 67, 23\n" +
                "17, 51, 9\n" +
                "35, 16, 29\n" +
                "41, 97, 88\n" +
                "78, 6, 40\n" +
                "3, 2, 96\n" +
                "39, 96, 51\n" +
                "38, 65, 48\n" +
                "68, 84, 66\n" +
                "28, 92, 77\n" +
                "55, 68, 15\n" +
                "60, 79, 86\n" +
                "84, 34, 12\n" +
                "97, 86, 99\n" +
                "95, 5, 94\n" +
                "85, 16, 37\n" +
                "9, 23, 66\n" +
                "57, 68, 69\n" +
                "21, 40, 19\n" +
                "17, 51, 66\n" +
                "23, 33, 64\n" +
                "92, 97, 16\n" +
                "11, 70, 83\n" +
                "92, 79, 74\n" +
                "35, 94, 4\n" +
                "28, 38, 67\n" +
                "39, 94, 57\n" +
                "38, 16, 95\n" +
                "70, 90, 99\n" +
                "6, 45, 96\n" +
                "86, 39, 27\n" +
                "61, 3, 6\n" +
                "54, 31, 87\n" +
                "45, 95, 95\n" +
                "\n";

        String[] rawTrianglesArray = rawTriangles.split("\n");
        int amountOfValidTriangles = 0;
        for (int r = 0; r < rawTrianglesArray.length; r++) {
            String[] threeWords = rawTrianglesArray[r].split(", ");
            int[] threeNumbers = new int[threeWords.length];
            for (int i = 0; i < threeWords.length; i++) {
                threeNumbers[i] = Integer.parseInt(threeWords[i]);
            }
            Triangle triangle = new Triangle(threeNumbers[0], threeNumbers[1], threeNumbers[2]);
            if (triangle.isValid()) amountOfValidTriangles++;
        }
        System.out.println(amountOfValidTriangles);
    }

    public static void main(String[] args) {
	    part1();
	    part2();
    }
}
