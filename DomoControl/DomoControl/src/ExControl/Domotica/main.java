package ExControl.Domotica;

import anywheresoftware.b4a.BA;

public class main extends javafx.application.Application{
public static main mostCurrent = new main();
public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.main", null);
		ba.loadHtSubs(main.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.main", ba);
		}
	}
    public static Class<?> getObject() {
		return main.class;
	}

 
    public static void main(String[] args) {
    	launch(args);
    }
    public void start (javafx.stage.Stage stage) {
        try {
            anywheresoftware.b4j.objects.FxBA.application = this;
		    anywheresoftware.b4a.keywords.Common.Density = (float) javafx.stage.Screen.getPrimary().getDpi() / 96f;
            BA.Log("Program started.");
            initializeProcessGlobals();
            anywheresoftware.b4j.objects.Form frm = new anywheresoftware.b4j.objects.Form();
            frm.initWithStage(ba, stage, 1000, 700);
            ba.raiseEvent(null, "appstart", frm, (String[])getParameters().getRaw().toArray(new String[0]));
        } catch (Throwable t) {
            BA.printException(t, true);
            System.exit(1);
        }
    }
public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static anywheresoftware.b4j.objects.Form _mainform = null;
public static ExControl.Domotica.frmselectescena _frmselecscene = null;
public static ExControl.Domotica.frmcondicionados _frmcondicionado = null;
public static ExControl.Domotica.frmsensores _frmsensor = null;
public static anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper _bcbar = null;
public static anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper _mnubar = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public static anywheresoftware.b4a.objects.collections.List _imageviews = null;
public static anywheresoftware.b4a.objects.collections.List _value = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public static anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public static anywheresoftware.b4a.objects.SocketWrapper.UDPSocket _udpsocket1 = null;
public static anywheresoftware.b4a.objects.Timer _timer1 = null;
public static int[] _valores = null;
public static byte[] _ultimatrama = null;
public static int _conttim = 0;
public static anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public static boolean _paqueteenviado = false;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnucreatebackup = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnurecoverbackup = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuclose = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnutrigger = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnutimetable = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuspecial1 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuspecial2 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuenabledtime = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnudeletehorarios = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnudeletespecial = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnusettingcentral = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnunewcentral = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnusensor = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuver50 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuver75 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuver100 = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuverhora = null;
public static int _numerocentralcontrolada = 0;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnusethour = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnunamescene = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnusettingscene = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnueditcomandos = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuconfigcomandoscomunes = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnueditcondcionado = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuabout = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnucircuito = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnugrafico = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnusensores = null;
public static anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper _mnuhistorico = null;
public static ExControl.Domotica.valorescomunes _valorescomunes = null;
public static String  _actualizavalores() throws Exception{
int _numsonda = 0;
int _i = 0;
int _val = 0;
 //BA.debugLineNum = 136;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 137;BA.debugLine="ListView1.Items.Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 138;BA.debugLine="Value.Clear";
_value.Clear();
 //BA.debugLineNum = 139;BA.debugLine="Dim NumSonda As Int";
_numsonda = 0;
 //BA.debugLineNum = 140;BA.debugLine="NumSonda=0";
_numsonda = (int) (0);
 //BA.debugLineNum = 145;BA.debugLine="Dim I As Int";
_i = 0;
 //BA.debugLineNum = 146;BA.debugLine="For I =0 To 29";
{
final int step99 = 1;
final int limit99 = (int) (29);
for (_i = (int) (0); (step99 > 0 && _i <= limit99) || (step99 < 0 && _i >= limit99); _i = ((int)(0 + _i + step99))) {
 //BA.debugLineNum = 148;BA.debugLine="If ValoresComunes.Circuitos (I).Nombre <> \"\" AND ValoresComunes.Circuitos (I).Rango > 0 Then";
if ((_valorescomunes._circuitos[_i].Nombre).equals("") == false && _valorescomunes._circuitos[_i].Rango>0) { 
 //BA.debugLineNum = 153;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=1 OR ValoresComunes.Circuitos (I).Rango=2 Then";
if (_valorescomunes._circuitos[_i].Rango==1 || _valorescomunes._circuitos[_i].Rango==2) { 
 //BA.debugLineNum = 154;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 155;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.BombillaOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._bombillaoff,_i);
 }else {
 //BA.debugLineNum = 158;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.BombillaOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._bombillaon,_i);
 };
 };
 //BA.debugLineNum = 165;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=7 OR ValoresComunes.Circuitos (I).Rango=8 Then";
if (_valorescomunes._circuitos[_i].Rango==7 || _valorescomunes._circuitos[_i].Rango==8) { 
 //BA.debugLineNum = 166;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 167;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.EnchufeOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._enchufeoff,_i);
 }else {
 //BA.debugLineNum = 169;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.EnchufeOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._enchufeon,_i);
 };
 };
 //BA.debugLineNum = 175;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=39 Then";
if (_valorescomunes._circuitos[_i].Rango==39) { 
 //BA.debugLineNum = 176;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 177;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.PuertaOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._puertaoff,_i);
 }else {
 //BA.debugLineNum = 180;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.PuertaOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._puertaon,_i);
 };
 };
 //BA.debugLineNum = 189;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=13 OR  ValoresComunes.Circuitos (I).Rango=14 Then";
if (_valorescomunes._circuitos[_i].Rango==13 || _valorescomunes._circuitos[_i].Rango==14) { 
 //BA.debugLineNum = 190;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 191;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.RiegoOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._riegooff,_i);
 }else {
 //BA.debugLineNum = 194;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.RiegoOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._riegoon,_i);
 };
 };
 //BA.debugLineNum = 200;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=15 Then";
if (_valorescomunes._circuitos[_i].Rango==15) { 
 //BA.debugLineNum = 201;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 202;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.ValvulaOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._valvulaoff,_i);
 }else {
 //BA.debugLineNum = 205;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.ValvulaOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._valvulaon,_i);
 };
 };
 //BA.debugLineNum = 211;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=19 Then";
if (_valorescomunes._circuitos[_i].Rango==19) { 
 //BA.debugLineNum = 212;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 213;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.AcondicionadoOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._acondicionadooff,_i);
 }else {
 //BA.debugLineNum = 216;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.AcondicionadoOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._acondicionadoon,_i);
 };
 };
 //BA.debugLineNum = 222;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=24 Then";
if (_valorescomunes._circuitos[_i].Rango==24) { 
 //BA.debugLineNum = 223;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 224;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.CalefaccionOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionoff,_i);
 }else {
 //BA.debugLineNum = 227;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.CalefaccionOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionon,_i);
 };
 };
 //BA.debugLineNum = 232;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=25 Then";
if (_valorescomunes._circuitos[_i].Rango==25) { 
 //BA.debugLineNum = 233;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 234;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.CalefaccionOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionoff,_i);
 }else {
 //BA.debugLineNum = 236;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.CalefaccionOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionon,_i);
 };
 };
 //BA.debugLineNum = 242;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=43 Then";
if (_valorescomunes._circuitos[_i].Rango==43) { 
 //BA.debugLineNum = 243;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 244;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.VentiladorOff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._ventiladoroff,_i);
 }else {
 //BA.debugLineNum = 246;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.VentiladorOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._ventiladoron,_i);
 };
 };
 //BA.debugLineNum = 253;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=29 Then";
if (_valorescomunes._circuitos[_i].Rango==29) { 
 //BA.debugLineNum = 254;BA.debugLine="Dim Val As Int";
_val = 0;
 //BA.debugLineNum = 255;BA.debugLine="Val = Bit.AND (Valores(NumSonda+30), 0xff)*2";
_val = (int) (anywheresoftware.b4a.keywords.Common.Bit.And(_valores[(int) (_numsonda+30)],(int) (0xff))*2);
 //BA.debugLineNum = 256;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre & \" : \"& Valores(I) & \"ºC\"  ,\"Current Temperature : \"& (Val/10) & \"ºC\" ,ValoresComunes.Temperatura,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre+" : "+BA.NumberToString(_valores[_i])+"ºC","Current Temperature : "+BA.NumberToString((_val/(double)10))+"ºC",_valorescomunes._temperatura,_i);
 //BA.debugLineNum = 257;BA.debugLine="NumSonda=NumSonda+1";
_numsonda = (int) (_numsonda+1);
 };
 //BA.debugLineNum = 262;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=34 Then";
if (_valorescomunes._circuitos[_i].Rango==34) { 
 //BA.debugLineNum = 264;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre & \" - \"& Valores(I) & \"%\"  ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.persiana,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre+" - "+BA.NumberToString(_valores[_i])+"%",_valorescomunes._circuitos[_i].descripcion,_valorescomunes._persiana,_i);
 };
 //BA.debugLineNum = 269;BA.debugLine="If ValoresComunes.Circuitos (I).Rango=35 Then";
if (_valorescomunes._circuitos[_i].Rango==35) { 
 //BA.debugLineNum = 270;BA.debugLine="If Valores(I)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 271;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre  ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.Toldooff,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._toldooff,_i);
 }else {
 //BA.debugLineNum = 273;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (I).Nombre  ,ValoresComunes.Circuitos (I).Descripcion ,ValoresComunes.ToldoOn,I)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._toldoon,_i);
 };
 };
 };
 }
};
 //BA.debugLineNum = 282;BA.debugLine="End Sub";
return "";
}
public static String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _iconcircuito,int _valor) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 283;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, IconCircuito As Image , Valor As Int)";
 //BA.debugLineNum = 284;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 286;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 288;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 290;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 292;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 294;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 298;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 299;BA.debugLine="Label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 300;BA.debugLine="Label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 301;BA.debugLine="Label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 302;BA.debugLine="Label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 303;BA.debugLine="Label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 304;BA.debugLine="Label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 306;BA.debugLine="ImageView1.SetImage(IconCircuito  )";
_imageview1.SetImage((javafx.scene.image.Image)(_iconcircuito.getObject()));
 //BA.debugLineNum = 309;BA.debugLine="Value.Add (Valor)";
_value.Add((Object)(_valor));
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public static String  _appstart(anywheresoftware.b4j.objects.Form _form1,String[] _args) throws Exception{
long _today = 0L;
long _fechacaduca = 0L;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _m = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub AppStart (Form1 As Form, Args() As String)";
 //BA.debugLineNum = 69;BA.debugLine="Dim Today , fechaCaduca  As Long";
_today = 0L;
_fechacaduca = 0L;
 //BA.debugLineNum = 71;BA.debugLine="fechaCaduca = DateTime.DateParse (\"12/19/2015\")";
_fechacaduca = anywheresoftware.b4a.keywords.Common.DateTime.DateParse("12/19/2015");
 //BA.debugLineNum = 72;BA.debugLine="Today = DateTime.Now";
_today = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 74;BA.debugLine="If fechaCaduca  < Today Then";
if (_fechacaduca<_today) { 
 //BA.debugLineNum = 75;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 76;BA.debugLine="m.Show (\"Licencia Caducada\",\"Renueve Licencia\")";
_m.Show("Licencia Caducada","Renueve Licencia");
 //BA.debugLineNum = 77;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 };
 //BA.debugLineNum = 81;BA.debugLine="ValoresComunes.CargaImagenes";
_valorescomunes._cargaimagenes();
 //BA.debugLineNum = 82;BA.debugLine="MainForm = Form1";
_mainform = _form1;
 //BA.debugLineNum = 83;BA.debugLine="Form1.WindowWidth =400";
_form1.setWindowWidth(400);
 //BA.debugLineNum = 84;BA.debugLine="Form1.WindowHeight =400";
_form1.setWindowHeight(400);
 //BA.debugLineNum = 85;BA.debugLine="MainForm.RootPane.LoadLayout(\"FrmMain\") 'Load the layout file.";
_mainform.getRootPane().LoadLayout(ba,"FrmMain");
 //BA.debugLineNum = 86;BA.debugLine="MainForm.Show";
_mainform.Show();
 //BA.debugLineNum = 87;BA.debugLine="MainForm.Title =\"Control Domotico ExControl\"";
_mainform.setTitle("Control Domotico ExControl");
 //BA.debugLineNum = 88;BA.debugLine="ImageViews.Initialize";
_imageviews.Initialize();
 //BA.debugLineNum = 89;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 90;BA.debugLine="Label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 91;BA.debugLine="Label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 95;BA.debugLine="MainForm.RootPane.AddNode(ListView1,  0,0, 0, 0)";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 96;BA.debugLine="MainForm.RootPane.SetAnchors(ListView1, 0 , 50, 0,0)";
_mainform.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,50,0,0);
 //BA.debugLineNum = 100;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 101;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 102;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 104;BA.debugLine="MainForm.RootPane.AddNode(PgIndicator,   0,  0,70, 70)";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 105;BA.debugLine="MainForm.RootPane.SetAnchors(PgIndicator , -1,  60,15, -1)";
_mainform.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,60,15,-1);
 //BA.debugLineNum = 109;BA.debugLine="BcBar.Initialize(\"BcBar\")";
