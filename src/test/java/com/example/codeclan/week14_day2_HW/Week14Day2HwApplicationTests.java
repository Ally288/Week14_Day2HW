package com.example.codeclan.week14_day2_HW;

import com.example.codeclan.week14_day2_HW.models.File;
import com.example.codeclan.week14_day2_HW.models.Folder;
import com.example.codeclan.week14_day2_HW.models.Person;
import com.example.codeclan.week14_day2_HW.repositorty.FileRepository;
import com.example.codeclan.week14_day2_HW.repositorty.FolderRepository;
import com.example.codeclan.week14_day2_HW.repositorty.PersonRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Week14Day2HwApplicationTests {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	FileRepository fileRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void AddAllPersonsFilesAndFolders(){
		Person leo = new Person ("leo");
		personRepository.save(leo);
		Folder folder = new Folder("Shredders Hideouts",leo);
		folderRepository.save(folder);
		File photos = new File ("Entrance","JPEG", "3mb", folder);
	}

}
