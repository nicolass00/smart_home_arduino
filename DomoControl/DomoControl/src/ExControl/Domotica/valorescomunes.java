package ExControl.Domotica;

import anywheresoftware.b4a.BA;

public class valorescomunes extends Object{
public static valorescomunes mostCurrent = new valorescomunes();
public static BA ba;
static {
		ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.valorescomunes", null);
		ba.loadHtSubs(valorescomunes.class);
        if (ba.getClass().getName().endsWith("ShellBA")) {
			
			ba.raiseEvent2(null, true, "SHELL", false);
			ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.valorescomunes", ba);
		}
	}
    public static Class<?> getObject() {
		return valorescomunes.class;
	}

 public static anywheresoftware.b4a.keywords.Common __c = null;
public static anywheresoftware.b4j.objects.JFX _fx = null;
public static ExControl.Domotica.valorescomunes._scene[] _scenes = null;
public static ExControl.Domotica.valorescomunes._scene[] _condicionados = null;
public static anywheresoftware.b4a.objects.collections.List _comandos = null;
public static anywheresoftware.b4a.objects.collections.List _descripcionescomandos = null;
public static anywheresoftware.b4a.objects.collections.List _comandoscomunes = null;
public static anywheresoftware.b4a.objects.collections.List _descripcionescomandoscomunes = null;
public static anywheresoftware.b4a.objects.collections.List _nombresensor = null;
public static ExControl.Domotica.valorescomunes._circuito[] _circuitos = null;
public static String _ip = "";
public static int _puerto = 0;
public static String _ipin = "";
public static String _ipout = "";
public static String _ipexterna = "";
public static boolean _conexionexterna = false;
public static int _puertoin = 0;
public static int _puertoout = 0;
public static String _mail = "";
public static String _password = "";
public static boolean _conexionsegura = false;
public static byte[] _passswordbyte = null;
public static int _numerocental = 0;
public static anywheresoftware.b4a.objects.collections.List _centrales = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _fonth1 = null;
public static anywheresoftware.b4j.objects.JFX.FontWrapper _fonth2 = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _alarma = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _sensor = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _voice = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _cargando = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _reloj = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _relook = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _calendario = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _icono = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _fechahora = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _configup = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _configdo = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _on = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _condicionado = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _comando = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _config = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _arduino = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _ambient = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _checkon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _checkoff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bombillaoff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bombillaon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _bombillades = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _enchufedes = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _enchufeoff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _enchufeon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _puertades = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _puertaoff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _puertaon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _riegodes = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _riegooff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _riegoon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _acondicionadodes = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _acondicionadooff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _acondicionadoon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _calefacciondes = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _calefaccionoff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _calefaccionon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _temperaturades = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _temperatura = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _toldodes = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _toldooff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _toldoon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _persianades = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _persiana = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _valvulaon = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _valvulaoff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _valvulades = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _ventiladoron = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _ventiladoroff = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _ventiladordes = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _barescenas = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _barcondicionado = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _barcomandos = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _barsensores = null;
public static anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _barcomandoscomunes = null;
public static int _vista = 0;
public static ExControl.Domotica.main _main = null;
public static class _scene{
public boolean IsInitialized;
public String Nombre;
public String descripcion;
public void Initialize() {
IsInitialized = true;
Nombre = "";
descripcion = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _circuito{
public boolean IsInitialized;
public String Nombre;
public String descripcion;
public int Rango;
public void Initialize() {
IsInitialized = true;
Nombre = "";
descripcion = "";
Rango = 0;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static String  _cargacentrales() throws Exception{
 //BA.debugLineNum = 549;BA.debugLine="Sub CargaCentrales";
 //BA.debugLineNum = 550;BA.debugLine="If File.Exists (File.DirApp ,\"Centrales\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Centrales")) { 
 //BA.debugLineNum = 551;BA.debugLine="Centrales = File.ReadList (File.DirApp ,\"Centrales\" )";
_centrales = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Centrales");
 }else {
 //BA.debugLineNum = 553;BA.debugLine="Centrales.Initialize";
_centrales.Initialize();
 //BA.debugLineNum = 554;BA.debugLine="Centrales.Add (\"Central 1\")";
_centrales.Add((Object)("Central 1"));
 //BA.debugLineNum = 556;BA.debugLine="File.WriteList(File.DirApp ,\"Centrales\" ,Centrales)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Centrales",_centrales);
 };
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return "";
}
public static String  _cargacircuitos() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _c = 0;
int _ci = 0;
ExControl.Domotica.valorescomunes._circuito _cir = null;
int _i = 0;
 //BA.debugLineNum = 480;BA.debugLine="Sub CargaCircuitos";
 //BA.debugLineNum = 485;BA.debugLine="If File.Exists ( File.DirApp ,\"ConfigCir\")   Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir")) { 
 //BA.debugLineNum = 486;BA.debugLine="File.Copy(File.DirApp, \"ConfigCir\",  File.DirApp, \"ConfigCir1\")";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir",anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir1");
 //BA.debugLineNum = 487;BA.debugLine="File.Delete(File.DirApp, \"ConfigCir\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir");
 };
 //BA.debugLineNum = 492;BA.debugLine="If  File.Exists ( File.DirApp ,\"ConfigCir\" & NumeroCental)  Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir"+BA.NumberToString(_numerocental))) { 
 //BA.debugLineNum = 493;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 494;BA.debugLine="Lst = File.ReadList(File.DirApp ,\"ConfigCir\" & NumeroCental)";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir"+BA.NumberToString(_numerocental));
 //BA.debugLineNum = 495;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 496;BA.debugLine="Dim ci As Int";
_ci = 0;
 //BA.debugLineNum = 497;BA.debugLine="C=0";
_c = (int) (0);
 //BA.debugLineNum = 498;BA.debugLine="ci =0";
_ci = (int) (0);
 //BA.debugLineNum = 499;BA.debugLine="Do While ci < 30";
while (_ci<30) {
 //BA.debugLineNum = 500;BA.debugLine="Dim cir As Circuito";
_cir = new ExControl.Domotica.valorescomunes._circuito();
 //BA.debugLineNum = 501;BA.debugLine="cir.Nombre = Lst.Get  (C)";
_cir.Nombre = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 502;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 503;BA.debugLine="cir.descripcion =Lst.Get (C)";
_cir.descripcion = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 504;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 505;BA.debugLine="If IsNumber(Lst.Get (C)) Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.ObjectToString(_lst.Get(_c)))) { 
 //BA.debugLineNum = 506;BA.debugLine="cir.Rango =Lst.Get (C)";
_cir.Rango = (int)(BA.ObjectToNumber(_lst.Get(_c)));
 }else {
 //BA.debugLineNum = 508;BA.debugLine="cir.Rango =0";
_cir.Rango = (int) (0);
 };
 //BA.debugLineNum = 510;BA.debugLine="Circuitos(ci)=cir";
_circuitos[_ci] = _cir;
 //BA.debugLineNum = 511;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 512;BA.debugLine="ci=ci+1";
_ci = (int) (_ci+1);
 }
;
 }else {
 //BA.debugLineNum = 516;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 517;BA.debugLine="For i =0 To 29";
{
final int step389 = 1;
final int limit389 = (int) (29);
for (_i = (int) (0); (step389 > 0 && _i <= limit389) || (step389 < 0 && _i >= limit389); _i = ((int)(0 + _i + step389))) {
 //BA.debugLineNum = 518;BA.debugLine="Dim cir As Circuito";
_cir = new ExControl.Domotica.valorescomunes._circuito();
 //BA.debugLineNum = 519;BA.debugLine="cir.Nombre =\"Circuit Nº \"  & i";
_cir.Nombre = "Circuit Nº "+BA.NumberToString(_i);
 //BA.debugLineNum = 520;BA.debugLine="cir.Descripcion =\"Circuit Description\"";
_cir.descripcion = "Circuit Description";
 //BA.debugLineNum = 521;BA.debugLine="cir.Rango =1000";
_cir.Rango = (int) (1000);
 //BA.debugLineNum = 522;BA.debugLine="Circuitos(i)= cir";
_circuitos[_i] = _cir;
 }
};
 //BA.debugLineNum = 524;BA.debugLine="GuardarConfigCircuitos";
_guardarconfigcircuitos();
 };
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return "";
}
public static String  _cargacomandos() throws Exception{
int _c = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
ExControl.Domotica.valorescomunes._scene _con = null;
ExControl.Domotica.valorescomunes._scene _com = null;
 //BA.debugLineNum = 334;BA.debugLine="Sub CargaComandos";
 //BA.debugLineNum = 336;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 337;BA.debugLine="If Comandos.IsInitialized Then";
if (_comandos.IsInitialized()) { 
 //BA.debugLineNum = 338;BA.debugLine="Comandos.Clear";
_comandos.Clear();
 }else {
 //BA.debugLineNum = 340;BA.debugLine="Comandos.Initialize";
_comandos.Initialize();
 };
 //BA.debugLineNum = 343;BA.debugLine="If  File.Exists ( File.DirApp ,\"Comandos\" & NumeroCental)  Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Comandos"+BA.NumberToString(_numerocental))) { 
 //BA.debugLineNum = 344;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 345;BA.debugLine="Lst = File.ReadList(File.DirApp ,\"Comandos\"  & NumeroCental)";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Comandos"+BA.NumberToString(_numerocental));
 //BA.debugLineNum = 348;BA.debugLine="C=0";
_c = (int) (0);
 //BA.debugLineNum = 350;BA.debugLine="Do While C <  Lst.Size";
while (_c<_lst.getSize()) {
 //BA.debugLineNum = 351;BA.debugLine="Dim Con As Scene";
_con = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 352;BA.debugLine="Con.Nombre = Lst.Get  (C)";
_con.Nombre = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 353;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 354;BA.debugLine="Con.descripcion =Lst.Get (C)";
_con.descripcion = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 355;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 357;BA.debugLine="Comandos.Add (Con )";
_comandos.Add((Object)(_con));
 }
;
 }else {
 //BA.debugLineNum = 362;BA.debugLine="For C =0 To 9";
{
final int step266 = 1;
final int limit266 = (int) (9);
for (_c = (int) (0); (step266 > 0 && _c <= limit266) || (step266 < 0 && _c >= limit266); _c = ((int)(0 + _c + step266))) {
 //BA.debugLineNum = 363;BA.debugLine="Dim com As Scene";
_com = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 365;BA.debugLine="com.Nombre =\"COMMAND nº \" & (C+1)";
_com.Nombre = "COMMAND nº "+BA.NumberToString((_c+1));
 //BA.debugLineNum = 366;BA.debugLine="com.descripcion =\"General Command\"";
_com.descripcion = "General Command";
 //BA.debugLineNum = 367;BA.debugLine="Comandos.Add (com )";
_comandos.Add((Object)(_com));
 }
};
 //BA.debugLineNum = 370;BA.debugLine="GuardaComandos";
_guardacomandos();
 };
 //BA.debugLineNum = 373;BA.debugLine="CargadescripcionesComandos";
