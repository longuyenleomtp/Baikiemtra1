package com.example.firebase;

public class InfoSinger {
    String image, name, nickname, nationality, star;

    public InfoSinger() {

    }

    public InfoSinger(String image, String name, String nickname, String nationality, String star) {
        this.image = image;
        this.name = name;
        this.nickname = nickname;
        this.nationality = nationality;
        this.star = star;
    }
    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getStar() {
        return star;
    }

    public void setStar(String star) {
        this.star = star;
    }
}
