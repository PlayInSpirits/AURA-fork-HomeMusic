.class public final Ljm0;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Ly43;


# instance fields
.field public final n:Llm0;

.field public final o:Lr62;


# direct methods
.method public constructor <init>(Llm0;Lr62;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljm0;->n:Llm0;

    .line 5
    .line 6
    iput-object p2, p0, Ljm0;->o:Lr62;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final R(IJJ)J
    .locals 0

    .line 1
    const/4 p0, 0x2

    .line 2
    if-ne p1, p0, :cond_1

    .line 3
    .line 4
    const/16 p0, 0x20

    .line 5
    .line 6
    shr-long p0, p4, p0

    .line 7
    .line 8
    long-to-int p0, p0

    .line 9
    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 10
    .line 11
    .line 12
    move-result p0

    .line 13
    const/4 p1, 0x0

    .line 14
    cmpg-float p0, p0, p1

    .line 15
    .line 16
    if-nez p0, :cond_0

    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    new-instance p0, Ljava/util/concurrent/CancellationException;

    .line 20
    .line 21
    const-string p1, "Scroll cancelled"

    .line 22
    .line 23
    invoke-direct {p0, p1}, Ljava/util/concurrent/CancellationException;-><init>(Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    throw p0

    .line 27
    :cond_1
    :goto_0
    const-wide/16 p0, 0x0

    .line 28
    .line 29
    return-wide p0
.end method

.method public final b0(JJLvd0;)Ljava/lang/Object;
    .locals 0

    .line 1
    const/4 p0, 0x0

    .line 2
    const/4 p1, 0x1

    .line 3
    invoke-static {p3, p4, p0, p0, p1}, Lk45;->a(JFFI)J

    .line 4
    .line 5
    .line 6
    move-result-wide p0

    .line 7
    new-instance p2, Lk45;

    .line 8
    .line 9
    invoke-direct {p2, p0, p1}, Lk45;-><init>(J)V

    .line 10
    .line 11
    .line 12
    return-object p2
.end method

.method public final x(IJ)J
    .locals 8

    .line 1
    const/4 v0, 0x1

    .line 2
    if-ne p1, v0, :cond_3

    .line 3
    .line 4
    iget-object p1, p0, Ljm0;->n:Llm0;

    .line 5
    .line 6
    invoke-virtual {p1}, Lad3;->l()F

    .line 7
    .line 8
    .line 9
    move-result v1

    .line 10
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 11
    .line 12
    .line 13
    move-result v1

    .line 14
    float-to-double v1, v1

    .line 15
    const-wide v3, 0x3eb0c6f7a0b5ed8dL    # 1.0E-6

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    cmpl-double v1, v1, v3

    .line 21
    .line 22
    if-lez v1, :cond_3

    .line 23
    .line 24
    const/16 v1, 0x20

    .line 25
    .line 26
    shr-long v2, p2, v1

    .line 27
    .line 28
    long-to-int v2, v2

    .line 29
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 30
    .line 31
    .line 32
    move-result v3

    .line 33
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 34
    .line 35
    .line 36
    move-result v3

    .line 37
    const/4 v4, 0x0

    .line 38
    cmpl-float v3, v3, v4

    .line 39
    .line 40
    if-lez v3, :cond_3

    .line 41
    .line 42
    invoke-virtual {p1}, Lad3;->m()Lqc3;

    .line 43
    .line 44
    .line 45
    move-result-object v3

    .line 46
    invoke-virtual {p1}, Lad3;->l()F

    .line 47
    .line 48
    .line 49
    move-result v5

    .line 50
    invoke-virtual {p1}, Lad3;->o()I

    .line 51
    .line 52
    .line 53
    move-result v6

    .line 54
    int-to-float v6, v6

    .line 55
    mul-float/2addr v5, v6

    .line 56
    iget v6, v3, Lqc3;->b:I

    .line 57
    .line 58
    iget v3, v3, Lqc3;->c:I

    .line 59
    .line 60
    add-int/2addr v6, v3

    .line 61
    int-to-float v3, v6

    .line 62
    invoke-virtual {p1}, Lad3;->l()F

    .line 63
    .line 64
    .line 65
    move-result v6

    .line 66
    invoke-static {v6}, Ljava/lang/Math;->signum(F)F

    .line 67
    .line 68
    .line 69
    move-result v6

    .line 70
    neg-float v6, v6

    .line 71
    mul-float/2addr v3, v6

    .line 72
    add-float/2addr v3, v5

    .line 73
    invoke-virtual {p1}, Lad3;->l()F

    .line 74
    .line 75
    .line 76
    move-result v6

    .line 77
    cmpl-float v4, v6, v4

    .line 78
    .line 79
    if-lez v4, :cond_0

    .line 80
    .line 81
    move v7, v5

    .line 82
    move v5, v3

    .line 83
    move v3, v7

    .line 84
    :cond_0
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    invoke-static {v2, v5, v3}, Lgb;->l(FFF)F

    .line 89
    .line 90
    .line 91
    move-result v2

    .line 92
    iget-object p0, p0, Ljm0;->o:Lr62;

    .line 93
    .line 94
    sget-object v3, Lr62;->o:Lr62;

    .line 95
    .line 96
    if-ne p0, v3, :cond_1

    .line 97
    .line 98
    goto :goto_0

    .line 99
    :cond_1
    const/4 v0, 0x0

    .line 100
    :goto_0
    iget-object p0, p1, Lad3;->k:Lml3;

    .line 101
    .line 102
    if-eqz v0, :cond_2

    .line 103
    .line 104
    invoke-virtual {p0, v2}, Lml3;->d(F)F

    .line 105
    .line 106
    .line 107
    move-result p0

    .line 108
    goto :goto_1

    .line 109
    :cond_2
    neg-float p1, v2

    .line 110
    invoke-virtual {p0, p1}, Lml3;->d(F)F

    .line 111
    .line 112
    .line 113
    move-result p0

    .line 114
    neg-float p0, p0

    .line 115
    :goto_1
    const-wide v2, 0xffffffffL

    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    and-long p1, p2, v2

    .line 121
    .line 122
    long-to-int p1, p1

    .line 123
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 124
    .line 125
    .line 126
    move-result p1

    .line 127
    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 128
    .line 129
    .line 130
    move-result p0

    .line 131
    int-to-long p2, p0

    .line 132
    invoke-static {p1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    .line 133
    .line 134
    .line 135
    move-result p0

    .line 136
    int-to-long p0, p0

    .line 137
    shl-long/2addr p2, v1

    .line 138
    and-long/2addr p0, v2

    .line 139
    or-long/2addr p0, p2

    .line 140
    return-wide p0

    .line 141
    :cond_3
    const-wide/16 p0, 0x0

    .line 142
    .line 143
    return-wide p0
.end method
