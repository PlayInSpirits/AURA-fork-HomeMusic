package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class td {
    public static final ThreadLocal f = null;
    public final yd4 a;
    public final ArrayList b;
    public final zg5 c;
    public yc5 d;
    public boolean e;

    static {
        f = new ThreadLocal();
    }

    public td() {
        this.a = new yd4(0);
        this.b = new ArrayList();
        this.c = new zg5(this);
        this.e = false;
    }
}
