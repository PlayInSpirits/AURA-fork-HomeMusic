package defpackage;

import java.util.function.Function;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class dy0 implements Function {
    public final /* synthetic */ int a;
    public final /* synthetic */ double b;

    public /* synthetic */ dy0(double d, int i) {
        this.a = i;
        this.b = d;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        int i = this.a;
        double d = this.b;
        switch (i) {
            case 0:
                break;
        }
        return Double.valueOf(d);
    }
}
