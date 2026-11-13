/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.jv4;

public final class iv4
implements Runnable {
    public final int n;
    public final jv4 o;

    public iv4(jv4 jv42, int n16) {
        this.n = n16;
        this.o = jv42;
    }

    @Override
    public final void run() {
        int n16 = this.n;
        jv4 jv42 = this.o;
        switch (n16) {
            default: {
                jv42.a();
                return;
            }
            case 0: 
        }
        jv42.c(false);
    }
}

