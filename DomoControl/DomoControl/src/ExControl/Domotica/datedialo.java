package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class datedialo extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.datedialo", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.datedialo",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public long _dateticks = 0L;
public anywheresoftware.b4j.objects.Form _frmdate = null;
public anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.CalendarPickerWrapper _datefield = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public int _val = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Public DateTicks As Long";
_dateticks = 0L;
 //BA.debugLineNum = 6;BA.debugLine="Dim FrmDate As Form";
_frmdate = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 7;BA.debugLine="Dim DateField As  JFXtrasDatePicker";
_datefield = new anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.CalendarPickerWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim CmdOk As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim val As Int";
_val = 0;
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_action() throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub CmdOk_Action";
 //BA.debugLineNum = 45;BA.debugLine="Try";
try { //BA.debugLineNum = 46;BA.debugLine="val =1";
_val = (int) (1);
 //BA.debugLineNum = 47;BA.debugLine="DateTicks=DateField.DateTime";
_dateticks = _datefield.getDateTime();
 //BA.debugLineNum = 48;BA.debugLine="FrmDate.Close";
_frmdate.Close();
 } 
       catch (Exception e33) {
			ba.setLastException(e33); //BA.debugLineNum = 50;BA.debugLine="val =-2";
_val = (int) (-2);
 //BA.debugLineNum = 52;BA.debugLine="FrmDate.Close";
_frmdate.Close();
 };
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 18;BA.debugLine="FrmDate.Initialize(\"Frm\",  300dip,300dip)";
_frmdate.Initialize(ba,"Frm",__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (300)));
 //BA.debugLineNum = 19;BA.debugLine="FrmDate.Title =\"Set Date\"";
_frmdate.setTitle("Set Date");
 //BA.debugLineNum = 20;BA.debugLine="DateField.Initialize(\"\")";
_datefield.Initialize(ba,"");
 //BA.debugLineNum = 22;BA.debugLine="DateField.ShowTime = False ' Only in Single mode";
_datefield.setShowTime(__c.False);
 //BA.debugLineNum = 23;BA.debugLine="DateField.Mode =   \"Single\" ' also \"Multiple\" or \"Range\"";
_datefield.setMode("Single");
 //BA.debugLineNum = 24;BA.debugLine="DateField.DateTime = DateTime.Now";
_datefield.setDateTime(__c.DateTime.getNow());
 //BA.debugLineNum = 25;BA.debugLine="FrmDate.RootPane.AddNode(DateField,   5,  5,  -1,  -1)";
_frmdate.getRootPane().AddNode((javafx.scene.Node)(_datefield.getObject()),5,5,-1,-1);
 //BA.debugLineNum = 26;BA.debugLine="CmdOk.Initialize (\"CmdOk\")";
_cmdok.Initialize(ba,"CmdOk");
 //BA.debugLineNum = 27;BA.debugLine="CmdOk.Text = \"OK\"";
_cmdok.setText("OK");
 //BA.debugLineNum = 28;BA.debugLine="CmdOk.Font = ValoresComunes.FontH1";
_cmdok.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 34;BA.debugLine="FrmDate.RootPane.AddNode(CmdOk,      0  ,0,   0, 0)";
_frmdate.getRootPane().AddNode((javafx.scene.Node)(_cmdok.getObject()),0,0,0,0);
 //BA.debugLineNum = 35;BA.debugLine="FrmDate.RootPane.SetAnchors(CmdOk,  5   , 200, 5 , 5)";
_frmdate.getRootPane().SetAnchors((javafx.scene.Node)(_cmdok.getObject()),5,200,5,5);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 37;BA.debugLine="Public Sub Show() As Int";
 //BA.debugLineNum = 38;BA.debugLine="val =-1";
_val = (int) (-1);
 //BA.debugLineNum = 41;BA.debugLine="FrmDate.ShowAndWait";
_frmdate.ShowAndWait();
 //BA.debugLineNum = 42;BA.debugLine="Return val";
if (true) return _val;
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