_bcbar.Initialize(ba,"BcBar");
 //BA.debugLineNum = 110;BA.debugLine="MainForm.RootPane.AddNode(BcBar, 0, 0, 16 , 16)";
_mainform.getRootPane().AddNode((javafx.scene.Node)(_bcbar.getObject()),0,0,16,16);
 //BA.debugLineNum = 111;BA.debugLine="MainForm.RootPane.SetAnchors(BcBar, 0, mnuBar.Height, 0, -1)";
_mainform.getRootPane().SetAnchors((javafx.scene.Node)(_bcbar.getObject()),0,_mnubar.getHeight(),0,-1);
 //BA.debugLineNum = 113;BA.debugLine="ValoresComunes.CargaConexionExterna";
_valorescomunes._cargaconexionexterna();
 //BA.debugLineNum = 114;BA.debugLine="IniFicheros";
_inificheros();
 //BA.debugLineNum = 116;BA.debugLine="IniciarConexionCentral(1)";
_iniciarconexioncentral((int) (1));
 //BA.debugLineNum = 117;BA.debugLine="BcBar.AddHome";
_bcbar.AddHome();
 //BA.debugLineNum = 118;BA.debugLine="CargaBarraHerramientas";
_cargabarraherramientas();
 //BA.debugLineNum = 122;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 123;BA.debugLine="Value.Initialize";
_value.Initialize();
 //BA.debugLineNum = 125;BA.debugLine="FrmCondicionado.Initialize ( MainForm  )";
_frmcondicionado._initialize(ba,_mainform);
 //BA.debugLineNum = 126;BA.debugLine="FrmSelecScene.Initialize ( MainForm  )";
_frmselecscene._initialize(ba,_mainform);
 //BA.debugLineNum = 127;BA.debugLine="FrmSensor.Initialize ( MainForm  )";
_frmsensor._initialize(ba,_mainform);
 //BA.debugLineNum = 129;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 130;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 133;BA.debugLine="End Sub";
return "";
}
public static String  _bcbar_itemaction() throws Exception{
anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.BreadcrumbItemWrapper _i = null;
ExControl.Domotica.frmselectcentral _frmcentral = null;
int _result = 0;
ExControl.Domotica.frmlista _frmselctcom = null;
int _resultado = 0;
ExControl.Domotica.frmcomandos _frmcoma = null;
ExControl.Domotica.frmcomandoscomunes _frmcomac = null;
 //BA.debugLineNum = 662;BA.debugLine="Sub BcBar_ItemAction";
 //BA.debugLineNum = 665;BA.debugLine="Dim I As JFXtrasBreadcrumbItem";
_i = new anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.BreadcrumbItemWrapper();
 //BA.debugLineNum = 666;BA.debugLine="I.Initialize(Sender)";
_i.Initialize(ba,(jfxtras.labs.scene.control.BreadcrumbItem)(anywheresoftware.b4a.keywords.Common.Sender(ba)));
 //BA.debugLineNum = 667;BA.debugLine="Log(\"Breadcrumb '\" & I.Text & \"' clicked\")";
anywheresoftware.b4a.keywords.Common.Log("Breadcrumb '"+_i.getText()+"' clicked");
 //BA.debugLineNum = 669;BA.debugLine="If I.Text =\"\" Then";
if ((_i.getText()).equals("")) { 
 //BA.debugLineNum = 670;BA.debugLine="Dim FrmCentral As FrmSelectCentral";
_frmcentral = new ExControl.Domotica.frmselectcentral();
 //BA.debugLineNum = 671;BA.debugLine="FrmCentral.Initialize (MainForm)";
_frmcentral._initialize(ba,_mainform);
 //BA.debugLineNum = 672;BA.debugLine="Dim Result As Int";
_result = 0;
 //BA.debugLineNum = 673;BA.debugLine="Result = FrmCentral.Show";
_result = _frmcentral._show();
 //BA.debugLineNum = 675;BA.debugLine="If Result> -1 Then";
if (_result>-1) { 
 //BA.debugLineNum = 676;BA.debugLine="FrmSensor.Close";
_frmsensor._close();
 //BA.debugLineNum = 677;BA.debugLine="FrmSelecScene.Close";
_frmselecscene._close();
 //BA.debugLineNum = 678;BA.debugLine="FrmCondicionado.Close";
_frmcondicionado._close();
 //BA.debugLineNum = 680;BA.debugLine="IniciarConexionCentral(Result+1)";
_iniciarconexioncentral((int) (_result+1));
 };
 };
 //BA.debugLineNum = 685;BA.debugLine="If I.Text =\"Escenas\" Then";
if ((_i.getText()).equals("Escenas")) { 
 //BA.debugLineNum = 687;BA.debugLine="FrmSelecScene.Show";
_frmselecscene._show();
 };
 //BA.debugLineNum = 689;BA.debugLine="If I.Text =\"Condicionado\" Then";
if ((_i.getText()).equals("Condicionado")) { 
 //BA.debugLineNum = 690;BA.debugLine="FrmCondicionado.Show";
_frmcondicionado._show();
 };
 //BA.debugLineNum = 706;BA.debugLine="If I.Text =\"Sensores\" Then";
if ((_i.getText()).equals("Sensores")) { 
 //BA.debugLineNum = 707;BA.debugLine="FrmSensor.Show";
_frmsensor._show();
 };
 //BA.debugLineNum = 710;BA.debugLine="If I.Text =\"Comandos\" Then";
if ((_i.getText()).equals("Comandos")) { 
 //BA.debugLineNum = 711;BA.debugLine="Dim FrmSelctCom As FrmLista";
_frmselctcom = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 712;BA.debugLine="FrmSelctCom.Initialize(MainForm,ValoresComunes.DescripcionesComandos,-1)";
_frmselctcom._initialize(ba,_mainform,_valorescomunes._descripcionescomandos,(int) (-1));
 //BA.debugLineNum = 713;BA.debugLine="Dim Resultado As Int";
_resultado = 0;
 //BA.debugLineNum = 714;BA.debugLine="Resultado=FrmSelctCom.Show";
_resultado = _frmselctcom._show();
 //BA.debugLineNum = 715;BA.debugLine="If Resultado > -1 Then";
if (_resultado>-1) { 
 //BA.debugLineNum = 716;BA.debugLine="Dim FrmComa As FrmComandos";
_frmcoma = new ExControl.Domotica.frmcomandos();
 //BA.debugLineNum = 717;BA.debugLine="FrmComa.Initialize(MainForm,Resultado )";
_frmcoma._initialize(ba,_mainform,_resultado);
 };
 };
 //BA.debugLineNum = 723;BA.debugLine="If I.Text =\"ComandosComunes\" Then";
if ((_i.getText()).equals("ComandosComunes")) { 
 //BA.debugLineNum = 724;BA.debugLine="If ValoresComunes.ComandosComunes .IsInitialized = False Then ValoresComunes.CargaComandosComunes";
if (_valorescomunes._comandoscomunes.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_valorescomunes._cargacomandoscomunes();};
 //BA.debugLineNum = 725;BA.debugLine="Dim FrmSelctCom As FrmLista";
_frmselctcom = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 726;BA.debugLine="FrmSelctCom.Initialize(MainForm,ValoresComunes.DescripcionesComandosComunes ,-1)";
_frmselctcom._initialize(ba,_mainform,_valorescomunes._descripcionescomandoscomunes,(int) (-1));
 //BA.debugLineNum = 727;BA.debugLine="Dim Resultado As Int";
_resultado = 0;
 //BA.debugLineNum = 728;BA.debugLine="Resultado=FrmSelctCom.Show";
_resultado = _frmselctcom._show();
 //BA.debugLineNum = 729;BA.debugLine="If Resultado > -1 Then";
if (_resultado>-1) { 
 //BA.debugLineNum = 730;BA.debugLine="Dim FrmComac As  FrmComandosComunes";
_frmcomac = new ExControl.Domotica.frmcomandoscomunes();
 //BA.debugLineNum = 731;BA.debugLine="FrmComac.Initialize(MainForm,Resultado )";
_frmcomac._initialize(ba,_mainform,_resultado);
 };
 };
 //BA.debugLineNum = 736;BA.debugLine="CargaBarraHerramientas";
_cargabarraherramientas();
 //BA.debugLineNum = 737;BA.debugLine="End Sub";
return "";
}
public static String  _cargabarraherramientas() throws Exception{
anywheresoftware.b4a.objects.collections.List _items = null;
anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.BreadcrumbItemWrapper _bci = null;
int _i = 0;
 //BA.debugLineNum = 628;BA.debugLine="Sub CargaBarraHerramientas";
 //BA.debugLineNum = 629;BA.debugLine="Dim Items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 630;BA.debugLine="Dim bci As JFXtrasBreadcrumbItem";
_bci = new anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.BreadcrumbItemWrapper();
 //BA.debugLineNum = 631;BA.debugLine="Items = BcBar.Items";
_items = _bcbar.getItems();
 //BA.debugLineNum = 633;BA.debugLine="For I = Items.Size - 1 To 1 Step -1";
{
final int step451 = (int) (-1);
final int limit451 = (int) (1);
for (_i = (int) (_items.getSize()-1); (step451 > 0 && _i <= limit451) || (step451 < 0 && _i >= limit451); _i = ((int)(0 + _i + step451))) {
 //BA.debugLineNum = 634;BA.debugLine="bci = Items.Get(I)";
_bci.setObject((jfxtras.labs.scene.control.BreadcrumbItem)(_items.Get(_i)));
 //BA.debugLineNum = 636;BA.debugLine="BcBar.RemoveItem(bci)";
_bcbar.RemoveItem((jfxtras.labs.scene.control.BreadcrumbItem)(_bci.getObject()));
 }
};
 //BA.debugLineNum = 644;BA.debugLine="BcBar.AddItem(\"Escenas\", ValoresComunes.barEscenas   )";
_bcbar.AddItem(ba,"Escenas",(javafx.scene.image.Image)(_valorescomunes._barescenas.getObject()));
 //BA.debugLineNum = 645;BA.debugLine="BcBar.AddItem(\"ComandosComunes\", ValoresComunes.barComandosComunes )";
_bcbar.AddItem(ba,"ComandosComunes",(javafx.scene.image.Image)(_valorescomunes._barcomandoscomunes.getObject()));
 //BA.debugLineNum = 646;BA.debugLine="BcBar.AddItem(\"Condicionado\", ValoresComunes.barCondicionado )";
_bcbar.AddItem(ba,"Condicionado",(javafx.scene.image.Image)(_valorescomunes._barcondicionado.getObject()));
 //BA.debugLineNum = 647;BA.debugLine="BcBar.AddItem(\"Comandos\", ValoresComunes.barComandos )";
_bcbar.AddItem(ba,"Comandos",(javafx.scene.image.Image)(_valorescomunes._barcomandos.getObject()));
 //BA.debugLineNum = 648;BA.debugLine="BcBar.AddItem(\"Sensores\", ValoresComunes.barSensores )";
_bcbar.AddItem(ba,"Sensores",(javafx.scene.image.Image)(_valorescomunes._barsensores.getObject()));
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return "";
}
public static String  _iniciarconexioncentral(int _numerocentral) throws Exception{
byte[] _data = null;
String _trama = "";
 //BA.debugLineNum = 450;BA.debugLine="Sub IniciarConexionCentral(NumeroCentral As Int)";
 //BA.debugLineNum = 453;BA.debugLine="ValoresComunes.NumeroCental =NumeroCentral";
_valorescomunes._numerocental = _numerocentral;
 //BA.debugLineNum = 454;BA.debugLine="ValoresComunes.CargaCircuitos";
_valorescomunes._cargacircuitos();
 //BA.debugLineNum = 455;BA.debugLine="ValoresComunes.CargaScenes";
_valorescomunes._cargascenes();
 //BA.debugLineNum = 456;BA.debugLine="ValoresComunes.CargaCondicionados";
_valorescomunes._cargacondicionados();
 //BA.debugLineNum = 457;BA.debugLine="ValoresComunes.CargaComandos";
_valorescomunes._cargacomandos();
 //BA.debugLineNum = 458;BA.debugLine="ValoresComunes.CargaNombreSensores";
_valorescomunes._carganombresensores();
 //BA.debugLineNum = 460;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 465;BA.debugLine="If ValoresComunes.Circuitos (0).Rango =1000 Then";
if (_valorescomunes._circuitos[(int) (0)].Rango==1000) { 
 //BA.debugLineNum = 466;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 467;BA.debugLine="Dim Trama As String";
_trama = "";
 //BA.debugLineNum = 468;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 469;BA.debugLine="Trama = \"CARG\" & ValoresComunes.Password";
_trama = "CARG"+_valorescomunes._password;
 }else {
 //BA.debugLineNum = 471;BA.debugLine="Trama = \"CARG\"";
_trama = "CARG";
 };
 //BA.debugLineNum = 474;BA.debugLine="data = Trama.GetBytes(\"UTF8\")";
_data = _trama.getBytes("UTF8");
 //BA.debugLineNum = 475;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 }else {
 //BA.debugLineNum = 477;BA.debugLine="LecturaDatos";
_lecturadatos();
 };
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return "";
}
public static String  _inificheros() throws Exception{
boolean _rsp = false;
 //BA.debugLineNum = 1013;BA.debugLine="Sub IniFicheros";
 //BA.debugLineNum = 1014;BA.debugLine="If File.Exists ( File.DirApp  ,\"Centrales\")  = False  Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Centrales")==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 1015;BA.debugLine="ValoresComunes.Centrales .Initialize";
_valorescomunes._centrales.Initialize();
 //BA.debugLineNum = 1016;BA.debugLine="Dim Rsp As Boolean";
_rsp = false;
 //BA.debugLineNum = 1018;BA.debugLine="Do While Rsp=False";
while (_rsp==anywheresoftware.b4a.keywords.Common.False) {
 //BA.debugLineNum = 1019;BA.debugLine="Rsp=NewCentral";
_rsp = _newcentral();
 }
;
 //BA.debugLineNum = 1021;BA.debugLine="ValoresComunes.CargaCentrales";
_valorescomunes._cargacentrales();
 }else {
 //BA.debugLineNum = 1023;BA.debugLine="ValoresComunes.CargaCentrales";
_valorescomunes._cargacentrales();
 };
 //BA.debugLineNum = 1025;BA.debugLine="End Sub";
