package defpackage;

import android.text.TextUtils;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class w55 extends zf2 {
    public final /* synthetic */ int r;

    public w55(int r1, Class r2, int r3, int r4, int r5) {
        this.r = r5;
        this.n = r1;
        this.q = r2;
        this.p = r3;
        this.o = r4;
    }

    @Override // defpackage.zf2
    public final Object c(View r1) {
        switch(this.r) {
            case 0: goto L11;
            case 1: goto L9;
            case 2: goto L7;
            default: goto L5;
        };
    L5:
        return Boolean.valueOf(e65.b(r1));
    L7:
        return g65.b(r1);
    L9:
        return e65.a(r1);
    L11:
        return Boolean.valueOf(e65.c(r1));
    }

    @Override // defpackage.zf2
    public final void d(View r1, Object r2) {
        switch(this.r) {
            case 0: goto L10;
            case 1: goto L8;
            case 2: goto L6;
            default: goto L4;
        };
    L4:
        e65.d(r1, ((Boolean) r2).booleanValue());
        return;
    L6:
        g65.d(r1, (CharSequence) r2);
        return;
    L8:
        e65.e(r1, (CharSequence) r2);
        return;
    L10:
        e65.f(r1, ((Boolean) r2).booleanValue());
    }

    @Override // defpackage.zf2
    public final boolean g(Object r3, Object r4) {
        boolean r0 = false;
        switch(this.r) {
            case 0: goto L23;
            case 1: goto L22;
            case 2: goto L19;
            default: goto L4;
        };
    L4:
        Boolean r5 = (Boolean) r3;
        Boolean r6 = (Boolean) r4;
        if (r5 != null) goto L7;
    L9:
        boolean r2 = false;
    L10:
        if (r6 != null) goto L12;
    L14:
        boolean r7 = false;
    L15:
        if (r2 != r7) goto L18;
        r0 = true;
    L18:
        return !r0;
    L12:
        if (r6.booleanValue() == false) goto L14;
        r7 = true;
        goto L15
    L7:
        if (r5.booleanValue() == false) goto L9;
        r2 = true;
        goto L10
    L19:
        boolean r8 = TextUtils.equals((CharSequence) r3, (CharSequence) r4);
    L21:
        return !r8;
    L22:
        r8 = TextUtils.equals((CharSequence) r3, (CharSequence) r4);
        goto L21
    L23:
        Boolean r9 = (Boolean) r3;
        Boolean r10 = (Boolean) r4;
        if (r9 != null) goto L26;
    L28:
        boolean r11 = false;
    L29:
        if (r10 != null) goto L31;
    L33:
        boolean r12 = false;
    L34:
        if (r11 != r12) goto L37;
        r0 = true;
    L37:
        return !r0;
    L31:
        if (r10.booleanValue() == false) goto L33;
        r12 = true;
        goto L34
    L26:
        if (r9.booleanValue() == false) goto L28;
        r11 = true;
        goto L29
    }
}
