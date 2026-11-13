package defpackage;

import android.database.sqlite.SQLiteStatement;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class df1 extends cf1 implements vo4 {
    public final SQLiteStatement o;

    public df1(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.o = sQLiteStatement;
    }

    public final int b() {
        return this.o.executeUpdateDelete();
    }
}
