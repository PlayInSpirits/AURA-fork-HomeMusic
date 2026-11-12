package defpackage;

import java.io.Serializable;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class rz2 implements go4, Serializable {
    public final int n;

    public rz2() {
        uc5.f(2, "expectedValuesPerKey");
        this.n = 2;
    }

    @Override // defpackage.go4
    public final Object get() {
        return new ArrayList(this.n);
    }
}
