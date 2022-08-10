package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmeditscene extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmeditscene", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmeditscene",
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
public anywheresoftware.b4j.objects.Form _frm = null;
public byte[] _tramaenviada = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imgcargando = null;
public int _conttim = 0;
public boolean _paqueteenviado = false;
public anywheresoftware.b4j.objects.ProgressIndicatorWrapper _pgindicator = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdguardar = null;
public byte[] _valores = null;
public anywheresoftware.b4a.objects.collections.List _value = null;
public byte _numeroscene = (byte)0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _actualizavalores() throws Exception{
int _i = 0;
 //BA.debugLineNum = 111;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 112;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 113;BA.debugLine="Value.Clear";
_value.Clear();
 //BA.debugLineNum = 114;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 115;BA.debugLine="For i =0 To 29";
{
final int step86 = 1;
final int limit86 = (int) (29);
for (_i = (int) (0); (step86 > 0 && _i <= limit86) || (step86 < 0 && _i >= limit86); _i = ((int)(0 + _i + step86))) {
 //BA.debugLineNum = 117;BA.debugLine="If ValoresComunes.Circuitos (i).Nombre <> \"\" AND ValoresComunes.Circuitos (i).Rango > 0 Then";
if ((_valorescomunes._circuitos[_i].Nombre).equals("") == false && _valorescomunes._circuitos[_i].Rango>0) { 
 //BA.debugLineNum = 123;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=1 OR ValoresComunes.Circuitos (i).Rango=2 Then";
if (_valorescomunes._circuitos[_i].Rango==1 || _valorescomunes._circuitos[_i].Rango==2) { 
 //BA.debugLineNum = 124;BA.debugLine="If Valores(i)>2 OR Valores(i)<0  Then";
if (_valores[_i]>2 || _valores[_i]<0) { 
 //BA.debugLineNum = 125;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\"  ,ValoresComunes.BombillaDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._bombillades,_i);
 //BA.debugLineNum = 126;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 128;BA.debugLine="If Valores(i)=0 OR Valores(i)> ValoresComunes.Circuitos (i).Rango  Then";
if (_valores[_i]==0 || _valores[_i]>_valorescomunes._circuitos[_i].Rango) { 
 //BA.debugLineNum = 129;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.BombillaOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._bombillaoff,_i);
 }else {
 //BA.debugLineNum = 132;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.BombillaOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._bombillaon,_i);
 };
 };
 };
 //BA.debugLineNum = 139;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=7 OR ValoresComunes.Circuitos (i).Rango=8 Then";
if (_valorescomunes._circuitos[_i].Rango==7 || _valorescomunes._circuitos[_i].Rango==8) { 
 //BA.debugLineNum = 140;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 141;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\" ,ValoresComunes.EnchufeDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._enchufedes,_i);
 //BA.debugLineNum = 142;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 144;BA.debugLine="If Valores(i)=0  Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 145;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.EnchufeOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._enchufeoff,_i);
 }else {
 //BA.debugLineNum = 147;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.EnchufeOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._enchufeon,_i);
 };
 };
 };
 //BA.debugLineNum = 152;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=39 Then";
if (_valorescomunes._circuitos[_i].Rango==39) { 
 //BA.debugLineNum = 153;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 154;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\" ,ValoresComunes.PuertaDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._puertades,_i);
 //BA.debugLineNum = 155;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 157;BA.debugLine="If Valores(i)=0  Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 158;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.PuertaOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._puertaoff,_i);
 }else {
 //BA.debugLineNum = 160;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.PuertaOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._puertaon,_i);
 };
 };
 };
 //BA.debugLineNum = 169;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=13 OR  ValoresComunes.Circuitos (i).Rango=14 Then";
if (_valorescomunes._circuitos[_i].Rango==13 || _valorescomunes._circuitos[_i].Rango==14) { 
 //BA.debugLineNum = 170;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 171;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\"  ,ValoresComunes.RiegoDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._riegodes,_i);
 //BA.debugLineNum = 173;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 175;BA.debugLine="If Valores(i)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 176;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.RiegoOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._riegooff,_i);
 }else {
 //BA.debugLineNum = 179;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.RiegoOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._riegoon,_i);
 };
 };
 };
 //BA.debugLineNum = 188;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=15 Then";
