package com.bilgeadam.boost.week05.lesson004.file;

import java.io.File;

public class DeletedFile {

	public static void main(String[] args) {


		File file = new File("newFile.txt");
		boolean value = file.delete();
		if (value) {
			System.out.println("deleted");
		}else {
			System.out.println("no deleted");
		}

	}

}
