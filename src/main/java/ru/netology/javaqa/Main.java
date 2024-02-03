package ru.netology.javaqa;


public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.surname = "Petrova";
        post.name = "Marina";
        post.patronymic = "Ivanovna";
        post.birthday = new FormDate();
        post.birthday.day = 10;
        post.birthday.month = 2;
        post.birthday.year = 1992;
        post.passport = "1234 58583434";
        post.phone = "+7 921 234 54 56";
        post.subscription = true;
    }
}