if (_valorescomunes._circuitos[_i].Rango==15) { 
 //BA.debugLineNum = 189;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 190;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\"  ,ValoresComunes.AcondicionadoDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._acondicionadodes,_i);
 //BA.debugLineNum = 191;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 193;BA.debugLine="If Valores(i)=0  Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 194;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.valvulaOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._valvulaoff,_i);
 //BA.debugLineNum = 195;BA.debugLine="Valores(i)=0";
_valores[_i] = (byte) (0);
 }else {
 //BA.debugLineNum = 197;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.valvulaOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._valvulaon,_i);
 };
 };
 };
 //BA.debugLineNum = 204;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=19 Then";
if (_valorescomunes._circuitos[_i].Rango==19) { 
 //BA.debugLineNum = 205;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 206;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\"  ,ValoresComunes.AcondicionadoDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._acondicionadodes,_i);
 //BA.debugLineNum = 207;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 209;BA.debugLine="If Valores(i)=0  Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 210;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.AcondicionadoOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._acondicionadooff,_i);
 //BA.debugLineNum = 211;BA.debugLine="Valores(i)=0";
_valores[_i] = (byte) (0);
 }else {
 //BA.debugLineNum = 213;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.AcondicionadoOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._acondicionadoon,_i);
 };
 };
 };
 //BA.debugLineNum = 220;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=24 Then";
if (_valorescomunes._circuitos[_i].Rango==24) { 
 //BA.debugLineNum = 221;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 222;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\"  ,ValoresComunes.CalefaccionDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._calefacciondes,_i);
 //BA.debugLineNum = 223;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 225;BA.debugLine="If Valores(i)=0  Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 226;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.CalefaccionOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionoff,_i);
 //BA.debugLineNum = 227;BA.debugLine="Valores(i)=0";
_valores[_i] = (byte) (0);
 }else {
 //BA.debugLineNum = 229;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.CalefaccionOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionon,_i);
 };
 };
 };
 //BA.debugLineNum = 236;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=25 Then";
if (_valorescomunes._circuitos[_i].Rango==25) { 
 //BA.debugLineNum = 237;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 238;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\"  ,ValoresComunes.CalefaccionDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._calefacciondes,_i);
 //BA.debugLineNum = 239;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 241;BA.debugLine="If Valores(i)=0  Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 242;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.CalefaccionOff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionoff,_i);
 //BA.debugLineNum = 243;BA.debugLine="Valores(i)=0";
_valores[_i] = (byte) (0);
 }else {
 //BA.debugLineNum = 245;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.CalefaccionOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._calefaccionon,_i);
 };
 };
 };
 //BA.debugLineNum = 252;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=43 Then";
if (_valorescomunes._circuitos[_i].Rango==43) { 
 //BA.debugLineNum = 253;BA.debugLine="If  Valores(i) > 1  OR Valores(i)<0 Then";
if (_valores[_i]>1 || _valores[_i]<0) { 
 //BA.debugLineNum = 254;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,\"Maintains Existing State\"  ,ValoresComunes.ventiladordes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._ventiladordes,_i);
 //BA.debugLineNum = 255;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 257;BA.debugLine="If Valores(i)=0  Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 258;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.ventiladoroff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._ventiladoroff,_i);
 //BA.debugLineNum = 259;BA.debugLine="Valores(i)=0";
_valores[_i] = (byte) (0);
 }else {
 //BA.debugLineNum = 261;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.ventiladoron,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._ventiladoron,_i);
 };
 };
 };
 //BA.debugLineNum = 268;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=29 Then";
if (_valorescomunes._circuitos[_i].Rango==29) { 
 //BA.debugLineNum = 269;BA.debugLine="If Valores(i)>100  OR Valores(i)<0 Then";
if (_valores[_i]>100 || _valores[_i]<0) { 
 //BA.debugLineNum = 270;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre & \" - ####ºC\"  ,\"Maintains Existing State\" ,ValoresComunes.TemperaturaDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre+" - ####ºC","Maintains Existing State",_valorescomunes._temperaturades,_i);
 //BA.debugLineNum = 271;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 273;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre & \" - \"& Valores(i) & \"ºC\"  ,\"Configura Temp. Consigna\" ,ValoresComunes.Temperatura,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre+" - "+BA.NumberToString(_valores[_i])+"ºC","Configura Temp. Consigna",_valorescomunes._temperatura,_i);
 };
 };
 //BA.debugLineNum = 281;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=34 Then";
