/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.b11;

public final class ma2 {
    public static final int b = 66305;
    public final int a;

    public ma2(int n16) {
        this.a = n16;
    }

    public static String a(int n16) {
        int n17 = n16 & 0xFF;
        String string = "Invalid";
        String string2 = n17 == 1 ? "Strategy.Simple" : (n17 == 2 ? "Strategy.HighQuality" : (n17 == 3 ? "Strategy.Balanced" : (n17 == 0 ? "Strategy.Unspecified" : "Invalid")));
        n17 = n16 >> 8 & 0xFF;
        String string3 = n17 == 1 ? "Strictness.None" : (n17 == 2 ? "Strictness.Loose" : (n17 == 3 ? "Strictness.Normal" : (n17 == 4 ? "Strictness.Strict" : (n17 == 0 ? "Strictness.Unspecified" : "Invalid"))));
        if ((n16 = n16 >> 16 & 0xFF) == 1) {
            string = "WordBreak.None";
        } else if (n16 == 2) {
            string = "WordBreak.Phrase";
        } else if (n16 == 0) {
            string = "WordBreak.Unspecified";
        }
        return b11.q(b11.u("LineBreak(strategy=", string2, ", strictness=", string3, ", wordBreak="), string, ")");
    }

    public final boolean equals(Object object) {
        int n16;
        return object instanceof ma2 && this.a == (n16 = ((ma2)object).a);
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }

    public final String toString() {
        return ma2.a(this.a);
    }
}

