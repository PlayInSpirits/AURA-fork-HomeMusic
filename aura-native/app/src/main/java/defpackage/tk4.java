package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class tk4 extends SQLiteOpenHelper {
    public tk4(android.content.Context a0, java.lang.String a1, android.database.sqlite.SQLiteDatabase.CursorFactory a2, int a3) {
        super(a0, a1, a2, a3);
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        Cursor query = sQLiteDatabase.query("sqlite_master", new String[]{"type", "name"}, null, null, null, null, null);
        while (query.moveToNext()) {
            try {
                String string = query.getString(0);
                String string2 = query.getString(1);
                if (!"sqlite_sequence".equals(string2)) {
                    String str = "DROP " + string + " IF EXISTS " + string2;
                    try {
                        sQLiteDatabase.execSQL(str);
                    } catch (SQLException e) {
                        l93.G("SADatabaseProvider", "Error executing " + str, e);
                    }
                }
            } finally {
            }
        }
        query.close();
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}
