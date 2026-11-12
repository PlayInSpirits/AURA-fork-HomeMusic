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
    public static final Class[] e = null;
    public static final Class[] f = null;
    public final Object[] a;
    public final Object[] b;
    public final Context c;
    public Object d;

    static {
        Class[] r0 = {Context.class};
        e = r0;
        f = r0;
    }

    public no4(Context r1) {
        super(r1);
        this.c = r1;
        Object[] r2 = {r1};
        this.a = r2;
        this.b = r2;
    }

    public static Object a(Object r1) {
        if ((r1 instanceof Activity) == false) goto L6;
        return r1;
    L6:
        if ((r1 instanceof ContextWrapper) == true) goto L8;
        return r1;
    L8:
        return a(((ContextWrapper) r1).getBaseContext());
    }

    public final void b(XmlPullParser r17, AttributeSet r18, Menu r19) {
        mo4 r2 = new mo4(this, r19);
        int r3 = r17.getEventType();
    L3:
        int r4 = 2;
        if (r3 == 2) goto L5;
        r3 = r17.next();
        if (r3 != 1) goto L3;
    L12:
        boolean r9 = false;
        boolean r10 = false;
        String r11 = null;
    L13:
        if (r9 == true) goto L107;
        if (r3 == 1) goto L95;
        Menu r15 = r2.a;
        if (r3 == r4) goto L41;
        if (r3 == 3) goto L19;
    L18:
        r9 = r9;
    L94:
        r3 = r17.next();
        r4 = 2;
        r9 = r9;
        r10 = r10;
        goto L13
    L19:
        String r5 = r17.getName();
        if (r10 == false) goto L25;
        if (r5.equals(r11) == false) goto L25;
        r17 = r17;
        r10 = false;
        r11 = null;
    L25:
        if (r5.equals("group") == false) goto L28;
        r2.b = 0;
        r2.c = 0;
        r2.d = 0;
        r2.e = 0;
        r2.f = true;
        r2.g = true;
        goto L18
    L28:
        if (r5.equals("item") == false) goto L38;
        if (r2.h == true) goto L18;
        e5 r6 = r2.z;
        if (r6 != null) goto L34;
    L36:
        r2.h = true;
        r2.b(r15.add(r2.b, r2.i, r2.j, r2.k));
        goto L18
    L34:
        if (r6.a() == false) goto L36;
        r2.h = true;
        r2.b(r15.addSubMenu(r2.b, r2.i, r2.j, r2.k).getItem());
        goto L18
    L38:
        if (r5.equals("menu") == false) goto L18;
        r9 = true;
        goto L94
    L41:
        if (r10 == true) goto L18;
        String r7 = r17.getName();
        boolean r14 = r7.equals("group");
        Context r8 = this.c;
        if (r14 == false) goto L47;
        TypedArray r12 = r8.obtainStyledAttributes(r18, st3.q);
        r2.b = r12.getResourceId(1, 0);
        r2.c = r12.getInt(3, 0);
        r2.d = r12.getInt(4, 0);
        r2.e = r12.getInt(5, 0);
        r2.f = r12.getBoolean(2, true);
        r2.g = r12.getBoolean(0, true);
        r12.recycle();
        goto L18
    L47:
        if (r7.equals("item") == false) goto L91;
        TypedArray r13 = r8.obtainStyledAttributes(r18, st3.r);
        r2.i = r13.getResourceId(2, 0);
        r2.j = (r13.getInt(5, r2.c) & (-65536)) | (r13.getInt(6, r2.d) & 65535);
        r2.k = r13.getText(7);
        r2.l = r13.getText(8);
        r2.m = r13.getResourceId(0, 0);
        String r16 = r13.getString(9);
        if (r16 != null) goto L51;
        char r110 = 0;
    L52:
        r2.n = r110;
        r2.o = r13.getInt(16, 4096);
        String r111 = r13.getString(10);
        if (r111 != null) goto L55;
        char r112 = 0;
    L56:
        r2.p = r112;
        r2.q = r13.getInt(20, 4096);
        if (r13.hasValue(11) == false) goto L59;
        r2.r = r13.getBoolean(11, false) ? 1 : 0;
    L60:
        r2.s = r13.getBoolean(3, false);
        r2.t = r13.getBoolean(4, r2.f);
        r2.u = r13.getBoolean(1, r2.g);
        r2.v = r13.getInt(21, -1);
        r2.y = r13.getString(12);
        r2.w = r13.getResourceId(13, 0);
        r2.x = r13.getString(15);
        String r20 = r13.getString(14);
        if (r20 == null) goto L63;
        boolean r113 = true;
    L64:
        if (r113 == true) goto L66;
    L70:
        if (r113 == false) goto L72;
        Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
    L72:
        r2.z = null;
    L73:
        r2.A = r13.getText(17);
        r2.B = r13.getText(22);
        if (r13.hasValue(19) == false) goto L76;
        r2.D = aw0.c(r13.getInt(19, -1), r2.D);
    L78:
        if (r13.hasValue(18) == true) goto L80;
        r2.C = null;
    L89:
        r13.recycle();
        r2.h = false;
        r17 = r17;
        goto L94
    L80:
        if (r13.hasValue(18) == false) goto L86;
        int r114 = r13.getResourceId(18, 0);
        if (r114 == 0) goto L86;
        ColorStateList r21 = ud3.n(r8, r114);
        if (r21 == null) goto L86;
    L87:
        r2.C = r21;
    L86:
        r21 = r13.getColorStateList(18);
        goto L87
    L76:
        r2.D = null;
        goto L78
    L66:
        if (r2.w != 0) goto L70;
        if (r2.x != null) goto L70;
        r2.z = (e5) r2.a(r20, f, this.b);
        goto L73
    L63:
        r113 = false;
        goto L64
    L59:
        r2.r = r2.e;
        goto L60
    L55:
        r112 = r111.charAt(0);
        goto L56
    L51:
        r110 = r16.charAt(0);
        goto L52
    L91:
        if (r7.equals("menu") == false) goto L93;
        r2.h = true;
        SubMenu r22 = r15.addSubMenu(r2.b, r2.i, r2.j, r2.k);
        r2.b(r22.getItem());
        r17 = r17;
        b(r17, r18, r22);
        goto L94
    L93:
        r17 = r17;
        r11 = r7;
        r10 = true;
        goto L94
    L95:
        tb4.e("Unexpected end of document");
        return;
    L107:
        return;
    L5:
        String r23 = r17.getName();
        if (r23.equals("menu") == false) goto L8;
        r3 = r17.next();
        goto L12
    L8:
        tb4.e("Expecting menu, got ".concat(r23));
    }

    @Override // android.view.MenuInflater
    public final void inflate(int r6, Menu r7) {
        if ((r7 instanceof qu2) == true) goto L6;
        super.inflate(r6, r7);
        return;
    L6:
        XmlResourceParser r1 = null;
        boolean r2 = false;
        r1 = this.c.getResources().getLayout(r6);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        AttributeSet r8 = Xml.asAttributeSet(r1);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if ((r7 instanceof qu2) == false) goto L18;
        qu2 r3 = (qu2) r7;     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if (r3.p == true) goto L18;
        r3.y();     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        r2 = true;
    L18:
        b(r1, r8, r7);     // Catch: Throwable -> L12 IOException -> L14 XmlPullParserException -> L16
        if (r2 == false) goto L21;
        ((qu2) r7).x();
    L21:
        r1.close();
        return;
    L12:
        th = move-exception;
        if (r2 == false) goto L29;
        ((qu2) r7).x();
    L29:
        if (r1 == null) goto L31;
        r1.close();
    L31:
        throw th;
    L14:
        e = move-exception;
        throw new InflateException("Error inflating menu XML", e);     // Catch: Throwable -> L12
    L16:
        e = move-exception;
        throw new InflateException("Error inflating menu XML", e);     // Catch: Throwable -> L12
    }
}
