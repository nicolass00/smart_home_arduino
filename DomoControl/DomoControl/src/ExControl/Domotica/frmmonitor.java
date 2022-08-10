package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmmonitor extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmmonitor", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmmonitor",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4a.objects.collections.List _valuevar1 = null;
public anywheresoftware.b4a.objects.Timer _timer1 = null;
public anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public int _conttim = 0;
public anywheresoftware.b4a.objects.collections.List _sensores = null;
public int _sensorenlectura = 0;
public anywheresoftware.b4j.objects.ComboBoxWrapper _cmbvar1 = null;
public anywheresoftware.b4j.object.JavaObject _ggetdata = null;
public int _readcount = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public static class _punto{
public boolean IsInitialized;
public int X;
public int Y;
public void Initialize() {
IsInitialized = true;
X = 0;
Y = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public String  _adddata(anywheresoftware.b4j.object.JavaObject _getdata,String _x,int _value) throws Exception{
anywheresoftware.b4j.object.JavaObject _data = null;
 //BA.debugLineNum = 139;BA.debugLine="Sub AddData(GetData As JavaObject,X As String,Value As Int)";
 //BA.debugLineNum = 140;BA.debugLine="Dim Data As JavaObject";
_data = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 141;BA.debugLine="Data.InitializeNewInstance(\"javafx.scene.chart.XYChart.Data\",Array As Object(X,Value))";
_data.InitializeNewInstance("javafx.scene.chart.XYChart.Data",new Object[]{(Object)(_x),(Object)(_value)});
 //BA.debugLineNum = 142;BA.debugLine="GetData.RunMethod(\"add\",Array As Object(Data))";
_getdata.RunMethod("add",new Object[]{(Object)(_data.getObject())});
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 7;BA.debugLine="Type Punto(X As Int , Y As Int)";
;
 //BA.debugLineNum = 8;BA.debugLine="Dim ValueVar1 As List";
_valuevar1 = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 9;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 10;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 12;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 14;BA.debugLine="Dim Sensores As List";
_sensores = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Dim SensorEnLectura As Int";
_sensorenlectura = 0;
 //BA.debugLineNum = 20;BA.debugLine="Private CmbVar1 As ComboBox";
_cmbvar1 = new anywheresoftware.b4j.objects.ComboBoxWrapper();
 //BA.debugLineNum = 23;BA.debugLine="Private GGetData As JavaObject";
_ggetdata = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 25;BA.debugLine="Dim ReadCount As Int";
_readcount = 0;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public String  _cmbvar1_selectedindexchanged(int _index,Object _value) throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub CmbVar1_SelectedIndexChanged(Index As Int, Value As Object)";
 //BA.debugLineNum = 283;BA.debugLine="ValueVar1.Clear";
_valuevar1.Clear();
 //BA.debugLineNum = 284;BA.debugLine="SensorEnLectura=1";
_sensorenlectura = (int) (1);
 //BA.debugLineNum = 285;BA.debugLine="LecturaDatos";
_lecturadatos();
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.object.JavaObject _xaxis = null;
anywheresoftware.b4j.object.JavaObject _yaxis = null;
anywheresoftware.b4j.object.JavaObject _linechart = null;
anywheresoftware.b4j.object.JavaObject _serie11 = null;
anywheresoftware.b4j.object.JavaObject _serie12 = null;
anywheresoftware.b4j.object.JavaObject _serie13 = null;
anywheresoftware.b4j.object.JavaObject _getdata = null;
anywheresoftware.b4j.object.JavaObject _lcgetdata = null;
int _c = 0;
anywheresoftware.b4j.object.JavaObject _serie1 = null;
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 36;BA.debugLine="Private XAxis,YAxis,LineChart,Serie11,Serie12,Serie13,GetData,LCGetData As JavaObject";
_xaxis = new anywheresoftware.b4j.object.JavaObject();
_yaxis = new anywheresoftware.b4j.object.JavaObject();
_linechart = new anywheresoftware.b4j.object.JavaObject();
_serie11 = new anywheresoftware.b4j.object.JavaObject();
_serie12 = new anywheresoftware.b4j.object.JavaObject();
_serie13 = new anywheresoftware.b4j.object.JavaObject();
_getdata = new anywheresoftware.b4j.object.JavaObject();
_lcgetdata = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 37;BA.debugLine="GGetData = GetData";
_ggetdata = _getdata;
 //BA.debugLineNum = 39;BA.debugLine="Frm.Initialize(\"Frm\",  600,600)";
_frm.Initialize(ba,"Frm",600,600);
 //BA.debugLineNum = 40;BA.debugLine="Frm.SetOwner (Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 41;BA.debugLine="Frm.RootPane.LoadLayout(\"FrmMonitor\") 'Load the layout file.";
_frm.getRootPane().LoadLayout(ba,"FrmMonitor");
 //BA.debugLineNum = 42;BA.debugLine="Frm.Title =\"Historico\"";
_frm.setTitle("Historico");
 //BA.debugLineNum = 43;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 45;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 48;BA.debugLine="If Sensores.IsInitialized = False Then";
if (_sensores.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 49;BA.debugLine="Sensores.Initialize";
_sensores.Initialize();
 //BA.debugLineNum = 50;BA.debugLine="Sensores.AddAll (ValoresComunes.NombreSensor)";
_sensores.AddAll(_valorescomunes._nombresensor);
 };
 //BA.debugLineNum = 53;BA.debugLine="ValueVar1.Initialize";
_valuevar1.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="CmbVar1.Items .Add (\"Select\")";
_cmbvar1.getItems().Add((Object)("Select"));
 //BA.debugLineNum = 58;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 59;BA.debugLine="For C =0 To Sensores.Size -1";
{
final int step32 = 1;
final int limit32 = (int) (_sensores.getSize()-1);
for (_c = (int) (0); (step32 > 0 && _c <= limit32) || (step32 < 0 && _c >= limit32); _c = ((int)(0 + _c + step32))) {
 //BA.debugLineNum = 60;BA.debugLine="CmbVar1.Items .Add (Sensores.Get (C))";
_cmbvar1.getItems().Add(_sensores.Get(_c));
 }
};
 //BA.debugLineNum = 64;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 65;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 67;BA.debugLine="Private XAxis,YAxis,LineChart,Serie1,GetData,LCGetData As JavaObject";
_xaxis = new anywheresoftware.b4j.object.JavaObject();
_yaxis = new anywheresoftware.b4j.object.JavaObject();
_linechart = new anywheresoftware.b4j.object.JavaObject();
_serie1 = new anywheresoftware.b4j.object.JavaObject();
_getdata = new anywheresoftware.b4j.object.JavaObject();
_lcgetdata = new anywheresoftware.b4j.object.JavaObject();
 //BA.debugLineNum = 69;BA.debugLine="GGetData = GetData";
_ggetdata = _getdata;
 //BA.debugLineNum = 72;BA.debugLine="XAxis.InitializeNewInstance(\"javafx.scene.chart.CategoryAxis\",Null)";
_xaxis.InitializeNewInstance("javafx.scene.chart.CategoryAxis",(Object[])(__c.Null));
 //BA.debugLineNum = 73;BA.debugLine="YAxis.InitializeNewInstance(\"javafx.scene.chart.NumberAxis\",Null)";
_yaxis.InitializeNewInstance("javafx.scene.chart.NumberAxis",(Object[])(__c.Null));
 //BA.debugLineNum = 74;BA.debugLine="LineChart.InitializeNewInstance(\"javafx.scene.chart.LineChart\",Array As Object(XAxis,YAxis))";
_linechart.InitializeNewInstance("javafx.scene.chart.LineChart",new Object[]{(Object)(_xaxis.getObject()),(Object)(_yaxis.getObject())});
 //BA.debugLineNum = 75;BA.debugLine="Serie1.InitializeNewInstance(\"javafx.scene.chart.XYChart.Series\",Null)";
_serie1.InitializeNewInstance("javafx.scene.chart.XYChart.Series",(Object[])(__c.Null));
 //BA.debugLineNum = 77;BA.debugLine="LineChart.RunMethod(\"setTitle\",Array As Object(\"Monitor\"))";
_linechart.RunMethod("setTitle",new Object[]{(Object)("Monitor")});
 //BA.debugLineNum = 80;BA.debugLine="XAxis.RunMethod(\"setLabel\",Array As Object(\"Read Count\"))";
_xaxis.RunMethod("setLabel",new Object[]{(Object)("Read Count")});
 //BA.debugLineNum = 83;BA.debugLine="Serie1.RunMethod(\"setName\",Array As Object(\"VARIABLE 1\"))";
_serie1.RunMethod("setName",new Object[]{(Object)("VARIABLE 1")});
 //BA.debugLineNum = 89;BA.debugLine="LCGetData=LineChart.RunMethod(\"getData\",Null)";
_lcgetdata.setObject((java.lang.Object)(_linechart.RunMethod("getData",(Object[])(__c.Null))));
 //BA.debugLineNum = 91;BA.debugLine="GetData=Serie1.RunMethod(\"getData\",Null)";
_getdata.setObject((java.lang.Object)(_serie1.RunMethod("getData",(Object[])(__c.Null))));
 //BA.debugLineNum = 92;BA.debugLine="LCGetData.RunMethod(\"add\",Array As Object(Serie1))";
_lcgetdata.RunMethod("add",new Object[]{(Object)(_serie1.getObject())});
 //BA.debugLineNum = 100;BA.debugLine="Frm.BackColor=fx.Colors.White";
_frm.setBackColor(_fx.Colors.White);
 //BA.debugLineNum = 103;BA.debugLine="Frm.RootPane.AddNode(LineChart,0,0,300,300)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_linechart.getObject()),0,0,300,300);
 //BA.debugLineNum = 104;BA.debugLine="Frm.RootPane .SetAnchors (LineChart,0,0,0,80)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_linechart.getObject()),0,0,0,80);
 //BA.debugLineNum = 112;BA.debugLine="Frm.Show";
_frm.Show();
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _lecturadatos() throws Exception{
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 248;BA.debugLine="Sub LecturaDatos()";
 //BA.debugLineNum = 250;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 251;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 252;BA.debugLine="LongTrama= 18";
_longtrama = (int) (18);
 }else {
 //BA.debugLineNum = 254;BA.debugLine="LongTrama= 10";
_longtrama = (int) (10);
 };
 //BA.debugLineNum = 257;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 258;BA.debugLine="data(0)=71";
_data[(int) (0)] = (byte) (71);
 //BA.debugLineNum = 259;BA.debugLine="data(1)=69";
_data[(int) (1)] = (byte) (69);
 //BA.debugLineNum = 260;BA.debugLine="data(2)=84";
_data[(int) (2)] = (byte) (84);
 //BA.debugLineNum = 261;BA.debugLine="data(3)=83";
_data[(int) (3)] = (byte) (83);
 //BA.debugLineNum = 262;BA.debugLine="data(4)=69";
_data[(int) (4)] = (byte) (69);
 //BA.debugLineNum = 263;BA.debugLine="data(5)=78";
_data[(int) (5)] = (byte) (78);
 //BA.debugLineNum = 264;BA.debugLine="data(6)=83";
_data[(int) (6)] = (byte) (83);
 //BA.debugLineNum = 265;BA.debugLine="data(7)=79";
_data[(int) (7)] = (byte) (79);
 //BA.debugLineNum = 266;BA.debugLine="data(8)=82";
_data[(int) (8)] = (byte) (82);
 //BA.debugLineNum = 267;BA.debugLine="data(9)=SensorEnLectura";
_data[(int) (9)] = (byte) (_sensorenlectura);
 //BA.debugLineNum = 268;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 269;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 270;BA.debugLine="SensorEnLectura=SensorEnLectura+1";
_sensorenlectura = (int) (_sensorenlectura+1);
 //BA.debugLineNum = 271;BA.debugLine="If SensorEnLectura> Sensores.Size Then";
if (_sensorenlectura>_sensores.getSize()) { 
 //BA.debugLineNum = 273;BA.debugLine="SensorEnLectura=1";
_sensorenlectura = (int) (1);
 //BA.debugLineNum = 276;BA.debugLine="ContTim = -290";
_conttim = (int) (-290);
 //BA.debugLineNum = 277;BA.debugLine="PaintGrafic";
_paintgrafic();
 };
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return "";
}
public String  _paintgrafic() throws Exception{
int _c = 0;
ExControl.Domotica.frmmonitor._punto _p = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub PaintGrafic";
 //BA.debugLineNum = 118;BA.debugLine="If ValueVar1.Size >0 Then";
if (_valuevar1.getSize()>0) { 
 //BA.debugLineNum = 120;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 121;BA.debugLine="Dim P As Punto";
_p = new ExControl.Domotica.frmmonitor._punto();
 //BA.debugLineNum = 122;BA.debugLine="For c=0 To ValueVar1.Size -1";
{
final int step58 = 1;
final int limit58 = (int) (_valuevar1.getSize()-1);
for (_c = (int) (0); (step58 > 0 && _c <= limit58) || (step58 < 0 && _c >= limit58); _c = ((int)(0 + _c + step58))) {
 //BA.debugLineNum = 123;BA.debugLine="P = ValueVar1.Get (c)";
_p = (ExControl.Domotica.frmmonitor._punto)(_valuevar1.Get(_c));
 //BA.debugLineNum = 124;BA.debugLine="If P.X=ReadCount Then AddData(GGetData,P.X, P.y)";
if (_p.X==_readcount) { 
_adddata(_ggetdata,BA.NumberToString(_p.X),_p.Y);};
 }
};
 };
 //BA.debugLineNum = 131;BA.debugLine="ReadCount=ReadCount+1";
_readcount = (int) (_readcount+1);
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return "";
}
public String  _process_globals() throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 230;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 231;BA.debugLine="Try";
try { //BA.debugLineNum = 232;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 233;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 234;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 235;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e133) {
			ba.setLastException(e133); //BA.debugLineNum = 237;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 194;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 197;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 199;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 200;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 201;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 202;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 204;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 205;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 207;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 208;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 212;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 213;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 214;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 215;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 216;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 217;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 218;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 224;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 };
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 241;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 242;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 244;BA.debugLine="If  ContTim >50 Then LecturaDatos";
if (_conttim>50) { 
_lecturadatos();};
 //BA.debugLineNum = 246;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
int _numsensor = 0;
String _valor = "";
ExControl.Domotica.frmmonitor._punto _p = null;
 //BA.debugLineNum = 147;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 148;BA.debugLine="Try";
try { //BA.debugLineNum = 149;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 150;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 152;BA.debugLine="If msg.Contains (\"SENSOR\") Then";
if (_msg.contains("SENSOR")) { 
 //BA.debugLineNum = 153;BA.debugLine="Dim NumSensor As Int";
_numsensor = 0;
 //BA.debugLineNum = 154;BA.debugLine="Dim Valor As String";
_valor = "";
 //BA.debugLineNum = 155;BA.debugLine="Valor=msg.SubString (7)";
_valor = _msg.substring((int) (7));
 //BA.debugLineNum = 156;BA.debugLine="NumSensor=Packet.Data (6)";
_numsensor = (int) (_packet.getData()[(int) (6)]);
 //BA.debugLineNum = 157;BA.debugLine="Sensores.Set  (Packet.Data (6)-1,msg.SubString (7))";
_sensores.Set((int) (_packet.getData()[(int) (6)]-1),(Object)(_msg.substring((int) (7))));
 //BA.debugLineNum = 159;BA.debugLine="If CmbVar1.SelectedIndex =NumSensor AND IsNumber(Valor) Then";
if (_cmbvar1.getSelectedIndex()==_numsensor && __c.IsNumber(_valor)) { 
 //BA.debugLineNum = 161;BA.debugLine="Dim p As Punto";
_p = new ExControl.Domotica.frmmonitor._punto();
 //BA.debugLineNum = 162;BA.debugLine="p.X=ReadCount";
_p.X = _readcount;
 //BA.debugLineNum = 163;BA.debugLine="p.Y=Valor";
_p.Y = (int)(Double.parseDouble(_valor));
 //BA.debugLineNum = 164;BA.debugLine="ValueVar1.Add (p)";
_valuevar1.Add((Object)(_p));
 };
 //BA.debugLineNum = 169;BA.debugLine="If ContTim> -1 Then";
if (_conttim>-1) { 
 //BA.debugLineNum = 170;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 171;BA.debugLine="LecturaDatos";
_lecturadatos();
 };
 };
 //BA.debugLineNum = 175;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 176;BA.debugLine="LecturaDatos";
_lecturadatos();
 };
 } 
       catch (Exception e95) {
			ba.setLastException(e95); };
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
