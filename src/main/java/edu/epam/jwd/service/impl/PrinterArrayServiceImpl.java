package edu.epam.jwd.service.impl;

import edu.epam.jwd.entity.IntArray;
import edu.epam.jwd.exception.SuperException;
import edu.epam.jwd.service.PrinterArrayService;

import java.io.IOException;
import java.util.Arrays;

public class PrinterArrayServiceImpl implements PrinterArrayService {
    @Override
    public void print(Appendable out, IntArray array) throws SuperException {
        try {
            int[] numbers = array.asJavaArray();
            out.append(Arrays.toString(numbers));
        } catch (IOException e) {
            throw new SuperException(e);
        }
    }
}
