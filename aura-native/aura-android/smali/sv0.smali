.class public interface abstract Lsv0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Loo0;


# direct methods
.method public static synthetic I(Lsv0;Lnc;Luo;FLym4;I)V
    .locals 0

    .line 1
    and-int/lit8 p5, p5, 0x8

    .line 2
    .line 3
    if-eqz p5, :cond_0

    .line 4
    .line 5
    sget-object p4, Lc71;->d:Lc71;

    .line 6
    .line 7
    :cond_0
    invoke-interface {p0, p1, p2, p3, p4}, Lsv0;->d(Lnc;Luo;FLq05;)V

    .line 8
    .line 9
    .line 10
    return-void
.end method

.method public static l(Lsv0;JJI)V
    .locals 13

    .line 1
    and-int/lit8 v0, p5, 0x4

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    invoke-interface {p0}, Lsv0;->P()J

    .line 7
    .line 8
    .line 9
    move-result-wide v2

    .line 10
    const/16 v0, 0x20

    .line 11
    .line 12
    shr-long v4, v2, v0

    .line 13
    .line 14
    long-to-int v4, v4

    .line 15
    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 20
    .line 21
    .line 22
    move-result v5

    .line 23
    sub-float/2addr v4, v5

    .line 24
    const-wide v5, 0xffffffffL

    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    and-long/2addr v2, v5

    .line 30
    long-to-int v2, v2

    .line 31
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 32
    .line 33
    .line 34
    move-result v2

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v3

    .line 39
    sub-float/2addr v2, v3

    .line 40
    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 41
    .line 42
    .line 43
    move-result v3

    .line 44
    int-to-long v3, v3

    .line 45
    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 46
    .line 47
    .line 48
    move-result v2

    .line 49
    int-to-long v7, v2

    .line 50
    shl-long v2, v3, v0

    .line 51
    .line 52
    and-long v4, v7, v5

    .line 53
    .line 54
    or-long/2addr v2, v4

    .line 55
    move-wide v9, v2

    .line 56
    goto :goto_0

    .line 57
    :cond_0
    move-wide/from16 v9, p3

    .line 58
    .line 59
    :goto_0
    sget-object v11, Lc71;->d:Lc71;

    .line 60
    .line 61
    and-int/lit8 v0, p5, 0x40

    .line 62
    .line 63
    if-eqz v0, :cond_1

    .line 64
    .line 65
    const/4 v1, 0x3

    .line 66
    :cond_1
    move v12, v1

    .line 67
    const-wide/16 v7, 0x0

    .line 68
    .line 69
    move-object v4, p0

    .line 70
    move-wide v5, p1

    .line 71
    invoke-interface/range {v4 .. v12}, Lsv0;->H(JJJLq05;I)V

    .line 72
    .line 73
    .line 74
    return-void
.end method

.method public static p(Lsv0;Lcc;JJFLdt;II)V
    .locals 13

    .line 1
    move/from16 v0, p9

    .line 2
    .line 3
    and-int/lit8 v1, v0, 0x10

    .line 4
    .line 5
    if-eqz v1, :cond_0

    .line 6
    .line 7
    move-wide v8, p2

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move-wide/from16 v8, p4

    .line 10
    .line 11
    :goto_0
    and-int/lit16 v0, v0, 0x200

    .line 12
    .line 13
    if-eqz v0, :cond_1

    .line 14
    .line 15
    const/4 v0, 0x1

    .line 16
    move v12, v0

    .line 17
    goto :goto_1

    .line 18
    :cond_1
    move/from16 v12, p8

    .line 19
    .line 20
    :goto_1
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    move-object v2, p0

    .line 23
    move-object v3, p1

    .line 24
    move-wide v6, p2

    .line 25
    move/from16 v10, p6

    .line 26
    .line 27
    move-object/from16 v11, p7

    .line 28
    .line 29
    invoke-interface/range {v2 .. v12}, Lsv0;->U(Lcc;JJJFLdt;I)V

    .line 30
    .line 31
    .line 32
    return-void
.end method


# virtual methods
.method public abstract H(JJJLq05;I)V
.end method

.method public abstract O()Li61;
.end method

.method public P()J
    .locals 2

    .line 1
    invoke-interface {p0}, Lsv0;->O()Li61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Li61;->j()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    return-wide v0
.end method

.method public abstract U(Lcc;JJJFLdt;I)V
.end method

.method public W()J
    .locals 2

    .line 1
    invoke-interface {p0}, Lsv0;->O()Li61;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    invoke-virtual {p0}, Li61;->j()J

    .line 6
    .line 7
    .line 8
    move-result-wide v0

    .line 9
    invoke-static {v0, v1}, Lh12;->q(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    return-wide v0
.end method

.method public abstract d(Lnc;Luo;FLq05;)V
.end method

.method public abstract getLayoutDirection()Lr62;
.end method
