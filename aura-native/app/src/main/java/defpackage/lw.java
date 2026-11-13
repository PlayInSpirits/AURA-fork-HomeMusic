/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

public final class lw {
    public final int a;

    public lw(int n16) {
        this.a = n16;
    }

    public final int a(Object object) {
        switch (this.a) {
            default: {
                return ((int[])object).length;
            }
            case 0: 
        }
        return ((byte[])object).length;
    }

    public final int b() {
        switch (this.a) {
            default: {
                return 4;
            }
            case 0: 
        }
        return 1;
    }

    public final String c() {
        switch (this.a) {
            default: {
                return "IntegerArrayPool";
            }
            case 0: 
        }
        return "ByteArrayPool";
    }
}

