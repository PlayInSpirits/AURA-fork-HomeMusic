package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jw2 {
    public final int a;
    public final int b;

    public jw2(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(we1 we1Var) {
        we1Var.getClass();
        throw new p63("Migration functionality with a SupportSQLiteDatabase (without a provided SQLiteDriver) requires overriding the migrate(SupportSQLiteDatabase) function.");
    }

    public void b(x34 x34Var) {
        x34Var.getClass();
        if (!(x34Var instanceof po4)) {
            throw new p63("Migration functionality with a provided SQLiteDriver requires overriding the migrate(SQLiteConnection) function.");
        }
        a(((po4) x34Var).n);
    }
}
