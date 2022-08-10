package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frminputbox2 extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frminputbox2", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frminputbox2",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdcancel = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombre = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdescripcion = null;
public String _nombre = "";
public String _descripcion = "";
public int _dialogresultok = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private CmdOk As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private CmdCancel As Button";
_cmdcancel = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private TxtNombre As TextField";
_txtnombre = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private TxtDescripcion As TextField";
_txtdescripcion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Dim Nombre, Descripcion As String";
_nombre = "";
_descripcion = "";
 //BA.debugLineNum = 10;BA.debugLine="Dim DialogResultOk  As Int";
_dialogresultok = 0;
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public String  _cmdcancel_action() throws Exception{
 //BA.debugLineNum = 39;BA.debugLine="Sub CmdCancel_Action";
 //BA.debugLineNum = 40;BA.debugLine="DialogResultOk=-3";
_dialogresultok = (int) (-3);
 //BA.debugLineNum = 41;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_action() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub CmdOk_Action";
 //BA.debugLineNum = 44;BA.debugLine="If TxtNombre.Text <>\"\"  Then";
if ((_txtnombre.getText()).equals("") == false) { 
 //BA.debugLineNum = 45;BA.debugLine="Nombre= TxtNombre.Text";
_nombre = _txtnombre.getText();
 //BA.debugLineNum = 46;BA.debugLine="Descripcion = TxtDescripcion .Text";
_descripcion = _txtdescripcion.getText();
 //BA.debugLineNum = 47;BA.debugLine="DialogResultOk=-1";
_dialogresultok = (int) (-1);
 //BA.debugLineNum = 48;BA.debugLine="Frm.Close";
_frm.Close();
 };
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,String _name,String _description) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(Parent As Form, Name As String, Description As String )";
 //BA.debugLineNum = 16;BA.debugLine="Frm.Initialize(\"Frm\",  330,175)";
_frm.Initialize(ba,"Frm",330,175);
 //BA.debugLineNum = 17;BA.debugLine="Frm.SetOwner (Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 18;BA.debugLine="Frm.RootPane.LoadLayout(\"FrmInputBox2\") 'Load the layout file.";
_frm.getRootPane().LoadLayout(ba,"FrmInputBox2");
 //BA.debugLineNum = 19;BA.debugLine="Frm.Title =\"New Value\"";
_frm.setTitle("New Value");
 //BA.debugLineNum = 21;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 23;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 25;BA.debugLine="Nombre = Name";
_nombre = _name;
 //BA.debugLineNum = 26;BA.debugLine="Descripcion = Description";
_descripcion = _description;
 //BA.debugLineNum = 28;BA.debugLine="TxtNombre.Text= Nombre";
_txtnombre.setText(_nombre);
 //BA.debugLineNum = 29;BA.debugLine="TxtDescripcion.Text  = Description";
_txtdescripcion.setText(_description);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 33;BA.debugLine="DialogResultOk=-3";
_dialogresultok = (int) (-3);
 //BA.debugLineNum = 34;BA.debugLine="Frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 36;BA.debugLine="Return DialogResultOk";
if (true) return _dialogresultok;
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
