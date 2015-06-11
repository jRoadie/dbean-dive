package com.jroadie.todo.dbeans;

import io.dbean.core.DBean;

import java.util.Date;

public class Task extends DBean {

    String title;
    String description;
    Date dateToComplete;
    Date created;
    Date updated;

}
