package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import androidx.work.impl.WorkDatabase_Impl;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v24 extends uv {
    public li0 p;
    public final List q;
    public final h95 r;

    public v24(li0 r3, h95 r4) {
        r3.getClass();
        super(23, 3);
        this.q = r3.e;
        this.p = r3;
        this.r = r4;
    }

    @Override // defpackage.uv
    public final void j(we1 r1) {
    }

    @Override // defpackage.uv
    public final void l(we1 r4) {
        Cursor r0 = r4.F(new vc0("SELECT count(*) FROM sqlite_master WHERE name != 'android_metadata'"));
        boolean r2 = false;
        if (r0.moveToFirst() == false) goto L10;
        if (r0.getInt(0) != 0) goto L10;
        r2 = true;
    L10:
        r0.close();
        h95.a(r4);
        if (r2 == true) goto L17;
        u24 r1 = h95.b(r4);
        if (r1.a == true) goto L17;
        nz2.x(r1.b, "Pre-packaged database has an invalid schema: ");
        return;
    L17:
        SQLiteDatabase r5 = r4.n;
        r5.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r5.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        List r3 = this.q;
        if (r3 == null) goto L23;
        Iterator r6 = r3.iterator();
    L21:
        if (r6.hasNext() == false) goto L33;
        ((m30) r6.next()).getClass();
        goto L21
    L33:
        return;
    L23:
        return;
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L25
    L25:
        th = move-exception;
        q05.h(r0, th);
        throw th;
    }

    @Override // defpackage.uv
    public final void o(we1 r1, int r2, int r3) {
        q(r1, r2, r3);
    }

    @Override // defpackage.uv
    public final void p(we1 r6) {
        SQLiteDatabase r0 = r6.n;
        Cursor r1 = r6.F(new vc0("SELECT 1 FROM sqlite_master WHERE type = 'table' AND name='room_master_table'"));
    L8:
        th = move-exception;
        throw th;     // Catch: Throwable -> L46
    L46:
        th = move-exception;
        q05.h(r1, th);
        throw th;
    L4:
        if (r1.moveToFirst() == false) goto L10;
        if (r1.getInt(0) == 0) goto L10;
        boolean r2 = true;
    L11:
        r1.close();
        if (r2 == false) goto L32;
        Cursor r3 = r6.F(new vc0("SELECT identity_hash FROM room_master_table WHERE id = 42 LIMIT 1"));
    L18:
        th = move-exception;
        throw th;     // Catch: Throwable -> L29
    L29:
        th = move-exception;
        q05.h(r3, th);
        throw th;
    L15:
        if (r3.moveToFirst() == false) goto L20;
        String r4 = r3.getString(0);     // Catch: Throwable -> L18
    L21:
        r3.close();
        if ("86254750241babac4b8d52996a675549".equals(r4) == false) goto L24;
    L35:
        WorkDatabase_Impl r5 = (WorkDatabase_Impl) this.r.n;
        r0.execSQL("PRAGMA foreign_keys = ON");
        r5.p(new po4(r6));
        List r7 = this.q;
        if (r7 == null) goto L41;
        Iterator r8 = r7.iterator();
    L39:
        if (r8.hasNext() == false) goto L41;
        ((m30) r8.next()).a(r6);
    L41:
        this.p = null;
        return;
    L24:
        if ("1cbd3130fa23b59692c061c594c16cc0".equals(r4) == true) goto L35;
        kf2.o(xa3.g("Room cannot verify the data integrity. Looks like you've changed schema but forgot to update the version number. You can simply fix this by increasing the version number. Expected identity hash: 86254750241babac4b8d52996a675549, found: ", r4));
        return;
    L20:
        r4 = null;
        goto L21
    L32:
        u24 r9 = h95.b(r6);
        if (r9.a == false) goto L43;
        r0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r0.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        goto L35
    L43:
        nz2.x(r9.b, "Pre-packaged database has an invalid schema: ");
        return;
    L10:
        r2 = false;
        goto L11
    }

    @Override // defpackage.uv
    public final void q(we1 r5, int r6, int r7) {
        SQLiteDatabase r0 = r5.n;
        li0 r1 = this.p;
        if (r1 == null) goto L16;
        pz1 r2 = r1.d;
        r2.getClass();
        List r3 = si0.u(r2, r6, r7);
        if (r3 == null) goto L16;
        xl.l(new po4(r5));
        Iterator r4 = r3.iterator();
    L8:
        if (r4.hasNext() == false) goto L10;
        ((jw2) r4.next()).b(new po4(r5));
        goto L8
    L10:
        u24 r8 = h95.b(r5);
        if (r8.a == false) goto L14;
        r0.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        r0.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '86254750241babac4b8d52996a675549')");
        return;
    L14:
        nz2.x(r8.b, "Migration didn't properly handle: ");
        return;
    L16:
        li0 r9 = this.p;
        if (r9 != null) goto L19;
    L55:
        kf2.o(b11.n("A migration from ", " to ", r6, r7, " was required but not found. Please provide the necessary Migration path via RoomDatabase.Builder.addMigration(Migration ...) or allow for destructive migrations via one of the RoomDatabase.Builder.fallbackToDestructiveMigration* methods."));
        return;
    L19:
        if (si0.B(r9, r6, r7) == true) goto L55;
        if (r9.s == false) goto L46;
        Cursor r10 = r5.F(new vc0("SELECT name, type FROM sqlite_master WHERE type = 'table' OR type = 'view'"));
        qb2 r11 = gb.r();     // Catch: Throwable -> L32
    L25:
        if (r10.moveToNext() == false) goto L34;
        String r12 = r10.getString(0);     // Catch: Throwable -> L32
        r12.getClass();     // Catch: Throwable -> L32
        if (xm4.k0(r12, "sqlite_", false) == true) goto L25;
        if (r12.equals("android_metadata") == true) goto L25;
        r11.add(new kd3(r12, Boolean.valueOf(h12.c(r10.getString(1), "view"))));     // Catch: Throwable -> L32
        goto L25
    L34:
        qb2 r13 = gb.f(r11);     // Catch: Throwable -> L32
        r10.close();
        ListIterator r14 = r13.listIterator(0);
    L36:
        dm1 r15 = (dm1) r14;
        if (r15.hasNext() == false) goto L47;
        kd3 r16 = (kd3) r15.next();
        String r17 = (String) r16.n;
        if (((Boolean) r16.o).booleanValue() == true) goto L40;
        r0.execSQL("DROP TABLE IF EXISTS " + r17);
        goto L36
    L40:
        r0.execSQL("DROP VIEW IF EXISTS " + r17);
    L47:
        List r18 = this.q;
        if (r18 == null) goto L53;
        Iterator r19 = r18.iterator();
    L51:
        if (r19.hasNext() == false) goto L53;
        ((m30) r19.next()).getClass();
    L53:
        h95.a(r5);
        return;
    L32:
        th = move-exception;
        throw th;     // Catch: Throwable -> L43
    L43:
        th = move-exception;
        q05.h(r10, th);
        throw th;
    L46:
        r0.execSQL("DROP TABLE IF EXISTS `Dependency`");
        r0.execSQL("DROP TABLE IF EXISTS `WorkSpec`");
        r0.execSQL("DROP TABLE IF EXISTS `WorkTag`");
        r0.execSQL("DROP TABLE IF EXISTS `SystemIdInfo`");
        r0.execSQL("DROP TABLE IF EXISTS `WorkName`");
        r0.execSQL("DROP TABLE IF EXISTS `WorkProgress`");
        r0.execSQL("DROP TABLE IF EXISTS `Preference`");
        goto L47
    }
}
