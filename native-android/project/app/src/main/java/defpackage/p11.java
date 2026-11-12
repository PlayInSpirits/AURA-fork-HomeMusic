package defpackage;

import android.database.Cursor;
import android.text.TextUtils;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class p11 {
    public static final String a = null;

    static {
        a = cx.i("EnqueueRunnable");
    }

    public static void a(mc5 r5) {
        sc5 r0 = r5.a;
        HashSet r1 = new HashSet();
        r1.addAll(r5.e);
        HashSet r2 = mc5.b(r5);
        Iterator r3 = r1.iterator();
    L4:
        if (r3.hasNext() == false) goto L8;
        if (r2.contains((String) r3.next()) == false) goto L4;
        boolean r4 = true;
    L9:
        if (r4 == true) goto L19;
        WorkDatabase r6 = r0.c;
        r90 r7 = r0.b;
        r6.c();
        gh0.e(r6, r7, r5);     // Catch: Throwable -> L16
        boolean r8 = b(r5);     // Catch: Throwable -> L16
        r6.t();     // Catch: Throwable -> L16
        r6.o();
        if (r8 == false) goto L26;
        c64.b(r7, r0.c, r0.e);
        return;
    L26:
        return;
    L16:
        th = move-exception;
        r6.o();
        throw th;
    L19:
        nz2.w(r5, ")", "WorkContinuation has cycles (");
        return;
    L8:
        r1.removeAll(r5.e);
        r4 = false;
        goto L9
    }

    public static boolean b(mc5 r24) {
        HashSet r1 = mc5.b(r24);
        sc5 r2 = r24.a;
        List r3 = r24.d;
        int r4 = 0;
        String[] r5 = (String[]) r1.toArray(new String[0]);
        String r6 = r24.b;
        int r7 = r24.c;
        r2.b.d.getClass();
        long r8 = System.currentTimeMillis();
        WorkDatabase r9 = r2.c;
        if (r5 != null) goto L5;
    L7:
        boolean r11 = false;
    L9:
        if (r11 == false) goto L28;
        int r15 = r5.length;
        boolean r18 = false;
        boolean r19 = false;
        boolean r17 = true;
    L11:
        if (r4 >= r15) goto L29;
        String r10 = r5[r4];
        dd5 r14 = r9.A().h(r10);
        if (r14 == null) goto L14;
        int r12 = r14.b;
        if (r12 != 3) goto L20;
        boolean r16 = true;
    L21:
        r17 = r17 & r16;
        if (r12 != 4) goto L25;
        r19 = true;
    L27:
        r4 = r4 + 1;
        goto L11
    L25:
        if (r12 != 6) goto L27;
        r18 = true;
        goto L27
    L20:
        r16 = false;
        goto L21
    L14:
        cx.f().d(a, "Prerequisite " + r10 + " doesn't exist; not enqueuing");
    L15:
        boolean r13 = false;
    L141:
        r24.g = true;
        return r13;
    L29:
        boolean r20 = TextUtils.isEmpty(r6);
        if (r20 == true) goto L91;
        if (r11 == true) goto L91;
        ArrayList r110 = r9.A().i(r6);
        if (r110.isEmpty() == true) goto L91;
        if (r7 == 3) goto L50;
        if (r7 == 4) goto L50;
        if (r7 != 2) goto L46;
        int r21 = r110.size();
        int r111 = 0;
    L40:
        if (r111 >= r21) goto L46;
        Object r112 = r110.get(r111);
        r111 = r111 + 1;
        int r113 = ((cd5) r112).b;
        if (r113 == 1) goto L15;
        if (r113 != 2) goto L40;
    L46:
        r9.getClass();
        r9.s(new v6(r9, r6, r2, 4));
        fd5 r22 = r9.A();
        int r114 = r110.size();
        int r115 = 0;
    L47:
        if (r115 >= r114) goto L49;
        Object r116 = r110.get(r115);
        r115 = r115 + 1;
        r22.a(((cd5) r116).a);
        goto L47
    L49:
        List r23 = r3;
        boolean r25 = r20;
        WorkDatabase r26 = r9;
        boolean r27 = true;
    L92:
        Iterator r28 = r23.iterator();
        boolean r117 = r27;
    L94:
        if (r28.hasNext() == false) goto L140;
        bd5 r29 = (bd5) r28.next();
        dd5 r30 = r29.b;
        UUID r118 = r29.a;
        if (r11 == false) goto L104;
        if (r17 == true) goto L104;
        if (r19 == false) goto L101;
        r30.b = 4;
    L106:
        if (r30.b != 1) goto L108;
        r117 = true;
    L108:
        fd5 r31 = r26.A();
        dd5 r32 = gh0.K(r2.e, r30);
        WorkDatabase_Impl r119 = r31.a;
        r119.b();
        r119.c();
        r31.b.m(r32);     // Catch: Throwable -> L137
        r119.t();     // Catch: Throwable -> L137
        r119.o();
        if (r11 == false) goto L120;
        int r33 = r5.length;
        int r34 = 0;
    L113:
        if (r34 >= r33) goto L120;
        String r120 = r5[r34];
        String r121 = r118.toString();
        r121.getClass();
        to0 r122 = new to0(r121, r120);
        wo0 r123 = r26.v();
        WorkDatabase_Impl r124 = (WorkDatabase_Impl) r123.n;
        r124.b();
        r124.c();
        ((vo0) r123.o).m(r122);     // Catch: Throwable -> L117
        r124.t();     // Catch: Throwable -> L117
        r124.o();
        r34 = r34 + 1;
    L117:
        th = move-exception;
        r124.o();
        throw th;
    L120:
        hd5 r35 = r26.B();
        String r36 = r118.toString();
        r36.getClass();
        Set r37 = r29.c;
        r35.getClass();
        r36.getClass();
        r37.getClass();
        Iterator r38 = r37.iterator();
    L122:
        if (r38.hasNext() == false) goto L129;
        gd5 r125 = new gd5((String) r38.next(), r36);
        WorkDatabase_Impl r126 = (WorkDatabase_Impl) r35.o;
        r126.b();
        r126.c();
        ((vo0) r35.p).m(r125);     // Catch: Throwable -> L126
        r126.t();     // Catch: Throwable -> L126
        r126.o();
    L126:
        th = move-exception;
        r126.o();
        throw th;
    L129:
        if (r25 == true) goto L94;
        xc5 r39 = r26.y();
        String r40 = r118.toString();
        r40.getClass();
        wc5 r41 = new wc5(r6, r40);
        WorkDatabase_Impl r42 = (WorkDatabase_Impl) r39.o;
        r42.b();
        r42.c();
        ((vo0) r39.p).m(r41);     // Catch: Throwable -> L133
        r42.t();     // Catch: Throwable -> L133
        r42.o();
    L133:
        th = move-exception;
        r42.o();
        throw th;
    L137:
        th = move-exception;
        r119.o();
        throw th;
    L101:
        if (r18 == false) goto L103;
        r30.b = 6;
        goto L106
    L103:
        r30.b = 5;
    L104:
        r30.n = r8;
        goto L106
    L140:
        r13 = r117;
    L50:
        wo0 r127 = r9.v();
        ArrayList r128 = new ArrayList();
        int r129 = r110.size();
        int r130 = 0;
    L51:
        if (r130 >= r129) goto L78;
        Object r210 = r110.get(r130);
        r130 = r130 + 1;
        cd5 r131 = (cd5) r210;
        List r211 = r3;
        String r43 = r131.a;
        r127.getClass();
        boolean r212 = r20;
        WorkDatabase r213 = r9;
        w24 r44 = w24.b(1, "SELECT COUNT(*)>0 FROM dependency WHERE prerequisite_id=?");
        r44.h(1, r43);
        WorkDatabase_Impl r45 = (WorkDatabase_Impl) r127.n;
        r45.b();
        Cursor r46 = xl.H(r45, r44);
    L58:
        th = move-exception;
        r46.close();
        r44.j();
        throw th;
    L54:
        if (r46.moveToFirst() == false) goto L60;
        boolean r47 = false;
        if (r46.getInt(0) == 0) goto L61;
        boolean r132 = true;
    L62:
        r46.close();
        r44.j();
        if (r132 == true) goto L75;
        int r48 = r131.b;
        if (r48 != 3) goto L67;
        boolean r133 = true;
    L68:
        boolean r134 = r17 & r133;
        if (r48 != 4) goto L72;
        r19 = true;
    L74:
        r128.add(r131.a);
        r17 = r134;
        goto L75
    L72:
        if (r48 != 6) goto L74;
        r18 = true;
        goto L74
    L67:
        r133 = r47;
    L75:
        r3 = r211;
        r20 = r212;
        r9 = r213;
    L61:
        r132 = r47;
        goto L62
    L60:
        r47 = false;
        goto L61
    L78:
        r23 = r3;
        r25 = r20;
        r26 = r9;
        boolean r49 = false;
        List r135 = r128;
        r135 = r128;
        if (r7 != 4) goto L86;
        if (r18 == true) goto L82;
        if (r19 == false) goto L86;
    L82:
        fd5 r50 = r26.A();
        ArrayList r51 = r50.i(r6);
        int r52 = r51.size();
        int r136 = 0;
    L83:
        if (r136 >= r52) goto L85;
        Object r137 = r51.get(r136);
        r136 = r136 + 1;
        r50.a(((cd5) r137).a);
        goto L83
    L85:
        r18 = false;
        r19 = false;
        r135 = Collections.EMPTY_LIST;
    L86:
        r5 = (String[]) r135.toArray(r5);
        if (r5.length <= 0) goto L89;
        r11 = true;
    L90:
        r27 = r49;
        goto L92
    L89:
        r11 = false;
    L91:
        r23 = r3;
        r25 = r20;
        r26 = r9;
        r49 = false;
        goto L90
    L28:
        r17 = true;
        r18 = false;
        r19 = false;
        goto L29
    L5:
        if (r5.length <= 0) goto L7;
        r11 = true;
        goto L9
    }
}
