package defpackage;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import java.io.File;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class af1 extends SQLiteOpenHelper {
    public static final /* synthetic */ int u = 0;
    public final Context n;
    public final d34 o;
    public final uv p;
    public final boolean q;
    public boolean r;
    public final mq3 s;
    public boolean t;

    public af1(Context r7, String r8, final d34 r9, final uv r10, boolean r11) {
        r7.getClass();
        r10.getClass();
        super(r7, r8, null, r10.o, new xe1(r10, r9));
        this.n = r7;
        this.o = r9;
        this.p = r10;
        this.q = r11;
        if (r8 != null) goto L5;
        String r12 = UUID.randomUUID().toString();
        r12.getClass();
    L6:
        this.s = new mq3(r12, r7.getCacheDir(), false);
        return;
    L5:
        r12 = r8;
        goto L6
    }

    public final we1 b(boolean r4) {
        mq3 r0 = this.s;
    L8:
        th = move-exception;
        r0.b();
        throw th;
    L4:
        if (this.t == false) goto L6;
    L10:
        boolean r1 = false;
    L11:
        r0.a(r1);     // Catch: Throwable -> L8
        this.r = false;     // Catch: Throwable -> L8
        SQLiteDatabase r2 = j(r4);     // Catch: Throwable -> L8
        if (this.r == false) goto L16;
        close();     // Catch: Throwable -> L8
        we1 r3 = b(r4);     // Catch: Throwable -> L8
        r0.b();
        return r3;
    L16:
        we1 r5 = f(r2);     // Catch: Throwable -> L8
        r0.b();
        return r5;
    L6:
        if (getDatabaseName() == null) goto L10;
        r1 = true;
        goto L11
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        mq3 r0 = this.s;
        r0.a(r0.a);     // Catch: Throwable -> L6
        super.close();     // Catch: Throwable -> L6
        this.o.o = null;     // Catch: Throwable -> L6
        this.t = false;     // Catch: Throwable -> L6
        r0.b();
        return;
    L6:
        th = move-exception;
        r0.b();
        throw th;
    }

    public final we1 f(SQLiteDatabase r3) {
        d34 r2 = this.o;
        r2.getClass();
        we1 r0 = (we1) r2.o;
        if (r0 != null) goto L5;
    L8:
        we1 r1 = new we1(r3);
        r2.o = r1;
        return r1;
    L5:
        if (r0.n.equals(r3) == false) goto L8;
        return r0;
    }

    public final SQLiteDatabase j(boolean r6) {
        String r0 = getDatabaseName();
        boolean r1 = this.t;
        Context r2 = this.n;
        if (r0 == null) goto L64;
        if (r1 == true) goto L64;
        File r3 = r2.getDatabasePath(r0).getParentFile();
        if (r3 == null) goto L64;
        r3.mkdirs();
        if (r3.isDirectory() == true) goto L64;
        Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + r3);
    L64:
        if (r6 == false) goto L13;
        SQLiteDatabase r4 = getWritableDatabase();     // Catch: Throwable -> L15
        r4.getClass();     // Catch: Throwable -> L15
        return r4;
    L13:
        SQLiteDatabase r5 = getReadableDatabase();     // Catch: Throwable -> L15
        r5.getClass();     // Catch: Throwable -> L15
        return r5;
    L65:
        Thread.sleep(500);     // Catch: InterruptedException -> L57
    L62:
        if (r6 == false) goto L21;
        SQLiteDatabase r7 = getWritableDatabase();     // Catch: Throwable -> L19
        r7.getClass();     // Catch: Throwable -> L19
    L61:
        return r7;
    L21:
        r7 = getReadableDatabase();     // Catch: Throwable -> L19
        r7.getClass();     // Catch: Throwable -> L19
    L19:
        th = th;
        if ((th instanceof ye1) == false) goto L43;
        ye1 r8 = (ye1) th;
        int r9 = r8.n.ordinal();
        th = r8.o;
        if (r9 != 0) goto L28;
    L41:
        throw th;
    L28:
        if (r9 == 1) goto L41;
        if (r9 == 2) goto L41;
        if (r9 == 3) goto L41;
        if (r9 == 4) goto L36;
        er1.n();
        return null;
    L36:
        if ((th instanceof SQLiteException) == true) goto L43;
        throw th;
    L43:
        if ((th instanceof SQLiteException) == false) goto L56;
        if (r0 == null) goto L56;
        if (this.q == false) goto L56;
        r2.deleteDatabase(r0);
        if (r6 == false) goto L52;
        SQLiteDatabase r10 = getWritableDatabase();     // Catch: ye1 -> L50
        r10.getClass();     // Catch: ye1 -> L50
    L58:
        return r10;
    L52:
        r10 = getReadableDatabase();     // Catch: ye1 -> L50
        r10.getClass();     // Catch: ye1 -> L50
    L50:
        e = move-exception;
        throw e.o;
    L56:
        throw th;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase r4) {
        r4.getClass();
        boolean r0 = this.r;
        uv r1 = this.p;
        if (r0 == false) goto L5;
    L12:
        r1.j(f(r4));     // Catch: Throwable -> L9
        return;
    L9:
        th = move-exception;
        throw new ye1(ze1.n, th);
    L5:
        if (r1.o == r4.getVersion()) goto L12;
        r4.setMaxSqlCacheSize(1);
        goto L12
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase r2) {
        r2.getClass();
        this.p.l(f(r2));     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        throw new ye1(ze1.o, th);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase r2, int r3, int r4) {
        r2.getClass();
        this.r = true;
        this.p.o(f(r2), r3, r4);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        throw new ye1(ze1.q, th);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase r2) {
        r2.getClass();
        if (this.r == false) goto L11;
    L9:
        this.t = true;
        return;
    L11:
        this.p.p(f(r2));     // Catch: Throwable -> L6
    L6:
        th = move-exception;
        throw new ye1(ze1.r, th);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase r2, int r3, int r4) {
        r2.getClass();
        this.r = true;
        this.p.q(f(r2), r3, r4);     // Catch: Throwable -> L5
        return;
    L5:
        th = move-exception;
        throw new ye1(ze1.p, th);
    }
}
