/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.ab4;
import defpackage.kg1;
import defpackage.l93;
import defpackage.o73;
import defpackage.vo4;
import defpackage.wo4;

public final class vc0
implements o73,
kg1,
wo4 {
    public final String n;

    public vc0(String string) {
        this.n = string;
    }

    @Override
    public Object A() {
        throw new RuntimeException(this.n);
    }

    @Override
    public String f() {
        return this.n;
    }

    @Override
    public void h(Object object) {
        object = (ab4)object;
    }

    @Override
    public void n(vo4 vo42) {
    }

    @Override
    public void o(Throwable throwable) {
        StringBuilder stringBuilder = new StringBuilder("custom command ");
        stringBuilder.append(this.n);
        stringBuilder.append(" produced an error: ");
        stringBuilder.append(throwable.getMessage());
        l93.r0("MediaNtfMng", stringBuilder.toString(), throwable);
    }
}

