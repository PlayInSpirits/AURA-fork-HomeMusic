/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import android.graphics.Paint;

public abstract class hc {
    public static final int[] a;
    public static final int[] b;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    static {
        int[] nArray = new int[Paint.Style.values().length];
        try {
            nArray[Paint.Style.STROKE.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        nArray = new int[Paint.Cap.values().length];
        try {
            nArray[Paint.Cap.BUTT.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[Paint.Cap.ROUND.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[Paint.Cap.SQUARE.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        a = nArray;
        nArray = new int[Paint.Join.values().length];
        try {
            nArray[Paint.Join.MITER.ordinal()] = 1;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[Paint.Join.BEVEL.ordinal()] = 2;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        try {
            nArray[Paint.Join.ROUND.ordinal()] = 3;
        }
        catch (NoSuchFieldError noSuchFieldError) {}
        b = nArray;
    }
}

