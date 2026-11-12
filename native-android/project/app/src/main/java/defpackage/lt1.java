package defpackage;

import android.widget.CompoundButton;
import com.eddyizm.tempus.subsonic.models.Child;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class lt1 implements Runnable {
    public final /* synthetic */ int n;
    public final /* synthetic */ CompoundButton o;
    public final /* synthetic */ Supplier p;

    public /* synthetic */ lt1(CompoundButton r1, Supplier r2, int r3) {
        this.n = r3;
        this.o = r1;
        this.p = r2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int r0 = this.n;
        Supplier r1 = this.p;
        CompoundButton r3 = this.o;
        int r2 = 1;
        switch(r0) {
            case 0: goto L14;
            default: goto L5;
        };
    L14:
        r3.post(new lt1(r3, r1, r2));
        return;
    L5:
        if (r3.isAttachedToWindow() == false) goto L16;
        Child r4 = (Child) r1.get();
        if (r4 == null) goto L17;
        String r5 = r4.getId();
        if (r4.getStarred() == null) goto L11;
        boolean r6 = true;
    L12:
        r3.setChecked(n61.f(1, r5, r6));
        return;
    L11:
        r6 = false;
        goto L12
    L17:
        return;
    }
}
