package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final /* synthetic */ class xj implements dk {
    public final /* synthetic */ int n;
    public final /* synthetic */ k03 o;

    public /* synthetic */ xj(k03 k03Var, int i) {
        this.n = i;
        this.o = k03Var;
    }

    @Override // defpackage.dk
    public final void e(ArrayList arrayList) {
        int i = this.n;
        k03 k03Var = this.o;
        switch (i) {
            case 0:
                k03Var.i(arrayList);
                break;
            case 1:
                Collections.shuffle(arrayList);
                k03Var.k((List) arrayList.stream().limit(50L).collect(Collectors.toList()));
                break;
            case 2:
                k03Var.i(arrayList);
                break;
            default:
                k03Var.i(arrayList);
                break;
        }
    }
}
