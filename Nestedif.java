class Nestedif
{
public static void main(String agrs[])
{
String address="Kolkata, India";
if(address.endsWith("India"))
{
if(address.contains("Goa")){
System.out.println("You are in Goa");
}
else if(address.contains("New York")){
System.out.println("You are in New York");
}
else{
System.out.println(address.split(",")[0]);}}
else{
System.out.println("You are in India");}}}
