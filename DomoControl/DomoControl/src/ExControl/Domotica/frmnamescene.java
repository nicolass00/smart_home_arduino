package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmnamescene extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmnamescene", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmnamescene",
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
public anywheresoftware.b4j.objects.Form _frmsc = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _actualizavalores() throws Exception{
int _i = 0;
 //BA.debugLineNum = 69;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 70;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 73;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 74;BA.debugLine="For i =0 To 9";
{
final int step48 = 1;
final int limit48 = (int) (9);
for (_i = (int) (0); (step48 > 0 && _i <= limit48) || (step48 < 0 && _i >= limit48); _i = ((int)(0 + _i + step48))) {
 //BA.debugLineNum = 75;BA.debugLine="AddTwoLinesAndBitmap2 ( ValoresComunes.Scenes(i).Nombre ,ValoresComunes.Scenes(i).Descripcion  ,ValoresComunes.Ambient)";
_addtwolinesandbitmap2(_valorescomunes._scenes[_i].Nombre,_valorescomunes._scenes[_i].descripcion,_valorescomunes._ambient);
 }
};
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 43;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 44;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 46;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 48;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 50;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 52;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 54;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 57;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 58;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 59;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 60;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 61;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 62;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 63;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 65;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 7;BA.debugLine="Dim FrmSc As Form";
_frmsc = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 40;BA.debugLine="FrmSc.Close";
_frmsc.Close();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 14;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 15;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 16;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 20;BA.debugLine="FrmSc.Initialize(\"FrmSc\", 400dip, 600dip)";
_frmsc.Initialize(ba,"FrmSc",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 21;BA.debugLine="FrmSc.Title = \"Setting Name and Description\"";
_frmsc.setTitle("Setting Name and Description");
 //BA.debugLineNum = 22;BA.debugLine="FrmSc.SetFormStyle(\"UTILITY\")";
_frmsc.SetFormStyle("UTILITY");
 //BA.debugLineNum = 26;BA.debugLine="FrmSc.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frmsc.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 27;BA.debugLine="FrmSc.RootPane.SetAnchors(ListView1, 0 , 0, 0,0)";
_frmsc.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 29;BA.debugLine="FrmSc.SetOwner(Parent)";
_frmsc.SetOwner(_parent);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
int _r = 0;
ExControl.Domotica.frmnombre _inb = null;
 //BA.debugLineNum = 81;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 82;BA.debugLine="If Index> -1 Then";
if (_index>-1) { 
 //BA.debugLineNum = 83;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 84;BA.debugLine="Dim Inb As 	 FrmNombre";
_inb = new ExControl.Domotica.frmnombre();
 //BA.debugLineNum = 86;BA.debugLine="Inb.Initialize (FrmSc,ValoresComunes.Scenes(Index).Nombre,ValoresComunes.Scenes (Index).Descripcion )";
_inb._initialize(ba,_frmsc,_valorescomunes._scenes[_index].Nombre,_valorescomunes._scenes[_index].descripcion);
 //BA.debugLineNum = 87;BA.debugLine="r= Inb.Show";
_r = _inb._show();
 //BA.debugLineNum = 88;BA.debugLine="If r= -1 Then";
if (_r==-1) { 
 //BA.debugLineNum = 90;BA.debugLine="ValoresComunes.Scenes (Index).Nombre =Inb.Name";
_valorescomunes._scenes[_index].Nombre = _inb._name;
 //BA.debugLineNum = 91;BA.debugLine="ValoresComunes.Scenes (Index).Descripcion  =Inb.Description";
_valorescomunes._scenes[_index].descripcion = _inb._description;
 //BA.debugLineNum = 93;BA.debugLine="ValoresComunes.GuardaEscenas";
_valorescomunes._guardaescenas();
 //BA.debugLineNum = 94;BA.debugLine="ActualizaValores";
_actualizavalores();
 };
 //BA.debugLineNum = 96;BA.debugLine="ListView1.SelectedIndex =-1";
_listview1.setSelectedIndex((int) (-1));
 };
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return "";
}
public String  _show() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Public Sub Show";
 //BA.debugLineNum = 35;BA.debugLine="FrmSc.Show";
_frmsc.Show();
 //BA.debugLineNum = 36;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
