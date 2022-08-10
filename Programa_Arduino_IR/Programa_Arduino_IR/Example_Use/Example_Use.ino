#include <SPI.h>         // needed for Arduino versions later than 0018
#include <Ethernet.h>
#include <EthernetUdp.h>         // UDP library from: bjoern@cs.stanford.edu 12/30/2008



/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/
//ZONA DE CONFIGURACIONES 
//Define numero de entradas salidas 
//Configuracion Red

/******************************************************************************************************************************/

//SETTINGS ZONE
//Defines number of inputs and outputs
//Network configuration

/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/

//CONFIGURACION DE RED
//Direccion IP ES MUY PROBABLE QUE TENGAS QUE AJUSTARLO A TU RED LOCAL
//Cambia la ip por una dentro de tu rango, tambien debes actualizarla en tu aplicacion android
//Tambien puedes cambiar el puerto, por defecto 5000

// NETWORK CONFIGURATION
// IP Address, ADJUST TO YOUR LOCAL NETWORK
//If you change the IP address will have to adjust in android application
//If you change the Local Port address will have to adjust in android application

byte mac[] = {0xDE, 0xAD, 0xBE, 0xEF, 0xFE, 0xED };
IPAddress ip(192, 168, 1, 200);
unsigned int localPort = 5000;      // puerto local para eschucha de paquete



/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/
//FIN DE ZONAS DE CONFIGURACIONES
//END SETTINGS ZONE
/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/
/***********************************************************************************************************************/

// buffers para recepcion y envio de datos
char packetBuffer[UDP_TX_PACKET_MAX_SIZE]; 

// Instanacia Ethernet UDP Para enviar y recibir paqueteP
EthernetUDP Udp;



void setup() {

  Serial.begin(9600);
  // Inico Ethernet y UDP
  Ethernet.begin(mac,ip);
  Udp.begin(localPort);  
}

void loop(){  
   RecepcionPaqueteUDP();
   delay(100);
}

char* RunCommand(byte CommandNumber){

    //EJEMPLO DE USO
    //EXAMPLE OF USE
    //ENVIO DE NUMERO DE COMANDO POR PUETO SERIE
    //SEND COMMAND NUMBER FOR SERIAL PORT
    Serial.print ("Comando Numero ");
    Serial.println(CommandNumber);
    
    
     switch (CommandNumber) {
    case 1:    
      return "EJECUTADO COMANDO 1";
      break;
    case 2:    
      return "EJECUTADO COMANDO 2";
      break;
      
    
     }   
 return "COMPLETED";
}

/*************************************************************/
   //Gestion Comunicaciones
    /*************************************************************/  
void RecepcionPaqueteUDP()
{
 
   // SI TENEMOS PAQUETES LEEMOS CONTENIDO
  int packetSize = Udp.parsePacket();
  
  if(packetSize)
  {
    //Leemos el paquete en packetBufffer
   
    Udp.read(packetBuffer,UDP_TX_PACKET_MAX_SIZE);
    
 
    //Cargamos el String con los datos de entrada    
    char  CadenaEntrada[packetSize + 1];
    for (int c=0;c<packetSize;c++){CadenaEntrada[c]=packetBuffer[c];}
    CadenaEntrada[packetSize]='\0';
    //Comprobamos la cadena de entrada gestionamos las salidas y enviamos la respuesta
    String CadenaIn = (String)CadenaEntrada;
    if (CadenaIn.indexOf("COMANDO")>-1){EnviarRespuesta(RunCommand(packetBuffer[7]));return;}//Comandos
    EnviarRespuesta("REPETIRMSG"); 
  }
}

void EnviarRespuesta(char  ReplyBuffer[])
{
    // send a reply, to the IP address and port that sent us the packet we received
    Udp.beginPacket(Udp.remoteIP(), Udp.remotePort());
    Udp.write(ReplyBuffer);
    Udp.endPacket();
}
