package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmdiaespecial extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmdiaespecial", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmdiaespecial",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.collections.List _fechas = null;
public int _tipoespecial = 0;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public int _numerocentralcontrolada = 0;
public byte[] _tramaenviada = null;
public int _conttim = 0;
public boolean _paqueteenviado = false;
public anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdguardar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdnew = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 105;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 106;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 108;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 110;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 112;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 114;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 116;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 119;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 120;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 121;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 122;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 123;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 124;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 125;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 127;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Dim Fechas As List";
_fechas = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Dim TipoEspecial As Int";
_tipoespecial = 0;
 //BA.debugLineNum = 7;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 9;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 10;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim NumeroCentralControlada As Int";
_numerocentralcontrolada = 0;
 //BA.debugLineNum = 16;BA.debugLine="Dim TramaEnviada() As Byte";
_tramaenviada = new byte[(int) (0)];
;
 //BA.debugLineNum = 18;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 19;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 20;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim CmdGuardar As Button";
_cmdguardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 22;BA.debugLine="Dim CmdNew As Button";
_cmdnew = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 102;BA.debugLine="Timer1.Enabled =False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 103;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return "";
}
public String  _cmdguardar_action() throws Exception{
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
int _rsp = 0;
int _longtrama = 0;
byte[] _data = null;
int _i = 0;
 //BA.debugLineNum = 295;BA.debugLine="Sub CmdGuardar_Action";
 //BA.debugLineNum = 296;BA.debugLine="Dim Msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 298;BA.debugLine="NumeroCentralControlada = ValoresComunes.NumeroCental";
_numerocentralcontrolada = _valorescomunes._numerocental;
 //BA.debugLineNum = 299;BA.debugLine="ValoresComunes.NumeroCental =1";
_valorescomunes._numerocental = (int) (1);
 //BA.debugLineNum = 300;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 302;BA.debugLine="Dim Rsp As  Int";
_rsp = 0;
 //BA.debugLineNum = 304;BA.debugLine="Rsp = Msg.Show2 ( \"Confirm saving?\",\"SECURITY QUESTION\",\"Yes\",\"No\",\"\")";
_rsp = _msg.Show2("Confirm saving?","SECURITY QUESTION","Yes","No","");
 //BA.debugLineNum = 306;BA.debugLine="If Rsp =  -1 Then";
if (_rsp==-1) { 
 //BA.debugLineNum = 308;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 309;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 310;BA.debugLine="LongTrama= 66";
_longtrama = (int) (66);
 }else {
 //BA.debugLineNum = 312;BA.debugLine="LongTrama= 58";
_longtrama = (int) (58);
 };
 //BA.debugLineNum = 314;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 315;BA.debugLine="data(0)=87";
_data[(int) (0)] = (byte) (87);
 //BA.debugLineNum = 316;BA.debugLine="data(1)=82";
_data[(int) (1)] = (byte) (82);
 //BA.debugLineNum = 317;BA.debugLine="data(2)=73";
_data[(int) (2)] = (byte) (73);
 //BA.debugLineNum = 318;BA.debugLine="data(3)=68";
_data[(int) (3)] = (byte) (68);
 //BA.debugLineNum = 319;BA.debugLine="data(4)=65";
_data[(int) (4)] = (byte) (65);
 //BA.debugLineNum = 320;BA.debugLine="data(5)=89";
_data[(int) (5)] = (byte) (89);
 //BA.debugLineNum = 321;BA.debugLine="data(6)=69";
_data[(int) (6)] = (byte) (69);
 //BA.debugLineNum = 323;BA.debugLine="data(7)=TipoEspecial";
_data[(int) (7)] = (byte) (_tipoespecial);
 //BA.debugLineNum = 325;BA.debugLine="Dim I As Int";
_i = 0;
 //BA.debugLineNum = 327;BA.debugLine="For I =0 To Fechas.Size -1";
{
final int step236 = 1;
final int limit236 = (int) (_fechas.getSize()-1);
for (_i = (int) (0); (step236 > 0 && _i <= limit236) || (step236 < 0 && _i >= limit236); _i = ((int)(0 + _i + step236))) {
 //BA.debugLineNum = 328;BA.debugLine="data((I*2)+8)=DateTime.GetMonth (Fechas.Get(I))";
_data[(int) ((_i*2)+8)] = (byte) (__c.DateTime.GetMonth(BA.ObjectToLongNumber(_fechas.Get(_i))));
 //BA.debugLineNum = 329;BA.debugLine="data((I*2)+9)=DateTime.GetDayOfMonth  (Fechas.Get(I))";
_data[(int) ((_i*2)+9)] = (byte) (__c.DateTime.GetDayOfMonth(BA.ObjectToLongNumber(_fechas.Get(_i))));
 }
};
 //BA.debugLineNum = 331;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 332;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 };
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return "";
}
public String  _cmdnew_action() throws Exception{
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
ExControl.Domotica.datedialo _dialog = null;
int _resp = 0;
int _p = 0;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _m = null;
 //BA.debugLineNum = 337;BA.debugLine="Sub CmdNew_Action";
 //BA.debugLineNum = 338;BA.debugLine="If Fechas.Size >24 Then";
if (_fechas.getSize()>24) { 
 //BA.debugLineNum = 339;BA.debugLine="Dim msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 340;BA.debugLine="msg.Show (\"You can not configure more than 25 days\",\"Info\")";
_msg.Show("You can not configure more than 25 days","Info");
 //BA.debugLineNum = 341;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 344;BA.debugLine="Dim Dialog As  DateDialo";
_dialog = new ExControl.Domotica.datedialo();
 //BA.debugLineNum = 345;BA.debugLine="Dialog.Initialize( Frm )";
_dialog._initialize(ba,_frm);
 //BA.debugLineNum = 348;BA.debugLine="Dim Resp As Int";
_resp = 0;
 //BA.debugLineNum = 349;BA.debugLine="Resp= Dialog.Show ( )";
_resp = _dialog._show();
 //BA.debugLineNum = 350;BA.debugLine="If Resp = 1 Then";
if (_resp==1) { 
 //BA.debugLineNum = 351;BA.debugLine="If Dialog.DateTicks < DateTime.Add( DateTime.Now ,0,0, -1) Then";
if (_dialog._dateticks<__c.DateTime.Add(__c.DateTime.getNow(),(int) (0),(int) (0),(int) (-1))) { 
 //BA.debugLineNum = 352;BA.debugLine="Dim msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 353;BA.debugLine="msg.Show (\"You can not enter a date prior to the current\",\"Configuration Error\")";
_msg.Show("You can not enter a date prior to the current","Configuration Error");
 //BA.debugLineNum = 354;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 357;BA.debugLine="If Fechas.Size =0 Then";
if (_fechas.getSize()==0) { 
 //BA.debugLineNum = 358;BA.debugLine="Fechas.Add (Dialog.DateTicks )";
_fechas.Add((Object)(_dialog._dateticks));
 }else {
 //BA.debugLineNum = 360;BA.debugLine="Dim p As Int";
_p = 0;
 //BA.debugLineNum = 361;BA.debugLine="For p=0 To Fechas.Size -1";
{
final int step264 = 1;
final int limit264 = (int) (_fechas.getSize()-1);
for (_p = (int) (0); (step264 > 0 && _p <= limit264) || (step264 < 0 && _p >= limit264); _p = ((int)(0 + _p + step264))) {
 //BA.debugLineNum = 363;BA.debugLine="If Fechas.Get (p)= Dialog.DateTicks Then";
if ((_fechas.Get(_p)).equals((Object)(_dialog._dateticks))) { 
 //BA.debugLineNum = 364;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 365;BA.debugLine="m.Show (\"That day is already programmed\",\"Duplicate Date\")";
_m.Show("That day is already programmed","Duplicate Date");
 //BA.debugLineNum = 366;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 368;BA.debugLine="If Fechas.Get (p)> Dialog.DateTicks Then";
if ((double)(BA.ObjectToNumber(_fechas.Get(_p)))>_dialog._dateticks) { 
 //BA.debugLineNum = 369;BA.debugLine="Fechas.InsertAt   (p,Dialog.DateTicks)";
_fechas.InsertAt(_p,(Object)(_dialog._dateticks));
 //BA.debugLineNum = 370;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 //BA.debugLineNum = 371;BA.debugLine="Return";
if (true) return "";
 };
 }
};
 //BA.debugLineNum = 375;BA.debugLine="Fechas.Add (Dialog.DateTicks )";
_fechas.Add((Object)(_dialog._dateticks));
 };
 //BA.debugLineNum = 377;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 };
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 29;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 30;BA.debugLine="Fechas.Initialize";
_fechas.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 33;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 34;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 36;BA.debugLine="CmdGuardar.Initialize (\"CmdGuardar\")";
_cmdguardar.Initialize(ba,"CmdGuardar");
 //BA.debugLineNum = 37;BA.debugLine="CmdGuardar.Text =\"SAVE\"";
_cmdguardar.setText("SAVE");
 //BA.debugLineNum = 38;BA.debugLine="CmdGuardar.Font = ValoresComunes.FontH1";
_cmdguardar.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 40;BA.debugLine="CmdNew.Initialize (\"CmdNew\")";
_cmdnew.Initialize(ba,"CmdNew");
 //BA.debugLineNum = 41;BA.debugLine="CmdNew.Text =\"NEW\"";
_cmdnew.setText("NEW");
 //BA.debugLineNum = 42;BA.debugLine="CmdNew.Font = ValoresComunes.FontH1";
_cmdnew.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 45;BA.debugLine="Frm.Initialize(\"FrmCondicionado\", 400dip, 600dip)";
_frm.Initialize(ba,"FrmCondicionado",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 47;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 51;BA.debugLine="Frm.RootPane.AddNode(CmdGuardar,   0   ,0, 0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdguardar.getObject()),0,0,0,0);
 //BA.debugLineNum = 52;BA.debugLine="Frm.RootPane.SetAnchors(CmdGuardar,  5   ,  5,5  ,-1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdguardar.getObject()),5,5,5,-1);
 //BA.debugLineNum = 54;BA.debugLine="Frm.RootPane.AddNode(CmdNew,  5 ,5, 0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdnew.getObject()),5,5,0,0);
 //BA.debugLineNum = 55;BA.debugLine="Frm.RootPane.SetAnchors(CmdNew,  5 ,  60, 5 , -1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdnew.getObject()),5,60,5,-1);
 //BA.debugLineNum = 57;BA.debugLine="Frm.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 58;BA.debugLine="Frm.RootPane.SetAnchors(ListView1, 0  ,  125, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,125,0,0);
 //BA.debugLineNum = 60;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 63;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 64;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 67;BA.debugLine="Frm.RootPane.AddNode(PgIndicator,  0,  0,70, 70)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 69;BA.debugLine="Frm.RootPane.SetAnchors(PgIndicator , -1,  0,15, -1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,0,15,-1);
 //BA.debugLineNum = 71;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 72;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
int _r = 0;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
 //BA.debugLineNum = 134;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 135;BA.debugLine="If Index > -1 AND PgIndicator.Visible  = False Then";
if (_index>-1 && _pgindicator.getVisible()==__c.False) { 
 //BA.debugLineNum = 136;BA.debugLine="Dim R As Int";
_r = 0;
 //BA.debugLineNum = 137;BA.debugLine="Dim msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 138;BA.debugLine="R=msg.Show2 (\"Delete special day?\",\"Confirmation!!\",\"Si\",\"No\",\"\")";
_r = _msg.Show2("Delete special day?","Confirmation!!","Si","No","");
 //BA.debugLineNum = 139;BA.debugLine="If R = -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 140;BA.debugLine="Fechas.RemoveAt (Index)";
_fechas.RemoveAt(_index);
 //BA.debugLineNum = 141;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 };
 };
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _refrescapantalla() throws Exception{
int _c = 0;
 //BA.debugLineNum = 383;BA.debugLine="Sub RefrescaPantalla";
 //BA.debugLineNum = 385;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 387;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 388;BA.debugLine="DateTime.DateFormat=\"dd/MM/yyyy\"";
__c.DateTime.setDateFormat("dd/MM/yyyy");
 //BA.debugLineNum = 389;BA.debugLine="For c =0 To Fechas.Size -1";
{
final int step285 = 1;
final int limit285 = (int) (_fechas.getSize()-1);
for (_c = (int) (0); (step285 > 0 && _c <= limit285) || (step285 < 0 && _c >= limit285); _c = ((int)(0 + _c + step285))) {
 //BA.debugLineNum = 390;BA.debugLine="AddTwoLinesAndBitmap2 (DateTime.Date(Fechas.Get (c)),\"\" ,ValoresComunes.Calendario)";
_addtwolinesandbitmap2(__c.DateTime.Date(BA.ObjectToLongNumber(_fechas.Get(_c))),"",_valorescomunes._calendario);
 }
};
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 276;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 277;BA.debugLine="Try";
try { //BA.debugLineNum = 278;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 279;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 280;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 281;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e203) {
			ba.setLastException(e203); //BA.debugLineNum = 283;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 233;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 234;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 235;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 239;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(__c.True);
 //BA.debugLineNum = 240;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 241;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 242;BA.debugLine="TramaEnviada= data";
_tramaenviada = _data;
 //BA.debugLineNum = 243;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 245;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 246;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 247;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 248;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 250;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 251;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 253;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 254;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 258;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 259;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 260;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 261;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 262;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 263;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 264;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 270;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 //BA.debugLineNum = 273;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 };
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
String _s = "";
byte[] _data = null;
 //BA.debugLineNum = 75;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 76;BA.debugLine="CmdGuardar.Enabled =False";
_cmdguardar.setEnabled(__c.False);
 //BA.debugLineNum = 77;BA.debugLine="CmdNew.Enabled =False";
_cmdnew.setEnabled(__c.False);
 //BA.debugLineNum = 78;BA.debugLine="Fechas.Clear";
_fechas.Clear();
 //BA.debugLineNum = 81;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 82;BA.debugLine="Dim s As String";
_s = "";
 //BA.debugLineNum = 83;BA.debugLine="If TipoEspecial=2 Then";
if (_tipoespecial==2) { 
 //BA.debugLineNum = 85;BA.debugLine="s=\"READDAY2\"";
_s = "READDAY2";
 //BA.debugLineNum = 87;BA.debugLine="Frm.Title =\"Settings Special day 2\"";
_frm.setTitle("Settings Special day 2");
 }else {
 //BA.debugLineNum = 89;BA.debugLine="s=\"READDAY1\"";
_s = "READDAY1";
 //BA.debugLineNum = 91;BA.debugLine="Frm.Title =\"Settings Special day 1\"";
_frm.setTitle("Settings Special day 1");
 };
 //BA.debugLineNum = 93;BA.debugLine="If ValoresComunes.ConexionSegura Then s = s & ValoresComunes.Password";
if (_valorescomunes._conexionsegura) { 
_s = _s+_valorescomunes._password;};
 //BA.debugLineNum = 94;BA.debugLine="Dim DATA() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 95;BA.debugLine="DATA= s.GetBytes (\"UTF8\")";
_data = _s.getBytes("UTF8");
 //BA.debugLineNum = 96;BA.debugLine="SendTrama(DATA)";
_sendtrama(_data);
 //BA.debugLineNum = 99;BA.debugLine="Frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return 0;
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 288;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 290;BA.debugLine="If  ContTim > 50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 291;BA.debugLine="If PaqueteEnviado=True Then SendTrama(TramaEnviada)";
if (_paqueteenviado==__c.True) { 
_sendtrama(_tramaenviada);};
 };
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
byte[] _valores = null;
int _p = 0;
anywheresoftware.b4a.objects.collections.List _fc = null;
int _c = 0;
long _f = 0L;
int _pos = 0;
long _valmax = 0L;
 //BA.debugLineNum = 146;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 147;BA.debugLine="Try";
try { //BA.debugLineNum = 148;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 149;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 152;BA.debugLine="If msg.Contains (\"CFDA\") Then";
if (_msg.contains("CFDA")) { 
 //BA.debugLineNum = 153;BA.debugLine="Fechas.Clear";
_fechas.Clear();
 //BA.debugLineNum = 155;BA.debugLine="Dim Valores(50) As Byte";
_valores = new byte[(int) (50)];
;
 //BA.debugLineNum = 156;BA.debugLine="Dim p As Int";
_p = 0;
 //BA.debugLineNum = 157;BA.debugLine="For p =0 To 49";
{
final int step107 = 1;
final int limit107 = (int) (49);
for (_p = (int) (0); (step107 > 0 && _p <= limit107) || (step107 < 0 && _p >= limit107); _p = ((int)(0 + _p + step107))) {
 //BA.debugLineNum = 158;BA.debugLine="Valores(p)=Packet.Data (p+4)";
_valores[_p] = _packet.getData()[(int) (_p+4)];
 }
};
 //BA.debugLineNum = 160;BA.debugLine="Dim Fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 161;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 163;BA.debugLine="Fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 164;BA.debugLine="DateTime.DateFormat=\"MM/dd/yyyy\"";
__c.DateTime.setDateFormat("MM/dd/yyyy");
 //BA.debugLineNum = 165;BA.debugLine="For c =0 To 48 Step 2";
{
final int step114 = (int) (2);
final int limit114 = (int) (48);
for (_c = (int) (0); (step114 > 0 && _c <= limit114) || (step114 < 0 && _c >= limit114); _c = ((int)(0 + _c + step114))) {
 //BA.debugLineNum = 166;BA.debugLine="If Valores(c)>0 AND Valores(c)<13 AND Valores (c+1)>0 AND Valores(c+1)<32 Then";
if (_valores[_c]>0 && _valores[_c]<13 && _valores[(int) (_c+1)]>0 && _valores[(int) (_c+1)]<32) { 
 //BA.debugLineNum = 167;BA.debugLine="Dim F As Long";
_f = 0L;
 //BA.debugLineNum = 170;BA.debugLine="F = DateTime.DateParse (Valores(c) & \"/\" & Valores(c+1) &   \"/\" & DateTime.GetYear (DateTime.Now)  )";
_f = __c.DateTime.DateParse(BA.NumberToString(_valores[_c])+"/"+BA.NumberToString(_valores[(int) (_c+1)])+"/"+BA.NumberToString(__c.DateTime.GetYear(__c.DateTime.getNow())));
 //BA.debugLineNum = 171;BA.debugLine="If F < DateTime.Now Then F= DateTime.Add (F,1,0,0)";
if (_f<__c.DateTime.getNow()) { 
_f = __c.DateTime.Add(_f,(int) (1),(int) (0),(int) (0));};
 //BA.debugLineNum = 172;BA.debugLine="Fc.Add (F)";
_fc.Add((Object)(_f));
 };
 }
};
 //BA.debugLineNum = 175;BA.debugLine="Do While Fc.Size >0";
while (_fc.getSize()>0) {
 //BA.debugLineNum = 176;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 177;BA.debugLine="Dim Pos As Int";
_pos = 0;
 //BA.debugLineNum = 178;BA.debugLine="Dim ValMax As Long";
_valmax = 0L;
 //BA.debugLineNum = 179;BA.debugLine="For c =0 To Fc.Size -1";
{
final int step126 = 1;
final int limit126 = (int) (_fc.getSize()-1);
for (_c = (int) (0); (step126 > 0 && _c <= limit126) || (step126 < 0 && _c >= limit126); _c = ((int)(0 + _c + step126))) {
 //BA.debugLineNum = 180;BA.debugLine="If ValMax< Fc.Get (c) Then";
if (_valmax<(double)(BA.ObjectToNumber(_fc.Get(_c)))) { 
 //BA.debugLineNum = 181;BA.debugLine="ValMax=Fc.Get (c)";
_valmax = BA.ObjectToLongNumber(_fc.Get(_c));
 //BA.debugLineNum = 182;BA.debugLine="Pos=c";
_pos = _c;
 };
 }
};
 //BA.debugLineNum = 185;BA.debugLine="Fc.RemoveAt (Pos)";
_fc.RemoveAt(_pos);
 //BA.debugLineNum = 186;BA.debugLine="Fechas.InsertAt   (0,ValMax)";
_fechas.InsertAt((int) (0),(Object)(_valmax));
 }
;
 //BA.debugLineNum = 188;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 }else {
 //BA.debugLineNum = 192;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 193;BA.debugLine="SendTrama(TramaEnviada)";
_sendtrama(_tramaenviada);
 //BA.debugLineNum = 194;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 196;BA.debugLine="If msg = \"WRIDAYE\" Then";
if ((_msg).equals("WRIDAYE")) { 
 //BA.debugLineNum = 197;BA.debugLine="If ValoresComunes.NumeroCental < ValoresComunes.Centrales .Size Then";
if (_valorescomunes._numerocental<_valorescomunes._centrales.getSize()) { 
 //BA.debugLineNum = 199;BA.debugLine="ValoresComunes.NumeroCental = ValoresComunes.NumeroCental + 1";
_valorescomunes._numerocental = (int) (_valorescomunes._numerocental+1);
 //BA.debugLineNum = 200;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 201;BA.debugLine="SendTrama(TramaEnviada)";
_sendtrama(_tramaenviada);
 //BA.debugLineNum = 202;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 204;BA.debugLine="ValoresComunes.NumeroCental = NumeroCentralControlada";
_valorescomunes._numerocental = _numerocentralcontrolada;
 //BA.debugLineNum = 205;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 };
 }else {
 };
 };
 };
 //BA.debugLineNum = 220;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 221;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 222;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 223;BA.debugLine="CmdGuardar.Enabled =True";
_cmdguardar.setEnabled(__c.True);
 //BA.debugLineNum = 224;BA.debugLine="CmdNew.Enabled =True";
_cmdnew.setEnabled(__c.True);
 } 
       catch (Exception e161) {
			ba.setLastException(e161); };
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
