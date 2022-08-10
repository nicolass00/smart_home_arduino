package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmcomandoscomunes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmcomandoscomunes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmcomandoscomunes",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.collections.List _valores = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4j.objects.Form _frmcondicionado = null;
public byte[] _tramaenviada = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imgcargando = null;
public int _conttim = 0;
public boolean _paqueteenviado = false;
public anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public int _numerogrupocomnados = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,int _valor) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 59;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, Valor As Int)";
 //BA.debugLineNum = 60;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 62;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 64;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 66;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 68;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 70;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 73;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 74;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 75;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 76;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 77;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 78;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 79;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 80;BA.debugLine="ImageView1.SetImage(ValoresComunes.Condicionado   )";
_imageview1.SetImage((javafx.scene.image.Image)(_valorescomunes._condicionado.getObject()));
 //BA.debugLineNum = 82;BA.debugLine="Valores.Add (Valor)";
_valores.Add((Object)(_valor));
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 6;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 7;BA.debugLine="Dim Valores As List";
_valores = new anywheresoftware.b4a.objects.collections.List();
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
 //BA.debugLineNum = 15;BA.debugLine="Dim ImgCargando As ImageView";
_imgcargando = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 18;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 19;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 20;BA.debugLine="Dim NumeroGrupoComnados As Int";
_numerogrupocomnados = 0;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,int _grupocomandos) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(Parent As Form, GrupoComandos As Int)";
 //BA.debugLineNum = 26;BA.debugLine="NumeroGrupoComnados= GrupoComandos";
_numerogrupocomnados = _grupocomandos;
 //BA.debugLineNum = 28;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 29;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 30;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 33;BA.debugLine="FrmCondicionado.Initialize(\"FrmCondicionado\", 400dip, 600dip)";
_frmcondicionado.Initialize(ba,"FrmCondicionado",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 34;BA.debugLine="FrmCondicionado.Title = ValoresComunes.DescripcionesComandosComunes.Get (NumeroGrupoComnados)";
_frmcondicionado.setTitle(BA.ObjectToString(_valorescomunes._descripcionescomandoscomunes.Get(_numerogrupocomnados)));
 //BA.debugLineNum = 35;BA.debugLine="FrmCondicionado.SetFormStyle(\"UTILITY\")";
_frmcondicionado.SetFormStyle("UTILITY");
 //BA.debugLineNum = 38;BA.debugLine="FrmCondicionado.RootPane.AddNode(ListView1,    0,0,  0, 0)";
_frmcondicionado.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 39;BA.debugLine="FrmCondicionado.RootPane.SetAnchors(ListView1, 0 , 0, 0,0)";
_frmcondicionado.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 40;BA.debugLine="FrmCondicionado.SetOwner(Parent)";
_frmcondicionado.SetOwner(_parent);
 //BA.debugLineNum = 41;BA.debugLine="FrmCondicionado.Show";
_frmcondicionado.Show();
 //BA.debugLineNum = 43;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 44;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 45;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 47;BA.debugLine="FrmCondicionado.RootPane.AddNode(PgIndicator,  0,  0,70, 70)";
_frmcondicionado.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 49;BA.debugLine="FrmCondicionado.RootPane.SetAnchors(PgIndicator , -1,  0,15, -1)";
_frmcondicionado.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,0,15,-1);
 //BA.debugLineNum = 51;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 52;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 53;BA.debugLine="Valores.Initialize";
_valores.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="RefPantalla";
_refpantalla();
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 100;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 101;BA.debugLine="If Index > -1 AND PgIndicator.Visible  = False Then";
if (_index>-1 && _pgindicator.getVisible()==__c.False) { 
 //BA.debugLineNum = 104;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 105;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 106;BA.debugLine="LongTrama= 16";
_longtrama = (int) (16);
 }else {
 //BA.debugLineNum = 108;BA.debugLine="LongTrama= 8";
_longtrama = (int) (8);
 };
 //BA.debugLineNum = 114;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 115;BA.debugLine="data(0)=67	'C";
_data[(int) (0)] = (byte) (67);
 //BA.debugLineNum = 116;BA.debugLine="data(1)=79	'O";
