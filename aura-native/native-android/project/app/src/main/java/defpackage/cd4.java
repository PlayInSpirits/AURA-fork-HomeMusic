package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public class cd4
extends m2
implements zc4,
q81,
p81,
jg1 {
    public final int r;
    public final int s;
    public final wv t;
    public Object[] u;
    public long v;
    public long w;
    public int x;
    public int y;

    public cd4(int n16, int n17, wv wv5) {
        this.r = n16;
        this.s = n17;
        this.t = wv5;
    }

    /*
     * Exception decompiling
     */
    public static void k(cd4 var0, q81 var1_1, vd0 var2_2) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 1[TRYBLOCK] [1 : 185->190)] java.lang.Throwable
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op02WithProcessedDataAndRefs.insertExceptionBlocks(Op02WithProcessedDataAndRefs.java:2283)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:415)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }

    @Override
    public final Object a(q81 q812, vd0 vd02) {
        cd4.k(this, q812, vd02);
        return xe0.n;
    }

    /*
     * Loose catch block
     * WARNING - void declaration
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    @Override
    public final Object b(Object object, vd0 object2) {
        void var1_11;
        xe0 xe02;
        void var1_8;
        void var2_18;
        void var1_14;
        vd0[] vd0Array;
        cz cz5;
        block15: {
            void var2_15;
            if (this.q(object)) {
                return j15.a;
            }
            cz5 = new cz(1, ya4.x((vd0)var2_15));
            cz5.u();
            vd0Array = bu.a;
            // MONITORENTER : this
            boolean bl5 = this.r(object);
            if (!bl5) break block15;
            try {
                cz5.resumeWith(j15.a);
                vd0[] vd0Array2 = this.n(vd0Array);
                Object var2_16 = null;
            }
            catch (Throwable throwable) {
                throw var1_14;
            }
        }
        long l16 = this.o();
        int n16 = this.x;
        int n17 = this.y++;
        long l17 = n16 + n17;
        try {
            ad4 ad42 = new ad4(this, l16 + l17, object, cz5);
            this.m(ad42);
            vd0[] vd0Array3 = vd0Array;
            if (this.s == 0) {
                vd0[] vd0Array4 = this.n(vd0Array);
            }
        }
        catch (Throwable throwable) {
            throw var1_14;
        }
        if (var2_18 != null) {
            cz5.x(new wy(2, var2_18));
        }
        for (void var2_20 : var1_8) {
            if (var2_20 == null) continue;
            var2_20.resumeWith(j15.a);
        }
        Object object3 = cz5.q();
        if (object3 != (xe02 = xe0.n)) {
            j15 j152 = j15.a;
        }
        if (var1_11 != xe02) return j15.a;
        return var1_11;
        catch (Throwable throwable) {
            throw var1_14;
        }
        catch (Throwable throwable) {
            throw var1_14;
        }
    }

    @Override
    public final p81 c(ne0 ne02, int n16, wv wv5) {
        return g12.o(this, ne02, n16, wv5);
    }

    @Override
    public final n2 e() {
        Object object = new Object();
        ((dd4)object).a = -1L;
        return object;
    }

    @Override
    public final n2[] f() {
        return new dd4[2];
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object i(dd4 object, bd4 vd02) {
        vd02 = new cz(1, ya4.x(vd02));
        ((cz)vd02).u();
        synchronized (this) {
            try {
                if (this.s((dd4)object) < 0L) {
                    ((dd4)object).b = vd02;
                } else {
                    ((cz)vd02).resumeWith(j15.a);
                }
                // MONITOREXIT @DISABLED, blocks:[0, 1] lbl9 : MonitorExitStatement: MONITOREXIT : this
                object = ((cz)vd02).q();
                if (object == xe0.n) {
                    return object;
                }
                return j15.a;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    public final void j() {
        if (this.s != 0 || this.y > 1) {
            int n16;
            int n17;
            long l16;
            Object[] objectArray = this.u;
            objectArray.getClass();
            while (this.y > 0 && objectArray[(int)((l16 = this.o()) + (long)((n17 = this.x) + (n16 = this.y)) - 1L) & objectArray.length - 1] == g12.e) {
                this.y = n16 - 1;
                g12.d(objectArray, this.o() + (long)(this.x + this.y), null);
            }
        }
    }

    public final void l() {
        Object[] objectArray = this.u;
        objectArray.getClass();
        g12.d(objectArray, this.o(), null);
        --this.x;
        long l16 = this.o() + 1L;
        if (this.v < l16) {
            this.v = l16;
        }
        if (this.w < l16) {
            if (this.o != 0 && (objectArray = this.n) != null) {
                for (Object object : objectArray) {
                    if (object == null) continue;
                    object = (dd4)object;
                    long l17 = ((dd4)object).a;
                    if (l17 < 0L || l17 >= l16) continue;
                    ((dd4)object).a = l16;
                }
            }
            this.w = l16;
        }
    }

    public final void m(Object object) {
        Object[] objectArray;
        int n16 = this.x + this.y;
        Object[] objectArray2 = this.u;
        if (objectArray2 == null) {
            objectArray = this.p(null, 0, 2);
        } else {
            objectArray = objectArray2;
            if (n16 >= objectArray2.length) {
                objectArray = this.p(objectArray2, n16, objectArray2.length * 2);
            }
        }
        g12.d(objectArray, this.o() + (long)n16, object);
    }

    public final vd0[] n(vd0[] vd0Array) {
        int n16 = vd0Array.length;
        vd0[] vd0Array2 = vd0Array;
        if (this.o != 0) {
            n2[] n2Array = this.n;
            vd0Array2 = vd0Array;
            if (n2Array != null) {
                int n17 = n2Array.length;
                int n18 = 0;
                while (true) {
                    vd0Array2 = vd0Array;
                    if (n18 >= n17) break;
                    Object object = n2Array[n18];
                    int n19 = n16;
                    vd0Array2 = vd0Array;
                    if (object != null) {
                        dd4 dd42 = (dd4)object;
                        object = dd42.b;
                        if (object == null) {
                            n19 = n16;
                            vd0Array2 = vd0Array;
                        } else {
                            n19 = n16;
                            vd0Array2 = vd0Array;
                            if (this.s(dd42) >= 0L) {
                                vd0Array2 = vd0Array;
                                if (n16 >= vd0Array.length) {
                                    vd0Array2 = Arrays.copyOf(vd0Array, Math.max(2, vd0Array.length * 2));
                                }
                                vd0Array2[n16] = object;
                                dd42.b = null;
                                n19 = n16 + 1;
                            }
                        }
                    }
                    ++n18;
                    n16 = n19;
                    vd0Array = vd0Array2;
                }
            }
        }
        return vd0Array2;
    }

    public final long o() {
        return Math.min(this.w, this.v);
    }

    public final Object[] p(Object[] objectArray, int n16, int n17) {
        if (n17 > 0) {
            Object[] objectArray2 = new Object[n17];
            this.u = objectArray2;
            if (objectArray != null) {
                long l16 = this.o();
                for (n17 = 0; n17 < n16; ++n17) {
                    long l17 = (long)n17 + l16;
                    g12.d(objectArray2, l17, objectArray[(int)l17 & objectArray.length - 1]);
                }
            }
            return objectArray2;
        }
        kf2.o("Buffer size overflow");
        return null;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final boolean q(Object vd0Array) {
        int n16;
        boolean bl5;
        Object object;
        block6: {
            block5: {
                object = bu.a;
                // MONITORENTER : this
                bl5 = this.r(vd0Array);
                n16 = 0;
                if (!bl5) break block5;
                vd0Array = this.n((vd0[])object);
                bl5 = true;
                break block6;
            }
            bl5 = false;
            vd0Array = object;
        }
        // MONITOREXIT : this
        int n17 = vd0Array.length;
        while (n16 < n17) {
            object = vd0Array[n16];
            if (object != null) {
                object.resumeWith(j15.a);
            }
            ++n16;
        }
        return bl5;
    }

    public final boolean r(Object object) {
        block8: {
            long l16;
            long l17;
            long l18;
            int n16;
            int n17;
            int n18;
            block9: {
                block10: {
                    block7: {
                        n18 = this.o;
                        n17 = this.r;
                        if (n18 != 0) break block7;
                        if (n17 != 0) {
                            this.m(object);
                            this.x = n18 = this.x + 1;
                            if (n18 > n17) {
                                this.l();
                            }
                            this.w = this.o() + (long)this.x;
                            return true;
                        }
                        break block8;
                    }
                    n16 = this.x;
                    n18 = this.s;
                    if (n16 < n18 || this.w > this.v) break block9;
                    n16 = this.t.ordinal();
                    if (n16 == 0) break block10;
                    if (n16 == 1) break block9;
                    if (n16 == 2) break block8;
                    er1.n();
                }
                return false;
            }
            this.m(object);
            this.x = n16 = this.x + 1;
            if (n16 > n18) {
                this.l();
            }
            if ((int)((l18 = this.o()) + (l17 = (long)this.x) - (l16 = this.v)) > n17) {
                this.u(1L + l16, this.w, this.o() + (long)this.x, this.o() + (long)this.x + (long)this.y);
            }
        }
        return true;
    }

    public final long s(dd4 dd42) {
        long l16 = dd42.a;
        if (l16 >= this.o() + (long)this.x && (this.s > 0 || l16 > this.o() || this.y == 0)) {
            return -1L;
        }
        return l16;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final Object t(dd4 vd0Array) {
        Object object;
        Object object2;
        block7: {
            long l16;
            block6: {
                object2 = bu.a;
                // MONITORENTER : this
                l16 = this.s((dd4)vd0Array);
                if (l16 >= 0L) break block6;
                object = g12.e;
                vd0Array = object2;
                break block7;
            }
            long l17 = vd0Array.a;
            object = this.u;
            object.getClass();
            object2 = object[(int)l16 & ((Object[])object).length - 1];
            object = object2;
            if (object2 instanceof ad4) {
                object = ((ad4)object2).p;
            }
            vd0Array.a = l16 + 1L;
            vd0Array = this.v(l17);
        }
        // MONITOREXIT : this
        int n16 = vd0Array.length;
        int n17 = 0;
        while (n17 < n16) {
            object2 = vd0Array[n17];
            if (object2 != null) {
                object2.resumeWith(j15.a);
            }
            ++n17;
        }
        return object;
    }

    public final void u(long l16, long l17, long l18, long l19) {
        long l26 = Math.min(l17, l16);
        for (long i16 = this.o(); i16 < l26; ++i16) {
            Object[] objectArray = this.u;
            objectArray.getClass();
            g12.d(objectArray, i16, null);
        }
        this.v = l16;
        this.w = l17;
        this.x = (int)(l18 - l26);
        this.y = (int)(l19 - l18);
    }

    /*
     * Exception decompiling
     */
    public final vd0[] v(long var1_1) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Statement already marked as first in another block
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.Op03SimpleStatement.markFirstStatementInBlock(Op03SimpleStatement.java:461)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.Misc.markWholeBlock(Misc.java:251)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.considerAsSimpleIf(ConditionalRewriter.java:673)
         *     at org.benf.cfr.reader.bytecode.analysis.opgraph.op3rewriters.ConditionalRewriter.identifyNonjumpingConditionals(ConditionalRewriter.java:56)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisInner(CodeAnalyser.java:760)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysisOrWrapFail(CodeAnalyser.java:278)
         *     at org.benf.cfr.reader.bytecode.CodeAnalyser.getAnalysis(CodeAnalyser.java:201)
         *     at org.benf.cfr.reader.entities.attributes.AttributeCode.analyse(AttributeCode.java:94)
         *     at org.benf.cfr.reader.entities.Method.analyse(Method.java:531)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseMid(ClassFile.java:1055)
         *     at org.benf.cfr.reader.entities.ClassFile.analyseTop(ClassFile.java:942)
         *     at org.benf.cfr.reader.Driver.doJarVersionTypes(Driver.java:257)
         *     at org.benf.cfr.reader.Driver.doJar(Driver.java:139)
         *     at org.benf.cfr.reader.CfrDriverImpl.analyse(CfrDriverImpl.java:76)
         *     at org.benf.cfr.reader.Main.main(Main.java:54)
         */
        throw new IllegalStateException("Decompilation failed");
    }
}