return "";
}
public static String  _lecturadatos() throws Exception{
byte[] _data = null;
String _trama = "";
 //BA.debugLineNum = 616;BA.debugLine="Sub LecturaDatos()";
 //BA.debugLineNum = 617;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 618;BA.debugLine="Dim Trama As String";
_trama = "";
 //BA.debugLineNum = 619;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 620;BA.debugLine="Trama = \"VACT\" & ValoresComunes.Password";
_trama = "VACT"+_valorescomunes._password;
 }else {
 //BA.debugLineNum = 622;BA.debugLine="Trama = \"VACT\"";
_trama = "VACT";
 };
 //BA.debugLineNum = 625;BA.debugLine="data = Trama.GetBytes(\"UTF8\")";
_data = _trama.getBytes("UTF8");
 //BA.debugLineNum = 626;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 627;BA.debugLine="End Sub";
return "";
}
public static String  _listview1_selectedindexchanged(int _index) throws Exception{
int _newval = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _r = 0;
ExControl.Domotica.frmlista _frmado = null;
ExControl.Domotica.frmbarra _frmnumber = null;
ExControl.Domotica.frmbarra _frm = null;
ExControl.Domotica.frmbarra _frmpersiana = null;
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 312;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 313;BA.debugLine="If Index > -1 AND PgIndicator.Visible = False Then";
if (_index>-1 && _pgindicator.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 315;BA.debugLine="Dim NewVal As Int";
_newval = 0;
 //BA.debugLineNum = 316;BA.debugLine="Select  ValoresComunes.Circuitos (Value.Get (Index)).Rango";
switch (BA.switchObjectToInt(_valorescomunes._circuitos[(int)(BA.ObjectToNumber(_value.Get(_index)))].Rango,(int) (1),(int) (7),(int) (8),(int) (13),(int) (4),(int) (19),(int) (24),(int) (39),(int) (15),(int) (25),(int) (43),(int) (2),(int) (14),(int) (29),(int) (34),(int) (35))) {
case 0:
case 1:
case 2:
case 3:
case 4:
case 5:
case 6:
case 7:
case 8:
case 9:
case 10:
 //BA.debugLineNum = 318;BA.debugLine="If Valores(Value.Get (Index))=0 Then";
if (_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]==0) { 
 //BA.debugLineNum = 319;BA.debugLine="NewVal=1";
_newval = (int) (1);
 }else {
 //BA.debugLineNum = 321;BA.debugLine="NewVal=0";
_newval = (int) (0);
 };
 break;
case 11:
 //BA.debugLineNum = 324;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 325;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 326;BA.debugLine="Lst.Add (\"Turn off lights.\")";
_lst.Add((Object)("Turn off lights."));
 //BA.debugLineNum = 327;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 328;BA.debugLine="For  r =1 To 3";
{
final int step219 = 1;
final int limit219 = (int) (3);
for (_r = (int) (1); (step219 > 0 && _r <= limit219) || (step219 < 0 && _r >= limit219); _r = ((int)(0 + _r + step219))) {
 //BA.debugLineNum = 329;BA.debugLine="Lst.Add(\"Turn on \" & r & \"/\" & ValoresComunes.Circuitos (Value.Get (Index)).Rango)";
_lst.Add((Object)("Turn on "+BA.NumberToString(_r)+"/"+BA.NumberToString(_valorescomunes._circuitos[(int)(BA.ObjectToNumber(_value.Get(_index)))].Rango)));
 }
};
 //BA.debugLineNum = 332;BA.debugLine="Dim FrmAdo As FrmLista";
_frmado = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 333;BA.debugLine="FrmAdo.Initialize(MainForm,Lst,Valores(Value.Get (Index)))";
_frmado._initialize(ba,_mainform,_lst,_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]);
 //BA.debugLineNum = 334;BA.debugLine="NewVal=FrmAdo.Show";
_newval = _frmado._show();
 break;
case 12:
 //BA.debugLineNum = 338;BA.debugLine="Dim FrmNumber As  FrmBarra";
_frmnumber = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 339;BA.debugLine="FrmNumber.Initialize(MainForm,0,220,Valores(Value.Get (Index)),\"Min\")";
_frmnumber._initialize(ba,_mainform,(int) (0),(int) (220),_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))],BA.ObjectToChar("Min"));
 //BA.debugLineNum = 340;BA.debugLine="NewVal=FrmNumber.Show";
_newval = _frmnumber._show();
 break;
case 13:
 //BA.debugLineNum = 345;BA.debugLine="Dim Frm As FrmBarra";
_frm = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 346;BA.debugLine="Frm.Initialize(MainForm,18,30,Valores(Value.Get (Index)),\"º\")";
_frm._initialize(ba,_mainform,(int) (18),(int) (30),_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))],BA.ObjectToChar("º"));
 //BA.debugLineNum = 347;BA.debugLine="NewVal=Frm.Show";
_newval = _frm._show();
 break;
case 14:
 //BA.debugLineNum = 350;BA.debugLine="Dim FrmPersiana As  FrmBarra";
_frmpersiana = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 353;BA.debugLine="FrmPersiana.Initialize(MainForm,0,100,Valores(Value.Get (Index)),\"%\")";
_frmpersiana._initialize(ba,_mainform,(int) (0),(int) (100),_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))],BA.ObjectToChar("%"));
 //BA.debugLineNum = 354;BA.debugLine="NewVal=FrmPersiana.Show' mf.Valor";
_newval = _frmpersiana._show();
 break;
case 15:
 //BA.debugLineNum = 357;BA.debugLine="If Valores(Value.Get (Index))=0 Then";
if (_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]==0) { 
 //BA.debugLineNum = 358;BA.debugLine="NewVal=100";
_newval = (int) (100);
 }else {
 //BA.debugLineNum = 360;BA.debugLine="NewVal=0";
_newval = (int) (0);
 };
 break;
}
;
 //BA.debugLineNum = 367;BA.debugLine="ListView1.SelectedIndex =-1";
_listview1.setSelectedIndex((int) (-1));
 //BA.debugLineNum = 368;BA.debugLine="If NewVal<0 OR NewVal=Valores(Value.Get (Index)) Then Return";
if (_newval<0 || _newval==_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]) { 
if (true) return "";};
 //BA.debugLineNum = 371;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 372;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 373;BA.debugLine="LongTrama= 14";
_longtrama = (int) (14);
 }else {
 //BA.debugLineNum = 375;BA.debugLine="LongTrama= 6";
_longtrama = (int) (6);
 };
 //BA.debugLineNum = 377;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 378;BA.debugLine="data(0)=83";
_data[(int) (0)] = (byte) (83);
 //BA.debugLineNum = 379;BA.debugLine="data(1)=86";
_data[(int) (1)] = (byte) (86);
 //BA.debugLineNum = 380;BA.debugLine="data(2)=65";
_data[(int) (2)] = (byte) (65);
 //BA.debugLineNum = 381;BA.debugLine="data(3)=76";
_data[(int) (3)] = (byte) (76);
 //BA.debugLineNum = 382;BA.debugLine="data(4)= Value.Get (Index) +1";
_data[(int) (4)] = (byte) ((double)(BA.ObjectToNumber(_value.Get(_index)))+1);
 //BA.debugLineNum = 383;BA.debugLine="data (5)=NewVal+1";
_data[(int) (5)] = (byte) (_newval+1);
 //BA.debugLineNum = 390;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 391;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 };
 //BA.debugLineNum = 393;BA.debugLine="End Sub";
return "";
}
public static String  _mnuabout_action() throws Exception{
ExControl.Domotica.frmabout _frmab = null;
 //BA.debugLineNum = 1139;BA.debugLine="Sub mnuAbout_Action";
 //BA.debugLineNum = 1140;BA.debugLine="Dim frmab As FrmAbout";
_frmab = new ExControl.Domotica.frmabout();
 //BA.debugLineNum = 1141;BA.debugLine="frmab.Initialize (MainForm)";
_frmab._initialize(ba,_mainform);
 //BA.debugLineNum = 1143;BA.debugLine="End Sub";
return "";
}
public static String  _mnucircuito_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _circuitoselect = 0;
int _r = 0;
ExControl.Domotica.valorescomunes._circuito _c = null;
ExControl.Domotica.frmlista _frm = null;
ExControl.Domotica.frmcircuito _f = null;
 //BA.debugLineNum = 1144;BA.debugLine="Sub mnuCircuito_Action";
 //BA.debugLineNum = 1145;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1146;BA.debugLine="Dim CircuitoSelect As Int";
_circuitoselect = 0;
 //BA.debugLineNum = 1147;BA.debugLine="CircuitoSelect=-1";
_circuitoselect = (int) (-1);
 //BA.debugLineNum = 1148;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1149;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 1151;BA.debugLine="For  r =0 To 29";
{
final int step860 = 1;
final int limit860 = (int) (29);
for (_r = (int) (0); (step860 > 0 && _r <= limit860) || (step860 < 0 && _r >= limit860); _r = ((int)(0 + _r + step860))) {
 //BA.debugLineNum = 1152;BA.debugLine="Dim C As Circuito";
_c = new ExControl.Domotica.valorescomunes._circuito();
 //BA.debugLineNum = 1153;BA.debugLine="C = ValoresComunes.Circuitos(r)";
_c = _valorescomunes._circuitos[_r];
 //BA.debugLineNum = 1154;BA.debugLine="If C.Nombre =\"\" Then";
if ((_c.Nombre).equals("")) { 
 //BA.debugLineNum = 1155;BA.debugLine="Lst.Add (\"Reserva\")";
_lst.Add((Object)("Reserva"));
 }else {
 //BA.debugLineNum = 1157;BA.debugLine="Lst.Add (C.Nombre )";
_lst.Add((Object)(_c.Nombre));
 };
 }
};
 //BA.debugLineNum = 1162;BA.debugLine="Dim Frm As FrmLista";
_frm = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 1163;BA.debugLine="Frm.Initialize(MainForm,Lst,  -1)";
_frm._initialize(ba,_mainform,_lst,(int) (-1));
 //BA.debugLineNum = 1164;BA.debugLine="CircuitoSelect=Frm.Show";
_circuitoselect = _frm._show();
 //BA.debugLineNum = 1166;BA.debugLine="If CircuitoSelect > -1 Then";
