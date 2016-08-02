package com.example.saurabhchaturvedi.asynctaskprob;

/**
 * Created by Saurabh.Chaturvedi on 8/2/2016.
 */
public interface TaskListener {
    void onTaskStarted();

    void onTaskFinished(String result);
}
