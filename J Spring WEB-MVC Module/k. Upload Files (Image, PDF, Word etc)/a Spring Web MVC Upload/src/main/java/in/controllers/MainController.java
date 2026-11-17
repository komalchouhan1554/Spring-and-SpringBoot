package in.controllers;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;


@Controller
public class MainController 
{
	@GetMapping("/uploadFilePage")
	public String openUploadFilePage()
	{
		return "upload-file";
	}
	
	@PostMapping("/uploadFileForm")
	public String uploadFileForm(@RequestParam("myfile") MultipartFile myfile,Model model)
	{
		String upload_status;
		
		try 
		{
			
			String file_name = myfile.getOriginalFilename();
			
			/*
			byte[] file_in_byte = file_name.getBytes();
			
			
			FileOutputStream fos = new FileOutputStream("F:\\Git Repositories\\Spring And SpringBoot (Advance Java) SP\\J Spring WEB-MVC Module\\k. Upload Files (Image, PDF, Word etc)\\Uploaded FIles\\" +  file_name);
			fos.write(file_in_byte);
			*/
			
			// Other way 
			
			 String uploadPath =
			            "F:\\Git Repositories\\Spring And SpringBoot (Advance Java) SP\\J Spring WEB-MVC Module\\k. Upload Files (Image, PDF, Word etc)\\Uploaded FIles\\"
			            + file_name;

			  myfile.transferTo(new java.io.File(uploadPath));
			
			upload_status = "File Uploaded Successfully...";

		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			upload_status = "File Not Uploaded Due To Some Error !!!";
		}
		
		
		model.addAttribute("m_upload_status",upload_status);
		
		return "status";
	}
}
