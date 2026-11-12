package defpackage;

import android.content.Context;
import android.net.Uri;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class du2 implements uw2 {
    public final /* synthetic */ int a;
    public final Context b;

    public du2(Context r1, int r2) {
        this.a = r2;
        switch(r2) {
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        this.b = r1;
        return;
    L6:
        this.b = r1.getApplicationContext();
        return;
    L8:
        this.b = r1.getApplicationContext();
    }

    @Override // defpackage.uw2
    public final boolean a(Object r1) {
        switch(this.a) {
            case 0: goto L19;
            case 1: goto L11;
            default: goto L4;
        };
    L4:
        Uri r2 = (Uri) r1;
        if (hw.s(r2) == true) goto L7;
    L9:
        return false;
    L7:
        if (r2.getPathSegments().contains("video") == false) goto L9;
        return true;
    L11:
        Uri r3 = (Uri) r1;
        if (hw.s(r3) == true) goto L14;
    L16:
        return false;
    L14:
        if (r3.getPathSegments().contains("video") == true) goto L16;
        return true;
    L19:
        return hw.s((Uri) r1);
    }

    @Override // defpackage.uw2
    public final tw2 b(Object r6, int r7, int r8, db3 r9) {
        int r0 = this.a;
        Context r5 = this.b;
        switch(r0) {
            case 0: goto L22;
            case 1: goto L15;
            default: goto L4;
        };
    L4:
        Uri r10 = (Uri) r6;
        if (r7 == Integer.MIN_VALUE) goto L24;
        if (r8 == Integer.MIN_VALUE) goto L25;
        if (r7 > 512) goto L26;
        if (r8 > 384) goto L27;
        Long r11 = (Long) r9.c(b55.d);
        if (r11 != null) goto L12;
        return null;
    L12:
        if (r11.longValue() != (-1)) goto L29;
        int r1 = 1;
        return new tw2(new s73(r10), y61.b(r5, r10, new zh0(r1, r5.getContentResolver())));
    L29:
        return null;
    L27:
        return null;
    L26:
        return null;
    L25:
        return null;
    L24:
        return null;
    L15:
        Uri r12 = (Uri) r6;
        if (r7 == Integer.MIN_VALUE) goto L30;
        if (r8 == Integer.MIN_VALUE) goto L31;
        if (r7 > 512) goto L32;
        if (r8 > 384) goto L33;
        int r2 = 2;
        return new tw2(new s73(r12), y61.b(r5, r12, new d34(r2, r5.getContentResolver())));
    L33:
        return null;
    L32:
        return null;
    L31:
        return null;
    L30:
        return null;
    L22:
        Uri r13 = (Uri) r6;
        return new tw2(new s73(r13), new cu2(0, r5, r13));
    }
}