_cargadescripcionescomandos();
 //BA.debugLineNum = 374;BA.debugLine="End Sub";
return "";
}
public static String  _cargacomandoscomunes() throws Exception{
int _c = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
ExControl.Domotica.valorescomunes._scene _con = null;
ExControl.Domotica.valorescomunes._scene _com = null;
 //BA.debugLineNum = 264;BA.debugLine="Sub CargaComandosComunes";
 //BA.debugLineNum = 266;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 267;BA.debugLine="If ComandosComunes.IsInitialized Then";
if (_comandoscomunes.IsInitialized()) { 
 //BA.debugLineNum = 268;BA.debugLine="ComandosComunes.Clear";
_comandoscomunes.Clear();
 }else {
 //BA.debugLineNum = 270;BA.debugLine="ComandosComunes.Initialize";
_comandoscomunes.Initialize();
 };
 //BA.debugLineNum = 273;BA.debugLine="If  File.Exists ( File.DirApp ,\"ComandosComunes\")  Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ComandosComunes")) { 
 //BA.debugLineNum = 274;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 275;BA.debugLine="Lst = File.ReadList(File.DirApp ,\"ComandosComunes\")";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ComandosComunes");
 //BA.debugLineNum = 278;BA.debugLine="C=0";
_c = (int) (0);
 //BA.debugLineNum = 280;BA.debugLine="Do While C <  Lst.Size";
while (_c<_lst.getSize()) {
 //BA.debugLineNum = 281;BA.debugLine="Dim Con As Scene";
_con = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 282;BA.debugLine="Con.Nombre = Lst.Get  (C)";
_con.Nombre = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 283;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 284;BA.debugLine="Con.descripcion =Lst.Get (C)";
_con.descripcion = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 285;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 287;BA.debugLine="ComandosComunes.Add (Con )";
_comandoscomunes.Add((Object)(_con));
 }
;
 }else {
 //BA.debugLineNum = 292;BA.debugLine="For C =0 To 9";
{
final int step210 = 1;
final int limit210 = (int) (9);
for (_c = (int) (0); (step210 > 0 && _c <= limit210) || (step210 < 0 && _c >= limit210); _c = ((int)(0 + _c + step210))) {
 //BA.debugLineNum = 293;BA.debugLine="Dim com As Scene";
_com = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 295;BA.debugLine="com.Nombre =\"COMMAND nº \" & (C+1)";
_com.Nombre = "COMMAND nº "+BA.NumberToString((_c+1));
 //BA.debugLineNum = 296;BA.debugLine="com.descripcion =\"General Command\"";
_com.descripcion = "General Command";
 //BA.debugLineNum = 297;BA.debugLine="ComandosComunes.Add (com )";
_comandoscomunes.Add((Object)(_com));
 }
};
 //BA.debugLineNum = 300;BA.debugLine="GuardaComandosComunes";
_guardacomandoscomunes();
 };
 //BA.debugLineNum = 303;BA.debugLine="CargadescripcionesComandosComunes";
_cargadescripcionescomandoscomunes();
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public static String  _cargacondicionados() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _c = 0;
int _c2 = 0;
ExControl.Domotica.valorescomunes._scene _con = null;
 //BA.debugLineNum = 426;BA.debugLine="Sub CargaCondicionados";
 //BA.debugLineNum = 430;BA.debugLine="If File.Exists ( File.DirApp ,\"Condicionados\")   Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados")) { 
 //BA.debugLineNum = 431;BA.debugLine="File.Copy(File.DirApp, \"Condicionados\",  File.DirApp, \"Condicionados1\")";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados",anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados1");
 //BA.debugLineNum = 432;BA.debugLine="File.Delete(File.DirApp, \"Condicionados\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados");
 };
 //BA.debugLineNum = 436;BA.debugLine="If  File.Exists ( File.DirApp ,\"Condicionados\"& NumeroCental)  Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados"+BA.NumberToString(_numerocental))) { 
 //BA.debugLineNum = 437;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 438;BA.debugLine="Lst = File.ReadList(File.DirApp ,\"Condicionados\"& NumeroCental )";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados"+BA.NumberToString(_numerocental));
 //BA.debugLineNum = 439;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 440;BA.debugLine="Dim c2 As Int";
_c2 = 0;
 //BA.debugLineNum = 441;BA.debugLine="C=0";
_c = (int) (0);
 //BA.debugLineNum = 442;BA.debugLine="c2=0";
