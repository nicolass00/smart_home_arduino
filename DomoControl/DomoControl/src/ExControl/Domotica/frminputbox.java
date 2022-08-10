package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frminputbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frminputbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frminputbox",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtvalor = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdcancel = null;
public String _val = "";
public int _dialogresultok = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 11;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 12;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 13;BA.debugLine="Private TxtValor As TextField";
_txtvalor = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 14;BA.debugLine="Private CmdOk As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 15;BA.debugLine="Private CmdCancel As Button";
_cmdcancel = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 17;BA.debugLine="Dim Val As String";
_val = "";
 //BA.debugLineNum = 18;BA.debugLine="Dim DialogResultOk  As Int";
_dialogresultok = 0;
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public String  _cmdcancel_action() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub CmdCancel_Action";
 //BA.debugLineNum = 44;BA.debugLine="DialogResultOk=-3";
_dialogresultok = (int) (-3);
 //BA.debugLineNum = 45;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_action() throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub CmdOk_Action";
 //BA.debugLineNum = 48;BA.debugLine="If TxtValor.Text <>\"\" Then";
if ((_txtvalor.getText()).equals("") == false) { 
 //BA.debugLineNum = 49;BA.debugLine="Val= TxtValor.Text";
_val = _txtvalor.getText();
 //BA.debugLineNum = 50;BA.debugLine="DialogResultOk=-1";
_dialogresultok = (int) (-1);
 //BA.debugLineNum = 51;BA.debugLine="Frm.Close";
_frm.Close();
 };
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,String _value) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize(Parent As Form, Value As String )";
 //BA.debugLineNum = 23;BA.debugLine="Frm.Initialize(\"Frm\",  300,150)";
_frm.Initialize(ba,"Frm",300,150);
 //BA.debugLineNum = 24;BA.debugLine="Frm.SetOwner (Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 25;BA.debugLine="Frm.RootPane.LoadLayout(\"FrmInputBox\") 'Load the layout file.";
_frm.getRootPane().LoadLayout(ba,"FrmInputBox");
 //BA.debugLineNum = 26;BA.debugLine="Frm.Title =\"New Value\"";
_frm.setTitle("New Value");
 //BA.debugLineNum = 28;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 30;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 32;BA.debugLine="Val = Value";
_val = _value;
 //BA.debugLineNum = 33;BA.debugLine="TxtValor.Text = Val";
_txtvalor.setText(_val);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 37;BA.debugLine="DialogResultOk=-3";
_dialogresultok = (int) (-3);
 //BA.debugLineNum = 38;BA.debugLine="Frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 40;BA.debugLine="Return DialogResultOk";
if (true) return _dialogresultok;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
