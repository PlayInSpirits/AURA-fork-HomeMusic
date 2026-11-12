package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f54 implements i54 {
    public final rm3 a;
    public boolean b;
    public Bundle c;
    public final rp4 d;

    public f54(rm3 r2, f75 r3) {
        r2.getClass();
        this.a = r2;
        this.d = new rp4(new wc(21, r3));
    }

    @Override // defpackage.i54
    public final Bundle a() {
        Bundle r1 = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        Bundle r2 = this.c;
        if (r2 == null) goto L5;
        r1.putAll(r2);
    L5:
        Iterator r3 = ((g54) this.d.getValue()).b.entrySet().iterator();
    L7:
        if (r3.hasNext() == false) goto L11;
        Map.Entry r4 = (Map.Entry) r3.next();
        String r5 = (String) r4.getKey();
        Bundle r6 = ((cs0) ((b54) r4.getValue()).a.r).a();
        if (r6.isEmpty() == true) goto L7;
        r5.getClass();
        r1.putBundle(r5, r6);
        goto L7
    L11:
        this.b = false;
        return r1;
    }

    public final void b() {
        if (this.b == true) goto L11;
        Bundle r0 = this.a.A("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle r1 = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        Bundle r2 = this.c;
        if (r2 == null) goto L7;
        r1.putAll(r2);
    L7:
        if (r0 == null) goto L9;
        r1.putAll(r0);
    L9:
        this.c = r1;
        this.b = true;
        g54 r3 = (g54) this.d.getValue();
        return;
    }
}
