package io.zipcoder;

import java.util.Objects;

public class Music {

    private String[] playList;


    public Music(String[] playList) {
        this.playList = playList;
    }

    public Integer selection(Integer startIndex, String selection) {
        int counter1 = 0;
        int counter2 = 0;
        int n = playList.length;

            for (int i = startIndex; ; i++) {
                int index = i % n;
                if (!Objects.equals(playList[index], selection)) {
                    counter1++;
                } else {
                    break;
                }
            }
            for (int j = startIndex; ; j--) {
                int indexj = (j + n) % n;
                if (!Objects.equals(playList[indexj], selection)) {
                    counter2++;
                } else {
                    break;
                }
            }
        return Math.min(counter1, counter2);
    }
}
