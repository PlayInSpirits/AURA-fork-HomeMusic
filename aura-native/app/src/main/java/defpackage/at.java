/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import defpackage.e35;
import defpackage.h12;
import defpackage.q04;
import defpackage.xy1;
import defpackage.zs;

public final class at
implements q04,
xy1 {
    public final int n;
    public final Object o;
    public final Object p;

    public at(Resources resources, q04 q042) {
        this.n = 1;
        h12.f(resources, "Argument must not be null");
        this.o = resources;
        h12.f(q042, "Argument must not be null");
        this.p = q042;
    }

    public at(zs zs5, Bitmap bitmap) {
        this.n = 0;
        h12.f(bitmap, "Bitmap must not be null");
        this.o = bitmap;
        h12.f(zs5, "BitmapPool must not be null");
        this.p = zs5;
    }

    public static at c(zs zs5, Bitmap bitmap) {
        if (bitmap == null) {
            return null;
        }
        return new at(zs5, bitmap);
    }

    @Override
    public final void a() {
        switch (this.n) {
            default: {
                q04 q042 = (q04)this.p;
                if (q042 instanceof xy1) {
                    ((xy1)((Object)q042)).a();
                }
                return;
            }
            case 0: 
        }
        ((Bitmap)this.o).prepareToDraw();
    }

    @Override
    public final void b() {
        switch (this.n) {
            default: {
                ((q04)this.p).b();
                return;
            }
            case 0: 
        }
        ((zs)this.p).d((Bitmap)this.o);
    }

    @Override
    public final int d() {
        switch (this.n) {
            default: {
                return ((q04)this.p).d();
            }
            case 0: 
        }
        return e35.v((Bitmap)this.o);
    }

    @Override
    public final Class e() {
        switch (this.n) {
            default: {
                return BitmapDrawable.class;
            }
            case 0: 
        }
        return Bitmap.class;
    }

    @Override
    public final Object get() {
        switch (this.n) {
            default: {
                return new BitmapDrawable((Resources)this.o, (Bitmap)((q04)this.p).get());
            }
            case 0: 
        }
        return (Bitmap)this.o;
    }
}

