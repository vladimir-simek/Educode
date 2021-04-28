package com.vladimirsimek.educode;

import java.io.IOException;
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
            rotatedWordsList.set(i, currentRawWordBuilder.toString() + " ");
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

    public static void part3() {
        System.out.println("Part 3:");
        //Declaration
        String path = "[S, #, O]\n" +
                "[O, O, #]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, O, O]\n" +
                "[#, O, #]\n" +
                "[#, O, O]\n" +
                "[O, #, O]\n" +
                "[#, F, O]\n";
        String[] pathArray = path.split("\n");
        int moves = 0;
        char player = 'S';
        char wall = '#';
        char space = 'O';
        int pos1 = 1;
        int pos2 = 4;
        int pos3 = 7;
        int playerPosition = pos1;
        for (int i = 0; i < pathArray.length; i++) {
            String curPath = pathArray[i];
            String nextPath = "done";

            try {
                nextPath = pathArray[i + 1];

                if (nextPath.charAt(playerPosition) == space) {
                    moves++;
                } else if (playerPosition == pos1) {
                    playerPosition = pos2;
                    moves++;
                    moves++;
                } else if (playerPosition == pos2) {
                    if (curPath.charAt(pos1) == space) {
                        playerPosition = pos1;
                        moves++;
                        moves++;
                    } else {
                        playerPosition = pos3;
                        moves++;
                        moves++;
                    }
                } else if (playerPosition == pos3) {
                    playerPosition = pos2;
                    moves++;
                    moves++;
                }

                if (nextPath.charAt(pos2) == 'F') {
                    moves++;
                }


            } catch (IndexOutOfBoundsException e) {

            }
        }
        System.out.println(moves);
    }

    public static void part4() {
        System.out.println("Part 4:");
        //Declaration
        String code = "ucs\n" +
                "uj\n" +
                "rml\n" +
                "yinin\n" +
                "ofldp\n" +
                "yrztciv\n" +
                "iqvkznlo\n" +
                "eiglbxyo\n" +
                "cgozmkqiy\n" +
                "emizumawxh\n" +
                "widchpzqcai\n" +
                "utewlcxkqtai\n" +
                "xvllkdpzisncyik\n" +
                "yrxtgjkanhivyxb\n" +
                "ohifwteqbfuxwfr\n" +
                "xuegisncmhkdqrcuni\n" +
                "xkkhciwdcmkumffxibivega\n" +
                "eaxpewdszuluqglkvcmm\n" +
                "idjlsgwhllqplmxeswk\n" +
                "ikgeyublioyjrtlmgizsj\n" +
                "zoaldurmhbnsyjinrxufyptp\n" +
                "bhyjfeeczrxfsjqsretokd\n" +
                "uyhsigomrbivlzzhjblfywztuluelk\n" +
                "ezccwdulszdkhnpqybnzccbk\n" +
                "iqyjflzvehfkvgtnpmjwhancaex\n" +
                "lklregodmpfkgctbrjszlcofnoewsv\n" +
                "mplfpsnbqghanfuhiqusobvjtfye\n" +
                "ovrtvlgtiyyuqbmrltbcagidoayane\n" +
                "aeasdcisbqcoqcseerdagvmofoqmy\n" +
                "yclndxussgbrackirbjpgfnqhnbcndw\n" +
                "bxoanvsqekfwboqryqruddzvpjugbcsty\n" +
                "adlewhouxemyynenjddumnknqedushai\n" +
                "ojplisahklyufzrtkjyuasmjqucnmsvaxgn\n" +
                "dxfeaekamcvuhslwnajiudemjgfmeuckio\n" +
                "yvzwohjpdkouiieupyrjdpavhjehxbsflblde\n" +
                "xmbvycjfnpadcuhjkblmufymeztcrwghmsimaqgfb\n" +
                "vpizmwpmigtiizgzibfaigjeynnhlsogzerljkkf\n" +
                "mlmneprduuscqtffigdtuwspwcdtsslxqoywkw\n" +
                "wbjwhtxetcovyzgfoawjwaxpkvfgviqktxishov\n" +
                "ernonoedntlajihaziewkdfmveuxeskdsqabwucd\n" +
                "ittubkneaqlcpwrhfckungdpeouxdvkbnwuhcjisg\n" +
                "olydoxyzxfymbxngzeplrfzxwpvovdlisgmqfjbxty\n" +
                "etatxvjlmeglvuqrweyujhvqnhaqdpyjephpvlptdxgmp\n" +
                "ohrgxxwkqpqitkselmuimnqzijcauizjhrfknjmvsbimdw\n" +
                "ingjnbwexjtgcseydxronfzoiqsbrsgkjydmnjuxszpqk\n" +
                "iigylpapwrtfahwwzahgldeftckbvsxbfvxkezcmepvaigji\n" +
                "wvksfnlhsouqpltfwctbhoaszwkcqrcujrgsmnppyekzeith\n" +
                "cdvzyahrpurmjpejjpxmziolngmdfwbaukfsoqornibkepze\n" +
                "fhfakqgiczgwcpgbbxlvztjxnlmehwuywnepzkrdhefobseaz\n" +
                "ikdwpflxhjoybtsplltfwucnzxwndtcpbtspigrrqwvpnhmnyje\n" +
                "\n";
        String[] codes = code.split("\n");
        StringBuilder password = new StringBuilder();

        for (int i = 0; i < codes.length; i++) {
            String curCode = codes[i];
            if (curCode.charAt(0) == 'a' || curCode.charAt(0) == 'e' || curCode.charAt(0) == 'i' || curCode.charAt(0) == 'o' || curCode.charAt(0) == 'u' || curCode.charAt(0) == 'y') {
                int[] charsCount = new int[curCode.length()];
                for (int j = 0; j < curCode.length(); j++) {
                    char curChar = curCode.charAt(j);
                    int curCharCount = 0;
                    for (int k = 0; k < curCode.length(); k++) {
                        if (curCode.charAt(k) == curChar) curCharCount++;
                    }
                    charsCount[j] = curCharCount;
                }
                int val = 0;
                for (int j = 0; j < charsCount.length; j++) {
                    if (charsCount[j] == 2) {
                        val++;
                    }
                }
                if (val == 0) {
                    password.append(curCode.charAt(i));
                }

            }
        }
        System.out.println(password);
    }

    public static void part5() {
        System.out.println("Part 5:");
        //Declaration
        String raw = "issYear:[2049],passId:[110314x9241]\n" +
                "countId:[118]\n" +
                "expYear:[2041],issYear:[2023],countId:[219]\n" +
                "expYear:[2033],issYear:[1971],passId:[3033x17708],countId:[83]\n" +
                "expYear:[2027],issYear:[1935],passId:[111912x3467],countId:[192]\n" +
                "expYear:[2089],issYear:[2069],passId:[8075x12146]\n" +
                "expYear:[2031],issYear:[2004],countId:[4815]\n" +
                "expYear:[2044],issYear:[1969],passId:[91211x14770],countId:[192]\n" +
                "expYear:[1999],issYear:[1974],countId:[141]\n" +
                "passId:[7148x12438],countId:[541]\n" +
                "expYear:[2019],issYear:[1907]\n" +
                "expYear:[2041],passId:[10178x12271],countId:[86]\n" +
                "expYear:[2057],issYear:[1975],passId:[00213x81104],countId:[3635]\n" +
                "expYear:[2043],issYear:[2019],passId:[12122x8645],countId:[4445]\n" +
                "expYear:[2125],issYear:[2027],passId:[71512x1852],countId:[147]\n" +
                "expYear:[2134],issYear:[2114],countId:[6103]\n" +
                "expYear:[2033],issYear:[2013],passId:[10018x4559],countId:[96]\n" +
                "expYear:[2128],issYear:[1981],passId:[9090x8487],countId:[77]\n" +
                "expYear:[2010],issYear:[1990],passId:[3183x9367],countId:[73]\n" +
                "expYear:[2011],issYear:[1913],countId:[13027]\n" +
                "issYear:[2026],countId:[6554]\n" +
                "expYear:[2131],issYear:[2060],passId:[4017x14314],countId:[13063]\n" +
                "expYear:[2051],issYear:[2036],passId:[3018x1643],countId:[55]\n" +
                "passId:[7134x11138],countId:[220]\n" +
                "expYear:[2045],issYear:[1915],passId:[11113x16221],countId:[134]\n" +
                "expYear:[2040],issYear:[1934],countId:[183]\n" +
                "expYear:[2044],issYear:[1947],passId:[81013x1339],countId:[1365]\n" +
                "expYear:[2077],issYear:[2000],passId:[61714x151179],countId:[19469]\n" +
                "expYear:[2022],issYear:[1968],passId:[100414x15579],countId:[73]\n" +
                "expYear:[2049],issYear:[1898],countId:[11923]\n" +
                "expYear:[2036],issYear:[2016],passId:[12058x16131],countId:[252]\n" +
                "expYear:[2113],issYear:[1984],passId:[5036x9705],countId:[110]\n" +
                "expYear:[2041],passId:[7049x5615]\n" +
                "expYear:[2051],issYear:[2026],countId:[125]\n" +
                "issYear:[1965],passId:[01112x91015],countId:[3965]\n" +
                "expYear:[2052],issYear:[2035],passId:[4059x6292],countId:[16593]\n" +
                "expYear:[2084],issYear:[1973],passId:[110614x16889],countId:[11810]\n" +
                "expYear:[2045],issYear:[1896],passId:[4036x1762],countId:[139]\n" +
                "expYear:[2040],issYear:[1916],passId:[8046x7226],countId:[19318]\n" +
                "expYear:[2070],passId:[51612x12419],countId:[5344]\n" +
                "expYear:[2042],issYear:[2018],countId:[6918]\n" +
                "expYear:[2052],passId:[11154x96109]\n" +
                "expYear:[2050],issYear:[2030],passId:[21914x7388],countId:[4449]\n" +
                "expYear:[2052],issYear:[2032],passId:[0142x71155],countId:[12335]\n" +
                "expYear:[2115],issYear:[2022],passId:[3132x12963],countId:[270]\n" +
                "expYear:[2017],issYear:[1897],passId:[4191x1717],countId:[28]\n" +
                "issYear:[1867],passId:[3181x7391]\n" +
                "expYear:[2051],issYear:[2010],passId:[101910x011108],countId:[10086]\n" +
                "expYear:[2050],issYear:[2030],passId:[60111x9898]\n" +
                "expYear:[2071],issYear:[2051],passId:[4019x13174],countId:[13500]\n" +
                "expYear:[2050],passId:[9007x3265],countId:[15756]\n" +
                "expYear:[2052],issYear:[1914],passId:[110711x11182],countId:[6279]\n" +
                "expYear:[2048],issYear:[1959],passId:[8168x16107],countId:[221]\n" +
                "expYear:[2107],issYear:[2092],passId:[5114x141203],countId:[46]\n" +
                "expYear:[2004],issYear:[1984],passId:[9091x3213],countId:[9256]\n" +
                "expYear:[2097],issYear:[1995],passId:[10009x51140]\n" +
                "expYear:[2044],issYear:[1947],passId:[2039x131207],countId:[17879]\n" +
                "expYear:[2028],issYear:[2014],passId:[8168x16390],countId:[15]\n" +
                "expYear:[2074],issYear:[1954],passId:[11113x9999],countId:[44]\n" +
                "expYear:[2018],issYear:[1998],passId:[8142x51111],countId:[192]\n" +
                "expYear:[2062],issYear:[2054],passId:[9044x91101],countId:[173]\n" +
                "expYear:[2100],issYear:[1997],passId:[7108x141191],countId:[428]\n" +
                "expYear:[2022],countId:[14455]\n" +
                "issYear:[2032],passId:[90210x2908],countId:[23]\n" +
                "expYear:[2133],issYear:[1993],passId:[7190x10116],countId:[139]\n" +
                "expYear:[2044],issYear:[2024],passId:[3083x15132]\n" +
                "issYear:[1913],passId:[4118x17683],countId:[3474]\n" +
                "expYear:[2115],issYear:[2095],passId:[1127x66102],countId:[149]\n" +
                "expYear:[2044],issYear:[1898],countId:[53]\n" +
                "expYear:[2100],passId:[12133x2789],countId:[146]\n" +
                "expYear:[2050],issYear:[2004],countId:[47]\n" +
                "expYear:[2108],issYear:[1994],passId:[100611x12112],countId:[136]\n" +
                "expYear:[2042],issYear:[2022],passId:[110711x108107]\n" +
                "expYear:[2041],issYear:[2021],passId:[6044x3055],countId:[229]\n" +
                "expYear:[2044],issYear:[2011],passId:[0059x4031]\n" +
                "expYear:[2042],countId:[242]\n" +
                "expYear:[2043],issYear:[2023],passId:[8064x111173],countId:[68]\n" +
                "issYear:[1913],countId:[188]\n" +
                "expYear:[2050],issYear:[2030],passId:[11176x101174],countId:[112]\n" +
                "issYear:[2091],passId:[61512x4613],countId:[4656]\n" +
                "expYear:[2041],issYear:[2031],passId:[7055x7409]\n" +
                "expYear:[2045],issYear:[1959],passId:[61910x11214],countId:[209]\n" +
                "issYear:[2027],passId:[8106x6136],countId:[3067]\n" +
                "expYear:[2078],issYear:[2058],countId:[8361]\n" +
                "expYear:[2142],issYear:[2048],countId:[19294]\n" +
                "expYear:[2073],issYear:[2030],passId:[11512x15664]\n" +
                "expYear:[2028],passId:[41810x41197],countId:[66]\n" +
                "expYear:[2028],issYear:[2018],passId:[1194x11986],countId:[10136]\n" +
                "expYear:[2045],issYear:[1936],countId:[5939]\n" +
                "issYear:[2009],passId:[8091x7781],countId:[227]\n" +
                "expYear:[2049],issYear:[1937],passId:[81713x101233]\n" +
                "expYear:[2064],issYear:[2044],passId:[2061x6279],countId:[11148]\n" +
                "expYear:[2039],issYear:[1943],passId:[7057x5356]\n" +
                "expYear:[2041],passId:[41911x141208]\n" +
                "expYear:[2002],issYear:[1982],passId:[6177x8032],countId:[2336]\n" +
                "expYear:[2041],passId:[100613x6765],countId:[13]\n" +
                "issYear:[2095],countId:[246]\n" +
                "expYear:[2080],issYear:[2006],passId:[90011x6520],countId:[222]\n" +
                "expYear:[2083],issYear:[1961]\n" +
                "expYear:[2133],passId:[2122x15899]\n" +
                "expYear:[2050],issYear:[2030],passId:[12199x1221],countId:[16098]\n" +
                "issYear:[2032],passId:[1032x9030]\n" +
                "expYear:[2049],issYear:[1977],passId:[40811x5882]\n" +
                "expYear:[2048],issYear:[1989],passId:[7045x8206],countId:[5714]\n" +
                "expYear:[2007],passId:[81911x141224],countId:[16]\n" +
                "expYear:[2004],issYear:[1929],passId:[5110x49112]\n" +
                "expYear:[2027],issYear:[2003],passId:[01010x1487],countId:[97]\n" +
                "expYear:[2090],issYear:[2086],passId:[40511x71184]\n" +
                "expYear:[2042],issYear:[2026],passId:[10041x811117],countId:[455]\n" +
                "expYear:[2063],issYear:[2043],passId:[7130x81211],countId:[18473]\n" +
                "expYear:[2142],issYear:[2033],passId:[40311x11308]\n" +
                "expYear:[1998],passId:[1096x15152],countId:[238]\n" +
                "expYear:[2027],issYear:[1940],passId:[5143x13695]\n" +
                "expYear:[2049],passId:[7035x171035],countId:[116]\n" +
                "expYear:[2046],issYear:[2026],passId:[3104x12804]\n" +
                "expYear:[2049],issYear:[1934],passId:[11100x14153],countId:[244]\n" +
                "expYear:[2041],issYear:[2040],passId:[121410x10309],countId:[4179]\n" +
                "expYear:[2040],issYear:[1904],passId:[8096x14129],countId:[8]\n" +
                "expYear:[2040],passId:[90510x0870]\n" +
                "expYear:[2008],passId:[11094x2940],countId:[14511]\n" +
                "expYear:[2010],issYear:[2000],passId:[0151x2924],countId:[3722]\n" +
                "expYear:[2005],issYear:[1892],countId:[94]\n" +
                "expYear:[2044],issYear:[2028],passId:[11094x12014],countId:[8]\n" +
                "expYear:[2002],issYear:[1879],passId:[40413x7378],countId:[73]\n" +
                "expYear:[2113],issYear:[1961],passId:[2058x3952],countId:[14684]\n" +
                "expYear:[2050],issYear:[2030],passId:[7024x171108],countId:[122]\n" +
                "expYear:[2095],issYear:[1963],passId:[31611x6223],countId:[18818]\n" +
                "issYear:[2061],passId:[2196x57109],countId:[14748]\n" +
                "expYear:[2126],passId:[90411x61241],countId:[4136]\n" +
                "expYear:[2019],issYear:[1878],passId:[6126x14540]\n" +
                "expYear:[2065],issYear:[1949],passId:[4175x15209],countId:[90]\n" +
                "expYear:[2125],issYear:[2105],countId:[67]\n" +
                "expYear:[2058],issYear:[1998],passId:[11183x4640]\n" +
                "expYear:[2041],passId:[0007x56107]\n" +
                "expYear:[2041],passId:[41814x158113],countId:[14210]\n" +
                "expYear:[2134],passId:[7015x4580],countId:[152]\n" +
                "expYear:[2128],countId:[15154]\n" +
                "expYear:[2048],issYear:[1978],countId:[162]\n" +
                "expYear:[2073],issYear:[1979],passId:[3027x171046]\n" +
                "\n" +
                "expYear:[2050],passId:[20312x7480],countId:[14]\n" +
                "expYear:[2044],issYear:[2024],passId:[0153x6023],countId:[7970]\n" +
                "expYear:[2041],issYear:[2038],passId:[30212x7189],countId:[7400]\n" +
                "issYear:[1903],passId:[5060x17342],countId:[259]\n" +
                "expYear:[2013],issYear:[1976],countId:[62]\n" +
                "expYear:[2130],issYear:[2110],passId:[91312x4054],countId:[14929]\n" +
                "expYear:[2141],issYear:[2105],countId:[127]\n" +
                "issYear:[2081],passId:[61513x55115]\n" +
                "expYear:[2005],issYear:[1867],passId:[9083x3876]\n" +
                "issYear:[2022],passId:[12019x141166],countId:[168]\n" +
                "expYear:[2023],passId:[5010x9563]\n" +
                "expYear:[2052],passId:[4190x131072],countId:[12000]\n" +
                "expYear:[2045],passId:[10123x0442],countId:[10135]\n" +
                "issYear:[2021],passId:[101011x11147],countId:[8938]\n" +
                "issYear:[1871],countId:[4254]\n" +
                "expYear:[2006],issYear:[1981],passId:[101110x71060],countId:[2182]\n" +
                "expYear:[2062],issYear:[2042],passId:[10075x101241],countId:[145]\n" +
                "expYear:[2077],issYear:[2021],passId:[21412x510111],countId:[143]\n" +
                "expYear:[2042],issYear:[1986],passId:[6045x01076]\n" +
                "expYear:[2027],issYear:[1914],passId:[20012x6350]\n" +
                "expYear:[2050],issYear:[1952],passId:[11110x17414],countId:[290]\n" +
                "expYear:[2123],passId:[8094x13300],countId:[14640]\n" +
                "expYear:[2091],issYear:[1986]\n" +
                "expYear:[2033],issYear:[1929],countId:[9934]\n" +
                "expYear:[2050],issYear:[1911],passId:[1166x161270],countId:[12196]\n" +
                "expYear:[2041],issYear:[2021],passId:[111911x161049],countId:[11263]\n" +
                "expYear:[2121],issYear:[2101],passId:[6046x10404],countId:[266]\n" +
                "expYear:[2003],issYear:[1988],countId:[185]\n" +
                "expYear:[2043],issYear:[2023],passId:[11014x1274],countId:[135]\n" +
                "issYear:[1969],passId:[111210x14211],countId:[92]\n" +
                "issYear:[2052],passId:[7070x16404],countId:[128]\n" +
                "expYear:[2019],issYear:[1918],passId:[1179x21018],countId:[16683]\n" +
                "expYear:[2077],passId:[6139x21042]\n" +
                "expYear:[2135],issYear:[2046],passId:[71312x141077],countId:[7360]\n" +
                "expYear:[2042],issYear:[1960],passId:[6097x21044],countId:[114]\n" +
                "expYear:[2023],countId:[4313]\n" +
                "expYear:[2073],passId:[10612x111109],countId:[6402]\n" +
                "expYear:[2031],issYear:[1955],countId:[198]\n" +
                "expYear:[2052],passId:[100713x13157],countId:[13243]\n" +
                "passId:[2196x3316],countId:[234]\n" +
                "expYear:[2045],countId:[222]\n" +
                "expYear:[2041],issYear:[1931],passId:[1184x41100],countId:[15]\n" +
                "expYear:[2130],passId:[11098x6332]\n" +
                "countId:[174]\n" +
                "expYear:[2052],issYear:[1930],passId:[71714x11184],countId:[72]\n" +
                "expYear:[2050],issYear:[2030],passId:[4150x4246],countId:[2620]\n" +
                "expYear:[2046],issYear:[1906],passId:[11007x71155],countId:[36]\n" +
                "expYear:[2069],issYear:[1927],passId:[10195x61275],countId:[56]\n" +
                "expYear:[2108],issYear:[2088],passId:[7054x4348],countId:[718]\n" +
                "expYear:[2039],issYear:[1927],passId:[0024x111118],countId:[43]\n" +
                "expYear:[2042],issYear:[1919],countId:[2417]\n" +
                "expYear:[2119],issYear:[2099],passId:[10410x144119],countId:[15279]\n" +
                "expYear:[2045],passId:[0181x211113],countId:[72]\n" +
                "expYear:[2102],issYear:[1980],passId:[2101x5583],countId:[973]\n" +
                "issYear:[2021]\n" +
                "expYear:[2046],issYear:[1944],passId:[11120x13947],countId:[64]\n" +
                "expYear:[2047],issYear:[1911],passId:[1052x17194],countId:[12587]\n" +
                "passId:[10814x138109],countId:[5029]\n" +
                "expYear:[2043],issYear:[2041],passId:[4127x141172],countId:[16]\n" +
                "expYear:[2125],issYear:[2017],passId:[5165x4226],countId:[10938]\n" +
                "expYear:[2045],issYear:[2026],countId:[263]\n" +
                "expYear:[1998],issYear:[1874],passId:[10004x7838],countId:[109]\n" +
                "expYear:[2009],issYear:[2008],passId:[3026x81240],countId:[1809]\n" +
                "expYear:[2081],issYear:[2038],passId:[1035x121266]\n" +
                "expYear:[1997],issYear:[1909],passId:[10013x152103]\n" +
                "expYear:[2050],issYear:[2030],countId:[12650]\n" +
                "expYear:[2034]\n" +
                "issYear:[1947],passId:[10313x107106],countId:[6345]\n" +
                "expYear:[2065],issYear:[2045],passId:[9118x21291],countId:[19000]\n" +
                "expYear:[2026],issYear:[2006],passId:[6144x16680],countId:[63]\n" +
                "expYear:[2044],issYear:[1999],passId:[40910x01166],countId:[239]\n" +
                "expYear:[2129],passId:[7123x5095]\n" +
                "issYear:[1910],passId:[6097x95119],countId:[13082]\n" +
                "expYear:[2062],issYear:[2037]\n" +
                "expYear:[2047],passId:[4118x156103]\n" +
                "issYear:[1945],passId:[2143x176114],countId:[18530]\n" +
                "expYear:[2026],issYear:[2006],passId:[6142x133102],countId:[141]\n" +
                "expYear:[2001],issYear:[1958],passId:[00914x4636],countId:[72]\n" +
                "issYear:[2031],passId:[7145x11366],countId:[12404]\n" +
                "expYear:[1998],passId:[5148x17428],countId:[13335]\n" +
                "expYear:[2047],passId:[5180x121151],countId:[26]\n" +
                "expYear:[2028],issYear:[2020],passId:[12025x7335],countId:[11163]\n" +
                "expYear:[2043],issYear:[2026],passId:[61814x31113],countId:[3266]\n" +
                "issYear:[2028],countId:[1170]\n" +
                "expYear:[2095],issYear:[2075],passId:[6027x16552],countId:[35]\n" +
                "expYear:[2045],passId:[7071x4703]\n" +
                "expYear:[2049],passId:[10098x1626],countId:[30]\n" +
                "expYear:[2040],issYear:[2020],passId:[11114x2350],countId:[163]\n" +
                "expYear:[2074],issYear:[1986],passId:[12128x67102],countId:[1479]\n" +
                "expYear:[2041],issYear:[1908],countId:[10652]\n" +
                "expYear:[2105],issYear:[2021],passId:[0000x41108],countId:[161]\n" +
                "issYear:[2114],countId:[1376]\n" +
                "expYear:[2051]\n" +
                "expYear:[2004],issYear:[1860],passId:[7160x12795],countId:[72]\n" +
                "expYear:[2043],issYear:[2023],passId:[4191x7022],countId:[13769]\n" +
                "expYear:[2042],issYear:[2022],passId:[21912x6436],countId:[14898]\n" +
                "expYear:[2141],passId:[31911x12780],countId:[158]\n" +
                "expYear:[2044],issYear:[1928],passId:[9058x51184]\n" +
                "issYear:[2082],passId:[50711x7453]\n" +
                "expYear:[2136],issYear:[2120],countId:[18773]\n" +
                "expYear:[2002],countId:[13354]\n" +
                "expYear:[2103],passId:[9051x12812]\n" +
                "expYear:[2011],passId:[12017x1410116],countId:[2569]\n" +
                "expYear:[2069],issYear:[2049],passId:[4144x10839],countId:[97]\n" +
                "expYear:[2040],issYear:[1966],passId:[2190x16780]\n" +
                "expYear:[2085],issYear:[2065],countId:[128]\n" +
                "expYear:[2022],issYear:[1948],countId:[47]\n" +
                "expYear:[1997],issYear:[1905],passId:[1119x131110],countId:[16602]\n" +
                "expYear:[2076],issYear:[1925],passId:[01910x11293],countId:[12965]\n" +
                "expYear:[2064],issYear:[1928],passId:[110411x4817],countId:[97]\n" +
                "expYear:[2104],issYear:[2084],countId:[8869]\n" +
                "expYear:[2067],issYear:[2001],passId:[01412x5112],countId:[12382]\n" +
                "expYear:[2052],issYear:[2003],countId:[702]\n" +
                "expYear:[2129],issYear:[1986],passId:[61110x31127]\n" +
                "expYear:[2108],issYear:[2088],passId:[01110x10423],countId:[242]\n" +
                "expYear:[2050],issYear:[2024],passId:[60510x10835],countId:[9026]\n" +
                "expYear:[2137],issYear:[2117],passId:[110810x16756],countId:[17030]\n" +
                "expYear:[2004],issYear:[1913],passId:[110312x0096]\n" +
                "issYear:[1983],passId:[71112x175113]\n" +
                "expYear:[2043],passId:[111010x102106],countId:[151]\n" +
                "issYear:[2089],countId:[151]\n" +
                "expYear:[2068],issYear:[2011],passId:[6092x61101],countId:[105]\n" +
                "expYear:[2047],issYear:[1935]\n" +
                "expYear:[2009],countId:[15967]\n" +
                "expYear:[2006],issYear:[1986],passId:[60214x71049]\n" +
                "expYear:[2021],issYear:[1901],passId:[101514x5279]\n" +
                "expYear:[2047],issYear:[2027],passId:[12118x31148],countId:[16400]\n" +
                "expYear:[2091],issYear:[2072],passId:[00013x71283],countId:[5249]\n" +
                "expYear:[2087],issYear:[2042],passId:[6135x1510116]\n" +
                "expYear:[2129],issYear:[2109],passId:[41714x8562],countId:[247]\n" +
                "expYear:[2051],issYear:[2031],passId:[51514x15164],countId:[31]\n" +
                "issYear:[2067],passId:[3060x15978],countId:[43]\n" +
                "expYear:[2043],issYear:[2036],passId:[5030x8243]\n" +
                "issYear:[1883],passId:[6089x91045]\n" +
                "expYear:[2132],issYear:[1994],passId:[3118x141060],countId:[1428]\n" +
                "expYear:[2010],issYear:[1965],passId:[1102x0945],countId:[4]\n" +
                "expYear:[2066],issYear:[2048],passId:[12016x16118],countId:[134]\n" +
                "expYear:[2117],issYear:[2097],passId:[4170x14854],countId:[9844]\n" +
                "expYear:[2008],issYear:[1977],passId:[1001x1201]\n" +
                "expYear:[2105],issYear:[1984],passId:[5150x8006],countId:[14660]\n" +
                "expYear:[2027],passId:[2159x31027]\n" +
                "expYear:[2043],countId:[118]\n" +
                "expYear:[2045],issYear:[1918],countId:[10067]\n" +
                "expYear:[2059],countId:[187]\n" +
                "expYear:[2043],issYear:[1957],passId:[101511x11697]\n" +
                "expYear:[2044],issYear:[1961],passId:[3009x10273],countId:[263]\n" +
                "issYear:[2006],passId:[12017x12751],countId:[9957]\n" +
                "expYear:[2051],issYear:[1993],passId:[9052x11893],countId:[200]\n" +
                "expYear:[2051],issYear:[1943],passId:[2100x0338],countId:[23]\n" +
                "expYear:[2042],issYear:[1964],passId:[80614x3384],countId:[6282]\n" +
                "expYear:[2038],issYear:[2026],countId:[136]\n" +
                "expYear:[2122],issYear:[2102],passId:[1171x151037],countId:[53]\n" +
                "expYear:[2044],issYear:[1956],passId:[7187x10775],countId:[153]\n" +
                "issYear:[1933],countId:[162]\n" +
                "expYear:[2050],issYear:[1934],passId:[12036x10161],countId:[10397]\n" +
                "expYear:[2106],issYear:[2014],passId:[91213x11886],countId:[67]\n" +
                "issYear:[2121],passId:[60111x21292],countId:[154]\n" +
                "expYear:[2047],countId:[42]\n" +
                "expYear:[2091],issYear:[2010],passId:[3077x137106],countId:[64]\n" +
                "expYear:[1998],issYear:[1911],passId:[20010x14135],countId:[229]\n" +
                "expYear:[2105]\n" +
                "expYear:[2099],issYear:[2032],passId:[1108x79106]\n" +
                "expYear:[2042],passId:[50711x7205],countId:[119]\n" +
                "expYear:[2109],issYear:[2060],passId:[100010x136107],countId:[158]\n" +
                "issYear:[2013]\n" +
                "expYear:[2043],issYear:[1933],passId:[4171x14121],countId:[2153]\n" +
                "expYear:[2027],passId:[5134x9628],countId:[111]\n" +
                "issYear:[2031],passId:[12115x2561],countId:[119]\n" +
                "expYear:[2107],issYear:[2087],passId:[100811x16614],countId:[91]\n" +
                "expYear:[2041],issYear:[1925],passId:[50111x10565],countId:[18490]\n" +
                "expYear:[2052],passId:[4180x111068],countId:[16648]\n" +
                "expYear:[2081],issYear:[2023],passId:[10163x01176],countId:[1763]\n" +
                "expYear:[2139],issYear:[2059],passId:[01111x17957],countId:[171]\n" +
                "expYear:[2139],issYear:[2119],passId:[2016x12086],countId:[23]\n" +
                "expYear:[2001],issYear:[1917],passId:[91012x71108]\n" +
                "expYear:[2004],issYear:[1916],countId:[30]\n" +
                "expYear:[2122],issYear:[2102],passId:[110511x1287]\n" +
                "expYear:[2044],passId:[31613x3359],countId:[260]\n" +
                "expYear:[2040],issYear:[1888],passId:[2149x3210],countId:[19357]\n" +
                "expYear:[2086],issYear:[2084],passId:[111111x8124],countId:[1455]\n" +
                "expYear:[2027],issYear:[1990],passId:[11110x15772],countId:[205]\n" +
                "expYear:[2099],passId:[11134x28111],countId:[10264]\n" +
                "expYear:[2058],passId:[12144x8618],countId:[195]\n" +
                "expYear:[2045],issYear:[1899],passId:[61314x0708]\n" +
                "expYear:[2043],issYear:[2023],passId:[3058x1205]\n" +
                "expYear:[2042],countId:[18929]\n" +
                "expYear:[2025],issYear:[2005],passId:[5193x155104]\n" +
                "passId:[12083x3417],countId:[2438]\n" +
                "expYear:[2124],passId:[7183x211116],countId:[248]\n" +
                "expYear:[2051],issYear:[2031],passId:[21212x17963],countId:[146]\n" +
                "expYear:[2119],issYear:[2099],passId:[3024x141070],countId:[5477]\n" +
                "expYear:[2094],passId:[6063x3735]\n" +
                "issYear:[1993],passId:[4123x1382]\n" +
                "expYear:[2121],issYear:[2020],passId:[90713x12854]\n" +
                "expYear:[2078],issYear:[2030],passId:[90412x01043],countId:[11576]\n" +
                "expYear:[2094],passId:[80314x14247]\n" +
                "issYear:[1927],passId:[101714x121123],countId:[234]\n" +
                "expYear:[2068],issYear:[1956],passId:[8173x178111],countId:[2424]\n" +
                "expYear:[2014],issYear:[1942],passId:[4087x3486]\n" +
                "issYear:[1996],passId:[5053x3465],countId:[118]\n" +
                "expYear:[2045],issYear:[2025]\n" +
                "expYear:[2031],issYear:[1929],countId:[9]\n" +
                "issYear:[1988],passId:[10110x11621]\n" +
                "expYear:[2127],issYear:[1991],passId:[90311x91287],countId:[3901]\n" +
                "expYear:[2041],issYear:[1959],passId:[80314x10487],countId:[11990]\n" +
                "expYear:[2042],issYear:[2022],passId:[51310x13390]\n" +
                "expYear:[2086],issYear:[2066],passId:[9155x151202],countId:[5556]\n" +
                "expYear:[2131],issYear:[2111],passId:[3164x8702],countId:[5693]\n" +
                "expYear:[2050],issYear:[2030],passId:[8120x3903],countId:[24]\n" +
                "expYear:[2072],issYear:[2052],passId:[21112x92115],countId:[73]\n" +
                "issYear:[2073],passId:[61613x115102],countId:[153]\n" +
                "expYear:[2094],issYear:[2074],passId:[1182x17133],countId:[4449]\n" +
                "expYear:[2042],countId:[17083]\n" +
                "expYear:[2049],issYear:[2033],passId:[50710x10989]\n" +
                "expYear:[2004],issYear:[1984],passId:[9152x15747],countId:[11559]\n" +
                "expYear:[2043],passId:[12068x11142],countId:[240]\n" +
                "issYear:[2028],countId:[11655]\n" +
                "expYear:[2036],issYear:[1959],passId:[4133x132101],countId:[227]\n" +
                "expYear:[2075],issYear:[2062],passId:[6114x61074],countId:[9460]\n" +
                "expYear:[2063],issYear:[2043],passId:[111410x3762],countId:[10449]\n" +
                "expYear:[2016],issYear:[1994],passId:[30012x18116],countId:[120]\n" +
                "expYear:[2042],issYear:[2022],countId:[236]\n" +
                "expYear:[2114],issYear:[2094],passId:[120812x111144],countId:[1571]\n" +
                "expYear:[2015],countId:[9700]\n" +
                "expYear:[2005],passId:[10103x31168],countId:[7674]\n" +
                "issYear:[2001],passId:[40714x51185],countId:[10602]\n" +
                "issYear:[1959],countId:[19120]\n" +
                "expYear:[2041],issYear:[2021],passId:[2095x07115]\n" +
                "expYear:[2075],issYear:[1961],passId:[11178x12383],countId:[135]\n" +
                "expYear:[1998],issYear:[1876],passId:[8152x15256],countId:[12741]\n" +
                "issYear:[2044],passId:[12164x08117],countId:[156]\n" +
                "expYear:[2052],issYear:[2032],passId:[5134x161226],countId:[13309]\n" +
                "expYear:[2095],issYear:[2075],countId:[236]\n" +
                "expYear:[2042],issYear:[2033],countId:[134]\n" +
                "expYear:[2054],passId:[40510x151204],countId:[264]\n" +
                "expYear:[2008],issYear:[1925],passId:[5068x9282],countId:[6135]\n" +
                "expYear:[2001],issYear:[1878],countId:[12774]\n" +
                "expYear:[2110],issYear:[2089],passId:[11175x138101],countId:[2669]\n" +
                "issYear:[1988],passId:[21813x211101],countId:[12490]\n" +
                "expYear:[2040],issYear:[2020],countId:[250]\n" +
                "expYear:[2101],issYear:[2039],passId:[12119x61049],countId:[32]\n" +
                "expYear:[2069],issYear:[2049],passId:[7074x7597],countId:[112]\n" +
                "expYear:[2044],issYear:[2025],passId:[0072x6623]\n" +
                "expYear:[2104],issYear:[2035],countId:[11727]\n" +
                "expYear:[2045],passId:[2007x171076],countId:[18463]\n" +
                "expYear:[2008],issYear:[1922],passId:[91814x161135],countId:[94]\n" +
                "expYear:[2045],issYear:[1900],countId:[84]\n" +
                "expYear:[2046],issYear:[2026],passId:[111910x17619],countId:[16231]\n" +
                "expYear:[2051],issYear:[2014],passId:[30312x114108]\n" +
                "expYear:[2060],issYear:[2040],passId:[12125x11670],countId:[2977]\n" +
                "expYear:[2025],issYear:[2005],passId:[10124x4826],countId:[9]\n" +
                "expYear:[2021],issYear:[2001],countId:[170]\n" +
                "expYear:[2087],issYear:[1970],passId:[3066x105111],countId:[1610]\n" +
                "issYear:[2028],passId:[11811x310106],countId:[6606]\n" +
                "expYear:[2042],passId:[11189x14032],countId:[17069]\n" +
                "issYear:[2030],passId:[10123x100105],countId:[211]\n" +
                "expYear:[2123],issYear:[2087],passId:[5029x31148],countId:[11973]\n" +
                "expYear:[2009],issYear:[1992],passId:[9049x159105],countId:[2087]\n" +
                "expYear:[2040],issYear:[1903],passId:[1175x10249],countId:[203]\n" +
                "expYear:[2094],issYear:[2025],passId:[8122x17481],countId:[15500]\n" +
                "issYear:[1913],passId:[8093x11292],countId:[7]\n" +
                "expYear:[2087],issYear:[2067],passId:[71313x171136],countId:[120]\n" +
                "expYear:[2014],passId:[3051x31257],countId:[232]\n" +
                "expYear:[2051],issYear:[2031],passId:[8137x15531]\n" +
                "issYear:[1996],passId:[1027x9995]\n" +
                "expYear:[1999],issYear:[1969],passId:[120213x5109],countId:[226]\n" +
                "expYear:[2035],issYear:[2032],countId:[18928]\n" +
                "expYear:[2049],issYear:[1915],passId:[12183x53104]\n" +
                "expYear:[2140],issYear:[2007],passId:[0141x17596],countId:[5260]\n" +
                "expYear:[2120],issYear:[2014],passId:[00914x01213],countId:[17435]\n" +
                "expYear:[2046],passId:[8030x8425],countId:[117]\n" +
                "expYear:[2012],issYear:[1998],passId:[4076x17756],countId:[15907]\n" +
                "issYear:[2036],passId:[11173x1533],countId:[2111]\n" +
                "expYear:[2052],issYear:[1911],passId:[11810x9760],countId:[54]\n" +
                "issYear:[1998],countId:[2713]\n" +
                "expYear:[2113],issYear:[2093],passId:[3013x10970],countId:[13662]\n" +
                "expYear:[2035],issYear:[2015],passId:[12054x1973],countId:[859]\n" +
                "expYear:[2048],issYear:[2028],countId:[42]\n" +
                "expYear:[2045],passId:[1192x6046],countId:[48]\n" +
                "expYear:[2090],issYear:[1952],passId:[0130x153103],countId:[19234]\n" +
                "issYear:[2001],passId:[9086x0998]\n" +
                "issYear:[1989],countId:[136]\n" +
                "issYear:[2026],passId:[8022x0413],countId:[243]\n" +
                "expYear:[2006],issYear:[1945],passId:[81112x13443],countId:[86]\n" +
                "issYear:[1892]\n" +
                "expYear:[2105],issYear:[1994]\n" +
                "expYear:[2040],countId:[13844]\n" +
                "expYear:[2015],issYear:[1995],passId:[21013x61242],countId:[248]\n" +
                "expYear:[2061],issYear:[2041],passId:[60314x101043],countId:[157]\n" +
                "expYear:[2079],issYear:[2022],passId:[10812x10818],countId:[17906]\n" +
                "expYear:[2043],issYear:[1917],passId:[10014x121220],countId:[2]\n" +
                "expYear:[2082],issYear:[1940],countId:[6792]\n" +
                "expYear:[2020],issYear:[2013],passId:[110811x0807],countId:[61]\n" +
                "expYear:[2036],issYear:[2004],passId:[0085x17051],countId:[174]\n" +
                "expYear:[2055],issYear:[2016],passId:[30314x612109],countId:[15577]\n" +
                "expYear:[2057],issYear:[1952],passId:[7004x14328],countId:[312]\n" +
                "expYear:[2047],issYear:[2027],countId:[15]\n" +
                "expYear:[2081],passId:[12149x11421],countId:[10238]\n" +
                "expYear:[2114],issYear:[2094],passId:[6069x13400],countId:[11811]\n" +
                "issYear:[1992],passId:[5008x7134],countId:[132]\n" +
                "expYear:[2039],issYear:[2023],countId:[124]\n" +
                "expYear:[2120],issYear:[2046],passId:[6120x7377],countId:[322]\n" +
                "expYear:[2004],issYear:[1878],passId:[9094x148117]\n" +
                "expYear:[2045],passId:[31914x5835],countId:[19260]\n" +
                "expYear:[2125],issYear:[2038],passId:[7119x5147],countId:[263]\n" +
                "expYear:[2044],passId:[110114x13993],countId:[264]\n" +
                "expYear:[2139],issYear:[1999],passId:[4032x7889],countId:[8212]\n" +
                "expYear:[2050],issYear:[1932],passId:[3086x9532],countId:[129]\n" +
                "expYear:[2109],issYear:[2107],passId:[01113x14351],countId:[228]\n" +
                "expYear:[2051],issYear:[2031],passId:[6192x10411],countId:[90]\n" +
                "expYear:[2048],issYear:[2027],countId:[19371]\n" +
                "expYear:[2044],issYear:[1954]\n" +
                "passId:[10810x9439],countId:[16690]\n" +
                "expYear:[2113],issYear:[1978],passId:[10121x101219]\n" +
                "expYear:[2090],issYear:[2070],passId:[90811x4081]\n" +
                "expYear:[2020],issYear:[1870],passId:[100611x155107]\n" +
                "issYear:[2040],passId:[12119x17758],countId:[9993]\n" +
                "expYear:[2114],issYear:[1979],passId:[7138x5424],countId:[271]\n" +
                "expYear:[2079],issYear:[1982],passId:[1167x01127],countId:[10279]\n" +
                "expYear:[2065],issYear:[2045]\n" +
                "expYear:[2138],issYear:[2107],passId:[70513x115116]\n" +
                "expYear:[2045],issYear:[2025],passId:[120110x12978],countId:[220]\n" +
                "issYear:[1991],passId:[5053x6797],countId:[104]\n" +
                "expYear:[2046],issYear:[2026],countId:[6438]\n" +
                "expYear:[2126],passId:[7116x41267]\n" +
                "passId:[12178x16103],countId:[210]\n" +
                "expYear:[2044],issYear:[2024],passId:[50010x16484],countId:[106]\n" +
                "expYear:[2072],issYear:[2046],passId:[121610x14472],countId:[8574]\n" +
                "expYear:[2077],issYear:[1946],passId:[31314x101149],countId:[16951]\n" +
                "expYear:[2040],issYear:[2028],passId:[4063x8689],countId:[226]\n" +
                "expYear:[2058],issYear:[1925],passId:[1149x151118]\n" +
                "expYear:[2035],issYear:[1971],passId:[100110x51197],countId:[7475]\n" +
                "expYear:[2035],issYear:[1936],passId:[1185x11046],countId:[214]\n" +
                "expYear:[2020],issYear:[1963],passId:[70213x39115],countId:[215]\n" +
                "expYear:[2018],issYear:[1998],passId:[6104x11112],countId:[132]\n" +
                "issYear:[1962],countId:[8771]\n" +
                "expYear:[2059],issYear:[1927],passId:[110714x61278],countId:[15378]\n" +
                "expYear:[2117],issYear:[1974],passId:[11186x11297],countId:[115]\n" +
                "expYear:[2022],issYear:[1894],passId:[4050x1019],countId:[86]\n" +
                "expYear:[2040],issYear:[2037],passId:[31110x9067],countId:[252]\n" +
                "expYear:[2025]\n" +
                "expYear:[2127],issYear:[2070]\n" +
                "expYear:[2081],issYear:[2061],passId:[5186x101204],countId:[15438]\n" +
                "expYear:[2075],issYear:[1970],passId:[12061x7214]\n" +
                "expYear:[2027],issYear:[1975],countId:[151]\n" +
                "expYear:[2048],issYear:[2028],passId:[41814x13013],countId:[244]\n" +
                "expYear:[2026],issYear:[1954],passId:[40010x17552],countId:[34]\n" +
                "issYear:[2104],passId:[4041x72114]\n" +
                "expYear:[2002],issYear:[1982],passId:[6181x15378],countId:[92]\n" +
                "expYear:[2019],countId:[17077]\n" +
                "expYear:[2074],passId:[90714x12378],countId:[18072]\n" +
                "expYear:[2101],issYear:[2001],passId:[30813x6178],countId:[5489]\n" +
                "expYear:[2050],passId:[11192x8797],countId:[10]\n" +
                "issYear:[2065],passId:[00712x0224],countId:[193]\n" +
                "expYear:[2046],passId:[7164x12992],countId:[11369]\n" +
                "expYear:[2004],issYear:[1902],countId:[111]\n" +
                "expYear:[2044],issYear:[2024],passId:[100911x7617]\n" +
                "expYear:[2043],issYear:[2023],passId:[1132x611105],countId:[8109]\n" +
                "expYear:[2140],issYear:[2138],passId:[6067x10939]\n" +
                "expYear:[2046],passId:[60411x3617],countId:[7344]\n" +
                "expYear:[2069],passId:[5014x2079]\n" +
                "expYear:[2026],issYear:[2025],passId:[4139x51214],countId:[18896]\n" +
                "issYear:[2005],passId:[1191x3366],countId:[13218]\n" +
                "expYear:[2052],passId:[5086x16274],countId:[83]\n" +
                "issYear:[2098],passId:[6009x17379],countId:[14821]\n" +
                "expYear:[2047],countId:[11338]\n" +
                "expYear:[2039],issYear:[1953],passId:[2086x01212],countId:[250]\n" +
                "expYear:[2105],issYear:[2085],countId:[4227]\n" +
                "expYear:[2045],issYear:[2025],passId:[11174x41154]\n" +
                "issYear:[2100],passId:[12170x7313]\n" +
                "issYear:[1894],passId:[11410x1817],countId:[17674]\n" +
                "expYear:[2042],issYear:[1908],passId:[11117x2952],countId:[17860]\n" +
                "expYear:[2103],passId:[81412x2297],countId:[14163]\n" +
                "issYear:[2026],passId:[6148x9789],countId:[231]\n" +
                "expYear:[2121],passId:[00710x13911],countId:[21]\n" +
                "expYear:[2113],issYear:[2069],passId:[3171x7039],countId:[88]\n" +
                "expYear:[2104],issYear:[1990],passId:[7105x1195],countId:[113]\n" +
                "expYear:[2116],issYear:[2048],passId:[6046x17406],countId:[2768]\n" +
                "expYear:[2040],issYear:[2000],passId:[4002x16807]\n" +
                "expYear:[2041],issYear:[2020],passId:[1139x106116],countId:[187]\n" +
                "expYear:[2045],issYear:[2021],passId:[6039x6630],countId:[253]\n" +
                "expYear:[2056],issYear:[1918],passId:[121510x04117],countId:[14541]\n" +
                "expYear:[2043],issYear:[1962],passId:[60710x5673],countId:[237]\n" +
                "expYear:[2022],issYear:[1888],passId:[4001x7304]\n" +
                "expYear:[2136],issYear:[1996],passId:[91213x111149],countId:[3976]\n" +
                "expYear:[2045],issYear:[1951],passId:[1007x41132],countId:[15269]\n" +
                "expYear:[2121],issYear:[2067],passId:[70412x8390],countId:[171]\n" +
                "expYear:[2071],passId:[21512x5640],countId:[221]\n" +
                "expYear:[2046],issYear:[1958],passId:[121811x1453],countId:[260]\n" +
                "issYear:[2055],passId:[0083x125101],countId:[8589]\n" +
                "issYear:[2078],passId:[9060x121115],countId:[268]\n" +
                "expYear:[2141],issYear:[1993],countId:[64]\n" +
                "issYear:[1960],passId:[1081x1642],countId:[257]\n" +
                "expYear:[2051],issYear:[2017],passId:[9136x11438],countId:[172]\n" +
                "expYear:[2024],passId:[120714x7012],countId:[1563]\n" +
                "expYear:[2057],issYear:[2037],passId:[2030x131027],countId:[78]\n" +
                "expYear:[2049],issYear:[2029],passId:[0145x15740],countId:[19302]\n" +
                "issYear:[1957],passId:[4118x17998],countId:[117]\n" +
                "expYear:[2006],issYear:[1986],passId:[100214x31163],countId:[51]\n" +
                "expYear:[2046],issYear:[1897],passId:[01714x15959],countId:[21]\n" +
                "expYear:[2047],issYear:[1908],passId:[7097x5441],countId:[8703]\n" +
                "expYear:[2064],passId:[110713x168117],countId:[10966]\n" +
                "issYear:[2042],passId:[1194x3206]\n" +
                "expYear:[2028],countId:[70]\n" +
                "expYear:[2110],issYear:[2090],passId:[11410x141278],countId:[238]\n" +
                "issYear:[1903],passId:[4066x1671],countId:[5386]\n" +
                "expYear:[2102],issYear:[2086],passId:[101810x0080],countId:[196]\n" +
                "expYear:[2107],passId:[12140x4175],countId:[124]\n" +
                "expYear:[2124],passId:[8099x131072],countId:[63]\n" +
                "expYear:[2068],issYear:[2021],passId:[80710x10614],countId:[147]\n" +
                "passId:[8012x9475],countId:[16727]\n" +
                "passId:[6181x61297],countId:[5215]\n" +
                "issYear:[2055],passId:[30614x7838],countId:[16385]\n" +
                "expYear:[2009],passId:[9198x161153],countId:[114]\n" +
                "countId:[147]\n" +
                "expYear:[2103],issYear:[2083],countId:[7600]\n" +
                "expYear:[2118],issYear:[2030],passId:[8159x18115],countId:[102]\n" +
                "expYear:[2042],issYear:[1996],passId:[10056x121210]\n" +
                "expYear:[2016],issYear:[1980],passId:[0090x105103],countId:[7782]\n" +
                "expYear:[2043],issYear:[1923],countId:[2460]\n" +
                "expYear:[2058],issYear:[1991],countId:[6061]\n" +
                "expYear:[2041],issYear:[2021],passId:[3007x105106],countId:[17517]\n" +
                "expYear:[2048],issYear:[2028],passId:[120710x6025],countId:[230]\n" +
                "expYear:[2040],issYear:[2020],passId:[9053x1511108],countId:[15100]\n" +
                "expYear:[2043],issYear:[2023],passId:[12125x4146],countId:[7380]\n" +
                "expYear:[2046],issYear:[1988],passId:[7033x50101],countId:[106]\n" +
                "expYear:[2141],passId:[7150x6337],countId:[195]\n" +
                "expYear:[2009],issYear:[1860],countId:[166]\n" +
                "expYear:[2015],issYear:[1995],passId:[12051x5603],countId:[271]\n" +
                "expYear:[2105],issYear:[2085],passId:[10042x2887],countId:[266]\n" +
                "expYear:[2002],issYear:[1868],countId:[15736]\n" +
                "expYear:[2049],passId:[91410x111039],countId:[253]\n" +
                "expYear:[2048],issYear:[2028],passId:[60410x4203],countId:[194]\n" +
                "issYear:[2018],passId:[4060x2847]\n" +
                "expYear:[2134],issYear:[2114],countId:[9423]\n" +
                "expYear:[2050],issYear:[1977],passId:[10128x04107],countId:[49]\n" +
                "expYear:[2108],issYear:[2013],passId:[9182x2373],countId:[26]\n" +
                "expYear:[2036]\n" +
                "issYear:[1996],passId:[3016x21292],countId:[2531]\n" +
                "passId:[8029x41252],countId:[247]\n" +
                "expYear:[2097],issYear:[1987],countId:[76]\n" +
                "expYear:[2013],issYear:[1976],passId:[10010x3889],countId:[15290]\n" +
                "expYear:[2006],issYear:[1892]\n" +
                "expYear:[2049],issYear:[1939],passId:[51014x22115],countId:[17289]\n" +
                "issYear:[1987],passId:[20013x17232]\n" +
                "issYear:[2004],passId:[70610x5442],countId:[12]\n" +
                "issYear:[2008],passId:[71814x17490],countId:[75]\n" +
                "expYear:[2041],issYear:[1934],passId:[101013x14114],countId:[6806]\n" +
                "expYear:[2048],issYear:[2028],passId:[70312x171066],countId:[201]\n" +
                "expYear:[2070],passId:[10110x5338]\n" +
                "expYear:[2045],issYear:[2035],passId:[2016x66115],countId:[2347]\n" +
                "expYear:[2083],issYear:[2063],passId:[12017x610106],countId:[29]\n" +
                "expYear:[2041],issYear:[1928],passId:[81114x10043],countId:[6642]\n" +
                "passId:[12128x5533],countId:[84]\n" +
                "expYear:[2076],issYear:[2056],passId:[8116x4101],countId:[1084]\n" +
                "expYear:[2051],issYear:[1923],passId:[5015x16826],countId:[5359]\n" +
                "expYear:[2140],countId:[3667]\n" +
                "expYear:[2089],issYear:[1998],passId:[8091x3276],countId:[192]\n" +
                "expYear:[2044],issYear:[1969],passId:[71011x111076],countId:[52]\n" +
                "expYear:[2106],issYear:[1972],passId:[7048x2426],countId:[4428]\n" +
                "expYear:[2082],issYear:[2012],passId:[8072x37106],countId:[2405]\n" +
                "expYear:[2052],issYear:[1911],passId:[3081x17094],countId:[5988]\n" +
                "expYear:[2031],issYear:[2013],countId:[173]\n" +
                "expYear:[2046],issYear:[2026],passId:[12004x17434],countId:[133]\n" +
                "expYear:[2044],issYear:[1953],passId:[11197x9940],countId:[140]\n" +
                "expYear:[2048],issYear:[2027],passId:[9058x101167],countId:[105]\n" +
                "expYear:[2040],issYear:[2020],passId:[2160x12581]\n" +
                "expYear:[2104],issYear:[2084],passId:[6092x2675],countId:[18304]\n" +
                "expYear:[2046],issYear:[1905],passId:[0171x25109]\n" +
                "expYear:[2046],issYear:[1962],passId:[00511x1898],countId:[6316]\n" +
                "expYear:[2080],issYear:[2049],passId:[6138x159116]\n" +
                "expYear:[2055],issYear:[1920],passId:[121710x1212117]\n" +
                "expYear:[2050],issYear:[2045],passId:[10047x9745],countId:[12183]\n" +
                "expYear:[2052],issYear:[1952],passId:[00910x15127],countId:[20]\n" +
                "issYear:[1920],passId:[110214x14106],countId:[11394]\n" +
                "expYear:[2047],passId:[1027x71053],countId:[8065]\n" +
                "expYear:[2133],issYear:[2095]\n" +
                "expYear:[2023],issYear:[1998],passId:[121411x8359],countId:[157]\n" +
                "issYear:[2027],passId:[9181x13027],countId:[9104]\n" +
                "expYear:[2123],issYear:[2055],passId:[30010x9398],countId:[30]\n" +
                "issYear:[2054],passId:[50411x16004],countId:[12973]\n" +
                "expYear:[2066],issYear:[2046],passId:[51713x51295],countId:[96]\n" +
                "expYear:[2046],issYear:[2026],passId:[6143x1788],countId:[121]\n" +
                "expYear:[2043],issYear:[1916],passId:[2005x4242],countId:[12949]\n" +
                "expYear:[2142],issYear:[2010],passId:[40510x8776],countId:[11725]\n" +
                "expYear:[2095],passId:[6127x1611107],countId:[15532]\n" +
                "expYear:[2121],issYear:[2005],passId:[11187x9762],countId:[4099]\n" +
                "expYear:[2045],issYear:[2025],passId:[20310x115102]\n" +
                "expYear:[2046],issYear:[1961],passId:[1073x9138],countId:[19362]\n" +
                "expYear:[2045],issYear:[2012],passId:[11014x5075],countId:[30]\n" +
                "expYear:[2003],issYear:[1983],passId:[11161x17055],countId:[138]\n" +
                "expYear:[2110],issYear:[2090],passId:[61812x7196]\n" +
                "expYear:[2048],issYear:[1969],passId:[101311x16110],countId:[17223]\n" +
                "expYear:[2045],issYear:[1915],passId:[51014x59109],countId:[14924]\n" +
                "expYear:[2131],issYear:[2111],passId:[10127x51249]\n" +
                "expYear:[2037],passId:[6184x121153],countId:[8812]\n" +
                "expYear:[2051],issYear:[2031],passId:[11146x83109],countId:[71]\n" +
                "expYear:[2129],issYear:[2062],passId:[9062x16664],countId:[1661]\n" +
                "expYear:[2119],passId:[1159x01225],countId:[205]\n" +
                "expYear:[2074],issYear:[1964],passId:[8123x3119]\n" +
                "expYear:[2018],passId:[0072x14944],countId:[13]\n" +
                "expYear:[2041],issYear:[2021],passId:[31111x00112],countId:[10223]\n" +
                "expYear:[2125],issYear:[2105],countId:[21]\n" +
                "expYear:[2053],issYear:[1959],passId:[6045x13471],countId:[9735]\n" +
                "expYear:[2073],issYear:[1930],countId:[139]\n" +
                "expYear:[2042],issYear:[2022]\n" +
                "expYear:[2079],passId:[81413x3714],countId:[2435]\n" +
                "expYear:[2049],issYear:[2029],passId:[41510x17571],countId:[4964]\n" +
                "expYear:[2049],passId:[10130x9365],countId:[15]\n" +
                "expYear:[2046],issYear:[1950],passId:[91011x9722],countId:[7664]\n" +
                "passId:[120814x11485],countId:[50]\n" +
                "expYear:[2044],passId:[41514x15565],countId:[6009]\n" +
                "expYear:[2062],issYear:[2025],passId:[10177x3046],countId:[8414]\n" +
                "passId:[2028x11208],countId:[56]\n" +
                "issYear:[1938],passId:[101513x9959],countId:[219]\n" +
                "expYear:[2041],issYear:[1909],passId:[11097x119117]\n" +
                "expYear:[2085],issYear:[2022]\n" +
                "expYear:[2017],issYear:[1997],countId:[14765]\n" +
                "expYear:[1998],issYear:[1978],passId:[9193x121123],countId:[184]\n" +
                "expYear:[2051],issYear:[1943],passId:[120111x13212]\n" +
                "expYear:[2051],issYear:[1945],passId:[91911x9346],countId:[5496]\n" +
                "expYear:[2071],issYear:[1998],passId:[81813x25116],countId:[86]\n" +
                "issYear:[1986],passId:[5192x16491],countId:[136]\n" +
                "expYear:[2002],issYear:[1982],passId:[7065x34116],countId:[19399]\n" +
                "expYear:[2049],passId:[6160x14769],countId:[46]\n" +
                "expYear:[2045],issYear:[2025],countId:[3447]\n" +
                "expYear:[2052],issYear:[1909],passId:[2010x612116],countId:[203]\n" +
                "expYear:[2138],issYear:[2124],passId:[8084x7726],countId:[173]\n" +
                "expYear:[2074],issYear:[1986],passId:[3016x9215],countId:[19056]\n" +
                "expYear:[2093],issYear:[2018],passId:[10032x6029],countId:[5773]\n" +
                "expYear:[1999],issYear:[1979],countId:[14186]\n" +
                "expYear:[2048],issYear:[2032],passId:[10182x14753],countId:[0]\n" +
                "expYear:[2077],issYear:[2006],passId:[2173x0996]\n" +
                "expYear:[2002],passId:[3123x911107],countId:[11119]\n" +
                "expYear:[2005],issYear:[1904],passId:[5051x102119],countId:[13026]\n" +
                "countId:[106]\n" +
                "issYear:[2074],passId:[2144x3852],countId:[18283]\n" +
                "expYear:[2040],issYear:[2013],passId:[12053x13675],countId:[15771]\n" +
                "expYear:[2116],issYear:[2096],countId:[6742]\n" +
                "issYear:[2095],passId:[121310x3044],countId:[6694]\n" +
                "expYear:[2049],issYear:[2029],passId:[9064x131057],countId:[6204]\n" +
                "expYear:[2040],issYear:[2006],passId:[70010x31218],countId:[40]\n" +
                "expYear:[2091],issYear:[2071],passId:[51113x10287],countId:[3739]\n" +
                "expYear:[2040],issYear:[2020]\n" +
                "expYear:[2010],issYear:[1922]\n" +
                "countId:[22]\n" +
                "issYear:[2028],passId:[9170x13885],countId:[255]\n" +
                "issYear:[1950],passId:[11079x17343],countId:[4263]\n" +
                "issYear:[2013],passId:[1080x8678],countId:[12123]\n" +
                "expYear:[2019],passId:[8197x14480],countId:[16673]\n" +
                "expYear:[2033],issYear:[2003],passId:[3079x73107],countId:[6629]\n" +
                "passId:[10000x9261],countId:[9757]\n" +
                "issYear:[1907],passId:[71114x11782],countId:[17]\n" +
                "expYear:[2088],issYear:[2068],passId:[20313x10110]\n" +
                "expYear:[2078],passId:[5194x71132],countId:[12040]\n" +
                "expYear:[2061],issYear:[2018],passId:[10141x4279]\n" +
                "expYear:[2127],issYear:[1982],passId:[1001x105115],countId:[110]\n" +
                "issYear:[1951],passId:[12026x6339],countId:[18280]\n" +
                "expYear:[2050],passId:[12014x14421],countId:[8833]\n" +
                "expYear:[2052],passId:[3090x6556]\n" +
                "expYear:[2123],issYear:[2103],passId:[110410x17029]\n" +
                "expYear:[2089],issYear:[2004],passId:[30612x86107],countId:[9334]\n" +
                "expYear:[2126],issYear:[2106],passId:[8116x14999],countId:[17632]\n" +
                "expYear:[2045],issYear:[1901],passId:[111712x15437],countId:[223]\n" +
                "expYear:[2082],countId:[3174]\n" +
                "expYear:[2071],issYear:[2051],passId:[4148x7253],countId:[5796]\n" +
                "expYear:[2050],issYear:[2030],passId:[91512x41220],countId:[988]\n" +
                "expYear:[2133],issYear:[2080],passId:[2198x171015],countId:[1366]\n" +
                "expYear:[2015],issYear:[1995],passId:[111014x17655],countId:[8216]\n" +
                "issYear:[2050],passId:[5118x6731],countId:[15]\n" +
                "expYear:[2049],issYear:[1927],passId:[0145x21174]\n" +
                "expYear:[2133],passId:[1163x7031],countId:[7569]\n" +
                "expYear:[2040],issYear:[2020],passId:[12140x111100],countId:[168]\n" +
                "expYear:[2044],passId:[110913x169108],countId:[15129]\n" +
                "expYear:[2099],passId:[7066x151042],countId:[150]\n" +
                "expYear:[2043],passId:[20613x8398],countId:[16943]\n" +
                "expYear:[2043],issYear:[1906],passId:[2047x51152],countId:[19172]\n" +
                "expYear:[2115],issYear:[2033],passId:[40012x151146],countId:[92]\n" +
                "expYear:[2067],issYear:[2047],passId:[1071x17104],countId:[7717]\n" +
                "expYear:[2086],issYear:[2057],passId:[12171x17936],countId:[205]\n" +
                "expYear:[2035],issYear:[1973],passId:[7159x10231],countId:[17179]\n" +
                "expYear:[2048],issYear:[1937],passId:[2003x151213],countId:[259]\n" +
                "expYear:[2029],issYear:[1966],passId:[21412x53103]\n" +
                "expYear:[2050],issYear:[1908]\n" +
                "expYear:[2052],passId:[3043x85119],countId:[12322]\n" +
                "expYear:[2050],issYear:[1912],countId:[5064]\n" +
                "expYear:[2048],issYear:[2007],passId:[90310x61013],countId:[205]\n" +
                "expYear:[2004],issYear:[1986],passId:[2048x151042]\n" +
                "expYear:[2047],passId:[3138x121011],countId:[260]\n" +
                "expYear:[2005],issYear:[1879],passId:[9188x41270]\n" +
                "expYear:[2057],issYear:[2037],passId:[9091x15893],countId:[16374]\n" +
                "expYear:[2085],passId:[6084x13917],countId:[7]\n" +
                "expYear:[2045],issYear:[2023],passId:[11199x13450],countId:[157]\n" +
                "expYear:[2043],issYear:[1904],countId:[162]\n" +
                "expYear:[2072],countId:[3545]\n" +
                "expYear:[2014],passId:[81914x121288],countId:[265]\n" +
                "issYear:[2018],passId:[7052x60101],countId:[6136]\n" +
                "expYear:[2043],issYear:[2023]\n" +
                "expYear:[2042],issYear:[2038],passId:[6137x6777]\n" +
                "expYear:[2044],passId:[101010x9565],countId:[68]\n" +
                "expYear:[2023],issYear:[1878],passId:[11043x91024],countId:[77]\n" +
                "expYear:[2048],issYear:[1958],passId:[100314x138118],countId:[16965]\n" +
                "expYear:[2101],passId:[50614x16333],countId:[12524]\n" +
                "expYear:[2050],passId:[9111x111069],countId:[85]\n" +
                "passId:[0123x10229],countId:[161]\n" +
                "expYear:[2028],passId:[2141x15241],countId:[3714]\n" +
                "expYear:[2048],issYear:[2028],countId:[244]\n" +
                "expYear:[2090],issYear:[2070],countId:[2697]\n" +
                "issYear:[2029],passId:[80813x8359],countId:[10]\n" +
                "issYear:[2085],countId:[5093]\n" +
                "expYear:[2040],issYear:[1891],passId:[11152x41035],countId:[4619]\n" +
                "expYear:[2041],issYear:[1971],passId:[30811x5531]\n" +
                "expYear:[2108],issYear:[2020],passId:[9165x07101],countId:[149]\n" +
                "issYear:[2012]\n" +
                "expYear:[2041],issYear:[1913],passId:[7151x17533]\n" +
                "issYear:[1922],countId:[82]\n" +
                "expYear:[2043],countId:[15584]\n" +
                "expYear:[2050],issYear:[2000],passId:[91812x10570],countId:[2]\n" +
                "expYear:[2037],issYear:[2017],passId:[1108x9757],countId:[1376]\n" +
                "expYear:[2049],passId:[11060x16995],countId:[14724]\n" +
                "expYear:[2049],issYear:[2000],passId:[12100x7614],countId:[207]\n" +
                "issYear:[1923],passId:[0160x3731]\n" +
                "expYear:[2095],issYear:[2084],passId:[8069x141248],countId:[54]\n" +
                "expYear:[2071],issYear:[1981],passId:[1072x5362],countId:[136]\n" +
                "expYear:[2107],issYear:[2011],passId:[2131x3988],countId:[62]\n" +
                "expYear:[2030],issYear:[1926],passId:[0105x13061]\n" +
                "issYear:[1990],countId:[74]\n" +
                "expYear:[2010],issYear:[1923],passId:[3023x11645],countId:[215]\n" +
                "expYear:[2138],issYear:[2111],countId:[105]\n" +
                "expYear:[2081],issYear:[2061],passId:[40811x161025],countId:[106]\n" +
                "expYear:[2113],issYear:[2022],passId:[8000x14590],countId:[263]\n" +
                "expYear:[2040],issYear:[1975],passId:[00611x12107],countId:[259]\n" +
                "issYear:[2071],passId:[41310x3852],countId:[43]\n" +
                "issYear:[1920],passId:[0158x101149],countId:[3659]\n" +
                "expYear:[2048],issYear:[2028],passId:[8079x10013]\n" +
                "expYear:[2092],issYear:[1983],passId:[8115x11937]\n" +
                "issYear:[1885],countId:[31]\n" +
                "expYear:[2060],issYear:[2044],passId:[6013x41087],countId:[244]\n" +
                "expYear:[2098],issYear:[2032],passId:[8160x21012],countId:[95]\n" +
                "expYear:[2138],passId:[4194x81044],countId:[78]\n" +
                "issYear:[2060],countId:[160]\n" +
                "issYear:[2023],passId:[9086x21112],countId:[97]\n" +
                "expYear:[2045],issYear:[1994]\n" +
                "expYear:[2049],issYear:[1986],passId:[9104x9904],countId:[17787]\n" +
                "issYear:[2025],passId:[40510x9137],countId:[243]\n" +
                "expYear:[2095],issYear:[2034],passId:[3111x5993],countId:[59]\n" +
                "expYear:[2096],issYear:[1995],passId:[100514x6442],countId:[7524]\n" +
                "issYear:[1913],countId:[3070]\n" +
                "issYear:[2068],passId:[11006x0329],countId:[98]\n" +
                "expYear:[2040],issYear:[1982],passId:[11107x2380],countId:[4899]\n" +
                "expYear:[2140],issYear:[2059],countId:[13335]\n" +
                "expYear:[2142],issYear:[2042],passId:[0117x5596],countId:[43]\n" +
                "expYear:[2075],passId:[12126x4603],countId:[12780]\n" +
                "expYear:[2098],issYear:[2034],passId:[61311x5623],countId:[137]\n" +
                "expYear:[2032],issYear:[1887],passId:[100912x12779],countId:[12931]\n" +
                "expYear:[2054],issYear:[1904],passId:[11191x11514],countId:[9724]\n" +
                "expYear:[2014],issYear:[1994],passId:[20114x131111],countId:[199]\n" +
                "expYear:[2018],issYear:[1927],passId:[20311x8258],countId:[14788]\n" +
                "expYear:[2052],passId:[41712x2958],countId:[84]\n" +
                "expYear:[2136],passId:[5017x9019],countId:[8]\n" +
                "expYear:[2137],issYear:[2051],passId:[9034x11216],countId:[6490]\n" +
                "expYear:[2015],issYear:[1988],countId:[178]\n" +
                "passId:[11051x16787],countId:[174]\n" +
                "expYear:[2023],issYear:[1938],countId:[231]\n" +
                "expYear:[2104],issYear:[1966]\n" +
                "expYear:[2051],passId:[1141x94116],countId:[16023]\n" +
                "expYear:[2043],passId:[5111x9155],countId:[10385]\n" +
                "expYear:[2042],issYear:[1922],passId:[9130x16208],countId:[118]\n" +
                "expYear:[2033],passId:[0035x15562],countId:[6934]\n" +
                "expYear:[2117],issYear:[2072],passId:[10040x1211116]\n" +
                "expYear:[2050],issYear:[1994],passId:[2170x61263]\n" +
                "expYear:[2041],issYear:[2025],passId:[120311x1248]\n" +
                "expYear:[2130],issYear:[2110],passId:[10132x10041]\n" +
                "expYear:[2109],issYear:[2089],passId:[7121x12240],countId:[114]\n" +
                "expYear:[2050],issYear:[2030],passId:[7001x7054],countId:[119]\n" +
                "expYear:[2039],issYear:[2019],passId:[101714x6616],countId:[19156]\n" +
                "expYear:[1997],issYear:[1936],passId:[9045x3665],countId:[14760]\n" +
                "issYear:[1848],passId:[3159x46112]\n" +
                "expYear:[2131],issYear:[1996],passId:[3159x31178],countId:[198]\n" +
                "passId:[7186x156102],countId:[82]\n" +
                "expYear:[2025],issYear:[1947],passId:[90112x127107]\n" +
                "expYear:[2065],issYear:[2029],passId:[3054x0003]\n" +
                "issYear:[2015],passId:[2039x140114]\n" +
                "expYear:[2082],issYear:[1971],passId:[0190x15085]\n" +
                "expYear:[2141],passId:[10015x7552],countId:[12921]\n" +
                "expYear:[2046],issYear:[2006],passId:[0088x811109],countId:[95]\n" +
                "expYear:[2024],passId:[21310x01055],countId:[83]\n" +
                "expYear:[2038],passId:[5137x4396],countId:[156]\n" +
                "expYear:[2050],issYear:[1934],passId:[30414x31070],countId:[206]\n" +
                "expYear:[2042],issYear:[2022],passId:[5163x51114]\n" +
                "expYear:[2020],issYear:[1875],passId:[51110x12076],countId:[8523]\n" +
                "expYear:[2050],issYear:[2048],passId:[12153x11828],countId:[15653]\n" +
                "expYear:[2072],issYear:[2052],passId:[91211x6550],countId:[16346]\n" +
                "expYear:[2047],issYear:[2021],passId:[11710x14069],countId:[15980]\n" +
                "expYear:[2075],issYear:[2055],passId:[10141x2608],countId:[2856]\n" +
                "expYear:[2058],issYear:[1990],passId:[7026x4617]\n" +
                "expYear:[2097],issYear:[1973],passId:[4014x0257],countId:[1967]\n" +
                "expYear:[2136],passId:[30612x1309],countId:[246]\n" +
                "issYear:[1916],passId:[30612x9760],countId:[12031]\n" +
                "expYear:[2051],issYear:[2038],passId:[7149x10651],countId:[9777]\n" +
                "expYear:[2050],countId:[43]\n" +
                "expYear:[2077],issYear:[1977],passId:[120014x7343],countId:[7343]\n" +
                "expYear:[2045],issYear:[2025],passId:[12063x91013],countId:[146]\n" +
                "expYear:[2040],issYear:[1955],passId:[40911x14821],countId:[7591]\n" +
                "issYear:[2086],passId:[121111x8686],countId:[12517]\n" +
                "expYear:[2051],issYear:[1938],countId:[263]\n" +
                "expYear:[2058],issYear:[2032],passId:[9131x131133],countId:[2044]\n" +
                "expYear:[2070],issYear:[1996],countId:[12873]\n" +
                "expYear:[2039],issYear:[1980],countId:[52]\n" +
                "expYear:[2095],issYear:[2001],countId:[7800]\n" +
                "expYear:[2090],issYear:[2070],passId:[8197x2089],countId:[35]\n" +
                "issYear:[2106],countId:[200]\n" +
                "expYear:[2052],issYear:[2032],passId:[120713x34113],countId:[248]\n" +
                "expYear:[2021],issYear:[1932]\n" +
                "expYear:[2047],issYear:[2027],passId:[11176x10146],countId:[3085]\n" +
                "expYear:[2047],passId:[120311x9091],countId:[41]\n" +
                "expYear:[2051],issYear:[2014],passId:[8009x2716],countId:[9274]\n" +
                "expYear:[2130],issYear:[2110]\n" +
                "passId:[71511x161084]\n" +
                "expYear:[2048],passId:[7175x7072],countId:[31]\n" +
                "expYear:[2047],issYear:[1968],passId:[7054x0891]\n" +
                "expYear:[2051],issYear:[2042],passId:[51014x14403]\n" +
                "expYear:[2041],issYear:[1946],passId:[10083x91256],countId:[31]\n" +
                "expYear:[2103],issYear:[2069],passId:[3015x0183]\n" +
                "expYear:[2059],issYear:[2030],passId:[6188x13973],countId:[14404]\n" +
                "expYear:[2052],issYear:[1979],passId:[11146x11723],countId:[14496]\n" +
                "issYear:[1882],passId:[5183x1710113],countId:[174]\n" +
                "expYear:[2054],issYear:[2037],passId:[4191x171247],countId:[7640]\n" +
                "expYear:[2045],passId:[61812x91280],countId:[54]\n" +
                "expYear:[2044],issYear:[1977],passId:[4010x9952],countId:[126]\n" +
                "expYear:[2052],issYear:[1919],passId:[3131x165102],countId:[83]\n" +
                "expYear:[2042],issYear:[2023],passId:[0194x101177],countId:[260]\n" +
                "issYear:[1986],countId:[9905]\n" +
                "issYear:[2094],countId:[141]\n" +
                "expYear:[2044],issYear:[1996],passId:[6113x11247]\n" +
                "expYear:[2117],issYear:[2001],passId:[4170x7100],countId:[51]\n" +
                "expYear:[2047],passId:[111410x3961]\n" +
                "expYear:[2045],issYear:[1908],passId:[8179x16790],countId:[1312]\n" +
                "expYear:[2107],issYear:[2061],passId:[101814x4229]\n" +
                "expYear:[2040],issYear:[1966],countId:[7779]\n" +
                "expYear:[2005],issYear:[1985],passId:[0181x12238],countId:[220]\n" +
                "expYear:[2047],issYear:[1991],countId:[219]\n" +
                "expYear:[2000],passId:[9051x141262],countId:[156]\n" +
                "expYear:[2121],issYear:[2046],passId:[9146x164118],countId:[14150]\n" +
                "expYear:[2085],issYear:[1938],passId:[10117x7690],countId:[23]\n" +
                "expYear:[2076],issYear:[1973],countId:[14281]\n" +
                "expYear:[2122],issYear:[2102],passId:[12051x7921],countId:[5]\n" +
                "expYear:[2075],issYear:[1949],passId:[0163x0578],countId:[6763]\n" +
                "issYear:[2007]\n" +
                "expYear:[2076],passId:[2060x16866],countId:[15691]\n" +
                "expYear:[2050],issYear:[2030],passId:[9101x121241]\n" +
                "expYear:[2044],issYear:[2018],passId:[11030x3053]\n" +
                "expYear:[2044]\n" +
                "expYear:[2034],passId:[30313x1346]\n" +
                "expYear:[2115],countId:[167]\n" +
                "expYear:[2018],passId:[81311x1742],countId:[15]\n" +
                "expYear:[2051],issYear:[2031],passId:[70811x127118],countId:[12637]\n" +
                "expYear:[2031],issYear:[1882],passId:[90413x15801],countId:[8626]\n" +
                "issYear:[1983],passId:[31112x111180],countId:[38]\n" +
                "expYear:[1997],issYear:[1996],passId:[7138x16451],countId:[189]\n" +
                "expYear:[2013],issYear:[1898],passId:[91610x1923],countId:[106]\n" +
                "passId:[3104x15350],countId:[71]\n" +
                "expYear:[2078],passId:[11035x210107],countId:[16018]\n" +
                "expYear:[2049],issYear:[2029],passId:[110712x14149],countId:[18784]\n" +
                "issYear:[2025],passId:[5188x76118],countId:[4224]\n" +
                "issYear:[2028],passId:[01510x0796]\n" +
                "expYear:[2013],issYear:[1993],passId:[50612x4265],countId:[249]\n" +
                "passId:[8154x4126],countId:[4079]\n" +
                "expYear:[2091],issYear:[2071],passId:[0083x5893]\n" +
                "expYear:[2045],issYear:[2025],passId:[121710x0112],countId:[554]\n" +
                "expYear:[2042],issYear:[2023],passId:[50911x1169],countId:[7482]\n" +
                "expYear:[2088],issYear:[1955],passId:[10910x5993],countId:[209]\n" +
                "issYear:[2026],passId:[7085x0331],countId:[150]\n" +
                "expYear:[2045],issYear:[1999],countId:[13538]\n" +
                "expYear:[2070],issYear:[1994],passId:[100714x15233],countId:[18]\n" +
                "expYear:[2041],issYear:[1913],passId:[1147x13387]\n" +
                "expYear:[2051],passId:[3030x4808],countId:[200]\n" +
                "issYear:[2051],passId:[7117x5831],countId:[97]\n" +
                "passId:[11058x1819],countId:[2250]\n" +
                "expYear:[2052],issYear:[2032],passId:[8132x3739],countId:[103]\n" +
                "issYear:[1943],passId:[1190x14604],countId:[2195]\n" +
                "expYear:[2008],issYear:[1961],passId:[7077x31279],countId:[16099]\n" +
                "expYear:[2041],issYear:[1971],passId:[12030x16649]\n" +
                "expYear:[2048],issYear:[1929],countId:[7130]\n" +
                "expYear:[2024],passId:[8064x141134],countId:[271]\n" +
                "issYear:[2118],passId:[5014x11131],countId:[16047]\n" +
                "expYear:[2060],issYear:[1920],passId:[7020x7628],countId:[178]\n" +
                "expYear:[2009],issYear:[1917],passId:[12180x1010103]\n" +
                "expYear:[2050],issYear:[1900],passId:[6101x10923]\n" +
                "expYear:[2045],issYear:[2025],passId:[7103x104108],countId:[9377]\n" +
                "passId:[1030x01165],countId:[993]\n" +
                "expYear:[2012],issYear:[1909],passId:[6074x7753],countId:[7026]\n" +
                "passId:[2014x3324],countId:[249]\n" +
                "passId:[7163x9936],countId:[12197]\n" +
                "countId:[225]\n" +
                "expYear:[2042],issYear:[2013],passId:[6085x7419],countId:[10]\n" +
                "expYear:[2029],issYear:[2024],passId:[4069x15340],countId:[4714]\n" +
                "issYear:[1979],passId:[11199x4874],countId:[9187]\n" +
                "expYear:[2072],issYear:[1984]\n" +
                "passId:[6090x101243],countId:[199]\n" +
                "issYear:[2030],countId:[227]\n" +
                "issYear:[1890],passId:[10096x13113],countId:[11112]\n" +
                "expYear:[2040],issYear:[1896],passId:[12152x21248],countId:[1760]\n" +
                "expYear:[2035],issYear:[1981],passId:[11114x11401]\n" +
                "issYear:[2002],passId:[7143x10465],countId:[293]\n" +
                "issYear:[1962],passId:[11187x5972],countId:[16831]\n" +
                "expYear:[2106],issYear:[2086],passId:[0095x4913],countId:[8432]\n" +
                "expYear:[2048],issYear:[2028],passId:[71912x81106],countId:[4565]\n" +
                "expYear:[2038],issYear:[2012]\n" +
                "issYear:[1950],passId:[1059x31288],countId:[17300]\n" +
                "expYear:[2007],issYear:[1987],passId:[60710x611101]\n" +
                "passId:[41814x12622],countId:[12256]\n" +
                "expYear:[2051],issYear:[2031],passId:[1030x61098],countId:[3508]\n" +
                "expYear:[2038],passId:[5182x101241],countId:[1593]\n" +
                "expYear:[2029],issYear:[2010],countId:[244]\n" +
                "issYear:[2045],passId:[70714x5783],countId:[18411]\n" +
                "expYear:[2037],issYear:[2017],passId:[51510x15673]\n" +
                "expYear:[2120],issYear:[2100],passId:[1068x6810],countId:[8]\n" +
                "expYear:[2091],passId:[120911x6202],countId:[10069]\n" +
                "expYear:[2049],issYear:[2029],passId:[6012x8751],countId:[171]\n" +
                "issYear:[2031],passId:[30510x3140],countId:[94]\n" +
                "passId:[21711x10532]\n" +
                "expYear:[2139],issYear:[2017],passId:[10214x10120],countId:[95]\n" +
                "issYear:[2029],passId:[10014x9445]\n" +
                "expYear:[2018],passId:[111310x11212],countId:[4853]\n" +
                "expYear:[2066],issYear:[1940],passId:[11054x38116],countId:[8]\n" +
                "expYear:[2082],passId:[101611x117100],countId:[259]\n" +
                "issYear:[2005],passId:[11174x81218],countId:[70]\n" +
                "expYear:[2081],issYear:[2039],passId:[12186x3135],countId:[19050]\n" +
                "expYear:[2051],issYear:[1928],countId:[17202]\n" +
                "expYear:[2048],issYear:[2028]\n" +
                "expYear:[1999],issYear:[1960],countId:[4820]\n" +
                "issYear:[1908],passId:[5061x10911],countId:[11157]\n" +
                "expYear:[2008],issYear:[1962],passId:[10069x1138],countId:[217]\n" +
                "passId:[5144x16898],countId:[73]\n" +
                "expYear:[2057],issYear:[1946],passId:[120811x13118],countId:[28]\n" +
                "expYear:[2098],issYear:[2094],passId:[01814x2392],countId:[182]\n" +
                "expYear:[2045],passId:[50712x91058]\n" +
                "expYear:[2081],issYear:[1966]\n" +
                "expYear:[2125],issYear:[2105],passId:[2137x12138],countId:[12883]\n" +
                "expYear:[2118],issYear:[2098],countId:[5175]\n" +
                "issYear:[2109],passId:[7034x17310],countId:[4954]\n" +
                "expYear:[2050],issYear:[2029],passId:[10128x26118],countId:[7412]\n" +
                "expYear:[2050],issYear:[1963],passId:[3182x15357]\n" +
                "expYear:[2045],issYear:[2025],passId:[51011x06112],countId:[2991]\n" +
                "expYear:[2061],passId:[11091x151058],countId:[207]\n" +
                "issYear:[2026],passId:[10167x47102],countId:[2198]\n" +
                "expYear:[2052],passId:[12002x1010117],countId:[14388]\n" +
                "expYear:[2099],issYear:[2049],passId:[81310x7696],countId:[82]\n" +
                "expYear:[2093],passId:[1061x1506]\n" +
                "issYear:[2020],passId:[31313x101109],countId:[0]\n" +
                "expYear:[2116],issYear:[1991],passId:[50111x14330],countId:[916]\n" +
                "issYear:[1882],countId:[10]\n" +
                "expYear:[2095],passId:[90512x10233],countId:[17150]\n" +
                "expYear:[2099],issYear:[2079],passId:[6043x8615],countId:[14540]\n" +
                "expYear:[2000],issYear:[1980],passId:[8138x136111]\n" +
                "expYear:[2040],issYear:[1983],passId:[7028x11365],countId:[224]\n" +
                "passId:[4155x141272],countId:[71]\n" +
                "expYear:[2046],issYear:[1938],countId:[16884]\n" +
                "issYear:[1943]";
        String[] rawStrings = raw.split("\n");
        int valid = 0;

        for (int i = 0; i < rawStrings.length; i++) {
            try {
                StringBuilder expYear = new StringBuilder();
                StringBuilder issYear = new StringBuilder();
                StringBuilder countId = new StringBuilder();
                if (rawStrings[i].charAt(0) == 'e') {
                    if (String.valueOf(rawStrings[i].charAt(9)).equals("2")) {
                        expYear.append(rawStrings[i].charAt(9));
                        if (String.valueOf(rawStrings[i].charAt(10)).equals("0")) {
                            expYear.append(rawStrings[i].charAt(10));
                            if (String.valueOf(rawStrings[i].charAt(11)).equals("4") || String.valueOf(rawStrings[i].charAt(11)).equals("5")) {
                                expYear.append(rawStrings[i].charAt(11));
                                if (String.valueOf(rawStrings[i].charAt(12)).equals("0") || String.valueOf(rawStrings[i].charAt(12)).equals("1") || String.valueOf(rawStrings[i].charAt(12)).equals("2") || String.valueOf(rawStrings[i].charAt(12)).equals("3") || String.valueOf(rawStrings[i].charAt(12)).equals("4") || String.valueOf(rawStrings[i].charAt(12)).equals("5") || String.valueOf(rawStrings[i].charAt(12)).equals("6") || String.valueOf(rawStrings[i].charAt(12)).equals("7") || String.valueOf(rawStrings[i].charAt(12)).equals("8") || String.valueOf(rawStrings[i].charAt(12)).equals("9")) {
                                    expYear.append(rawStrings[i].charAt(12));
                                    if (String.valueOf(rawStrings[i].charAt(15)).equals("i")) {
                                        issYear.append(rawStrings[i].charAt(24));
                                        issYear.append(rawStrings[i].charAt(25));
                                        issYear.append(rawStrings[i].charAt(26));
                                        issYear.append(rawStrings[i].charAt(27));
                                        if (Integer.parseInt(issYear.toString()) == (Integer.parseInt(expYear.toString())) - 20) {
                                            if (String.valueOf(rawStrings[i].charAt(30)).equals("p")) {
                                                if (String.valueOf(rawStrings[i].charAt(42)).equals("x")) {
                                                    if (String.valueOf(rawStrings[i].charAt(47)).equals("]")) {
                                                        if (String.valueOf(rawStrings[i].charAt(49)).equals("c")) {
                                                            /*if (String.valueOf(rawStrings[i].charAt(58)).equals("0") || String.valueOf(rawStrings[i].charAt(58)).equals("1") || String.valueOf(rawStrings[i].charAt(58)).equals("2") || String.valueOf(rawStrings[i].charAt(58)).equals("3") || String.valueOf(rawStrings[i].charAt(58)).equals("4") || String.valueOf(rawStrings[i].charAt(58)).equals("5") || String.valueOf(rawStrings[i].charAt(58)).equals("6") || String.valueOf(rawStrings[i].charAt(58)).equals("7") || String.valueOf(rawStrings[i].charAt(58)).equals("8") || String.valueOf(rawStrings[i].charAt(58)).equals("9") && String.valueOf(rawStrings[i].charAt(59)).equals("]")) {
                                                                System.out.println(rawStrings[i].charAt(58));
                                                                System.out.println(rawStrings[i].charAt(59));
                                                                System.out.println(rawStrings[i]);
                                                            }*/
                                                            for (int j = 58; j < 62; j++) {
                                                                if (String.valueOf(rawStrings[i].charAt(58)).equals("0") || String.valueOf(rawStrings[i].charAt(58)).equals("1") || String.valueOf(rawStrings[i].charAt(58)).equals("2")) {
                                                                    if ()
                                                                }
                                                            }
                                                                System.out.println(rawStrings[i]);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            } catch (StringIndexOutOfBoundsException e) {

            }
        }
        System.out.println(valid);
    }

    public static void main(String[] args) {
        part1();
        part2();
        part3();
        part4();
        part5();
    }
}
