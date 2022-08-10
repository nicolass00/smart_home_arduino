package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmbarra extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmbarra", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmbarra",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.SliderWrapper _sldbarra = null;
public anywheresoftware.b4j.objects.LabelWrapper _lblvalor = null;
public anywheresoftware.b4j.objects.ButtonWrapper _cmdok = null;
public int _val = 0;
public char _indicadorunidad = '\0';
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 5;BA.debugLine="Private SldBarra As Slider";
_sldbarra = new anywheresoftware.b4j.objects.SliderWrapper();
 //BA.debugLineNum = 6;BA.debugLine="Private LblValor As Label";
_lblvalor = new anywheresoftware.b4j.objects.LabelWrapper();
 //BA.debugLineNum = 7;BA.debugLine="Private CmdOk As Button";
_cmdok = new anywheresoftware.b4j.objects.ButtonWrapper();
 //BA.debugLineNum = 8;BA.debugLine="Dim Val As Int";
_val = 0;
 //BA.debugLineNum = 9;BA.debugLine="Dim IndicadorUnidad As Char";
_indicadorunidad = '\0';
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _cmdok_mouseclicked(anywheresoftware.b4j.objects.NodeWrapper.MouseEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub CmdOk_MouseClicked (EventData As MouseEvent)";
 //BA.debugLineNum = 52;BA.debugLine="frm.Close";
_frm.Close();
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return "";
}
public String  _frm_closerequest(anywheresoftware.b4j.objects.NodeWrapper.ConcreteEventWrapper _eventdata) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub frm_CloseRequest (EventData As Event)";
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent,int _minimo,int _maximo,int _valor,char _unidad) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize (Parent As Form, Minimo As Int, Maximo As Int,Valor As Int, Unidad As Char )";
 //BA.debugLineNum = 17;BA.debugLine="frm.Initialize(\"frm\", 300dip, 200dip)";
_frm.Initialize(ba,"frm",__c.DipToCurrent((int) (300)),__c.DipToCurrent((int) (200)));
 //BA.debugLineNum = 18;BA.debugLine="frm.Title = \"Choose Value\"";
_frm.setTitle("Choose Value");
 //BA.debugLineNum = 19;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 20;BA.debugLine="frm.RootPane.LoadLayout(\"FrmBarra\")";
_frm.getRootPane().LoadLayout(ba,"FrmBarra");
 //BA.debugLineNum = 21;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 22;BA.debugLine="SldBarra.MaxValue = Maximo";
_sldbarra.setMaxValue(_maximo);
 //BA.debugLineNum = 23;BA.debugLine="SldBarra.MinValue = Minimo";
_sldbarra.setMinValue(_minimo);
 //BA.debugLineNum = 24;BA.debugLine="LblValor.Font  = ValoresComunes.FontH1";
_lblvalor.setFont(_valorescomunes._fonth1);
 //BA.debugLineNum = 25;BA.debugLine="IndicadorUnidad= Unidad";
_indicadorunidad = _unidad;
 //BA.debugLineNum = 26;BA.debugLine="If Valor < Minimo Then";
if (_valor<_minimo) { 
 //BA.debugLineNum = 27;BA.debugLine="Val= Minimo";
_val = _minimo;
 }else {
 //BA.debugLineNum = 29;BA.debugLine="Val= Valor";
_val = _valor;
 };
 //BA.debugLineNum = 31;BA.debugLine="LblValor.Text = Valor & IndicadorUnidad";
_lblvalor.setText(BA.NumberToString(_valor)+BA.ObjectToString(_indicadorunidad));
 //BA.debugLineNum = 32;BA.debugLine="SldBarra.Value =  Valor";
_sldbarra.setValue(_valor);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return "";
}
public String  _lstcolors_selectedindexchanged(int _index) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub lstColors_SelectedIndexChanged(Index As Int)";
 //BA.debugLineNum = 42;BA.debugLine="If Index > -1 Then frm.Close";
if (_index>-1) { 
_frm.Close();};
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return "";
}
public int  _show() throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Public Sub Show As Int";
 //BA.debugLineNum = 36;BA.debugLine="frm.ShowAndWait";
_frm.ShowAndWait();
 //BA.debugLineNum = 38;BA.debugLine="Return Val";
if (true) return _val;
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return 0;
}
public String  _sldbarra_valuechange(double _value) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SldBarra_ValueChange (Value As Double)";
 //BA.debugLineNum = 48;BA.debugLine="Val  = Value";
_val = (int) (_value);
 //BA.debugLineNum = 49;BA.debugLine="LblValor.Text = Val & IndicadorUnidad";
_lblvalor.setText(BA.NumberToString(_val)+BA.ObjectToString(_indicadorunidad));
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