if (_circuitoselect>-1) { 
 //BA.debugLineNum = 1167;BA.debugLine="Dim f As FrmCircuito";
_f = new ExControl.Domotica.frmcircuito();
 //BA.debugLineNum = 1168;BA.debugLine="f.Initialize (MainForm, CircuitoSelect)";
_f._initialize(ba,_mainform,_circuitoselect);
 //BA.debugLineNum = 1169;BA.debugLine="f.Show";
_f._show();
 //BA.debugLineNum = 1170;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 1173;BA.debugLine="End Sub";
return "";
}
public static String  _mnuclose_action() throws Exception{
 //BA.debugLineNum = 738;BA.debugLine="Sub mnuClose_Action";
 //BA.debugLineNum = 739;BA.debugLine="ExitApplication";
anywheresoftware.b4a.keywords.Common.ExitApplication();
 //BA.debugLineNum = 740;BA.debugLine="End Sub";
return "";
}
public static String  _mnuconexionexterna_action() throws Exception{
ExControl.Domotica.frmconexionext _frmextcon = null;
 //BA.debugLineNum = 963;BA.debugLine="Sub mnuConexionExterna_Action";
 //BA.debugLineNum = 964;BA.debugLine="Dim FrmExtCon As FrmConexionExt";
_frmextcon = new ExControl.Domotica.frmconexionext();
 //BA.debugLineNum = 965;BA.debugLine="FrmExtCon.Initialize (MainForm)";
_frmextcon._initialize(ba,_mainform);
 //BA.debugLineNum = 966;BA.debugLine="FrmExtCon.Show";
_frmextcon._show();
 //BA.debugLineNum = 967;BA.debugLine="End Sub";
return "";
}
public static String  _mnuconfigcomandoscomunes_action() throws Exception{
ExControl.Domotica.frmconfigcomandoscomunes _frmcom = null;
 //BA.debugLineNum = 1128;BA.debugLine="Sub mnuConfigComandosComunes_Action";
 //BA.debugLineNum = 1129;BA.debugLine="Dim FrmCom As   FrmConfigComandosComunes";
_frmcom = new ExControl.Domotica.frmconfigcomandoscomunes();
 //BA.debugLineNum = 1130;BA.debugLine="If ValoresComunes.ComandosComunes .IsInitialized = False Then ValoresComunes.CargaComandosComunes";
if (_valorescomunes._comandoscomunes.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
_valorescomunes._cargacomandoscomunes();};
 //BA.debugLineNum = 1131;BA.debugLine="FrmCom.Initialize( MainForm)";
_frmcom._initialize(ba,_mainform);
 //BA.debugLineNum = 1132;BA.debugLine="FrmCom.Show";
_frmcom._show();
 //BA.debugLineNum = 1133;BA.debugLine="End Sub";
return "";
}
public static String  _mnucreatebackup_action() throws Exception{
anywheresoftware.b4j.objects.DirectoryChooserWrapper _d = null;
String _ruta = "";
flm.b4a.archiver.ArchiverForB4A _myzip = null;
anywheresoftware.b4a.objects.collections.List _filelist = null;
boolean _exist = false;
int _numfile = 0;
String[] _fic = null;
int _c = 0;
 //BA.debugLineNum = 770;BA.debugLine="Sub mnuCreatebackup_Action";
 //BA.debugLineNum = 771;BA.debugLine="Dim d As   DirectoryChooser";
_d = new anywheresoftware.b4j.objects.DirectoryChooserWrapper();
 //BA.debugLineNum = 772;BA.debugLine="d.Initialize ()";
_d.Initialize();
 //BA.debugLineNum = 773;BA.debugLine="Dim ruta As String";
_ruta = "";
 //BA.debugLineNum = 774;BA.debugLine="ruta= d.Show (MainForm)";
_ruta = _d.Show(_mainform);
 //BA.debugLineNum = 776;BA.debugLine="If ruta <> \"\" Then";
if ((_ruta).equals("") == false) { 
 //BA.debugLineNum = 777;BA.debugLine="Dim myZip As  Archiver";
_myzip = new flm.b4a.archiver.ArchiverForB4A();
 //BA.debugLineNum = 778;BA.debugLine="Dim FileList As List";
_filelist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 779;BA.debugLine="Dim Exist As Boolean";
_exist = false;
 //BA.debugLineNum = 780;BA.debugLine="Dim NumFile As Int";
_numfile = 0;
 //BA.debugLineNum = 782;BA.debugLine="FileList.Initialize";
_filelist.Initialize();
 //BA.debugLineNum = 784;BA.debugLine="Exist=True";
_exist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 785;BA.debugLine="NumFile=1";
_numfile = (int) (1);
 //BA.debugLineNum = 786;BA.debugLine="Do While Exist";
while (_exist) {
 //BA.debugLineNum = 787;BA.debugLine="Exist=File.Exists (File.DirApp,\"Comandos\" & NumFile)";
_exist = anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Comandos"+BA.NumberToString(_numfile));
 //BA.debugLineNum = 788;BA.debugLine="If Exist Then  FileList.Add (\"Comandos\" & NumFile)";
if (_exist) { 
_filelist.Add((Object)("Comandos"+BA.NumberToString(_numfile)));};
 //BA.debugLineNum = 789;BA.debugLine="NumFile=NumFile+1";
_numfile = (int) (_numfile+1);
 }
;
 //BA.debugLineNum = 791;BA.debugLine="Exist=True";
_exist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 792;BA.debugLine="NumFile=1";
_numfile = (int) (1);
 //BA.debugLineNum = 793;BA.debugLine="Do While Exist";
while (_exist) {
 //BA.debugLineNum = 794;BA.debugLine="Exist=File.Exists (File.DirApp,\"Condicionados\" & NumFile)";
_exist = anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados"+BA.NumberToString(_numfile));
 //BA.debugLineNum = 795;BA.debugLine="If Exist Then  FileList.Add (\"Condicionados\" & NumFile)";
if (_exist) { 
_filelist.Add((Object)("Condicionados"+BA.NumberToString(_numfile)));};
 //BA.debugLineNum = 796;BA.debugLine="NumFile=NumFile+1";
_numfile = (int) (_numfile+1);
 }
;
 //BA.debugLineNum = 798;BA.debugLine="Exist=True";
_exist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 799;BA.debugLine="NumFile=1";
_numfile = (int) (1);
 //BA.debugLineNum = 800;BA.debugLine="Do While Exist";
while (_exist) {
 //BA.debugLineNum = 801;BA.debugLine="Exist=File.Exists (File.DirApp,\"ConfigCir\" & NumFile)";
_exist = anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir"+BA.NumberToString(_numfile));
 //BA.debugLineNum = 802;BA.debugLine="If Exist Then  FileList.Add (\"ConfigCir\" & NumFile)";
if (_exist) { 
_filelist.Add((Object)("ConfigCir"+BA.NumberToString(_numfile)));};
 //BA.debugLineNum = 803;BA.debugLine="NumFile=NumFile+1";
_numfile = (int) (_numfile+1);
 }
;
 //BA.debugLineNum = 805;BA.debugLine="Exist=True";
_exist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 806;BA.debugLine="NumFile=1";
_numfile = (int) (1);
 //BA.debugLineNum = 807;BA.debugLine="Do While Exist";
while (_exist) {
 //BA.debugLineNum = 808;BA.debugLine="Exist=File.Exists (File.DirApp,\"ConfigEsc\" & NumFile)";
_exist = anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc"+BA.NumberToString(_numfile));
 //BA.debugLineNum = 809;BA.debugLine="If Exist Then  FileList.Add (\"ConfigEsc\" & NumFile)";
if (_exist) { 
_filelist.Add((Object)("ConfigEsc"+BA.NumberToString(_numfile)));};
 //BA.debugLineNum = 810;BA.debugLine="NumFile=NumFile+1";
_numfile = (int) (_numfile+1);
 }
;
 //BA.debugLineNum = 812;BA.debugLine="Exist=True";
_exist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 813;BA.debugLine="NumFile=1";
_numfile = (int) (1);
 //BA.debugLineNum = 814;BA.debugLine="Do While Exist";
while (_exist) {
 //BA.debugLineNum = 815;BA.debugLine="Exist=File.Exists (File.DirApp,\"Conexion\" & NumFile)";
_exist = anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Conexion"+BA.NumberToString(_numfile));
 //BA.debugLineNum = 816;BA.debugLine="If Exist Then  FileList.Add (\"Conexion\" & NumFile)";
if (_exist) { 
_filelist.Add((Object)("Conexion"+BA.NumberToString(_numfile)));};
 //BA.debugLineNum = 817;BA.debugLine="NumFile=NumFile+1";
_numfile = (int) (_numfile+1);
 }
;
 //BA.debugLineNum = 819;BA.debugLine="Exist=True";
_exist = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 820;BA.debugLine="NumFile=1";
_numfile = (int) (1);
 //BA.debugLineNum = 821;BA.debugLine="Do While Exist";
while (_exist) {
 //BA.debugLineNum = 822;BA.debugLine="Exist=File.Exists (File.DirApp,\"Sensores\" & NumFile)";
_exist = anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Sensores"+BA.NumberToString(_numfile));
 //BA.debugLineNum = 823;BA.debugLine="If Exist Then  FileList.Add (\"Sensores\" & NumFile)";
if (_exist) { 
_filelist.Add((Object)("Sensores"+BA.NumberToString(_numfile)));};
 //BA.debugLineNum = 824;BA.debugLine="NumFile=NumFile+1";
_numfile = (int) (_numfile+1);
 }
;
 //BA.debugLineNum = 828;BA.debugLine="If File.Exists (File.DirApp,\"ComandosComunes\") Then  FileList.Add (\"ComandosComunes\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ComandosComunes")) { 
_filelist.Add((Object)("ComandosComunes"));};
 //BA.debugLineNum = 829;BA.debugLine="If File.Exists (File.DirApp,\"ConexionExterna\") Then  FileList.Add (\"ConexionExterna\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConexionExterna")) { 
_filelist.Add((Object)("ConexionExterna"));};
 //BA.debugLineNum = 831;BA.debugLine="If File.Exists (File.DirApp,\"Centrales\") Then  FileList.Add (\"Centrales\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Centrales")) { 
_filelist.Add((Object)("Centrales"));};
 //BA.debugLineNum = 833;BA.debugLine="Dim Fic(FileList.Size ) As String";
_fic = new String[_filelist.getSize()];
java.util.Arrays.fill(_fic,"");
 //BA.debugLineNum = 834;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 835;BA.debugLine="For c=0 To FileList.Size -1";
{
final int step592 = 1;
final int limit592 = (int) (_filelist.getSize()-1);
for (_c = (int) (0); (step592 > 0 && _c <= limit592) || (step592 < 0 && _c >= limit592); _c = ((int)(0 + _c + step592))) {
 //BA.debugLineNum = 836;BA.debugLine="Fic(c)=FileList.Get (c)";
_fic[_c] = BA.ObjectToString(_filelist.Get(_c));
 }
};
 //BA.debugLineNum = 838;BA.debugLine="myZip.ZipFiles (File.DirApp , Fic, ruta,\"OLMHCONFIG.piz\", \"\" )";
_myzip.ZipFiles(ba,anywheresoftware.b4a.keywords.Common.File.getDirApp(),_fic,_ruta,"OLMHCONFIG.piz","");
 };
 //BA.debugLineNum = 842;BA.debugLine="End Sub";
return "";
}
public static String  _mnudeletehorarios_action() throws Exception{
int _rsp = 0;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
String _s = "";
byte[] _data = null;
 //BA.debugLineNum = 916;BA.debugLine="Sub mnuDeleteHorarios_Action";
 //BA.debugLineNum = 917;BA.debugLine="Dim Rsp As Int";
_rsp = 0;
 //BA.debugLineNum = 918;BA.debugLine="Dim Msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 919;BA.debugLine="Rsp=Msg.Show2 (\"Are you sure erase all data?\",\"SECURITY QUESTION\",\"Yes\",\"No\",\"\")";
_rsp = _msg.Show2("Are you sure erase all data?","SECURITY QUESTION","Yes","No","");
 //BA.debugLineNum = 920;BA.debugLine="If Rsp=  -1 Then";
if (_rsp==-1) { 
 //BA.debugLineNum = 921;BA.debugLine="Dim S As String";
_s = "";
 //BA.debugLineNum = 922;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 923;BA.debugLine="S=\"CLEARHORARIO\" & ValoresComunes.Password";
_s = "CLEARHORARIO"+_valorescomunes._password;
 }else {
 //BA.debugLineNum = 925;BA.debugLine="S=\"CLEARHORARIO\"";
_s = "CLEARHORARIO";
 };
 //BA.debugLineNum = 927;BA.debugLine="ContTim=-1500";
_conttim = (int) (-1500);
 //BA.debugLineNum = 928;BA.debugLine="Dim DATA() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 929;BA.debugLine="DATA= S.GetBytes (\"UTF8\")";
_data = _s.getBytes("UTF8");
 //BA.debugLineNum = 930;BA.debugLine="SendTrama(DATA)";
_sendtrama(_data);
 };
 //BA.debugLineNum = 934;BA.debugLine="End Sub";
