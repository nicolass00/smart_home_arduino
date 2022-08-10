package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmselectvar extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmselectvar", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmselectvar",
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
public anywheresoftware.b4j.objects.Form _frmselect = null;
public anywheresoftware.b4a.objects.collections.List _variables = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdguardar = null;
public int _val = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _actualizavalores() throws Exception{
int _c = 0;
 //BA.debugLineNum = 94;BA.debugLine="Sub ActualizaValores()";
 //BA.debugLineNum = 95;BA.debugLine="ListView1.Items .Clear";
_listview1.getItems().Clear();
 //BA.debugLineNum = 97;BA.debugLine="Dim c As Int";
_c = 0;
 //BA.debugLineNum = 98;BA.debugLine="For c=0 To ValoresComunes.NombreSensor.Size -1";
{
final int step62 = 1;
final int limit62 = (int) (_valorescomunes._nombresensor.getSize()-1);
for (_c = (int) (0); (step62 > 0 && _c <= limit62) || (step62 < 0 && _c >= limit62); _c = ((int)(0 + _c + step62))) {
 //BA.debugLineNum = 99;BA.debugLine="If Variables.IndexOf (c)>-1 Then";
if (_variables.IndexOf((Object)(_c))>-1) { 
 //BA.debugLineNum = 100;BA.debugLine="AddTwoLinesAndBitmap2 ( ValoresComunes.NombreSensor .Get (c) ,\"Selected\",ValoresComunes.CheckOn)";
_addtwolinesandbitmap2(BA.ObjectToString(_valorescomunes._nombresensor.Get(_c)),"Selected",_valorescomunes._checkon);
 }else {
 //BA.debugLineNum = 102;BA.debugLine="AddTwoLinesAndBitmap2 ( ValoresComunes.NombreSensor .Get (c) ,\"Not selected\",ValoresComunes.CheckOff)";
_addtwolinesandbitmap2(BA.ObjectToString(_valorescomunes._nombresensor.Get(_c)),"Not selected",_valorescomunes._checkoff);
 };
 }
};
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public String  _addtwolinesandbitmap2(String _nombrecicuitos,String _descripcioncircuito,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagenico) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( NombreCicuitos As String, DescripcionCircuito As String, ImagenIco As Image)";
 //BA.debugLineNum = 69;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 71;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 73;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 75;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 77;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 79;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 82;BA.debugLine="ListView1.Items.Add(p)";
_listview1.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 83;BA.debugLine="label1.Text = NombreCicuitos";
_label1.setText(_nombrecicuitos);
 //BA.debugLineNum = 84;BA.debugLine="label2.Text = DescripcionCircuito";
_label2.setText(_descripcioncircuito);
 //BA.debugLineNum = 85;BA.debugLine="label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 86;BA.debugLine="label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 87;BA.debugLine="label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 88;BA.debugLine="label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 90;BA.debugLine="ImageView1.SetImage(ImagenIco   )";
_imageview1.SetImage((javafx.scene.image.Image)(_imagenico.getObject()));
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 7;BA.debugLine="Private ListView1 As ListView";
_listview1 = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim label1, label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Dim FrmSelect As Form";
_frmselect = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 12;BA.debugLine="Public Variables As List";
_variables = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Dim CmdGuardar As Button";
_cmdguardar = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Dim val As Int";
_val = 0;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 66;BA.debugLine="FrmSelect.Close";
_frmselect.Close();
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return "";
}
public String  _cmdguardar_action() throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub CmdGuardar_Action";
 //BA.debugLineNum = 126;BA.debugLine="If Variables.Size >0 Then";
if (_variables.getSize()>0) { 
 //BA.debugLineNum = 127;BA.debugLine="val =1";
_val = (int) (1);
 }else {
 //BA.debugLineNum = 129;BA.debugLine="val=-2";
_val = (int) (-2);
 };
 //BA.debugLineNum = 131;BA.debugLine="FrmSelect.Close";
