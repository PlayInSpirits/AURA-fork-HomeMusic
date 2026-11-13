package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class zq4 implements z92 {
    public final Set n = Collections.newSetFromMap(new WeakHashMap());

    @Override // defpackage.z92
    public final void h() {
        ArrayList B = e35.B(this.n);
        int size = B.size();
        int i = 0;
        while (i < size) {
            Object obj = B.get(i);
            i++;
            ((wq4) obj).h();
        }
    }

    @Override // defpackage.z92
    public final void j() {
        ArrayList B = e35.B(this.n);
        int size = B.size();
        int i = 0;
        while (i < size) {
            Object obj = B.get(i);
            i++;
            ((wq4) obj).j();
        }
    }

    @Override // defpackage.z92
    public final void n() {
        ArrayList B = e35.B(this.n);
        int size = B.size();
        int i = 0;
        while (i < size) {
            Object obj = B.get(i);
            i++;
            ((wq4) obj).n();
        }
    }
}
