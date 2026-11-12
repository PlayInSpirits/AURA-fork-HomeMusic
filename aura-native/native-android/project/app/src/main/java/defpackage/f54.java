package defpackage;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class f54 implements i54 {
    public final rm3 a;
    public boolean b;
    public Bundle c;
    public final rp4 d;

    public f54(rm3 rm3Var, f75 f75Var) {
        rm3Var.getClass();
        this.a = rm3Var;
        this.d = new rp4(new wc(21, f75Var));
    }

    @Override // defpackage.i54
    public final Bundle a() {
        Bundle bundleG = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        for (Map.Entry entry : ((g54) this.d.getValue()).b.entrySet()) {
            String str = (String) entry.getKey();
            Bundle bundleA = ((cs0) ((b54) entry.getValue()).a.r).a();
            if (!bundleA.isEmpty()) {
                str.getClass();
                bundleG.putBundle(str, bundleA);
            }
        }
        this.b = false;
        return bundleG;
    }

    public final void b() {
        if (this.b) {
            return;
        }
        Bundle bundleA = this.a.A("androidx.lifecycle.internal.SavedStateHandlesProvider");
        Bundle bundleG = fh0.g((kd3[]) Arrays.copyOf(new kd3[0], 0));
        Bundle bundle = this.c;
        if (bundle != null) {
            bundleG.putAll(bundle);
        }
        if (bundleA != null) {
            bundleG.putAll(bundleA);
        }
        this.c = bundleG;
        this.b = true;
    }
}
