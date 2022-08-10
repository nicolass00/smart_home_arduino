package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmtrigger extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmtrigger", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmtrigger",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4a.objects.collections.List _timetable = null;
public anywheresoftware.b4a.objects.collections.List _timetablevalor = null;
public byte _circuitomostrado = (byte)0;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public byte[] _tramaenviada = null;
public int _conttim = 0;
public boolean _paqueteenviado = false;
public anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdguardar = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdnew = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdseleccion = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _addcirtoscr(int _p,ExControl.Domotica.frmhorarios._horario _h) throws Exception{
String _hr = "";
 //BA.debugLineNum = 538;BA.debugLine="Sub AddCirToScr(p As Int , H As Horario)";
 //BA.debugLineNum = 540;BA.debugLine="Dim Hr As String";
_hr = "";
 //BA.debugLineNum = 541;BA.debugLine="Hr= H.Minuto";
_hr = BA.NumberToString(_h.Minuto);
 //BA.debugLineNum = 542;BA.debugLine="If Hr.Length <2 Then";
if (_hr.length()<2) { 
 //BA.debugLineNum = 543;BA.debugLine="Hr= H.Hora & \":0\" & Hr";
_hr = BA.NumberToString(_h.Hora)+":0"+_hr;
 }else {
 //BA.debugLineNum = 545;BA.debugLine="Hr= H.Hora & \":\" & Hr";
_hr = BA.NumberToString(_h.Hora)+":"+_hr;
 };
 //BA.debugLineNum = 548;BA.debugLine="TimeTableValor.Add (p)";
_timetablevalor.Add((Object)(_p));
 //BA.debugLineNum = 549;BA.debugLine="If H.Circuito <30 Then";
if (_h.Circuito<30) { 
 //BA.debugLineNum = 555;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=1 OR ValoresComunes.Circuitos (H.Circuito).Rango=2 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==1 || _valorescomunes._circuitos[(int) (_h.Circuito)].Rango==2) { 
 //BA.debugLineNum = 556;BA.debugLine="If H.Salida =0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 558;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.BombillaOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._bombillaoff);
 }else {
 //BA.debugLineNum = 562;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.BombillaOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._bombillaon);
 };
 };
 //BA.debugLineNum = 570;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=7 OR ValoresComunes.Circuitos (H.Circuito).Rango=8 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==7 || _valorescomunes._circuitos[(int) (_h.Circuito)].Rango==8) { 
 //BA.debugLineNum = 571;BA.debugLine="If H.Salida =0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 572;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.EnchufeOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._enchufeoff);
 }else {
 //BA.debugLineNum = 576;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.EnchufeOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._enchufeon);
 };
 };
 //BA.debugLineNum = 581;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=39 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==39) { 
 //BA.debugLineNum = 583;BA.debugLine="If H.Salida =0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 584;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.PuertaOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._puertaoff);
 }else {
 //BA.debugLineNum = 588;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.PuertaOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._puertaon);
 };
 };
 //BA.debugLineNum = 595;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=13 OR  ValoresComunes.Circuitos (H.Circuito).Rango=14 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==13 || _valorescomunes._circuitos[(int) (_h.Circuito)].Rango==14) { 
 //BA.debugLineNum = 596;BA.debugLine="If H.Salida=0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 597;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.RiegoOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._riegooff);
 }else {
 //BA.debugLineNum = 601;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.RiegoOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._riegoon);
 };
 };
 //BA.debugLineNum = 609;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=15 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==15) { 
 //BA.debugLineNum = 610;BA.debugLine="If H.Salida=0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 611;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.valvulaOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._valvulaoff);
 }else {
 //BA.debugLineNum = 614;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.valvulaOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._valvulaon);
 };
 };
 //BA.debugLineNum = 619;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=19 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==19) { 
 //BA.debugLineNum = 620;BA.debugLine="If H.Salida=0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 621;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.AcondicionadoOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._acondicionadooff);
 }else {
 //BA.debugLineNum = 625;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.AcondicionadoOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._acondicionadoon);
 };
 };
 //BA.debugLineNum = 632;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=24 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==24) { 
 //BA.debugLineNum = 633;BA.debugLine="If H.Salida=0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 634;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.CalefaccionOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._calefaccionoff);
 }else {
 //BA.debugLineNum = 638;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.CalefaccionOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._calefaccionon);
 };
 };
 //BA.debugLineNum = 644;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=25 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==25) { 
 //BA.debugLineNum = 645;BA.debugLine="If H.Salida=0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 646;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.CalefaccionOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._calefaccionoff);
 }else {
 //BA.debugLineNum = 650;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.CalefaccionOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._calefaccionon);
 };
 };
 //BA.debugLineNum = 657;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=43 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==43) { 
 //BA.debugLineNum = 658;BA.debugLine="If H.Salida=0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 659;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.ventiladorOff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._ventiladoroff);
 }else {
 //BA.debugLineNum = 663;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre ,ValoresComunes.ventiladoron)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._ventiladoron);
 };
 };
 //BA.debugLineNum = 670;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=29 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==29) { 
 //BA.debugLineNum = 672;BA.debugLine="AddTwoLinesAndBitmap2 (Hr& \" - \"& H.Salida  & \"ºC\" ,ValoresComunes.Circuitos (H.Circuito).Nombre  ,ValoresComunes.Temperatura)";
_addtwolinesandbitmap2(_hr+" - "+BA.NumberToString(_h.Salida)+"ºC",_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._temperatura);
 };
 //BA.debugLineNum = 679;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=34 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==34) { 
 //BA.debugLineNum = 680;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito).Nombre& \" - \"& H.Salida & \"%\"   ,ValoresComunes.persiana)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre+" - "+BA.NumberToString(_h.Salida)+"%",_valorescomunes._persiana);
 };
 //BA.debugLineNum = 684;BA.debugLine="If ValoresComunes.Circuitos (H.Circuito).Rango=35 Then";
