package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmcondicionados extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmcondicionados", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmcondicionados",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public byte[] _valores = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4j.objects.Form _frmcondicionado = null;
public byte[] _tramaenviada = null;
public int _conttim = 0;
public boolean _paqueteenviado = false;
public anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdguardar = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _actualizavalores() throws Exception{
int _i = 0;
 //BA.debugLineNum = 118;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 119;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 121;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 122;BA.debugLine="For i =0 To 9";
{
final int step77 = 1;
final int limit77 = (int) (9);
for (_i = (int) (0); (step77 > 0 && _i <= limit77) || (step77 < 0 && _i >= limit77); _i = ((int)(0 + _i + step77))) {
 //BA.debugLineNum = 124;BA.debugLine="If ValoresComunes.Condicionados (i).Nombre <> \"\" Then";
if ((_valorescomunes._condicionados[_i].Nombre).equals("") == false) { 
 //BA.debugLineNum = 126;BA.debugLine="If Valores(i)=1   Then";
if (_valores[_i]==1) { 
 //BA.debugLineNum = 127;BA.debugLine="AddTwoLinesAndBitmap2 ( ValoresComunes.Condicionados (i).Nombre ,ValoresComunes.Condicionados (i).Descripcion  ,ValoresComunes.CheckOn)";
_addtwolinesandbitmap2(_valorescomunes._condicionados[_i].Nombre,_valorescomunes._condicionados[_i].descripcion,_valorescomunes._checkon);
 }else {
 //BA.debugLineNum = 129;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Condicionados (i).Nombre ,ValoresComunes.Condicionados (i).Descripcion  ,ValoresComunes.CheckOff)";
_addtwolinesandbitmap2(_valorescomunes._condicionados[_i].Nombre,_valorescomunes._condicionados[_i].descripcion,_valorescomunes._checkoff);
 };
 };
 }
};
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 92;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 93;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 95;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 97;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 99;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 101;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 103;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 106;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 107;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 108;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 109;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 110;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 111;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 112;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 114;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 7;BA.debugLine="Dim Valores(10) As   Byte";
_valores = new byte[(int) (10)];
;
 //BA.debugLineNum = 8;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 9;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim FrmCondicionado As Form";
_frmcondicionado = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 14;BA.debugLine="Dim TramaEnviada() As Byte";
_tramaenviada = new byte[(int) (0)];
;
 //BA.debugLineNum = 16;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 17;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 18;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim CmdGuardar As Button";
_cmdguardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 89;BA.debugLine="Timer1.Enabled =False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 90;BA.debugLine="FrmCondicionado.Close";
_frmcondicionado.Close();
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return "";
}
public String  _cmdguardar_action() throws Exception{
int _longtrama = 0;
byte[] _data = null;
int _i = 0;
 //BA.debugLineNum = 250;BA.debugLine="Sub CmdGuardar_Action";
 //BA.debugLineNum = 252;BA.debugLine="If PgIndicator.Visible  = True Then Return";
if (_pgindicator.getVisible()==__c.True) { 
if (true) return "";};
 //BA.debugLineNum = 253;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 254;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 255;BA.debugLine="LongTrama= 22";
_longtrama = (int) (22);
 }else {
 //BA.debugLineNum = 257;BA.debugLine="LongTrama= 14";
_longtrama = (int) (14);
 };
 //BA.debugLineNum = 259;BA.debugLine="Dim data(22) As Byte";
_data = new byte[(int) (22)];
;
 //BA.debugLineNum = 260;BA.debugLine="data(0)=87";
_data[(int) (0)] = (byte) (87);
 //BA.debugLineNum = 261;BA.debugLine="data(1)=67";
_data[(int) (1)] = (byte) (67);
 //BA.debugLineNum = 262;BA.debugLine="data(2)=79";
_data[(int) (2)] = (byte) (79);
 //BA.debugLineNum = 263;BA.debugLine="data(3)=78";
_data[(int) (3)] = (byte) (78);
 //BA.debugLineNum = 264;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 267;BA.debugLine="For i =0 To 9";
{
final int step188 = 1;
final int limit188 = (int) (9);
for (_i = (int) (0); (step188 > 0 && _i <= limit188) || (step188 < 0 && _i >= limit188); _i = ((int)(0 + _i + step188))) {
 //BA.debugLineNum = 268;BA.debugLine="data(i+4)=Valores(i)+1";
_data[(int) (_i+4)] = (byte) (_valores[_i]+1);
 }
};
 //BA.debugLineNum = 270;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 271;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 272;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 26;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 27;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 29;BA.debugLine="CmdGuardar.Initialize (\"CmdGuardar\")";
_cmdguardar.Initialize(ba,"CmdGuardar");
 //BA.debugLineNum = 31;BA.debugLine="CmdGuardar.Text =\"SAVE\"";
_cmdguardar.setText("SAVE");
 //BA.debugLineNum = 32;BA.debugLine="CmdGuardar.Font = ValoresComunes.FontH1";