if (_valorescomunes._circuitos[_i].Rango==34) { 
 //BA.debugLineNum = 283;BA.debugLine="If Valores(i)>100  OR Valores(i)<0 Then";
if (_valores[_i]>100 || _valores[_i]<0) { 
 //BA.debugLineNum = 284;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre   ,\"Maintains Existing State\" ,ValoresComunes.persianaDes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._persianades,_i);
 //BA.debugLineNum = 285;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 287;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre & \" - \"& Valores(i) & \"%\"  ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.persiana,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre+" - "+BA.NumberToString(_valores[_i])+"%",_valorescomunes._circuitos[_i].descripcion,_valorescomunes._persiana,_i);
 };
 };
 //BA.debugLineNum = 293;BA.debugLine="If ValoresComunes.Circuitos (i).Rango=35 Then";
if (_valorescomunes._circuitos[_i].Rango==35) { 
 //BA.debugLineNum = 294;BA.debugLine="If Valores(i)>100  OR Valores(i)<0 Then";
if (_valores[_i]>100 || _valores[_i]<0) { 
 //BA.debugLineNum = 295;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre   ,\"Maintains Existing State\" ,ValoresComunes.Toldodes,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,"Maintains Existing State",_valorescomunes._toldodes,_i);
 //BA.debugLineNum = 296;BA.debugLine="Valores(i)=250";
_valores[_i] = (byte) (250);
 }else {
 //BA.debugLineNum = 298;BA.debugLine="If Valores(i)=0 Then";
if (_valores[_i]==0) { 
 //BA.debugLineNum = 299;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre  ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.Toldooff,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._toldooff,_i);
 }else {
 //BA.debugLineNum = 301;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Circuitos (i).Nombre  ,ValoresComunes.Circuitos (i).Descripcion ,ValoresComunes.ToldoOn,i)";
_addtwolinesandbitmap2(_valorescomunes._circuitos[_i].Nombre,_valorescomunes._circuitos[_i].descripcion,_valorescomunes._toldoon,_i);
 };
 };
 };
 };
 }
};
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagen,int _valor) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, Imagen As Image,  Valor As Int)";
 //BA.debugLineNum = 87;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 89;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 91;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 93;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 95;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 97;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 100;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 101;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 102;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 103;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 104;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 105;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 106;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 107;BA.debugLine="ImageView1.SetImage(Imagen  )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagen.getObject()));
 //BA.debugLineNum = 108;BA.debugLine="Value.Add (Valor)";
_value.Add((Object)(_valor));
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim Timer1 As Timer";
_timer1 = new anywheresoftware.b4a.objects.Timer();
 //BA.debugLineNum = 5;BA.debugLine="Dim UDPSocket1 As UDPSocket";
_udpsocket1 = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket();
 //BA.debugLineNum = 6;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 11;BA.debugLine="Dim TramaEnviada() As Byte";
_tramaenviada = new byte[(int) (0)];
;
 //BA.debugLineNum = 12;BA.debugLine="Dim ImgCargando As ImageView";
_imgcargando = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim ContTim As Int";
_conttim = 0;
 //BA.debugLineNum = 15;BA.debugLine="Dim PaqueteEnviado As Boolean";
_paqueteenviado = false;
 //BA.debugLineNum = 16;BA.debugLine="Private PgIndicator As  ProgressIndicator";
_pgindicator = new anywheresoftware.b4j.objects.ProgressIndicatorWrapper();
 //BA.debugLineNum = 18;BA.debugLine="Dim CmdGuardar As Button";
_cmdguardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 21;BA.debugLine="Dim Valores(30) As   Byte";
_valores = new byte[(int) (30)];
;
 //BA.debugLineNum = 22;BA.debugLine="Dim Value As List";
_value = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 23;BA.debugLine="Dim NumeroScene As Byte";
_numeroscene = (byte)0;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public String  _cmdguardar_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
int _longtrama = 0;
byte[] _data = null;
int _i = 0;
 //BA.debugLineNum = 482;BA.debugLine="Sub CmdGuardar_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 484;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 485;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 486;BA.debugLine="LongTrama= 43";
_longtrama = (int) (43);
 }else {
 //BA.debugLineNum = 488;BA.debugLine="LongTrama= 35";
_longtrama = (int) (35);
 };
 //BA.debugLineNum = 491;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 492;BA.debugLine="data(0)=87";