if (_valorescomunes._circuitos[(int) (_h.Circuito)].Rango==35) { 
 //BA.debugLineNum = 685;BA.debugLine="If H.Salida =0 Then";
if (_h.Salida==0) { 
 //BA.debugLineNum = 686;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito ).Nombre   ,ValoresComunes.Toldooff)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._toldooff);
 }else {
 //BA.debugLineNum = 689;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Circuitos (H.Circuito ).Nombre  ,ValoresComunes.ToldoOn)";
_addtwolinesandbitmap2(_hr,_valorescomunes._circuitos[(int) (_h.Circuito)].Nombre,_valorescomunes._toldoon);
 };
 };
 };
 //BA.debugLineNum = 697;BA.debugLine="If H.Circuito>29 AND H.Circuito <40 Then";
if (_h.Circuito>29 && _h.Circuito<40) { 
 //BA.debugLineNum = 698;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Scenes  (H.Circuito -  30).Nombre ,ValoresComunes.Ambient)";
_addtwolinesandbitmap2(_hr,_valorescomunes._scenes[(int) (_h.Circuito-30)].Nombre,_valorescomunes._ambient);
 };
 //BA.debugLineNum = 703;BA.debugLine="If H.Circuito>39 AND H.Circuito <50 Then";
if (_h.Circuito>39 && _h.Circuito<50) { 
 //BA.debugLineNum = 704;BA.debugLine="If H.Salida=1 Then";
if (_h.Salida==1) { 
 //BA.debugLineNum = 705;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Condicionados  (H.Circuito -40).Nombre ,ValoresComunes.CheckOn )";
_addtwolinesandbitmap2(_hr,_valorescomunes._condicionados[(int) (_h.Circuito-40)].Nombre,_valorescomunes._checkon);
 }else {
 //BA.debugLineNum = 708;BA.debugLine="AddTwoLinesAndBitmap2 (Hr,ValoresComunes.Condicionados (H.Circuito -40).Nombre ,ValoresComunes.CheckOff )";
_addtwolinesandbitmap2(_hr,_valorescomunes._condicionados[(int) (_h.Circuito-40)].Nombre,_valorescomunes._checkoff);
 };
 };
 //BA.debugLineNum = 711;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 119;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 120;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 122;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 124;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 126;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 128;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 130;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 133;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 134;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 135;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 136;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 137;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 138;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 139;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 141;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Dim TimeTable As List";
_timetable = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 6;BA.debugLine="Dim TimeTableValor As List";
_timetablevalor = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 7;BA.debugLine="Dim CircuitoMostrado As Byte";
_circuitomostrado = (byte)0;
 //BA.debugLineNum = 8;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 11;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 13;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 14;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Dim TramaEnviada() As Byte";
_tramaenviada = new byte[(int) (0)];
;
 //BA.debugLineNum = 21;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 22;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 23;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim CmdGuardar As Button";
_cmdguardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 25;BA.debugLine="Dim CmdNew As Button";
_cmdnew = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 26;BA.debugLine="Dim CmdSeleccion As Button";
_cmdseleccion = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 115;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 116;BA.debugLine="Timer1.Enabled =False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 117;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _cmdguardar_action() throws Exception{
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
int _rsp = 0;
int _longtrama = 0;
byte[] _data = null;
int _c = 0;
int _pos = 0;
ExControl.Domotica.frmhorarios._horario _h = null;
 //BA.debugLineNum = 274;BA.debugLine="Sub CmdGuardar_Action";
 //BA.debugLineNum = 275;BA.debugLine="Dim Msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 277;BA.debugLine="Dim Rsp As  Int";
_rsp = 0;
 //BA.debugLineNum = 279;BA.debugLine="Rsp = Msg.Show2 ( \"Confirm saving?\",\"SECURITY QUESTION\",\"Yes\",\"No\",\"\")";
_rsp = _msg.Show2("Confirm saving?","SECURITY QUESTION","Yes","No","");
 //BA.debugLineNum = 281;BA.debugLine="If Rsp =  -1 Then";
if (_rsp==-1) { 
 //BA.debugLineNum = 282;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 283;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 284;BA.debugLine="LongTrama= 60";
_longtrama = (int) (60);
 }else {
 //BA.debugLineNum = 286;BA.debugLine="LongTrama= 52";
_longtrama = (int) (52);
 };
 //BA.debugLineNum = 288;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 289;BA.debugLine="data(0)=87";
_data[(int) (0)] = (byte) (87);
 //BA.debugLineNum = 290;BA.debugLine="data(1)=84";
_data[(int) (1)] = (byte) (84);
 //BA.debugLineNum = 291;BA.debugLine="data(2)=71";
_data[(int) (2)] = (byte) (71);
 //BA.debugLineNum = 292;BA.debugLine="data(3)=82";
_data[(int) (3)] = (byte) (82);
 //BA.debugLineNum = 294;BA.debugLine="Dim c,pos As Int";
_c = 0;
_pos = 0;
 //BA.debugLineNum = 295;BA.debugLine="pos=4";
