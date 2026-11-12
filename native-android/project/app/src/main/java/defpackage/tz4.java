package defpackage;

import com.google.common.reflect.TypeToken;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class tz4 extends t12 {
    public final /* synthetic */ TypeToken p;

    public tz4(TypeToken r1, Method r2) {
        this.p = r1;
        super(r2);
    }

    @Override // defpackage.t12
    public final TypeToken a() {
        return this.p;
    }

    public final String toString() {
        return this.p + "." + this.o.toString();
    }
}
