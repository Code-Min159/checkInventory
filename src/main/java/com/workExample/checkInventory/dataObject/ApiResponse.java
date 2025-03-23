package com.workExample.checkInventory.dataObject;

import lombok.Data;

@Data
public class ApiResponse<T> {

    private String stasus;
    private String message;
    private T data;





}
