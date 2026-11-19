package in.controllers;

import java.io.File;
import java.io.FileInputStream;
import java.io.OutputStream;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import jakarta.servlet.http.HttpServletResponse;

@Controller
public class MyController 
{
	@GetMapping("/downloadPage")
	public String openDownloadPage()
	{
		return "download-file";
	}
	
	@PostMapping("/downloadForm")
	public void downloadFile(HttpServletResponse response)
	{
		try 
		{
			response.setContentType("applocation/octet-stream");
			
			File file = new File("F:\\Git Repositories\\Spring And SpringBoot (Advance Java) SP\\J Spring WEB-MVC Module\\l. Download Files (Image, PDF, Word etc)\\Download File\\atomic-habits.jpg");
			
			FileInputStream fis = new FileInputStream(file);
			
			response.setHeader("content-disposition", "attachment;filename=\""+file.getName()+"\"");
			response.setContentLength((int)file.length());
			
			OutputStream os = response.getOutputStream();
			
			int i;
			while ( (i = fis.read()) != -1) 
			{
				os.write(i);
				
			}
			
			System.out.println("File Downloaded SUccesfully..");
			
			fis.close();
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
			System.out.println(("File Not Downloaded Due To Some Error !!!"));
		}
		
	}
}
