package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmeditsensores extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmeditsensores", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmeditsensores",
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
public anywheresoftware.b4j.objects.Form _frmsens = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdnew = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _actualizavalores() throws Exception{
int _i = 0;
 //BA.debugLineNum = 87;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 88;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 91;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 92;BA.debugLine="For i =0 To ValoresComunes.NombreSensor .Size -1";
{
final int step65 = 1;
final int limit65 = (int) (_valorescomunes._nombresensor.getSize()-1);
for (_i = (int) (0); (step65 > 0 && _i <= limit65) || (step65 < 0 && _i >= limit65); _i = ((int)(0 + _i + step65))) {
 //BA.debugLineNum = 93;BA.debugLine="AddTwoLinesAndBitmap2 ( ValoresComunes.NombreSensor.Get (i),\"\" ,ValoresComunes.Sensor)";
_addtwolinesandbitmap2(BA.ObjectToString(_valorescomunes._nombresensor.Get(_i)),"",_valorescomunes._sensor);
 }
};
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 61;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 62;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 64;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 66;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 68;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 70;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 72;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 75;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 76;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 77;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 78;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 79;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 80;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 81;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 83;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim FrmSens As Form";
_frmsens = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Dim CmdNew As Button";
_cmdnew = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 58;BA.debugLine="FrmSens.Close";
_frmsens.Close();
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return "";
}
public String  _cmdnew_action() throws Exception{
int _r = 0;
ExControl.Domotica.frminputbox _inb = null;
 //BA.debugLineNum = 39;BA.debugLine="Sub CmdNew_Action";
 //BA.debugLineNum = 40;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 41;BA.debugLine="Dim Inb As 	 FrmInputBox";
_inb = new ExControl.Domotica.frminputbox();
 //BA.debugLineNum = 42;BA.debugLine="Inb.Initialize (FrmSens,\"\")";
_inb._initialize(ba,_frmsens,"");
 //BA.debugLineNum = 43;BA.debugLine="r= Inb.Show";
_r = _inb._show();
 //BA.debugLineNum = 44;BA.debugLine="If r= -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 45;BA.debugLine="ValoresComunes.NombreSensor .Add ( Inb.Val )";
_valorescomunes._nombresensor.Add((Object)(_inb._val));
 //BA.debugLineNum = 46;BA.debugLine="File.WriteList (File.DirApp  ,\"Sensores\"& ValoresComunes.NumeroCental, ValoresComunes.NombreSensor  )";
__c.File.WriteList(__c.File.getDirApp(),"Sensores"+BA.NumberToString(_valorescomunes._numerocental),_valorescomunes._nombresensor);
 //BA.debugLineNum = 47;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 16;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 17;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 18;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 20;BA.debugLine="CmdNew.Initialize (\"CmdNew\")";
_cmdnew.Initialize(ba,"CmdNew");
 //BA.debugLineNum = 21;BA.debugLine="CmdNew.Text = \"NEW\"";
_cmdnew.setText("NEW");
 //BA.debugLineNum = 22;BA.debugLine="CmdNew.Font = ValoresComunes.FontH1";
_cmdnew.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 25;BA.debugLine="FrmSens.Initialize(\"FrmSens\", 400dip, 600dip)";
_frmsens.Initialize(ba,"FrmSens",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 26;BA.debugLine="FrmSens.Title = \"Sensors\"";
_frmsens.setTitle("Sensors");
 //BA.debugLineNum = 27;BA.debugLine="FrmSens.SetFormStyle(\"UTILITY\")";
_frmsens.SetFormStyle("UTILITY");
 //BA.debugLineNum = 29;BA.debugLine="FrmSens.RootPane.AddNode(CmdNew,      0  ,0,   0, 0)";
_frmsens.getRootPane().AddNode((javafx.scene.Node)(_cmdnew.getObject()),0,0,0,0);
 //BA.debugLineNum = 30;BA.debugLine="FrmSens.RootPane.SetAnchors(CmdNew,  5    , 5, 5 ,-1)";
_frmsens.getRootPane().SetAnchors((javafx.scene.Node)(_cmdnew.getObject()),5,5,5,-1);
 //BA.debugLineNum = 32;BA.debugLine="FrmSens.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frmsens.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 33;BA.debugLine="FrmSens.RootPane.SetAnchors(ListView1, 0 , 60, 0,0)";
_frmsens.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,60,0,0);
 //BA.debugLineNum = 35;BA.debugLine="FrmSens.SetOwner(Parent)";
_frmsens.SetOwner(_parent);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
int _r = 0;
ExControl.Domotica.frminputbox _inb = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 100;BA.debugLine="If Index> -1 Then";
if (_index>-1) { 
 //BA.debugLineNum = 101;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 102;BA.debugLine="Dim Inb As 	 FrmInputBox";
_inb = new ExControl.Domotica.frminputbox();
 //BA.debugLineNum = 103;BA.debugLine="Inb.Initialize (FrmSens,ValoresComunes.NombreSensor .Get (Index))";
_inb._initialize(ba,_frmsens,BA.ObjectToString(_valorescomunes._nombresensor.Get(_index)));
 //BA.debugLineNum = 104;BA.debugLine="r= Inb.Show";
_r = _inb._show();
 //BA.debugLineNum = 105;BA.debugLine="If r= -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 106;BA.debugLine="ValoresComunes.NombreSensor.Set (Index,Inb.Val )";
_valorescomunes._nombresensor.Set(_index,(Object)(_inb._val));
 //BA.debugLineNum = 107;BA.debugLine="File.WriteList (File.DirApp  ,\"Sensores\"& ValoresComunes.NumeroCental, ValoresComunes.NombreSensor  )";
__c.File.WriteList(__c.File.getDirApp(),"Sensores"+BA.NumberToString(_valorescomunes._numerocental),_valorescomunes._nombresensor);
 //BA.debugLineNum = 108;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 111;BA.debugLine="ListView1.SelectedIndex =-1";
_listview1.setSelectedIndex((int) (-1));
 };
 //BA.debugLineNum = 113;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 53;BA.debugLine="FrmSens.Show";
_frmsens.Show();
 //BA.debugLineNum = 54;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
