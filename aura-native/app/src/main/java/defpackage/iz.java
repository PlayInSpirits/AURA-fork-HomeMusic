/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.le0;
import defpackage.me0;
import defpackage.ne0;
import defpackage.pa;
import defpackage.wf1;
import defpackage.ya4;

public final class iz
implements le0,
me0 {
    public static final pa o = new pa(27);
    public static final iz p = new iz(1);
    public final int n;

    public iz(int n16) {
        this.n = n16;
    }

    @Override
    public final ne0 J(ne0 ne02) {
        switch (this.n) {
            default: {
                return ya4.F(this, ne02);
            }
            case 0: 
        }
        return ya4.F(this, ne02);
    }

    @Override
    public final le0 K(me0 me02) {
        switch (this.n) {
            default: {
                return ya4.r(this, me02);
            }
            case 0: 
        }
        return ya4.r(this, me02);
    }

    @Override
    public final me0 getKey() {
        switch (this.n) {
            default: {
                return this;
            }
            case 0: 
        }
        return o;
    }

    @Override
    public final Object s(wf1 wf12, Object object) {
        switch (this.n) {
            default: {
                return wf12.invoke(object, this);
            }
            case 0: 
        }
        return wf12.invoke(object, this);
    }

    @Override
    public final ne0 u(me0 me02) {
        switch (this.n) {
            default: {
                return ya4.C(this, me02);
            }
            case 0: 
        }
        return ya4.C(this, me02);
    }
}

