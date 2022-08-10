package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmsetcentral extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmsetcentral", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmsetcentral",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtnombre = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtip = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtportin = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtportout = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdcancel = null;
public String _nombre = "";
public String _ip = "";
public int _portin = 0;
public int _portout = 0;
public int _val = 0;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private TxtNombre As TextField";
_txtnombre = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private TxtIp As TextField";
_txtip = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private TxtPortIn As TextField";
_txtportin = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Private TxtPortOut As TextField";
_txtportout = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 9;BA.debugLine="Private CmdOk As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 10;BA.debugLine="Private CmdCancel As Button";
_cmdcancel = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 12;BA.debugLine="Public Nombre, Ip As String";
_nombre = "";
_ip = "";
 //BA.debugLineNum = 13;BA.debugLine="Public PortIn, PortOut As Int";
_portin = 0;
_portout = 0;
 //BA.debugLineNum = 15;BA.debugLine="Dim Val As Int";
_val = 0;
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return "";
}
public String  _cmdcancel_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub CmdCancel_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 30;BA.debugLine="Val =0";
_val = (int) (0);
 //BA.debugLineNum = 31;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub CmdOk_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 34;BA.debugLine="Nombre=TxtNombre.Text";
_nombre = _txtnombre.getText();
 //BA.debugLineNum = 35;BA.debugLine="Ip=TxtIp.Text";
_ip = _txtip.getText();
 //BA.debugLineNum = 36;BA.debugLine="PortIn=TxtPortIn.Text";
_portin = (int)(Double.parseDouble(_txtportin.getText()));
 //BA.debugLineNum = 37;BA.debugLine="PortOut=TxtPortOut.Text";
_portout = (int)(Double.parseDouble(_txtportout.getText()));
 //BA.debugLineNum = 40;BA.debugLine="Val =1";
_val = (int) (1);
 //BA.debugLineNum = 41;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize(Parent As Form )";
 //BA.debugLineNum = 20;BA.debugLine="Frm.Initialize(\"Frm\", 398, 203)";
_frm.Initialize(ba,"Frm",398,203);
 //BA.debugLineNum = 21;BA.debugLine="Frm.RootPane.LoadLayout(\"FrmConfigCentral\") 'Load the layout file.";
_frm.getRootPane().LoadLayout(ba,"FrmConfigCentral");
 //BA.debugLineNum = 23;BA.debugLine="Frm.Title = \"Setting Central\"";
_frm.setTitle("Setting Central");
 //BA.debugLineNum = 24;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 26;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Show() As Int";
 //BA.debugLineNum = 44;BA.debugLine="Val =-1";
_val = (int) (-1);
 //BA.debugLineNum = 47;BA.debugLine="TxtNombre.Text = Nombre";
_txtnombre.setText(_nombre);
 //BA.debugLineNum = 48;BA.debugLine="TxtIp.Text = Ip";
_txtip.setText(_ip);
 //BA.debugLineNum = 49;BA.debugLine="TxtPortIn.Text = PortIn";
_txtportin.setText(BA.NumberToString(_portin));
 //BA.debugLineNum = 50;BA.debugLine="TxtPortOut.Text = PortOut";
_txtportout.setText(BA.NumberToString(_portout));
 //BA.debugLineNum = 52;BA.debugLine="Frm.ShowAndWait";
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
