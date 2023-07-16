
// Задание
// 1) Напишите метод, который определит тип (расширение) файлов из текущей папки и выведет в консоль результат вида
// 1 Расширение файла: txt
// 2 Расширение файла: pdf
// 3 Расширение файла:
// 4 Расширение файла: jpg


import java.io.File;

public class task1 {
    public static void main(String[] args) {
        String[] pathnames;
        File f = new File("C:\\Users\\annas\\OneDrive\\\u0420\u0430\u0431\u043E\u0447\u0438\u0439 \u0441\u0442\u043E\u043B\\gb\\java\\homeworks\\hw2");
        pathnames = f.list();
        for (String pathname : pathnames) {
            System.out.printf("%s расширение файла: %s\n", pathname, getExtention(pathname));
        }
    
    }
    static String getExtention(String file){
        int index = file.lastIndexOf(".");
        if (index == -1)
            return "";
        return file.substring(index + 1);
    }
}