import java.util.Scanner;


public class UsernameandPassword {
	public static void main(String[] args) {
			Scanner keyboard = new Scanner(System.in);
					String username , password;
							String correctusername , correctpassword;
									correctusername = "Daniel Green";
											correctpassword = "IamDaniel";
													System.out.println("Enter your username:");
															username = keyboard.nextLine();
																	System.out.println("Enter your password:");
																			password = keyboard.nextLine();
																					if (correctusername.equals(username)&&correctpassword.equals(password)) {
																								System.out.println("Welcome Daniel Green!");
																										}
																												else {
																															System.out.println("Username and/or Password incorrect. Please try again.");
																																	}
																																			
																																				}
																																				}

