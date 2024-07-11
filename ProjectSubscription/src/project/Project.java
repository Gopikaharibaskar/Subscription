package project;

import java.util.*;
class Login
{

Login[] login=new Login[100];
int count=0;
String name;
String pwd1;
int y=0;
Scanner sc=new Scanner(System.in);
Login(){}
public Login(String name, String pwd1)
{
this.name=name;
this.pwd1=pwd1;

}
int register1()
{
System.out.println("Enter the Username:");
String name=sc.next();
System.out.println("Enter the Password:");
   String pwd1=sc.next();
   System.out.println("Confirm Password:");
   String pwd2=sc.next();
   if(pwd1.equals(pwd2))
   {
    Login u1=new Login(name,pwd1);
    login[count]=u1;
    System.out.println("Registration Successful");
    System.out.println("!--------------------------------------!");
System.out.println();
    login();
    return y;
   }
   else
   {
    System.out.println("Registration Failed");
    System.out.println("!--------------------------------------!");
System.out.println();
    return y=0;
   }
}
int login()
{
System.out.println("Enter the Username:");
String name=sc.next();
System.out.println("Enter the Password:");
   String pwd1=sc.next();
   if(name.equals(login[count].name) && pwd1.equals(login[count].pwd1) )
   {
    count++;
    System.out.println("Login Successfull!");
    System.out.println("!--------------------------------------!");
System.out.println();
    return y=1;
   }
   else
   {
    System.out.println("Invalid Username or Password");
    System.out.println("!--------------------------------------!");
System.out.println();
    login();
    return y;
   }
}
// int register(String Username[],String username,String Password[],String password)
// {
// int f=0;
// for(int i=0;i<Username.length;i++)
// {
// if(Username[i].equals(username))
// {
// for(int j=0;j<Password.length;j++)
// {
// if(Password[j].equals(password))
// {
// f=1;
// break;
// }
// }
// }
//
// }
// return f;
// }

int selection(String Languages[],String languages,String Movies[],String movies)
{

int f=0;
for(int i=0;i<Languages.length;i++)
{
if(Languages[i].equals(languages))
{
for(int j=0;j<Movies.length;j++)
{
if(Movies[j].equals(movies))
{
f=1;
break;
}
}
}

}
return f;
}

void Free(int n)
{
System.out.println("You Can Watch 3 weeks older Movies Only!!");
System.out.println("!--------------------------------------!");
System.out.println();
}

void Subscriber(int n)
{
System.out.println("You Can Enjoy Latest Movies!!");
System.out.println();
System.out.println("Select the Type of Packages:");
System.out.println("Press 1 for Yearly Package");
System.out.println("Press 2 for Monthly Package");
int num=sc.nextInt();
if(num==1)
{
System.out.println("Pay Rs.600 for Yearly Subscription");
System.out.println("You Can Enjoy this Premium for 1 year !!!");
System.out.println("!--------------------------------------!");
System.out.println();
}
else
{
System.out.println("Pay Rs.300 for Monthly Subscription");
System.out.println("You Can Enjoy this Premium for 6 months");
System.out.println("!--------------------------------------!");
System.out.println();
}

}
}

class Cancellation
{
Scanner sc=new Scanner(System.in);
void cancel()
{
System.out.println("Do You Want To Cancel Or Continue Subscription:");
System.out.println("Press 1 for Cancel");
System.out.println("Press 2 for Continue Premium");
int num=sc.nextInt();
if(num==1)
{
System.out.println("Give the reason for Cancellation:");
System.out.println("Press 1 - Due to Huge Amount");
System.out.println("Press 2 - Other Reason");
int n=sc.nextInt();
if(n==1)
{
  System.out.println("Will You Continue If Some Offer Provided:");
  System.out.println("Press 1 - Yes");
  System.out.println("Press 2 - No");
  int y=sc.nextInt();
  if(y==1)
  {
    System.out.println("Another Member Can Use This Premium for 1 Month and Enjoy!!");
  }
  else
  {
  System.out.println("Subscription Cancelled!");
  }
}
else
{
  System.out.println("Subscription Cancelled!");
}
   

}
}
}

public class Project {

public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
//String Username[]= {"arjun","anitha","anu","bharath","bindu","chandru","divya","deepak","ezhil","fahadh","gokul","geeta","indhira","jack","julie","harish","karthick","krish","keerthi","lavanya","manoj","madhu","mithra","nithya","naveen","pratheek","priya","ramya","raj","santhosh","shivani","tej","tharun","uma","udhaya","varun","vidhya","vignesh","yamini","yadhav","zahir"};
Login l=new Login();
int h=l.register1();
// System.out.println("Enter the Username:");
// String name=sc.next();
// System.out.println("Enter the Password:");
//    String pwd1=sc.next();
//    System.out.println("Confirm Password:");
//    String pwd2=sc.next();
//    if(pwd1.equals(pwd2))
//    {
//     System.out.println("Login Successful");
//    }
//    else
//    {
//     System.out.println("Login Failed");
//    }
   
String Password[]= {"secure","happy","smile","music","ocean","earth","movie","film","timepass","hobby"};
        String Languages[]= {"tamil","english","hindi","telugu","malayalam","kannada","korean","chinese","thai","japanese","italian","french","german","arabic"};
        String Movies[]= {"action","comedy","drama","romance","science-fiction","horror","thriller"};
//    System.out.println("Enter the UserName:");
//    String username=sc.next();
//    System.out.println("Enter the Password:");
//    String password=sc.next();
//    Login l=new Login();
//    int h=l.register(Username,username,Password,password);
//    if(h==1)
//    {
// System.out.println("Registered successfully");
// System.out.println("!--------------------------------------!");
// System.out.println();
//    }
// else
// {
// System.out.println("Register Failed");
// System.out.println("!--------------------------------------!");
// System.out.println();
// }
       
   if(h==1)
   {
     System.out.println("Do You Already Have Subscription\n Press 1 - Already Having Subscription\n Press 2 - Want Subscription");
     int u=sc.nextInt();
     if(u==1)
     {
     Cancellation c=new Cancellation();
     c.cancel();
     }
     else
     {
     System.out.println("Enter the preferred Languages:");
     System.out.println("tamil\nenglish\nhindi\ntelugu\nmalayalam\nkannada\nkorean\nchinese\nthai\njapanese\nitalian\nfrench\ngerman\narabic");
     String languages=sc.next();
     System.out.println();
     System.out.println("Enter the kind of Movies:");
     System.out.println("action\ncomedy\ndrama\nromance\nscience-fiction\nhorror\nthriller");
     String movies=sc.next();
     int g=l.selection(Languages,languages,Movies,movies);
     if(g==1)
     {
System.out.println("Selection successfull");
System.out.println("Suggested Movies:");
System.out.println("!--------------------------------------!");
System.out.println();
     }
 else
 {
System.out.println("Selection Failed");
System.out.println("!--------------------------------------!");
System.out.println();
 }
     
     if(g==1)
     {
    System.out.println("Choose the mode (Free / Subscriber)");
    System.out.println("Press 1 for Subscription");
    System.out.println("Press 2 for Free");
    int n=sc.nextInt();
    if(n==1)
    {
    l.Subscriber(n);
//     Cancellation c=new Cancellation();
//     c.cancel();
    }
    else
    {
    l.Free(n);
    }
     }
   }
   }
  // Cancellation c=new Cancellation();
   

}

}