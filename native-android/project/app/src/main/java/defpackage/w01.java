package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w01 implements ui2 {
    public static final w01 b = new w01(0);
    public static final or1 c = new or1(24);
    public static final w01 d = new w01(1);
    public static final w01 e = new w01(2);
    public final /* synthetic */ int a;

    public /* synthetic */ w01(int i) {
        this.a = i;
    }

    @Override // defpackage.ui2
    public final vi2 a(cf2 cf2Var, List list, long j) {
        int i = this.a;
        v01 v01Var = v01.n;
        switch (i) {
            case 0:
                return cf2Var.v(nc0.h(j), nc0.g(j), v01Var, c);
            case 1:
                return cf2Var.v(nc0.j(j), nc0.i(j), v01Var, new or1(24));
            default:
                return cf2Var.v(nc0.f(j) ? nc0.h(j) : 0, nc0.e(j) ? nc0.g(j) : 0, v01Var, new or1(24));
        }
    }
}
