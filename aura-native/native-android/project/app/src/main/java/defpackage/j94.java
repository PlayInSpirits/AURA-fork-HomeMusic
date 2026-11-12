package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class j94 {
    public final e94 a;
    public final j03 b;

    public j94(i94 i94Var, e02 e02Var) {
        this.a = i94Var.d;
        List listI = i94Var.i((4 & 1) != 0 ? !i94Var.b : false, (4 & 2) == 0);
        this.b = new j03(listI.size());
        int size = listI.size();
        for (int i = 0; i < size; i++) {
            i94 i94Var2 = (i94) listI.get(i);
            if (e02Var.a(i94Var2.f)) {
                this.b.a(i94Var2.f);
            }
        }
    }
}