_c2 = (int) (0);
 //BA.debugLineNum = 443;BA.debugLine="Do While c2 < 10";
while (_c2<10) {
 //BA.debugLineNum = 444;BA.debugLine="Dim Con As Scene";
_con = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 445;BA.debugLine="Con.Nombre = Lst.Get  (C)";
_con.Nombre = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 446;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 447;BA.debugLine="Con.descripcion =Lst.Get (C)";
_con.descripcion = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 448;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 449;BA.debugLine="Condicionados(c2)=Con";
_condicionados[_c2] = _con;
 //BA.debugLineNum = 450;BA.debugLine="c2=c2+1";
_c2 = (int) (_c2+1);
 }
;
 }else {
 //BA.debugLineNum = 454;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 455;BA.debugLine="For C =0 To 9";
{
final int step341 = 1;
final int limit341 = (int) (9);
for (_c = (int) (0); (step341 > 0 && _c <= limit341) || (step341 < 0 && _c >= limit341); _c = ((int)(0 + _c + step341))) {
 //BA.debugLineNum = 456;BA.debugLine="Dim Con As Scene";
_con = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 457;BA.debugLine="Con.Nombre =\"Condition nº \" & (C+1)";
_con.Nombre = "Condition nº "+BA.NumberToString((_c+1));
 //BA.debugLineNum = 458;BA.debugLine="Con.descripcion =\"descripcion \" & (C+1)";
_con.descripcion = "descripcion "+BA.NumberToString((_c+1));
 //BA.debugLineNum = 459;BA.debugLine="Condicionados(C)= Con";
_condicionados[_c] = _con;
 }
};
 //BA.debugLineNum = 463;BA.debugLine="GuardaCondicionados";
_guardacondicionados();
 };
 //BA.debugLineNum = 467;BA.debugLine="End Sub";
return "";
}
public static String  _cargaconexionexterna() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 155;BA.debugLine="Sub CargaConexionExterna";
 //BA.debugLineNum = 157;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 158;BA.debugLine="If File.Exists ( File.DirApp ,\"ConexionExterna\" )   Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConexionExterna")) { 
 //BA.debugLineNum = 160;BA.debugLine="Lst = File.ReadList(File.DirApp  ,\"ConexionExterna\"  )";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConexionExterna");
 //BA.debugLineNum = 161;BA.debugLine="Mail = Lst.Get (0)";
_mail = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 162;BA.debugLine="Password = Lst.Get (1)";
_password = BA.ObjectToString(_lst.Get((int) (1)));
 //BA.debugLineNum = 163;BA.debugLine="If Lst.Get (2)=\"true\" Then";
if ((_lst.Get((int) (2))).equals((Object)("true"))) { 
 //BA.debugLineNum = 164;BA.debugLine="ConexionSegura=True";
_conexionsegura = anywheresoftware.b4a.keywords.Common.True;
 }else {
 //BA.debugLineNum = 166;BA.debugLine="ConexionSegura=False";
_conexionsegura = anywheresoftware.b4a.keywords.Common.False;
 };
 //BA.debugLineNum = 168;BA.debugLine="PassswordByte =Password.GetBytes (\"UTF8\")";
_passswordbyte = _password.getBytes("UTF8");
 };
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return "";
}
public static String  _cargadescripcionescomandos() throws Exception{
int _c = 0;
ExControl.Domotica.valorescomunes._scene _cmd = null;
 //BA.debugLineNum = 375;BA.debugLine="Sub CargadescripcionesComandos";
 //BA.debugLineNum = 376;BA.debugLine="If descripcionesComandos.IsInitialized Then";
if (_descripcionescomandos.IsInitialized()) { 
 //BA.debugLineNum = 377;BA.debugLine="descripcionesComandos.Clear";
_descripcionescomandos.Clear();
 }else {
 //BA.debugLineNum = 379;BA.debugLine="descripcionesComandos.Initialize";
_descripcionescomandos.Initialize();
 };
 //BA.debugLineNum = 381;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 382;BA.debugLine="Dim cmd As Scene";
_cmd = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 383;BA.debugLine="For C =0 To Comandos.Size -1";
{
final int step284 = 1;
final int limit284 = (int) (_comandos.getSize()-1);
for (_c = (int) (0); (step284 > 0 && _c <= limit284) || (step284 < 0 && _c >= limit284); _c = ((int)(0 + _c + step284))) {
 //BA.debugLineNum = 384;BA.debugLine="cmd = Comandos.Get (C)";
_cmd = (ExControl.Domotica.valorescomunes._scene)(_comandos.Get(_c));
 //BA.debugLineNum = 385;BA.debugLine="If descripcionesComandos.IndexOf(cmd.descripcion )= -1 Then descripcionesComandos.Add (cmd.descripcion )";
if (_descripcionescomandos.IndexOf((Object)(_cmd.descripcion))==-1) { 
_descripcionescomandos.Add((Object)(_cmd.descripcion));};
 }
};
 //BA.debugLineNum = 389;BA.debugLine="End Sub";
return "";
}
public static String  _cargadescripcionescomandoscomunes() throws Exception{
int _c = 0;
ExControl.Domotica.valorescomunes._scene _cmd = null;
 //BA.debugLineNum = 305;BA.debugLine="Sub CargadescripcionesComandosComunes";
 //BA.debugLineNum = 306;BA.debugLine="If descripcionesComandosComunes.IsInitialized Then";
if (_descripcionescomandoscomunes.IsInitialized()) { 
 //BA.debugLineNum = 307;BA.debugLine="descripcionesComandosComunes.Clear";
_descripcionescomandoscomunes.Clear();
 }else {
 //BA.debugLineNum = 309;BA.debugLine="descripcionesComandosComunes.Initialize";
_descripcionescomandoscomunes.Initialize();
 };
 //BA.debugLineNum = 311;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 312;BA.debugLine="Dim cmd As Scene";
_cmd = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 313;BA.debugLine="For C =0 To ComandosComunes.Size -1";
{
final int step228 = 1;
final int limit228 = (int) (_comandoscomunes.getSize()-1);
for (_c = (int) (0); (step228 > 0 && _c <= limit228) || (step228 < 0 && _c >= limit228); _c = ((int)(0 + _c + step228))) {
 //BA.debugLineNum = 314;BA.debugLine="cmd = ComandosComunes.Get (C)";
_cmd = (ExControl.Domotica.valorescomunes._scene)(_comandoscomunes.Get(_c));
 //BA.debugLineNum = 315;BA.debugLine="If descripcionesComandosComunes.IndexOf(cmd.descripcion )= -1 Then descripcionesComandosComunes.Add (cmd.descripcion )";
if (_descripcionescomandoscomunes.IndexOf((Object)(_cmd.descripcion))==-1) { 
_descripcionescomandoscomunes.Add((Object)(_cmd.descripcion));};
 }
};
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return "";
}
public static String  _cargaimagenes() throws Exception{
int _f1 = 0;
int _f2 = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _v = 0;
 //BA.debugLineNum = 45;BA.debugLine="Sub CargaImagenes";
 //BA.debugLineNum = 46;BA.debugLine="Dim  f1,f2 As Int";
_f1 = 0;
_f2 = 0;
 //BA.debugLineNum = 49;BA.debugLine="If File.Exists (File.DirApp  ,\"AppConfig\") Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"AppConfig")) { 
 //BA.debugLineNum = 50;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 51;BA.debugLine="lst = File.ReadList (File.DirApp  ,\"AppConfig\")";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"AppConfig");
 //BA.debugLineNum = 52;BA.debugLine="Dim v As Int";
_v = 0;
 //BA.debugLineNum = 53;BA.debugLine="v = lst.Get(0)";
_v = (int)(BA.ObjectToNumber(_lst.Get((int) (0))));
 //BA.debugLineNum = 54;BA.debugLine="Select   v";
switch (_v) {
case 1:
 //BA.debugLineNum = 56;BA.debugLine="f1=14";
_f1 = (int) (14);
 //BA.debugLineNum = 57;BA.debugLine="f2=9";
_f2 = (int) (9);
 //BA.debugLineNum = 58;BA.debugLine="Vista=50";
_vista = (int) (50);
 break;
case 2:
 //BA.debugLineNum = 60;BA.debugLine="f1=21";
_f1 = (int) (21);
 //BA.debugLineNum = 61;BA.debugLine="f2=13";
_f2 = (int) (13);
 //BA.debugLineNum = 62;BA.debugLine="Vista = 75";
_vista = (int) (75);
 break;
default:
 //BA.debugLineNum = 64;BA.debugLine="f1=28";
_f1 = (int) (28);
 //BA.debugLineNum = 65;BA.debugLine="f2=18";
_f2 = (int) (18);
 //BA.debugLineNum = 66;BA.debugLine="Vista=100";
_vista = (int) (100);
 break;
}
;
 }else {
 //BA.debugLineNum = 70;BA.debugLine="f1=28";
_f1 = (int) (28);
 //BA.debugLineNum = 71;BA.debugLine="f2=18";
_f2 = (int) (18);
 //BA.debugLineNum = 72;BA.debugLine="Vista=100";
_vista = (int) (100);
 };
 //BA.debugLineNum = 75;BA.debugLine="ValvulaOn.Initialize( File.DirApp & \"/Img\", \"valvulaon.png\")";
