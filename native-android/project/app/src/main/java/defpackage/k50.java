package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class k50 {
    public final m50 a;
    public final l50 b;
    public final o50 c = new o50(new String[]{"?1", "?2", "?3", "?4", "?5", "color"}, false);
    public final o50 d;
    public final gc e;

    public k50(l50 l50Var, List list) {
        this.b = l50Var;
        String[] strArr = new String[list.size()];
        for (int i = 0; i < list.size(); i++) {
            strArr[i] = ((j50) list.get(i)).d;
        }
        this.d = new o50(strArr, true);
        this.e = new gc(list);
        this.a = new m50(a(), (short) 512, (short) 288);
    }

    public final int a() {
        int i = this.c.l + 288 + this.d.l;
        gc gcVar = this.e;
        int i2 = (gcVar.a * 4) + 16;
        ew4 ew4Var = (ew4) gcVar.d;
        return (((n50[]) ew4Var.s).length * 16) + (((int[]) ew4Var.r).length * 4) + 84 + i2 + i;
    }
}
