package defpackage;

import java.util.AbstractSet;
import java.util.Collection;

/* compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* loaded from: classes.dex */
public abstract class jb4 extends AbstractSet {
    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean removeAll(Collection collection) {
        return j51.L(this, collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean retainAll(Collection collection) {
        collection.getClass();
        return super.retainAll(collection);
    }
}
