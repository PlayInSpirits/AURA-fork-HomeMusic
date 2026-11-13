package defpackage;

import java.util.Date;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class bk0 {
    public static final ak0 b = new ak0(Date.class);
    public final Class a;

    public bk0(Class cls) {
        this.a = cls;
    }

    public final dz4 a(int i, int i2) {
        si siVar = new si(this, i, i2);
        dz4 dz4Var = hz4.a;
        return new dz4(this.a, siVar, 0);
    }

    public abstract Date b(Date date);
}
