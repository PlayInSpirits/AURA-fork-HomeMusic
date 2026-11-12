package defpackage;

import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v44 implements xr0 {
    public final /* synthetic */ w44 a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ a54 c;

    public v44(w44 w44Var, Object obj, a54 a54Var) {
        this.a = w44Var;
        this.b = obj;
        this.c = a54Var;
    }

    @Override // defpackage.xr0
    public final void a() {
        w44 w44Var = this.a;
        w03 w03Var = w44Var.o;
        Object obj = this.b;
        Object objJ = w03Var.j(obj);
        a54 a54Var = this.c;
        if (objJ == a54Var) {
            Map map = w44Var.n;
            Map mapC = a54Var.c();
            if (mapC.isEmpty()) {
                map.remove(obj);
            } else {
                map.put(obj, mapC);
            }
        }
    }
}
