package defpackage;

import android.view.View;
import com.google.android.material.navigation.NavigationView;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class o43 implements gw0 {
    public final /* synthetic */ NavigationView a;

    public o43(NavigationView r1) {
        this.a = r1;
    }

    @Override // defpackage.gw0
    public final void a(float r1) {
    }

    @Override // defpackage.gw0
    public final void b(View r3) {
        NavigationView r2 = this.a;
        if (r3 != r2) goto L6;
        qp4 r4 = r2.G;
        Objects.requireNonNull(r4);
        r3.post(new qa1(23, r4));
        return;
    }

    @Override // defpackage.gw0
    public final void c(View r1) {
        NavigationView r0 = this.a;
        if (r1 != r0) goto L8;
        qp4 r2 = r0.G;
        ah2 r3 = (ah2) r2.a;
        if (r3 == null) goto L9;
        r3.c((View) r2.c);
        return;
    L9:
        return;
    }
}
