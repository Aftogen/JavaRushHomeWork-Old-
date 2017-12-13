package com.javarush.test.level16.lesson13.bonus01;


import com.javarush.test.level16.lesson13.bonus01.common.*;


public class ImageReaderFactory {

    public static ImageReader getReader(ImageTypes lol){

            if (lol== ImageTypes.BMP)
                return new BmpReader();
            else if (lol== ImageTypes.JPG)
                return new JpgReader();
            else if (lol== ImageTypes.PNG)
                return new PngReader();

            else throw new IllegalArgumentException("Неизвестный тип картинки");

    }
}
