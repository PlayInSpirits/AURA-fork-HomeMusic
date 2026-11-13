package defpackage;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class pd extends Drawable.ConstantState {
    public final /* synthetic */ int a;
    public final Object b;

    public pd(nt ntVar) {
        this.a = 1;
        this.b = ntVar;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public boolean canApplyTheme() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).canApplyTheme();
            default:
                return super.canApplyTheme();
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        switch (this.a) {
            case 0:
                return ((Drawable.ConstantState) this.b).getChangingConfigurations();
            case 1:
                return 0;
            default:
                return 0;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources) {
        switch (this.a) {
            case 0:
                qd qdVar = new qd(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources);
                qdVar.n = newDrawable;
                newDrawable.setCallback(qdVar.s);
                return qdVar;
            case 1:
            default:
                return super.newDrawable(resources);
            case 2:
                return new vh1(this);
        }
    }

    public /* synthetic */ pd(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                qd qdVar = new qd(null);
                Drawable newDrawable = ((Drawable.ConstantState) obj).newDrawable();
                qdVar.n = newDrawable;
                newDrawable.setCallback(qdVar.s);
                return qdVar;
            case 1:
                return (nt) obj;
            default:
                return new vh1(this);
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public Drawable newDrawable(Resources resources, Resources.Theme theme) {
        switch (this.a) {
            case 0:
                qd qdVar = new qd(null);
                Drawable newDrawable = ((Drawable.ConstantState) this.b).newDrawable(resources, theme);
                qdVar.n = newDrawable;
                newDrawable.setCallback(qdVar.s);
                return qdVar;
            default:
                return super.newDrawable(resources, theme);
        }
    }
}
