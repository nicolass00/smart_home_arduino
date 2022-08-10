package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmselectescena extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmselectescena", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmselectescena",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ListViewWrapper _lv = null;
public byte[] _ultimatrama = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public int _conttim = 0;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public boolean _paqueteenviado = false;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _addtwolinesandbitmap2(String _name,String _description,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _iconcircuito) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 65;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( Name As String, Description As String,  IconCircuito As Image)";
 //BA.debugLineNum = 66;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 68;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 70;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 72;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 74;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 76;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 79;BA.debugLine="lv.Items.Add(p)";
_lv.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 80;BA.debugLine="Label1.Text = Name";
_label1.setText(_name);
 //BA.debugLineNum = 81;BA.debugLine="Label2.Text = Description";
_label2.setText(_description);
 //BA.debugLineNum = 82;BA.debugLine="Label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 83;BA.debugLine="Label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 85;BA.debugLine="Label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 86;BA.debugLine="Label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 87;BA.debugLine="ImageView1.SetImage(IconCircuito  )";
_imageview1.SetImage((javafx.scene.image.Image)(_iconcircuito.getObject()));
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private lv As ListView";
_lv = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim UltimaTrama() As Byte";
_ultimatrama = new byte[(int) (0)];
;
 //BA.debugLineNum = 7;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 8;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 9;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 10;BA.debugLine="Private Label1, Label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 13;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 62;BA.debugLine="Timer1.Enabled =False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 63;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(Parent As Form )";
 //BA.debugLineNum = 19;BA.debugLine="frm.Initialize(\"frm\", 400dip, 600dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 20;BA.debugLine="frm.Title = \"Select Scene \"";
_frm.setTitle("Select Scene ");
 //BA.debugLineNum = 21;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 23;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 25;BA.debugLine="Label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 26;BA.debugLine="Label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 28;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 30;BA.debugLine="lv.Initialize(\"lv\")";
_lv.Initialize(ba,"lv");
 //BA.debugLineNum = 34;BA.debugLine="frm.RootPane.AddNode(lv,  0, 0, 0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 35;BA.debugLine="frm.RootPane.SetAnchors(lv, 0, 0, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 38;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 42;BA.debugLine="frm.RootPane.AddNode(PgIndicator,  0,  0,70, 70)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 44;BA.debugLine="frm.RootPane.SetAnchors(PgIndicator , -1,  0,15, -1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,0,15,-1);
 //BA.debugLineNum = 45;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _lv_selectedindexchanged(int _index) throws Exception{
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 91;BA.debugLine="Sub lv_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 92;BA.debugLine="If Index > -1 AND PgIndicator.Visible  = False Then";
if (_index>-1 && _pgindicator.getVisible()==__c.False) { 
 //BA.debugLineNum = 94;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 95;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 96;BA.debugLine="LongTrama= 13";
_longtrama = (int) (13);
 }else {
 //BA.debugLineNum = 98;BA.debugLine="LongTrama= 5";
_longtrama = (int) (5);
 };
 //BA.debugLineNum = 100;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 101;BA.debugLine="data(0)=83";
_data[(int) (0)] = (byte) (83);
 //BA.debugLineNum = 102;BA.debugLine="data(1)=83";
_data[(int) (1)] = (byte) (83);
 //BA.debugLineNum = 103;BA.debugLine="data(2)=67";
_data[(int) (2)] = (byte) (67);
 //BA.debugLineNum = 104;BA.debugLine="data(3)=69";
_data[(int) (3)] = (byte) (69);
 //BA.debugLineNum = 105;BA.debugLine="data(4)= Index +1";
_data[(int) (4)] = (byte) (_index+1);
 //BA.debugLineNum = 108;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 109;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 111;BA.debugLine="lv.SelectedIndex =-1";
_lv.setSelectedIndex((int) (-1));
 };
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 118;BA.debugLine="Try";
try { //BA.debugLineNum = 119;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 121;BA.debugLine="Packet.Initialize(data ,  ValoresComunes.ip,  ValoresComunes.Puerto )";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 122;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 123;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e89) {
			ba.setLastException(e89); //BA.debugLineNum = 125;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 127;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 128;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 129;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 130;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 133;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(__c.True);
 //BA.debugLineNum = 134;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 135;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 136;BA.debugLine="UltimaTrama=data";
_ultimatrama = _data;
 //BA.debugLineNum = 137;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 139;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 140;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 142;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 143;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 145;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 146;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 148;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 149;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 153;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 154;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 155;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 156;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 157;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 158;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 159;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 164;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 //BA.debugLineNum = 167;BA.debugLine="ValoresComunes.Delay (1000)";
_valorescomunes._delay((long) (1000));
 };
 //BA.debugLineNum = 170;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 //BA.debugLineNum = 172;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
int _c = 0;
 //BA.debugLineNum = 51;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 52;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 53;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 54;BA.debugLine="lv.Items .Clear";
_lv.getItems().Clear();
 //BA.debugLineNum = 55;BA.debugLine="For C =0 To ValoresComunes.Scenes .Length -1";
{
final int step34 = 1;
final int limit34 = (int) (_valorescomunes._scenes.length-1);
for (_c = (int) (0); (step34 > 0 && _c <= limit34) || (step34 < 0 && _c >= limit34); _c = ((int)(0 + _c + step34))) {
 //BA.debugLineNum = 56;BA.debugLine="AddTwoLinesAndBitmap2 ( ValoresComunes.Scenes(C).Nombre ,ValoresComunes.Scenes(C).Descripcion,   ValoresComunes.Ambient  )";
_addtwolinesandbitmap2(_valorescomunes._scenes[_c].Nombre,_valorescomunes._scenes[_c].descripcion,_valorescomunes._ambient);
 }
};
 //BA.debugLineNum = 59;BA.debugLine="frm.Show";
_frm.Show();
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 174;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 176;BA.debugLine="If  ContTim > 50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 177;BA.debugLine="If PaqueteEnviado=True Then SendTrama(UltimaTrama)";
if (_paqueteenviado==__c.True) { 
_sendtrama(_ultimatrama);};
 };
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
 //BA.debugLineNum = 181;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 182;BA.debugLine="Try";
try { //BA.debugLineNum = 183;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 184;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 187;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 188;BA.debugLine="SendTrama(UltimaTrama)";
_sendtrama(_ultimatrama);
 //BA.debugLineNum = 189;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 191;BA.debugLine="If msg.Contains (\"EVAL\") Then";
if (_msg.contains("EVAL")) { 
 //BA.debugLineNum = 193;BA.debugLine="Main.ContTim = 400";
_main._conttim = (int) (400);
 };
 //BA.debugLineNum = 195;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 196;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 198;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 } 
       catch (Exception e146) {
			ba.setLastException(e146); };
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
