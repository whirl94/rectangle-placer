package entities;

import utils.Constants;

public class Line {
    private int height;

    private int remainingWidth = Constants.FRAME_WIDTH;

    private int index;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getRemainingWidth(){
        return remainingWidth;
    }

    public void setRemainingWidth(int width){
        this.remainingWidth = width;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }
}