_data[(int) (0)] = (byte) (87);
 //BA.debugLineNum = 493;BA.debugLine="data(1)=69";
_data[(int) (1)] = (byte) (69);
 //BA.debugLineNum = 494;BA.debugLine="data(2)=83";
_data[(int) (2)] = (byte) (83);
 //BA.debugLineNum = 495;BA.debugLine="data(3)=67";
_data[(int) (3)] = (byte) (67);
 //BA.debugLineNum = 496;BA.debugLine="data(4)=NumeroScene";
_data[(int) (4)] = _numeroscene;
 //BA.debugLineNum = 497;BA.debugLine="Dim I As Int";
_i = 0;
 //BA.debugLineNum = 499;BA.debugLine="For I =0 To 29";
{
final int step378 = 1;
final int limit378 = (int) (29);
for (_i = (int) (0); (step378 > 0 && _i <= limit378) || (step378 < 0 && _i >= limit378); _i = ((int)(0 + _i + step378))) {
 //BA.debugLineNum = 500;BA.debugLine="data(I+5)=Valores(I)+1";
_data[(int) (_i+5)] = (byte) (_valores[_i]+1);
 }
};
 //BA.debugLineNum = 502;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 503;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 504;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,int _numeroescena) throws Exception{
innerInitialize(_ba);
ExControl.Domotica.valorescomunes._scene _sc = null;
int _longtrama = 0;
byte[] _data = null;
 //BA.debugLineNum = 27;BA.debugLine="Public Sub Initialize(Parent As Form, NumeroEscena As Int)";
 //BA.debugLineNum = 29;BA.debugLine="NumeroScene= NumeroEscena +1";
_numeroscene = (byte) (_numeroescena+1);
 //BA.debugLineNum = 31;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 33;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 36;BA.debugLine="Frm.Initialize(\"Frm\", 400dip, 600dip)";
