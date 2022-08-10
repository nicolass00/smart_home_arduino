package ExControl.Domotica;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.debug.*;

public class frmabout extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("ExControl.Domotica", "ExControl.Domotica.frmabout", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
            if (ba.getClass().getName().endsWith("ShellBA")) {
			    ba.raiseEvent2(null, true, "CREATE", true, "ExControl.Domotica.frmabout",
                    ba);
		    }
        }
        ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4j.objects.JFX _fx = null;
public anywheresoftware.b4j.objects.Form _frm = null;
public anywheresoftware.b4j.objects.ImageViewWrapper _imgabout = null;
public ExControl.Domotica.main _main = null;
public ExControl.Domotica.valorescomunes _valorescomunes = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private fx As JFX";
_fx = new anywheresoftware.b4j.objects.JFX();
 //BA.debugLineNum = 4;BA.debugLine="Private frm As Form";
_frm = new anywheresoftware.b4j.objects.Form();
 //BA.debugLineNum = 6;BA.debugLine="Private ImgAbout As ImageView";
_imgabout = new anywheresoftware.b4j.objects.ImageViewWrapper();
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba,anywheresoftware.b4j.objects.Form _parent) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper _img = null;
 //BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize (Parent As Form )";
 //BA.debugLineNum = 10;BA.debugLine="frm.Initialize(\"frm\", 400,300)";
_frm.Initialize(ba,"frm",400,300);
 //BA.debugLineNum = 11;BA.debugLine="frm.Title = \"About ExControl OleMyHome\"";
_frm.setTitle("About ExControl OleMyHome");
 //BA.debugLineNum = 12;BA.debugLine="frm.SetFormStyle(\"UTILITY\")";
_frm.SetFormStyle("UTILITY");
 //BA.debugLineNum = 13;BA.debugLine="frm.RootPane.LoadLayout(\"FrmAbout\")";
_frm.getRootPane().LoadLayout(ba,"FrmAbout");
 //BA.debugLineNum = 14;BA.debugLine="frm.SetOwner(Parent)";
_frm.SetOwner(_parent);
 //BA.debugLineNum = 16;BA.debugLine="Dim img As Image";
_img = new anywheresoftware.b4j.objects.ImageViewWrapper.ImageWrapper();
 //BA.debugLineNum = 17;BA.debugLine="img.Initialize( File.DirApp & \"\\Img\", \"About.png\")";
_img.Initialize(__c.File.getDirApp()+"\\Img","About.png");
 //BA.debugLineNum = 18;BA.debugLine="ImgAbout.SetImage(img)";
_imgabout.SetImage((javafx.scene.image.Image)(_img.getObject()));
 //BA.debugLineNum = 19;BA.debugLine="frm.Show";
_frm.Show();
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
ba.sender = sender;
return BA.SubDelegator.SubNotFound;
}
}
