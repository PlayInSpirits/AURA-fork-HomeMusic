/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.j15;
import defpackage.q25;
import java.util.concurrent.Callable;

public final class l25
implements Callable {
    public final int a;
    public final q25 b;

    public l25(q25 q252, int n16) {
        this.a = n16;
        this.b = q252;
    }

    public final Object call() {
        int n16 = this.a;
        q25 q252 = this.b;
        switch (n16) {
            default: {
                q252.a2("on release");
                q252.l.shutdown();
                return j15.a;
            }
            case 2: {
                q252.a2("on stop");
                q252.r = false;
                q252.c2();
                q252.s = 1;
                q252.Z1();
                q252.O1();
                return j15.a;
            }
            case 1: {
                q252.X1();
                return j15.a;
            }
            case 0: 
        }
        q252.a2("on an emptied queue");
        q252.s = 4;
        q252.Z1();
        q252.O1();
        return j15.a;
    }
}

