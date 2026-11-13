/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.subsonic.models.Child;
import java.util.function.ToLongFunction;

public final class bm3
implements ToLongFunction {
    public bm3() {
        super();
    }

    public final long applyAsLong(Object object) {
        if (((Child)(object = (Child)object)).getDuration() != null) {
            return ((Child)object).getDuration().intValue();
        }
        return 0L;
    }
}

