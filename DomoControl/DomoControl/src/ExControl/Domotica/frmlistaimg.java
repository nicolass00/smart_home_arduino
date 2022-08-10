package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmlistaimg extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmlistaimg", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmlistaimg",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ListViewWrapper _lv = null;
public int _val = 0;
public anywheresoftware.b4j.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4j.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imageview1 = null;
public anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _addtwolinesandbitmap2(String _name,String _description,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _iconcircuito) throws Exception{
anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper _p = null;
 //BA.debugLineNum = 40;BA.debugLine="Sub AddTwoLinesAndBitmap2 ( Name As String, Description As String,  IconCircuito As Image)";
 //BA.debugLineNum = 41;BA.debugLine="Dim p As AnchorPane";
_p = new anywheresoftware.b4j.objects.PaneWrapper.AnchorPaneWrapper();
 //BA.debugLineNum = 43;BA.debugLine="p.Initialize(\"\")";
_p.Initialize(ba,"");
 //BA.debugLineNum = 45;BA.debugLine="Select   ValoresComunes.Vista";
switch (BA.switchObjectToInt(_valorescomunes._vista,(int) (50),(int) (75))) {
case 0:
 //BA.debugLineNum = 47;BA.debugLine="p.LoadLayout(\"ListItem50\")";
_p.LoadLayout(ba,"ListItem50");
 break;
case 1:
 //BA.debugLineNum = 49;BA.debugLine="p.LoadLayout(\"ListView75\")";
_p.LoadLayout(ba,"ListView75");
 break;
default:
 //BA.debugLineNum = 51;BA.debugLine="p.LoadLayout(\"ListItem\")";
_p.LoadLayout(ba,"ListItem");
 break;
}
;
 //BA.debugLineNum = 54;BA.debugLine="lv.Items.Add(p)";
_lv.getItems().Add((Object)(_p.getObject()));
 //BA.debugLineNum = 55;BA.debugLine="Label1.Text = Name";
_label1.setText(_name);
 //BA.debugLineNum = 56;BA.debugLine="Label2.Text = Description";
_label2.setText(_description);
 //BA.debugLineNum = 58;BA.debugLine="Label1.Font  = ValoresComunes.FontH1 ' fx.CreateFont(\"Arial\", 22 , False, False)";
_label1.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 59;BA.debugLine="Label1.TextColor = fx.Colors.Gray";
_label1.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 61;BA.debugLine="Label2.Font = ValoresComunes.FontH2";
_label2.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 62;BA.debugLine="Label2.TextColor = fx.Colors.Gray";
_label2.setTextColor(_fx.Colors.Gray);
 //BA.debugLineNum = 63;BA.debugLine="ImageView1.SetImage(Img  )";
_imageview1.SetImage((javafx.scene.image.Image)(_img.getObject()));
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 6;BA.debugLine="Dim Val As Int";
_val = 0;
 //BA.debugLineNum = 8;BA.debugLine="Private Label1, Label2 As Label";
_label1 = new anywheresoftware.b4j.objects.LabelWrapper();
_label2 = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private ImageView1 As ImageView";
_imageview1 = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Dim Img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,anywheresoftware.b4a.objects.collections.List _nombres,anywheresoftware.b4a.objects.collections.List _descripcion,anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _imagen) throws Exception{
innerInitialize(_ba);
int _c = 0;
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(Parent As Form, Nombres As List,  Descripcion As List , Imagen As Image  )";
 //BA.debugLineNum = 18;BA.debugLine="frm.Initialize(\"frm\", 400dip, 600dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (400)),__c.DipToCurrent((int) (600)));
 //BA.debugLineNum = 19;BA.debugLine="frm.Title = \"Choose Value\"";
_frm.setTitle("Choose Value");
 //BA.debugLineNum = 20;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 22;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 24;BA.debugLine="Label1.Initialize (\"\")";
_label1.Initialize(ba,"");
 //BA.debugLineNum = 25;BA.debugLine="Label2.Initialize (\"\")";
_label2.Initialize(ba,"");
 //BA.debugLineNum = 27;BA.debugLine="Img = Imagen";
_img = _imagen;
 //BA.debugLineNum = 29;BA.debugLine="lv.Initialize(\"lv\")";
_lv.Initialize(ba,"lv");
 //BA.debugLineNum = 30;BA.debugLine="frm.RootPane.AddNode(lv,  0, 0, 0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 31;BA.debugLine="frm.RootPane.SetAnchors(lv, 0, 0, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 34;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 35;BA.debugLine="For C =0 To Nombres.Size -1";
{
final int step21 = 1;
final int limit21 = (int) (_nombres.getSize()-1);
for (_c = (int) (0); (step21 > 0 && _c <= limit21) || (step21 < 0 && _c >= limit21); _c = ((int)(0 + _c + step21))) {
 //BA.debugLineNum = 36;BA.debugLine="AddTwoLinesAndBitmap2 ( Nombres.Get (C),Descripcion.Get (C),  Img )";
_addtwolinesandbitmap2(BA.ObjectToString(_nombres.Get(_c)),BA.ObjectToString(_descripcion.Get(_c)),_img);
 }
};
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return "";
}
public String  _lv_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 66;BA.debugLine="Sub lv_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 67;BA.debugLine="Val = Index";
_val = _index;
 //BA.debugLineNum = 68;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 71;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 73;BA.debugLine="Return Val";
if (true) return _val;
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