_valvulaon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","valvulaon.png");
 //BA.debugLineNum = 76;BA.debugLine="ValvulaOff.Initialize( File.DirApp & \"/Img\", \"valvulaoff.png\")";
_valvulaoff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","valvulaoff.png");
 //BA.debugLineNum = 77;BA.debugLine="ValvulaDes.Initialize( File.DirApp & \"/Img\", \"valvulades.png\")";
_valvulades.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","valvulades.png");
 //BA.debugLineNum = 78;BA.debugLine="VentiladorOn.Initialize( File.DirApp & \"/Img\", \"ventiladoron.png\")";
_ventiladoron.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","ventiladoron.png");
 //BA.debugLineNum = 79;BA.debugLine="VentiladorOff.Initialize( File.DirApp & \"/Img\", \"ventiladoroff.png\")";
_ventiladoroff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","ventiladoroff.png");
 //BA.debugLineNum = 80;BA.debugLine="VentiladorDes.Initialize( File.DirApp & \"/Img\", \"ventiladordes.png\")";
_ventiladordes.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","ventiladordes.png");
 //BA.debugLineNum = 83;BA.debugLine="CheckOn.Initialize( File.DirApp & \"/Img\", \"checkon.png\")";
_checkon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","checkon.png");
 //BA.debugLineNum = 84;BA.debugLine="CheckOff.Initialize(File.DirApp & \"/Img\", \"checkoff.png\")";
_checkoff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","checkoff.png");
 //BA.debugLineNum = 85;BA.debugLine="BombillaOff.Initialize(File.DirApp & \"/Img\", \"bombillaoff.png\")";
_bombillaoff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","bombillaoff.png");
 //BA.debugLineNum = 86;BA.debugLine="BombillaOn.Initialize(File.DirApp & \"/Img\", \"bombillaon.png\")";
_bombillaon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","bombillaon.png");
 //BA.debugLineNum = 87;BA.debugLine="Bombillades.Initialize(File.DirApp & \"/Img\", \"bombillades.png\")";
_bombillades.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","bombillades.png");
 //BA.debugLineNum = 88;BA.debugLine="Enchufedes.Initialize(File.DirApp & \"/Img\", \"enchufedes.png\")";
_enchufedes.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","enchufedes.png");
 //BA.debugLineNum = 89;BA.debugLine="EnchufeOff.Initialize(File.DirApp & \"/Img\", \"enchufeoff.png\")";
_enchufeoff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","enchufeoff.png");
 //BA.debugLineNum = 90;BA.debugLine="EnchufeOn.Initialize(File.DirApp & \"/Img\", \"enchufeon.png\")";
_enchufeon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","enchufeon.png");
 //BA.debugLineNum = 91;BA.debugLine="Puertades.Initialize(File.DirApp & \"/Img\", \"puertades.png\")";
_puertades.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","puertades.png");
 //BA.debugLineNum = 92;BA.debugLine="PuertaOff.Initialize(File.DirApp & \"/Img\", \"puertaoff.png\")";
_puertaoff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","puertaoff.png");
 //BA.debugLineNum = 93;BA.debugLine="PuertaOn.Initialize(File.DirApp & \"/Img\", \"puertaon.png\")";
_puertaon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","puertaon.png");
 //BA.debugLineNum = 94;BA.debugLine="Riegodes.Initialize(File.DirApp & \"/Img\", \"riegodes.png\")";
_riegodes.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","riegodes.png");
 //BA.debugLineNum = 95;BA.debugLine="RiegoOff.Initialize(File.DirApp & \"/Img\", \"riegooff.png\")";
_riegooff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","riegooff.png");
 //BA.debugLineNum = 96;BA.debugLine="RiegoOn.Initialize(File.DirApp & \"/Img\", \"riegoon.png\")";
_riegoon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","riegoon.png");
 //BA.debugLineNum = 97;BA.debugLine="Acondicionadodes.Initialize(File.DirApp & \"/Img\", \"acondicionadodes.png\")";
_acondicionadodes.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","acondicionadodes.png");
 //BA.debugLineNum = 98;BA.debugLine="AcondicionadoOff.Initialize(File.DirApp & \"/Img\", \"acondicionadooff.png\")";
_acondicionadooff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","acondicionadooff.png");
 //BA.debugLineNum = 99;BA.debugLine="AcondicionadoOn.Initialize(File.DirApp & \"/Img\", \"acondicionadoon.png\")";
_acondicionadoon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","acondicionadoon.png");
 //BA.debugLineNum = 100;BA.debugLine="Calefacciondes.Initialize(File.DirApp & \"/Img\", \"calefacciondes.png\")";
_calefacciondes.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","calefacciondes.png");
 //BA.debugLineNum = 101;BA.debugLine="CalefaccionOff.Initialize(File.DirApp & \"/Img\", \"calefaccionoff.png\")";
_calefaccionoff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","calefaccionoff.png");
 //BA.debugLineNum = 102;BA.debugLine="CalefaccionOn.Initialize(File.DirApp & \"/Img\", \"calefaccionon.png\")";
_calefaccionon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","calefaccionon.png");
 //BA.debugLineNum = 103;BA.debugLine="Temperaturades.Initialize(File.DirApp & \"/Img\", \"temperaturades.png\")";
_temperaturades.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","temperaturades.png");
 //BA.debugLineNum = 104;BA.debugLine="Temperatura.Initialize(File.DirApp & \"/Img\", \"temperatura.png\")";
_temperatura.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","temperatura.png");
 //BA.debugLineNum = 105;BA.debugLine="Toldodes.Initialize(File.DirApp & \"/Img\", \"toldodes.png\")";
_toldodes.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","toldodes.png");
 //BA.debugLineNum = 106;BA.debugLine="Toldooff.Initialize(File.DirApp & \"/Img\", \"toldooff.png\")";
_toldooff.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","toldooff.png");
 //BA.debugLineNum = 107;BA.debugLine="ToldoOn.Initialize(File.DirApp & \"/Img\", \"toldoon.png\")";
_toldoon.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","toldoon.png");
 //BA.debugLineNum = 108;BA.debugLine="persianades.Initialize(File.DirApp & \"/Img\", \"persianades.png\")";
