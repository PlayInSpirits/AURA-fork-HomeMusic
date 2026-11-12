package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189 */
/* JADX INFO: loaded from: classes.dex */
public final class ew1 {
    public final String a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final List i;
    public final ArrayList j;

    public ew1(String r4, float r5, float r6, float r7, float r8, float r9, float r10, float r11, List r12, int r13) {
        if ((r13 & 1) == 0) goto L6;
        r4 = "";
    L6:
        if ((r13 & 2) == 0) goto L9;
        r5 = 0.0f;
    L9:
        if ((r13 & 4) == 0) goto L12;
        r6 = 0.0f;
    L12:
        if ((r13 & 8) == 0) goto L15;
        r7 = 0.0f;
    L15:
        if ((r13 & 16) == 0) goto L18;
        r8 = 1.0f;
    L18:
        if ((r13 & 32) == 0) goto L21;
        r9 = 1.0f;
    L21:
        if ((r13 & 64) == 0) goto L24;
        r10 = 0.0f;
    L24:
        if ((r13 & 128) == 0) goto L27;
        r11 = 0.0f;
    L27:
        if ((r13 & 256) == 0) goto L29;
        int r14 = c45.a;
        r12 = u01.n;
    L29:
        ArrayList r15 = new ArrayList();
        this.a = r4;
        this.b = r5;
        this.c = r6;
        this.d = r7;
        this.e = r8;
        this.f = r9;
        this.g = r10;
        this.h = r11;
        this.i = r12;
        this.j = r15;
    }
}
