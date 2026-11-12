package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ld implements q04 {
    public final /* synthetic */ int n;
    public final Object o;

    public ld(byte[] bArr) {
        this.n = 1;
        h12.f(bArr, "Argument must not be null");
        this.o = bArr;
    }

    private final void a() {
    }

    private final void c() {
    }

    private final void f() {
    }

    @Override // defpackage.q04
    public final void b() {
        switch (this.n) {
            case 0:
                ((AnimatedImageDrawable) this.o).stop();
                ((AnimatedImageDrawable) this.o).clearAnimationCallbacks();
                break;
        }
    }

    @Override // defpackage.q04
    public final int d() {
        switch (this.n) {
            case 0:
                return e35.w(Bitmap.Config.ARGB_8888) * ((AnimatedImageDrawable) this.o).getIntrinsicHeight() * ((AnimatedImageDrawable) this.o).getIntrinsicWidth() * 2;
            case 1:
                return ((byte[]) this.o).length;
            case 2:
                return 1;
            default:
                return e35.v((Bitmap) this.o);
        }
    }

    @Override // defpackage.q04
    public final Class e() {
        switch (this.n) {
            case 0:
                return Drawable.class;
            case 1:
                return byte[].class;
            case 2:
                return ((File) this.o).getClass();
            default:
                return Bitmap.class;
        }
    }

    @Override // defpackage.q04
    public final Object get() {
        switch (this.n) {
            case 0:
                return (AnimatedImageDrawable) this.o;
            case 1:
                return (byte[]) this.o;
            case 2:
                return (File) this.o;
            default:
                return (Bitmap) this.o;
        }
    }

    public /* synthetic */ ld(int i, Object obj) {
        this.n = i;
        this.o = obj;
    }

    public ld(File file) {
        this.n = 2;
        h12.f(file, "Argument must not be null");
        this.o = file;
    }
}
