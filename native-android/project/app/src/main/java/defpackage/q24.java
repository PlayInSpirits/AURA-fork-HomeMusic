package defpackage;

import android.app.ActivityManager;
import android.content.Context;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class q24 {
    public final i30 a;
    public final Context b;
    public final String c;
    public final ArrayList d;
    public final ArrayList e;
    public Executor f;
    public Executor g;
    public ss2 h;
    public boolean i;
    public final r24 j;
    public final long k;
    public final pz1 l;
    public final LinkedHashSet m;
    public final LinkedHashSet n;
    public final ArrayList o;
    public boolean p;
    public boolean q;
    public final boolean r;

    public q24(Context r3, Class r4, String r5) {
        r3.getClass();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.j = r24.n;
        this.k = -1;
        this.l = new pz1(19);
        this.m = new LinkedHashSet();
        this.n = new LinkedHashSet();
        this.o = new ArrayList();
        this.p = true;
        this.r = true;
        this.a = kx3.a(r4);
        this.b = r3;
        this.c = r5;
    }

    public final void a(jw2... r7) {
        int r0 = r7.length;
        int r1 = 0;
        int r2 = 0;
    L3:
        if (r2 >= r0) goto L5;
        jw2 r3 = r7[r2];
        Integer r4 = Integer.valueOf(r3.a);
        LinkedHashSet r5 = this.n;
        r5.add(r4);
        r5.add(Integer.valueOf(r3.b));
        r2 = r2 + 1;
        goto L3
    L5:
        jw2[] r8 = (jw2[]) Arrays.copyOf(r7, r7.length);
        pz1 r6 = this.l;
        r6.getClass();
        int r9 = r8.length;
    L6:
        if (r1 >= r9) goto L8;
        r6.n(r8[r1]);
        r1 = r1 + 1;
        goto L6
    }

    public final s24 b() {
        Executor r1 = this.f;
        if (r1 == null) goto L5;
    L7:
        if (r1 != null) goto L9;
    L11:
        if (r1 != null) goto L13;
        this.f = this.g;
    L13:
        LinkedHashSet r2 = this.n;
        r2.getClass();
        LinkedHashSet r15 = this.m;
        r15.getClass();
        if (r2.isEmpty() == true) goto L23;
        Iterator r3 = r2.iterator();
    L17:
        if (r3.hasNext() == false) goto L23;
        int r4 = ((Number) r3.next()).intValue();
        if (r15.contains(Integer.valueOf(r4)) == false) goto L17;
        kf2.e(f34.f(r4, "Inconsistency detected. A Migration was supplied to addMigration() that has a start or end version equal to a start version supplied to fallbackToDestructiveMigrationFrom(). Start version is: "));
        return null;
    L23:
        ro4 r5 = this.h;
        if (r5 != null) goto L26;
        r5 = new y41(16);
    L26:
        ro4 r6 = r5;
        if (this.k <= 0) goto L29;
        boolean r7 = true;
    L31:
        if (r7 == true) goto L33;
        boolean r8 = this.i;
        r24 r9 = this.j;
        r9.getClass();
        Context r10 = this.b;
        r10.getClass();
        if (r9 != r24.n) goto L50;
        Object r11 = r10.getSystemService("activity");
        if ((r11 instanceof ActivityManager) == false) goto L44;
        ActivityManager r12 = (ActivityManager) r11;
    L45:
        if (r12 != null) goto L47;
    L49:
        r9 = r24.o;
        goto L50
    L47:
        if (r12.isLowRamDevice() == true) goto L49;
        r9 = r24.p;
        goto L50
    L44:
        r12 = null;
    L50:
        Executor r13 = this.f;
        if (r13 == null) goto L213;
        Executor r14 = this.g;
        if (r14 == null) goto L211;
        r24 r16 = r9;
        li0 r17 = new li0(r10, this.c, r6, this.l, this.d, r8, r16, r13, r14, null, this.p, this.q, r15, null, null, null, this.e, this.o, false, null, null);
        r17.v = this.r;
        i30 r0 = this.a;
        r0.getClass();
        Class r18 = r0.a();
        r18.getClass();
        Package r19 = r18.getPackage();
        if (r19 == null) goto L58;
        String r20 = r19.getName();
        if (r20 == null) goto L58;
    L59:
        String r21 = r18.getCanonicalName();
        r21.getClass();
        if (r20.length() == 0) goto L63;
        r21 = r21.substring(r20.length() + 1);
    L63:
        String r22 = r21.replace('.', '_');
        r22.getClass();
        String r23 = r22.concat("_Impl");
    L203:
        e = move-exception;
        throw new RuntimeException("Cannot find implementation for " + r18.getCanonicalName() + ". " + r23 + " does not exist. Is Room annotation processor correctly configured?", e);
    L201:
        e = move-exception;
        throw new RuntimeException("Cannot access the constructor " + r18.getCanonicalName(), e);
    L199:
        e = move-exception;
        throw new RuntimeException("Failed to create an instance of " + r18.getCanonicalName(), e);
    L65:
        if (r20.length() != 0) goto L67;
        String r24 = r23;
    L68:
        Class<?> r25 = Class.forName(r24, true, r18.getClassLoader());     // Catch: InstantiationException -> L199 IllegalAccessException -> L201 ClassNotFoundException -> L203
        r25.getClass();     // Catch: InstantiationException -> L199 IllegalAccessException -> L201 ClassNotFoundException -> L203
        s24 r26 = (s24) r25.getDeclaredConstructor(null).newInstance(null);
        r26.getClass();
        r26.j = r17.v;
        qz0 r27 = r26.e();     // Catch: p63 -> L72
        r27.getClass();     // Catch: p63 -> L72
    L73:
        if (r27 != null) goto L75;
        p24 r28 = new p24(r17, new kl3(4, r26));
    L76:
        r26.d = r28;
        r26.e = r26.d();
        LinkedHashMap r29 = new LinkedHashMap();
        Set r30 = r26.k();
        ArrayList r31 = new ArrayList(r40.k0(r30, 10));
        Iterator r32 = r30.iterator();
    L78:
        if (r32.hasNext() == false) goto L80;
        Class r33 = (Class) r32.next();
        r33.getClass();
        r31.add(kx3.a(r33));
        goto L78
    L80:
        Set r34 = q40.T0(r31);
        int r35 = r34.size();
        boolean[] r36 = new boolean[r35];
        Iterator r37 = r34.iterator();
    L81:
        boolean r38 = r37.hasNext();
        int r39 = -1;
        List r110 = r17.r;
        if (r38 == false) goto L95;
        i30 r40 = (i30) r37.next();
        int r111 = r110.size() - 1;
        if (r111 < 0) goto L91;
    L85:
        int r112 = r111 - 1;
        if (r40.d(r110.get(r111)) == true) goto L87;
        if (r112 < 0) goto L91;
        r111 = r112;
        goto L85
    L87:
        r36[r111] = true;
        r39 = r111;
    L91:
        if (r39 < 0) goto L93;
        r29.put(r40, r110.get(r39));
        goto L81
    L93:
        nz2.k(r40.b(), ") is missing in the database configuration.", "A required auto migration spec (");
        return null;
    L95:
        int r41 = r110.size() - 1;
        if (r41 < 0) goto L106;
    L97:
        int r42 = r41 - 1;
        if (r41 >= r35) goto L104;
        if (r36[r41] == false) goto L104;
        if (r42 < 0) goto L106;
        r41 = r42;
    L104:
        kf2.n("Unexpected auto migration specs found. Annotate AutoMigrationSpec implementation with @ProvidedAutoMigrationSpec annotation or remove this spec from the builder.");
        return null;
    L106:
        LinkedHashMap r43 = new LinkedHashMap(lg2.W(r29.size()));
        Iterator r44 = r29.entrySet().iterator();
    L108:
        if (r44.hasNext() == false) goto L110;
        Map.Entry r45 = (Map.Entry) r44.next();
        i30 r46 = (i30) r45.getKey();
        r46.getClass();
        Class r47 = r46.a();
        r47.getClass();
        r43.put(r47, r45.getValue());
        goto L108
    L110:
        Iterator r48 = r26.g(r43).iterator();
    L112:
        if (r48.hasNext() == false) goto L122;
        jw2 r49 = (jw2) r48.next();
        int r50 = r49.a;
        int r51 = r49.b;
        pz1 r52 = r17.d;
        LinkedHashMap r113 = (LinkedHashMap) r52.o;
        if (r113.containsKey(Integer.valueOf(r50)) == false) goto L119;
        Map r53 = (Map) r113.get(Integer.valueOf(r50));
        if (r53 != null) goto L118;
        r53 = v01.n;
    L118:
        boolean r54 = r53.containsKey(Integer.valueOf(r51));
    L120:
        if (r54 == true) goto L112;
        r52.n(r49);
        goto L112
    L119:
        r54 = false;
        goto L120
    L122:
        Set r55 = r26.l().entrySet();
        int r56 = lg2.W(r40.k0(r55, 10));
        if (r56 >= 16) goto L125;
        r56 = 16;
    L125:
        LinkedHashMap r57 = new LinkedHashMap(r56);
        Iterator r58 = r55.iterator();
    L127:
        if (r58.hasNext() == false) goto L133;
        Map.Entry r59 = (Map.Entry) r58.next();
        Class r60 = (Class) r59.getKey();
        List r61 = (List) r59.getValue();
        r60.getClass();
        i30 r62 = kx3.a(r60);
        ArrayList r63 = new ArrayList(r40.k0(r61, 10));
        Iterator r64 = r61.iterator();
    L130:
        if (r64.hasNext() == false) goto L132;
        Class r114 = (Class) r64.next();
        r114.getClass();
        r63.add(kx3.a(r114));
        goto L130
    L132:
        r57.put(r62, r63);
        goto L127
    L133:
        boolean[] r65 = new boolean[r57.size()];
        Iterator r66 = r57.entrySet().iterator();
    L134:
        boolean r67 = r66.hasNext();
        List r68 = r17.q;
        if (r67 == false) goto L152;
        Map.Entry r69 = (Map.Entry) r66.next();
        i30 r70 = (i30) r69.getKey();
        Iterator r71 = ((List) r69.getValue()).iterator();
    L138:
        if (r71.hasNext() == false) goto L134;
        i30 r72 = (i30) r71.next();
        int r115 = r68.size() - 1;
        if (r115 < 0) goto L147;
    L141:
        int r116 = r115 - 1;
        if (r72.d(r68.get(r115)) == true) goto L143;
        if (r116 < 0) goto L147;
        r115 = r116;
        goto L141
    L143:
        r65[r115] = true;
    L148:
        if (r115 < 0) goto L151;
        Object r117 = r68.get(r115);
        r72.getClass();
        r117.getClass();
        r26.i.put(r72, r117);
        goto L138
    L151:
        throw new IllegalArgumentException(("A required type converter (" + r72.b() + ") for " + r70.b() + " is missing in the database configuration.").toString());
    L147:
        r115 = -1;
        goto L148
    L152:
        int r73 = r68.size() - 1;
        if (r73 < 0) goto L161;
    L154:
        int r74 = r73 - 1;
        if (r65[r73] == false) goto L159;
        if (r74 < 0) goto L161;
        r73 = r74;
        goto L154
    L159:
        nz2.A(r68.get(r73), ". Annotate TypeConverter class with @ProvidedTypeConverter annotation or remove this converter from the builder.", "Unexpected type converter ");
        return null;
    L161:
        r26.b = r17.h;
        r26.c = new ia4(r17.i, 1);
        Executor r75 = r26.b;
        if (r75 == null) goto L197;
        td0 r76 = te5.a(ya4.F(kb4.w(r75), new fo4(null)));
        r26.a = r76;
        ne0 r77 = r76.n;
        ia4 r78 = r26.c;
        if (r78 == null) goto L195;
        r77.J(kb4.w(r78));
        r26.g = r17.f;
        p24 r79 = r26.d;
        if (r79 == null) goto L193;
        so4 r80 = r79.c();
        if (r80 != null) goto L170;
    L169:
        so4 r81 = null;
    L177:
        lo3 r82 = (lo3) r81;
        p24 r83 = r26.d;
        if (r83 == null) goto L191;
        so4 r84 = r83.c();
        if (r84 != null) goto L182;
    L181:
        so4 r85 = null;
    L189:
        pn r86 = (pn) r85;
        return r26;
    L182:
        r85 = r84;
    L184:
        if ((r85 instanceof pn) == true) goto L189;
        if ((r85 instanceof go0) == false) goto L181;
        r85 = ((go0) r85).b();
        goto L184
    L191:
        h12.Q("connectionManager");
        throw null;
    L170:
        r81 = r80;
    L172:
        if ((r81 instanceof lo3) == true) goto L177;
        if ((r81 instanceof go0) == false) goto L169;
        r81 = ((go0) r81).b();
        goto L172
    L193:
        h12.Q("connectionManager");
        throw null;
    L195:
        h12.Q("internalTransactionExecutor");
        throw null;
    L197:
        h12.Q("internalQueryExecutor");
        throw null;
    L75:
        r28 = new p24(r17, r27);
    L72:
        r27 = null;
        goto L73
    L67:
        r24 = r20 + '.' + r23;     // Catch: InstantiationException -> L199 IllegalAccessException -> L201 ClassNotFoundException -> L203
    L58:
        r20 = "";
        goto L59
    L211:
        kf2.n("Required value was null.");
        return null;
    L213:
        kf2.n("Required value was null.");
        return null;
    L33:
        if (this.c == null) goto L36;
        kf2.n("Required value was null.");
        return null;
    L36:
        kf2.n("Cannot create auto-closing database for an in-memory database.");
        return null;
    L29:
        r7 = false;
        goto L31
    L9:
        if (this.g != null) goto L11;
        this.g = r1;
        goto L13
    L5:
        if (this.g != null) goto L7;
        di r87 = ei.l;
        this.g = r87;
        this.f = r87;
        goto L13
    }
}
