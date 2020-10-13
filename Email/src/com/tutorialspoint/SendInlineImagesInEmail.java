package com.tutorialspoint;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;


import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class SendInlineImagesInEmail {
	
	// email address to send
	static String from = "email_address@something.com";
	
	static String htmlText = "<html>"+
			"  <body>"+
			"    <div id=\":2so\" class=\"ii gt\">"+
			"      <div id=\":1au\" class=\"a3s aXjCH \">"+
			"        <div dir=\"ltr\">"+
			"          <div class=\"gmail_default\" style=\"color:#073763\">"+
			"            <div"+
			"              style='color:rgb(0,0,0);font-family:\"something NHG DS\";font-size:medium'"+
			"            >"+
			"              <div style=\"display:flex\">"+
			"                <div"+
			"                  style=\"width:320px;background:black;color:white;font-weight:700;font-size:33px\""+
			"                >"+
			"                  <p"+
			"                    style=\"padding:0px 20px;margin-bottom:12px;margin-top:0px;padding-top:20px;\""+
			"                  >"+
			"                    A Unified Digital Experience that puts deal information at"+
			"                    your fingertips."+
			"                  </p>"+
			"                  <a style=\"text-decoration:none\" href=\"https://dealmonitor.something.com\""+
			"                    target=\"_blank\">"+
			"                    <div"+
			"                    style=\"background-color:rgb(0,172,62);border-radius:10px;color:white;width:190px;height:45px;font-size:20px;margin:30px 0px 15px 18px;border-width:1px;border-style:solid;border-color:rgb(0,172,62);font-weight:700;text-align:center\""+
			"                  >"+
			"                    <div style=\"margin-top:6px\">Launch Now</div>"+
			"                    </div>  "+
			"                  </a"+
			"                  >"+
			"                </div>"+
			"                <img"+
			"                  src=\"cid:pic\""+
			"                  alt=\"image.jpeg\""+
			"                  width=\"600\""+
			"                  height=\"380\""+
			"                  data-image-whitelisted=\"\""+
			"                  class=\"CToWUd a6T\""+
			"                  tabindex=\"0\""+
			"                />"+
			"                <div></div>"+
			"              </div>"+
			"              <div style=\"display:flex\">"+
			"                <div"+
			"                  style=\"width:300px;height:auto;padding-left:20px;padding-top:-2px\""+
			"                >"+
			"                  <div>"+
			"                    <div>"+
			"                      <p"+
			"                        style=\"font-size:30px;margin-bottom:0px;font-weight:700\""+
			"                      >"+
			"                        We are here to help you navigate Deal Monitor."+
			"                      </p>"+
			"                    </div>"+
			"                    <div"+
			"                      style=\"margin-left:32px;margin-right:32px;font-size:14px\""+
			"                    >"+
			"                      <div style=\"display:flex;padding-top:20px\">"+
			"                        <div>"+
			"                          <a  href=\"https://degreed.com/courses/deal-monitor-training?d=9717094&orgsso=something\" target=\"_blank\">"+
			"                            <img"+
			"                            src=\"cid:help\""+
			"                            alt=\"image.png\""+
			"                            width=\"46\""+
			"                            data-image-whitelisted=\"\""+
			"                            class=\"CToWUd\""+
			"                          />"+
			"                          </a><br />"+
			"                        </div>"+
			"                        <p style=\"padding-left:36px;margin-top:0px;\">"+
			"                          <a"+
			"                            href=\"https://degreed.com/courses/deal-monitor-training?d=9717094&orgsso=something\""+
			"                            style=\"color:inherit\""+
			"                            target=\"_blank\""+
			"                            data-saferedirecturl=\"https://www.google.com/url?q=http://ssrc.vzbi.com/contact.php&source=gmail&ust=1602200095380000&usg=AFQjCNEtxXBoIFMML3iKDlaTZWwWD8fjgg\""+
			"                            ><p>Quick Training</p></a"+
			"                          >"+
			"                        </p>"+
			"                      </div>"+
			"                      <div style=\"display:flex;padding-top:20px\">"+
			"                        <div>"+
			"                          <a href=\"http://vztube.something.com/videos/84797/introducing-deal-monitor\" target=\"_blank\">"+
			"                            <img"+
			"                            src=\"cid:video\""+
			"                            alt=\"image.png\""+
			"                            width=\"46\""+
			"                            data-image-whitelisted=\"\""+
			"                            class=\"CToWUd\","+
			"                          />"+
			"                          </a><br />"+
			"                        </div>"+
			"                        <p style=\"padding-left:36px;margin-top:0px;\">"+
			"                          <a"+
			"                            href=\"http://vztube.something.com/videos/84797/introducing-deal-monitor\""+
			"                            style=\"color:inherit\""+
			"                            target=\"_blank\""+
			"                            data-saferedirecturl=\"https://www.google.com/url?q=http://vztube.something.com/videos/84797/introducing-deal-monitor&source=gmail&ust=1602200095380000&usg=AFQjCNE-1T21FC5PtbpWdrAHZAeYb8dU8A\""+
			"                            >Watch the Introducing Deal Monitor video</a"+
			"                          >"+
			"                        </p>"+
			"                      </div>"+
			"                      <div style=\"display:flex;padding-top:20px\">"+
			"                        <div>"+
			"                          <a href=\"mailto:dealmonitor-feedback@something.com?subject=Deal Monitor - General Availability !!\" target=\"_blank\">"+
			"                            <img"+
			"                            src=\"cid:feedback\""+
			"                            alt=\"image.png\""+
			"                            width=\"46\""+
			"                            data-image-whitelisted=\"\""+
			"                            class=\"CToWUd\""+
			"                          />"+
			"                          </a><br />"+
			"                        </div>"+
			"                        <p style=\"padding-left:36px;margin-top:0px;\">"+
			"                          Have feedback? You can share any feature requests or"+
			"                          general feedback with us directly in the tool itself"+
			"                          or via email at  <a"+
			"                            href=\"mailto:dealmonitor-feedback@something.com\""+
			"                            style=\"color:inherit\""+
			"                            target=\"_blank\""+
			"                            >dealmonitor-feedback@something.<wbr />com</a"+
			"                          >"+
			"                        </p>"+
			"                      </div>"+
			"                    </div>"+
			"                  </div>"+
			"                </div>"+
			"                <div style=\"width:600px;height:auto;padding-top:15px\">"+
			"                  <div>"+
			"                    <p style=\"font-size:16px\">"+
			"                      <b>Deal Monitor</b> offers a one-stop shop to Sales,"+
			"                      Ordering and Customer serving teams, providing a unified"+
			"                      tracking experience of Cases, Quotes and Orders across VBG"+
			"                      Wireline, Wireless and VZ Connect Platforms."+
			"                    </p>"+
			"                  </div>"+
			"                  <div></div>"+
			"                  <div>Teams can use Deal Monitor to:</div>"+
			"                  <ul style=\"padding-left:20px\">"+
			"                    <li style=\"margin:0px 0px 10px\">"+
			"                      Check the status of a customer journey from opportunity to"+
			"                      design, quote, approve, contract and ordering"+
			"                    </li>"+
			"                    <li style=\"margin:0px 0px 10px\">"+
			"                      Access details for your assigned Salesforce accounts"+
			"                    </li>"+
			"                  </ul>"+
			"                  <div><b>You may</b></div>"+
			"                  <ul style=\"padding-left:20px\">"+
			"                    <li style=\"margin:0px 0px 10px\">"+
			"                      Search by multiple identifiers such as Opportunity,"+
			"                      Customer, Project, NASP, ECPD, Case, Quote and Order."+
			"                    </li>"+
			"                    <li style=\"margin:0px 0px 10px\">"+
			"                      Get a high level Deal overview covering various phases of"+
			"                      the sales and ordering journey"+
			"                    </li>"+
			"                    <li style=\"margin:0px 0px 10px\">"+
			"                      Drill down to details such as Address validation, site"+
			"                      configuration, pricing, Contracting progress and Ordering"+
			"                      milestones in a few clicks."+
			"                    </li>"+
			"                    <li style=\"margin:0px 0px 10px\">"+
			"                      Filter by regions, country, platform and many more to"+
			"                      extract results that you're looking for."+
			"                    </li>"+
			"                    <li style=\"margin:0px 0px 10px\">"+
			"                      Extract all the above data points as NASP or Opportunity"+
			"                      summary to a spreadsheet."+
			"                    </li>"+
			"                  </ul>"+
			"                </div>"+
			"              </div>"+
			"            </div>"+
			"            <div"+
			"              style='color:rgb(0,0,0);font-family:\"something NHG DS\";font-size:medium'"+
			"            >"+
			"              <div style=\"display:inline-flex;padding-left:10px;padding-top: 22px\">"+
			"                <p style=\"padding:0px 10px;font-size:12px;padding-top:10px\">"+
			"                  something confidential and proprietary. Unauthorized disclosure,"+
			"                  reproduction or other use prohibited. ©2020 something"+
			"                </p>"+
			"              </div>"+
			"            </div>"+
			"          </div>"+
			"          <div class=\"yj6qo\"></div>"+
			"          <div class=\"adL\">"+
			"            <div dir=\"ltr\" data-smartmail=\"gmail_signature\">"+
			"              <div dir=\"ltr\">"+
			"                <div><p></p></div>"+
			"              </div>"+
			"            </div>"+
			"          </div>"+
			"        </div>"+
			"        <div class=\"adL\"></div>"+
			"      </div>"+
			"    </div>"+
			"  </body>"+
			"</html>";
				

	static String username = "******";//change accordingly
    static String password = "******";//change accordingly
    static String host = "********";
    
	
   public static ArrayList<Mail> readEmailAddressFromFile() {
	   ArrayList<Mail> emailAddress = new ArrayList<Mail>();
	   int lineNum = 0;
	   try  {  
		   File file = new File("email.xlsx");   //creating a new file instance  
		   FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		   //creating Workbook instance that refers to .xlsx file  
		   XSSFWorkbook wb = new XSSFWorkbook(fis);   
		   XSSFSheet sheet = wb.getSheetAt(0);     //creating a Sheet object to retrieve object  
		   Iterator<Row> itr = sheet.iterator();    //iterating over excel file  
		   
		   
		   while (itr.hasNext()) {  
			   Row row = itr.next();  
			   
			   //Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
			   Cell cell = row.getCell(0);
			   if(cell != null && cell.getCellType() != Cell.CELL_TYPE_BLANK && cell.getStringCellValue() != null) {
				   Mail mail = new Mail();
				   mail.setFrom(from);
				   mail.setTo(cell.getStringCellValue());
				   mail.setLineNum(lineNum);
				   emailAddress.add(mail);
			   }
			   lineNum += 1;
			   //System.out.println("");  
		   } 
		   wb.close();
		   fis.close();
	   }   catch(Exception e)  {  
		   e.printStackTrace();  
	   }  
	   
	   
	   return emailAddress;
   }
   
   public static void writeEmailStatusToFile(Mail mail, boolean status) {
	   
	   
	   try  {  
		   File file = new File("email.xlsx");   //creating a new file instance  
		   FileInputStream fis = new FileInputStream(file);   //obtaining bytes from the file  
		   //creating Workbook instance that refers to .xlsx file  
		   XSSFWorkbook workbook = new XSSFWorkbook(fis);   
		   XSSFSheet sheet =  workbook.getSheetAt(0);     //creating a Sheet object to retrieve object  
		   
		   
		   Row row = sheet.getRow(mail.getLineNum());
		   
		   //Iterator<Cell> cellIterator = row.cellIterator();   //iterating over each column  
		   Cell cell = row.getCell(0);
		  
		   if(cell.getStringCellValue().trim().equals( mail.getTo().trim() )) {
			   System.out.println(cell.getStringCellValue().trim() + " vs " + mail.getTo().trim());
			   Cell statusCell = row.getCell(1);
			   statusCell.setCellValue(status ? "Success" : "Failed");
			   
			   // start writing it back to excel
			   FileOutputStream fos = new FileOutputStream(new File("email.xlsx"));
			   
			   workbook.write(fos);
			   System.out.println("Write to excel completed...");
			   System.out.println("");
			   fos.close();
			   
		   } 
		   
			   //System.out.println("");  
		   
		   workbook.close();
		   
		   fis.close();
	   }   catch(Exception e)  {  
		   e.printStackTrace();  
	   }  
	   
	   
   }
   
   
   public static Boolean SendSingleEmail(Mail mail) {
		  String to = mail.getTo();
	   	  
	      Properties props = new Properties();
	      props.put("mail.smtp.auth", "true");
	      //props.put("mail.smtp.starttls.enable", "true");
	      props.put("mail.smtp.host", host);
	      props.put("mail.smtp.port", "25");

	      Session session = Session.getInstance(props,
	         new javax.mail.Authenticator() {
	            protected PasswordAuthentication getPasswordAuthentication() {
	               return new PasswordAuthentication(username, password);
	            }
	         });

	      try {

	         // Create a default MimeMessage object.
	         Message message = new MimeMessage(session);

	         // Set From: header field of the header.
	         message.setFrom(new InternetAddress(from));

	         // Set To: header field of the header.
	         message.setRecipients(Message.RecipientType.TO,
	            InternetAddress.parse(to));

	         // Set Subject: header field
	         message.setSubject("Deal Monitor");

	         // This mail has 2 part, the BODY and the embedded image
	         MimeMultipart multipart = new MimeMultipart("related");

	         // first part (the html)
	         BodyPart messageBodyPart = new MimeBodyPart();

	         messageBodyPart.setContent(htmlText, "text/html");
	         // add it
	         multipart.addBodyPart(messageBodyPart);

	         // second part (the image)
	         BodyPart img1 = new MimeBodyPart();
	         img1.addHeader("Content-Type", "image/jpg");
	         DataSource fds1 = new FileDataSource(
	            "download.jpg");

	         img1.setDataHandler(new DataHandler(fds1));
	         img1.setDisposition(MimeBodyPart.INLINE);
	         img1.setHeader("Content-ID", "<pic>");
	         img1.setFileName("DealMonitor.jpg");
	         multipart.addBodyPart(img1);
	         
	         
	         BodyPart img2 = new MimeBodyPart();
	         img2.addHeader("Content-Type", "image/png; name=\"test.png\"");
	         img2.addHeader("Content-Disposition", "inline");
	         DataSource fds2 = new FileDataSource(
	            "help.png");
	         //img2.setContent(fds2, "image/png");
	         img2.setDataHandler(new DataHandler(fds2));
	         
	         img2.setHeader("Content-ID", "<help>");
	         img2.setDisposition(MimeBodyPart.INLINE);
	         img2.setFileName("help.png");
	         multipart.addBodyPart(img2);
	         
	         
	         
	         BodyPart img3 = new MimeBodyPart();
	         img3.addHeader("Content-Type", "image/png");
	         DataSource fds3 = new FileDataSource(
	            "video.png");

	         img3.setDataHandler(new DataHandler(fds3));
	         img3.setDisposition(MimeBodyPart.INLINE);
	         img3.setHeader("Content-ID", "<video>");
	         img3.setFileName("video.png");
	         multipart.addBodyPart(img3);
	         
	         
	         BodyPart img4 = new MimeBodyPart();
	         img4.addHeader("Content-Type", "image/png");
	         DataSource fds4 = new FileDataSource(
	            "feedback.png");

	         img4.setDataHandler(new DataHandler(fds4));
	         img4.setDisposition(MimeBodyPart.INLINE);
	         img4.setHeader("Content-ID", "<feedback>");
	         img4.setFileName("feedback.png");
	         multipart.addBodyPart(img4);
	         
	        

	         
	         // put everything together
	         message.setContent(multipart);
	         // Send message
	         Transport.send(message);
	         System.out.println("Sent message successfully....");
	         
	         return true;

	      } catch (MessagingException e) {
	         //throw new RuntimeException(e);
	         return false;
	      }
   }
   
   
   public static void sendMultiEmail() {
	   // get the email address the excel:
	   ArrayList<Mail> mails = SendInlineImagesInEmail.readEmailAddressFromFile();
	   
	   // the first one would be the header
	   for(int i = 1; i < mails.size(); i++) {
		   boolean success = SendInlineImagesInEmail.SendSingleEmail(mails.get(i));
		   
		   // success write the status back to excel.
		   SendInlineImagesInEmail.writeEmailStatusToFile(mails.get(i), success);
	   }
	   
   }
   
   
	
   public static void main(String[] args) {
	   
	   SendInlineImagesInEmail.sendMultiEmail();
	   
   }
}