return "";
}
public static String  _mnudeletespecial_action() throws Exception{
int _rsp = 0;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _msg = null;
String _s = "";
byte[] _data = null;
 //BA.debugLineNum = 898;BA.debugLine="Sub mnuDeleteSpecial_Action";
 //BA.debugLineNum = 899;BA.debugLine="Dim Rsp As Int";
_rsp = 0;
 //BA.debugLineNum = 900;BA.debugLine="Dim Msg As Msgboxes";
_msg = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 901;BA.debugLine="Rsp=Msg.Show2 (\"Really remove Special Days?\",\"SECURITY QUESTION\",\"Yes\",\"No\",\"\")";
_rsp = _msg.Show2("Really remove Special Days?","SECURITY QUESTION","Yes","No","");
 //BA.debugLineNum = 902;BA.debugLine="If Rsp=  -1 Then";
if (_rsp==-1) { 
 //BA.debugLineNum = 903;BA.debugLine="Dim S As String";
_s = "";
 //BA.debugLineNum = 904;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 905;BA.debugLine="S=\"CLEARESPCDAY\" & ValoresComunes.Password";
_s = "CLEARESPCDAY"+_valorescomunes._password;
 }else {
 //BA.debugLineNum = 907;BA.debugLine="S=\"CLEARESPCDAY\"";
_s = "CLEARESPCDAY";
 };
 //BA.debugLineNum = 910;BA.debugLine="Dim DATA() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 911;BA.debugLine="DATA= S.GetBytes (\"UTF8\")";
_data = _s.getBytes("UTF8");
 //BA.debugLineNum = 912;BA.debugLine="SendTrama(DATA)";
_sendtrama(_data);
 };
 //BA.debugLineNum = 915;BA.debugLine="End Sub";
return "";
}
public static String  _mnueditcomandos_action() throws Exception{
ExControl.Domotica.frmconfigcomandos _frmcom = null;
 //BA.debugLineNum = 1123;BA.debugLine="Sub mnuEditComandos_Action";
 //BA.debugLineNum = 1124;BA.debugLine="Dim FrmCom As   FrmConfigComandos";
_frmcom = new ExControl.Domotica.frmconfigcomandos();
 //BA.debugLineNum = 1125;BA.debugLine="FrmCom.Initialize( MainForm)";
_frmcom._initialize(ba,_mainform);
 //BA.debugLineNum = 1126;BA.debugLine="FrmCom.Show";
_frmcom._show();
 //BA.debugLineNum = 1127;BA.debugLine="End Sub";
return "";
}
public static String  _mnueditcondcionado_action() throws Exception{
ExControl.Domotica.frmeditcondicionado _frmcon = null;
 //BA.debugLineNum = 1134;BA.debugLine="Sub mnuEditCondcionado_Action";
 //BA.debugLineNum = 1135;BA.debugLine="Dim FrmCon As   FrmEditCondicionado";
_frmcon = new ExControl.Domotica.frmeditcondicionado();
 //BA.debugLineNum = 1136;BA.debugLine="FrmCon.Initialize( MainForm)";
_frmcon._initialize(ba,_mainform);
 //BA.debugLineNum = 1137;BA.debugLine="FrmCon.Show";
_frmcon._show();
 //BA.debugLineNum = 1138;BA.debugLine="End Sub";
return "";
}
public static String  _mnuenabledtime_action() throws Exception{
ExControl.Domotica.frmenabledtime _frmenabled = null;
 //BA.debugLineNum = 844;BA.debugLine="Sub mnuEnabledTime_Action";
 //BA.debugLineNum = 845;BA.debugLine="Dim FrmEnabled As FrmEnabledTime";
_frmenabled = new ExControl.Domotica.frmenabledtime();
 //BA.debugLineNum = 846;BA.debugLine="FrmEnabled.Initialize( MainForm)";
_frmenabled._initialize(ba,_mainform);
 //BA.debugLineNum = 847;BA.debugLine="FrmEnabled.Show";
_frmenabled._show();
 //BA.debugLineNum = 850;BA.debugLine="End Sub";
return "";
}
public static String  _mnugrafico_action() throws Exception{
ExControl.Domotica.frmmonitor _frmg = null;
 //BA.debugLineNum = 1174;BA.debugLine="Sub mnuGrafico_Action";
 //BA.debugLineNum = 1175;BA.debugLine="Dim frmG As FrmMonitor";
_frmg = new ExControl.Domotica.frmmonitor();
 //BA.debugLineNum = 1176;BA.debugLine="frmG.Initialize (MainForm)";
_frmg._initialize(ba,_mainform);
 //BA.debugLineNum = 1177;BA.debugLine="End Sub";
return "";
}
public static String  _mnuhistorico_action() throws Exception{
ExControl.Domotica.datedialo _dialog = null;
int _resp = 0;
ExControl.Domotica.frmselectvar _frmvar = null;
ExControl.Domotica.frmhistorico _frmh = null;
ExControl.Domotica.frmhistorico _frmg = null;
 //BA.debugLineNum = 1181;BA.debugLine="Sub mnuHistorico_Action";
 //BA.debugLineNum = 1183;BA.debugLine="Dim Dialog As  DateDialo";
_dialog = new ExControl.Domotica.datedialo();
 //BA.debugLineNum = 1184;BA.debugLine="Dialog.Initialize(MainForm )";
_dialog._initialize(ba,_mainform);
 //BA.debugLineNum = 1187;BA.debugLine="Dim Resp As Int";
_resp = 0;
 //BA.debugLineNum = 1188;BA.debugLine="Resp= Dialog.Show ( )";
_resp = _dialog._show();
 //BA.debugLineNum = 1189;BA.debugLine="If Resp = 1 Then";
if (_resp==1) { 
 //BA.debugLineNum = 1190;BA.debugLine="Dim FrmVar As FrmSelectVar";
_frmvar = new ExControl.Domotica.frmselectvar();
 //BA.debugLineNum = 1191;BA.debugLine="FrmVar.Initialize (MainForm)";
_frmvar._initialize(ba,_mainform);
 //BA.debugLineNum = 1192;BA.debugLine="Resp= FrmVar.Show ( )";
_resp = _frmvar._show();
 //BA.debugLineNum = 1193;BA.debugLine="If Resp=1 Then";
if (_resp==1) { 
 //BA.debugLineNum = 1194;BA.debugLine="Dim frmH As FrmHistorico";
_frmh = new ExControl.Domotica.frmhistorico();
 //BA.debugLineNum = 1196;BA.debugLine="Dim frmG As FrmHistorico";
_frmg = new ExControl.Domotica.frmhistorico();
 //BA.debugLineNum = 1197;BA.debugLine="frmG.Initialize (MainForm,DateTime.GetYear (Dialog.DateTicks ),DateTime.GetMonth  (Dialog.DateTicks ),DateTime.GetDayOfMonth  (Dialog.DateTicks  ),FrmVar.Variables)";
_frmg._initialize(ba,_mainform,anywheresoftware.b4a.keywords.Common.DateTime.GetYear(_dialog._dateticks),anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(_dialog._dateticks),anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(_dialog._dateticks),_frmvar._variables);
 };
 };
 //BA.debugLineNum = 1208;BA.debugLine="End Sub";
return "";
}
public static String  _mnunamescene_action() throws Exception{
ExControl.Domotica.frmnamescene _frmsc = null;
 //BA.debugLineNum = 1118;BA.debugLine="Sub MnuNameScene_Action";
 //BA.debugLineNum = 1119;BA.debugLine="Dim FrmSc As   FrmNameScene";
_frmsc = new ExControl.Domotica.frmnamescene();
 //BA.debugLineNum = 1120;BA.debugLine="FrmSc.Initialize( MainForm)";
_frmsc._initialize(ba,_mainform);
 //BA.debugLineNum = 1121;BA.debugLine="FrmSc.Show";
_frmsc._show();
 //BA.debugLineNum = 1122;BA.debugLine="End Sub";
return "";
}
public static String  _mnunewcentral_action() throws Exception{
 //BA.debugLineNum = 935;BA.debugLine="Sub MnuNewCentral_Action";
 //BA.debugLineNum = 936;BA.debugLine="NewCentral";
_newcentral();
 //BA.debugLineNum = 937;BA.debugLine="End Sub";
return "";
}
public static String  _mnurecoverbackup_action() throws Exception{
anywheresoftware.b4j.objects.FileChooserWrapper _fc = null;
String _thisfile = "";
flm.b4a.archiver.ArchiverForB4A _myzip = null;
 //BA.debugLineNum = 741;BA.debugLine="Sub mnuRecoverbackup_Action";
 //BA.debugLineNum = 742;BA.debugLine="Dim fc As FileChooser";
_fc = new anywheresoftware.b4j.objects.FileChooserWrapper();
 //BA.debugLineNum = 743;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 744;BA.debugLine="fc.Title=\"Choose backup\"";
_fc.setTitle("Choose backup");
 //BA.debugLineNum = 746;BA.debugLine="fc.SetExtensionFilter(\"backup Copy\" ,Array As String(\"*.piz\"))";
_fc.SetExtensionFilter("backup Copy",anywheresoftware.b4a.keywords.Common.ArrayToList(new String[]{"*.piz"}));
 //BA.debugLineNum = 747;BA.debugLine="Dim thisFile As String";
_thisfile = "";
 //BA.debugLineNum = 748;BA.debugLine="thisFile=fc.ShowOpen(MainForm)";
_thisfile = _fc.ShowOpen(_mainform);
 //BA.debugLineNum = 749;BA.debugLine="If thisFile <> \"\" Then";
if ((_thisfile).equals("") == false) { 
 //BA.debugLineNum = 750;BA.debugLine="Dim myZip As  Archiver";
_myzip = new flm.b4a.archiver.ArchiverForB4A();
 //BA.debugLineNum = 753;BA.debugLine="myZip.UnZip (File.GetFileParent(thisFile),File.GetName(thisFile),File.DirApp,\"\" )";
_myzip.UnZip(ba,anywheresoftware.b4a.keywords.Common.File.GetFileParent(_thisfile),anywheresoftware.b4a.keywords.Common.File.GetName(_thisfile),anywheresoftware.b4a.keywords.Common.File.getDirApp(),"");
 //BA.debugLineNum = 755;BA.debugLine="ValoresComunes.CargaCentrales";
_valorescomunes._cargacentrales();
 //BA.debugLineNum = 756;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 758;BA.debugLine="ValoresComunes.CargaCircuitos";
_valorescomunes._cargacircuitos();
 //BA.debugLineNum = 759;BA.debugLine="ValoresComunes.CargaScenes";
_valorescomunes._cargascenes();
 //BA.debugLineNum = 761;BA.debugLine="ValoresComunes.CargaComandos";
_valorescomunes._cargacomandos();
 //BA.debugLineNum = 762;BA.debugLine="ValoresComunes.CargaComandosComunes";
_valorescomunes._cargacomandoscomunes();
 //BA.debugLineNum = 763;BA.debugLine="ValoresComunes.CargaCondicionados";
_valorescomunes._cargacondicionados();
 //BA.debugLineNum = 764;BA.debugLine="ValoresComunes.CargaConexionExterna";
_valorescomunes._cargaconexionexterna();
 //BA.debugLineNum = 765;BA.debugLine="ValoresComunes.CargaNombreSensores";
_valorescomunes._carganombresensores();
 //BA.debugLineNum = 767;BA.debugLine="LecturaDatos";
_lecturadatos();
 };
 //BA.debugLineNum = 769;BA.debugLine="End Sub";
return "";
}
public static String  _mnusensor_action() throws Exception{
ExControl.Domotica.frmeditsensores _frmsens = null;
 //BA.debugLineNum = 1008;BA.debugLine="Sub mnuSensor_Action";
 //BA.debugLineNum = 1009;BA.debugLine="Dim FrmSens As   FrmEditSensores";
_frmsens = new ExControl.Domotica.frmeditsensores();
 //BA.debugLineNum = 1010;BA.debugLine="FrmSens.Initialize( MainForm)";
_frmsens._initialize(ba,_mainform);
 //BA.debugLineNum = 1011;BA.debugLine="FrmSens.Show";
_frmsens._show();
 //BA.debugLineNum = 1012;BA.debugLine="End Sub";
return "";
}
public static String  _mnusensores_action() throws Exception{
 //BA.debugLineNum = 1178;BA.debugLine="Sub mnuSensores_Action";
 //BA.debugLineNum = 1179;BA.debugLine="FrmSensor.Show";
_frmsensor._show();
 //BA.debugLineNum = 1180;BA.debugLine="End Sub";
return "";
}
public static String  _mnusethour_action() throws Exception{
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 1065;BA.debugLine="Sub mnuSetHour_Action";
 //BA.debugLineNum = 1066;BA.debugLine="NumeroCentralControlada = ValoresComunes.NumeroCental";
_numerocentralcontrolada = _valorescomunes._numerocental;
 //BA.debugLineNum = 1067;BA.debugLine="ValoresComunes.NumeroCental =1";
_valorescomunes._numerocental = (int) (1);
 //BA.debugLineNum = 1068;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 1069;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 1070;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 1071;BA.debugLine="LongTrama= 20";
_longtrama = (int) (20);
 }else {
 //BA.debugLineNum = 1073;BA.debugLine="LongTrama= 12";
_longtrama = (int) (12);
 };
 //BA.debugLineNum = 1075;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 1076;BA.debugLine="data(0)=83";