_pos = (int) (4);
 //BA.debugLineNum = 296;BA.debugLine="For c =0 To 11";
{
final int step211 = 1;
final int limit211 = (int) (11);
for (_c = (int) (0); (step211 > 0 && _c <= limit211) || (step211 < 0 && _c >= limit211); _c = ((int)(0 + _c + step211))) {
 //BA.debugLineNum = 297;BA.debugLine="If c < TimeTable.Size Then";
if (_c<_timetable.getSize()) { 
 //BA.debugLineNum = 298;BA.debugLine="Dim H As Horario";
_h = new ExControl.Domotica.frmhorarios._horario();
 //BA.debugLineNum = 299;BA.debugLine="H= TimeTable.Get (c)";
_h = (ExControl.Domotica.frmhorarios._horario)(_timetable.Get(_c));
 //BA.debugLineNum = 300;BA.debugLine="data(pos)= H.Hora";
_data[_pos] = _h.Hora;
 //BA.debugLineNum = 301;BA.debugLine="data(pos+1)= H.Minuto";
_data[(int) (_pos+1)] = _h.Minuto;
 //BA.debugLineNum = 302;BA.debugLine="data(pos+2)= H.Circuito";
_data[(int) (_pos+2)] = _h.Circuito;
 //BA.debugLineNum = 303;BA.debugLine="data(pos+3)= H.Salida";
_data[(int) (_pos+3)] = _h.Salida;
 }else {
 //BA.debugLineNum = 306;BA.debugLine="data(pos)= 66";
_data[_pos] = (byte) (66);
 //BA.debugLineNum = 307;BA.debugLine="data(pos+1)= 66";
_data[(int) (_pos+1)] = (byte) (66);
 //BA.debugLineNum = 308;BA.debugLine="data(pos+2)= 66";
_data[(int) (_pos+2)] = (byte) (66);
 //BA.debugLineNum = 309;BA.debugLine="data(pos+3)= 66";
_data[(int) (_pos+3)] = (byte) (66);
 };
 //BA.debugLineNum = 311;BA.debugLine="pos = pos + 4";
_pos = (int) (_pos+4);
 }
};
 //BA.debugLineNum = 313;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 314;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 };
 //BA.debugLineNum = 316;BA.debugLine="End Sub";
