package defpackage;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Message;
import androidx.media3.database.DatabaseIOException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class it0 extends Handler {
    public final HandlerThread a;
    public final fk0 b;
    public final z05 c;
    public final Handler d;
    public final ArrayList e;
    public final HashMap f;
    public int g;
    public boolean h;
    public int i;
    public int j;
    public int k;
    public boolean l;

    public it0(HandlerThread r2, fk0 r3, z05 r4, Handler r5, boolean r6) {
        super(r2.getLooper());
        this.a = r2;
        this.b = r3;
        this.c = r4;
        this.d = r5;
        this.i = 3;
        this.j = 5;
        this.h = r6;
        this.e = new ArrayList();
        this.f = new HashMap();
    }

    public static ns0 a(ns0 r12, int r13, int r14) {
        return new ns0(r12.a, r13, r12.c, System.currentTimeMillis(), r12.e, r14, 0, r12.h);
    }

    public final ns0 b(String r3, boolean r4) {
        int r0 = c(r3);
        if (r0 != (-1)) goto L5;
        if (r4 == false) goto L15;
        return this.b.d(r3);
    L9:
        e = move-exception;
        l93.G("DownloadManager", "Failed to load download: " + r3, e);
        return null;
    L15:
        return null;
    L5:
        return (ns0) this.e.get(r0);
    }

    public final int c(String r4) {
        int r0 = 0;
    L3:
        ArrayList r1 = this.e;
        if (r0 >= r1.size()) goto L9;
        if (((ns0) r1.get(r0)).a.n.equals(r4) == true) goto L7;
        r0 = r0 + 1;
        goto L3
    L7:
        return r0;
    L9:
        return -1;
    }

    public final void d(ns0 r12) {
        int r0 = r12.b;
        boolean r1 = true;
        if (r0 != 3) goto L5;
    L7:
        boolean r2 = false;
    L8:
        rr2.w(r2);
        int r3 = c(r12.a.n);
        int r5 = 11;
        ArrayList r6 = this.e;
        if (r3 != (-1)) goto L12;
        r6.add(r12);
        Collections.sort(r6, new n7(r5));
    L24:
        this.b.j(r12);     // Catch: IOException -> L20
    L22:
        this.d.obtainMessage(3, new ht0(r12, false, new ArrayList(r6), null)).sendToTarget();
        return;
    L20:
        e = move-exception;
        l93.G("DownloadManager", "Failed to update index.", e);
        goto L22
    L12:
        if (r12.c != ((ns0) r6.get(r3)).c) goto L15;
        r1 = false;
    L15:
        r6.set(r3, r12);
        if (r1 == false) goto L24;
        Collections.sort(r6, new n7(r5));
        goto L24
    L5:
        if (r0 == 4) goto L7;
        r2 = true;
        goto L8
    }

    public final ns0 e(ns0 r2, int r3, int r4) {
        if (r3 != 3) goto L5;
    L7:
        boolean r0 = false;
    L8:
        rr2.w(r0);
        ns0 r5 = a(r2, r3, r4);
        d(r5);
        return r5;
    L5:
        if (r3 == 4) goto L7;
        r0 = true;
        goto L8
    }

    public final void f(ns0 r14, int r15) {
        if (r15 != 0) goto L9;
        if (r14.b != 1) goto L17;
        e(r14, 0, 0);
        return;
    L17:
        return;
    L9:
        if (r15 == r14.f) goto L18;
        int r2 = r14.b;
        if (r2 != 0) goto L13;
    L14:
        r2 = 1;
    L15:
        d(new ns0(r14.a, r2, r14.c, System.currentTimeMillis(), r14.e, r15, 0, r14.h));
        return;
    L13:
        if (r2 != 2) goto L15;
    }

    public final void g() {
        int r8 = 0;
        int r9 = 0;
    L3:
        ArrayList r0 = this.e;
        if (r8 >= r0.size()) goto L53;
        ns0 r1 = (ns0) r0.get(r8);
        tt0 r10 = r1.a;
        String r2 = r10.n;
        HashMap r11 = this.f;
        kt0 r12 = (kt0) r11.get(r2);
        int r3 = r1.b;
        z05 r4 = this.c;
        if (r3 == 0) goto L33;
        if (r3 == 1) goto L31;
        if (r3 != 2) goto L10;
        r12.getClass();
        rr2.w(!r12.q);
        if (this.h == false) goto L27;
    L30:
        e(r1, 0, 0);
        r12.a(false);
    L48:
        if (r12 == null) goto L52;
        if (r12.q == true) goto L52;
        r9 = r9 + 1;
    L52:
        r8 = r8 + 1;
        goto L3
    L27:
        if (this.g != 0) goto L30;
        if (r9 < this.i) goto L48;
    L10:
        if (r3 != 5) goto L12;
    L16:
        if (r12 == null) goto L21;
        if (r12.q == true) goto L48;
        r12.a(false);
        goto L48
    L21:
        if (this.l == true) goto L48;
        kt0 r5 = new kt0(r1.a, r4.d(r10), r1.h, true, this.j, this);
        r11.put(r10.n, r5);
        this.l = true;
        r5.start();
        goto L48
    L12:
        if (r3 == 7) goto L16;
        tb4.a();
        return;
    L31:
        if (r12 == null) goto L48;
        rr2.w(!r12.q);
        r12.a(false);
        goto L48
    L33:
        if (r12 == null) goto L36;
        rr2.w(!r12.q);
        r12.a(false);
        goto L48
    L36:
        if (this.h == false) goto L38;
    L47:
        kt0 r6 = null;
    L46:
        r12 = r6;
        goto L48
    L38:
        if (this.g != 0) goto L47;
        if (this.k >= this.i) goto L47;
        ns0 r7 = e(r1, 2, 0);
        tt0 r13 = r7.a;
        r6 = new kt0(r7.a, r4.d(r13), r7.h, false, this.j, this);
        r11.put(r13.n, r6);
        int r14 = this.k;
        this.k = r14 + 1;
        if (r14 != 0) goto L45;
        sendEmptyMessageDelayed(12, 5000);
    L45:
        r6.start();
        goto L46
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r29v0, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // android.os.Handler
    public final void handleMessage(Message r36) {
        int r5 = 7;
        ek0 r7 = null;
        boolean r10 = false;
        int r11 = 0;
        int r12 = 0;
        r12 = 0;
        int r13 = 0;
        int r14 = 0;
        int r15 = 1;
        switch(r36.what) {
            case 1: goto L193;
            case 2: goto L190;
            case 3: goto L188;
            case 4: goto L167;
            case 5: goto L166;
            case 6: goto L165;
            case 7: goto L128;
            case 8: goto L124;
            case 9: goto L90;
            case 10: goto L41;
            case 11: goto L34;
            case 12: goto L22;
            case 13: goto L6;
            default: goto L4;
        };
    L4:
        tb4.a();
        return;
    L6:
        Iterator r0 = this.f.values().iterator();
    L8:
        if (r0.hasNext() == false) goto L214;
        ((kt0) r0.next()).a(true);
        goto L8
    L214:
        this.b.l();     // Catch: IOException -> L12
    L14:
        this.e.clear();
        this.a.quit();
        monitor-enter(this);
        notifyAll();     // Catch: Throwable -> L19
        monitor-exit(this);     // Catch: Throwable -> L19
        return;
    L19:
        th = move-exception;
        throw th;
    L12:
        e = move-exception;
        l93.G("DownloadManager", "Failed to update index.", e);
        goto L14
    L22:
        ArrayList r2 = this.e;
    L24:
        if (r11 >= r2.size()) goto L32;
        ns0 r1 = (ns0) r2.get(r11);
        if (r1.b != 2) goto L31;
        this.b.j(r1);     // Catch: IOException -> L29
    L29:
        e = move-exception;
        l93.G("DownloadManager", "Failed to update index.", e);
    L31:
        r11 = r11 + 1;
        goto L24
    L32:
        sendEmptyMessageDelayed(12, 5000);
        return;
    L34:
        kt0 r3 = (kt0) r36.obj;
        int r4 = r36.arg1;
        int r6 = r36.arg2;
        String r8 = f35.a;
        long r18 = ((((long) r4) & 4294967295L) << 32) | (4294967295L & ((long) r6));
        ns0 r9 = b(r3.n.n, false);
        r9.getClass();
        if (r18 != r9.e) goto L37;
        return;
    L37:
        if (r18 == (-1)) goto L255;
        d(new ns0(r9.a, r9.b, r9.c, System.currentTimeMillis(), r18, r9.f, r9.g, r9.h));
        return;
    L255:
        return;
    L41:
        kt0 r16 = (kt0) r36.obj;
        String r17 = r16.n.n;
        this.f.remove(r17);
        boolean r19 = r16.q;
        if (r19 == false) goto L44;
        this.l = false;
    L48:
        if (r16.t == false) goto L50;
        g();
    L208:
        this.d.obtainMessage(2, r12, this.f.size()).sendToTarget();
        return;
    L50:
        Exception r20 = r16.u;
        if (r20 == null) goto L53;
        l93.G("DownloadManager", "Task failed: " + r16.n + ", " + r19, r20);
    L53:
        ns0 r110 = b(r17, false);
        r110.getClass();
        int r21 = r110.b;
        if (r21 == 2) goto L75;
        if (r21 == 5) goto L60;
        if (r21 == 7) goto L60;
        tb4.a();
        return;
    L60:
        rr2.w(r19);
        ArrayList r22 = this.e;
        int r23 = r110.b;
        tt0 r24 = r110.a;
        if (r23 != 7) goto L66;
        int r25 = r110.f;
        if (r25 != 0) goto L65;
        r15 = 0;
    L65:
        e(r110, r15, r25);
        g();
    L89:
        g();
        goto L208
    L66:
        r22.remove(c(r24.n));
        fk0 r26 = this.b;     // Catch: IOException -> L73
        String r27 = r24.n;     // Catch: IOException -> L73
        r26.b();     // Catch: IOException -> L73
        r26.b.getWritableDatabase().delete("ExoPlayerDownloads", "id = ?", new String[]{r27});     // Catch: SQLiteException -> L70 IOException -> L73
    L74:
        this.d.obtainMessage(3, new ht0(r110, true, new ArrayList(r22), null)).sendToTarget();
        goto L89
    L70:
        e = move-exception;
        throw new DatabaseIOException(e);     // Catch: IOException -> L73
    L73:
        l93.F("DownloadManager", "Failed to remove from database");
        goto L74
    L75:
        rr2.w(!r19);
        ArrayList r28 = this.e;
        tt0 r111 = r110.a;
        if (r20 != null) goto L78;
        int r112 = 3;
    L79:
        long r29 = r110.c;
        long r113 = System.currentTimeMillis();
        long r30 = r110.e;
        int r31 = r110.f;
        if (r20 != null) goto L82;
        int r210 = 0;
    L83:
        ns0 r114 = new ns0(r111, r112, r29, r113, r30, r31, r210, r110.h);
        r28.remove(c(r114.a.n));
        this.b.j(r114);     // Catch: IOException -> L86
    L88:
        this.d.obtainMessage(3, new ht0(r114, false, new ArrayList(r28), r20)).sendToTarget();
    L86:
        e = move-exception;
        l93.G("DownloadManager", "Failed to update index.", e);
        goto L88
    L82:
        r210 = 1;
        goto L83
    L78:
        r112 = 4;
        goto L79
    L44:
        int r115 = this.k - 1;
        this.k = r115;
        if (r115 != 0) goto L48;
        removeMessages(12);
        goto L48
    L90:
        fk0 r32 = this.b;
        ArrayList r33 = this.e;
        ArrayList r34 = new ArrayList();
        ek0 r35 = r32.g(new int[]{3, 4});     // Catch: IOException -> L105
    L220:
        Cursor r37 = r35.n;     // Catch: Throwable -> L96
        if (r37.moveToPosition(r37.getPosition() + 1) == false) goto L98;
        r34.add(fk0.e(r35.n));     // Catch: Throwable -> L96
    L98:
        r35.close();     // Catch: IOException -> L105
    L106:
        int r38 = 0;
    L108:
        if (r38 >= r33.size()) goto L110;
        r33.set(r38, a((ns0) r33.get(r38), 5, 0));
        r38 = r38 + 1;
        goto L108
    L110:
        int r39 = 0;
    L112:
        if (r39 >= r34.size()) goto L114;
        r33.add(a((ns0) r34.get(r39), 5, 0));
        r39 = r39 + 1;
        goto L112
    L114:
        Collections.sort(r33, new n7(11));
        r32.m();     // Catch: IOException -> L117
    L119:
        ArrayList r40 = new ArrayList(r33);
        int r41 = 0;
    L121:
        if (r41 >= r33.size()) goto L123;
        this.d.obtainMessage(3, new ht0((ns0) r33.get(r41), false, r40, null)).sendToTarget();
        r41 = r41 + 1;
        goto L121
    L123:
        g();
    L207:
        r12 = 1;
    L117:
        e = move-exception;
        l93.G("DownloadManager", "Failed to update index.", e);
    L96:
        th = move-exception;
        r35.close();     // Catch: Throwable -> L102
    L256:
        throw th;     // Catch: IOException -> L105
    L102:
        th = move-exception;
        th.addSuppressed(th);     // Catch: IOException -> L105
        throw th;     // Catch: IOException -> L105
    L105:
        l93.F("DownloadManager", "Failed to load downloads.");
        goto L106
    L124:
        String r42 = (String) r36.obj;
        ns0 r43 = b(r42, true);
        if (r43 != null) goto L127;
        l93.F("DownloadManager", "Failed to remove nonexistent download: " + r42);
        goto L207
    L127:
        e(r43, 5, 0);
        g();
        goto L207
    L128:
        tt0 r116 = (tt0) r36.obj;
        int r44 = r36.arg1;
        ns0 r45 = b(r116.n, true);
        long r117 = System.currentTimeMillis();
        if (r45 == null) goto L160;
        int r46 = r45.b;
        if (r46 != 5) goto L133;
    L137:
        long r118 = r117;
    L138:
        if (r46 == 5) goto L144;
        if (r46 == 7) goto L144;
        if (r44 == 0) goto L143;
        r5 = 1;
        goto L144
    L143:
        r5 = 0;
    L144:
        tt0 r47 = r45.a;
        String r48 = r47.n;
        String r49 = r116.n;
        List r50 = r116.q;
        rr2.l(r48.equals(r49));
        List r51 = r47.q;
        if (r51.isEmpty() == false) goto L147;
    L157:
        ?? r52 = Collections.EMPTY_LIST;
    L158:
        d(new ns0(new tt0(r47.n, r116.o, r116.p, r52, r116.r, r116.s, r116.t, r116.u, r116.v), r5, r118, r117, r44));
    L164:
        g();
        goto L207
    L147:
        if (r50.isEmpty() == true) goto L157;
        r52 = new ArrayList(r51);
    L151:
        if (r13 >= r50.size()) goto L158;
        fm4 r53 = (fm4) r50.get(r13);
        if (r52.contains(r53) == true) goto L155;
        r52.add(r53);
    L155:
        r13 = r13 + 1;
        goto L151
    L133:
        if (r46 == 3) goto L137;
        if (r46 == 4) goto L137;
        r118 = r45.c;
        goto L138
    L160:
        if (r44 == 0) goto L162;
        int r119 = 1;
    L163:
        d(new ns0(r116, r119, r117, r117, r44));
        goto L164
    L162:
        r119 = 0;
        goto L163
    L165:
        this.j = r36.arg1;
        goto L207
    L166:
        this.i = r36.arg1;
        g();
        goto L207
    L167:
        String r54 = (String) r36.obj;
        int r55 = r36.arg1;
        fk0 r56 = this.b;
        ArrayList r57 = this.e;
        if (r54 == null) goto L170;
        ns0 r58 = b(r54, false);
        if (r58 == null) goto L216;
        f(r58, r55);
    L187:
        g();
        goto L207
    L216:
        r56.n(r55, r54);     // Catch: IOException -> L185
    L185:
        e = move-exception;
        l93.G("DownloadManager", "Failed to set manual stop reason: ".concat(r54), e);
    L170:
        if (r14 >= r57.size()) goto L233;
        f((ns0) r57.get(r14), r55);
        r14 = r14 + 1;
        goto L170
    L233:
        r56.b();     // Catch: IOException -> L178
        ContentValues r59 = new ContentValues();     // Catch: SQLException -> L175 IOException -> L178
        r59.put("stop_reason", Integer.valueOf(r55));     // Catch: SQLException -> L175 IOException -> L178
        r56.b.getWritableDatabase().update("ExoPlayerDownloads", r59, fk0.e, null);     // Catch: SQLException -> L175 IOException -> L178
    L175:
        e = move-exception;
        throw new DatabaseIOException(e);     // Catch: IOException -> L178
    L178:
        e = move-exception;
        l93.G("DownloadManager", "Failed to set manual stop reason", e);
        goto L187
    L188:
        this.g = r36.arg1;
        g();
        goto L207
    L193:
        int r60 = r36.arg1;
        fk0 r61 = this.b;
        ArrayList r62 = this.e;
        this.g = r60;
        r61.l();     // Catch: Throwable -> L199 IOException -> L201
        r7 = r61.g(new int[]{0, 1, 2, 5, 7});     // Catch: Throwable -> L199 IOException -> L201
    L195:
        Cursor r63 = r7.n;     // Catch: Throwable -> L199 IOException -> L201
        if (r63.moveToPosition(r63.getPosition() + 1) == false) goto L203;
        r62.add(fk0.e(r7.n));     // Catch: Throwable -> L199 IOException -> L201
    L203:
        f35.h(r7);
        this.d.obtainMessage(1, new ArrayList(r62)).sendToTarget();
        g();
    L199:
        th = move-exception;
        f35.h(r7);
        throw th;
    L201:
        e = move-exception;
        l93.G("DownloadManager", "Failed to load index.", e);     // Catch: Throwable -> L199
        r62.clear();     // Catch: Throwable -> L199
        goto L203
    L190:
        if (r36.arg1 == 0) goto L192;
        r10 = true;
    L192:
        this.h = r10;
        g();
        goto L207
    }
}
