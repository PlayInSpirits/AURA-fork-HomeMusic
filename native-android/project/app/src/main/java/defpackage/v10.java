package defpackage;

import java.text.CharacterIterator;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class v10 implements CharacterIterator {
    public final CharSequence n;
    public final int o;
    public int p;

    public v10(CharSequence r1, int r2) {
        this.n = r1;
        this.o = r2;
        this.p = 0;
    }

    @Override // java.text.CharacterIterator
    public final Object clone() {
        return super.clone();
    L5:
        throw new InternalError();
    }

    @Override // java.text.CharacterIterator
    public final char current() {
        int r0 = this.p;
        if (r0 != this.o) goto L7;
        return 65535;
    L7:
        return this.n.charAt(r0);
    }

    @Override // java.text.CharacterIterator
    public final char first() {
        this.p = 0;
        return current();
    }

    @Override // java.text.CharacterIterator
    public final int getBeginIndex() {
        return 0;
    }

    @Override // java.text.CharacterIterator
    public final int getEndIndex() {
        return this.o;
    }

    @Override // java.text.CharacterIterator
    public final int getIndex() {
        return this.p;
    }

    @Override // java.text.CharacterIterator
    public final char last() {
        int r0 = this.o;
        if (r0 != 0) goto L6;
        this.p = r0;
        return 65535;
    L6:
        int r1 = r0 - 1;
        this.p = r1;
        return this.n.charAt(r1);
    }

    @Override // java.text.CharacterIterator
    public final char next() {
        int r0 = this.p + 1;
        this.p = r0;
        int r1 = this.o;
        if (r0 < r1) goto L7;
        this.p = r1;
        return 65535;
    L7:
        return this.n.charAt(r0);
    }

    @Override // java.text.CharacterIterator
    public final char previous() {
        int r0 = this.p;
        if (r0 > 0) goto L6;
        return 65535;
    L6:
        int r1 = r0 - 1;
        this.p = r1;
        return this.n.charAt(r1);
    }

    @Override // java.text.CharacterIterator
    public final char setIndex(int r2) {
        if (r2 > this.o) goto L7;
        if (r2 < 0) goto L7;
        this.p = r2;
        return current();
    L7:
        kf2.n("invalid position");
        return 0;
    }
}
