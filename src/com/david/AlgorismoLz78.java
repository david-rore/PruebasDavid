package com.david;

import java.util.HashMap;

class AlgorismoLz78{

    private static int getKeyForValue(HashMap<Integer, String> m, String s){
        for (java.util.Map.Entry<Integer, String> iterator : m.entrySet()) {
            if (iterator.getValue().equals(s))
                return iterator.getKey();
        }
        return -1;
    }


   private static String writeHashMap(HashMap<Integer, String> hm){

        StringBuilder compressionhm = new StringBuilder();
        for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
            compressionhm.append(entry.getKey());
            compressionhm.append(entry.getValue());
            compressionhm.append('\n');
        }
        return compressionhm.toString();
    }

    private static HashMap<Integer, String> readHashMap(String compressedHashMap){

        HashMap<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < compressedHashMap.length(); ++i){
            int key = compressedHashMap.charAt(i);
            //char value = compressedHashMap.charAt(++i);
           // hm.put(key, value);
        }
        return hm;

    }
    private static String readHashMap(HashMap<Integer, String> hm, StringBuilder compression){

        for (HashMap.Entry<Integer, String> entry : hm.entrySet()) {
            compression.append(entry.getKey());
            compression.append(entry.getValue());
        }
        return compression.toString();
    }

    static String f_compression(String file) {
        /*
        HashMap<Integer, String> dictionary = new HashMap<>();

        String text_to_compress = lector.leerTxt(path_e);
        StringBuilder compression = new StringBuilder();
        String decompression = "";

        String aux, aux_result ="";
        int index = -1, index_aux;

        for (int i = 0; i < text_to_compress.length(); ++i) {
            char letter_c = text_to_compress.charAt(i);
            String letter = String.valueOf(text_to_compress.charAt(i));

            if (letter_c == (char) 13) {
                compression.append((char) 13);
            }
            else {
                if (dictionary.isEmpty() || !dictionary.containsValue(letter)) { //NEW LETTER (FIRST TIME IN DICTIONARY)
                    dictionary.put(++index, letter);
                    compression.append((char) 0).append(letter);
                } else {
                    int j = i + 1;
                    if (j >= text_to_compress.length()) { //IF TEXT ENDS WITH A LETTER THAT IS ALREADY REGISTERED
                        index_aux = getKeyForValue(dictionary, letter);
                        dictionary.put(++index, letter);
                        compression.append((char) index_aux).append(letter);
                    } else { //COMMON CASE (known letter + unknown letters)
                        aux = letter;
                        String aux2 = letter;
                        boolean found = false;

                        while (j < text_to_compress.length() && !found) {
                            aux += text_to_compress.charAt(j);                          //Full word concatenated
                            aux_result = String.valueOf(text_to_compress.charAt(j));    //Last character

                            if (!dictionary.containsValue(aux)) {
                                index_aux = getKeyForValue(dictionary, aux2);
                                dictionary.put(++index, aux);
                                compression.append((char) index_aux).append(aux_result);
                                found = true;
                            }
                            aux2 += text_to_compress.charAt(j);
                            ++j;
                        }
                        i = j - 1;
                    }
                }
            }
        }
        decompression = f_decompression(compression, dictionary);
        return decompression;*/

        HashMap<Integer, String> dictionary = new HashMap<>();
        StringBuilder compression = new StringBuilder();

        String aux, aux_result ="";
        int index = -1, index_aux;

        for (int i = 0; i < file.length(); ++i) {
            String letter = String.valueOf(file.charAt(i));

            if (dictionary.isEmpty() || !dictionary.containsValue(letter)) { //NEW LETTER (FIRST TIME IN DICTIONARY)
                dictionary.put(++index, letter);
                compression.append((char) 0).append(letter);
            } else {
                int j = i + 1;
                if (j >= file.length()) { //IF TEXT ENDS WITH A LETTER THAT IS ALREADY REGISTERED
                    index_aux = getKeyForValue(dictionary, letter);
                    dictionary.put(++index, letter);
                    compression.append((char) index_aux).append(letter);
                } else { //COMMON CASE (known letter + unknown letters)
                    aux = letter;
                    String aux2 = letter;
                    boolean found = false;

                    while (j < file.length() && !found) {
                        aux += file.charAt(j);                          //Full word concatenated
                        aux_result = String.valueOf(file.charAt(j));    //Last character

                        if (!dictionary.containsValue(aux)) {
                            index_aux = getKeyForValue(dictionary, aux);
                            dictionary.put(++index, aux_result);
                            compression.append((char) index_aux).append(aux_result);
                            found = true;
                        }
                        aux2 += file.charAt(j);
                        ++j;
                    }
                    i = j - 1;
                }
            }
        }
        return compression.toString();
    }

    private static String f_decompression(StringBuilder text_comp, HashMap<Integer, String> dictionary) {

        StringBuilder decompression = new StringBuilder();

        int i = 0;
        while (i <  text_comp.length()) {
            int index = text_comp.charAt(i);
            char letter = text_comp.charAt(++i);

            if (index == 0){
                decompression.append(letter);

            }
            else{
                String prev_letters = dictionary.get(index);
                decompression.append(prev_letters).append(letter);
            }
            ++i;
        }
        return decompression.toString();
    }

}