_persianades.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","persianades.png");
 //BA.debugLineNum = 109;BA.debugLine="persiana.Initialize(File.DirApp & \"/Img\", \"persiana.png\")";
_persiana.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","persiana.png");
 //BA.debugLineNum = 110;BA.debugLine="Ambient.Initialize(File.DirApp & \"/Img\", \"Ambient.png\")";
_ambient.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","Ambient.png");
 //BA.debugLineNum = 111;BA.debugLine="Reloj.Initialize(File.DirApp & \"/Img\", \"Reloj.png\")";
_reloj.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","Reloj.png");
 //BA.debugLineNum = 112;BA.debugLine="reloOk.Initialize(File.DirApp & \"/Img\", \"relook.png\")";
_relook.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","relook.png");
 //BA.debugLineNum = 113;BA.debugLine="Calendario.Initialize(File.DirApp & \"/Img\", \"Calendario.png\")";
_calendario.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","Calendario.png");
 //BA.debugLineNum = 114;BA.debugLine="Icono.Initialize(File.DirApp & \"/Img\", \"icono.png\")";
_icono.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","icono.png");
 //BA.debugLineNum = 115;BA.debugLine="fechahora.Initialize(File.DirApp & \"/Img\", \"fechahora.png\")";
_fechahora.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","fechahora.png");
 //BA.debugLineNum = 116;BA.debugLine="ConfigUp.Initialize(File.DirApp & \"/Img\", \"configup.png\")";
_configup.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","configup.png");
 //BA.debugLineNum = 117;BA.debugLine="configdo.Initialize(File.DirApp & \"/Img\", \"configdo.png\")";
_configdo.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","configdo.png");
 //BA.debugLineNum = 118;BA.debugLine="On.Initialize(File.DirApp & \"/Img\", \"on.png\")";
_on.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","on.png");
 //BA.debugLineNum = 119;BA.debugLine="Condicionado.Initialize(File.DirApp & \"/Img\", \"condicionados.png\")";
_condicionado.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","condicionados.png");
 //BA.debugLineNum = 120;BA.debugLine="Comando.Initialize(File.DirApp & \"/Img\", \"comando.png\")";
_comando.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","comando.png");
 //BA.debugLineNum = 121;BA.debugLine="Config.Initialize(File.DirApp & \"/Img\", \"config.png\")";
_config.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","config.png");
 //BA.debugLineNum = 122;BA.debugLine="Sensor.Initialize(File.DirApp & \"/Img\", \"sensores.png\")";
_sensor.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","sensores.png");
 //BA.debugLineNum = 123;BA.debugLine="Alarma.Initialize( File.DirApp & \"/Img\", \"alarma.png\")";
_alarma.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","alarma.png");
 //BA.debugLineNum = 127;BA.debugLine="Cargando.Initialize( File.DirApp & \"/Img\", \"loading.gif\")";
_cargando.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","loading.gif");
 //BA.debugLineNum = 128;BA.debugLine="Voice.Initialize(File.DirApp & \"/Img\", \"voice.png\")";
_voice.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","voice.png");
 //BA.debugLineNum = 134;BA.debugLine="barEscenas.Initialize( File.DirApp & \"/Img\", \"barAmbient.png\")";
_barescenas.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","barAmbient.png");
 //BA.debugLineNum = 135;BA.debugLine="barCondicionado.Initialize( File.DirApp & \"/Img\", \"barCondicionado.png\")";
_barcondicionado.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","barCondicionado.png");
 //BA.debugLineNum = 136;BA.debugLine="barComandos.Initialize( File.DirApp & \"/Img\", \"barComand.png\")";
_barcomandos.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","barComand.png");
 //BA.debugLineNum = 137;BA.debugLine="barSensores.Initialize( File.DirApp & \"/Img\", \"barSensor.png\")";
_barsensores.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","barSensor.png");
 //BA.debugLineNum = 138;BA.debugLine="barComandosComunes.Initialize( File.DirApp & \"/Img\", \"barComandCom.png\")";
_barcomandoscomunes.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirApp()+"/Img","barComandCom.png");
 //BA.debugLineNum = 141;BA.debugLine="FontH1= fx.CreateFont(\"Arial\", f1 , False, False)";
_fonth1 = _fx.CreateFont("Arial",_f1,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 142;BA.debugLine="FontH2= fx.CreateFont(\"Arial\", f2 , False, False)";
_fonth2 = _fx.CreateFont("Arial",_f2,anywheresoftware.b4a.keywords.Common.False,anywheresoftware.b4a.keywords.Common.False);
 //BA.debugLineNum = 143;BA.debugLine="End Sub";
return "";
}
public static String  _cargaip() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 223;BA.debugLine="Sub CargaIp";
 //BA.debugLineNum = 224;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 227;BA.debugLine="If File.Exists ( File.DirApp ,\"Conexion\" & NumeroCental)   Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Conexion"+BA.NumberToString(_numerocental))) { 
 //BA.debugLineNum = 229;BA.debugLine="Lst = File.ReadList(File.DirApp  ,\"Conexion\" & NumeroCental )";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Conexion"+BA.NumberToString(_numerocental));
 }else {
 //BA.debugLineNum = 232;BA.debugLine="IpIn=\"192.168.1.200\"";
_ipin = "192.168.1.200";
 //BA.debugLineNum = 233;BA.debugLine="PuertoIn=5000";
_puertoin = (int) (5000);
 //BA.debugLineNum = 234;BA.debugLine="PuertoOut=500";
_puertoout = (int) (500);
 //BA.debugLineNum = 236;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 237;BA.debugLine="Lst.Add (IpIn) 	'Lst.Add (\"192.168.2.200\")";
_lst.Add((Object)(_ipin));
 //BA.debugLineNum = 238;BA.debugLine="Lst.Add (IpIn)";
_lst.Add((Object)(_ipin));
 //BA.debugLineNum = 239;BA.debugLine="Lst.Add (PuertoIn) 	'Lst.Add (5000)";
_lst.Add((Object)(_puertoin));
 //BA.debugLineNum = 240;BA.debugLine="Lst.Add (PuertoOut)";
_lst.Add((Object)(_puertoout));
 //BA.debugLineNum = 242;BA.debugLine="File.WriteList(File.DirApp  ,\"Conexion\" & NumeroCental ,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Conexion"+BA.NumberToString(_numerocental),_lst);
 };
 //BA.debugLineNum = 246;BA.debugLine="IpIn= Lst.Get (0)";
_ipin = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 247;BA.debugLine="IpOut= Lst.Get (1)";
_ipout = BA.ObjectToString(_lst.Get((int) (1)));
 //BA.debugLineNum = 248;BA.debugLine="PuertoIn= Lst.Get (2)";
_puertoin = (int)(BA.ObjectToNumber(_lst.Get((int) (2))));
 //BA.debugLineNum = 249;BA.debugLine="PuertoOut= Lst.Get (3)";
_puertoout = (int)(BA.ObjectToNumber(_lst.Get((int) (3))));
 //BA.debugLineNum = 251;BA.debugLine="If ConexionExterna Then";
if (_conexionexterna) { 
 //BA.debugLineNum = 253;BA.debugLine="IpExterna = IpIn";
_ipexterna = _ipin;
 //BA.debugLineNum = 254;BA.debugLine="Ip = IpExterna";
_ip = _ipexterna;
 //BA.debugLineNum = 255;BA.debugLine="Puerto = PuertoOut";
_puerto = _puertoout;
 }else {
 //BA.debugLineNum = 257;BA.debugLine="Ip = IpIn";
_ip = _ipin;
 //BA.debugLineNum = 258;BA.debugLine="Puerto = PuertoIn";
_puerto = _puertoin;
 };
 //BA.debugLineNum = 263;BA.debugLine="End Sub";
