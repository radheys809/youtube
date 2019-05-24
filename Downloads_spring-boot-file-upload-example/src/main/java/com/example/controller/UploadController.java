package com.example.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.util.FileTypesConst;

@Controller
public class UploadController {

	// Save the uploaded file to this folder
	private static final String UPLOADED_FOLDER = "files/";
	private static  final String IMG_PATH = "images/";
	private static final  String DOC_PATH = "documents/";
	private static final String VID_PATH = "videos/";
	private static final  String PDF_PATH = "pdf/";
	private static final String XML_PATH = "config/";
	private static final String OTHER_PATH = "others/";

	@GetMapping("/")
	public String index() {
		return "upload";
	}

	@PostMapping("/upload") // //new annotation since 4.3
	public String singleFileUpload(@RequestParam("file") MultipartFile file, RedirectAttributes redirectAttributes) {

		if (file.isEmpty()) {
			redirectAttributes.addFlashAttribute("message", "Please select a file to upload");
			return "redirect:uploadStatus";
		}

		try {
			Path path = null;
			String extenstion = StringUtils.getFilenameExtension(file.getOriginalFilename());

			// Get the file and save it somewhere
			byte[] bytes = file.getBytes();

			if (extenstion.equalsIgnoreCase(FileTypesConst.PDF_FILE)) {
				path = Paths.get(UPLOADED_FOLDER + PDF_PATH + file.getOriginalFilename());
			} else if (extenstion.equalsIgnoreCase(FileTypesConst.DOC_FILE)) {
				path = Paths.get(UPLOADED_FOLDER + DOC_PATH + file.getOriginalFilename());
			} else if (extenstion.equalsIgnoreCase(FileTypesConst.XML_FILE)
					|| extenstion.equalsIgnoreCase(FileTypesConst.PROP_FILE)) {
				path = Paths.get(UPLOADED_FOLDER + XML_PATH + file.getOriginalFilename());
			} else if (extenstion.equalsIgnoreCase(FileTypesConst.VID_FILE)) {
				path = Paths.get(UPLOADED_FOLDER + VID_PATH + file.getOriginalFilename());
			} else if (extenstion.equalsIgnoreCase(FileTypesConst.JPEG_FILE)
					|| extenstion.equalsIgnoreCase(FileTypesConst.JPG_FILE)) {
				path = Paths.get(UPLOADED_FOLDER + IMG_PATH + file.getOriginalFilename());
			} else {
				path = Paths.get(UPLOADED_FOLDER + OTHER_PATH + file.getOriginalFilename());
			}

			Files.write(path, bytes);

			redirectAttributes.addFlashAttribute("message",
					"You successfully uploaded '" + file.getOriginalFilename() + "'");

		} catch (IOException e) {
			e.printStackTrace();
		}

		return "redirect:/uploadStatus";
	}

	@GetMapping("/uploadStatus")
	public String uploadStatus() {
		return "uploadStatus";
	}

}