_frm.Initialize(ba,"Frm",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 37;BA.debugLine="Dim sc As Scene";
_sc = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 38;BA.debugLine="sc=ValoresComunes.Scenes(NumeroScene-1)";
_sc = _valorescomunes._scenes[(int) (_numeroscene-1)];
 //BA.debugLineNum = 39;BA.debugLine="Frm.Title =sc.Nombre";
_frm.setTitle(_sc.Nombre);
 //BA.debugLineNum = 40;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 42;BA.debugLine="CmdGuardar.Initialize (\"CmdGuardar\")";
_cmdguardar.Initialize(ba,"CmdGuardar");
 //BA.debugLineNum = 43;BA.debugLine="Value.Initialize";
_value.Initialize();
 //BA.debugLineNum = 45;BA.debugLine="CmdGuardar.Text =\"SAVE\"";
_cmdguardar.setText("SAVE");
 //BA.debugLineNum = 46;BA.debugLine="CmdGuardar.Font = ValoresComunes.FontH1";
_cmdguardar.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 47;BA.debugLine="Frm.RootPane.AddNode(CmdGuardar,     0  ,0,   0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdguardar.getObject()),0,0,0,0);
 //BA.debugLineNum = 48;BA.debugLine="Frm.RootPane.SetAnchors(CmdGuardar,  5   ,  5, 5 ,-1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdguardar.getObject()),5,5,5,-1);
 //BA.debugLineNum = 50;BA.debugLine="Frm.RootPane.AddNode(ListView1,    0,0,  0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 51;BA.debugLine="Frm.RootPane.SetAnchors(ListView1, 0 , 65, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,65,0,0);
 //BA.debugLineNum = 52;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 53;BA.debugLine="Frm.Show";
_frm.Show();
 //BA.debugLineNum = 55;BA.debugLine="PgIndicator.Initialize (\"\")";
_pgindicator.Initialize(ba,"");
 //BA.debugLineNum = 56;BA.debugLine="PgIndicator.Progress =-1";
_pgindicator.setProgress(-1);
 //BA.debugLineNum = 57;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 59;BA.debugLine="Frm.RootPane.AddNode(PgIndicator,  0,  0,70, 70)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_pgindicator.getObject()),0,0,70,70);
 //BA.debugLineNum = 61;BA.debugLine="Frm.RootPane.SetAnchors(PgIndicator , -1,  0,15, -1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_pgindicator.getObject()),-1,0,15,-1);
 //BA.debugLineNum = 63;BA.debugLine="UDPSocket1.Initialize(\"UDP\"   ,  0  ,  500)";
_udpsocket1.Initialize(ba,"UDP",(int) (0),(int) (500));
 //BA.debugLineNum = 64;BA.debugLine="Timer1.Initialize (\"Timer1\",100)";
_timer1.Initialize(ba,"Timer1",(long) (100));
 //BA.debugLineNum = 68;BA.debugLine="Dim LongTrama As Int";
_longtrama = 0;
 //BA.debugLineNum = 69;BA.debugLine="If ValoresComunes.ConexionSegura Then";
if (_valorescomunes._conexionsegura) { 
 //BA.debugLineNum = 70;BA.debugLine="LongTrama= 13";
_longtrama = (int) (13);
 }else {
 //BA.debugLineNum = 72;BA.debugLine="LongTrama= 5";
_longtrama = (int) (5);
 };
 //BA.debugLineNum = 74;BA.debugLine="Dim data(LongTrama) As Byte";
_data = new byte[_longtrama];
;
 //BA.debugLineNum = 75;BA.debugLine="data(0)=82";
_data[(int) (0)] = (byte) (82);
 //BA.debugLineNum = 76;BA.debugLine="data(1)=69";
_data[(int) (1)] = (byte) (69);
 //BA.debugLineNum = 77;BA.debugLine="data(2)=83";
_data[(int) (2)] = (byte) (83);
 //BA.debugLineNum = 78;BA.debugLine="data(3)=67";
_data[(int) (3)] = (byte) (67);
 //BA.debugLineNum = 79;BA.debugLine="If NumeroScene <1 OR NumeroScene >10 Then NumeroScene=1";
if (_numeroscene<1 || _numeroscene>10) { 
_numeroscene = (byte) (1);};
 //BA.debugLineNum = 80;BA.debugLine="data(4)= NumeroScene";
_data[(int) (4)] = _numeroscene;
 //BA.debugLineNum = 81;BA.debugLine="If ValoresComunes.ConexionSegura Then ValoresComunes.CompletarTrama (data)";
if (_valorescomunes._conexionsegura) { 
_valorescomunes._completartrama(_data);};
 //BA.debugLineNum = 82;BA.debugLine="SendTrama(data)";
_sendtrama(_data);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return "";
}
public String  _listview1_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
int _index = 0;
int _newval = 0;
anywheresoftware.b4a.objects.collections.List _lst = null;
int _r = 0;
ExControl.Domotica.frmlista _frmado = null;
ExControl.Domotica.frmbarra _frmnumber = null;
ExControl.Domotica.frmbarra _frmb = null;
byte _v = (byte)0;
ExControl.Domotica.frmbarra _frmpersiana = null;
 //BA.debugLineNum = 311;BA.debugLine="Sub ListView1_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 312;BA.debugLine="Dim Index As Int";
_index = 0;
 //BA.debugLineNum = 313;BA.debugLine="Index = ListView1.SelectedIndex";
_index = _listview1.getSelectedIndex();
 //BA.debugLineNum = 314;BA.debugLine="If Index >-1 Then";
