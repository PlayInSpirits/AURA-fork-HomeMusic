package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class jy4 {
    public static final String[] l = null;
    public final s24 a;
    public final HashMap b;
    public final HashMap c;
    public final boolean d;
    public final q e;
    public final LinkedHashMap f;
    public final String[] g;
    public final ll h;
    public final om1 i;
    public final AtomicBoolean j;
    public gf1 k;

    static {
        l = new String[]{"INSERT", "UPDATE", "DELETE"};
    }

    public jy4(s24 r3, HashMap r4, HashMap r5, String[] r6, boolean r7, q r8) {
        this.a = r3;
        this.b = r4;
        this.c = r5;
        this.d = r7;
        this.e = r8;
        int r9 = 0;
        this.j = new AtomicBoolean(false);
        this.k = new rd2(9);
        this.f = new LinkedHashMap();
        int r10 = r6.length;
        String[] r11 = new String[r10];
    L3:
        if (r9 >= r10) goto L12;
        String r12 = r6[r9];
        Locale r13 = Locale.ROOT;
        String r14 = r12.toLowerCase(r13);
        r14.getClass();
        Integer r0 = Integer.valueOf(r9);
        this.f.put(r14, r0);
        String r1 = (String) this.b.get(r6[r9]);
        if (r1 == null) goto L7;
        String r15 = r1.toLowerCase(r13);
        r15.getClass();
    L8:
        if (r15 == null) goto L11;
        r14 = r15;
    L11:
        r11[r9] = r14;
        r9 = r9 + 1;
        goto L3
    L7:
        r15 = null;
        goto L8
    L12:
        this.g = r11;
        Iterator r16 = this.b.entrySet().iterator();
    L14:
        if (r16.hasNext() == false) goto L18;
        Map.Entry r17 = (Map.Entry) r16.next();
        String r18 = (String) r17.getValue();
        Locale r19 = Locale.ROOT;
        String r20 = r18.toLowerCase(r19);
        r20.getClass();
        if (this.f.containsKey(r20) == false) goto L14;
        String r21 = ((String) r17.getKey()).toLowerCase(r19);
        r21.getClass();
        LinkedHashMap r22 = this.f;
        r22.put(r21, lg2.V(r20, r22));
        goto L14
    L18:
        this.h = new ll(this.g.length);
        this.i = new om1(this.g.length);
    }

    public static final Object a(jy4 r4, yn3 r5, wd0 r6) {
        if ((r6 instanceof by4) == false) goto L7;
        by4 r0 = (by4) r6;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r7 = r0.o;
        int r8 = r0.q;
        xe0 r3 = xe0.n;
        if (r8 == 0) goto L17;
        if (r8 == 1) goto L16;
        if (r8 != 2) goto L14;
        Set r9 = (Set) r0.n;
        kb4.X(r7);
        return r9;
    L14:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L16:
        r5 = (yn3) r0.n;
        kb4.X(r7);
    L20:
        Set r10 = (Set) r7;
        if (r10.isEmpty() == true) goto L25;
        r0.n = r10;
        r0.q = 2;
        if (bu.i(r5, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", r0) != r3) goto L25;
    L24:
        return r3;
    L25:
        return r10;
    L17:
        kb4.X(r7);
        o54 r11 = new o54(21);
        r0.n = r5;
        r0.q = 1;
        r7 = r5.b("SELECT * FROM room_table_modification_log WHERE invalidated = 1", r11, r0);
        if (r7 != r3) goto L20;
    L7:
        r0 = new by4(r4, r6);
        goto L8
    }

    public static final Object b(jy4 r11, wd0 r12) {
        s24 r0 = r11.a;
        if ((r12 instanceof dy4) == false) goto L7;
        dy4 r1 = (dy4) r12;
        int r2 = r1.r;
        if ((r2 & Integer.MIN_VALUE) == 0) goto L7;
        r1.r = r2 - Integer.MIN_VALUE;
    L8:
        Object r13 = r1.p;
        int r3 = r1.r;
        vd0 r4 = null;
        int r5 = 1;
        if (r3 == 0) goto L18;
        if (r3 != 1) goto L16;
        qr2 r14 = r1.o;
        jy4 r6 = r1.n;
        kb4.X(r13);     // Catch: Throwable -> L14
        qr2 r15 = r14;
        r11 = r6;
        Object r7 = r13;
    L32:
        Set r8 = (Set) r7;     // Catch: Throwable -> L52
        if (r8.isEmpty() == true) goto L54;
        om1 r9 = r11.i;     // Catch: Throwable -> L52
        r9.getClass();     // Catch: Throwable -> L52
        r8.getClass();     // Catch: Throwable -> L52
        if (r8.isEmpty() == true) goto L50;
        nl4 r10 = (nl4) r9.o;     // Catch: Throwable -> L52
    L38:
        Object r16 = r10.getValue();     // Catch: Throwable -> L52
        int[] r17 = (int[]) r16;     // Catch: Throwable -> L52
        int r18 = r17.length;     // Catch: Throwable -> L52
        int[] r19 = new int[r18];     // Catch: Throwable -> L52
        int r20 = 0;
    L39:
        if (r20 >= r18) goto L45;
        if (r8.contains(Integer.valueOf(r20)) == false) goto L43;
        int r21 = r17[r20] + 1;     // Catch: Throwable -> L52
    L44:
        r19[r20] = r21;     // Catch: Throwable -> L52
        r20 = r20 + 1;     // Catch: Throwable -> L52
        goto L39
    L43:
        r21 = r17[r20];     // Catch: Throwable -> L52
        goto L44
    L45:
        f01 r22 = xl.e;     // Catch: Throwable -> L52
        if (r16 != null) goto L49;
        r16 = r22;
    L49:
        if (r10.j(r16, r19) == false) goto L38;
    L50:
        r11.e.invoke(r8);     // Catch: Throwable -> L52
    L52:
        th = move-exception;
        qr2 r110 = r15;
        Throwable th = th;
        r14 = r110;
    L56:
        r14.x();
        throw th;
    L54:
        r15.x();
        return r8;
    L14:
        th = th;
        goto L56
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r13);
        r15 = r0.f;
        boolean r23 = r15.d();
        z01 r24 = z01.n;
        if (r23 == true) goto L61;
        return r24;
    L61:
        if (r11.j.compareAndSet(true, false) == true) goto L25;
        r15.x();
        return r24;
    L25:
        if (((Boolean) r11.k.invoke()).booleanValue() == true) goto L28;
        r15.x();
        return r24;
    L28:
        ey4 r25 = new ey4(r11, r4, r5);     // Catch: Throwable -> L52
        r1.n = r11;     // Catch: Throwable -> L52
        r1.o = r15;     // Catch: Throwable -> L52
        r1.r = 1;     // Catch: Throwable -> L52
        r7 = r0.u(false, r25, r1);     // Catch: Throwable -> L52
        xe0 r26 = xe0.n;
        if (r7 != r26) goto L32;
        return r26;
    L7:
        r1 = new dy4(r11, r12);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x00de -> B:28:0x00e1). Please report as a decompilation issue!!! */
    public static final Object c(jy4 r17, mw4 r18, int r19, wd0 r20) {
        jy4 r0 = r17;
        yn3 r1 = r18;
        int r2 = r19;
        r0.getClass();
        if ((r20 instanceof fy4) == false) goto L7;
        fy4 r4 = (fy4) r20;
        int r5 = r4.w;
        if ((r5 & Integer.MIN_VALUE) == 0) goto L7;
        r4.w = r5 - Integer.MIN_VALUE;
    L8:
        Object r3 = r4.u;
        int r6 = r4.w;
        boolean r7 = true;
        xe0 r8 = xe0.n;
        if (r6 == 0) goto L16;
        if (r6 == 1) goto L15;
        if (r6 != 2) goto L13;
        int r9 = r4.t;
        int r10 = r4.s;
        r2 = r4.r;
        String[] r11 = r4.q;
        String r12 = r4.p;
        yn3 r13 = r4.o;
        jy4 r14 = r4.n;
        kb4.X(r3);
        boolean r21 = true;
    L28:
        r10 = r10 + 1;
        r7 = r21;
    L20:
        if (r10 >= r9) goto L30;
        String r15 = r11[r10];
        if (r14.d == false) goto L24;
        String r16 = "TEMP";
    L25:
        r21 = r7;
        StringBuilder r22 = b11.u("CREATE ", r16, " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + r12 + '_' + r15, "` AFTER ");
        f34.n(r22, r15, " ON `", r12, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
        String r23 = f34.i(r22, r2, " AND invalidated = 0; END");
        r4.n = r14;
        r4.o = r13;
        r4.p = r12;
        r4.q = r11;
        r4.r = r2;
        r4.s = r10;
        r4.t = r9;
        r4.w = 2;
        if (bu.i(r13, r23, r4) != r8) goto L28;
    L27:
        return r8;
    L24:
        r16 = "";
        goto L25
    L30:
        return j15.a;
    L13:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L15:
        int r24 = r4.r;
        r1 = r4.o;
        jy4 r25 = r4.n;
        kb4.X(r3);
        r2 = r24;
        r0 = r25;
    L19:
        String r26 = r0.g[r2];
        r11 = l;
        r14 = r0;
        r9 = 3;
        r13 = r1;
        r10 = 0;
        r12 = r26;
        goto L20
    L16:
        kb4.X(r3);
        String r27 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + r2 + ", 0)";
        r4.n = r0;
        r4.o = r1;
        r4.r = r2;
        r4.w = 1;
        if (bu.i(r1, r27, r4) != r8) goto L19;
    L7:
        r4 = new fy4(r0, r20);
        goto L8
    }

    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x008c -> B:19:0x008f). Please report as a decompilation issue!!! */
    public static final Object d(jy4 r7, mw4 r8, int r9, wd0 r10) {
        r7.getClass();
        if ((r10 instanceof gy4) == false) goto L7;
        gy4 r0 = (gy4) r10;
        int r1 = r0.u;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.u = r1 - Integer.MIN_VALUE;
    L8:
        Object r11 = r0.s;
        int r2 = r0.u;
        if (r2 == 0) goto L14;
        if (r2 != 1) goto L12;
        int r12 = r0.r;
        int r13 = r0.q;
        String[] r14 = r0.p;
        String r3 = r0.o;
        yn3 r4 = r0.n;
        kb4.X(r11);
        String[] r15 = r14;
        yn3 r16 = r4;
    L19:
        r13 = r13 + 1;
    L15:
        if (r13 >= r12) goto L21;
        String r5 = "DROP TRIGGER IF EXISTS `" + ("room_table_modification_trigger_" + r3 + '_' + r15[r13]) + '`';
        r0.n = r16;
        r0.o = r3;
        r0.p = r15;
        r0.q = r13;
        r0.r = r12;
        r0.u = 1;
        Object r6 = bu.i(r16, r5, r0);
        xe0 r17 = xe0.n;
        if (r6 != r17) goto L19;
        return r17;
    L21:
        return j15.a;
    L12:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L14:
        kb4.X(r11);
        r3 = r7.g[r9];
        r12 = 3;
        r16 = r8;
        r13 = 0;
        r15 = l;
    L7:
        r0 = new gy4(r7, r10);
        goto L8
    }

    public final void e(gf1 r5, gf1 r6) {
        r5.getClass();
        r6.getClass();
        if (this.j.compareAndSet(false, true) == false) goto L6;
        r5.invoke();
        vd0 r3 = null;
        fu.G(this.a.h(), new se0(), null, new p(this, r6, r3, 17), 2);
        return;
    }

    public final Object f(wd0 r7) {
        if ((r7 instanceof hy4) == false) goto L7;
        hy4 r0 = (hy4) r7;
        int r1 = r0.q;
        if ((r1 & Integer.MIN_VALUE) == 0) goto L7;
        r0.q = r1 - Integer.MIN_VALUE;
    L8:
        Object r8 = r0.o;
        int r2 = r0.q;
        vd0 r3 = null;
        if (r2 == 0) goto L18;
        if (r2 != 1) goto L16;
        qr2 r6 = r0.n;
        kb4.X(r8);     // Catch: Throwable -> L14
    L25:
        r6.x();
    L31:
        return j15.a;
    L14:
        th = th;
    L28:
        r6.x();
        throw th;
    L16:
        kf2.o("call to 'resume' before 'invoke' with coroutine");
        return null;
    L18:
        kb4.X(r8);
        s24 r9 = this.a;
        qr2 r4 = r9.f;
        if (r4.d() == false) goto L31;
        ey4 r5 = new ey4(this, r3, 2);     // Catch: Throwable -> L26
        r0.n = r4;     // Catch: Throwable -> L26
        r0.q = 1;     // Catch: Throwable -> L26
        Object r10 = r9.u(false, r5, r0);     // Catch: Throwable -> L26
        xe0 r11 = xe0.n;
        if (r10 != r11) goto L24;
        return r11;
    L24:
        r6 = r4;
    L26:
        th = th;
        r6 = r4;
    L7:
        r0 = new hy4(this, r7);
        goto L8
    }

    public final kd3 g(String[] r8) {
        fb4 r0 = new fb4();
        int r1 = r8.length;
        int r2 = 0;
        int r3 = 0;
    L3:
        if (r3 >= r1) goto L9;
        String r4 = r8[r3];
        String r5 = r4.toLowerCase(Locale.ROOT);
        r5.getClass();
        Set r6 = (Set) this.c.get(r5);
        if (r6 == null) goto L7;
        r0.addAll(r6);
    L8:
        r3 = r3 + 1;
        goto L3
    L7:
        r0.add(r4);
        goto L8
    L9:
        String[] r9 = (String[]) kb4.l(r0).toArray(new String[0]);
        int r7 = r9.length;
        int[] r10 = new int[r7];
    L10:
        if (r2 >= r7) goto L17;
        String r11 = r9[r2];
        String r12 = r11.toLowerCase(Locale.ROOT);
        r12.getClass();
        Integer r13 = (Integer) this.f.get(r12);
        if (r13 == null) goto L14;
        r10[r2] = r13.intValue();
        r2 = r2 + 1;
        goto L10
    L14:
        kf2.n("There is no table with name ".concat(r11));
        return null;
    L17:
        return new kd3(r9, r10);
    }
}
