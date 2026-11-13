/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.content.Context;
import com.bumptech.glide.a;
import defpackage.i73;
import defpackage.qy1;
import defpackage.ty1;
import defpackage.xr0;
import defpackage.z82;

public final class vy1
implements xr0 {
    public final int a;
    public final Object b;
    public final Object c;

    public vy1(int n16, Object object, Object object2) {
        this.a = n16;
        this.b = object;
        this.c = object2;
    }

    @Override
    public final void a() {
        int n16 = this.a;
        Object object = this.c;
        Object object2 = this.b;
        switch (n16) {
            default: {
                com.bumptech.glide.a.c((Context)object2).q((i73)object);
                return;
            }
            case 2: {
                com.bumptech.glide.a.c((Context)object2).q((i73)object);
                return;
            }
            case 1: {
                ((z82)object2).p.k(object);
                return;
            }
            case 0: 
        }
        object2 = (ty1)object2;
        object = (qy1)object;
        ((ty1)object2).a.j(object);
    }
}

