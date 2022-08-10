package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmlista extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmlista", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmlista",
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
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
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
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,anywheresoftware.b4a.objects.collections.List _valores,int _valor) throws Exception{
innerInitialize(_ba);
int _c = 0;
anywheresoftware.b4j.objects.LabelWrapper _lbl = null;
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(Parent As Form, Valores As List, Valor As Int )";
 //BA.debugLineNum = 13;BA.debugLine="Val= Valor";
_val = _valor;
 //BA.debugLineNum = 15;BA.debugLine="frm.Initialize(\"frm\", 300dip, 200dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (200)));
 //BA.debugLineNum = 16;BA.debugLine="frm.Title = \"Choose Value\"";
_frm.setTitle("Choose Value");
 //BA.debugLineNum = 17;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 18;BA.debugLine="frm.RootPane.LoadLayout(\"FrmBarra\")";
_frm.getRootPane().LoadLayout(ba,"FrmBarra");
 //BA.debugLineNum = 19;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 24;BA.debugLine="lv.Initialize(\"lv\")";
_lv.Initialize(ba,"lv");
 //BA.debugLineNum = 25;BA.debugLine="frm.RootPane.AddNode(lv, 0, 0, 0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 26;BA.debugLine="frm.RootPane.SetAnchors(lv, 0, 0, 0,0)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_lv.getObject()),0,0,0,0);
 //BA.debugLineNum = 28;BA.debugLine="Dim C As Int";
_c = 0;
 //BA.debugLineNum = 29;BA.debugLine="For C =0 To Valores.Size -1";
{
final int step17 = 1;
final int limit17 = (int) (_valores.getSize()-1);
for (_c = (int) (0); (step17 > 0 && _c <= limit17) || (step17 < 0 && _c >= limit17); _c = ((int)(0 + _c + step17))) {
 //BA.debugLineNum = 30;BA.debugLine="Dim LBL As Label";
_lbl = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 31;BA.debugLine="LBL.Initialize (\"\")";
_lbl.Initialize(ba,"");
 //BA.debugLineNum = 32;BA.debugLine="LBL.Text = Valores.Get (C)";
_lbl.setText(BA.ObjectToString(_valores.Get(_c)));
 //BA.debugLineNum = 33;BA.debugLine="LBL.Font = ValoresComunes.FontH2";
_lbl.setFont(_valorescomunes._fonth2);
 //BA.debugLineNum = 34;BA.debugLine="lv.Items.Add(LBL)";
_lv.getItems().Add((Object)(_lbl.getObject()));
 }
};
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _lv_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub lv_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 47;BA.debugLine="Val = Index";
_val = _index;
 //BA.debugLineNum = 48;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 49;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 51;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 53;BA.debugLine="Return Val";
if (true) return _val;
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
