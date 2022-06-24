package LabSessions;

class SnakeCase 
{
	public String camelToSnake(String str)
	 {
	//empty string
	String stt="";
	//append first character to lower case
	stt+=Character.toLowerCase(str.charAt(0));

	for(int i=1;i<str.length();i++)
	{
	 char ch=str.charAt(i);
	 //checking the character is Unicode identifier or not
	if (Character.isUnicodeIdentifierPart(ch))
	{
	 stt=stt+'_';		//using add assign operator
	 stt=stt+Character.toLowerCase(ch);	//converting char to lowercase
	 }
	else
	{
	stt=stt+ch;
	 }  
	}
	return stt;
	 }
	public static void main(String[] args) 
	{
	 // creating a object of SnakeCase
	 SnakeCase sn=new SnakeCase();
	 System.out.println(sn.camelToSnake("DoSelect"));
	}

}

