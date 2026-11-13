/*
 * Decompiled with CFR 0.152.
 */
package defpackage;

import com.eddyizm.tempus.subsonic.models.PlayQueue;
import java.util.function.IntPredicate;

public final class vi3
implements IntPredicate {
    public final PlayQueue a;

    public vi3(PlayQueue playQueue) {
        this.a = playQueue;
    }

    @Override
    public final boolean test(int n16) {
        PlayQueue playQueue = this.a;
        return playQueue.getEntries().get(n16).getId().equals(playQueue.getCurrent());
    }
}

