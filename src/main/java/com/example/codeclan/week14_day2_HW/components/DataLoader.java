package com.example.codeclan.week14_day2_HW.components;

import com.example.codeclan.week14_day2_HW.models.File;
import com.example.codeclan.week14_day2_HW.models.Folder;
import com.example.codeclan.week14_day2_HW.models.Person;
import com.example.codeclan.week14_day2_HW.repositorty.FileRepository;
import com.example.codeclan.week14_day2_HW.repositorty.FolderRepository;
import com.example.codeclan.week14_day2_HW.repositorty.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;

public class DataLoader implements ApplicationRunner {

    @Autowired
    PersonRepository personRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    FileRepository fileRepository;

    public void run(ApplicationArguments args) {

        Person person1 = new Person("Leo");
        Person person2 = new Person("Raph");
        Person person3 = new Person("Mikey");
        Person person4 = new Person("Don");

        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        personRepository.save(person4);

        Folder folder1 = new Folder("Leo's Photos", person1);
        Folder folder2 = new Folder("Raph's Stuff", person2);
        Folder folder3 = new Folder("Mikey's Pizza Recipes", person3);
        Folder folder4 = new Folder("Don's Documents", person4);

        folderRepository.save(folder1);
        folderRepository.save(folder2);
        folderRepository.save(folder3);
        folderRepository.save(folder4);

        File file1 = new File("Image001", "JPEG", "200kb", folder1);
        File file2 = new File("Image002", "JPEG", "250kb", folder1);
        File file3 = new File("Letters", "DOC", "20kb", folder2);
        File file4 = new File("Pepperoni Pizza Recipe", "PDF", "1mb", folder3);
        File file5 = new File("Spreadsheet", "XL", "108kb", folder4);
        File file6 = new File ("Splinter's instructions", "text", "2kb", folder4);

        fileRepository.save(file1);
        fileRepository.save(file2);
        fileRepository.save(file3);
        fileRepository.save(file4);
        fileRepository.save(file5);
        fileRepository.save(file6);

    }
}
