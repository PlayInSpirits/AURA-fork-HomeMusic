package defpackage;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class kf4 implements ta0 {
    public final /* synthetic */ mf4 a;

    public kf4(mf4 mf4Var) {
        this.a = mf4Var;
    }

    @Override // defpackage.ta0
    public final void a(boolean z) {
        ArrayList arrayList;
        e35.m();
        synchronized (this.a) {
            arrayList = new ArrayList((HashSet) this.a.q);
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            ((ta0) obj).a(z);
        }
    }
}
