package com.company;

public class Caesar {

    char[] letter = new char[]{
            'a','b','c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q',
            'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'
    };

    public String caesarCipher(String toEncodeMessage, int steps) {
        StringBuilder codedMessage = new StringBuilder();

        for (int i = 0; i < toEncodeMessage.length(); i++){
            if(toEncodeMessage.charAt(i) == ' '){
                codedMessage.append(" ");
                continue;
            }
            codedMessage.append(encodeChar(toEncodeMessage.charAt(i), steps));
        }

        return codedMessage.toString();
    }


    public String encodeChar(char toEncode, int key) {

        if(key > 26){
            return "Error";
        }
        for (int i = 0; i < letter.length; i++){
            if (toEncode == letter[i]){
                int code = ((i+key)%26);
                return letter[code]+"";
            }
        }
        return "\n";
    }
}
