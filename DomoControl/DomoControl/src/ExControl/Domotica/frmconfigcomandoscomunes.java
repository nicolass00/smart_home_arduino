package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmconfigcomandoscomunes extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmconfigcomandoscomunes", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmconfigcomandoscomunes",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.ListViewWrapper _listview1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdnew = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _actualizavalores() throws Exception{
int _i = 0;
ExControl.Domotica.valorescomunes._scene _c = null;
 //BA.debugLineNum = 103;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 104;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 107;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 108;BA.debugLine="For i =0 To ValoresComunes.ComandosComunes   .Size -1";
{
final int step76 = 1;
final int limit76 = (int) (_valorescomunes._comandoscomunes.getSize()-1);
for (_i = (int) (0); (step76 > 0 && _i <= limit76) || (step76 < 0 && _i >= limit76); _i = ((int)(0 + _i + step76))) {
 //BA.debugLineNum = 109;BA.debugLine="Dim C As Scene";
_c = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 110;BA.debugLine="C = ValoresComunes.ComandosComunes.Get (i)";
_c = (ExControl.Domotica.valorescomunes._scene)(_valorescomunes._comandoscomunes.Get(_i));
 //BA.debugLineNum = 112;BA.debugLine="AddTwoLinesAndBitmap2 ( C.Nombre ,C.Descripcion ,ValoresComunes.Comando )";
_addtwolinesandbitmap2(_c.Nombre,_c.descripcion,_valorescomunes._comando);
 }
};
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 77;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 78;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 80;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 82;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 84;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 86;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 88;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 91;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 92;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 93;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 94;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 95;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 96;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 97;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 99;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 8;BA.debugLine="Dim CmdNew As Button";
_cmdnew = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 72;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 74;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return "";
}
public String  _cmdnew_action() throws Exception{
ExControl.Domotica.valorescomunes._scene _co = null;
int _r = 0;
ExControl.Domotica.frminputbox _inb = null;
String _nombre = "";
 //BA.debugLineNum = 38;BA.debugLine="Sub CmdNew_Action";
 //BA.debugLineNum = 40;BA.debugLine="Dim co As Scene";
_co = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 41;BA.debugLine="co.Initialize";
_co.Initialize();
 //BA.debugLineNum = 44;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 45;BA.debugLine="Dim Inb As 	 FrmInputBox";
_inb = new ExControl.Domotica.frminputbox();
 //BA.debugLineNum = 46;BA.debugLine="Inb.Initialize (Frm,\"Name\" )";
_inb._initialize(ba,_frm,"Name");
 //BA.debugLineNum = 47;BA.debugLine="r= Inb.Show";
_r = _inb._show();
 //BA.debugLineNum = 48;BA.debugLine="If r= -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 49;BA.debugLine="Dim Nombre As String";
_nombre = "";
 //BA.debugLineNum = 50;BA.debugLine="Nombre = Inb.Val";
_nombre = _inb._val;
 //BA.debugLineNum = 51;BA.debugLine="Inb.Initialize (Frm,\"description\" )";
_inb._initialize(ba,_frm,"description");
 //BA.debugLineNum = 52;BA.debugLine="r= Inb.Show";
_r = _inb._show();
 //BA.debugLineNum = 53;BA.debugLine="If r= -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 54;BA.debugLine="co.Nombre =Nombre";
_co.Nombre = _nombre;
 //BA.debugLineNum = 55;BA.debugLine="co.Descripcion =Inb.Val";
_co.descripcion = _inb._val;
 //BA.debugLineNum = 56;BA.debugLine="ValoresComunes.ComandosComunes .Add (co)";
_valorescomunes._comandoscomunes.Add((Object)(_co));
 //BA.debugLineNum = 58;BA.debugLine="ValoresComunes.GuardaComandosComunes";
_valorescomunes._guardacomandoscomunes();
 //BA.debugLineNum = 59;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 };
 //BA.debugLineNum = 64;BA.debugLine="ListView1.SelectedIndex =-1";
_listview1.setSelectedIndex((int) (-1));
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 15;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 16;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 17;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 19;BA.debugLine="CmdNew.Initialize (\"CmdNew\")";
_cmdnew.Initialize(ba,"CmdNew");
 //BA.debugLineNum = 20;BA.debugLine="CmdNew.Text = \"NEW\"";
_cmdnew.setText("NEW");
 //BA.debugLineNum = 21;BA.debugLine="CmdNew.Font = ValoresComunes.FontH1";
_cmdnew.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 24;BA.debugLine="Frm.Initialize(\"Frm\", 400dip, 600dip)";
_frm.Initialize(ba,"Frm",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 25;BA.debugLine="Frm.Title = \"Setting\"";
_frm.setTitle("Setting");
 //BA.debugLineNum = 26;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 28;BA.debugLine="Frm.RootPane.AddNode(CmdNew,      0  ,0,   0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdnew.getObject()),0,0,0,0);
 //BA.debugLineNum = 29;BA.debugLine="Frm.RootPane.SetAnchors(CmdNew,  5    , 5, 5 ,-1)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdnew.getObject()),5,5,5,-1);
 //BA.debugLineNum = 31;BA.debugLine="Frm.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 32;BA.debugLine="Frm.RootPane.SetAnchors(ListView1, 0 , 60, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,60,0,0);
 //BA.debugLineNum = 34;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
int _r = 0;
ExControl.Domotica.frmnombre _inb = null;
ExControl.Domotica.valorescomunes._scene _co = null;
 //BA.debugLineNum = 117;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 118;BA.debugLine="If Index> -1 Then";
if (_index>-1) { 
 //BA.debugLineNum = 119;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 120;BA.debugLine="Dim Inb As 	 FrmNombre";
_inb = new ExControl.Domotica.frmnombre();
 //BA.debugLineNum = 121;BA.debugLine="Dim co As Scene";
_co = new ExControl.Domotica.valorescomunes._scene();
 //BA.debugLineNum = 122;BA.debugLine="co = ValoresComunes.ComandosComunes.Get (Index)";
_co = (ExControl.Domotica.valorescomunes._scene)(_valorescomunes._comandoscomunes.Get(_index));
 //BA.debugLineNum = 124;BA.debugLine="Inb.Initialize (Frm,co.Nombre,co.Descripcion )";
_inb._initialize(ba,_frm,_co.Nombre,_co.descripcion);
 //BA.debugLineNum = 125;BA.debugLine="r= Inb.Show";
_r = _inb._show();
 //BA.debugLineNum = 126;BA.debugLine="If r= -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 128;BA.debugLine="co.Nombre =Inb.Name";
_co.Nombre = _inb._name;
 //BA.debugLineNum = 129;BA.debugLine="co.Descripcion  =Inb.Description";
_co.descripcion = _inb._description;
 //BA.debugLineNum = 131;BA.debugLine="ValoresComunes.GuardaComandosComunes";
_valorescomunes._guardacomandoscomunes();
 //BA.debugLineNum = 132;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 134;BA.debugLine="ListView1.SelectedIndex =-1";
_listview1.setSelectedIndex((int) (-1));
 };
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 69;BA.debugLine="Frm.Show";
_frm.Show();
 //BA.debugLineNum = 70;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
