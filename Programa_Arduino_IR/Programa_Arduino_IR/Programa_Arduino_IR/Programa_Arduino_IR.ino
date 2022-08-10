#include <SPI.h>         // needed for Arduino versions later than 0018
#include <Ethernet.h>
#include <EthernetUdp.h>         // UDP library from: bjoern@cs.stanford.edu 12/30/2008
#include <IRremote.h>


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
IRsend irsend;
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
    
    //EJEMPLO DE USO
    //EXAMPLE OF USE
    //COMANDO PARA TV LG
    //COMAND FOR LG TV
    //NECESITAS UN LED INFRARROJO PARA UTILIZAR ESTO
    //YOU NEED A INFRARED LED FOR TO OPERATE
    
     switch (CommandNumber) {
    case 1:    
      //APAGAR
      irsend.sendNEC(0x20DF10EF, 32); 
      delay(40);
      return "APAGANDO TV";
      
      
      
    case 2:    
      //INPUT
      irsend.sendNEC(0x20DFD02F, 32); 
      delay(40);
      break;
      
    case 3:    
      //TV-RADIO
      irsend.sendNEC(0x20DF0FF0, 32); 
      delay(40);
      break;
  
    case 4:    
      //GUIA
      irsend.sendNEC(0x20DFD52A, 32); 
      delay(40);
      break;    
     case 5:    
      //SUBIR CANAL
      irsend.sendNEC(0x20DF00FF, 32); 
      delay(40);
      break;  
      
     case 6:    
      //BAJAR CANAL
      irsend.sendNEC(0x20DF807F, 32); 
      delay(40);
      break;   
      
     case 7:    
      //SUBIR VOLUMEN
      irsend.sendNEC(0x20DF40BF, 32); 
      delay(40);
      break;    
      
    case 8:    
      //BAJAR VOLUMEN
      irsend.sendNEC(0x20DFC03F, 32); 
      delay(40);
      break; 
   
     case 9:   
      //1
      irsend.sendNEC(0x20DF8877, 32); 
      delay(40);
      break; 
      
     case 10:   
      //2
      irsend.sendNEC(0x20DF48B7, 32); 
      delay(40);
      break;   
     
     case 11:   
      //3
      irsend.sendNEC(0x20DFC837, 32); 
      delay(40);
      break;  
     
     case 12:   
      //4
      irsend.sendNEC(0x20DF28D7, 32); 
      delay(40);
      break;  
        
     case 13:   
      //5
      irsend.sendNEC(0x20DFA857, 32); 
      delay(40);
      break;  
    
    case 14:   
      //6
      irsend.sendNEC(0x20DF6897, 32); 
      delay(40);
      break;    
    
        case 15:   
      //7
      irsend.sendNEC(0x20DFE817, 32); 
      delay(40);
      break;    
    
    case 16:   
      //8
      irsend.sendNEC(0x20DF18E7, 32); 
      delay(40);
      break;   
    
     case 17:   
      //9
      irsend.sendNEC(0x20DF9867, 32); 
      delay(40);
      break;   
          
     case 18:   
      //0
      irsend.sendNEC(0x20DF08F7, 32); 
      delay(40);
      break;   
     
     case 19:   
      //SILENCIO
      irsend.sendNEC(0x20DF906F, 32); 
      delay(40);
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
