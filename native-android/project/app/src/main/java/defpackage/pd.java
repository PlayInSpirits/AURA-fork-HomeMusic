package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class pd extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public pd(nt r2) {
        this.a = 1;
        this.b = r2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch(this.a) {
            case 0: goto L7;
            default: goto L5;
        };
    L5:
        return super.canApplyTheme();
    L7:
        return ((Drawable.ConstantState) this.b).canApplyTheme();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch(this.a) {
            case 0: goto L9;
            case 1: goto L6;
            default: goto L4;
        };
    L4:
        return 0;
    L6:
        return 0;
    L9:
        return ((Drawable.ConstantState) this.b).getChangingConfigurations();
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources r3) {
        switch(this.a) {
            case 0: goto L8;
            case 1: goto L5;
            case 2: goto L7;
            default: goto L5;
        };
    L8:
        qd r0 = new qd(null);
        Drawable r2 = ((Drawable.ConstantState) this.b).newDrawable(r3);
        r0.n = r2;
        r2.setCallback(r0.s);
        return r0;
    L5:
        return super.newDrawable(r3);
    L7:
        return new vh1(this);
    }

    public /* synthetic */ pd(int r1, Object r2) {
        this.a = r1;
        this.b = r2;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int r0 = this.a;
        Object r1 = this.b;
        switch(r0) {
            case 0: goto L8;
            case 1: goto L7;
            default: goto L5;
        };
    L8:
        qd r2 = new qd(null);
        Drawable r3 = ((Drawable.ConstantState) r1).newDrawable();
        r2.n = r3;
        r3.setCallback(r2.s);
        return r2;
    L5:
        return new vh1(this);
    L7:
        return (nt) r1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources r3, Resources.Theme r4) {
        switch(this.a) {
            case 0: goto L6;
            default: goto L5;
        };
    L6:
        qd r0 = new qd(null);
        Drawable r2 = ((Drawable.ConstantState) this.b).newDrawable(r3, r4);
        r0.n = r2;
        r2.setCallback(r0.s);
        return r0;
    L5:
        return super.newDrawable(r3, r4);
    }
}
