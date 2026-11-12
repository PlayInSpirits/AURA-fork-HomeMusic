package defpackage;

import android.content.Context;
import android.net.Uri;
import android.os.Build;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class hs3 implements uw2 {
    public final Context a;
    public final uw2 b;
    public final uw2 c;
    public final Class d;

    public hs3(Context r1, uw2 r2, uw2 r3, Class r4) {
        this.a = r1.getApplicationContext();
        this.b = r2;
        this.c = r3;
        this.d = r4;
    }

    @Override // defpackage.uw2
    public final boolean a(Object r2) {
        Uri r3 = (Uri) r2;
        if (Build.VERSION.SDK_INT >= 29) goto L5;
        return false;
    L5:
        if (hw.s(r3) == false) goto L10;
        return true;
    L10:
        return false;
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r11, int r12, int r13, db3 r14) {
        Uri r4 = (Uri) r11;
        s73 r9 = new s73(r4);
        uw2 r3 = this.c;
        Class r8 = this.d;
        return new tw2(r9, new gs3(this.a, this.b, r3, r4, r12, r13, r14, r8));
    }
}
