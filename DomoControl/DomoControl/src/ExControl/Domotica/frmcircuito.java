package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmcircuito extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmcircuito", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmcircuito",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombre = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtdescripcion = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdcancel = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtrango = null;
public int _dialogresultok = 0;
public ExControl.Domotica.valorescomunes._circuito _cir = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 5;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 7;BA.debugLine="Private TxtNombre As TextField";
_txtnombre = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private TxtDescripcion As TextField";
_txtdescripcion = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private CmdOK As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private CmdCancel As Button";
_cmdcancel = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 11;BA.debugLine="Private TxtRango As TextField";
_txtrango = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Dim DialogResultOk  As Int";
_dialogresultok = 0;
 //BA.debugLineNum = 13;BA.debugLine="Dim cir As Circuito";
_cir = new ExControl.Domotica.valorescomunes._circuito();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _cmdcancel_action() throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub CmdCancel_Action";
 //BA.debugLineNum = 41;BA.debugLine="DialogResultOk=-3";
_dialogresultok = (int) (-3);
 //BA.debugLineNum = 42;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_action() throws Exception{
int _r = 0;
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _m = null;
 //BA.debugLineNum = 44;BA.debugLine="Sub CmdOK_Action";
 //BA.debugLineNum = 45;BA.debugLine="If IsNumber(TxtRango.Text ) Then";
if (__c.IsNumber(_txtrango.getText())) { 
 //BA.debugLineNum = 46;BA.debugLine="Dim r As Int";
_r = 0;
 //BA.debugLineNum = 47;BA.debugLine="r = TxtRango.Text";
_r = (int)(Double.parseDouble(_txtrango.getText()));
 //BA.debugLineNum = 48;BA.debugLine="If r>0 AND  r<250 Then";
if (_r>0 && _r<250) { 
 //BA.debugLineNum = 49;BA.debugLine="cir.Nombre =TxtNombre.Text";
_cir.Nombre = _txtnombre.getText();
 //BA.debugLineNum = 50;BA.debugLine="cir.Descripcion = TxtDescripcion.text";
_cir.descripcion = _txtdescripcion.getText();
 //BA.debugLineNum = 51;BA.debugLine="cir.Rango = r";
_cir.Rango = _r;
 //BA.debugLineNum = 52;BA.debugLine="ValoresComunes.GuardarConfigCircuitos";
_valorescomunes._guardarconfigcircuitos();
 //BA.debugLineNum = 53;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 54;BA.debugLine="Return";
if (true) return "";
 };
 };
 //BA.debugLineNum = 57;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 58;BA.debugLine="m.Show(\"RANGO ERROR!!!\",\"ERROR\")";
_m.Show("RANGO ERROR!!!","ERROR");
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,int _numerocircuito) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(Parent As Form, numeroCircuito As Int  )";
 //BA.debugLineNum = 18;BA.debugLine="Frm.Initialize(\"Frm\",  325 ,250)";
_frm.Initialize(ba,"Frm",325,250);
 //BA.debugLineNum = 19;BA.debugLine="Frm.SetOwner (Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 20;BA.debugLine="Frm.RootPane.LoadLayout(\"FrmCircuito\") 'Load the layout file.";
_frm.getRootPane().LoadLayout(ba,"FrmCircuito");
 //BA.debugLineNum = 21;BA.debugLine="Frm.Title =\"New Value\"";
_frm.setTitle("New Value");
 //BA.debugLineNum = 23;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 25;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 27;BA.debugLine="cir = ValoresComunes.Circuitos(numeroCircuito)";
_cir = _valorescomunes._circuitos[_numerocircuito];
 //BA.debugLineNum = 29;BA.debugLine="TxtNombre.Text =cir.Nombre";
_txtnombre.setText(_cir.Nombre);
 //BA.debugLineNum = 30;BA.debugLine="TxtDescripcion.Text = cir.Descripcion";
_txtdescripcion.setText(_cir.descripcion);
 //BA.debugLineNum = 31;BA.debugLine="TxtRango.Text = cir.Rango";
_txtrango.setText(BA.NumberToString(_cir.Rango));
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 34;BA.debugLine="DialogResultOk=-3";
_dialogresultok = (int) (-3);
 //BA.debugLineNum = 35;BA.debugLine="Frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 37;BA.debugLine="Return DialogResultOk";
if (true) return _dialogresultok;
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
