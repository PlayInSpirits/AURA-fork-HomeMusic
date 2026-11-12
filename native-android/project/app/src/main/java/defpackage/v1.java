package defpackage;

import java.util.AbstractList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public abstract class v1 extends AbstractList implements List, y32 {
    public v1() {
    }

    public abstract int a();

    public abstract Object b(int r1);

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ Object remove(int r1) {
        return b(r1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ int size() {
        return a();
    }
}
