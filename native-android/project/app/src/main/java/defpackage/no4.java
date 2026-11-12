package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class no4 extends MenuInflater {
    public static final Class[] e;
    public static final Class[] f;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] clsArr = {Context.class};
        e = clsArr;
        f = clsArr;
    }

    public no4(Context context) {
        super(context);
        this.c = context;
        Object[] objArr = {context};
        this.a = objArr;
        this.b = objArr;
    }

    public static Object a(Object obj) {
        return (!(obj instanceof Activity) && (obj instanceof ContextWrapper)) ? a(((ContextWrapper) obj).getBaseContext()) : obj;
    }

    public final void b(XmlPullParser xmlPullParser, AttributeSet attributeSet, Menu menu) throws XmlPullParserException, IOException {
        int i;
        ColorStateList colorStateList;
        int resourceId;
        mo4 mo4Var = new mo4(this, menu);
        int eventType = xmlPullParser.getEventType();
        do {
            i = 2;
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlPullParser.next();
                    break;
                } else {
                    tb4.e("Expecting menu, got ".concat(name));
                    return;
                }
            }
            eventType = xmlPullParser.next();
        } while (eventType != 1);
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType == 1) {
                tb4.e("Unexpected end of document");
                return;
            }
            Menu menu2 = mo4Var.a;
            if (eventType == i) {
                if (!z2) {
                    String name2 = xmlPullParser.getName();
                    boolean zEquals = name2.equals("group");
                    Context context = this.c;
                    if (zEquals) {
                        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, st3.q);
                        mo4Var.b = typedArrayObtainStyledAttributes.getResourceId(1, 0);
                        mo4Var.c = typedArrayObtainStyledAttributes.getInt(3, 0);
                        mo4Var.d = typedArrayObtainStyledAttributes.getInt(4, 0);
                        mo4Var.e = typedArrayObtainStyledAttributes.getInt(5, 0);
                        mo4Var.f = typedArrayObtainStyledAttributes.getBoolean(2, true);
                        mo4Var.g = typedArrayObtainStyledAttributes.getBoolean(0, true);
                        typedArrayObtainStyledAttributes.recycle();
                    } else if (name2.equals("item")) {
                        TypedArray typedArrayObtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, st3.r);
                        mo4Var.i = typedArrayObtainStyledAttributes2.getResourceId(2, 0);
                        mo4Var.j = (typedArrayObtainStyledAttributes2.getInt(5, mo4Var.c) & (-65536)) | (typedArrayObtainStyledAttributes2.getInt(6, mo4Var.d) & 65535);
                        mo4Var.k = typedArrayObtainStyledAttributes2.getText(7);
                        mo4Var.l = typedArrayObtainStyledAttributes2.getText(8);
                        mo4Var.m = typedArrayObtainStyledAttributes2.getResourceId(0, 0);
                        String string = typedArrayObtainStyledAttributes2.getString(9);
                        mo4Var.n = string == null ? (char) 0 : string.charAt(0);
                        mo4Var.o = typedArrayObtainStyledAttributes2.getInt(16, 4096);
                        String string2 = typedArrayObtainStyledAttributes2.getString(10);
                        mo4Var.p = string2 == null ? (char) 0 : string2.charAt(0);
                        mo4Var.q = typedArrayObtainStyledAttributes2.getInt(20, 4096);
                        if (typedArrayObtainStyledAttributes2.hasValue(11)) {
                            mo4Var.r = typedArrayObtainStyledAttributes2.getBoolean(11, false) ? 1 : 0;
                        } else {
                            mo4Var.r = mo4Var.e;
                        }
                        mo4Var.s = typedArrayObtainStyledAttributes2.getBoolean(3, false);
                        mo4Var.t = typedArrayObtainStyledAttributes2.getBoolean(4, mo4Var.f);
                        mo4Var.u = typedArrayObtainStyledAttributes2.getBoolean(1, mo4Var.g);
                        mo4Var.v = typedArrayObtainStyledAttributes2.getInt(21, -1);
                        mo4Var.y = typedArrayObtainStyledAttributes2.getString(12);
                        mo4Var.w = typedArrayObtainStyledAttributes2.getResourceId(13, 0);
                        mo4Var.x = typedArrayObtainStyledAttributes2.getString(15);
                        String string3 = typedArrayObtainStyledAttributes2.getString(14);
                        boolean z3 = string3 != null;
                        if (z3 && mo4Var.w == 0 && mo4Var.x == null) {
                            mo4Var.z = (e5) mo4Var.a(string3, f, this.b);
                        } else {
                            if (z3) {
                                Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                            }
                            mo4Var.z = null;
                        }
                        mo4Var.A = typedArrayObtainStyledAttributes2.getText(17);
                        mo4Var.B = typedArrayObtainStyledAttributes2.getText(22);
                        if (typedArrayObtainStyledAttributes2.hasValue(19)) {
                            mo4Var.D = aw0.c(typedArrayObtainStyledAttributes2.getInt(19, -1), mo4Var.D);
                        } else {
                            mo4Var.D = null;
                        }
                        if (typedArrayObtainStyledAttributes2.hasValue(18)) {
                            if (!typedArrayObtainStyledAttributes2.hasValue(18) || (resourceId = typedArrayObtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = ud3.n(context, resourceId)) == null) {
                                colorStateList = typedArrayObtainStyledAttributes2.getColorStateList(18);
                            }
                            mo4Var.C = colorStateList;
                        } else {
                            mo4Var.C = null;
                        }
                        typedArrayObtainStyledAttributes2.recycle();
                        mo4Var.h = false;
                        xmlPullParser = xmlPullParser;
                    } else if (name2.equals("menu")) {
                        mo4Var.h = true;
                        SubMenu subMenuAddSubMenu = menu2.addSubMenu(mo4Var.b, mo4Var.i, mo4Var.j, mo4Var.k);
                        mo4Var.b(subMenuAddSubMenu.getItem());
                        xmlPullParser = xmlPullParser;
                        b(xmlPullParser, attributeSet, subMenuAddSubMenu);
                    } else {
                        xmlPullParser = xmlPullParser;
                        str = name2;
                        z2 = true;
                    }
                }
                z = z;
            } else if (eventType != 3) {
                z = z;
            } else {
                String name3 = xmlPullParser.getName();
                if (z2 && name3.equals(str)) {
                    xmlPullParser = xmlPullParser;
                    z2 = false;
                    str = null;
                } else {
                    if (name3.equals("group")) {
                        mo4Var.b = 0;
                        mo4Var.c = 0;
                        mo4Var.d = 0;
                        mo4Var.e = 0;
                        mo4Var.f = true;
                        mo4Var.g = true;
                    } else if (name3.equals("item")) {
                        if (!mo4Var.h) {
                            e5 e5Var = mo4Var.z;
                            if (e5Var == null || !e5Var.a()) {
                                mo4Var.h = true;
                                mo4Var.b(menu2.add(mo4Var.b, mo4Var.i, mo4Var.j, mo4Var.k));
                            } else {
                                mo4Var.h = true;
                                mo4Var.b(menu2.addSubMenu(mo4Var.b, mo4Var.i, mo4Var.j, mo4Var.k).getItem());
                            }
                        }
                    } else if (name3.equals("menu")) {
                        z = true;
                    }
                    z = z;
                }
            }
            eventType = xmlPullParser.next();
            i = 2;
            z = z;
            z2 = z2;
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof qu2)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser layout = null;
        boolean z = false;
        try {
            try {
                layout = this.c.getResources().getLayout(i);
                AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(layout);
                if (menu instanceof qu2) {
                    qu2 qu2Var = (qu2) menu;
                    if (!qu2Var.p) {
                        qu2Var.y();
                        z = true;
                    }
                }
                b(layout, attributeSetAsAttributeSet, menu);
                if (z) {
                    ((qu2) menu).x();
                }
                layout.close();
            } catch (IOException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            } catch (XmlPullParserException e3) {
                throw new InflateException("Error inflating menu XML", e3);
            }
        } catch (Throwable th) {
            if (z) {
                ((qu2) menu).x();
            }
            if (layout != null) {
                layout.close();
            }
            throw th;
        }
    }
}
