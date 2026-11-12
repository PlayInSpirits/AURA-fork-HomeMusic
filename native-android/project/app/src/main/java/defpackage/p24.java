package defpackage;

import android.content.Context;
import android.content.Intent;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class p24 {
    public boolean a;
    public boolean b;
    public final li0 c;
    public final qz0 d;
    public final List e;
    public final fa0 f;
    public we1 g;

    public p24(li0 r10, qz0 r11) {
        r24 r0 = r10.g;
        ro4 r1 = r10.c;
        String r4 = r10.b;
        this.c = r10;
        this.d = r11;
        List r2 = r10.e;
        if (r2 != null) goto L5;
        r2 = u01.n;
    L5:
        this.e = r2;
        y34 r3 = r10.t;
        boolean r8 = true;
        if (r3 != null) goto L11;
        if (r1 == null) goto L9;
        Context r5 = r10.a;
        r5.getClass();
        this.f = new qo4(new pz1(r1.c(new y10(r5, r4, new o24(this, r11.a), false, false))));
    L29:
        if (r0 == r24.p) goto L32;
        r8 = false;
    L32:
        so4 r9 = c();
        if (r9 == null) goto L36;
        r9.setWriteAheadLoggingEnabled(r8);
        return;
    L36:
        return;
    L9:
        kf2.n("SQLiteManager was constructed with both null driver and open helper factory!");
        throw null;
    L11:
        if (r4 != null) goto L13;
        ia0 r12 = new ia0(new rf2(this, r3));
    L27:
        this.f = r12;
        goto L29
    L13:
        rf2 r13 = new rf2(this, r3);
        int r14 = r0.ordinal();
        if (r14 == 1) goto L19;
        if (r14 != 2) goto L18;
        int r15 = 4;
    L20:
        int r6 = r0.ordinal();
        if (r6 == 1) goto L26;
        if (r6 == 2) goto L26;
        throw new IllegalStateException(("Can't get max number of writers for journal mode '" + r0 + '\'').toString());
    L26:
        r12 = new ia0(r13, r4, r15);
        goto L27
    L18:
        throw new IllegalStateException(("Can't get max number of reader for journal mode '" + r0 + '\'').toString());
    L19:
        r15 = 1;
        goto L20
    }

    public static final void a(p24 r5, x34 r6) {
        qz0 r0 = r5.d;
        li0 r2 = r5.c;
        r24 r3 = r2.g;
        r24 r4 = r24.p;
        if (r3 != r4) goto L5;
        h12.n(r6, "PRAGMA journal_mode = WAL");
    L7:
        if (r2.g != r4) goto L9;
        h12.n(r6, "PRAGMA synchronous = NORMAL");
    L10:
        b(r6);
        z34 r7 = r6.U("PRAGMA user_version");
        r7.O();     // Catch: Throwable -> L33
        int r8 = (int) r7.getLong(0);
        ud3.e(r7, null);
        int r1 = r0.a;
        if (r8 == r1) goto L31;
        h12.n(r6, "BEGIN EXCLUSIVE TRANSACTION");
        if (r8 != 0) goto L19;
        r5.d(r6);     // Catch: Throwable -> L17
    L20:
        h12.n(r6, "PRAGMA user_version = " + r1);     // Catch: Throwable -> L17
        Object r9 = j15.a;     // Catch: Throwable -> L17
    L24:
        if ((r9 instanceof s14) == true) goto L26;
        j15 r10 = (j15) r9;
        h12.n(r6, "END TRANSACTION");
    L26:
        Throwable r11 = bb3.a(r9);
        if (r11 == null) goto L31;
        h12.n(r6, "ROLLBACK TRANSACTION");
        throw r11;
    L19:
        r5.e(r6, r8, r1);     // Catch: Throwable -> L17
    L17:
        th = move-exception;
        r9 = new s14(th);
    L31:
        r5.f(r6);
        return;
    L33:
        th = move-exception;
        throw th;     // Catch: Throwable -> L35
    L35:
        th = move-exception;
        ud3.e(r7, th);
        throw th;
    L9:
        h12.n(r6, "PRAGMA synchronous = FULL");
        goto L10
    L5:
        h12.n(r6, "PRAGMA journal_mode = TRUNCATE");
        goto L7
    }

    public static void b(x34 r5) {
        z34 r0 = r5.U("PRAGMA busy_timeout");
        r0.O();     // Catch: Throwable -> L8
        long r1 = r0.getLong(0);     // Catch: Throwable -> L8
        ud3.e(r0, null);
        if (r1 >= 3000) goto L17;
        h12.n(r5, "PRAGMA busy_timeout = 3000");
        return;
    L17:
        return;
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L10
    L10:
        th = move-exception;
        ud3.e(r0, th);
        throw th;
    }

    public final so4 c() {
        fa0 r2 = this.f;
        if ((r2 instanceof qo4) == false) goto L5;
        qo4 r3 = (qo4) r2;
    L6:
        if (r3 != null) goto L8;
        return null;
    L8:
        return (so4) r3.n.o;
    L5:
        r3 = null;
        goto L6
    }

    public final void d(x34 r8) {
        r8.getClass();
        z34 r0 = r8.U("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'");
        boolean r2 = false;
        if (r0.O() == false) goto L11;
        if (r0.getLong(0) != 0) goto L11;
        r2 = true;
    L11:
        ud3.e(r0, null);
        qz0 r1 = this.d;
        r1.a(r8);
        if (r2 == true) goto L18;
        u24 r3 = r1.v(r8);
        if (r3.a == true) goto L18;
        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + r3.b).toString());
    L18:
        h12.n(r8, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        h12.n(r8, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) r1.b) + "')");
        r1.r(r8);
        Iterator r7 = this.e.iterator();
    L20:
        if (r7.hasNext() == false) goto L24;
        ((m30) r7.next()).getClass();
        if ((r8 instanceof po4) == false) goto L20;
        ((po4) r8).n.getClass();
        goto L20
    L24:
        return;
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L26
    L26:
        th = move-exception;
        ud3.e(r0, th);
        throw th;
    }

    public final void e(x34 r5, int r6, int r7) {
        r5.getClass();
        li0 r0 = this.c;
        List r1 = si0.u(r0.d, r6, r7);
        qz0 r2 = this.d;
        if (r1 == null) goto L15;
        r2.u(r5);
        Iterator r4 = r1.iterator();
    L6:
        if (r4.hasNext() == false) goto L8;
        ((jw2) r4.next()).b(r5);
        goto L6
    L8:
        u24 r8 = r2.v(r5);
        if (r8.a == false) goto L13;
        r2.t(r5);
        h12.n(r5, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        h12.n(r5, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) r2.b) + "')");
        return;
    L13:
        throw new IllegalStateException(("Migration didn't properly handle: " + r8.b).toString());
    L15:
        if (si0.B(r0, r6, r7) == true) goto L52;
        if (r0.s == false) goto L42;
        z34 r9 = r5.U("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'");
        qb2 r10 = gb.r();     // Catch: Throwable -> L28
    L21:
        if (r9.O() == false) goto L30;
        String r3 = r9.D(0);     // Catch: Throwable -> L28
        if (xm4.k0(r3, "sqlite_", false) == true) goto L21;
        if (r3.equals("android_metadata") == true) goto L21;
        r10.add(new kd3(r3, Boolean.valueOf(h12.c(r9.D(1), "view"))));     // Catch: Throwable -> L28
        goto L21
    L30:
        qb2 r11 = gb.f(r10);     // Catch: Throwable -> L28
        ud3.e(r9, null);
        ListIterator r12 = r11.listIterator(0);
    L32:
        dm1 r13 = (dm1) r12;
        if (r13.hasNext() == false) goto L43;
        kd3 r14 = (kd3) r13.next();
        String r15 = (String) r14.n;
        if (((Boolean) r14.o).booleanValue() == true) goto L36;
        h12.n(r5, "DROP TABLE IF EXISTS " + r15);
        goto L32
    L36:
        h12.n(r5, "DROP VIEW IF EXISTS " + r15);
    L43:
        Iterator r16 = this.e.iterator();
    L45:
        if (r16.hasNext() == false) goto L49;
        ((m30) r16.next()).getClass();
        if ((r5 instanceof po4) == false) goto L45;
        ((po4) r5).n.getClass();
        goto L45
    L49:
        r2.a(r5);
        return;
    L28:
        th = move-exception;
        throw th;     // Catch: Throwable -> L39
    L39:
        th = move-exception;
        ud3.e(r9, th);
        throw th;
    L42:
        r2.c(r5);
        goto L43
    L52:
        throw new IllegalStateException(("A migration from " + r6 + " to " + r7 + " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* functions.").toString());
    }

    public final void f(x34 r10) {
        r10.getClass();
        z34 r1 = r10.U("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name = 'room_master_table'");
    L9:
        th = move-exception;
        throw th;     // Catch: Throwable -> L58
    L58:
        th = move-exception;
        ud3.e(r1, th);
        throw th;
    L4:
        if (r1.O() == false) goto L11;
        if (r1.getLong(0) == 0) goto L11;
        boolean r2 = true;
    L12:
        ud3.e(r1, null);
        qz0 r3 = this.d;
        if (r2 == false) goto L33;
        z34 r0 = r10.U("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1");
    L19:
        th = move-exception;
        throw th;     // Catch: Throwable -> L30
    L30:
        th = move-exception;
        ud3.e(r0, th);
        throw th;
    L16:
        if (r0.O() == false) goto L21;
        String r4 = r0.D(0);     // Catch: Throwable -> L19
    L22:
        ud3.e(r0, null);
        if (((String) r3.b).equals(r4) == false) goto L25;
    L47:
        r3.s(r10);
        Iterator r5 = this.e.iterator();
    L49:
        if (r5.hasNext() == false) goto L53;
        m30 r6 = (m30) r5.next();
        r6.getClass();
        if ((r10 instanceof po4) == false) goto L49;
        r6.a(((po4) r10).n);
        goto L49
    L53:
        this.a = true;
        return;
    L25:
        if (((String) r3.c).equals(r4) == true) goto L47;
        throw new IllegalStateException(("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: " + ((String) r3.b) + ", found: " + r4).toString());
    L21:
        r4 = null;
        goto L22
    L33:
        h12.n(r10, "BEGIN EXCLUSIVE TRANSACTION");
        u24 r7 = r3.v(r10);     // Catch: Throwable -> L37
        if (r7.a == false) goto L40;
        r3.t(r10);     // Catch: Throwable -> L37
        h12.n(r10, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");     // Catch: Throwable -> L37
        h12.n(r10, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '" + ((String) r3.b) + "')");     // Catch: Throwable -> L37
        Object r8 = j15.a;     // Catch: Throwable -> L37
    L43:
        if ((r8 instanceof s14) == true) goto L45;
        j15 r9 = (j15) r8;
        h12.n(r10, "END TRANSACTION");
    L45:
        Throwable r11 = bb3.a(r8);
        if (r11 == null) goto L47;
        h12.n(r10, "ROLLBACK TRANSACTION");
        throw r11;
    L40:
        throw new IllegalStateException(("Pre-packaged database has an invalid schema: " + r7.b).toString());     // Catch: Throwable -> L37
    L37:
        th = move-exception;
        r8 = new s14(th);
    L11:
        r2 = false;
        goto L12
    }

    public p24(li0 r25, kl3 r26) {
        r24 r8 = r25.g;
        this.c = r25;
        this.d = new n24(-1, "", "");
        List r2 = r25.e;
        u01 r3 = u01.n;
        if (r2 != null) goto L5;
        List r4 = r3;
    L6:
        this.e = r4;
        kl3 r5 = new kl3(3, this);
        if (r2 != null) goto L9;
        r2 = r3;
    L9:
        ArrayList r6 = q40.F0(new m30(r5), r2);
        Context r7 = r25.a;
        String r9 = r25.b;
        ro4 r10 = r25.c;
        pz1 r11 = r25.d;
        boolean r12 = r25.f;
        Executor r13 = r25.h;
        Executor r14 = r25.i;
        Intent r15 = r25.j;
        boolean r16 = r25.k;
        boolean r17 = r25.l;
        Set r18 = r25.m;
        String r19 = r25.n;
        File r20 = r25.o;
        Callable r21 = r25.p;
        List r22 = r25.q;
        List r23 = r25.r;
        boolean r24 = r25.s;
        y34 r27 = r25.t;
        ne0 r1 = r25.u;
        r7.getClass();
        r11.getClass();
        r13.getClass();
        r14.getClass();
        r22.getClass();
        r23.getClass();
        this.f = new qo4(new pz1((so4) r26.invoke(new li0(r7, r9, r10, r11, r6, r12, r8, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r27, r1))));
        if (r8 != r24.p) goto L12;
        boolean r28 = true;
    L13:
        so4 r0 = c();
        if (r0 == null) goto L17;
        r0.setWriteAheadLoggingEnabled(r28);
        return;
    L17:
        return;
    L12:
        r28 = false;
        goto L13
    L5:
        r4 = r2;
        goto L6
    }
}
