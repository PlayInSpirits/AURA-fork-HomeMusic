/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.os.Build;
import java.util.UUID;

public final class se1 {
    public static final boolean c;
    public final UUID a;
    public final byte[] b;

    static {
        String string;
        boolean bl5 = "Amazon".equals(Build.MANUFACTURER) && ("AFTM".equals(string = Build.MODEL) || "AFTB".equals(string));
        c = bl5;
    }

    public se1(UUID uUID, byte[] byArray) {
        this.a = uUID;
        this.b = byArray;
    }
}

