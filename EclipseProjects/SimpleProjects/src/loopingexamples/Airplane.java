package loopingexamples;

public class Airplane {

int Flightnumber;
String Destination;
double Departure;

public static void main(String...args)
{

Airplane AirIndia=new Airplane();
Airplane Emirates=new Airplane();
Airplane Ethihad=new Airplane();

AirIndia.Flightnumber=99;
AirIndia.Destination="Kochi";
AirIndia.Departure=12.00;

Emirates.Flightnumber=96;
Emirates.Destination="Abudhabi";
Emirates.Departure=19.30;

Ethihad.Flightnumber=53;
Ethihad.Destination="Singapore";
Ethihad.Departure=17.00;

System.out.println(AirIndia.Flightnumber+" "+AirIndia.Destination+" "+AirIndia.Departure);
System.out.println(Emirates.Flightnumber+" "+Emirates.Destination+" "+Emirates.Departure);
System.out.println(Ethihad.Flightnumber+" "+Ethihad.Destination+" "+Ethihad.Departure);
}
}


