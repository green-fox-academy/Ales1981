package com.greenfoxacademy.backedapi.services;

import com.greenfoxacademy.backedapi.models.ArrayHandler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArrayHandlerServiceimpl implements ArrayHandlerService {

    private final ArrayHandler arrayHandler;

    @Autowired
    public ArrayHandlerServiceimpl(ArrayHandler arrayHandler) {
        this.arrayHandler = arrayHandler;
    }

    @Override
    public void doMath(ArrayHandler arrayHandler) {
        int[] result = new int[1];
        if (arrayHandler.getWhat().equals("sum")) {
//            result[0] = 0;
            for (int element : arrayHandler.getNumbers()) {
                result[0] += element;
            }
            arrayHandler.setResult(result);
        }
        if (arrayHandler.getWhat().equals("multiply")) {
            result[0] = 1;
            for (int element : arrayHandler.getNumbers()) {
                result[0] *= element;
            }
            arrayHandler.setResult(result);
        }
        if (arrayHandler.getWhat().equals("double")) {
            result = new int[arrayHandler.getNumbers().length];
            for (int i = 0; i < arrayHandler.getNumbers().length; i++) {
                result[i] = arrayHandler.getNumbers()[i] * 2;
            }
            arrayHandler.setResult(result);
        }
    }
}
