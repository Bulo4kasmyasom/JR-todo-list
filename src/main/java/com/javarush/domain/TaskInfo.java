package com.javarush.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TaskInfo {
    private String description;
    private Status status;
}