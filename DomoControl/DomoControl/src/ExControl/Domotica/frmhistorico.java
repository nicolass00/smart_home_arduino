package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmhistorico extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmhistorico", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmhistorico",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public anywheresoftware.b4a.objects.collections.List _sensores = null;
public anywheresoftware.b4a.objects.collections.List _valores = null;
public anywheresoftware.b4a.objects.collections.List _valuevar = null;
public int _dia = 0;
public int _mes = 0;
public int _año = 0;
public int _lineread = 0;
public byte[] _tramaenviada = null;
public int _conttim = 0;
public boolean _paqueteenviado = false;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _adddata(anywheresoftware.b4j.object.JavaObject _getdata,String _hora,int _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _data = null;
 //BA.debugLineNum = 66;BA.debugLine="Sub AddData(GetData As JavaObject,Hora As String,Value As Int)";
 //BA.debugLineNum = 67;BA.debugLine="Dim Data As JavaObject";
_data = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 68;BA.debugLine="Data.InitializeNewInstance(\"javafx.scene.chart.XYChart.Data\",Array As Object(Hora,Value))";
_data.InitializeNewInstance("javafx.scene.chart.XYChart.Data",new Object[]{(Object)(_hora),(Object)(_value)});
 //BA.debugLineNum = 69;BA.debugLine="GetData.RunMethod(\"add\",Array As Object(Data))";
_getdata.RunMethod("add",new Object[]{(Object)(_data.getObject())});
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 7;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 8;BA.debugLine="Dim Sensores As List";
_sensores = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Dim Valores As List";
_valores = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Dim ValueVar As List";
_valuevar = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Public Dia, Mes, Año As Int";
_dia = 0;
_mes = 0;
_año = 0;
 //BA.debugLineNum = 12;BA.debugLine="Dim LineRead As Int";
_lineread = 0;
 //BA.debugLineNum = 13;BA.debugLine="Dim TramaEnviada() As Byte";
_tramaenviada = new byte[(int) (0)];
;
 //BA.debugLineNum = 14;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 15;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _extractdata(String _linea) throws Exception{
anywheresoftware.b4a.objects.collections.List _l = null;
int _c = 0;
String _valor = "";
char _ca = '\0';
 //BA.debugLineNum = 141;BA.debugLine="Sub ExtractData(linea As String ) As List";
 //BA.debugLineNum = 142;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 143;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 144;BA.debugLine="Dim valor As String";
_valor = "";
 //BA.debugLineNum = 145;BA.debugLine="l.Initialize";
_l.Initialize();
 //BA.debugLineNum = 146;BA.debugLine="For c=0 To linea.Length -1";
{
final int step105 = 1;
final int limit105 = (int) (_linea.length()-1);
for (_c = (int) (0); (step105 > 0 && _c <= limit105) || (step105 < 0 && _c >= limit105); _c = ((int)(0 + _c + step105))) {
 //BA.debugLineNum = 147;BA.debugLine="Dim ca As Char";
_ca = '\0';
 //BA.debugLineNum = 148;BA.debugLine="ca=linea.CharAt (c)";
_ca = _linea.charAt(_c);
 //BA.debugLineNum = 149;BA.debugLine="If ca=\",\" Then";
if (_ca==BA.ObjectToChar(",")) { 
 //BA.debugLineNum = 150;BA.debugLine="If valor<>\"\" Then l.Add (valor)";
if ((_valor).equals("") == false) { 
_l.Add((Object)(_valor));};
 //BA.debugLineNum = 151;BA.debugLine="valor=\"\"";
_valor = "";
 }else {
 //BA.debugLineNum = 153;BA.debugLine="valor=valor&ca";
_valor = _valor+BA.ObjectToString(_ca);
 };
 }
};
 //BA.debugLineNum = 156;BA.debugLine="Return l";
if (true) return _l;
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return null;
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,int _year,int _month,int _day,anywheresoftware.b4a.objects.collections.List _var) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize(Parent As Form,year As Int, month As Int, day As Int, var As List)";
 //BA.debugLineNum = 28;BA.debugLine="Mes=month";