_data[(int) (0)] = (byte) (83);
 //BA.debugLineNum = 1077;BA.debugLine="data(1)=69";
_data[(int) (1)] = (byte) (69);
 //BA.debugLineNum = 1078;BA.debugLine="data(2)=84";
_data[(int) (2)] = (byte) (84);
 //BA.debugLineNum = 1079;BA.debugLine="data(3)=70";
_data[(int) (3)] = (byte) (70);
 //BA.debugLineNum = 1080;BA.debugLine="data(4)=72";
_data[(int) (4)] = (byte) (72);
 //BA.debugLineNum = 1082;BA.debugLine="data(5)= DateTime.GetSecond (DateTime.Now )";
_data[(int) (5)] = (byte) (anywheresoftware.b4a.keywords.Common.DateTime.GetSecond(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 //BA.debugLineNum = 1083;BA.debugLine="data(6)= DateTime.GetMinute  (DateTime.Now )";
_data[(int) (6)] = (byte) (anywheresoftware.b4a.keywords.Common.DateTime.GetMinute(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 //BA.debugLineNum = 1084;BA.debugLine="data(7)=DateTime.GetHour   (DateTime.Now )";
_data[(int) (7)] = (byte) (anywheresoftware.b4a.keywords.Common.DateTime.GetHour(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 //BA.debugLineNum = 1085;BA.debugLine="data(8)= DateTime.GetDayOfWeek (DateTime.now)-1";
_data[(int) (8)] = (byte) (anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfWeek(anywheresoftware.b4a.keywords.Common.DateTime.getNow())-1);
 //BA.debugLineNum = 1086;BA.debugLine="If data(8)=0 Then data(8)=7";
if (_data[(int) (8)]==0) { 
_data[(int) (8)] = (byte) (7);};
 //BA.debugLineNum = 1087;BA.debugLine="data(9)=DateTime.GetDayOfMonth (DateTime.Now )";
_data[(int) (9)] = (byte) (anywheresoftware.b4a.keywords.Common.DateTime.GetDayOfMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 //BA.debugLineNum = 1088;BA.debugLine="data(10)=DateTime.GetMonth (DateTime.Now )";
_data[(int) (10)] = (byte) (anywheresoftware.b4a.keywords.Common.DateTime.GetMonth(anywheresoftware.b4a.keywords.Common.DateTime.getNow()));
 //BA.debugLineNum = 1089;BA.debugLine="data(11)=DateTime.GetYear  (DateTime.Now )-2000";
_data[(int) (11)] = (byte) (anywheresoftware.b4a.keywords.Common.DateTime.GetYear(anywheresoftware.b4a.keywords.Common.DateTime.getNow())-2000);
 //BA.debugLineNum = 1090;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 1091;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 1092;BA.debugLine="End Sub";
return "";
}
public static String  _mnusettingcentral_action() throws Exception{
int _result = 0;
ExControl.Domotica.frmsetcentral _frmcentral = null;
 //BA.debugLineNum = 938;BA.debugLine="Sub mnuSettingCentral_Action";
 //BA.debugLineNum = 939;BA.debugLine="Dim Result As Int";
_result = 0;
 //BA.debugLineNum = 940;BA.debugLine="Dim FrmCentral As FrmSetCentral";
_frmcentral = new ExControl.Domotica.frmsetcentral();
 //BA.debugLineNum = 941;BA.debugLine="FrmCentral.Initialize (MainForm)";
_frmcentral._initialize(ba,_mainform);
 //BA.debugLineNum = 943;BA.debugLine="FrmCentral.Nombre = ValoresComunes.Centrales .Get (ValoresComunes.NumeroCental -1)";
_frmcentral._nombre = BA.ObjectToString(_valorescomunes._centrales.Get((int) (_valorescomunes._numerocental-1)));
 //BA.debugLineNum = 944;BA.debugLine="FrmCentral.Ip = ValoresComunes.IpIn";
_frmcentral._ip = _valorescomunes._ipin;
 //BA.debugLineNum = 945;BA.debugLine="FrmCentral.PortIn =  ValoresComunes.PuertoIn";
_frmcentral._portin = _valorescomunes._puertoin;
 //BA.debugLineNum = 946;BA.debugLine="FrmCentral.PortOut  =  ValoresComunes.PuertoOut";
_frmcentral._portout = _valorescomunes._puertoout;
 //BA.debugLineNum = 948;BA.debugLine="Result = FrmCentral.Show";
_result = _frmcentral._show();
 //BA.debugLineNum = 950;BA.debugLine="If Result = 1 Then";
if (_result==1) { 
 //BA.debugLineNum = 951;BA.debugLine="ValoresComunes.Centrales .set (ValoresComunes.NumeroCental -1,FrmCentral.Nombre)";
_valorescomunes._centrales.Set((int) (_valorescomunes._numerocental-1),(Object)(_frmcentral._nombre));
 //BA.debugLineNum = 952;BA.debugLine="ValoresComunes.IpIn = FrmCentral.Ip";
_valorescomunes._ipin = _frmcentral._ip;
 //BA.debugLineNum = 953;BA.debugLine="ValoresComunes.IpOut =FrmCentral.Ip";
_valorescomunes._ipout = _frmcentral._ip;
 //BA.debugLineNum = 954;BA.debugLine="ValoresComunes.PuertoIn  =FrmCentral.PortIn";
_valorescomunes._puertoin = _frmcentral._portin;
 //BA.debugLineNum = 955;BA.debugLine="ValoresComunes.PuertoOut = FrmCentral.PortOut";
_valorescomunes._puertoout = _frmcentral._portout;
 //BA.debugLineNum = 957;BA.debugLine="ValoresComunes.GuardaDatosConexion";
_valorescomunes._guardadatosconexion();
 //BA.debugLineNum = 958;BA.debugLine="ValoresComunes.GuardarCentrales";
_valorescomunes._guardarcentrales();
 //BA.debugLineNum = 960;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 };
 //BA.debugLineNum = 962;BA.debugLine="End Sub";
return "";
}
public static String  _mnusettingscene_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _escenaselect = 0;
int _r = 0;
ExControl.Domotica.valorescomunes._scene _s = null;
ExControl.Domotica.frmlista _frm = null;
ExControl.Domotica.frmeditscene _frm2 = null;
 //BA.debugLineNum = 1093;BA.debugLine="Sub MnuSettingScene_Action";
 //BA.debugLineNum = 1094;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1095;BA.debugLine="Dim EscenaSelect As Int";
_escenaselect = 0;
 //BA.debugLineNum = 1096;BA.debugLine="EscenaSelect=-1";
_escenaselect = (int) (-1);
 //BA.debugLineNum = 1097;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1098;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 1100;BA.debugLine="For  r =0 To 9";
{
final int step816 = 1;
final int limit816 = (int) (9);
for (_r = (int) (0); (step816 > 0 && _r <= limit816) || (step816 < 0 && _r >= limit816); _r = ((int)(0 + _r + step816))) {
 //BA.debugLineNum = 1101;BA.debugLine="Dim s As Scene";
_s = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 1102;BA.debugLine="s = ValoresComunes.Scenes(r)";
_s = _valorescomunes._scenes[_r];
 //BA.debugLineNum = 1103;BA.debugLine="Lst.Add (s.Nombre )";
_lst.Add((Object)(_s.Nombre));
 }
};
 //BA.debugLineNum = 1106;BA.debugLine="Dim Frm As FrmLista";
_frm = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 1107;BA.debugLine="Frm.Initialize(MainForm,Lst,  -1)";
_frm._initialize(ba,_mainform,_lst,(int) (-1));
 //BA.debugLineNum = 1108;BA.debugLine="EscenaSelect=Frm.Show";
_escenaselect = _frm._show();
 //BA.debugLineNum = 1110;BA.debugLine="If EscenaSelect > -1 Then";
if (_escenaselect>-1) { 
 //BA.debugLineNum = 1111;BA.debugLine="Dim Frm2 As FrmEditScene";
_frm2 = new ExControl.Domotica.frmeditscene();
 //BA.debugLineNum = 1112;BA.debugLine="Frm2.Initialize (MainForm,EscenaSelect)";
_frm2._initialize(ba,_mainform,_escenaselect);
 };
 //BA.debugLineNum = 1117;BA.debugLine="End Sub";
return "";
}
public static String  _mnuspecial1_action() throws Exception{
ExControl.Domotica.frmdiaespecial _frmfechas = null;
 //BA.debugLineNum = 857;BA.debugLine="Sub mnuSpecial1_Action";
 //BA.debugLineNum = 858;BA.debugLine="Dim FrmFechas As FrmDiaEspecial";
_frmfechas = new ExControl.Domotica.frmdiaespecial();
 //BA.debugLineNum = 859;BA.debugLine="FrmFechas.Initialize(MainForm)";
_frmfechas._initialize(ba,_mainform);
 //BA.debugLineNum = 860;BA.debugLine="FrmFechas.TipoEspecial = 1";
_frmfechas._tipoespecial = (int) (1);
 //BA.debugLineNum = 861;BA.debugLine="FrmFechas.Show";
_frmfechas._show();
 //BA.debugLineNum = 862;BA.debugLine="End Sub";
return "";
}
public static String  _mnuspecial2_action() throws Exception{
ExControl.Domotica.frmdiaespecial _frmfechas = null;
 //BA.debugLineNum = 851;BA.debugLine="Sub mnuSpecial2_Action";
 //BA.debugLineNum = 852;BA.debugLine="Dim FrmFechas As FrmDiaEspecial";
_frmfechas = new ExControl.Domotica.frmdiaespecial();
 //BA.debugLineNum = 853;BA.debugLine="FrmFechas.Initialize(MainForm)";
_frmfechas._initialize(ba,_mainform);
 //BA.debugLineNum = 854;BA.debugLine="FrmFechas.TipoEspecial = 2";
_frmfechas._tipoespecial = (int) (2);
 //BA.debugLineNum = 855;BA.debugLine="FrmFechas.Show";
_frmfechas._show();
 //BA.debugLineNum = 856;BA.debugLine="End Sub";
return "";
}
public static String  _mnutimetable_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _result = 0;
ExControl.Domotica.frmlista _frmlist = null;
ExControl.Domotica.frmhorarios _frmhor = null;
 //BA.debugLineNum = 863;BA.debugLine="Sub mnuTimetable_Action";
 //BA.debugLineNum = 864;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 865;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 867;BA.debugLine="Lst.Add (\"Timetable Monday\")";
_lst.Add((Object)("Timetable Monday"));
 //BA.debugLineNum = 868;BA.debugLine="Lst.Add (\"Timetable Tuesday\")";
_lst.Add((Object)("Timetable Tuesday"));
 //BA.debugLineNum = 869;BA.debugLine="Lst.Add (\"Timetable Wednesday\")";
_lst.Add((Object)("Timetable Wednesday"));
 //BA.debugLineNum = 870;BA.debugLine="Lst.Add (\"Timetable Thursday\")";
_lst.Add((Object)("Timetable Thursday"));
 //BA.debugLineNum = 871;BA.debugLine="Lst.Add (\"Timetable Friday\")";
_lst.Add((Object)("Timetable Friday"));
 //BA.debugLineNum = 872;BA.debugLine="Lst.Add (\"Timetable Saturday\")";
_lst.Add((Object)("Timetable Saturday"));
 //BA.debugLineNum = 873;BA.debugLine="Lst.Add (\"Timetable Sunday\")";
_lst.Add((Object)("Timetable Sunday"));
 //BA.debugLineNum = 874;BA.debugLine="Lst.Add (\"Timetable Especial 1\")";
_lst.Add((Object)("Timetable Especial 1"));
 //BA.debugLineNum = 875;BA.debugLine="Lst.Add (\"Timetable Especial 2\")";
_lst.Add((Object)("Timetable Especial 2"));
 //BA.debugLineNum = 876;BA.debugLine="Lst.Add (\"Cancel\")";
_lst.Add((Object)("Cancel"));
 //BA.debugLineNum = 879;BA.debugLine="Dim Result As Int";
_result = 0;
 //BA.debugLineNum = 880;BA.debugLine="Dim frmlist As FrmLista";
_frmlist = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 881;BA.debugLine="frmlist.Initialize(MainForm,Lst, 0 )";
_frmlist._initialize(ba,_mainform,_lst,(int) (0));
 //BA.debugLineNum = 882;BA.debugLine="Result = frmlist.Show";
_result = _frmlist._show();
 //BA.debugLineNum = 883;BA.debugLine="If Result > -1 AND Result < 9 Then";
if (_result>-1 && _result<9) { 
 //BA.debugLineNum = 884;BA.debugLine="Dim FrmHor As FrmHorarios";
_frmhor = new ExControl.Domotica.frmhorarios();
 //BA.debugLineNum = 885;BA.debugLine="FrmHor.Initialize( MainForm)";
_frmhor._initialize(ba,_mainform);
 //BA.debugLineNum = 886;BA.debugLine="FrmHor.TipoDia = Result";
_frmhor._tipodia = (byte) (_result);
 //BA.debugLineNum = 887;BA.debugLine="FrmHor.Show";
_frmhor._show();
 };
 //BA.debugLineNum = 891;BA.debugLine="End Sub";
return "";
}
public static String  _mnutrigger_action() throws Exception{
ExControl.Domotica.frmtrigger _frmtrig = null;
 //BA.debugLineNum = 892;BA.debugLine="Sub mnuTrigger_Action";
 //BA.debugLineNum = 894;BA.debugLine="Dim FrmTrig As  FrmTrigger";
_frmtrig = new ExControl.Domotica.frmtrigger();
 //BA.debugLineNum = 895;BA.debugLine="FrmTrig.Initialize( MainForm)";
_frmtrig._initialize(ba,_mainform);
 //BA.debugLineNum = 896;BA.debugLine="FrmTrig.Show";
_frmtrig._show();
 //BA.debugLineNum = 897;BA.debugLine="End Sub";
return "";
}
public static String  _mnuver100_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1028;BA.debugLine="Sub mnuVer100_Action";
 //BA.debugLineNum = 1029;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1030;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1031;BA.debugLine="lst.Add (3)";
_lst.Add((Object)(3));
 //BA.debugLineNum = 1032;BA.debugLine="File.WriteList(File.DirApp  ,\"AppConfig\" ,lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"AppConfig",_lst);
 //BA.debugLineNum = 1033;BA.debugLine="ValoresComunes.CargaImagenes";
_valorescomunes._cargaimagenes();
 //BA.debugLineNum = 1034;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 1035;BA.debugLine="End Sub";
return "";
}
public static String  _mnuver50_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1044;BA.debugLine="Sub mnuVer50_Action";
 //BA.debugLineNum = 1045;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1046;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1047;BA.debugLine="lst.Add (1)";
_lst.Add((Object)(1));
 //BA.debugLineNum = 1048;BA.debugLine="File.WriteList(File.DirApp  ,\"AppConfig\" ,lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"AppConfig",_lst);
 //BA.debugLineNum = 1049;BA.debugLine="ValoresComunes.CargaImagenes";
_valorescomunes._cargaimagenes();
 //BA.debugLineNum = 1050;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 1051;BA.debugLine="End Sub";
return "";
}
public static String  _mnuver75_action() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 1036;BA.debugLine="Sub mnuVer75_Action";
 //BA.debugLineNum = 1037;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1038;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1039;BA.debugLine="lst.Add (2)";
_lst.Add((Object)(2));
 //BA.debugLineNum = 1040;BA.debugLine="File.WriteList(File.DirApp  ,\"AppConfig\" ,lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"AppConfig",_lst);
 //BA.debugLineNum = 1041;BA.debugLine="ValoresComunes.CargaImagenes";
_valorescomunes._cargaimagenes();
 //BA.debugLineNum = 1042;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 1043;BA.debugLine="End Sub";
return "";
}
public static String  _mnuverhora_action() throws Exception{
byte[] _data = null;
String _trama = "";
 //BA.debugLineNum = 1053;BA.debugLine="Sub mnuVerHora_Action";
 //BA.debugLineNum = 1054;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
 //BA.debugLineNum = 1055;BA.debugLine="Dim Trama As String";
_trama = "";
 //BA.debugLineNum = 1056;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 1057;BA.debugLine="Trama = \"ESTADOINST\" & ValoresComunes.Password";
_trama = "ESTADOINST"+_valorescomunes._password;
 }else {
 //BA.debugLineNum = 1059;BA.debugLine="Trama = \"ESTADOINST\"";
_trama = "ESTADOINST";
 };
 //BA.debugLineNum = 1062;BA.debugLine="data = Trama.GetBytes(\"UTF8\")";
_data = _trama.getBytes("UTF8");
 //BA.debugLineNum = 1063;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 1064;BA.debugLine="End Sub";
return "";
}
public static boolean  _newcentral() throws Exception{
int _result = 0;
ExControl.Domotica.frmsetcentral _frmcentral = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 968;BA.debugLine="Sub NewCentral() As Boolean";
 //BA.debugLineNum = 969;BA.debugLine="Dim Result As Int";
_result = 0;
 //BA.debugLineNum = 970;BA.debugLine="Dim FrmCentral As FrmSetCentral";
_frmcentral = new ExControl.Domotica.frmsetcentral();
 //BA.debugLineNum = 971;BA.debugLine="FrmCentral.Initialize (MainForm)";
_frmcentral._initialize(ba,_mainform);
 //BA.debugLineNum = 973;BA.debugLine="FrmCentral.Nombre = \"Central \" & ( ValoresComunes.Centrales .Size +1)";
_frmcentral._nombre = "Central "+BA.NumberToString((_valorescomunes._centrales.getSize()+1));
 //BA.debugLineNum = 974;BA.debugLine="FrmCentral.Ip = \"192.168.1.\" & ( ValoresComunes.Centrales .Size +200)";
_frmcentral._ip = "192.168.1."+BA.NumberToString((_valorescomunes._centrales.getSize()+200));
 //BA.debugLineNum = 975;BA.debugLine="FrmCentral.PortIn =  ValoresComunes.Centrales .Size + 5000";
_frmcentral._portin = (int) (_valorescomunes._centrales.getSize()+5000);
 //BA.debugLineNum = 976;BA.debugLine="FrmCentral.PortOut  =  FrmCentral.PortIn";
_frmcentral._portout = _frmcentral._portin;
 //BA.debugLineNum = 978;BA.debugLine="Result = FrmCentral.Show";
_result = _frmcentral._show();
 //BA.debugLineNum = 980;BA.debugLine="If Result = 1 Then";
if (_result==1) { 
 //BA.debugLineNum = 981;BA.debugLine="ValoresComunes.Centrales .Add (FrmCentral.Nombre)";
_valorescomunes._centrales.Add((Object)(_frmcentral._nombre));
 //BA.debugLineNum = 982;BA.debugLine="ValoresComunes.NumeroCental = ValoresComunes.Centrales .Size";
_valorescomunes._numerocental = _valorescomunes._centrales.getSize();
 //BA.debugLineNum = 985;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 986;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 987;BA.debugLine="Lst.Add (FrmCentral.Ip) 	'Lst.Add (\"192.168.2.200\")";
_lst.Add((Object)(_frmcentral._ip));
 //BA.debugLineNum = 988;BA.debugLine="Lst.Add (FrmCentral.Ip)";
_lst.Add((Object)(_frmcentral._ip));
 //BA.debugLineNum = 989;BA.debugLine="Lst.Add (FrmCentral.PortIn) 	'Lst.Add (5000)";
_lst.Add((Object)(_frmcentral._portin));
 //BA.debugLineNum = 990;BA.debugLine="Lst.Add (FrmCentral.PortOut)";
_lst.Add((Object)(_frmcentral._portout));
 //BA.debugLineNum = 992;BA.debugLine="File.WriteList(File.DirApp  ,\"Conexion\" & ValoresComunes.NumeroCental ,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Conexion"+BA.NumberToString(_valorescomunes._numerocental),_lst);
 //BA.debugLineNum = 1000;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 1001;BA.debugLine="ValoresComunes.GuardarCentrales";
_valorescomunes._guardarcentrales();
 //BA.debugLineNum = 1002;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 1004;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 1007;BA.debugLine="End Sub";
return false;
}

private static boolean processGlobalsRun;
public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main._process_globals();
valorescomunes._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 8;BA.debugLine="Private MainForm As Form";
_mainform = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Dim FrmSelecScene As FrmSelectEscena";
_frmselecscene = new ExControl.Domotica.frmselectescena();
 //BA.debugLineNum = 10;BA.debugLine="Dim FrmCondicionado As FrmCondicionados";
_frmcondicionado = new ExControl.Domotica.frmcondicionados();
 //BA.debugLineNum = 11;BA.debugLine="Dim FrmSensor As FrmSensores";
_frmsensor = new ExControl.Domotica.frmsensores();
 //BA.debugLineNum = 14;BA.debugLine="Dim BcBar As JFXtrasBreadcrumbBar";
_bcbar = new anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 16;BA.debugLine="Private mnuBar As MenuBar";
_mnubar = new anywheresoftware.b4j.objects.MenuItemWrapper.MenuBarWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 19;BA.debugLine="Private ImageViews As List";
_imageviews = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 20;BA.debugLine="Dim Value As List";
_value = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 21;BA.debugLine="Dim Label1, Label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 24;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 25;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 27;BA.debugLine="Dim Valores(60) As Int";
_valores = new int[(int) (60)];
;
 //BA.debugLineNum = 28;BA.debugLine="Dim UltimaTrama() As Byte";
_ultimatrama = new byte[(int) (0)];
;
 //BA.debugLineNum = 29;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 30;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 32;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 34;BA.debugLine="Private mnuCreatebackup As MenuItem";
_mnucreatebackup = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Private mnuRecoverbackup As MenuItem";
_mnurecoverbackup = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 37;BA.debugLine="Private mnuClose As MenuItem";
_mnuclose = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 38;BA.debugLine="Private mnuTrigger As MenuItem";
_mnutrigger = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 39;BA.debugLine="Private mnuTimetable As MenuItem";
_mnutimetable = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Private mnuSpecial1 As MenuItem";
_mnuspecial1 = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 41;BA.debugLine="Private mnuSpecial2 As MenuItem";
_mnuspecial2 = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Private mnuEnabledTime As MenuItem";
_mnuenabledtime = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 43;BA.debugLine="Private mnuDeleteHorarios As MenuItem";
_mnudeletehorarios = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 44;BA.debugLine="Private mnuDeleteSpecial As MenuItem";
_mnudeletespecial = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 45;BA.debugLine="Private mnuSettingCentral As MenuItem";
_mnusettingcentral = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 46;BA.debugLine="Private MnuNewCentral As MenuItem";
_mnunewcentral = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 47;BA.debugLine="Private mnuSensor As MenuItem";
_mnusensor = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 48;BA.debugLine="Private mnuVer50 As MenuItem";
_mnuver50 = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 49;BA.debugLine="Private mnuVer75 As MenuItem";
_mnuver75 = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 50;BA.debugLine="Private mnuVer100 As MenuItem";
_mnuver100 = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 51;BA.debugLine="Private mnuVerHora As MenuItem";
_mnuverhora = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 54;BA.debugLine="Dim NumeroCentralControlada As Int";
_numerocentralcontrolada = 0;
 //BA.debugLineNum = 55;BA.debugLine="Private mnuSetHour As MenuItem";
_mnusethour = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 56;BA.debugLine="Private MnuNameScene As MenuItem";
_mnunamescene = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 57;BA.debugLine="Private MnuSettingScene As MenuItem";
_mnusettingscene = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 58;BA.debugLine="Private mnuEditComandos As MenuItem";
_mnueditcomandos = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 59;BA.debugLine="Private mnuConfigComandosComunes As MenuItem";
_mnuconfigcomandoscomunes = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 60;BA.debugLine="Private mnuEditCondcionado As MenuItem";
_mnueditcondcionado = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 61;BA.debugLine="Private mnuAbout As MenuItem";
_mnuabout = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 62;BA.debugLine="Private mnuCircuito As MenuItem";
_mnucircuito = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 63;BA.debugLine="Private mnuGrafico As MenuItem";
_mnugrafico = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 64;BA.debugLine="Private mnuSensores As MenuItem";
_mnusensores = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 65;BA.debugLine="Private mnuHistorico As MenuItem";
_mnuhistorico = new anywheresoftware.b4j.objects.MenuItemWrapper.ConcreteMenuItemWrapper();
 //BA.debugLineNum = 66;BA.debugLine="End Sub";
return "";
}
public static boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 439;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 440;BA.debugLine="Try";
try { //BA.debugLineNum = 441;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 443;BA.debugLine="Packet.Initialize(data ,  ValoresComunes.ip,  ValoresComunes.Puerto )";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 444;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 445;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 } 
       catch (Exception e302) {
			ba.setLastException(e302); //BA.debugLineNum = 447;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return false;
}
public static String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 394;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 395;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 396;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 398;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(anywheresoftware.b4a.keywords.Common.True);
 //BA.debugLineNum = 400;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 401;BA.debugLine="UltimaTrama=data";
_ultimatrama = _data;
 //BA.debugLineNum = 402;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 404;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==anywheresoftware.b4a.keywords.Common.False && _reintento<40) {
 //BA.debugLineNum = 405;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 407;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 408;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 410;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 411;BA.debugLine="Resultado = True";
_resultado = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 413;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 414;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 418;BA.debugLine="If Resultado = True Then";
if (_resultado==anywheresoftware.b4a.keywords.Common.True) { 
 //BA.debugLineNum = 419;BA.debugLine="Resultado =False";
_resultado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 420;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 421;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==anywheresoftware.b4a.keywords.Common.False && _reintento<40) {
 //BA.debugLineNum = 422;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 423;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 424;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==anywheresoftware.b4a.keywords.Common.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 429;BA.debugLine="If Resultado = False  Then";
if (_resultado==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 432;BA.debugLine="ValoresComunes.Delay (1000)";
_valorescomunes._delay((long) (1000));
 };
 //BA.debugLineNum = 435;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = anywheresoftware.b4a.keywords.Common.True;
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public static String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 604;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 605;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 606;BA.debugLine="If PgIndicator.Visible = False Then";
if (_pgindicator.getVisible()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 607;BA.debugLine="If ContTim >50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 608;BA.debugLine="LecturaDatos";
_lecturadatos();
 };
 }else {
 //BA.debugLineNum = 611;BA.debugLine="If  ContTim > 20 Then";
if (_conttim>20) { 
 //BA.debugLineNum = 612;BA.debugLine="If PaqueteEnviado=True Then SendTrama(UltimaTrama)";
if (_paqueteenviado==anywheresoftware.b4a.keywords.Common.True) { 
_sendtrama(_ultimatrama);};
 };
 };
 //BA.debugLineNum = 615;BA.debugLine="End Sub";
return "";
}
public static String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
int _c = 0;
String _txt = "";
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _m = null;
 //BA.debugLineNum = 483;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 484;BA.debugLine="Try";
try { //BA.debugLineNum = 485;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 486;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = anywheresoftware.b4a.keywords.Common.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 487;BA.debugLine="If msg.Contains (\"VVAL\") Then		'Solo refresco, sin cambios";
if (_msg.contains("VVAL")) { 
 //BA.debugLineNum = 489;BA.debugLine="Dim  C As Int";
_c = 0;
 //BA.debugLineNum = 490;BA.debugLine="For C = 4 To Packet.Length -1";
{
final int step333 = 1;
final int limit333 = (int) (_packet.getLength()-1);
for (_c = (int) (4); (step333 > 0 && _c <= limit333) || (step333 < 0 && _c >= limit333); _c = ((int)(0 + _c + step333))) {
 //BA.debugLineNum = 491;BA.debugLine="Valores(C - 4)= Packet.Data (C)-1";
_valores[(int) (_c-4)] = (int) (_packet.getData()[_c]-1);
 //BA.debugLineNum = 492;BA.debugLine="If Valores(C-4) < 0 Then";
if (_valores[(int) (_c-4)]<0) { 
 //BA.debugLineNum = 493;BA.debugLine="Valores(C-4)=Valores(C-4) +256";
_valores[(int) (_c-4)] = (int) (_valores[(int) (_c-4)]+256);
 };
 }
};
 //BA.debugLineNum = 496;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 499;BA.debugLine="If UltimaTrama(0)<> 86 OR UltimaTrama(1)<>65 OR UltimaTrama(2)<>67 OR UltimaTrama(3)<>84 Then";
if (_ultimatrama[(int) (0)]!=86 || _ultimatrama[(int) (1)]!=65 || _ultimatrama[(int) (2)]!=67 || _ultimatrama[(int) (3)]!=84) { 
 //BA.debugLineNum = 500;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 501;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 504;BA.debugLine="If msg.Contains (\"EVAL\") Then";
if (_msg.contains("EVAL")) { 
 //BA.debugLineNum = 506;BA.debugLine="Dim  C As Int";
_c = 0;
 //BA.debugLineNum = 507;BA.debugLine="For C = 4 To Packet.Length -1";
{
final int step347 = 1;
final int limit347 = (int) (_packet.getLength()-1);
for (_c = (int) (4); (step347 > 0 && _c <= limit347) || (step347 < 0 && _c >= limit347); _c = ((int)(0 + _c + step347))) {
 //BA.debugLineNum = 508;BA.debugLine="Valores(C - 4)= Packet.Data (C)-1";
_valores[(int) (_c-4)] = (int) (_packet.getData()[_c]-1);
 //BA.debugLineNum = 509;BA.debugLine="If Valores(C-4) < 0 Then";
if (_valores[(int) (_c-4)]<0) { 
 //BA.debugLineNum = 510;BA.debugLine="Valores(C-4)=Valores(C-4) +256";
_valores[(int) (_c-4)] = (int) (_valores[(int) (_c-4)]+256);
 };
 }
};
 //BA.debugLineNum = 515;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 518;BA.debugLine="If msg.Contains (\"VALC\") Then";
if (_msg.contains("VALC")) { 
 //BA.debugLineNum = 520;BA.debugLine="Dim  C As Int";
_c = 0;
 //BA.debugLineNum = 521;BA.debugLine="For C = 4 To Packet.Length -1";
{
final int step357 = 1;
final int limit357 = (int) (_packet.getLength()-1);
for (_c = (int) (4); (step357 > 0 && _c <= limit357) || (step357 < 0 && _c >= limit357); _c = ((int)(0 + _c + step357))) {
 //BA.debugLineNum = 522;BA.debugLine="ValoresComunes.Circuitos (C-4).rango = Packet.Data (C)-1";
_valorescomunes._circuitos[(int) (_c-4)].Rango = (int) (_packet.getData()[_c]-1);
 }
};
 //BA.debugLineNum = 524;BA.debugLine="ValoresComunes.GuardarConfigCircuitos";
_valorescomunes._guardarconfigcircuitos();
 //BA.debugLineNum = 525;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 526;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 527;BA.debugLine="LecturaDatos";
_lecturadatos();
 //BA.debugLineNum = 528;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 531;BA.debugLine="If msg.Contains (\"ESTACT\") Then";
if (_msg.contains("ESTACT")) { 
 //BA.debugLineNum = 533;BA.debugLine="Dim Txt As String";
_txt = "";
 //BA.debugLineNum = 534;BA.debugLine="Select Packet.Data (6)";
switch (BA.switchObjectToInt(_packet.getData()[(int) (6)],(byte) (2),(byte) (3),(byte) (4),(byte) (5),(byte) (6),(byte) (7),(byte) (8),(byte) (9),(byte) (10))) {
case 0:
 //BA.debugLineNum = 536;BA.debugLine="Txt =\"Monday -\"";
_txt = "Monday -";
 break;
case 1:
 //BA.debugLineNum = 538;BA.debugLine="Txt =\"Tuesday -\"";
_txt = "Tuesday -";
 break;
case 2:
 //BA.debugLineNum = 540;BA.debugLine="Txt =\"Wednesday -\"";
_txt = "Wednesday -";
 break;
case 3:
 //BA.debugLineNum = 542;BA.debugLine="Txt =\"Thursday -\"";
_txt = "Thursday -";
 break;
case 4:
 //BA.debugLineNum = 544;BA.debugLine="Txt =\"Friday -\"";
_txt = "Friday -";
 break;
case 5:
 //BA.debugLineNum = 546;BA.debugLine="Txt =\"Saturday -\"";
_txt = "Saturday -";
 break;
case 6:
 //BA.debugLineNum = 548;BA.debugLine="Txt =\"Sunday -\"";
_txt = "Sunday -";
 break;
case 7:
 //BA.debugLineNum = 550;BA.debugLine="Txt =\"Special day 1 -\"";
_txt = "Special day 1 -";
 break;
case 8:
 //BA.debugLineNum = 552;BA.debugLine="Txt =\"Special day 2 -\"";
_txt = "Special day 2 -";
 break;
}
;
 //BA.debugLineNum = 555;BA.debugLine="Txt= Txt & (Packet.Data (7)-1) & \":\" & (Packet.Data (8)-1) & CRLF & (Packet.Data (9)-1)  & \"/\" & (Packet.Data (10)-1) & \"/\" & (Packet.Data (11)-1)";
_txt = _txt+BA.NumberToString((_packet.getData()[(int) (7)]-1))+":"+BA.NumberToString((_packet.getData()[(int) (8)]-1))+anywheresoftware.b4a.keywords.Common.CRLF+BA.NumberToString((_packet.getData()[(int) (9)]-1))+"/"+BA.NumberToString((_packet.getData()[(int) (10)]-1))+"/"+BA.NumberToString((_packet.getData()[(int) (11)]-1));
 //BA.debugLineNum = 556;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 557;BA.debugLine="PgIndicator.Visible =False";
_pgindicator.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 558;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 559;BA.debugLine="m.Show (Txt,\"data time\")";
_m.Show(_txt,"data time");
 //BA.debugLineNum = 560;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 565;BA.debugLine="If msg = \"SETFHOK\" Then";
if ((_msg).equals("SETFHOK")) { 
 //BA.debugLineNum = 566;BA.debugLine="If ValoresComunes.NumeroCental < ValoresComunes.Centrales .Size Then";
if (_valorescomunes._numerocental<_valorescomunes._centrales.getSize()) { 
 //BA.debugLineNum = 567;BA.debugLine="ValoresComunes.NumeroCental = ValoresComunes.NumeroCental + 1";
_valorescomunes._numerocental = (int) (_valorescomunes._numerocental+1);
 //BA.debugLineNum = 568;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 569;BA.debugLine="SendTrama(UltimaTrama)";
_sendtrama(_ultimatrama);
 //BA.debugLineNum = 570;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 572;BA.debugLine="ValoresComunes.NumeroCental = NumeroCentralControlada";
_valorescomunes._numerocental = _numerocentralcontrolada;
 //BA.debugLineNum = 573;BA.debugLine="ValoresComunes.CargaIp";
_valorescomunes._cargaip();
 //BA.debugLineNum = 574;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 575;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 576;BA.debugLine="PgIndicator.Visible =False";
_pgindicator.setVisible(anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 577;BA.debugLine="m.Show (\"COMPLETED\",\"data time\")";
_m.Show("COMPLETED","data time");
 //BA.debugLineNum = 578;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 583;BA.debugLine="If msg= \"COMPLETED\" Then";
if ((_msg).equals("COMPLETED")) { 
 //BA.debugLineNum = 584;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 585;BA.debugLine="m.Show (\"COMPLETED\",\"\")";
_m.Show("COMPLETED","");
 };
 //BA.debugLineNum = 589;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 590;BA.debugLine="SendTrama(UltimaTrama)";
_sendtrama(_ultimatrama);
 //BA.debugLineNum = 591;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 593;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = anywheresoftware.b4a.keywords.Common.False;
 //BA.debugLineNum = 594;BA.debugLine="PgIndicator.Visible =False";
_pgindicator.setVisible(anywheresoftware.b4a.keywords.Common.False);
 } 
       catch (Exception e422) {
			ba.setLastException(e422); };
 //BA.debugLineNum = 603;BA.debugLine="End Sub";
return "";
}
}