if (_index>-1) { 
 //BA.debugLineNum = 315;BA.debugLine="If EventData.PrimaryButtonPressed Then";
if (_eventdata.getPrimaryButtonPressed()) { 
 //BA.debugLineNum = 316;BA.debugLine="Dim NewVal As Int";
_newval = 0;
 //BA.debugLineNum = 317;BA.debugLine="Select  ValoresComunes.Circuitos(Value.Get (Index)).Rango";
switch (BA.switchObjectToInt(_valorescomunes._circuitos[(int)(BA.ObjectToNumber(_value.Get(_index)))].Rango,(int) (1),(int) (7),(int) (8),(int) (13),(int) (4),(int) (19),(int) (24),(int) (39),(int) (15),(int) (25),(int) (43),(int) (2),(int) (14),(int) (29),(int) (35),(int) (34))) {
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
 //BA.debugLineNum = 320;BA.debugLine="If Valores(Value.Get (Index))=0 Then";
if (_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]==0) { 
 //BA.debugLineNum = 321;BA.debugLine="NewVal=1";
_newval = (int) (1);
 }else {
 //BA.debugLineNum = 323;BA.debugLine="NewVal=0";
_newval = (int) (0);
 };
 break;
case 11:
 //BA.debugLineNum = 327;BA.debugLine="Dim Lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 328;BA.debugLine="Lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 329;BA.debugLine="Lst.Add (\"Turn off lights.\")";
_lst.Add((Object)("Turn off lights."));
 //BA.debugLineNum = 330;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 331;BA.debugLine="For  r =1 To 3";
{
final int step250 = 1;
final int limit250 = (int) (3);
for (_r = (int) (1); (step250 > 0 && _r <= limit250) || (step250 < 0 && _r >= limit250); _r = ((int)(0 + _r + step250))) {
 //BA.debugLineNum = 332;BA.debugLine="Lst.Add(\"Turn on \" & r & \"/\" & ValoresComunes.Circuitos (Value.Get (Index)).Rango)";
_lst.Add((Object)("Turn on "+BA.NumberToString(_r)+"/"+BA.NumberToString(_valorescomunes._circuitos[(int)(BA.ObjectToNumber(_value.Get(_index)))].Rango)));
 }
};
 //BA.debugLineNum = 335;BA.debugLine="Dim FrmAdo As FrmLista";
_frmado = new ExControl.Domotica.frmlista();
 //BA.debugLineNum = 336;BA.debugLine="FrmAdo.Initialize(Frm,Lst,Valores(Value.Get (Index)))";
_frmado._initialize(ba,_frm,_lst,(int) (_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]));
 //BA.debugLineNum = 337;BA.debugLine="NewVal=FrmAdo.Show";
_newval = _frmado._show();
 break;
case 12:
 //BA.debugLineNum = 339;BA.debugLine="Dim FrmNumber As  FrmBarra";
_frmnumber = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 340;BA.debugLine="FrmNumber.Initialize(Frm,0,220,Valores(Value.Get (Index)),\"Min\")";
_frmnumber._initialize(ba,_frm,(int) (0),(int) (220),(int) (_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]),BA.ObjectToChar("Min"));
 //BA.debugLineNum = 341;BA.debugLine="NewVal=FrmNumber.Show";
_newval = _frmnumber._show();
 break;
case 13:
 //BA.debugLineNum = 347;BA.debugLine="Dim Frmb As FrmBarra";
_frmb = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 348;BA.debugLine="Dim v As Byte";
_v = (byte)0;
 //BA.debugLineNum = 349;BA.debugLine="v= Value.Get (Value.Get (Index))";
_v = (byte)(BA.ObjectToNumber(_value.Get((int)(BA.ObjectToNumber(_value.Get(_index))))));
 //BA.debugLineNum = 350;BA.debugLine="If v<18 OR v>30 Then v=24";
if (_v<18 || _v>30) { 
_v = (byte) (24);};
 //BA.debugLineNum = 351;BA.debugLine="Frmb.Initialize(Frm,18,30,v,\"º\")";
_frmb._initialize(ba,_frm,(int) (18),(int) (30),(int) (_v),BA.ObjectToChar("º"));
 //BA.debugLineNum = 352;BA.debugLine="NewVal=Frmb.Show";
_newval = _frmb._show();
 break;
case 14:
 //BA.debugLineNum = 355;BA.debugLine="If Valores(Value.Get (Index))=0 Then";
if (_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]==0) { 
 //BA.debugLineNum = 356;BA.debugLine="NewVal=100";
_newval = (int) (100);
 }else {
 //BA.debugLineNum = 358;BA.debugLine="NewVal=0";
_newval = (int) (0);
 };
 break;
case 15:
 //BA.debugLineNum = 362;BA.debugLine="Dim FrmPersiana As  FrmBarra";
_frmpersiana = new ExControl.Domotica.frmbarra();
 //BA.debugLineNum = 364;BA.debugLine="FrmPersiana.Initialize(Frm,0,100,Valores(Value.Get (Index)),\"%\")";
_frmpersiana._initialize(ba,_frm,(int) (0),(int) (100),(int) (_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))]),BA.ObjectToChar("%"));
 //BA.debugLineNum = 365;BA.debugLine="NewVal=FrmPersiana.Show";
_newval = _frmpersiana._show();
 break;
}
;
 //BA.debugLineNum = 369;BA.debugLine="If NewVal < 0  Then 	Return";