return "";
}
public static String  _carganombresensores() throws Exception{
 //BA.debugLineNum = 404;BA.debugLine="Sub CargaNombreSensores";
 //BA.debugLineNum = 408;BA.debugLine="If File.Exists ( File.DirApp ,\"Sensores\")   Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Sensores")) { 
 //BA.debugLineNum = 409;BA.debugLine="File.Copy(File.DirApp, \"Sensores\",  File.DirApp, \"Sensores1\")";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Sensores",anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Sensores1");
 //BA.debugLineNum = 410;BA.debugLine="File.Delete(File.DirApp, \"Sensores\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Sensores");
 };
 //BA.debugLineNum = 414;BA.debugLine="If File.Exists ( File.DirApp ,\"Sensores\"& NumeroCental)    Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Sensores"+BA.NumberToString(_numerocental))) { 
 //BA.debugLineNum = 415;BA.debugLine="NombreSensor = File.ReadList(File.DirApp  ,\"Sensores\"& NumeroCental )";
_nombresensor = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Sensores"+BA.NumberToString(_numerocental));
 }else {
 //BA.debugLineNum = 418;BA.debugLine="If NombreSensor.IsInitialized  = False Then";
if (_nombresensor.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
 //BA.debugLineNum = 419;BA.debugLine="NombreSensor.Initialize";
_nombresensor.Initialize();
 }else {
 //BA.debugLineNum = 421;BA.debugLine="NombreSensor.Clear";
_nombresensor.Clear();
 };
 //BA.debugLineNum = 423;BA.debugLine="NombreSensor.Add (\"Reserva\")";
_nombresensor.Add((Object)("Reserva"));
 };
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return "";
}
public static String  _cargascenes() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _c = 0;
int _c2 = 0;
ExControl.Domotica.valorescomunes._scene _esc = null;
 //BA.debugLineNum = 564;BA.debugLine="Sub CargaScenes";
 //BA.debugLineNum = 568;BA.debugLine="If File.Exists ( File.DirApp ,\"ConfigEsc\")   Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc")) { 
 //BA.debugLineNum = 569;BA.debugLine="File.Copy(File.DirApp, \"ConfigEsc\",  File.DirApp, \"ConfigEsc1\")";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc",anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc1");
 //BA.debugLineNum = 570;BA.debugLine="File.Delete(File.DirApp, \"ConfigEsc\")";
anywheresoftware.b4a.keywords.Common.File.Delete(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc");
 };
 //BA.debugLineNum = 575;BA.debugLine="If  File.Exists ( File.DirApp ,\"ConfigEsc\"& NumeroCental)  Then";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc"+BA.NumberToString(_numerocental))) { 
 //BA.debugLineNum = 576;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 577;BA.debugLine="Lst = File.ReadList(File.DirApp ,\"ConfigEsc\"& NumeroCental )";
_lst = anywheresoftware.b4a.keywords.Common.File.ReadList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc"+BA.NumberToString(_numerocental));
 //BA.debugLineNum = 578;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 579;BA.debugLine="Dim c2 As Int";
_c2 = 0;
 //BA.debugLineNum = 580;BA.debugLine="C=0";
_c = (int) (0);
 //BA.debugLineNum = 581;BA.debugLine="c2=0";
_c2 = (int) (0);
 //BA.debugLineNum = 582;BA.debugLine="Do While c2 < 10";
while (_c2<10) {
 //BA.debugLineNum = 583;BA.debugLine="Dim esc As Scene";
_esc = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 584;BA.debugLine="esc.Nombre = Lst.Get  (C)";
_esc.Nombre = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 585;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 586;BA.debugLine="esc.descripcion =Lst.Get (C)";
_esc.descripcion = BA.ObjectToString(_lst.Get(_c));
 //BA.debugLineNum = 587;BA.debugLine="C=C+1";
_c = (int) (_c+1);
 //BA.debugLineNum = 588;BA.debugLine="Scenes(c2)=esc";
_scenes[_c2] = _esc;
 //BA.debugLineNum = 589;BA.debugLine="c2=c2+1";
_c2 = (int) (_c2+1);
 }
;
 }else {
 //BA.debugLineNum = 593;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 594;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 595;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 596;BA.debugLine="For C =0 To 9";
{
final int step457 = 1;
final int limit457 = (int) (9);
for (_c = (int) (0); (step457 > 0 && _c <= limit457) || (step457 < 0 && _c >= limit457); _c = ((int)(0 + _c + step457))) {
 //BA.debugLineNum = 597;BA.debugLine="Dim esc As Scene";
_esc = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 598;BA.debugLine="esc.Nombre =\"Scene nº \" & (C+1)";
_esc.Nombre = "Scene nº "+BA.NumberToString((_c+1));
 //BA.debugLineNum = 599;BA.debugLine="esc.descripcion =\"descripcion Scene \" & (C+1)";
_esc.descripcion = "descripcion Scene "+BA.NumberToString((_c+1));
 //BA.debugLineNum = 600;BA.debugLine="Scenes(C)= esc";
_scenes[_c] = _esc;
 //BA.debugLineNum = 603;BA.debugLine="Lst.Add (esc.Nombre )";
_lst.Add((Object)(_esc.Nombre));
 //BA.debugLineNum = 604;BA.debugLine="Lst.Add (esc.descripcion )";
_lst.Add((Object)(_esc.descripcion));
 }
};
 //BA.debugLineNum = 608;BA.debugLine="File.WriteList(File.DirApp ,\"ConfigEsc\" & NumeroCental ,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc"+BA.NumberToString(_numerocental),_lst);
 };
 //BA.debugLineNum = 610;BA.debugLine="End Sub";
