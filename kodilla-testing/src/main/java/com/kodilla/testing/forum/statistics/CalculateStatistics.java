package com.kodilla.testing.forum.statistics;

import java.util.List;

public class CalculateStatistics implements Statistics{

    private double commentsPerUser;
    private double commentsPerPost;
    private double postPerUser;
    private int postNumber;
    private int commentNumber;
    private int userNumber;

    public int getPostNumber() {
        return postNumber;
    }

    public int getCommentNumber() {
        return commentNumber;
    }

    public int getUserNumber() {
        return userNumber;
    }

    public double getCommentsPerUser() {
        return commentsPerUser;
    }

    public double getCommentsPerPost() {
        return commentsPerPost;
    }

    public double getPostPerUser() {
        return postPerUser;
    }

    public List<String> usersNames() {
        return null;
    }

    public int postsCount() {
        return 0;
    }

    public int commentsCount() {
        return 0;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        double postsCount = statistics.postsCount();
        double commentCount = statistics.commentsCount();
        double userCount = statistics.usersNames().size();
        postNumber = statistics.postsCount();
        commentNumber = statistics.commentsCount();
        userNumber = statistics.usersNames().size();
        if(postsCount == 0.0) {
            System.out.println("Error! No posts!");
        } else if (commentCount == 0.0){
            System.out.println("Error! No comments!");
        } else if (userCount == 0.0) {
            System.out.println("Error! No users!");
        } else {
            commentsPerPost = commentCount / postsCount;
            postPerUser = postsCount / userCount;
            commentsPerUser = commentCount / userCount;
        }
    }
}




