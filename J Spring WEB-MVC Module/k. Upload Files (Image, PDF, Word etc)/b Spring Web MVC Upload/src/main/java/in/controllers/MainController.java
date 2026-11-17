package in.controllers;

import java.io.FileOutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.multipart.MultipartFile;

import in.beans.User;


@Controller
public class MainController 
{
	@GetMapping("/uploadFilePage")
	public String openUploadFilePage()
	{
		return "upload-file";
	}
	
	@PostMapping("/uploadFileForm")
	public String uploadFileForm(@ModelAttribute("user") User user, Model model)
	{
		String name1 = user.getName();
		String email1 = user.getEmail();
		MultipartFile resume = user.getResume();
		MultipartFile profilepic = user.getProfilepic();
		
		
		// -------------- Resume Uploading ------------
		String resume_status;
		
		try 
		{
			String file_name = resume.getOriginalFilename();
			byte[] file_in_bytes = resume.getBytes();
			
			FileOutputStream fos = new FileOutputStream("F:\\Git Repositories\\Spring And SpringBoot (Advance Java) SP\\J Spring WEB-MVC Module\\k. Upload Files (Image, PDF, Word etc)\\Uploaded Files\\"+file_name);
			fos.write(file_in_bytes);
			
			resume_status = "Resume Uploaded Succesfully.";
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			resume_status = "Resume Not Uploaded Due To Some Error !!!";
		}
		
		// -------------- Profile Pic Uploading ------------
		String profilepic_status;
		
		try 
		{
			String file_name = profilepic.getOriginalFilename();
			byte[] file_in_bytes = profilepic.getBytes();
			
			FileOutputStream fos = new FileOutputStream("F:\\Git Repositories\\Spring And SpringBoot (Advance Java) SP\\J Spring WEB-MVC Module\\k. Upload Files (Image, PDF, Word etc)\\Uploaded Files\\"+file_name);
			fos.write(file_in_bytes);
			
			profilepic_status = "Profile Pic Uploaded Successfully.";
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			profilepic_status = "Profile Pic Not Uploaded Due To Some Error !!!";
		}
		
		model.addAttribute("m_name", name1);
		model.addAttribute("m_email", email1);
		model.addAttribute("m_resume_status", resume_status);
		model.addAttribute("m_profilepic_status", profilepic_status);
		
		
		return "status";
	}
}
