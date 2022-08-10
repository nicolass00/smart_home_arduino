package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmconexionext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmconexionext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmconexionext",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtpassword = null;
public anywheresoftware.b4j.objects.CheckboxWrapper _chkconection = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdcancel = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper _txtmail = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private TxtPassword As TextField";
_txtpassword = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Private ChkConection As CheckBox";
_chkconection = new anywheresoftware.b4j.objects.CheckboxWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private CmdCancel As Button";
_cmdcancel = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private CmdOk As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim Frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 9;BA.debugLine="Private TxtMail As TextField";
_txtmail = new anywheresoftware.b4j.objects.TextInputControlWrapper.TextFieldWrapper();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public String  _cmdcancel_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub CmdCancel_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 43;BA.debugLine="Frm.Close";
_frm.Close();
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes _m = null;
 //BA.debugLineNum = 21;BA.debugLine="Sub CmdOk_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 23;BA.debugLine="If TxtMail.Text.Contains(\"@\") AND TxtMail.Text.Length > 3 Then";
if (_txtmail.getText().contains("@") && _txtmail.getText().length()>3) { 
 //BA.debugLineNum = 24;BA.debugLine="If  TxtPassword.Text .Length = 8 Then";
if (_txtpassword.getText().length()==8) { 
 //BA.debugLineNum = 25;BA.debugLine="ValoresComunes.Mail = TxtMail.Text";
_valorescomunes._mail = _txtmail.getText();
 //BA.debugLineNum = 26;BA.debugLine="ValoresComunes.Password = TxtPassword.Text";
_valorescomunes._password = _txtpassword.getText();
 //BA.debugLineNum = 27;BA.debugLine="ValoresComunes.ConexionSegura =  ChkConection.Checked";
_valorescomunes._conexionsegura = _chkconection.getChecked();
 //BA.debugLineNum = 28;BA.debugLine="ValoresComunes.PassswordByte = ValoresComunes.Password.GetBytes (\"UTF8\")";
_valorescomunes._passswordbyte = _valorescomunes._password.getBytes("UTF8");
 //BA.debugLineNum = 29;BA.debugLine="ValoresComunes.GuardaConexionExterna";
_valorescomunes._guardaconexionexterna();
 //BA.debugLineNum = 30;BA.debugLine="Frm.Close";
_frm.Close();
 }else {
 //BA.debugLineNum = 32;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 33;BA.debugLine="m.Show (\"Password lenght = 8\",\"Error\")";
_m.Show("Password lenght = 8","Error");
 };
 }else {
 //BA.debugLineNum = 36;BA.debugLine="Dim m As Msgboxes";
_m = new anywheresoftware.b4a.agraham.jmsgboxes.Msgboxes();
 //BA.debugLineNum = 37;BA.debugLine="m.Show (\"check mail\",\"Error\")";
_m.Show("check mail","Error");
 };
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(Parent As Form )";
 //BA.debugLineNum = 13;BA.debugLine="Frm.Initialize(\"Frm\", 330, 210)";
_frm.Initialize(ba,"Frm",330,210);
 //BA.debugLineNum = 14;BA.debugLine="Frm.RootPane.LoadLayout(\"FrmExternalConection\") 'Load the layout file.";
_frm.getRootPane().LoadLayout(ba,"FrmExternalConection");
 //BA.debugLineNum = 16;BA.debugLine="Frm.Title = \"Setting Conection\"";
_frm.setTitle("Setting Conection");
 //BA.debugLineNum = 17;BA.debugLine="Frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 19;BA.debugLine="Frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Public Sub Show() As Int";
 //BA.debugLineNum = 48;BA.debugLine="TxtPassword.Text = ValoresComunes.Password";
_txtpassword.setText(_valorescomunes._password);
 //BA.debugLineNum = 49;BA.debugLine="TxtMail.Text = ValoresComunes.Mail";
_txtmail.setText(_valorescomunes._mail);
 //BA.debugLineNum = 50;BA.debugLine="ChkConection.Checked =  ValoresComunes.ConexionSegura";
_chkconection.setChecked(_valorescomunes._conexionsegura);
 //BA.debugLineNum = 51;BA.debugLine="Frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return 0;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