return "";
}
public String  _cmdnew_action() throws Exception{
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
ExControl.Domotica.frmhorarios._horario _h = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.List _lstvalores = null;
int _i = 0;
int _pos = 0;
ExControl.Domotica.frmlista _frmlist = null;
int _newval = 0;
int _r = 0;
ExControl.Domotica.frmbarra _frmdialog = null;
ExControl.Domotica.timedialog _dialog = null;
int _resp = 0;
int _p = 0;
ExControl.Domotica.frmhorarios._horario _hcmp = null;
 //BA.debugLineNum = 360;BA.debugLine="Sub CmdNew_Action";
 //BA.debugLineNum = 361;BA.debugLine="If TimeTable.Size >11 Then";
if (_timetable.getSize()>11) { 
 //BA.debugLineNum = 362;BA.debugLine="Dim msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 363;BA.debugLine="msg.Show (\"You can not configure more than 12 programs per day\",\"Info\")";
_msg.Show("You can not configure more than 12 programs per day","Info");
 //BA.debugLineNum = 364;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 367;BA.debugLine="Dim H As Horario";
_h = new ExControl.Domotica.frmhorarios._horario();
 //BA.debugLineNum = 369;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 370;BA.debugLine="Dim LstValores As List";
_lstvalores = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 371;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 372;BA.debugLine="LstValores.Initialize";
_lstvalores.Initialize();
 //BA.debugLineNum = 375;BA.debugLine="For I =0 To 29";
{
final int step281 = 1;
final int limit281 = (int) (29);
for (_i = (int) (0); (step281 > 0 && _i <= limit281) || (step281 < 0 && _i >= limit281); _i = ((int)(0 + _i + step281))) {
 //BA.debugLineNum = 376;BA.debugLine="If ValoresComunes.Circuitos (I).Nombre <> \"\" AND ValoresComunes.Circuitos (I).Rango >0 Then";
if ((_valorescomunes._circuitos[_i].Nombre).equals("") == false && _valorescomunes._circuitos[_i].Rango>0) { 
 //BA.debugLineNum = 377;BA.debugLine="Lst.Add   (ValoresComunes.Circuitos (I).Nombre)";
_lst.Add((Object)(_valorescomunes._circuitos[_i].Nombre));
 //BA.debugLineNum = 378;BA.debugLine="LstValores.Add (I)";
_lstvalores.Add((Object)(_i));
 };
 }
};
 //BA.debugLineNum = 381;BA.debugLine="For I =0 To 9";
{
final int step287 = 1;
final int limit287 = (int) (9);
for (_i = (int) (0); (step287 > 0 && _i <= limit287) || (step287 < 0 && _i >= limit287); _i = ((int)(0 + _i + step287))) {
 //BA.debugLineNum = 382;BA.debugLine="If ValoresComunes.Scenes  (I).Nombre <> \"\" Then";
if ((_valorescomunes._scenes[_i].Nombre).equals("") == false) { 
 //BA.debugLineNum = 383;BA.debugLine="Lst.Add   (ValoresComunes.Scenes (I).Nombre)";
_lst.Add((Object)(_valorescomunes._scenes[_i].Nombre));
 //BA.debugLineNum = 384;BA.debugLine="LstValores.Add (30+I)";
_lstvalores.Add((Object)(30+_i));
 };
 }
};
 //BA.debugLineNum = 388;BA.debugLine="For I =0 To 9";
{
final int step293 = 1;
final int limit293 = (int) (9);
for (_i = (int) (0); (step293 > 0 && _i <= limit293) || (step293 < 0 && _i >= limit293); _i = ((int)(0 + _i + step293))) {
 //BA.debugLineNum = 389;BA.debugLine="If ValoresComunes.Condicionados   (I).Nombre <> \"\" Then";
if ((_valorescomunes._condicionados[_i].Nombre).equals("") == false) { 
 //BA.debugLineNum = 390;BA.debugLine="Lst.Add   (ValoresComunes.Condicionados (I).Nombre)";
_lst.Add((Object)(_valorescomunes._condicionados[_i].Nombre));
 //BA.debugLineNum = 391;BA.debugLine="LstValores.Add (40+I)";
_lstvalores.Add((Object)(40+_i));
 };
 }
};
 //BA.debugLineNum = 394;BA.debugLine="Dim Pos As Int";
_pos = 0;
 //BA.debugLineNum = 395;BA.debugLine="If CircuitoMostrado < 50 Then";
if (_circuitomostrado<50) { 
 //BA.debugLineNum = 396;BA.debugLine="Pos=  CircuitoMostrado";
_pos = (int) (_circuitomostrado);
 }else {
 //BA.debugLineNum = 398;BA.debugLine="Pos =-1";
_pos = (int) (-1);
 };
 //BA.debugLineNum = 400;BA.debugLine="Dim FrmList As FrmLista";
_frmlist = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 401;BA.debugLine="FrmList.Initialize( Frm,Lst, Pos )";
_frmlist._initialize(ba,_frm,_lst,_pos);
 //BA.debugLineNum = 402;BA.debugLine="Pos = FrmList.Show";
_pos = _frmlist._show();
 //BA.debugLineNum = 403;BA.debugLine="If Pos>=0 Then";
if (_pos>=0) { 
 //BA.debugLineNum = 404;BA.debugLine="H.Circuito = LstValores.Get (Pos)";
_h.Circuito = (byte)(BA.ObjectToNumber(_lstvalores.Get(_pos)));
 }else {
 //BA.debugLineNum = 406;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 411;BA.debugLine="Dim NewVal As Int";
_newval = 0;
 //BA.debugLineNum = 413;BA.debugLine="Select  ValoresComunes.Circuitos (H.Circuito).Rango";
switch (BA.switchObjectToInt(_valorescomunes._circuitos[(int) (_h.Circuito)].Rango,(int) (1),(int) (1),(int) (7),(int) (8),(int) (13),(int) (4),(int) (19),(int) (24),(int) (39),(int) (15),(int) (25),(int) (43),(int) (29),(int) (14),(int) (34),(int) (35),(int) (30),(int) (31),(int) (32),(int) (33),(int) (34),(int) (35),(int) (36),(int) (37),(int) (38),(int) (39),(int) (40),(int) (41),(int) (42),(int) (43),(int) (44),(int) (45),(int) (46),(int) (47),(int) (48),(int) (49))) {
case 0:
 //BA.debugLineNum = 415;BA.debugLine="Lst.Clear";
_lst.Clear();
 //BA.debugLineNum = 416;BA.debugLine="Lst.Add (\"Turn off lights.\")";
_lst.Add((Object)("Turn off lights."));
 //BA.debugLineNum = 417;BA.debugLine="Lst.Add (\"Turn on lights.\")";
_lst.Add((Object)("Turn on lights."));
 //BA.debugLineNum = 418;BA.debugLine="FrmList.Initialize( Frm,Lst, - 1)";
_frmlist._initialize(ba,_frm,_lst,(int) (-1));
 //BA.debugLineNum = 419;BA.debugLine="NewVal = FrmList.Show";
_newval = _frmlist._show();
 //BA.debugLineNum = 420;BA.debugLine="If NewVal = -1 Then Return";
if (_newval==-1) { 
if (true) return "";};
 break;
case 1:
 //BA.debugLineNum = 424;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 425;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 426;BA.debugLine="Lst.Add (\"Turn off lights.\")";
_lst.Add((Object)("Turn off lights."));
 //BA.debugLineNum = 427;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 428;BA.debugLine="For  r =1 To 3";
{
final int step327 = 1;
final int limit327 = (int) (3);
for (_r = (int) (1); (step327 > 0 && _r <= limit327) || (step327 < 0 && _r >= limit327); _r = ((int)(0 + _r + step327))) {
 //BA.debugLineNum = 429;BA.debugLine="Lst.Add(\"Turn on \" & r & \"/\" & ValoresComunes.Circuitos (H.Circuito).Rango)";
_lst.Add((Object)("Turn on "+BA.NumberToString(_r)+"/"+BA.NumberToString(_valorescomunes._circuitos[(int) (_h.Circuito)].Rango)));
 }
};
 //BA.debugLineNum = 432;BA.debugLine="FrmList.Initialize( Frm,Lst, -1 )";
_frmlist._initialize(ba,_frm,_lst,(int) (-1));
 //BA.debugLineNum = 433;BA.debugLine="If NewVal = -1 Then Return";
if (_newval==-1) { 
if (true) return "";};
 //BA.debugLineNum = 434;BA.debugLine="NewVal = FrmList.Show";
_newval = _frmlist._show();
 break;
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
case 9:
case 10:
case 11:
 //BA.debugLineNum = 437;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 438;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 439;BA.debugLine="Lst.Add (\"Turn off system\")";
_lst.Add((Object)("Turn off system"));
 //BA.debugLineNum = 440;BA.debugLine="Lst.Add (\"Turn on system.\")";
_lst.Add((Object)("Turn on system."));
 //BA.debugLineNum = 441;BA.debugLine="FrmList.Initialize( Frm,Lst, -1 )";
_frmlist._initialize(ba,_frm,_lst,(int) (-1));
 //BA.debugLineNum = 442;BA.debugLine="NewVal = FrmList.Show";
_newval = _frmlist._show();
 //BA.debugLineNum = 443;BA.debugLine="If NewVal = -1 Then Return";
if (_newval==-1) { 
if (true) return "";};
 break;
case 12:
 //BA.debugLineNum = 449;BA.debugLine="Dim FrmDialog As FrmBarra";
_frmdialog = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 450;BA.debugLine="FrmDialog.Initialize(Frm,18,30,20,\"º\")";
_frmdialog._initialize(ba,_frm,(int) (18),(int) (30),(int) (20),BA.ObjectToChar("º"));
 //BA.debugLineNum = 451;BA.debugLine="NewVal=FrmDialog.Show";
_newval = _frmdialog._show();
 break;
case 13:
 //BA.debugLineNum = 453;BA.debugLine="Dim FrmDialog As FrmBarra";
_frmdialog = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 454;BA.debugLine="FrmDialog.Initialize( Frm, 0,100,50,\"Min\")";
_frmdialog._initialize(ba,_frm,(int) (0),(int) (100),(int) (50),BA.ObjectToChar("Min"));
 //BA.debugLineNum = 455;BA.debugLine="NewVal=FrmDialog.Show";
_newval = _frmdialog._show();
 break;
case 14:
 //BA.debugLineNum = 457;BA.debugLine="Dim FrmDialog As FrmBarra";
_frmdialog = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 458;BA.debugLine="FrmDialog.Initialize( Frm, 0,100,50,\"%\")";
_frmdialog._initialize(ba,_frm,(int) (0),(int) (100),(int) (50),BA.ObjectToChar("%"));
 //BA.debugLineNum = 459;BA.debugLine="NewVal=FrmDialog.Show";
_newval = _frmdialog._show();
 break;
case 15:
 //BA.debugLineNum = 462;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 463;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 464;BA.debugLine="Lst.Add (\"Upload Awning\")";
_lst.Add((Object)("Upload Awning"));
 //BA.debugLineNum = 465;BA.debugLine="Lst.Add (\"Download Awning\")";
_lst.Add((Object)("Download Awning"));
 //BA.debugLineNum = 466;BA.debugLine="FrmList.Initialize( Frm,Lst, - 1)";
_frmlist._initialize(ba,_frm,_lst,(int) (-1));
 //BA.debugLineNum = 467;BA.debugLine="NewVal = FrmList.Show";
_newval = _frmlist._show();
 //BA.debugLineNum = 468;BA.debugLine="If NewVal = -1 Then Return";
if (_newval==-1) { 
if (true) return "";};
 //BA.debugLineNum = 469;BA.debugLine="If NewVal = 1 Then NewVal=100";
if (_newval==1) { 
_newval = (int) (100);};
 break;
case 16:
case 17:
case 18:
case 19:
case 20:
case 21:
case 22:
case 23:
case 24:
case 25:
 //BA.debugLineNum = 472;BA.debugLine="NewVal= H.Circuito - 29";
_newval = (int) (_h.Circuito-29);
 break;
case 26:
case 27:
case 28:
case 29:
case 30:
case 31:
case 32:
case 33:
case 34:
case 35:
 //BA.debugLineNum = 475;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 476;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 477;BA.debugLine="Lst.Add (\"Turn off system\")";
_lst.Add((Object)("Turn off system"));
 //BA.debugLineNum = 478;BA.debugLine="Lst.Add (\"Turn on system.\")";
_lst.Add((Object)("Turn on system."));
 //BA.debugLineNum = 480;BA.debugLine="FrmList.Initialize( Frm,Lst, -1 )";
_frmlist._initialize(ba,_frm,_lst,(int) (-1));
 //BA.debugLineNum = 481;BA.debugLine="NewVal = FrmList.Show";
_newval = _frmlist._show();
 //BA.debugLineNum = 482;BA.debugLine="If NewVal = -1 Then Return";
if (_newval==-1) { 
if (true) return "";};
 break;
}
;
 //BA.debugLineNum = 484;BA.debugLine="If NewVal < 0 Then Return";
if (_newval<0) { 
if (true) return "";};
 //BA.debugLineNum = 485;BA.debugLine="H.Salida =NewVal";
_h.Salida = (byte) (_newval);
 //BA.debugLineNum = 489;BA.debugLine="Dim Dialog As TimeDialog";
_dialog = new ExControl.Domotica.timedialog();
 //BA.debugLineNum = 490;BA.debugLine="Dialog.Initialize( Frm )";
_dialog._initialize(ba,_frm);
 //BA.debugLineNum = 491;BA.debugLine="Dim Resp As Int";
_resp = 0;
 //BA.debugLineNum = 492;BA.debugLine="Resp = Dialog.Show";
_resp = _dialog._show();
 //BA.debugLineNum = 493;BA.debugLine="If Resp=1 Then";
if (_resp==1) { 
 //BA.debugLineNum = 494;BA.debugLine="H.Hora  =Dialog.Hora";
_h.Hora = (byte) (_dialog._hora);
 //BA.debugLineNum = 495;BA.debugLine="H.Minuto = Dialog.Minuto";
_h.Minuto = (byte) (_dialog._minuto);
 //BA.debugLineNum = 496;BA.debugLine="If TimeTable.Size =0 Then";
if (_timetable.getSize()==0) { 
 //BA.debugLineNum = 497;BA.debugLine="TimeTable.Add (H)";
_timetable.Add((Object)(_h));
 }else {
 //BA.debugLineNum = 499;BA.debugLine="For p=0 To TimeTable.Size -1";
{
final int step385 = 1;
final int limit385 = (int) (_timetable.getSize()-1);
for (_p = (int) (0); (step385 > 0 && _p <= limit385) || (step385 < 0 && _p >= limit385); _p = ((int)(0 + _p + step385))) {
 //BA.debugLineNum = 500;BA.debugLine="Dim Hcmp As Horario";
_hcmp = new ExControl.Domotica.frmhorarios._horario();
 //BA.debugLineNum = 501;BA.debugLine="Hcmp = TimeTable.Get (p)";
_hcmp = (ExControl.Domotica.frmhorarios._horario)(_timetable.Get(_p));
 //BA.debugLineNum = 502;BA.debugLine="If (Hcmp.Hora > H.Hora  )    Then";
if ((_hcmp.Hora>_h.Hora)) { 
 //BA.debugLineNum = 504;BA.debugLine="TimeTable.InsertAt   (p,H)";
_timetable.InsertAt(_p,(Object)(_h));
 //BA.debugLineNum = 505;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 //BA.debugLineNum = 506;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 508;BA.debugLine="If (Hcmp.Hora = H.Hora  AND Hcmp.Minuto   >= H.Minuto)    Then";
if ((_hcmp.Hora==_h.Hora && _hcmp.Minuto>=_h.Minuto)) { 
 //BA.debugLineNum = 510;BA.debugLine="TimeTable.InsertAt   (p,H)";
_timetable.InsertAt(_p,(Object)(_h));
 //BA.debugLineNum = 511;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 //BA.debugLineNum = 512;BA.debugLine="Return";
if (true) return "";
 };
 }
};
 //BA.debugLineNum = 515;BA.debugLine="TimeTable.Add (H )";
_timetable.Add((Object)(_h));
 };
 //BA.debugLineNum = 517;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 };
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return "";
}
public String  _cmdseleccion_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
anywheresoftware.b4a.objects.collections.List _lstval = null;
int _i = 0;
int _pos = 0;
ExControl.Domotica.frmlista _frmli = null;
 //BA.debugLineNum = 317;BA.debugLine="Sub CmdSeleccion_Action";
 //BA.debugLineNum = 318;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 319;BA.debugLine="Dim lstVal As List";
_lstval = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 320;BA.debugLine="lstVal.Initialize";
_lstval.Initialize();
 //BA.debugLineNum = 321;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 322;BA.debugLine="For I =0 To 29";
{
final int step236 = 1;
final int limit236 = (int) (29);
for (_i = (int) (0); (step236 > 0 && _i <= limit236) || (step236 < 0 && _i >= limit236); _i = ((int)(0 + _i + step236))) {
 //BA.debugLineNum = 323;BA.debugLine="If ValoresComunes.Circuitos (I).Nombre <> \"\" Then";
if ((_valorescomunes._circuitos[_i].Nombre).equals("") == false) { 
 //BA.debugLineNum = 324;BA.debugLine="lst.Add (ValoresComunes.Circuitos (I).Nombre)";
_lst.Add((Object)(_valorescomunes._circuitos[_i].Nombre));
 //BA.debugLineNum = 325;BA.debugLine="lstVal.Add (I)";
_lstval.Add((Object)(_i));
 };
 }
};
 //BA.debugLineNum = 328;BA.debugLine="For I =0 To 9";
{
final int step242 = 1;
final int limit242 = (int) (9);
for (_i = (int) (0); (step242 > 0 && _i <= limit242) || (step242 < 0 && _i >= limit242); _i = ((int)(0 + _i + step242))) {
 //BA.debugLineNum = 329;BA.debugLine="If ValoresComunes.Scenes  (I).Nombre <> \"\" Then";
if ((_valorescomunes._scenes[_i].Nombre).equals("") == false) { 
 //BA.debugLineNum = 330;BA.debugLine="lst.Add (ValoresComunes.Scenes  (I).Nombre)";
_lst.Add((Object)(_valorescomunes._scenes[_i].Nombre));
 //BA.debugLineNum = 331;BA.debugLine="lstVal.Add (I+30)";
_lstval.Add((Object)(_i+30));
 };
 }
};
 //BA.debugLineNum = 334;BA.debugLine="For I =0 To 9";
{
final int step248 = 1;
final int limit248 = (int) (9);
for (_i = (int) (0); (step248 > 0 && _i <= limit248) || (step248 < 0 && _i >= limit248); _i = ((int)(0 + _i + step248))) {
 //BA.debugLineNum = 335;BA.debugLine="If ValoresComunes.Condicionados   (I).Nombre <> \"\" Then";
if ((_valorescomunes._condicionados[_i].Nombre).equals("") == false) { 
 //BA.debugLineNum = 336;BA.debugLine="lst.Add (ValoresComunes.Condicionados  (I).Nombre)";
_lst.Add((Object)(_valorescomunes._condicionados[_i].Nombre));
 //BA.debugLineNum = 337;BA.debugLine="lstVal.Add (I+40)";
_lstval.Add((Object)(_i+40));
 };
 }
};
 //BA.debugLineNum = 340;BA.debugLine="lst.Add (\"ALL CIRCUITS\")";
_lst.Add((Object)("ALL CIRCUITS"));
 //BA.debugLineNum = 341;BA.debugLine="Dim Pos As Int";
_pos = 0;
 //BA.debugLineNum = 342;BA.debugLine="If CircuitoMostrado < 50 Then  Pos= CircuitoMostrado";
if (_circuitomostrado<50) { 
_pos = (int) (_circuitomostrado);};
 //BA.debugLineNum = 344;BA.debugLine="Dim FrmLi As FrmLista";
_frmli = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 345;BA.debugLine="FrmLi.Initialize  ( Frm,lst, -1)";
_frmli._initialize(ba,_frm,_lst,(int) (-1));
 //BA.debugLineNum = 346;BA.debugLine="Pos =FrmLi.Show ( )";
_pos = _frmli._show();
 //BA.debugLineNum = 348;BA.debugLine="If Pos <0 Then Return";
if (_pos<0) { 
if (true) return "";};
 //BA.debugLineNum = 349;BA.debugLine="If Pos = lst.Size -1 Then";
if (_pos==_lst.getSize()-1) { 
 //BA.debugLineNum = 350;BA.debugLine="CircuitoMostrado=100";
_circuitomostrado = (byte) (100);
 //BA.debugLineNum = 351;BA.debugLine="CmdSeleccion.Text = \"ALL CIRCUITS\"";
_cmdseleccion.setText("ALL CIRCUITS");
 }else {
 //BA.debugLineNum = 353;BA.debugLine="CircuitoMostrado= lstVal.Get (Pos)";
_circuitomostrado = (byte)(BA.ObjectToNumber(_lstval.Get(_pos)));
 //BA.debugLineNum = 354;BA.debugLine="CmdSeleccion.Text = lst.Get (Pos)";
_cmdseleccion.setText(BA.ObjectToString(_lst.Get(_pos)));
 };
 //BA.debugLineNum = 357;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 //BA.debugLineNum = 359;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 34;BA.debugLine="TimeTable.Initialize";
_timetable.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="TimeTableValor.Initialize";
_timetablevalor.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 38;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 39;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 41;BA.debugLine="CmdGuardar.Initialize (\"CmdGuardar\")";
_cmdguardar.Initialize(ba,"CmdGuardar");
 //BA.debugLineNum = 42;BA.debugLine="CmdGuardar.Text =\"SAVE\"";
_cmdguardar.setText("SAVE");
 //BA.debugLineNum = 43;BA.debugLine="CmdGuardar.Font = ValoresComunes.FontH1";
_cmdguardar.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 45;BA.debugLine="CmdNew.Initialize (\"CmdNew\")";
_cmdnew.Initialize(ba,"CmdNew");
 //BA.debugLineNum = 46;BA.debugLine="CmdNew.Text =\"NEW\"";
_cmdnew.setText("NEW");
 //BA.debugLineNum = 47;BA.debugLine="CmdNew.Font = ValoresComunes.FontH1";
_cmdnew.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 50;BA.debugLine="CmdSeleccion.Initialize (\"CmdSeleccion\")";
_cmdseleccion.Initialize(ba,"CmdSeleccion");
 //BA.debugLineNum = 51;BA.debugLine="CmdSeleccion.Text = \"ALL CIRCUITS\"";
_cmdseleccion.setText("ALL CIRCUITS");
 //BA.debugLineNum = 52;BA.debugLine="CmdSeleccion.Font = ValoresComunes.FontH1";
_cmdseleccion.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 54;BA.debugLine="Frm.Initialize(\"FrmCondicionado\", 400dip, 600dip)";
_frm.Initialize(ba,"FrmCondicionado",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 56;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 57;BA.debugLine="Frm.Title =\"Trigger Clock\"";
_frm.setTitle("Trigger Clock");
 //BA.debugLineNum = 61;BA.debugLine="Frm.RootPane.AddNode(CmdGuardar,   0   ,0,   190dip, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdguardar.getObject()),0,0,__c.DipToCurrent((int) (190)),0);
 //BA.debugLineNum = 62;BA.debugLine="Frm.RootPane.SetAnchors(CmdGuardar,  5   ,  5, -1  ,-1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdguardar.getObject()),5,5,-1,-1);
 //BA.debugLineNum = 64;BA.debugLine="Frm.RootPane.AddNode(CmdNew,      0  ,0,  190dip, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdnew.getObject()),0,0,__c.DipToCurrent((int) (190)),0);
 //BA.debugLineNum = 65;BA.debugLine="Frm.RootPane.SetAnchors(CmdNew,     200dip   ,  5, 5  ,-1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdnew.getObject()),__c.DipToCurrent((int) (200)),5,5,-1);
 //BA.debugLineNum = 68;BA.debugLine="Frm.RootPane.AddNode(CmdSeleccion,      0  ,0,   0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdseleccion.getObject()),0,0,0,0);
 //BA.debugLineNum = 69;BA.debugLine="Frm.RootPane.SetAnchors(CmdSeleccion,  5   ,  60, 5 , -1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdseleccion.getObject()),5,60,5,-1);
 //BA.debugLineNum = 71;BA.debugLine="Frm.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 72;BA.debugLine="Frm.RootPane.SetAnchors(ListView1, 0  ,  125, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,125,0,0);
 //BA.debugLineNum = 74;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 77;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 78;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 81;BA.debugLine="Frm.RootPane.AddNode(PgIndicator,  0,  0,70, 70)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 83;BA.debugLine="Frm.RootPane.SetAnchors(PgIndicator , -1,  0,15, -1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,0,15,-1);
 //BA.debugLineNum = 85;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 86;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
int _r = 0;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
 //BA.debugLineNum = 148;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 149;BA.debugLine="If Index > -1 AND PgIndicator.Visible  = False Then";
if (_index>-1 && _pgindicator.getVisible()==__c.False) { 
 //BA.debugLineNum = 150;BA.debugLine="Dim R As Int";
_r = 0;
 //BA.debugLineNum = 151;BA.debugLine="Dim Msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 153;BA.debugLine="R=Msg.Show2 (\"Confirm delete?\",\"Confirmation!!\",\"Yes\",\"No\",\"\")";
_r = _msg.Show2("Confirm delete?","Confirmation!!","Yes","No","");
 //BA.debugLineNum = 154;BA.debugLine="If R=  -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 155;BA.debugLine="TimeTable.RemoveAt (TimeTableValor.Get (Index))";
_timetable.RemoveAt((int)(BA.ObjectToNumber(_timetablevalor.Get(_index))));
 //BA.debugLineNum = 156;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 };
 };
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public String  _refrescapantalla() throws Exception{
int _p = 0;
ExControl.Domotica.frmhorarios._horario _h = null;
 //BA.debugLineNum = 522;BA.debugLine="Sub RefrescaPantalla";
 //BA.debugLineNum = 526;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 527;BA.debugLine="Dim p As Int";
_p = 0;
 //BA.debugLineNum = 528;BA.debugLine="For p =0 To TimeTable.Size -1";
{
final int step407 = 1;
final int limit407 = (int) (_timetable.getSize()-1);
for (_p = (int) (0); (step407 > 0 && _p <= limit407) || (step407 < 0 && _p >= limit407); _p = ((int)(0 + _p + step407))) {
 //BA.debugLineNum = 529;BA.debugLine="Dim H As Horario";
_h = new ExControl.Domotica.frmhorarios._horario();
 //BA.debugLineNum = 530;BA.debugLine="H= TimeTable.Get (p)";
_h = (ExControl.Domotica.frmhorarios._horario)(_timetable.Get(_p));
 //BA.debugLineNum = 531;BA.debugLine="If CircuitoMostrado>59 Then";
if (_circuitomostrado>59) { 
 //BA.debugLineNum = 532;BA.debugLine="AddCirToScr(p,H)";
_addcirtoscr(_p,_h);
 }else {
 //BA.debugLineNum = 534;BA.debugLine="If H.Circuito = CircuitoMostrado Then AddCirToScr(p,H)";
if (_h.Circuito==_circuitomostrado) { 
_addcirtoscr(_p,_h);};
 };
 }
};
 //BA.debugLineNum = 537;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 255;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 256;BA.debugLine="Try";
try { //BA.debugLineNum = 257;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 258;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 259;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 260;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e184) {
			ba.setLastException(e184); //BA.debugLineNum = 262;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 212;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 213;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 214;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 218;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(__c.True);
 //BA.debugLineNum = 219;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 220;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 221;BA.debugLine="TramaEnviada= data";
_tramaenviada = _data;
 //BA.debugLineNum = 222;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 224;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 225;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 226;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 227;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 229;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 230;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 232;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 233;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 237;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 238;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 239;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 240;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 241;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 242;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 243;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 249;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 //BA.debugLineNum = 252;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 };
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
byte[] _data = null;
String _trama = "";
 //BA.debugLineNum = 89;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 91;BA.debugLine="CircuitoMostrado=100";
_circuitomostrado = (byte) (100);
 //BA.debugLineNum = 94;BA.debugLine="CmdGuardar.Enabled =False";
_cmdguardar.setEnabled(__c.False);
 //BA.debugLineNum = 95;BA.debugLine="CmdNew.Enabled =False";
_cmdnew.setEnabled(__c.False);
 //BA.debugLineNum = 96;BA.debugLine="CmdSeleccion.Enabled =False";
_cmdseleccion.setEnabled(__c.False);
 //BA.debugLineNum = 99;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 102;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 103;BA.debugLine="Dim trama As String";
_trama = "";
 //BA.debugLineNum = 104;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 105;BA.debugLine="trama = \"RETRIGGER\" & ValoresComunes.Password";
_trama = "RETRIGGER"+_valorescomunes._password;
 }else {
 //BA.debugLineNum = 107;BA.debugLine="trama = \"RETRIGGER\"";
_trama = "RETRIGGER";
 };
 //BA.debugLineNum = 110;BA.debugLine="data =trama.GetBytes (\"UTF8\")";
_data = _trama.getBytes("UTF8");
 //BA.debugLineNum = 111;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 113;BA.debugLine="Frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return 0;
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 267;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 269;BA.debugLine="If  ContTim > 50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 270;BA.debugLine="If PaqueteEnviado=True Then SendTrama(TramaEnviada)";
if (_paqueteenviado==__c.True) { 
_sendtrama(_tramaenviada);};
 };
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
byte[] _valores = null;
int _p = 0;
ExControl.Domotica.frmhorarios._horario _hor = null;
 //BA.debugLineNum = 162;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 163;BA.debugLine="Try";
try { //BA.debugLineNum = 164;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 165;BA.debugLine="msg = BytesToString(Packet.data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 168;BA.debugLine="If msg.Contains (\"TIGR\") Then";
if (_msg.contains("TIGR")) { 
 //BA.debugLineNum = 169;BA.debugLine="TimeTable.Clear";
_timetable.Clear();
 //BA.debugLineNum = 170;BA.debugLine="Dim Valores(48) As Byte";
_valores = new byte[(int) (48)];
;
 //BA.debugLineNum = 171;BA.debugLine="Dim p As Int";
_p = 0;
 //BA.debugLineNum = 172;BA.debugLine="For p =4 To Packet.Length -1";
{
final int step113 = 1;
final int limit113 = (int) (_packet.getLength()-1);
for (_p = (int) (4); (step113 > 0 && _p <= limit113) || (step113 < 0 && _p >= limit113); _p = ((int)(0 + _p + step113))) {
 //BA.debugLineNum = 173;BA.debugLine="Valores(p-4)=Packet.data (p)-1";
_valores[(int) (_p-4)] = (byte) (_packet.getData()[_p]-1);
 }
};
 //BA.debugLineNum = 176;BA.debugLine="p=0";
_p = (int) (0);
 //BA.debugLineNum = 178;BA.debugLine="Do While p < 45";
while (_p<45) {
 //BA.debugLineNum = 179;BA.debugLine="If Valores(p)<24 AND Valores(p)>=0 AND Valores(p+1)>=0 AND Valores(p+1)<60 AND Valores(p+2)>= 0 AND Valores(p+2)<=50 AND Valores(p+3)>=0 AND Valores(p+3) <=100 Then";
if (_valores[_p]<24 && _valores[_p]>=0 && _valores[(int) (_p+1)]>=0 && _valores[(int) (_p+1)]<60 && _valores[(int) (_p+2)]>=0 && _valores[(int) (_p+2)]<=50 && _valores[(int) (_p+3)]>=0 && _valores[(int) (_p+3)]<=100) { 
 //BA.debugLineNum = 180;BA.debugLine="Dim Hor As Horario";
_hor = new ExControl.Domotica.frmhorarios._horario();
 //BA.debugLineNum = 181;BA.debugLine="Hor.Hora = Valores(p)";
_hor.Hora = _valores[_p];
 //BA.debugLineNum = 182;BA.debugLine="Hor.minuto = Valores(p+1)";
_hor.Minuto = _valores[(int) (_p+1)];
 //BA.debugLineNum = 183;BA.debugLine="Hor.Circuito =Valores(p+2)";
_hor.Circuito = _valores[(int) (_p+2)];
 //BA.debugLineNum = 184;BA.debugLine="Hor.Salida = Valores(p+3)";
_hor.Salida = _valores[(int) (_p+3)];
 //BA.debugLineNum = 185;BA.debugLine="TimeTable.Add (Hor)";
_timetable.Add((Object)(_hor));
 };
 //BA.debugLineNum = 187;BA.debugLine="p=p+4";
_p = (int) (_p+4);
 }
;
 //BA.debugLineNum = 189;BA.debugLine="RefrescaPantalla";
_refrescapantalla();
 //BA.debugLineNum = 191;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 192;BA.debugLine="SendTrama(TramaEnviada)";
_sendtrama(_tramaenviada);
 //BA.debugLineNum = 193;BA.debugLine="Return";
if (true) return "";
 }else {
 };
 };
 //BA.debugLineNum = 199;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 200;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 201;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 202;BA.debugLine="CmdGuardar.Enabled =True";
_cmdguardar.setEnabled(__c.True);
 //BA.debugLineNum = 203;BA.debugLine="CmdNew.Enabled =True";
_cmdnew.setEnabled(__c.True);
 //BA.debugLineNum = 204;BA.debugLine="CmdSeleccion.Enabled =True";
_cmdseleccion.setEnabled(__c.True);
 } 
       catch (Exception e142) {
			ba.setLastException(e142); };
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
