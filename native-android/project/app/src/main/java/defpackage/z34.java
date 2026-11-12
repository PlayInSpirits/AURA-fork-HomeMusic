package defpackage;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public interface z34 extends AutoCloseable {
    String D(int i);

    boolean O();

    void c(int i, long j);

    void d(double d, int i);

    void e(int i);

    int getColumnCount();

    String getColumnName(int i);

    double getDouble(int i);

    long getLong(int i);

    boolean isNull(int i);

    void r(int i, String str);

    void reset();
}