_mes = _month;
 //BA.debugLineNum = 29;BA.debugLine="Año=year";
_año = _year;
 //BA.debugLineNum = 30;BA.debugLine="Dia=day";
_dia = _day;
 //BA.debugLineNum = 31;BA.debugLine="ValueVar=var";
_valuevar = _var;
 //BA.debugLineNum = 33;BA.debugLine="If Sensores.IsInitialized = False Then";
if (_sensores.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 34;BA.debugLine="Sensores.Initialize";
_sensores.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="Sensores.AddAll (ValoresComunes.NombreSensor)";
_sensores.AddAll(_valorescomunes._nombresensor);
 };
 //BA.debugLineNum = 38;BA.debugLine="If Valores.IsInitialized Then";
if (_valores.IsInitialized()) { 
 //BA.debugLineNum = 39;BA.debugLine="Valores.Clear";
_valores.Clear();
 }else {
 //BA.debugLineNum = 41;BA.debugLine="Valores.Initialize";
_valores.Initialize();
 };
 //BA.debugLineNum = 44;BA.debugLine="Frm.Initialize(\"Frm\",  600,600)";
_frm.Initialize(ba,"Frm",600,600);
 //BA.debugLineNum = 45;BA.debugLine="Frm.SetOwner (Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 46;BA.debugLine="Frm.RootPane.LoadLayout(\"FrmHistorico\") 'Load the layout file.";
_frm.getRootPane().LoadLayout(ba,"FrmHistorico");
 //BA.debugLineNum = 47;BA.debugLine="Frm.Title =\"Monitor\"";
_frm.setTitle("Monitor");
 //BA.debugLineNum = 48;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 50;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 52;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 53;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 54;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 55;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 56;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 58;BA.debugLine="Frm.RootPane.AddNode(PgIndicator,   0,  0,70, 70)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 59;BA.debugLine="Frm.RootPane.SetAnchors(PgIndicator , -1,  60,15, -1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,60,15,-1);
 //BA.debugLineNum = 60;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(__c.True);
 //BA.debugLineNum = 61;BA.debugLine="Frm.Show";
_frm.Show();
 //BA.debugLineNum = 63;BA.debugLine="LecturaDatos(1)";
_lecturadatos((int) (1));
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return "";
}
public String  _lecturadatos(int _contadorpaquetes) throws Exception{
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 257;BA.debugLine="Sub LecturaDatos(ContadorPaquetes As Int )";
 //BA.debugLineNum = 259;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 260;BA.debugLine="LineRead=ContadorPaquetes";
_lineread = _contadorpaquetes;
 //BA.debugLineNum = 261;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 262;BA.debugLine="LongTrama= 16";
_longtrama = (int) (16);
 }else {
 //BA.debugLineNum = 264;BA.debugLine="LongTrama= 8";
_longtrama = (int) (8);
 };
 //BA.debugLineNum = 266;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 267;BA.debugLine="data(0)=72'H";
_data[(int) (0)] = (byte) (72);
 //BA.debugLineNum = 268;BA.debugLine="data(1)=73'I";
_data[(int) (1)] = (byte) (73);
 //BA.debugLineNum = 269;BA.debugLine="data(2)=83'S";
_data[(int) (2)] = (byte) (83);
 //BA.debugLineNum = 270;BA.debugLine="data(3)=84'T";
_data[(int) (3)] = (byte) (84);
 //BA.debugLineNum = 271;BA.debugLine="data(4)=Año-2000";
_data[(int) (4)] = (byte) (_año-2000);
 //BA.debugLineNum = 272;BA.debugLine="data(5)=Mes";
_data[(int) (5)] = (byte) (_mes);
 //BA.debugLineNum = 273;BA.debugLine="data(6)=Dia";
