package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class bf implements i54 {
    public final /* synthetic */ int a;
    public final Object b;

    public bf(rm3 rm3Var) {
        this.a = 1;
        this.b = new LinkedHashSet();
        rm3Var.L("androidx.savedstate.Restarter", this);
    }

    @Override // defpackage.i54
    public final Bundle a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                Bundle bundle = new Bundle();
                ((df) obj).m().getClass();
                return bundle;
            default:
                Bundle g = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
                List Q0 = q40.Q0((LinkedHashSet) obj);
                g.putStringArrayList("classes_to_restore", Q0 instanceof ArrayList ? (ArrayList) Q0 : new ArrayList<>(Q0));
                return g;
        }
    }

    public bf(df dfVar) {
        this.a = 0;
        this.b = dfVar;
    }
}
