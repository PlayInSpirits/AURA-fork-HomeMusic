package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import android.util.Xml;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ib0 {
    public boolean a;
    public int b;
    public int c;
    public float d;
    public String e;
    public boolean f;
    public int g;

    public ib0(ib0 r2, Object r3) {
        this.a = false;
        r2.getClass();
        this.b = r2.b;
        b(r3);
    }

    public static void a(Context r16, XmlResourceParser r17, HashMap r18) {
        TypedArray r0 = r16.obtainStyledAttributes(Xml.asAttributeSet(r17), kt3.d);
        int r1 = r0.getIndexCount();
        String r4 = null;
        int r6 = 0;
        int r7 = 0;
        boolean r8 = false;
        Object r5 = null;
    L3:
        if (r6 >= r1) goto L47;
        int r9 = r0.getIndex(r6);
        int r10 = 1;
        if (r9 != 0) goto L12;
        r4 = r0.getString(r9);
        if (r4 == null) goto L46;
        if (r4.length() <= 0) goto L46;
        r4 = Character.toUpperCase(r4.charAt(0)) + r4.substring(1);
    L46:
        r6 = r6 + 1;
        goto L3
    L12:
        if (r9 != 10) goto L15;
        r4 = r0.getString(r9);
        r8 = true;
        goto L46
    L15:
        if (r9 != 1) goto L17;
        r5 = Boolean.valueOf(r0.getBoolean(r9, false));
        r7 = 6;
        goto L46
    L17:
        int r12 = 3;
        if (r9 != 3) goto L21;
        r5 = Integer.valueOf(r0.getColor(r9, 0));
    L20:
        r7 = r12;
        goto L46
    L21:
        r12 = 4;
        if (r9 != 2) goto L25;
        r5 = Integer.valueOf(r0.getColor(r9, 0));
        goto L20
    L25:
        if (r9 != 7) goto L28;
        r5 = Float.valueOf(TypedValue.applyDimension(1, r0.getDimension(r9, 0.0f), r16.getResources().getDisplayMetrics()));
    L27:
        r7 = 7;
        goto L46
    L28:
        if (r9 != 4) goto L30;
        r5 = Float.valueOf(r0.getDimension(r9, 0.0f));
        goto L27
    L30:
        r12 = 5;
        if (r9 != 5) goto L34;
        r5 = Float.valueOf(r0.getFloat(r9, Float.NaN));
        r7 = 2;
        goto L46
    L34:
        if (r9 != 6) goto L38;
        r5 = Integer.valueOf(r0.getInteger(r9, -1));
    L36:
        r7 = r10;
        goto L46
    L38:
        if (r9 != 9) goto L40;
        r5 = r0.getString(r9);
        goto L20
    L40:
        r10 = 8;
        if (r9 != 8) goto L46;
        int r11 = r0.getResourceId(r9, -1);
        if (r11 != (-1)) goto L45;
        r11 = r0.getInt(r9, -1);
    L45:
        r5 = Integer.valueOf(r11);
        goto L36
    L47:
        if (r4 == null) goto L50;
        if (r5 == null) goto L50;
        ib0 r2 = new ib0();
        r2.b = r7;
        r2.a = r8;
        r2.b(r5);
        r18.put(r4, r2);
    L50:
        r0.recycle();
    }

    public final void b(Object r2) {
        switch(xa3.w(this.b)) {
            case 0: goto L15;
            case 1: goto L13;
            case 2: goto L11;
            case 3: goto L11;
            case 4: goto L9;
            case 5: goto L7;
            case 6: goto L5;
            case 7: goto L15;
            default: goto L4;
        };
    L4:
        return;
    L5:
        this.d = ((Float) r2).floatValue();
        return;
    L7:
        this.f = ((Boolean) r2).booleanValue();
        return;
    L9:
        this.e = (String) r2;
        return;
    L11:
        this.g = ((Integer) r2).intValue();
        return;
    L13:
        this.d = ((Float) r2).floatValue();
        return;
    L15:
        this.c = ((Integer) r2).intValue();
    }
}