_data[(int) (1)] = (byte) (79);
 //BA.debugLineNum = 117;BA.debugLine="data(2)=77	'M";
_data[(int) (2)] = (byte) (77);
 //BA.debugLineNum = 118;BA.debugLine="data(3)=65	'A";
_data[(int) (3)] = (byte) (65);
 //BA.debugLineNum = 119;BA.debugLine="data(4)=78	'N";
_data[(int) (4)] = (byte) (78);
 //BA.debugLineNum = 120;BA.debugLine="data(5)=68	'D";
_data[(int) (5)] = (byte) (68);
 //BA.debugLineNum = 121;BA.debugLine="data(6)=79	'O";
_data[(int) (6)] = (byte) (79);
 //BA.debugLineNum = 122;BA.debugLine="data(7)=Valores.Get (Index) + 1";
_data[(int) (7)] = (byte) ((double)(BA.ObjectToNumber(_valores.Get(_index)))+1);
 //BA.debugLineNum = 123;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 124;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 };
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return "";
}
public String  _refpantalla() throws Exception{
int _i = 0;
ExControl.Domotica.valorescomunes._scene _cmd = null;
 //BA.debugLineNum = 85;BA.debugLine="Sub RefPantalla";
 //BA.debugLineNum = 86;BA.debugLine="ListView1.Items.Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 87;BA.debugLine="Valores.Clear";
_valores.Clear();
 //BA.debugLineNum = 89;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 90;BA.debugLine="For i =0 To  ValoresComunes.ComandosComunes.Size -1";
{
final int step63 = 1;
final int limit63 = (int) (_valorescomunes._comandoscomunes.getSize()-1);
for (_i = (int) (0); (step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63); _i = ((int)(0 + _i + step63))) {
 //BA.debugLineNum = 91;BA.debugLine="Dim cmd As Scene";
_cmd = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 92;BA.debugLine="cmd = ValoresComunes.ComandosComunes.Get (i)";
_cmd = (ExControl.Domotica.valorescomunes._scene)(_valorescomunes._comandoscomunes.Get(_i));
 //BA.debugLineNum = 93;BA.debugLine="If cmd.Nombre <> \"\" AND cmd.Descripcion = ValoresComunes.DescripcionesComandosComunes .Get (NumeroGrupoComnados) Then";
if ((_cmd.Nombre).equals("") == false && (_cmd.descripcion).equals(BA.ObjectToString(_valorescomunes._descripcionescomandoscomunes.Get(_numerogrupocomnados)))) { 
 //BA.debugLineNum = 94;BA.debugLine="AddTwoLinesAndBitmap2 ( cmd.Nombre ,cmd.Descripcion  ,i)";
_addtwolinesandbitmap2(_cmd.Nombre,_cmd.descripcion,_i);
 };
 }
};
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 199;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 200;BA.debugLine="Try";
try { //BA.debugLineNum = 201;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 202;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 203;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 204;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e147) {
			ba.setLastException(e147); //BA.debugLineNum = 206;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 156;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 157;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 158;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 162;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(__c.True);
 //BA.debugLineNum = 163;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 164;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 165;BA.debugLine="TramaEnviada= data";
_tramaenviada = _data;
 //BA.debugLineNum = 166;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 168;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 169;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 170;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 171;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 173;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 174;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 176;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 177;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 181;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 182;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 183;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 184;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 185;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 186;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 187;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 193;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 //BA.debugLineNum = 196;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 };
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 210;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 212;BA.debugLine="If  ContTim > 50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 213;BA.debugLine="If PaqueteEnviado=True Then SendTrama(TramaEnviada)";
if (_paqueteenviado==__c.True) { 
_sendtrama(_tramaenviada);};
 };
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
 //BA.debugLineNum = 130;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 131;BA.debugLine="Try";
try { //BA.debugLineNum = 132;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 133;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 137;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 138;BA.debugLine="SendTrama(TramaEnviada)";
_sendtrama(_tramaenviada);
 //BA.debugLineNum = 139;BA.debugLine="Return";
if (true) return "";
 }else {
 };
 //BA.debugLineNum = 144;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 145;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 146;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 } 
       catch (Exception e105) {
			ba.setLastException(e105); };
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
