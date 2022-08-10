package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class timedialog extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.timedialog", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.timedialog",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.CalendarTimePickerWrapper _timepicker = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public int _val = 0;
public int _hora = 0;
public int _minuto = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Dim TimePicker As JFXtrasTimePicker";
_timepicker = new anywheresoftware.b4j.agraham.jfxtrascontrols.BreadcrumbBarWrapper.CalendarTimePickerWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 7;BA.debugLine="Dim CmdOk As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim val As Int";
_val = 0;
 //BA.debugLineNum = 9;BA.debugLine="Dim Hora As  Int";
_hora = 0;
 //BA.debugLineNum = 10;BA.debugLine="Dim Minuto As Int";
_minuto = 0;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_action() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub CmdOk_Action";
 //BA.debugLineNum = 46;BA.debugLine="val =1";
_val = (int) (1);
 //BA.debugLineNum = 47;BA.debugLine="Hora= DateTime.GetHour (TimePicker.Time )";
_hora = __c.DateTime.GetHour(_timepicker.getTime());
 //BA.debugLineNum = 48;BA.debugLine="Minuto= DateTime.GetMinute (TimePicker.Time )";
_minuto = __c.DateTime.GetMinute(_timepicker.getTime());
 //BA.debugLineNum = 49;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(Parent As Form)";
 //BA.debugLineNum = 16;BA.debugLine="Frm.Initialize(\"frm\",  200 ,150 )";
_frm.Initialize(ba,"frm",200,150);
 //BA.debugLineNum = 17;BA.debugLine="Frm.Title =\"Set Time\"";
_frm.setTitle("Set Time");
 //BA.debugLineNum = 25;BA.debugLine="TimePicker.Initialize(\"\")";
_timepicker.Initialize(ba,"");
 //BA.debugLineNum = 26;BA.debugLine="Frm.RootPane.AddNode(TimePicker,  10 , 50, 190, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_timepicker.getObject()),10,50,190,0);
 //BA.debugLineNum = 27;BA.debugLine="TimePicker.Time = DateTime.Now";
_timepicker.setTime(__c.DateTime.getNow());
 //BA.debugLineNum = 28;BA.debugLine="TimePicker.MinuteStep = 1";
_timepicker.setMinuteStep((int) (1));
 //BA.debugLineNum = 29;BA.debugLine="TimePicker.ShowLabels = False";
_timepicker.setShowLabels(__c.False);
 //BA.debugLineNum = 33;BA.debugLine="CmdOk.Initialize (\"CmdOk\")";
_cmdok.Initialize(ba,"CmdOk");
 //BA.debugLineNum = 34;BA.debugLine="CmdOk.Text = \"OK\"";
_cmdok.setText("OK");
 //BA.debugLineNum = 35;BA.debugLine="CmdOk.Font = ValoresComunes.FontH1";
_cmdok.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 37;BA.debugLine="Frm.RootPane.AddNode(CmdOk,      0  ,0,   0, 0)";
_frm.getRootPane().AddNode((javafx.scene.Node)(_cmdok.getObject()),0,0,0,0);
 //BA.debugLineNum = 38;BA.debugLine="Frm.RootPane.SetAnchors(CmdOk,  5   , 110, 5 , 5)";
_frm.getRootPane().SetAnchors((javafx.scene.Node)(_cmdok.getObject()),5,110,5,5);
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 41;BA.debugLine="val =-1";
_val = (int) (-1);
 //BA.debugLineNum = 42;BA.debugLine="Frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 43;BA.debugLine="Return val";
if (true) return _val;
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