if (_newval<0) { 
if (true) return "";};
 //BA.debugLineNum = 370;BA.debugLine="Valores(Value.Get (Index))=NewVal";
_valores[(int)(BA.ObjectToNumber(_value.Get(_index)))] = (byte) (_newval);
 //BA.debugLineNum = 371;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 378;BA.debugLine="If EventData.SecondaryButtonPressed Then";
if (_eventdata.getSecondaryButtonPressed()) { 
 //BA.debugLineNum = 379;BA.debugLine="Valores(Index)=250";
_valores[_index] = (byte) (250);
 //BA.debugLineNum = 380;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 };
 //BA.debugLineNum = 383;BA.debugLine="End Sub";
return "";
}
public boolean  _sendingtrama(byte[] _data) throws Exception{
anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet = null;
 //BA.debugLineNum = 464;BA.debugLine="Sub SendingTrama (data() As Byte) As Boolean";
 //BA.debugLineNum = 465;BA.debugLine="Try";
try { //BA.debugLineNum = 466;BA.debugLine="Dim Packet As UDPPacket";
_packet = new anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket();
 //BA.debugLineNum = 467;BA.debugLine="Packet.Initialize(data, ValoresComunes.ip, ValoresComunes.Puerto)";
_packet.Initialize(_data,_valorescomunes._ip,_valorescomunes._puerto);
 //BA.debugLineNum = 468;BA.debugLine="UDPSocket1.Send(Packet)";
_udpsocket1.Send(_packet);
 //BA.debugLineNum = 469;BA.debugLine="Return True";
if (true) return __c.True;
 } 
       catch (Exception e355) {
			ba.setLastException(e355); //BA.debugLineNum = 471;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return false;
}
public String  _sendtrama(byte[] _data) throws Exception{
boolean _resultado = false;
int _reintento = 0;
anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper _serversocket1 = null;
String _myip = "";
 //BA.debugLineNum = 421;BA.debugLine="Sub SendTrama(data() As Byte )";
 //BA.debugLineNum = 422;BA.debugLine="Dim Resultado As Boolean";
_resultado = false;
 //BA.debugLineNum = 423;BA.debugLine="Dim Reintento As Int";
_reintento = 0;
 //BA.debugLineNum = 427;BA.debugLine="PgIndicator.Visible = True";
_pgindicator.setVisible(__c.True);
 //BA.debugLineNum = 428;BA.debugLine="Timer1.Enabled = True";
_timer1.setEnabled(__c.True);
 //BA.debugLineNum = 429;BA.debugLine="PaqueteEnviado =False";
_paqueteenviado = __c.False;
 //BA.debugLineNum = 430;BA.debugLine="TramaEnviada= data";
_tramaenviada = _data;
 //BA.debugLineNum = 431;BA.debugLine="ContTim=0";
_conttim = (int) (0);
 //BA.debugLineNum = 433;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 434;BA.debugLine="Dim ServerSocket1 As ServerSocket";
_serversocket1 = new anywheresoftware.b4a.objects.SocketWrapper.ServerSocketWrapper();
 //BA.debugLineNum = 435;BA.debugLine="Dim MyIp As String";
_myip = "";
 //BA.debugLineNum = 436;BA.debugLine="MyIp=ServerSocket1.GetMyIP";
_myip = _serversocket1.GetMyIP();
 //BA.debugLineNum = 438;BA.debugLine="If MyIp  <> \"127.0.0.1\" Then";
if ((_myip).equals("127.0.0.1") == false) { 
 //BA.debugLineNum = 439;BA.debugLine="Resultado = True";
_resultado = __c.True;
 }else {
 //BA.debugLineNum = 441;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 442;BA.debugLine="ValoresComunes.Delay (200)";
_valorescomunes._delay((long) (200));
 };
 }
;
 //BA.debugLineNum = 446;BA.debugLine="If Resultado = True Then";
if (_resultado==__c.True) { 
 //BA.debugLineNum = 447;BA.debugLine="Resultado =False";
_resultado = __c.False;
 //BA.debugLineNum = 448;BA.debugLine="Reintento =0";
_reintento = (int) (0);
 //BA.debugLineNum = 449;BA.debugLine="Do 	While Resultado= False AND Reintento < 40";
while (_resultado==__c.False && _reintento<40) {
 //BA.debugLineNum = 450;BA.debugLine="Resultado = SendingTrama(data)";
_resultado = _sendingtrama(_data);
 //BA.debugLineNum = 451;BA.debugLine="Reintento = Reintento +1";
_reintento = (int) (_reintento+1);
 //BA.debugLineNum = 452;BA.debugLine="If Resultado=False Then ValoresComunes.Delay (200)";
if (_resultado==__c.False) { 
_valorescomunes._delay((long) (200));};
 }
;
 };
 //BA.debugLineNum = 458;BA.debugLine="If Resultado = False  Then";
if (_resultado==__c.False) { 
 }else {
 //BA.debugLineNum = 461;BA.debugLine="PaqueteEnviado=True";
_paqueteenviado = __c.True;
 };
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return "";
}
public String  _timer1_tick() throws Exception{
 //BA.debugLineNum = 474;BA.debugLine="Sub Timer1_Tick";
 //BA.debugLineNum = 475;BA.debugLine="ContTim=ContTim+1";
_conttim = (int) (_conttim+1);
 //BA.debugLineNum = 477;BA.debugLine="If  ContTim > 50 Then";
if (_conttim>50) { 
 //BA.debugLineNum = 478;BA.debugLine="If PaqueteEnviado=True Then SendTrama(TramaEnviada)";
if (_paqueteenviado==__c.True) { 
_sendtrama(_tramaenviada);};
 };
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return "";
}
public String  _udp_packetarrived(anywheresoftware.b4a.objects.SocketWrapper.UDPSocket.UDPPacket _packet) throws Exception{
String _msg = "";
int _c = 0;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _m = null;
 //BA.debugLineNum = 386;BA.debugLine="Sub UDP_PacketArrived (Packet As UDPPacket)";
 //BA.debugLineNum = 387;BA.debugLine="Try";
try { //BA.debugLineNum = 388;BA.debugLine="Dim msg As String";
_msg = "";
 //BA.debugLineNum = 389;BA.debugLine="msg = BytesToString(Packet.Data, Packet.Offset, Packet.Length, \"UTF8\")";
_msg = __c.BytesToString(_packet.getData(),_packet.getOffset(),_packet.getLength(),"UTF8");
 //BA.debugLineNum = 392;BA.debugLine="If msg.Contains (\"VESC\") Then";
if (_msg.contains("VESC")) { 
 //BA.debugLineNum = 393;BA.debugLine="Dim  c As Int";
_c = 0;
 //BA.debugLineNum = 394;BA.debugLine="For c = 5 To Packet.Length -1";
{
final int step294 = 1;
final int limit294 = (int) (_packet.getLength()-1);
for (_c = (int) (5); (step294 > 0 && _c <= limit294) || (step294 < 0 && _c >= limit294); _c = ((int)(0 + _c + step294))) {
 //BA.debugLineNum = 395;BA.debugLine="Valores(c - 5)= Packet.Data (c)-1";
_valores[(int) (_c-5)] = (byte) (_packet.getData()[_c]-1);
 }
};
 //BA.debugLineNum = 398;BA.debugLine="ActualizaValores";
_actualizavalores();
 }else {
 //BA.debugLineNum = 401;BA.debugLine="If msg =\"REPETIRMSG\" Then";
if ((_msg).equals("REPETIRMSG")) { 
 //BA.debugLineNum = 402;BA.debugLine="SendTrama(TramaEnviada)";
_sendtrama(_tramaenviada);
 //BA.debugLineNum = 403;BA.debugLine="Return";
if (true) return "";
 }else {
 //BA.debugLineNum = 405;BA.debugLine="If msg<>\"COMPLETED\" Then";
if ((_msg).equals("COMPLETED") == false) { 
 //BA.debugLineNum = 406;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 407;BA.debugLine="m.Show (msg,\"Info\")";
_m.Show(_msg,"Info");
 };
 };
 };
 //BA.debugLineNum = 411;BA.debugLine="PgIndicator.Visible = False";
_pgindicator.setVisible(__c.False);
 //BA.debugLineNum = 412;BA.debugLine="Timer1.Enabled = False";
_timer1.setEnabled(__c.False);
 //BA.debugLineNum = 413;BA.debugLine="PaqueteEnviado = False";
_paqueteenviado = __c.False;
 } 
       catch (Exception e313) {
			ba.setLastException(e313); };
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