_frmselect.Close();
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 21;BA.debugLine="label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 23;BA.debugLine="ListView1.Initialize(\"ListView1\")";
_listview1.Initialize(ba,"ListView1");
 //BA.debugLineNum = 24;BA.debugLine="CmdGuardar.Initialize (\"CmdGuardar\")";
_cmdguardar.Initialize(ba,"CmdGuardar");
 //BA.debugLineNum = 25;BA.debugLine="CmdGuardar.Text =\"OK\"";
_cmdguardar.setText("OK");
 //BA.debugLineNum = 26;BA.debugLine="CmdGuardar.Font = ValoresComunes.FontH1";
_cmdguardar.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 29;BA.debugLine="FrmSelect.Initialize(\"FrmCondicionado\", 400dip, 600dip)";
_frmselect.Initialize(ba,"FrmCondicionado",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 30;BA.debugLine="FrmSelect.Title = \"Select It\"";
_frmselect.setTitle("Select It");
 //BA.debugLineNum = 31;BA.debugLine="FrmSelect.SetFormStyle(\"UTILITY\")";
_frmselect.SetFormStyle("UTILITY");
 //BA.debugLineNum = 36;BA.debugLine="FrmSelect.RootPane.AddNode(CmdGuardar,     0  ,0,   0, 0)";
_frmselect.getRootPane().AddNode((javafx.scene.Node)(_cmdguardar.getObject()),0,0,0,0);
 //BA.debugLineNum = 37;BA.debugLine="FrmSelect.RootPane.SetAnchors(CmdGuardar,  5   ,  5, 5 ,-1)";
_frmselect.getRootPane().SetAnchors((javafx.scene.Node)(_cmdguardar.getObject()),5,5,5,-1);
 //BA.debugLineNum = 40;BA.debugLine="FrmSelect.RootPane.AddNode(ListView1, 0,0,  0, 0)";
_frmselect.getRootPane().AddNode((javafx.scene.Node)(_listview1.getObject()),0,0,0,0);
 //BA.debugLineNum = 41;BA.debugLine="FrmSelect.RootPane.SetAnchors(ListView1, 0  , 65, 0,0)";
_frmselect.getRootPane().SetAnchors((javafx.scene.Node)(_listview1.getObject()),0,65,0,0);
 //BA.debugLineNum = 43;BA.debugLine="FrmSelect.SetOwner(Parent)";
_frmselect.SetOwner(_parent);
 //BA.debugLineNum = 45;BA.debugLine="If Variables.IsInitialized = False Then";
if (_variables.IsInitialized()==__c.False) { 
 //BA.debugLineNum = 46;BA.debugLine="Variables.Initialize";
_variables.Initialize();
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _listview1_selectedindexchanged(int _index) throws Exception{
int _pos = 0;
 //BA.debugLineNum = 109;BA.debugLine="Sub ListView1_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 110;BA.debugLine="If Index > -1 Then";
if (_index>-1) { 
 //BA.debugLineNum = 111;BA.debugLine="Dim pos As Int";
_pos = 0;
 //BA.debugLineNum = 112;BA.debugLine="pos =Variables.IndexOf(Index)";
_pos = _variables.IndexOf((Object)(_index));
 //BA.debugLineNum = 113;BA.debugLine="If pos>=0 Then";
if (_pos>=0) { 
 //BA.debugLineNum = 114;BA.debugLine="Variables.RemoveAt (pos)";
_variables.RemoveAt(_pos);
 }else {
 //BA.debugLineNum = 116;BA.debugLine="Variables.Add (Index)";
_variables.Add((Object)(_index));
 };
 };
 //BA.debugLineNum = 120;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 57;BA.debugLine="Variables.Initialize";
_variables.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="ActualizaValores";
_actualizavalores();
 //BA.debugLineNum = 59;BA.debugLine="val=-1";
_val = (int) (-1);
 //BA.debugLineNum = 61;BA.debugLine="FrmSelect.ShowAndWait";
_frmselect.ShowAndWait();
 //BA.debugLineNum = 62;BA.debugLine="Return val";
if (true) return _val;
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
