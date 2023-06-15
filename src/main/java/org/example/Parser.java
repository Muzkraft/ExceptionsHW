//package org.example;
//
//import java.io.*;
//import java.nio.file.FileSystemException;
//
//public class Parser {
//    public static void parseInput() throws Exception{
//        System.out.println("Введите фамилию, имя, отчество, номер телефона (число без разделителей) разделенные пробелом:");
//
//        String input;
//        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in))) {
//            input = bf.readLine();
//        }catch (IOException e){
//            throw new Exception("Произошла ошибка при работе с консолью");
//        }
//
//        String[] array = input.split(" ");
//        if (array.length > 4){
//            throw new Exception("Введено больше параметров, чем требуется!");
//        } else if (array.length < 4) {
//            throw new Exception("Введено не достаточно параметров!");
//        }
//
//        String surname = array[0];
//        String name = array[1];
//        String patronymic = array[2];
//
//        int phone;
//        try {
//            phone = Integer.parseInt(array[3]);
//        }catch (NumberFormatException e){
//            throw new NumberFormatException("Неверный формат телефона");
//        }
//    }
//
//    public static void toFile(String surname, String name, String patronymic, String phone) throws FileSystemException {
//        String fileName = surname.toLowerCase() + ".txt";
//        File file = new File(fileName);
//        try (FileWriter fileWriter = new FileWriter(file, true)){
//            if (file.length() > 0){
//                fileWriter.write('\n');
//            }
//            fileWriter.write(String.format("%s %s %s %s", surname, name, patronymic, phone));
//        }catch (IOException e){
//            throw new FileSystemException("Возникла ошибка при работе с файлом");
//        }
//    }
//}
