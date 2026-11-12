package defpackage;

import java.io.InputStream;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tz1 implements xh0 {
    public final qj0 a;

    public tz1(qj0 qj0Var) {
        this.a = qj0Var;
    }

    @Override // defpackage.xh0
    public final Class a() {
        return InputStream.class;
    }

    @Override // defpackage.xh0
    public final yh0 b(Object obj) {
        return new hg3((InputStream) obj, this.a);
    }
}
