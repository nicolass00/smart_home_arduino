package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmsensores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmsensores", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmsensores",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4j.objects.Form _frmsens = null;
public byte[] _tramaenviada = null;
public int _conttim = 0;
public boolean _paqueteenviado = false;
public anywheresoftware.b4a.objects.collections.List _sensores = null;
public int _sensorenlectura = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _actualizavalores() throws Exception{
int _i = 0;
 //BA.debugLineNum = 98;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 99;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 102;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 103;BA.debugLine="For i =0 To Sensores.Size -1";
{
final int step68 = 1;
final int limit68 = (int) (_sensores.getSize()-1);
for (_i = (int) (0); (step68 > 0 && _i <= limit68) || (step68 < 0 && _i >= limit68); _i = ((int)(0 + _i + step68))) {
 //BA.debugLineNum = 104;BA.debugLine="AddTwoLinesAndBitmap2 ( Sensores.Get (i),ValoresComunes.NombreSensor.Get (i) ,ValoresComunes.Sensor)";
_addtwolinesandbitmap2(BA.ObjectToString(_sensores.Get(_i)),BA.ObjectToString(_valorescomunes._nombresensor.Get(_i)),_valorescomunes._sensor);
 }
};
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 72;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 73;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 75;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 77;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 79;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 81;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 83;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 86;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 87;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 88;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 89;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 90;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 91;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 92;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 94;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 6;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 7;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim FrmSens As Form";
_frmsens = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 12;BA.debugLine="Dim TramaEnviada() As Byte";
_tramaenviada = new byte[(int) (0)];
;
 //BA.debugLineNum = 13;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 14;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 15;BA.debugLine="Dim Sensores As List";
_sensores = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Dim SensorEnLectura As Int";
_sensorenlectura = 0;
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 68;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 69;BA.debugLine="FrmSens.Close";
_frmsens.Close();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 22;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 23;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 28;BA.debugLine="FrmSens.Initialize(\"FrmSens\", 400dip, 600dip)";
_frmsens.Initialize(ba,"FrmSens",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 29;BA.debugLine="FrmSens.Title = \"Sensors\"";
_frmsens.setTitle("Sensors");
 //BA.debugLineNum = 30;BA.debugLine="FrmSens.SetFormStyle(\"UTILITY\")";
_frmsens.SetFormStyle("UTILITY");
 //BA.debugLineNum = 34;BA.debugLine="FrmSens.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frmsens.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 35;BA.debugLine="FrmSens.RootPane.SetAnchors(ListView1, 0  , 0, 0,0)";
_frmsens.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 37;BA.debugLine="FrmSens.SetOwner(Parent)";
_frmsens.SetOwner(_parent);
 //BA.debugLineNum = 40;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 41;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 44;BA.debugLine="If Sensores.IsInitialized = False Then";
if (_sensores.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 45;BA.debugLine="Sensores.Initialize";
_sensores.Initialize();
 //BA.debugLineNum = 46;BA.debugLine="Sensores.AddAll (ValoresComunes.NombreSensor)";
_sensores.AddAll(_valorescomunes._nombresensor);
 };
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _lecturadatos() throws Exception{
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 203;BA.debugLine="Sub LecturaDatos()";
 //BA.debugLineNum = 204;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 205;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 206;BA.debugLine="LongTrama= 18";
_longtrama = (int) (18);
 }else {
 //BA.debugLineNum = 208;BA.debugLine="LongTrama= 10";
_longtrama = (int) (10);
 };
 //BA.debugLineNum = 211;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 212;BA.debugLine="data(0)=71";
_data[(int) (0)] = (byte) (71);
 //BA.debugLineNum = 213;BA.debugLine="data(1)=69";
_data[(int) (1)] = (byte) (69);
 //BA.debugLineNum = 214;BA.debugLine="data(2)=84";
_data[(int) (2)] = (byte) (84);
 //BA.debugLineNum = 215;BA.debugLine="data(3)=83";
_data[(int) (3)] = (byte) (83);
 //BA.debugLineNum = 216;BA.debugLine="data(4)=69";
_data[(int) (4)] = (byte) (69);
 //BA.debugLineNum = 217;BA.debugLine="data(5)=78";
_data[(int) (5)] = (byte) (78);
 //BA.debugLineNum = 218;BA.debugLine="data(6)=83";
_data[(int) (6)] = (byte) (83);
 //BA.debugLineNum = 219;BA.debugLine="data(7)=79";
_data[(int) (7)] = (byte) (79);
 //BA.debugLineNum = 220;BA.debugLine="data(8)=82";
_data[(int) (8)] = (byte) (82);
 //BA.debugLineNum = 221;BA.debugLine="data(9)=SensorEnLectura";
_data[(int) (9)] = (byte) (_sensorenlectura);
 //BA.debugLineNum = 222;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 223;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 224;BA.debugLine="SensorEnLectura=SensorEnLectura+1";
_sensorenlectura = (int) (_sensorenlectura+1);
 //BA.debugLineNum = 225;BA.debugLine="If SensorEnLectura> Sensores.Size Then";
if (_sensorenlectura>_sensores.getSize()) { 
 //BA.debugLineNum = 226;BA.debugLine="SensorEnLectura=1";
_sensorenlectura = (int) (1);
 //BA.debugLineNum = 227;BA.debugLine="ContTim = -290";
_conttim = (int) (-290);
 };
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 185;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 186;BA.debugLine="Try";
try { //BA.debugLineNum = 187;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 188;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 189;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 190;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e132) {
			ba.setLastException(e132); //BA.debugLineNum = 192;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 143;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 144;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 145;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 149;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 150;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 151;BA.debugLine="TramaEnviada= data";
_tramaenviada = _data;
 //BA.debugLineNum = 152;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 154;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 155;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 156;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 157;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 159;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 160;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 162;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 163;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 167;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 168;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 169;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 170;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 171;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 172;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 173;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 179;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 //BA.debugLineNum = 182;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 };
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 55;BA.debugLine="FrmSens.Show";
_frmsens.Show();
 //BA.debugLineNum = 57;BA.debugLine="If Sensores.Size <> ValoresComunes.NombreSensor .Size Then";
if (_sensores.getSize()!=_valorescomunes._nombresensor.getSize()) { 
 //BA.debugLineNum = 58;BA.debugLine="Sensores.Clear";
_sensores.Clear();
 //BA.debugLineNum = 59;BA.debugLine="Sensores.AddAll (ValoresComunes.NombreSensor)";
_sensores.AddAll(_valorescomunes._nombresensor);
 };
 //BA.debugLineNum = 62;BA.debugLine="SensorEnLectura=1";
_sensorenlectura = (int) (1);
 //BA.debugLineNum = 63;BA.debugLine="LecturaDatos";
_lecturadatos();
 //BA.debugLineNum = 65;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 196;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 197;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 199;BA.debugLine="If  ContTim >50 Then LecturaDatos";
if (_conttim>50) { 
_lecturadatos();};
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
 //BA.debugLineNum = 113;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 114;BA.debugLine="Try";
try { //BA.debugLineNum = 115;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 116;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 118;BA.debugLine="If msg.Contains (\"SENSOR\") Then";
if (_msg.contains("SENSOR")) { 
 //BA.debugLineNum = 120;BA.debugLine="Sensores.Set  (Packet.Data (6)-1,msg.SubString (7))";
_sensores.Set((int) (_packet.getData()[(int) (6)]-1),(Object)(_msg.substring((int) (7))));
 //BA.debugLineNum = 122;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 124;BA.debugLine="If ContTim> -1 Then";
if (_conttim>-1) { 
 //BA.debugLineNum = 125;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 126;BA.debugLine="LecturaDatos";
_lecturadatos();
 };
 };
 //BA.debugLineNum = 130;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 131;BA.debugLine="LecturaDatos";
_lecturadatos();
 };
 //BA.debugLineNum = 133;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 } 
       catch (Exception e91) {
			ba.setLastException(e91); };
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
