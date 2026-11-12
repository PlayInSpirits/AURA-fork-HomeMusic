package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w23 {
    public static final ThreadLocal c = null;
    public final Context a;
    public final u43 b;

    static {
        c = new ThreadLocal();
    }

    public w23(Context r1, u43 r2) {
        r2.getClass();
        this.a = r1;
        this.b = r2;
    }

    public static z13 c(TypedArray r27, Resources r28, int r29) {
        boolean r3 = r27.getBoolean(3, false);
        ThreadLocal r4 = c;
        TypedValue r5 = (TypedValue) r4.get();
        if (r5 != null) goto L5;
        r5 = new TypedValue();
        r4.set(r5);
    L5:
        String r6 = r27.getString(2);
        h33 r12 = h33.c;
        a33 r13 = h33.j;
        a33 r14 = h33.p;
        a33 r15 = h33.m;
        a33 r16 = h33.g;
        a33 r17 = h33.d;
        b33 r7 = h33.f;
        b33 r1 = h33.o;
        b33 r2 = h33.l;
        h33 r18 = h33.i;
        b33 r19 = h33.b;
        if (r6 == null) goto L91;
        a33 r23 = r15;
        String r110 = r28.getResourcePackageName(r29);
        boolean r24 = r3;
        if ("integer".equals(r6) == false) goto L10;
        h33 r26 = r2;
        b33 r25 = r7;
        r12 = r19;
    L92:
        boolean r8 = true;
        if (r27.getValue(1, r5) == false) goto L156;
        int r9 = r5.resourceId;
        if (r12 != r12) goto L108;
        if (r9 == 0) goto L99;
        int r10 = r9;
    L103:
        Object r0 = Integer.valueOf(r10);
        r8 = true;
    L104:
        Object r11 = r0;
    L105:
        h33 r20 = r26;
    L157:
        if (r11 != null) goto L160;
        r11 = null;
        r8 = false;
    L160:
        if (r12 != null) goto L163;
        r12 = null;
    L163:
        if (r12 != null) goto L221;
        if ((r11 instanceof Integer) == false) goto L168;
        r18 = r19;
    L219:
        r12 = r18;
        goto L221
    L168:
        if ((r11 instanceof int[]) == false) goto L171;
        r18 = r17;
        goto L219
    L171:
        if ((r11 instanceof Long) == false) goto L174;
        r18 = r25;
        goto L219
    L174:
        if ((r11 instanceof long[]) == false) goto L177;
        r18 = r16;
        goto L219
    L177:
        if ((r11 instanceof Float) == true) goto L219;
        if ((r11 instanceof float[]) == false) goto L183;
        r18 = r13;
        goto L219
    L183:
        if ((r11 instanceof Boolean) == false) goto L186;
        r18 = r20;
        goto L219
    L186:
        if ((r11 instanceof boolean[]) == false) goto L189;
        r18 = r23;
        goto L219
    L189:
        if ((r11 instanceof String) == true) goto L218;
        if (r11 == null) goto L218;
        if ((r11 instanceof Object[]) == false) goto L198;
        if ((((Object[]) r11) instanceof String[]) == false) goto L198;
        r18 = r14;
    L198:
        if (r11.getClass().isArray() == false) goto L203;
        Class<?> r21 = r11.getClass().getComponentType();
        r21.getClass();
        if (Parcelable.class.isAssignableFrom(r21) == false) goto L203;
        Class<?> r22 = r11.getClass().getComponentType();
        r22.getClass();
        r18 = new d33(r22);
    L203:
        if (r11.getClass().isArray() == false) goto L208;
        Class<?> r30 = r11.getClass().getComponentType();
        r30.getClass();
        if (Serializable.class.isAssignableFrom(r30) == false) goto L208;
        Class<?> r31 = r11.getClass().getComponentType();
        r31.getClass();
        r18 = new f33(r31);
    L208:
        if ((r11 instanceof Parcelable) == false) goto L211;
        r18 = new e33(r11.getClass());
        goto L219
    L211:
        if ((r11 instanceof Enum) == false) goto L214;
        r18 = new c33(r11.getClass());
        goto L219
    L214:
        if ((r11 instanceof Serializable) == false) goto L216;
        r18 = new g33(r11.getClass());
        goto L219
    L216:
        nz2.t(r11.getClass().getName(), " is not supported for navigation arguments.", "Object of type ");
        return null;
    L218:
        r18 = r1;
    L221:
        return new z13(r12, r24, r11, r8);
    L99:
        if (r5.type == 16) goto L101;
    L106:
        StringBuilder r32 = new StringBuilder("unsupported value '");
        r32.append(r5.string);
        String r33 = r12.b();
        r32.append("' for ");
        r32.append(r33);
        r32.append(". Must be a reference to a resource.");
        throw new XmlPullParserException(r32.toString());
    L101:
        if (r5.data != 0) goto L106;
        r10 = 0;
        goto L103
    L108:
        if (r9 == 0) goto L113;
        if (r12 != null) goto L111;
        r11 = Integer.valueOf(r9);
        r25 = r25;
        r20 = r26;
        r8 = true;
        goto L157
    L111:
        StringBuilder r34 = new StringBuilder("unsupported value '");
        r34.append(r5.string);
        String r35 = r12.b();
        r34.append("' for ");
        r34.append(r35);
        r34.append(". You must use a \"reference\" type to reference other resources.");
        throw new XmlPullParserException(r34.toString());
    L113:
        if (r12 != r1) goto L115;
        r8 = true;
        r0 = r27.getString(1);
        goto L104
    L115:
        r8 = true;
        int r36 = r5.type;
        if (r36 != 3) goto L118;
        r20 = r26;
        String r37 = r5.string.toString();
        if (r12 != null) goto L154;
        r37.getClass();
        r19.d(r37);     // Catch: IllegalArgumentException -> L145
        r12 = r19;
    L145:
        r25 = r25;
        r25.d(r37);     // Catch: IllegalArgumentException -> L148
        r12 = r25;
    L153:
        r12 = r12;
        r11 = r12.d(r37);
    L148:
        r18.d(r37);     // Catch: IllegalArgumentException -> L150
        r12 = r18;
    L150:
        r20.d(r37);     // Catch: IllegalArgumentException -> L152
        r12 = r20;
    L152:
        r12 = r1;
    L154:
        r25 = r25;
        goto L153
    L118:
        if (r36 != 4) goto L120;
        r20 = r26;
        r12 = uc5.e(r5, r12, r18, r6, "float");
        r11 = Float.valueOf(r5.getFloat());
    L137:
        r25 = r25;
        goto L157
    L120:
        if (r36 != 5) goto L122;
        r20 = r26;
        r12 = uc5.e(r5, r12, r19, r6, "dimension");
        r11 = Integer.valueOf((int) r5.getDimension(r28.getDisplayMetrics()));
        goto L137
    L122:
        if (r36 == 18) goto L132;
        if (r36 < 16) goto L131;
        if (r36 > 31) goto L131;
        if (r12 != r18) goto L129;
        r12 = uc5.e(r5, r12, r18, r6, "float");
        Object r38 = Float.valueOf(r5.data);
    L128:
        r11 = r38;
        r25 = r25;
        goto L105
    L129:
        r12 = uc5.e(r5, r12, r19, r6, "integer");
        r38 = Integer.valueOf(r5.data);
    L131:
        throw new XmlPullParserException("unsupported argument type " + r5.type);
    L132:
        r20 = r26;
        r12 = uc5.e(r5, r12, r20, r6, "boolean");
        if (r5.data == 0) goto L135;
        boolean r39 = true;
    L136:
        r11 = Boolean.valueOf(r39);
        goto L137
    L135:
        r39 = false;
        goto L136
    L156:
        r25 = r25;
        r20 = r26;
        r12 = r12;
        r11 = null;
        goto L157
    L10:
        r25 = r7;
        if ("integer[]".equals(r6) == false) goto L14;
        r26 = r2;
        r12 = r17;
        goto L92
    L14:
        if ("List<Int>".equals(r6) == false) goto L18;
        r12 = h33.e;
    L16:
        r26 = r2;
        goto L92
    L18:
        if ("long".equals(r6) == false) goto L21;
        r26 = r2;
        r12 = r25;
        goto L92
    L21:
        if ("long[]".equals(r6) == false) goto L24;
        r26 = r2;
        r12 = r16;
        goto L92
    L24:
        if ("List<Long>".equals(r6) == false) goto L27;
        r12 = h33.h;
        goto L16
    L27:
        if ("boolean".equals(r6) == false) goto L30;
        r12 = r2;
        r26 = r12;
        goto L92
    L30:
        if ("boolean[]".equals(r6) == false) goto L33;
        r26 = r2;
        r12 = r23;
        goto L92
    L33:
        if ("List<Boolean>".equals(r6) == false) goto L36;
        r12 = h33.n;
        goto L16
    L36:
        if ("string".equals(r6) == false) goto L39;
    L37:
        r12 = r1;
        goto L16
    L39:
        if ("string[]".equals(r6) == false) goto L42;
        r26 = r2;
        r12 = r14;
        goto L92
    L42:
        if ("List<String>".equals(r6) == false) goto L45;
        r12 = h33.q;
        goto L16
    L45:
        if ("float".equals(r6) == false) goto L48;
        r26 = r2;
        r12 = r18;
        goto L92
    L48:
        if ("float[]".equals(r6) == false) goto L51;
        r26 = r2;
        r12 = r13;
        goto L92
    L51:
        if ("List<Float>".equals(r6) == false) goto L54;
        r12 = h33.k;
        goto L16
    L54:
        if ("reference".equals(r6) == false) goto L57;
        r26 = r2;
        r12 = r12;
        goto L92
    L57:
        if (r6.length() == 0) goto L37;
        r26 = r2;
        if (xm4.k0(r6, ".", false) == false) goto L65;
        if (r110 == null) goto L65;
        String r40 = r110.concat(r6);     // Catch: ClassNotFoundException -> L63
    L66:
        boolean r41 = xm4.e0(r6, "[]", false);     // Catch: ClassNotFoundException -> L63
        if (r41 == false) goto L70;
        r40 = r40.substring(0, r40.length() - 2);     // Catch: ClassNotFoundException -> L63
    L70:
        Class<?> r42 = Class.forName(r40);     // Catch: ClassNotFoundException -> L63
        if (Parcelable.class.isAssignableFrom(r42) == false) goto L76;
        if (r41 == false) goto L74;
        h33 r111 = new d33(r42);     // Catch: ClassNotFoundException -> L63
    L85:
        if (r111 == null) goto L88;
        r12 = r111;
        goto L92
    L88:
        throw new IllegalArgumentException(r40.concat(" is not Serializable or Parcelable.").toString());     // Catch: ClassNotFoundException -> L63
    L74:
        r111 = new e33(r42);     // Catch: ClassNotFoundException -> L63
        goto L85
    L76:
        if (Enum.class.isAssignableFrom(r42) == false) goto L80;
        if (r41 != 0) goto L80;
        r111 = new c33(r42);     // Catch: ClassNotFoundException -> L63
    L80:
        if (Serializable.class.isAssignableFrom(r42) == false) goto L84;
        if (r41 == 0) goto L83;
        r111 = new f33(r42);     // Catch: ClassNotFoundException -> L63
        goto L85
    L83:
        r111 = new g33(r42);     // Catch: ClassNotFoundException -> L63
        goto L85
    L84:
        r111 = null;
    L65:
        r40 = r6;
    L63:
        e = move-exception;
        er1.m(e);
        return null;
    L91:
        r26 = r2;
        r24 = r3;
        r25 = r7;
        r23 = r15;
        r12 = null;
        goto L92
    }

    public final r23 a(Resources r29, XmlResourceParser r30, AttributeSet r31, int r32) {
        int r3 = r32;
        String r4 = r30.getName();
        r4.getClass();
        r23 r8 = this.b.b(r4).a();
        Context r5 = this.a;
        r8.f(r5, r31);
        LinkedHashMap r6 = r8.t;
        int r7 = 1;
        int r9 = r30.getDepth() + 1;
    L3:
        int r10 = r30.next();
        if (r10 == r7) goto L105;
        int r11 = r30.getDepth();
        if (r11 >= r9) goto L9;
        if (r10 == 3) goto L105;
    L9:
        if (r10 != 2) goto L3;
        if (r11 > r9) goto L3;
        String r12 = r30.getName();
        boolean r13 = "argument".equals(r12);
        int[] r14 = zs3.b;
        if (r13 == true) goto L15;
        if ("deepLink".equals(r12) == true) goto L22;
        if ("action".equals(r12) == false) goto L97;
        TypedArray r15 = r5.obtainStyledAttributes(r31, zs3.a, 0, 0);
        int r16 = r15.getResourceId(0, 0);
        int r17 = r7;
        y13 r18 = new y13(r15.getResourceId(r7, 0));
        r18.b = new y23(r15.getBoolean(4, false), r15.getBoolean(10, false), r15.getResourceId(7, -1), r15.getBoolean(8, false), r15.getBoolean(9, false), r15.getResourceId(2, -1), r15.getResourceId(3, -1), r15.getResourceId(5, -1), r15.getResourceId(6, -1));
        Bundle r19 = new Bundle();
        int r110 = r30.getDepth() + 1;
        Context r111 = r5;
    L59:
        int r20 = r30.next();
        LinkedHashMap r112 = r6;
        if (r20 == r17) goto L84;
        int r21 = r30.getDepth();
        int r22 = r9;
        if (r21 >= r110) goto L66;
        if (r20 != 3) goto L66;
    L86:
        if (r19.isEmpty() == true) goto L89;
        r18.c = r19;
    L89:
        if ((r8 instanceof j5) == true) goto L96;
        if (r16 == 0) goto L93;
        r8.s.d(r16, r18);
        r15.recycle();
    L92:
        r3 = r32;
        r5 = r111;
        r6 = r112;
        r9 = r22;
        r7 = 1;
        goto L3
    L93:
        kf2.n("Cannot have an action with actionId 0");
        return null;
    L96:
        throw new UnsupportedOperationException("Cannot add action " + r16 + " to " + r8 + " as it does not support actions, indicating that it is a terminal destination in your navigation graph and will never trigger actions.");
    L66:
        if (r20 != 2) goto L67;
        if (r21 > r110) goto L67;
        if ("argument".equals(r30.getName()) == false) goto L81;
        TypedArray r23 = r29.obtainAttributes(r31, r14);
        r23.getClass();
        String r24 = r23.getString(0);
        if (r24 == null) goto L83;
        z13 r25 = c(r23, r29, r3);
        boolean r26 = r25.c;
        if (r26 == false) goto L80;
        if (r26 == false) goto L80;
        Object r27 = r25.d;
        if (r27 == null) goto L80;
        r25.a.e(r19, r24, r27);
    L80:
        r23.recycle();
        goto L81
    L83:
        throw new XmlPullParserException("Arguments must have a name");
    L81:
        r3 = r32;
    L67:
        r6 = r112;
        r9 = r22;
        r17 = 1;
        goto L59
    L84:
        r22 = r9;
        goto L86
    L97:
        r111 = r5;
        r112 = r6;
        r22 = r9;
        if ("include".equals(r12) == false) goto L103;
        if ((r8 instanceof t23) == false) goto L103;
        TypedArray r28 = r29.obtainAttributes(r31, rt3.c);
        r28.getClass();
        ((t23) r8).g(b(r28.getResourceId(0, 0)));
        r28.recycle();
    L103:
        if ((r8 instanceof t23) == false) goto L92;
        ((t23) r8).g(a(r29, r30, r31, r32));
        goto L92
    L22:
        TypedArray r33 = r29.obtainAttributes(r31, zs3.c);
        r33.getClass();
        String r113 = r33.getString(3);
        String r114 = r33.getString(r7);
        String r115 = r33.getString(2);
        if (r113 != null) goto L25;
    L26:
        if (r114 != null) goto L28;
    L29:
        if (r115 == null) goto L55;
        if (r115.length() == 0) goto L55;
    L33:
        if (r113 == null) goto L35;
        String r116 = r5.getPackageName();
        r116.getClass();
        String r117 = xm4.i0(r113, "${applicationId}", r116);
    L36:
        if (r114 != null) goto L38;
    L45:
        String r118 = null;
    L46:
        if (r115 == null) goto L48;
        String r119 = r5.getPackageName();
        r119.getClass();
        String r120 = xm4.i0(r115, "${applicationId}", r119);
    L49:
        n23 r121 = new n23(r117, r118, r120);
        ArrayList r122 = ud3.b0(r6, new q23(r121, 0));
        if (r122.isEmpty() == false) goto L52;
        r8.r.add(r121);
        r33.recycle();
        goto L3
    L52:
        nz2.q("Deep link ", r117, " can't be used to open destination ", r8, ".\nFollowing required arguments are missing: ", r122);
        return null;
    L48:
        r120 = null;
        goto L49
    L38:
        if (r114.length() == 0) goto L45;
        String r123 = r5.getPackageName();
        r123.getClass();
        r118 = xm4.i0(r114, "${applicationId}", r123);
        if (r118.length() > 0) goto L46;
        kf2.n("The NavDeepLink cannot have an empty action.");
        return null;
    L35:
        r117 = null;
    L55:
        throw new XmlPullParserException("Every <deepLink> must include at least one of app:uri, app:action, or app:mimeType");
    L28:
        if (r114.length() != 0) goto L33;
    L25:
        if (r113.length() != 0) goto L33;
    L15:
        TypedArray r34 = r29.obtainAttributes(r31, r14);
        r34.getClass();
        String r124 = r34.getString(0);
        if (r124 == null) goto L19;
        r6.put(r124, c(r34, r29, r3));
        r34.recycle();
        goto L3
    L19:
        throw new XmlPullParserException("Arguments must have a name");
    L105:
        return r8;
    }

    public final t23 b(int r7) {
        Resources r0 = this.a.getResources();
        XmlResourceParser r1 = r0.getXml(r7);
        r1.getClass();
        AttributeSet r2 = Xml.asAttributeSet(r1);
    L25:
        int r3 = r1.next();     // Catch: Throwable -> L13 Exception -> L15
        if (r3 == 2) goto L7;
        if (r3 != 1) goto L25;
    L7:
        if (r3 != 2) goto L20;
        String r4 = r1.getName();     // Catch: Throwable -> L13 Exception -> L15
        r2.getClass();     // Catch: Throwable -> L13 Exception -> L15
        r23 r6 = a(r0, r1, r2, r7);     // Catch: Throwable -> L13 Exception -> L15
        if ((r6 instanceof t23) == false) goto L18;
        t23 r8 = (t23) r6;     // Catch: Throwable -> L13 Exception -> L15
        r1.close();
        return r8;
    L18:
        throw new IllegalArgumentException(("Root element <" + r4 + "> did not inflate into a NavGraph").toString());     // Catch: Throwable -> L13 Exception -> L15
    L20:
        throw new XmlPullParserException("No start tag found");     // Catch: Throwable -> L13 Exception -> L15
    L13:
        th = move-exception;
        r1.close();
        throw th;
    L15:
        e = move-exception;
        throw new RuntimeException("Exception inflating " + r0.getResourceName(r7) + " line " + r1.getLineNumber(), e);     // Catch: Throwable -> L13
    }
}
