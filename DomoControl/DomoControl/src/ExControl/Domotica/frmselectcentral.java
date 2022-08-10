package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmselectcentral extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmselectcentral", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmselectcentral",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ListViewWrapper _lv = null;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public int _val = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _addtwolinesandbitmap2(String _name,String _description,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _iconcircuito) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 54;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( Name As String, Description As String,  IconCircuito As Image)";
 //BA.debugLineNum = 55;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 57;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 59;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 61;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 63;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 65;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 68;BA.debugLine="lv.Items.Add(p)";
_lv.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 69;BA.debugLine="Label1.Text = Name";
_label1.setText(_name);
 //BA.debugLineNum = 70;BA.debugLine="Label2.Text = Description";
_label2.setText(_description);
 //BA.debugLineNum = 71;BA.debugLine="Label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 72;BA.debugLine="Label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 74;BA.debugLine="Label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 75;BA.debugLine="Label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 76;BA.debugLine="ImageView1.SetImage(IconCircuito  )";
_imageview1.SetImage((javafx.scene.image.Image)(_iconcircuito.getObject()));
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private lv As ListView";
_lv = new anywheresoftware.b4j.objects.ListViewWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private Label1, Label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim Val As Int";
_val = 0;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _close() throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Public Sub Close";
 //BA.debugLineNum = 51;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(Parent As Form )";
 //BA.debugLineNum = 14;BA.debugLine="frm.Initialize(\"frm\", 600dip, 600dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (600)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 15;BA.debugLine="frm.Title = \"Select Central \"";
_frm.setTitle("Select Central ");
 //BA.debugLineNum = 16;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 18;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 20;BA.debugLine="Label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 21;BA.debugLine="Label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 24;BA.debugLine="lv.Initialize(\"lv\")";
_lv.Initialize(ba,"lv");
 //BA.debugLineNum = 28;BA.debugLine="frm.RootPane.AddNode(lv,  0, 0, 0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 29;BA.debugLine="frm.RootPane.SetAnchors(lv, 0, 0, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _lv_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub lv_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 81;BA.debugLine="If Index > -1   Then";
if (_index>-1) { 
 //BA.debugLineNum = 82;BA.debugLine="Val =Index";
_val = _index;
 //BA.debugLineNum = 83;BA.debugLine="frm.Close";
_frm.Close();
 };
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
int _c = 0;
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 35;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 36;BA.debugLine="Val =-1";
_val = (int) (-1);
 //BA.debugLineNum = 38;BA.debugLine="lv.Items .Clear";
_lv.getItems().Clear();
 //BA.debugLineNum = 39;BA.debugLine="For C =0 To ValoresComunes.Centrales.Size  -1";
{
final int step23 = 1;
final int limit23 = (int) (_valorescomunes._centrales.getSize()-1);
for (_c = (int) (0); (step23 > 0 && _c <= limit23) || (step23 < 0 && _c >= limit23); _c = ((int)(0 + _c + step23))) {
 //BA.debugLineNum = 41;BA.debugLine="AddTwoLinesAndBitmap2 (ValoresComunes.Centrales .Get (C) ,\"\",   ValoresComunes.Ambient  )";
_addtwolinesandbitmap2(BA.ObjectToString(_valorescomunes._centrales.Get(_c)),"",_valorescomunes._ambient);
 }
};
 //BA.debugLineNum = 46;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 47;BA.debugLine="Return Val";
if (true) return _val;
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
