package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface z34 extends AutoCloseable {
    String D(int r1);

    boolean O();

    void c(int r1, long r2);

    void d(double r1, int r3);

    void e(int r1);

    int getColumnCount();

    String getColumnName(int r1);

    double getDouble(int r1);

    long getLong(int r1);

    boolean isNull(int r1);

    void r(int r1, String r2);

    void reset();
}
