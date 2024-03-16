package io.zipcoder;

import java.util.Objects;

public class Music {

    private String[] playList;
    private int counter1 = 0;
    private int counter2 = 0;

    public Music(String[] playList){
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection){
        for(int i = startIndex, length = playList.length; ; i = (i + 1) % length) {
            if (!Objects.equals(playList[i], selection)){
                counter1++;
            }else if (playList[i].equals(selection)) {
             break;
            }
        }
        for(int i = startIndex, length = playList.length; ; i = (i + 1) % length) {
            if (!Objects.equals(playList[i], selection)){
                counter2++;
            }else if (playList[i].equals(selection)) {
                break;
            }
        }





        return Math.min(counter1, counter2);
    }
}