return "";
}
public static String  _completartrama(byte[] _data) throws Exception{
int _p = 0;
 //BA.debugLineNum = 611;BA.debugLine="Sub CompletarTrama( data() As Byte)";
 //BA.debugLineNum = 612;BA.debugLine="Dim  p As Int";
_p = 0;
 //BA.debugLineNum = 613;BA.debugLine="p = data.Length - 8";
_p = (int) (_data.length-8);
 //BA.debugLineNum = 615;BA.debugLine="data (p)= PassswordByte(0)";
_data[_p] = _passswordbyte[(int) (0)];
 //BA.debugLineNum = 616;BA.debugLine="data (p+1)= PassswordByte(1)";
_data[(int) (_p+1)] = _passswordbyte[(int) (1)];
 //BA.debugLineNum = 617;BA.debugLine="data (p+2)= PassswordByte(2)";
_data[(int) (_p+2)] = _passswordbyte[(int) (2)];
 //BA.debugLineNum = 618;BA.debugLine="data (p+3)= PassswordByte(3)";
_data[(int) (_p+3)] = _passswordbyte[(int) (3)];
 //BA.debugLineNum = 619;BA.debugLine="data (p+4)= PassswordByte(4)";
_data[(int) (_p+4)] = _passswordbyte[(int) (4)];
 //BA.debugLineNum = 620;BA.debugLine="data (p+5)= PassswordByte(5)";
_data[(int) (_p+5)] = _passswordbyte[(int) (5)];
 //BA.debugLineNum = 621;BA.debugLine="data (p+6)= PassswordByte(6)";
_data[(int) (_p+6)] = _passswordbyte[(int) (6)];
 //BA.debugLineNum = 622;BA.debugLine="data (p+7)= PassswordByte(7)";
_data[(int) (_p+7)] = _passswordbyte[(int) (7)];
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return "";
}
public static String  _delay(long _nmillisecond) throws Exception{
long _nbegintime = 0L;
long _nendtime = 0L;
 //BA.debugLineNum = 209;BA.debugLine="Sub Delay(nMilliSecond As Long)";
 //BA.debugLineNum = 210;BA.debugLine="Dim nBeginTime As Long";
_nbegintime = 0L;
 //BA.debugLineNum = 211;BA.debugLine="Dim nEndTime As Long";
_nendtime = 0L;
 //BA.debugLineNum = 212;BA.debugLine="nEndTime = DateTime.Now  + nMilliSecond";
_nendtime = (long) (anywheresoftware.b4a.keywords.Common.DateTime.getNow()+_nmillisecond);
 //BA.debugLineNum = 213;BA.debugLine="nBeginTime = DateTime.Now";
_nbegintime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 214;BA.debugLine="Do While nBeginTime < nEndTime";
while (_nbegintime<_nendtime) {
 //BA.debugLineNum = 215;BA.debugLine="nBeginTime = DateTime.Now";
_nbegintime = anywheresoftware.b4a.keywords.Common.DateTime.getNow();
 //BA.debugLineNum = 216;BA.debugLine="If nEndTime < nBeginTime Then";
if (_nendtime<_nbegintime) { 
 //BA.debugLineNum = 217;BA.debugLine="Return";
if (true) return "";
 };
 }
;
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return "";
}
public static String  _guardacomandos() throws Exception{
int _c = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
ExControl.Domotica.valorescomunes._scene _cmd = null;
 //BA.debugLineNum = 390;BA.debugLine="Sub GuardaComandos";
 //BA.debugLineNum = 391;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 392;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 393;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 394;BA.debugLine="For C =0 To Comandos.Size -1";
{
final int step293 = 1;
final int limit293 = (int) (_comandos.getSize()-1);
for (_c = (int) (0); (step293 > 0 && _c <= limit293) || (step293 < 0 && _c >= limit293); _c = ((int)(0 + _c + step293))) {
 //BA.debugLineNum = 395;BA.debugLine="Dim cmd As Scene";
_cmd = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 396;BA.debugLine="cmd = Comandos.Get (C)";
_cmd = (ExControl.Domotica.valorescomunes._scene)(_comandos.Get(_c));
 //BA.debugLineNum = 397;BA.debugLine="Lst.Add (cmd.Nombre )";
_lst.Add((Object)(_cmd.Nombre));
 //BA.debugLineNum = 398;BA.debugLine="Lst.Add (cmd.descripcion )";
_lst.Add((Object)(_cmd.descripcion));
 }
};
 //BA.debugLineNum = 401;BA.debugLine="File.WriteList(File.DirApp ,\"Comandos\"  & NumeroCental  ,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Comandos"+BA.NumberToString(_numerocental),_lst);
 //BA.debugLineNum = 402;BA.debugLine="CargadescripcionesComandos";
_cargadescripcionescomandos();
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return "";
}
public static String  _guardacomandoscomunes() throws Exception{
int _c = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
ExControl.Domotica.valorescomunes._scene _cmd = null;
 //BA.debugLineNum = 320;BA.debugLine="Sub GuardaComandosComunes";
 //BA.debugLineNum = 321;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 322;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 323;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 324;BA.debugLine="For C =0 To ComandosComunes.Size -1";
{
final int step237 = 1;
final int limit237 = (int) (_comandoscomunes.getSize()-1);
for (_c = (int) (0); (step237 > 0 && _c <= limit237) || (step237 < 0 && _c >= limit237); _c = ((int)(0 + _c + step237))) {
 //BA.debugLineNum = 325;BA.debugLine="Dim cmd As Scene";
_cmd = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 326;BA.debugLine="cmd = ComandosComunes.Get (C)";
_cmd = (ExControl.Domotica.valorescomunes._scene)(_comandoscomunes.Get(_c));
 //BA.debugLineNum = 327;BA.debugLine="Lst.Add (cmd.Nombre )";
_lst.Add((Object)(_cmd.Nombre));
 //BA.debugLineNum = 328;BA.debugLine="Lst.Add (cmd.descripcion )";
_lst.Add((Object)(_cmd.descripcion));
 }
};
 //BA.debugLineNum = 331;BA.debugLine="File.WriteList(File.DirApp ,\"ComandosComunes\"   ,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ComandosComunes",_lst);
 //BA.debugLineNum = 332;BA.debugLine="CargadescripcionesComandosComunes";
_cargadescripcionescomandoscomunes();
 //BA.debugLineNum = 333;BA.debugLine="End Sub";
return "";
}
public static String  _guardacondicionados() throws Exception{
int _c = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 468;BA.debugLine="Sub GuardaCondicionados";
 //BA.debugLineNum = 469;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 470;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 471;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 472;BA.debugLine="For C =0 To 9";
{
final int step354 = 1;
final int limit354 = (int) (9);
for (_c = (int) (0); (step354 > 0 && _c <= limit354) || (step354 < 0 && _c >= limit354); _c = ((int)(0 + _c + step354))) {
 //BA.debugLineNum = 474;BA.debugLine="Lst.Add (Condicionados(C).Nombre )";
_lst.Add((Object)(_condicionados[_c].Nombre));
 //BA.debugLineNum = 475;BA.debugLine="Lst.Add (Condicionados(C).descripcion )";
_lst.Add((Object)(_condicionados[_c].descripcion));
 }
};
 //BA.debugLineNum = 478;BA.debugLine="File.WriteList(File.DirApp ,\"Condicionados\" & NumeroCental ,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Condicionados"+BA.NumberToString(_numerocental),_lst);
 //BA.debugLineNum = 479;BA.debugLine="End Sub";
return "";
}
public static String  _guardaconexionexterna() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 171;BA.debugLine="Sub GuardaConexionExterna";
 //BA.debugLineNum = 172;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 173;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 174;BA.debugLine="lst.Add (Mail)";
_lst.Add((Object)(_mail));
 //BA.debugLineNum = 175;BA.debugLine="lst.Add (Password)";
_lst.Add((Object)(_password));
 //BA.debugLineNum = 176;BA.debugLine="If ConexionSegura Then";
if (_conexionsegura) { 
 //BA.debugLineNum = 177;BA.debugLine="lst.Add (\"true\")";
_lst.Add((Object)("true"));
 }else {
 //BA.debugLineNum = 179;BA.debugLine="lst.Add (\"false\")";
_lst.Add((Object)("false"));
 };
 //BA.debugLineNum = 182;BA.debugLine="File.WriteList(File.DirApp  ,\"ConexionExterna\" ,lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConexionExterna",_lst);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public static String  _guardadatosconexion() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub GuardaDatosConexion";
 //BA.debugLineNum = 146;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 147;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 148;BA.debugLine="Lst.Add (IpIn)";
_lst.Add((Object)(_ipin));
 //BA.debugLineNum = 149;BA.debugLine="Lst.Add (IpOut)";
_lst.Add((Object)(_ipout));
 //BA.debugLineNum = 150;BA.debugLine="Lst.Add (PuertoIn)";
_lst.Add((Object)(_puertoin));
 //BA.debugLineNum = 151;BA.debugLine="Lst.Add (PuertoOut)";
_lst.Add((Object)(_puertoout));
 //BA.debugLineNum = 152;BA.debugLine="File.WriteList(File.DirApp ,\"Conexion\"  & NumeroCental,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Conexion"+BA.NumberToString(_numerocental),_lst);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return "";
}
public static String  _guardaescenas() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _c = 0;
 //BA.debugLineNum = 539;BA.debugLine="Sub GuardaEscenas";
 //BA.debugLineNum = 540;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 541;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 542;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 543;BA.debugLine="For C =0 To 9";
{
final int step414 = 1;
final int limit414 = (int) (9);
for (_c = (int) (0); (step414 > 0 && _c <= limit414) || (step414 < 0 && _c >= limit414); _c = ((int)(0 + _c + step414))) {
 //BA.debugLineNum = 544;BA.debugLine="Lst.Add (Scenes(C).Nombre)";
_lst.Add((Object)(_scenes[_c].Nombre));
 //BA.debugLineNum = 545;BA.debugLine="Lst.Add (Scenes(C).descripcion )";
_lst.Add((Object)(_scenes[_c].descripcion));
 }
};
 //BA.debugLineNum = 547;BA.debugLine="File.WriteList(File.DirApp ,\"ConfigEsc\" & NumeroCental, Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigEsc"+BA.NumberToString(_numerocental),_lst);
 //BA.debugLineNum = 548;BA.debugLine="End Sub";
