package defpackage;

import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w40 implements aa4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ w40(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.aa4
    public final Iterator iterator() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                return ((Iterable) obj).iterator();
            case 1:
                return (Iterator) obj;
            default:
                return new fb2((String) obj);
        }
    }
}
