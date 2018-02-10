package com.company;

public class PathCompresion_Quick_Union {

    public int rootPathCompress(int i, int[] arr) {
        int temp = i;
        while(i != arr[i]) {
            arr[i] = arr[arr[i]];
            i = arr[i];
        }
        arr[temp] = i;
        return i;
    }

//    public String getAnswer() {
//        return answer;
//    }
//
//    public void setAnswer(String answer) {
//        this.answer = answer;
//    }
}