return "";
}
public static String  _guardarcentrales() throws Exception{
 //BA.debugLineNum = 559;BA.debugLine="Sub GuardarCentrales";
 //BA.debugLineNum = 561;BA.debugLine="File.WriteList(File.DirApp ,\"Centrales\" ,Centrales)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"Centrales",_centrales);
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public static String  _guardarconfigcircuitos() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
int _i = 0;
 //BA.debugLineNum = 527;BA.debugLine="Sub GuardarConfigCircuitos";
 //BA.debugLineNum = 529;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 530;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 531;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 532;BA.debugLine="For i =0 To 29";
{
final int step403 = 1;
final int limit403 = (int) (29);
for (_i = (int) (0); (step403 > 0 && _i <= limit403) || (step403 < 0 && _i >= limit403); _i = ((int)(0 + _i + step403))) {
 //BA.debugLineNum = 533;BA.debugLine="Lst.Add (Circuitos(i).Nombre )";
_lst.Add((Object)(_circuitos[_i].Nombre));
 //BA.debugLineNum = 534;BA.debugLine="Lst.Add (Circuitos(i).descripcion  )";
_lst.Add((Object)(_circuitos[_i].descripcion));
 //BA.debugLineNum = 535;BA.debugLine="Lst.Add (Circuitos(i).rango )";
_lst.Add((Object)(_circuitos[_i].Rango));
 }
};
 //BA.debugLineNum = 537;BA.debugLine="File.WriteList(File.DirApp ,\"ConfigCir\" & NumeroCental,Lst)";
anywheresoftware.b4a.keywords.Common.File.WriteList(anywheresoftware.b4a.keywords.Common.File.getDirApp(),"ConfigCir"+BA.NumberToString(_numerocental),_lst);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return "";
}
public static String  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Type Scene(Nombre As String , descripcion As String)";
;
 //BA.debugLineNum = 5;BA.debugLine="Type Circuito(Nombre As String , descripcion As String, Rango As Int)";
;
 //BA.debugLineNum = 6;BA.debugLine="Dim Scenes(10) As Scene";
_scenes = new ExControl.Domotica.valorescomunes._scene[(int) (10)];
{
int d0 = _scenes.length;
for (int i0 = 0;i0 < d0;i0++) {
_scenes[i0] = new ExControl.Domotica.valorescomunes._scene();
}
}
;
 //BA.debugLineNum = 7;BA.debugLine="Dim Condicionados(10) As Scene";
_condicionados = new ExControl.Domotica.valorescomunes._scene[(int) (10)];
{
int d0 = _condicionados.length;
for (int i0 = 0;i0 < d0;i0++) {
_condicionados[i0] = new ExControl.Domotica.valorescomunes._scene();
}
}
;
 //BA.debugLineNum = 9;BA.debugLine="Dim Comandos As List";
_comandos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Dim descripcionesComandos As List";
_descripcionescomandos = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Dim ComandosComunes As List";
_comandoscomunes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Dim descripcionesComandosComunes As List";
_descripcionescomandoscomunes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Dim NombreSensor As List";
_nombresensor = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Dim Circuitos(30) As Circuito";
_circuitos = new ExControl.Domotica.valorescomunes._circuito[(int) (30)];
{
int d0 = _circuitos.length;
for (int i0 = 0;i0 < d0;i0++) {
_circuitos[i0] = new ExControl.Domotica.valorescomunes._circuito();
}
}
;
 //BA.debugLineNum = 16;BA.debugLine="Dim Ip As String";
_ip = "";
 //BA.debugLineNum = 17;BA.debugLine="Dim Puerto As Int";
_puerto = 0;
 //BA.debugLineNum = 19;BA.debugLine="Dim IpIn As String";
_ipin = "";
 //BA.debugLineNum = 20;BA.debugLine="Dim IpOut As String";
_ipout = "";
 //BA.debugLineNum = 21;BA.debugLine="Dim IpExterna As String";
_ipexterna = "";
 //BA.debugLineNum = 22;BA.debugLine="Dim ConexionExterna As Boolean";
_conexionexterna = false;
 //BA.debugLineNum = 24;BA.debugLine="Dim PuertoIn As Int";
_puertoin = 0;
 //BA.debugLineNum = 25;BA.debugLine="Dim PuertoOut As Int";
_puertoout = 0;
 //BA.debugLineNum = 27;BA.debugLine="Dim Mail As String";
_mail = "";
 //BA.debugLineNum = 28;BA.debugLine="Dim Password As String";
_password = "";
 //BA.debugLineNum = 29;BA.debugLine="Dim ConexionSegura As Boolean";
_conexionsegura = false;
 //BA.debugLineNum = 30;BA.debugLine="Dim PassswordByte() As Byte";
_passswordbyte = new byte[(int) (0)];
;
 //BA.debugLineNum = 32;BA.debugLine="Dim NumeroCental As Int";
_numerocental = 0;
 //BA.debugLineNum = 33;BA.debugLine="Dim Centrales As List";
_centrales = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 34;BA.debugLine="Dim FontH1, FontH2 As Font";
_fonth1 = new anywheresoftware.b4j.objects.JFX.FontWrapper();
_fonth2 = new anywheresoftware.b4j.objects.JFX.FontWrapper();
 //BA.debugLineNum = 35;BA.debugLine="Dim Alarma,Sensor,Voice,Cargando,Reloj,reloOk,Calendario,Icono,fechahora,ConfigUp,configdo,On,Condicionado,Comando,Config,Arduino,Ambient,CheckOn, CheckOff , BombillaOff, BombillaOn, Bombillades, Enchufedes, EnchufeOff, EnchufeOn,Puertades,PuertaOff,PuertaOn,Riegodes,RiegoOff,RiegoOn,Acondicionadodes,AcondicionadoOff,AcondicionadoOn,Calefacciondes,CalefaccionOff,CalefaccionOn,Temperaturades,Temperatura,Toldodes,Toldooff,ToldoOn,persianades,persiana As Image";
_alarma = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_sensor = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_voice = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_cargando = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_reloj = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_relook = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_calendario = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_icono = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_fechahora = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_configup = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_configdo = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_on = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_condicionado = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_comando = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_config = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_arduino = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_ambient = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_checkon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_checkoff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bombillaoff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bombillaon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_bombillades = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_enchufedes = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_enchufeoff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_enchufeon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_puertades = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_puertaoff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_puertaon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_riegodes = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_riegooff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_riegoon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_acondicionadodes = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_acondicionadooff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_acondicionadoon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_calefacciondes = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_calefaccionoff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_calefaccionon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_temperaturades = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_temperatura = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_toldodes = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_toldooff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_toldoon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_persianades = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_persiana = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 36;BA.debugLine="Dim ValvulaOn,ValvulaOff,ValvulaDes,VentiladorOn,VentiladorOff,VentiladorDes As Image";
_valvulaon = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_valvulaoff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_valvulades = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_ventiladoron = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_ventiladoroff = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_ventiladordes = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 40;BA.debugLine="Dim barEscenas, barCondicionado, barComandos, barSensores, barComandosComunes As Image";
_barescenas = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_barcondicionado = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_barcomandos = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_barsensores = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
_barcomandoscomunes = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 42;BA.debugLine="Dim Vista As Int";
_vista = 0;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
}
