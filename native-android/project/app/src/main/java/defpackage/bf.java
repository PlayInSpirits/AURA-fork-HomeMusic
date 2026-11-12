package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class bf implements i54 {
    public final /* synthetic */ int a;
    public final Object b;

    public bf(rm3 r2) {
        this.a = 1;
        this.b = new LinkedHashSet();
        r2.L("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.i54
    public final Bundle a() {
        int r0 = this.a;
        Object r2 = this.b;
        switch(r0) {
            case 0: goto L10;
            default: goto L4;
        };
    L4:
        Bundle r1 = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        List r3 = q40.Q0((LinkedHashSet) r2);
        if ((r3 instanceof ArrayList) == false) goto L7;
        ArrayList<String> r4 = (ArrayList) r3;
    L8:
        r1.putStringArrayList("classes_to_restore", r4);
        return r1;
    L7:
        r4 = new ArrayList(r3);
        goto L8
    L10:
        Bundle r5 = new Bundle();
        ((df) r2).m().getClass();
        return r5;
    }

    public bf(df r2) {
        this.a = 0;
        this.b = r2;
    }
}