_data[(int) (6)] = (byte) (_dia);
 //BA.debugLineNum = 274;BA.debugLine="data(7)=ContadorPaquetes";
_data[(int) (7)] = (byte) (_contadorpaquetes);
 //BA.debugLineNum = 276;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 277;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return "";
}
public String  _paintgrafic() throws Exception{
int _c = 0;
String _hora = "";
anywheresoftware.b4j.object.JavaObject[] _series = null;
anywheresoftware.b4j.object.JavaObject _xaxis = null;
anywheresoftware.b4j.object.JavaObject _yaxis = null;
anywheresoftware.b4j.object.JavaObject _linechart = null;
anywheresoftware.b4j.object.JavaObject _getdata = null;
anywheresoftware.b4j.object.JavaObject _lcgetdata = null;
int _vn = 0;
String _lin = "";
anywheresoftware.b4a.objects.collections.List _l = null;
Object[] _ar = null;
int _p = 0;
 //BA.debugLineNum = 71;BA.debugLine="Sub PaintGrafic";
 //BA.debugLineNum = 73;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 74;BA.debugLine="Dim hora As String";
_hora = "";
 //BA.debugLineNum = 75;BA.debugLine="Private Series(ValueVar.Size ) As JavaObject";
_series = new anywheresoftware.b4j.object.JavaObject[_valuevar.getSize()];
{
int d0 = _series.length;
for (int i0 = 0;i0 < d0;i0++) {
_series[i0] = new anywheresoftware.b4j.object.JavaObject();
}
}
;
 //BA.debugLineNum = 76;BA.debugLine="Private XAxis,YAxis,LineChart,GetData,LCGetData As JavaObject";
_xaxis = new anywheresoftware.b4j.object.JavaObject();
_yaxis = new anywheresoftware.b4j.object.JavaObject();
_linechart = new anywheresoftware.b4j.object.JavaObject();
_getdata = new anywheresoftware.b4j.object.JavaObject();
_lcgetdata = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 78;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 81;BA.debugLine="XAxis.InitializeNewInstance(\"javafx.scene.chart.CategoryAxis\",Null)";
_xaxis.InitializeNewInstance("javafx.scene.chart.CategoryAxis",(Object[])(__c.Null));
 //BA.debugLineNum = 82;BA.debugLine="YAxis.InitializeNewInstance(\"javafx.scene.chart.NumberAxis\",Null)";
_yaxis.InitializeNewInstance("javafx.scene.chart.NumberAxis",(Object[])(__c.Null));
 //BA.debugLineNum = 83;BA.debugLine="LineChart.InitializeNewInstance(\"javafx.scene.chart.LineChart\",Array As Object(XAxis,YAxis))";
_linechart.InitializeNewInstance("javafx.scene.chart.LineChart",new Object[]{(Object)(_xaxis.getObject()),(Object)(_yaxis.getObject())});
 //BA.debugLineNum = 86;BA.debugLine="LineChart.RunMethod(\"setTitle\",Array As Object(Dia&\"/\"&Mes&\"/\"&Año))";
_linechart.RunMethod("setTitle",new Object[]{(Object)(BA.NumberToString(_dia)+"/"+BA.NumberToString(_mes)+"/"+BA.NumberToString(_año))});
 //BA.debugLineNum = 89;BA.debugLine="XAxis.RunMethod(\"setLabel\",Array As Object(\"Grafico\"))";
_xaxis.RunMethod("setLabel",new Object[]{(Object)("Grafico")});
 //BA.debugLineNum = 92;BA.debugLine="XAxis.RunMethod(\"setLabel\",Array As Object(\"Hora\"))";
_xaxis.RunMethod("setLabel",new Object[]{(Object)("Hora")});
 //BA.debugLineNum = 93;BA.debugLine="For c =0 To ValueVar.Size -1";
{
final int step65 = 1;
final int limit65 = (int) (_valuevar.getSize()-1);
for (_c = (int) (0); (step65 > 0 && _c <= limit65) || (step65 < 0 && _c >= limit65); _c = ((int)(0 + _c + step65))) {
 //BA.debugLineNum = 94;BA.debugLine="Series(c).InitializeNewInstance(\"javafx.scene.chart.XYChart.Series\",Null)";
_series[_c].InitializeNewInstance("javafx.scene.chart.XYChart.Series",(Object[])(__c.Null));
 //BA.debugLineNum = 95;BA.debugLine="Series(c).RunMethod(\"setName\",Array As Object(Sensores.Get (ValueVar.Get (c))))";
_series[_c].RunMethod("setName",new Object[]{_sensores.Get((int)(BA.ObjectToNumber(_valuevar.Get(_c))))});
 }
};
 //BA.debugLineNum = 98;BA.debugLine="Dim vn As Int";
_vn = 0;
 //BA.debugLineNum = 99;BA.debugLine="For vn=0 To Valores.Size -1";
{
final int step70 = 1;
final int limit70 = (int) (_valores.getSize()-1);
for (_vn = (int) (0); (step70 > 0 && _vn <= limit70) || (step70 < 0 && _vn >= limit70); _vn = ((int)(0 + _vn + step70))) {
 //BA.debugLineNum = 100;BA.debugLine="Dim lin As String";
_lin = "";
 //BA.debugLineNum = 101;BA.debugLine="lin=Valores.Get (vn)";
_lin = BA.ObjectToString(_valores.Get(_vn));
 //BA.debugLineNum = 102;BA.debugLine="If lin.Length =5 AND lin.Contains (\":\") Then";
if (_lin.length()==5 && _lin.contains(":")) { 
 //BA.debugLineNum = 103;BA.debugLine="hora=lin";
_hora = _lin;
 }else {
 //BA.debugLineNum = 105;BA.debugLine="Dim l As List";
_l = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 106;BA.debugLine="l=ExtractData(lin)";
_l = _extractdata(_lin);
 //BA.debugLineNum = 108;BA.debugLine="For c=0 To ValueVar.Size -1";
{
final int step78 = 1;
final int limit78 = (int) (_valuevar.getSize()-1);
for (_c = (int) (0); (step78 > 0 && _c <= limit78) || (step78 < 0 && _c >= limit78); _c = ((int)(0 + _c + step78))) {
 //BA.debugLineNum = 109;BA.debugLine="If c < l.Size Then";
if (_c<_l.getSize()) { 
 //BA.debugLineNum = 110;BA.debugLine="If l.Size > ValueVar.Get (c) Then";
if (_l.getSize()>(double)(BA.ObjectToNumber(_valuevar.Get(_c)))) { 
 //BA.debugLineNum = 111;BA.debugLine="If IsNumber (l.Get (ValueVar.Get (c))) Then";
if (__c.IsNumber(BA.ObjectToString(_l.Get((int)(BA.ObjectToNumber(_valuevar.Get(_c))))))) { 
 //BA.debugLineNum = 112;BA.debugLine="GetData=Series(c).RunMethod(\"getData\",Null)";
_getdata.setObject((java.lang.Object)(_series[_c].RunMethod("getData",(Object[])(__c.Null))));
 //BA.debugLineNum = 114;BA.debugLine="AddData(GetData,hora,l.Get (ValueVar.Get (c)))";
_adddata(_getdata,_hora,(int)(BA.ObjectToNumber(_l.Get((int)(BA.ObjectToNumber(_valuevar.Get(_c)))))));
 };
 };
 };
 }
};
 };
 }
};
 //BA.debugLineNum = 128;BA.debugLine="LCGetData=LineChart.RunMethod(\"getData\",Null)";
_lcgetdata.setObject((java.lang.Object)(_linechart.RunMethod("getData",(Object[])(__c.Null))));
 //BA.debugLineNum = 131;BA.debugLine="Dim Ar(ValueVar.Size) As Object";
_ar = new Object[_valuevar.getSize()];
{
int d0 = _ar.length;
for (int i0 = 0;i0 < d0;i0++) {
_ar[i0] = new Object();
}
}
;
 //BA.debugLineNum = 132;BA.debugLine="Dim P As Int";
_p = 0;
 //BA.debugLineNum = 133;BA.debugLine="For P=0 To ValueVar.Size -1";
{
final int step93 = 1;
final int limit93 = (int) (_valuevar.getSize()-1);
for (_p = (int) (0); (step93 > 0 && _p <= limit93) || (step93 < 0 && _p >= limit93); _p = ((int)(0 + _p + step93))) {
 //BA.debugLineNum = 134;BA.debugLine="Ar(P)=Series(P)";
_ar[_p] = (Object)(_series[_p].getObject());
 }
};
 //BA.debugLineNum = 136;BA.debugLine="LCGetData.RunMethod(\"addAll\",Array As Object(Ar))";
_lcgetdata.RunMethod("addAll",new Object[]{(Object)(_ar)});
 //BA.debugLineNum = 138;BA.debugLine="Frm.RootPane.AddNode(LineChart,0,0,300,300)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_linechart.getObject()),0,0,300,300);
 //BA.debugLineNum = 139;BA.debugLine="Frm.RootPane .SetAnchors (LineChart,0,0,0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_linechart.getObject()),0,0,0,0);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return "";
}
public String  _process_globals() throws Exception{
 //BA.debugLineNum = 18;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 234;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 235;BA.debugLine="Try";
try { //BA.debugLineNum = 236;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 237;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 238;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 239;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e174) {
			ba.setLastException(e174); //BA.debugLineNum = 241;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 243;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 192;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 193;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 194;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 198;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 199;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 200;BA.debugLine="TramaEnviada= data";
_tramaenviada = _data;
 //BA.debugLineNum = 201;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 203;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 204;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 205;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 206;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 208;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 209;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 211;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 212;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 216;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 217;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 218;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 219;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 220;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 221;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 222;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 228;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 //BA.debugLineNum = 231;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 };
 //BA.debugLineNum = 233;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 246;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 247;BA.debugLine="If PgIndicator.Visible = False Then";
if (_pgindicator.getVisible()==__c.False) { 
 //BA.debugLineNum = 248;BA.debugLine="Timer1.Enabled =False";
_timer1.setEnabled(__c.False);
 }else {
 //BA.debugLineNum = 250;BA.debugLine="If  ContTim > 50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 251;BA.debugLine="If PaqueteEnviado=True Then SendTrama(TramaEnviada)";
if (_paqueteenviado==__c.True) { 
_sendtrama(_tramaenviada);};
 };
 };
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
 //BA.debugLineNum = 159;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 160;BA.debugLine="Try";
try { //BA.debugLineNum = 161;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 162;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 164;BA.debugLine="If msg.EndsWith  (\"HT\") Then";
if (_msg.endsWith("HT")) { 
 //BA.debugLineNum = 165;BA.debugLine="Valores.Add (msg.Replace (\"HT\",\"\"))";
_valores.Add((Object)(_msg.replace("HT","")));
 //BA.debugLineNum = 167;BA.debugLine="If msg.Contains (\"NOFOUND\") Then";
if (_msg.contains("NOFOUND")) { 
 //BA.debugLineNum = 168;BA.debugLine="PaintGrafic";
_paintgrafic();
 }else {
 //BA.debugLineNum = 170;BA.debugLine="LecturaDatos(LineRead+1)";
_lecturadatos((int) (_lineread+1));
 };
 };
 //BA.debugLineNum = 179;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 };
 //BA.debugLineNum = 182;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 } 
       catch (Exception e133) {
			ba.setLastException(e133); };
 //BA.debugLineNum = 189;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
