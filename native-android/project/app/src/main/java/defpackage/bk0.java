package defpackage;

import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class bk0 {
    public static final ak0 b = null;
    public final Class a;

    static {
        b = new ak0(Date.class);
    }

    public bk0(Class r1) {
        this.a = r1;
    }

    public final dz4 a(int r2, int r3) {
        si r0 = new si(this, r2, r3);
        dz4 r4 = hz4.a;
        Class r1 = this.a;
        return new dz4(r1, r0, 0);
    }

    public abstract Date b(Date r1);
}
