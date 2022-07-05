package com.gd.creational.simplefactory;

public class Client {
    public static void main(String[] args) {
        Post blogPost = PostFactory.createPost("blog");
        Post newsPost = PostFactory.createPost("news");
        Post productPost = PostFactory.createPost("product");

        System.out.println(blogPost.getClass().getSimpleName());
        System.out.println(newsPost.getClass().getSimpleName());
        System.out.println(productPost.getClass().getSimpleName());
    }
}