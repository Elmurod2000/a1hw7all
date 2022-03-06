package com.example.a1hw7;

public class HomeModel {
    private int pic;
    private String comment;

    public HomeModel(int pic, String comment) {
        this.pic = pic;
        this.comment = comment;
    }

    public int getPic() {
        return pic;
    }

    public void setPic(int pic) {
        this.pic = pic;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }
}
