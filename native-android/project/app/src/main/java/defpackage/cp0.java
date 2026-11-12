package defpackage;

/*
 * Decompiled with CFR 0.152.
 */
public final class cp0
extends tl4 {
    public static final Object h = new Object();
    public long c;
    public int d;
    public p03 e;
    public Object f;
    public int g;

    public cp0(long l16) {
        super(l16);
        p03 p032 = r73.a;
        p032.getClass();
        this.e = p032;
        this.f = h;
    }

    @Override
    public final void a(tl4 tl42) {
        tl42.getClass();
        tl42 = (cp0)tl42;
        this.e = ((cp0)tl42).e;
        this.f = ((cp0)tl42).f;
        this.g = ((cp0)tl42).g;
    }

    @Override
    public final tl4 b(long l16) {
        return new cp0(l16);
    }

    /*
     * Unable to fully structure code
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean c(dp0 var1_1, ch4 var2_4) {
        block9: {
            var11_5 = jh4.c;
            synchronized (var11_5) {
                block8: {
                    try {
                        var7_6 = this.c;
                        var9_7 = var2_4.g();
                        var6_8 = true;
                        if (var7_6 != var9_7) break block8;
                    }
                    catch (Throwable var1_2) {
                        ** break block10
                    }
                    var3_9 = this.d;
                    var4_10 = var2_4.h();
                    if (var3_9 != var4_10) break block8;
                    var3_9 = 0;
                    break block9;
                }
                var3_9 = 1;
            }
        }
        if (this.f == cp0.h) return false;
        var5_11 = var6_8;
        if (var3_9 != 0) {
            if (this.g != this.d(var1_1, var2_4)) return false;
            var5_11 = var6_8;
        }
        if (var5_11 == false) return var5_11;
        if (var3_9 == 0) return var5_11;
        synchronized (var11_5) {
            this.c = var2_4.g();
            this.d = var2_4.h();
            return var5_11;
        }
lbl-1000:
        // 1 sources

        {
            throw var1_2;
        }
    }

    /*
     * Exception decompiling
     */
    public final int d(dp0 var1_1, ch4 var2_3) {
        /*
         * This method has failed to decompile.  When submitting a bug report, please provide this stack trace, and (if you hold appropriate legal rights) the relevant class file.
         * 
         * org.benf.cfr.reader.util.ConfusedCFRException: Back jump on a try block [egrp 5[TRYBLOCK] [5 : 494->524)] java.lang.Throwable
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
}

