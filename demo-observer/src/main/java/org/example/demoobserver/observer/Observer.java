package org.example.demoobserver.observer;

public interface Observer<T> {

    void update(T data);
}