package org.example;

import enums.Gender;

import java.util.List;

public class Singer {
    private Long id;
    private String name;
    private int age;
    private Gender gender;
    private Music music;
    private List<Music> musics;
   public Singer(){

   }
    public Singer(String name, int age, Gender gender, Music music) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.music = music;
    }

    public Singer(String name, int age, Gender gender, Music music, List<Music> musics) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.music = music;
        this.musics = musics;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Music getMusic() {
        return music;
    }

    public void setMusic(Music music) {
        this.music = music;
    }

    public List<Music> getMusics() {
        return musics;
    }

    public void setMusics(List<Music> musics) {
        this.musics = musics;
    }

    @Override
    public String toString() {
        return "\nSinger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", music=" + music +
                ", musics=" + musics +
                '}';
    }
}
