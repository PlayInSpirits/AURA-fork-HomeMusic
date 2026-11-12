package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jw2 {
    public final int a;
    public final int b;

    public jw2(int r1, int r2) {
        this.a = r1;
        this.b = r2;
    }

    public void a(we1 r1) {
        r1.getClass();
        throw new p63("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(x34 r2) {
        r2.getClass();
        if ((r2 instanceof po4) == false) goto L7;
        a(((po4) r2).n);
        return;
    L7:
        throw new p63("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
    }
}