_cmdguardar.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 35;BA.debugLine="FrmCondicionado.Initialize(\"FrmCondicionado\", 400dip, 600dip)";
_frmcondicionado.Initialize(ba,"FrmCondicionado",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 36;BA.debugLine="FrmCondicionado.Title = \"Conditioned\"";
_frmcondicionado.setTitle("Conditioned");
 //BA.debugLineNum = 37;BA.debugLine="FrmCondicionado.SetFormStyle(\"UTILITY\")";
_frmcondicionado.SetFormStyle("UTILITY");
 //BA.debugLineNum = 42;BA.debugLine="FrmCondicionado.RootPane.AddNode(CmdGuardar,     0  ,0,   0, 0)";
_frmcondicionado.getRootPane().AddNode((javafx.scene.Node)(_cmdguardar.getObject()),0,0,0,0);
 //BA.debugLineNum = 43;BA.debugLine="FrmCondicionado.RootPane.SetAnchors(CmdGuardar,  5   ,  5, 5 ,-1)";
_frmcondicionado.getRootPane().SetAnchors((javafx.scene.Node)(_cmdguardar.getObject()),5,5,5,-1);
 //BA.debugLineNum = 46;BA.debugLine="FrmCondicionado.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frmcondicionado.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 47;BA.debugLine="FrmCondicionado.RootPane.SetAnchors(ListView1, 0  , 65, 0,0)";
_frmcondicionado.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,65,0,0);
 //BA.debugLineNum = 49;BA.debugLine="FrmCondicionado.SetOwner(Parent)";
_frmcondicionado.SetOwner(_parent);
 //BA.debugLineNum = 52;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 53;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 56;BA.debugLine="FrmCondicionado.RootPane.AddNode(PgIndicator,  0,  0,70, 70)";
_frmcondicionado.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 58;BA.debugLine="FrmCondicionado.RootPane.SetAnchors(PgIndicator , -1,  0,15, -1)";
_frmcondicionado.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,0,15,-1);
 //BA.debugLineNum = 60;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 61;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 137;BA.debugLine="If Index > -1 AND PgIndicator.Visible  = False Then";
if (_index>-1 && _pgindicator.getVisible()==__c.False) { 
 //BA.debugLineNum = 138;BA.debugLine="If Valores(Index)=1 Then";
if (_valores[_index]==1) { 
 //BA.debugLineNum = 139;BA.debugLine="Valores(Index)=0";
_valores[_index] = (byte) (0);
 }else {
 //BA.debugLineNum = 141;BA.debugLine="Valores(Index)=1";
_valores[_index] = (byte) (1);
 };
 //BA.debugLineNum = 143;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 147;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 231;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 232;BA.debugLine="Try";
try { //BA.debugLineNum = 233;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 234;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 235;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 236;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e165) {
			ba.setLastException(e165); //BA.debugLineNum = 238;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 188;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 189;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 190;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 194;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(__c.True);
 //BA.debugLineNum = 195;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 196;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 197;BA.debugLine="TramaEnviada= data";
_tramaenviada = _data;
 //BA.debugLineNum = 198;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 200;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 201;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 202;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 203;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 205;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 206;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 208;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 209;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 213;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 214;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 215;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 216;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 217;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 218;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 219;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 225;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 //BA.debugLineNum = 228;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 };
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
byte[] _data = null;
String _trama = "";
 //BA.debugLineNum = 69;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 71;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 73;BA.debugLine="FrmCondicionado.Show";
_frmcondicionado.Show();
 //BA.debugLineNum = 74;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 76;BA.debugLine="Dim Trama As String";
_trama = "";
 //BA.debugLineNum = 77;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 78;BA.debugLine="Trama =\"CONENABLE\" & ValoresComunes.Password";
_trama = "CONENABLE"+_valorescomunes._password;
 }else {
 //BA.debugLineNum = 80;BA.debugLine="Trama =\"CONENABLE\"";
_trama = "CONENABLE";
 };
 //BA.debugLineNum = 83;BA.debugLine="data =Trama.GetBytes (\"UTF8\")";
_data = _trama.getBytes("UTF8");
 //BA.debugLineNum = 84;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 87;BA.debugLine="End Sub";
return 0;
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 243;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 245;BA.debugLine="If  ContTim > 50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 246;BA.debugLine="If PaqueteEnviado=True Then SendTrama(TramaEnviada)";
if (_paqueteenviado==__c.True) { 
_sendtrama(_tramaenviada);};
 };
 //BA.debugLineNum = 249;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
int _c = 0;
 //BA.debugLineNum = 148;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 149;BA.debugLine="Try";
try { //BA.debugLineNum = 150;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 151;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 154;BA.debugLine="If msg.Contains (\"ENCON\") Then";
if (_msg.contains("ENCON")) { 
 //BA.debugLineNum = 156;BA.debugLine="Dim  c As Int";
_c = 0;
 //BA.debugLineNum = 157;BA.debugLine="For c = 5 To Packet.Length -1";
{
final int step103 = 1;
final int limit103 = (int) (_packet.getLength()-1);
for (_c = (int) (5); (step103 > 0 && _c <= limit103) || (step103 < 0 && _c >= limit103); _c = ((int)(0 + _c + step103))) {
 //BA.debugLineNum = 158;BA.debugLine="Valores(c - 5)= Packet.Data (c)-1";
_valores[(int) (_c-5)] = (byte) (_packet.getData()[_c]-1);
 //BA.debugLineNum = 159;BA.debugLine="If Valores(c - 5) <> 1 Then Valores(c - 5)= 0";
if (_valores[(int) (_c-5)]!=1) { 
_valores[(int) (_c-5)] = (byte) (0);};
 }
};
 //BA.debugLineNum = 162;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 163;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 164;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 165;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 166;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 170;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 171;BA.debugLine="SendTrama(TramaEnviada)";
_sendtrama(_tramaenviada);
 //BA.debugLineNum = 172;BA.debugLine="Return";
if (true) return "";
 }else {
 };
 };
 //BA.debugLineNum = 177;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 178;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 179;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 } 
       catch (Exception e123) {
			ba.setLastException(e123); };
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
