/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.q92;

public abstract class z83 {
    public static final int[] a;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[q92.values().length];
        try {
            nArray[q92.ON_START.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[q92.ON_STOP.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[q92.ON_DESTROY.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = nArray;
    }
}

