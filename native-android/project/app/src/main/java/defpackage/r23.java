package defpackage;

import android.content.Context;
import android.content.res.TypedArray;
import android.net.Uri;
import android.os.Bundle;
import android.util.AttributeSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class r23 {
    public static final /* synthetic */ int w = 0;
    public final String n;
    public t23 o;
    public String p;
    public CharSequence q;
    public final ArrayList r;
    public final mj4 s;
    public final LinkedHashMap t;
    public int u;
    public String v;

    static {
        new LinkedHashMap();
    }

    public r23(t43 r2) {
        LinkedHashMap r0 = u43.b;
        this.n = bu.n(r2.getClass());
        this.r = new ArrayList();
        this.s = new mj4(0);
        this.t = new LinkedHashMap();
    }

    public final Bundle a(Bundle r6) {
        LinkedHashMap r5 = this.t;
        if (r6 == null) goto L5;
    L8:
        Bundle r0 = new Bundle();
        Iterator r1 = r5.entrySet().iterator();
    L10:
        if (r1.hasNext() == false) goto L16;
        Map.Entry r2 = (Map.Entry) r1.next();
        String r3 = (String) r2.getKey();
        z13 r4 = (z13) r2.getValue();
        r4.getClass();
        r3.getClass();
        if (r4.c == false) goto L10;
        Object r7 = r4.d;
        if (r7 == null) goto L10;
        r4.a.e(r0, r3, r7);
        goto L10
    L16:
        if (r6 == null) goto L30;
        r0.putAll(r6);
        Iterator r8 = r5.entrySet().iterator();
    L19:
        if (r8.hasNext() == false) goto L30;
        Map.Entry r9 = (Map.Entry) r8.next();
        String r10 = (String) r9.getKey();
        z13 r11 = (z13) r9.getValue();
        r11.getClass();
        h33 r12 = r11.a;
        r10.getClass();
        if (r11.b == false) goto L23;
    L32:
        r12.a(r10, r0);     // Catch: ClassCastException -> L31
    L28:
        StringBuilder r13 = xa3.j("Wrong argument type for '", r10, "' in argument bundle. ");
        r13.append(r12.b());
        r13.append(" expected.");
        throw new IllegalArgumentException(r13.toString().toString());
    L23:
        if (r0.containsKey(r10) == false) goto L32;
        if (r0.get(r10) == null) goto L28;
    L30:
        return r0;
    L5:
        if (r5.isEmpty() == false) goto L8;
        return null;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public final int[] b(r23 r7) {
        ii r0 = new ii();
    L3:
        t23 r1 = this.o;
        if (r7 == null) goto L6;
        t23 r3 = r7.o;
    L7:
        if (r3 == null) goto L11;
        t23 r4 = r7.o;
        r4.getClass();
        if (r4.h(this.u, r4, null, false) != this) goto L11;
        r0.addFirst(this);
    L19:
        List r6 = q40.Q0(r0);
        ArrayList r8 = new ArrayList(r40.k0(r6, 10));
        Iterator r9 = r6.iterator();
    L21:
        if (r9.hasNext() == false) goto L24;
        r8.add(Integer.valueOf(((r23) r9.next()).u));
        goto L21
    L24:
        return q40.P0(r8);
    L11:
        if (r1 != null) goto L13;
    L14:
        r0.addFirst(this);
    L16:
        if (h12.c(r1, r7) == true) goto L19;
        if (r1 == null) goto L19;
        r23 this = r1;
        goto L3
    L13:
        if (r1.y == this.u) goto L16;
    L6:
        r3 = null;
        goto L7
    }

    public final y13 d(int r4) {
        mj4 r0 = this.s;
        if (r0.e() != 0) goto L5;
        y13 r1 = null;
    L6:
        if (r1 != null) goto L12;
        t23 r3 = this.o;
        if (r3 != null) goto L10;
        return null;
    L10:
        return r3.d(r4);
    L12:
        return r1;
    L5:
        r1 = (y13) r0.b(r4);
        goto L6
    }

    /* JADX WARN: Multi-variable type inference failed */
    public p23 e(ik r28) {
        r23 this = this;
        ArrayList r8 = this.r;
        Throwable r9 = null;
        if (r8.isEmpty() == false) goto L5;
        return null;
    L5:
        int r10 = r8.size();
        p23 r12 = null;
        int r0 = 0;
    L6:
        if (r0 >= r10) goto L150;
        int r13 = r0 + 1;
        n23 r2 = (n23) r8.get(r0);
        Uri r1 = r28.b;
        LinkedHashMap r4 = this.t;
        if (r1 == null) goto L48;
        r2.getClass();
        r1.getClass();
        r4.getClass();
        Pattern r5 = (Pattern) r2.f.getValue();
        if (r5 == null) goto L12;
        Matcher r6 = r5.matcher(r1.toString());
    L13:
        if (r6 != 0) goto L16;
    L14:
        Throwable r16 = r9;
    L49:
        Object r7 = r16;
    L50:
        String r3 = r2.a;
        if (r1 == null) goto L61;
        if (r3 == null) goto L61;
        List<String> r11 = r1.getPathSegments();
        List<String> r14 = Uri.parse(r3).getPathSegments();
        r11.getClass();
        r14.getClass();
        LinkedHashSet r15 = new LinkedHashSet();
        Iterator<T> r17 = r11.iterator();
    L56:
        if (r17.hasNext() == false) goto L60;
        Object r18 = r17.next();
        if (r14.contains(r18) == false) goto L56;
        r15.add(r18);
        goto L56
    L60:
        int r19 = r15.size();
    L62:
        String r20 = r28.c;
        if (r20 != null) goto L65;
    L67:
        boolean r21 = false;
    L68:
        String r22 = r28.d;
        if (r22 == null) goto L120;
        String r110 = r2.c;
        if (r110 == null) goto L120;
        Pattern r111 = (Pattern) r2.o.getValue();
        r111.getClass();
        if (r111.matcher(r22).matches() == false) goto L120;
        Pattern r112 = Pattern.compile("/");
        r112.getClass();
        qm4.A0(0);
        Matcher r113 = r112.matcher(r110);
        if (r113.find() == true) goto L78;
        List r114 = gb.O(r110.toString());
        int r23 = 1;
    L82:
        boolean r24 = r114.isEmpty();
        List r25 = u01.n;
        if (r24 == true) goto L92;
        ListIterator r26 = r114.listIterator(r114.size());
    L86:
        if (r26.hasPrevious() == false) goto L92;
        if (((String) r26.previous()).length() == 0) goto L86;
        List r27 = q40.L0(r114, r26.nextIndex() + 1);
    L93:
        String r115 = (String) r27.get(0);
        String r29 = (String) r27.get(r23);
        Pattern r116 = Pattern.compile("/");
        r116.getClass();
        qm4.A0(0);
        Matcher r210 = r116.matcher(r22);
        if (r210.find() == true) goto L96;
        List r30 = gb.O(r22.toString());
    L101:
        if (r30.isEmpty() == true) goto L110;
        ListIterator r31 = r30.listIterator(r30.size());
    L104:
        if (r31.hasPrevious() == false) goto L110;
        if (((String) r31.previous()).length() == 0) goto L104;
        int r117 = 1;
        r25 = q40.L0(r30, r31.nextIndex() + 1);
    L111:
        String r32 = (String) r25.get(0);
        String r33 = (String) r25.get(r117);
        if (h12.c(r115, r32) == false) goto L114;
        int r34 = 2;
    L116:
        if (h12.c(r29, r33) == false) goto L121;
        r34 = r34 + 1;
    L121:
        if (r7 != null) goto L142;
        if (r21 == false) goto L124;
    L125:
        r4.getClass();
        Bundle r35 = new Bundle();
        if (r1 == null) goto L141;
        Pattern r36 = (Pattern) r2.f.getValue();
        if (r36 == null) goto L131;
        Matcher r37 = r36.matcher(r1.toString());
    L132:
        if (r37 == 0) goto L141;
        if (r37.matches() == false) goto L141;
        r2.c(r37, r35, r4);
        if (((Boolean) r2.g.getValue()).booleanValue() == false) goto L141;
        r2.d(r1, r35, r4);
        goto L141
    L131:
        r37 = r16;
    L141:
        if (ud3.b0(r4, new m23(1, r35)).isEmpty() == true) goto L142;
    L148:
        r0 = r13;
        r9 = r16;
        goto L6
    L124:
        if (r34 <= (-1)) goto L148;
    L142:
        p23 r38 = new p23(this, r7, r2.p, r19, r21, r34);
        if (r12 != null) goto L145;
    L149:
        r12 = r38;
        goto L148
    L145:
        if (r38.a(r12) <= 0) goto L148;
    L114:
        r34 = 0;
    L110:
        r117 = 1;
        goto L111
    L96:
        ArrayList r39 = new ArrayList(10);
        int r118 = 0;
    L97:
        r39.add(r22.subSequence(r118, r210.start()).toString());
        r118 = r210.end();
        if (r210.find() == true) goto L97;
        r39.add(r22.subSequence(r118, r22.length()).toString());
        r30 = r39;
    L92:
        r27 = r25;
        goto L93
    L78:
        r23 = 1;
        ArrayList r40 = new ArrayList(10);
        int r41 = 0;
    L79:
        r40.add(r110.subSequence(r41, r113.start()).toString());
        r41 = r113.end();
        if (r113.find() == false) goto L81;
        r23 = 1;
        goto L79
    L81:
        r40.add(r110.subSequence(r41, r110.length()).toString());
        r114 = r40;
    L120:
        r21 = r21;
        r19 = r19;
        r34 = -1;
        goto L121
    L65:
        if (r20.equals(r2.b) == false) goto L67;
        r21 = true;
    L61:
        r19 = 0;
        goto L62
    L16:
        if (r6.matches() == false) goto L14;
        Bundle r42 = new Bundle();
        if (r2.c(r6, r42, r4) == false) goto L14;
        if (((Boolean) r2.g.getValue()).booleanValue() == true) goto L24;
    L26:
        String r43 = r1.getFragment();
        Pattern r119 = (Pattern) r2.m.getValue();
        if (r119 == null) goto L29;
        Matcher r44 = r119.matcher(String.valueOf(r43));
    L30:
        if (r44 != 0) goto L33;
    L31:
        r16 = r9;
    L45:
        boolean r45 = ud3.b0(r4, new m23(0, r42)).isEmpty();
        r7 = r42;
        if (r45 == true) goto L50;
    L33:
        if (r44.matches() == false) goto L31;
        List r120 = (List) r2.k.getValue();
        r16 = r9;
        ArrayList r121 = new ArrayList(r40.k0(r120, 10));
        Iterator r46 = r120.iterator();
        int r122 = 0;
    L37:
        if (r46.hasNext() == false) goto L45;
        Object r123 = r46.next();
        int r47 = r122 + 1;
        if (r122 < 0) goto L43;
        String r124 = (String) r123;
        String r125 = Uri.decode(r44.group(r47));
        z13 r48 = (z13) r4.get(r124);
        r125.getClass();     // Catch: IllegalArgumentException -> L151
        n23.e(r42, r124, r125, r48);     // Catch: IllegalArgumentException -> L151
        r121.add(j15.a);
        r122 = r47;
        goto L37
    L43:
        gb.c0();
        throw r16;
    L29:
        r44 = r9;
        goto L30
    L24:
        if (r2.d(r1, r42, r4) == true) goto L26;
    L12:
        r6 = r9;
        goto L13
    L48:
        r16 = r9;
        goto L49
    L150:
        return r12;
    }

    public boolean equals(Object r10) {
        if (this != r10) goto L6;
    L39:
        return true;
    L6:
        if (r10 != null) goto L8;
    L40:
        return false;
    L8:
        if ((r10 instanceof r23) == false) goto L40;
        r23 r11 = (r23) r10;
        mj4 r2 = r11.s;
        LinkedHashMap r3 = r11.t;
        boolean r4 = h12.c(this.r, r11.r);
        mj4 r5 = this.s;
        if (r5.e() != r2.e()) goto L19;
        Iterator r6 = ((gb0) fa4.b0(new nj4(r5))).iterator();
    L14:
        if (r6.hasNext() == false) goto L18;
        int r7 = ((Number) r6.next()).intValue();
        if (h12.c(r5.b(r7), r2.b(r7)) == true) goto L14;
    L18:
        boolean r8 = true;
    L20:
        LinkedHashMap r9 = this.t;
        if (r9.size() != r3.size()) goto L31;
        Set r12 = r9.entrySet();
        r12.getClass();
        Iterator r13 = r12.iterator();
    L24:
        if (r13.hasNext() == false) goto L30;
        Map.Entry r14 = (Map.Entry) r13.next();
        if (r3.containsKey(r14.getKey()) == false) goto L31;
        if (h12.c(r3.get(r14.getKey()), r14.getValue()) == false) goto L31;
    L30:
        boolean r15 = true;
    L33:
        if (this.u != r11.u) goto L40;
        if (h12.c(this.v, r11.v) == false) goto L40;
        if (r4 == false) goto L40;
        if (r8 == false) goto L40;
        if (r15 == false) goto L40;
    L31:
        r15 = false;
    L19:
        r8 = false;
        goto L20
    }

    public void f(Context r8, AttributeSet r9) {
        TypedArray r10 = r8.getResources().obtainAttributes(r9, zs3.e);
        r10.getClass();
        String r2 = r10.getString(2);
        if (r2 != null) goto L6;
        this.u = 0;
        this.p = null;
    L10:
        this.v = r2;
        if (r10.hasValue(1) == false) goto L13;
        int r0 = r10.getResourceId(1, 0);
        this.u = r0;
        this.p = null;
        this.p = ya4.v(r8, r0);
    L13:
        this.q = r10.getText(0);
        r10.recycle();
        return;
    L6:
        if (qm4.u0(r2) == true) goto L17;
        String r4 = "android-app://androidx.navigation/".concat(r2);
        q23 r6 = new q23(new n23(r4, null, null), 1);
        ArrayList r7 = ud3.b0(this.t, r6);
        if (r7.isEmpty() == false) goto L15;
        this.u = r4.hashCode();
        this.p = null;
        goto L10
    L15:
        nz2.q("Cannot set route \"", r2, "\" for destination ", this, ". Following required arguments are missing: ", r7);
        return;
    L17:
        kf2.n("Cannot have an empty route");
    }

    public int hashCode() {
        int r0 = this.u * 31;
        String r2 = this.v;
        if (r2 == null) goto L5;
        int r3 = r2.hashCode();
    L6:
        int r1 = r0 + r3;
        ArrayList r4 = this.r;
        int r5 = r4.size();
        int r6 = 0;
    L7:
        if (r6 >= r5) goto L21;
        Object r7 = r4.get(r6);
        r6 = r6 + 1;
        n23 r8 = (n23) r7;
        int r9 = r1 * 31;
        String r10 = r8.a;
        if (r10 == null) goto L11;
        int r11 = r10.hashCode();
    L12:
        int r12 = (r9 + r11) * 31;
        String r13 = r8.b;
        if (r13 == null) goto L15;
        int r14 = r13.hashCode();
    L16:
        int r15 = (r12 + r14) * 31;
        String r16 = r8.c;
        if (r16 == null) goto L19;
        int r17 = r16.hashCode();
    L20:
        r1 = r15 + r17;
        goto L7
    L19:
        r17 = 0;
        goto L20
    L15:
        r14 = 0;
        goto L16
    L11:
        r11 = 0;
        goto L12
    L21:
        mj4 r18 = this.s;
        r18.getClass();
        int r19 = 0;
    L23:
        if (r19 >= r18.e()) goto L25;
        boolean r20 = true;
    L26:
        if (r20 == false) goto L44;
        int r21 = r19 + 1;
        y13 r22 = (y13) r18.f(r19);
        int r23 = ((r1 * 31) + r22.a) * 31;
        y23 r24 = r22.b;
        if (r24 == null) goto L30;
        int r25 = r24.hashCode();
    L31:
        r1 = r23 + r25;
        Bundle r26 = r22.c;
        if (r26 == null) goto L43;
        Set<String> r27 = r26.keySet();
        if (r27 == null) goto L43;
        Iterator<T> r28 = r27.iterator();
    L37:
        if (r28.hasNext() == false) goto L43;
        String r29 = (String) r28.next();
        int r30 = r1 * 31;
        Bundle r31 = r22.c;
        r31.getClass();
        Object r32 = r31.get(r29);
        if (r32 == null) goto L41;
        int r33 = r32.hashCode();
    L42:
        r1 = r30 + r33;
        goto L37
    L41:
        r33 = 0;
    L43:
        r19 = r21;
        goto L23
    L30:
        r25 = 0;
        goto L31
    L44:
        LinkedHashMap r34 = this.t;
        Iterator r35 = r34.keySet().iterator();
    L46:
        if (r35.hasNext() == false) goto L52;
        String r36 = (String) r35.next();
        int r37 = f34.e(r36, r1 * 31, 31);
        Object r38 = r34.get(r36);
        if (r38 == null) goto L50;
        int r39 = r38.hashCode();
    L51:
        r1 = r37 + r39;
        goto L46
    L50:
        r39 = 0;
        goto L51
    L52:
        return r1;
    L25:
        r20 = false;
        goto L26
    L5:
        r3 = 0;
        goto L6
    }

    public String toString() {
        StringBuilder r0 = new StringBuilder();
        r0.append(getClass().getSimpleName());
        r0.append("(");
        String r1 = this.p;
        if (r1 != null) goto L5;
        r0.append("0x");
        r0.append(Integer.toHexString(this.u));
    L6:
        r0.append(")");
        String r2 = this.v;
        if (r2 == null) goto L13;
        if (qm4.u0(r2) == true) goto L13;
        r0.append(" route=");
        r0.append(this.v);
    L13:
        if (this.q == null) goto L16;
        r0.append(" label=");
        r0.append(this.q);
    L16:
        return r0.toString();
    L5:
        r0.append(r1);
        goto L6
    }
}
