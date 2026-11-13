/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import defpackage.if1;
import java.util.function.DoubleUnaryOperator;

public final class q50
implements DoubleUnaryOperator {
    public final int a;
    public final if1 b;

    public q50(if1 if12, int n16) {
        this.a = n16;
        this.b = if12;
    }

    @Override
    public final double applyAsDouble(double d16) {
        int n16 = this.a;
        if1 if12 = this.b;
        switch (n16) {
            default: {
                return ((Number)if12.invoke(d16)).doubleValue();
            }
            case 0: 
        }
        return ((Number)if12.invoke(d16)).doubleValue();
    }
}

