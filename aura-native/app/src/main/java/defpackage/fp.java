package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class fp implements im {
    public gm b;
    public gm c;
    public gm d;
    public gm e;
    public ByteBuffer f;
    public ByteBuffer g;
    public boolean h;

    public fp() {
        ByteBuffer byteBuffer = im.a;
        this.f = byteBuffer;
        this.g = byteBuffer;
        gm gmVar = gm.e;
        this.d = gmVar;
        this.e = gmVar;
        this.b = gmVar;
        this.c = gmVar;
    }

    public abstract gm a(gm gmVar);

    @Override // defpackage.im
    public boolean b() {
        return this.e != gm.e;
    }

    @Override // defpackage.im
    public boolean c() {
        return this.h && this.g == im.a;
    }

    @Override // defpackage.im
    public ByteBuffer d() {
        ByteBuffer byteBuffer = this.g;
        this.g = im.a;
        return byteBuffer;
    }

    @Override // defpackage.im
    public final gm f(gm gmVar) {
        this.d = gmVar;
        this.e = a(gmVar);
        return b() ? this.e : gm.e;
    }

    @Override // defpackage.im
    public final void flush() {
        this.g = im.a;
        this.h = false;
        this.b = this.d;
        this.c = this.e;
        i();
    }

    @Override // defpackage.im
    public final void g() {
        this.h = true;
        j();
    }

    public final ByteBuffer l(int i) {
        if (this.f.capacity() < i) {
            this.f = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        } else {
            this.f.clear();
        }
        ByteBuffer byteBuffer = this.f;
        this.g = byteBuffer;
        return byteBuffer;
    }

    @Override // defpackage.im
    public final void reset() {
        ByteBuffer byteBuffer = im.a;
        this.g = byteBuffer;
        this.h = false;
        this.f = byteBuffer;
        gm gmVar = gm.e;
        this.d = gmVar;
        this.e = gmVar;
        this.b = gmVar;
        this.c = gmVar;
        k();
    }

    public void i() {
    }

    public void j() {
    }

    public void k() {
    }
}
