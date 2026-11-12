package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tk4 extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase r1) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase r10, int r11, int r12) {
        Cursor r9 = r10.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
    L26:
        if (r9.moveToNext() == false) goto L16;
        String r13 = r9.getString(0);     // Catch: Throwable -> L10
        String r14 = r9.getString(1);     // Catch: Throwable -> L10
        if ("sqlite_sequence".equals(r14) == true) goto L26;
        String r15 = "DROP " + r13 + " IF EXISTS " + r14;     // Catch: Throwable -> L10
        r10.execSQL(r15);     // Catch: Throwable -> L10 SQLException -> L12
    L12:
        e = move-exception;
        l93.G("SADatabaseProvider", "Error executing " + r15, e);     // Catch: Throwable -> L10
        goto L26
    L16:
        r9.close();
        return;
    L10:
        th = move-exception;
        if (r9 == null) goto L36;
        r9.close();     // Catch: Throwable -> L21
        throw th;
    L21:
        th = move-exception;
        th.addSuppressed(th);
        throw th;
    L36:
        throw th;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase r1, int r2, int r3) {
    }
}
