package defpackage;

import android.content.Context;
import android.content.res.AssetFileDescriptor;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.IOException;
import java.io.InputStream;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public final class kq0 implements sh0 {
    public final Resources.Theme n;
    public final Resources o;
    public final jq0 p;
    public final int q;
    public Object r;

    public kq0(Resources.Theme theme, Resources resources, jq0 jq0Var, int i) {
        this.n = theme;
        this.o = resources;
        this.p = jq0Var;
        this.q = i;
    }

    @Override // defpackage.sh0
    public final Class a() {
        switch (this.p.a) {
            case 0:
                return AssetFileDescriptor.class;
            case 1:
                return Drawable.class;
            default:
                return InputStream.class;
        }
    }

    @Override // defpackage.sh0
    public final void c() {
        Object obj = this.r;
        if (obj != null) {
            try {
                switch (this.p.a) {
                    case 0:
                        ((AssetFileDescriptor) obj).close();
                        break;
                    case 1:
                        break;
                    default:
                        ((InputStream) obj).close();
                        break;
                }
            } catch (IOException unused) {
            }
        }
    }

    @Override // defpackage.sh0
    public final void d(eq3 eq3Var, rh0 rh0Var) {
        Object openRawResourceFd;
        try {
            jq0 jq0Var = this.p;
            Resources.Theme theme = this.n;
            Resources resources = this.o;
            int i = this.q;
            switch (jq0Var.a) {
                case 0:
                    openRawResourceFd = resources.openRawResourceFd(i);
                    break;
                case 1:
                    Context context = jq0Var.b;
                    openRawResourceFd = uc5.p(context, context, i, theme);
                    break;
                default:
                    openRawResourceFd = resources.openRawResource(i);
                    break;
            }
            this.r = openRawResourceFd;
            rh0Var.f(openRawResourceFd);
        } catch (Resources.NotFoundException e) {
            rh0Var.b(e);
        }
    }

    @Override // defpackage.sh0
    public final int e() {
        return 1;
    }

    @Override // defpackage.sh0
    public final void cancel() {
    }
}
