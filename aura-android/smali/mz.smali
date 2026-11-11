.class public final Lmz;
.super Ljava/lang/Object;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"

# interfaces
.implements Lsv0;


# instance fields
.field public final n:Llz;

.field public final o:Li61;

.field public p:Lgc;

.field public q:Lgc;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Llz;

    .line 5
    .line 6
    sget-object v1, Lgb;->b:Lro0;

    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    .line 11
    iput-object v1, v0, Llz;->a:Loo0;

    .line 12
    .line 13
    sget-object v1, Lr62;->n:Lr62;

    .line 14
    .line 15
    iput-object v1, v0, Llz;->b:Lr62;

    .line 16
    .line 17
    sget-object v1, Lp01;->a:Lp01;

    .line 18
    .line 19
    iput-object v1, v0, Llz;->c:Ljz;

    .line 20
    .line 21
    const-wide/16 v1, 0x0

    .line 22
    .line 23
    iput-wide v1, v0, Llz;->d:J

    .line 24
    .line 25
    iput-object v0, p0, Lmz;->n:Llz;

    .line 26
    .line 27
    new-instance v0, Li61;

    .line 28
    .line 29
    invoke-direct {v0, p0}, Li61;-><init>(Lmz;)V

    .line 30
    .line 31
    .line 32
    iput-object v0, p0, Lmz;->o:Li61;

    .line 33
    .line 34
    return-void
.end method

.method public static a(Lmz;JLq05;I)Lgc;
    .locals 2

    .line 1
    invoke-virtual {p0, p3}, Lmz;->c(Lq05;)Lgc;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    iget-object p3, p0, Lgc;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p3, Landroid/graphics/Paint;

    .line 8
    .line 9
    invoke-virtual {p0}, Lgc;->a()J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-static {v0, v1, p1, p2}, Lx40;->c(JJ)Z

    .line 14
    .line 15
    .line 16
    move-result v0

    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    invoke-virtual {p0, p1, p2}, Lgc;->f(J)V

    .line 20
    .line 21
    .line 22
    :cond_0
    iget-object p1, p0, Lgc;->c:Ljava/lang/Object;

    .line 23
    .line 24
    check-cast p1, Landroid/graphics/Shader;

    .line 25
    .line 26
    const/4 p2, 0x0

    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iput-object p2, p0, Lgc;->c:Ljava/lang/Object;

    .line 30
    .line 31
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 32
    .line 33
    .line 34
    :cond_1
    iget-object p1, p0, Lgc;->d:Ljava/lang/Object;

    .line 35
    .line 36
    check-cast p1, Ldt;

    .line 37
    .line 38
    invoke-static {p1, p2}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 39
    .line 40
    .line 41
    move-result p1

    .line 42
    if-nez p1, :cond_2

    .line 43
    .line 44
    invoke-virtual {p0, p2}, Lgc;->g(Ldt;)V

    .line 45
    .line 46
    .line 47
    :cond_2
    iget p1, p0, Lgc;->a:I

    .line 48
    .line 49
    if-ne p1, p4, :cond_3

    .line 50
    .line 51
    goto :goto_0

    .line 52
    :cond_3
    invoke-virtual {p0, p4}, Lgc;->e(I)V

    .line 53
    .line 54
    .line 55
    :goto_0
    invoke-virtual {p3}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 56
    .line 57
    .line 58
    move-result p1

    .line 59
    const/4 p2, 0x1

    .line 60
    if-ne p1, p2, :cond_4

    .line 61
    .line 62
    return-object p0

    .line 63
    :cond_4
    invoke-virtual {p3, p2}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 64
    .line 65
    .line 66
    return-object p0
.end method


# virtual methods
.method public final H(JJJLq05;I)V
    .locals 7

    .line 1
    iget-object v0, p0, Lmz;->n:Llz;

    .line 2
    .line 3
    iget-object v0, v0, Llz;->c:Ljz;

    .line 4
    .line 5
    const/16 v1, 0x20

    .line 6
    .line 7
    shr-long v2, p3, v1

    .line 8
    .line 9
    long-to-int v2, v2

    .line 10
    move-wide v3, p1

    .line 11
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 12
    .line 13
    .line 14
    move-result p1

    .line 15
    const-wide v5, 0xffffffffL

    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    and-long p2, p3, v5

    .line 21
    .line 22
    long-to-int p2, p2

    .line 23
    move p3, p2

    .line 24
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 25
    .line 26
    .line 27
    move-result p2

    .line 28
    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 29
    .line 30
    .line 31
    move-result p4

    .line 32
    shr-long v1, p5, v1

    .line 33
    .line 34
    long-to-int v1, v1

    .line 35
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 36
    .line 37
    .line 38
    move-result v1

    .line 39
    add-float/2addr v1, p4

    .line 40
    invoke-static {p3}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 41
    .line 42
    .line 43
    move-result p3

    .line 44
    and-long p4, p5, v5

    .line 45
    .line 46
    long-to-int p4, p4

    .line 47
    invoke-static {p4}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 48
    .line 49
    .line 50
    move-result p4

    .line 51
    add-float/2addr p4, p3

    .line 52
    invoke-static {p0, v3, v4, p7, p8}, Lmz;->a(Lmz;JLq05;I)Lgc;

    .line 53
    .line 54
    .line 55
    move-result-object p5

    .line 56
    move-object p0, v0

    .line 57
    move p3, v1

    .line 58
    invoke-interface/range {p0 .. p5}, Ljz;->g(FFFFLgc;)V

    .line 59
    .line 60
    .line 61
    return-void
.end method

.method public final J()F
    .locals 0

    .line 1
    iget-object p0, p0, Lmz;->n:Llz;

    .line 2
    .line 3
    iget-object p0, p0, Llz;->a:Loo0;

    .line 4
    .line 5
    invoke-interface {p0}, Loo0;->J()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final O()Li61;
    .locals 0

    .line 1
    iget-object p0, p0, Lmz;->o:Li61;

    .line 2
    .line 3
    return-object p0
.end method

.method public final U(Lcc;JJJFLdt;I)V
    .locals 12

    .line 1
    sget-object v2, Lc71;->d:Lc71;

    .line 2
    .line 3
    iget-object v0, p0, Lmz;->n:Llz;

    .line 4
    .line 5
    iget-object v6, v0, Llz;->c:Ljz;

    .line 6
    .line 7
    const/4 v1, 0x0

    .line 8
    move-object v0, p0

    .line 9
    move/from16 v3, p8

    .line 10
    .line 11
    move-object/from16 v4, p9

    .line 12
    .line 13
    move/from16 v5, p10

    .line 14
    .line 15
    invoke-virtual/range {v0 .. v5}, Lmz;->b(Luo;Lq05;FLdt;I)Lgc;

    .line 16
    .line 17
    .line 18
    move-result-object v11

    .line 19
    move-object v4, p1

    .line 20
    move-wide/from16 v7, p4

    .line 21
    .line 22
    move-wide/from16 v9, p6

    .line 23
    .line 24
    move-object v3, v6

    .line 25
    move-wide v5, p2

    .line 26
    invoke-interface/range {v3 .. v11}, Ljz;->b(Lcc;JJJLgc;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method

.method public final b(Luo;Lq05;FLdt;I)Lgc;
    .locals 3

    .line 1
    invoke-virtual {p0, p2}, Lmz;->c(Lq05;)Lgc;

    .line 2
    .line 3
    .line 4
    move-result-object p2

    .line 5
    iget-object v0, p2, Lgc;->b:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast v0, Landroid/graphics/Paint;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    invoke-interface {p0}, Lsv0;->P()J

    .line 12
    .line 13
    .line 14
    move-result-wide v1

    .line 15
    invoke-virtual {p1, v1, v2, p2, p3}, Luo;->d(JLgc;F)V

    .line 16
    .line 17
    .line 18
    goto :goto_0

    .line 19
    :cond_0
    iget-object p0, p2, Lgc;->c:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p0, Landroid/graphics/Shader;

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    const/4 p0, 0x0

    .line 26
    iput-object p0, p2, Lgc;->c:Ljava/lang/Object;

    .line 27
    .line 28
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p2}, Lgc;->a()J

    .line 32
    .line 33
    .line 34
    move-result-wide p0

    .line 35
    sget-wide v1, Lx40;->b:J

    .line 36
    .line 37
    invoke-static {p0, p1, v1, v2}, Lx40;->c(JJ)Z

    .line 38
    .line 39
    .line 40
    move-result p0

    .line 41
    if-nez p0, :cond_2

    .line 42
    .line 43
    invoke-virtual {p2, v1, v2}, Lgc;->f(J)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {v0}, Landroid/graphics/Paint;->getAlpha()I

    .line 47
    .line 48
    .line 49
    move-result p0

    .line 50
    int-to-float p0, p0

    .line 51
    const/high16 p1, 0x437f0000    # 255.0f

    .line 52
    .line 53
    div-float/2addr p0, p1

    .line 54
    cmpg-float p0, p0, p3

    .line 55
    .line 56
    if-nez p0, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p2, p3}, Lgc;->d(F)V

    .line 60
    .line 61
    .line 62
    :goto_0
    iget-object p0, p2, Lgc;->d:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast p0, Ldt;

    .line 65
    .line 66
    invoke-static {p0, p4}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 67
    .line 68
    .line 69
    move-result p0

    .line 70
    if-nez p0, :cond_4

    .line 71
    .line 72
    invoke-virtual {p2, p4}, Lgc;->g(Ldt;)V

    .line 73
    .line 74
    .line 75
    :cond_4
    iget p0, p2, Lgc;->a:I

    .line 76
    .line 77
    const/4 p1, 0x3

    .line 78
    if-ne p0, p1, :cond_5

    .line 79
    .line 80
    goto :goto_1

    .line 81
    :cond_5
    invoke-virtual {p2, p1}, Lgc;->e(I)V

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-virtual {v0}, Landroid/graphics/Paint;->isFilterBitmap()Z

    .line 85
    .line 86
    .line 87
    move-result p0

    .line 88
    if-ne p0, p5, :cond_6

    .line 89
    .line 90
    return-object p2

    .line 91
    :cond_6
    const/4 p0, 0x1

    .line 92
    if-nez p5, :cond_7

    .line 93
    .line 94
    move p1, p0

    .line 95
    goto :goto_2

    .line 96
    :cond_7
    const/4 p1, 0x0

    .line 97
    :goto_2
    xor-int/2addr p0, p1

    .line 98
    invoke-virtual {v0, p0}, Landroid/graphics/Paint;->setFilterBitmap(Z)V

    .line 99
    .line 100
    .line 101
    return-object p2
.end method

.method public final c(Lq05;)Lgc;
    .locals 8

    .line 1
    sget-object v0, Lc71;->d:Lc71;

    .line 2
    .line 3
    invoke-static {p1, v0}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object p1, p0, Lmz;->p:Lgc;

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    invoke-static {}, Lfh0;->b()Lgc;

    .line 15
    .line 16
    .line 17
    move-result-object p1

    .line 18
    invoke-virtual {p1, v1}, Lgc;->h(I)V

    .line 19
    .line 20
    .line 21
    iput-object p1, p0, Lmz;->p:Lgc;

    .line 22
    .line 23
    :cond_0
    return-object p1

    .line 24
    :cond_1
    instance-of v0, p1, Lym4;

    .line 25
    .line 26
    if-eqz v0, :cond_15

    .line 27
    .line 28
    iget-object v0, p0, Lmz;->q:Lgc;

    .line 29
    .line 30
    const/4 v2, 0x1

    .line 31
    if-nez v0, :cond_2

    .line 32
    .line 33
    invoke-static {}, Lfh0;->b()Lgc;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v0, v2}, Lgc;->h(I)V

    .line 38
    .line 39
    .line 40
    iput-object v0, p0, Lmz;->q:Lgc;

    .line 41
    .line 42
    :cond_2
    iget-object p0, v0, Lgc;->b:Ljava/lang/Object;

    .line 43
    .line 44
    check-cast p0, Landroid/graphics/Paint;

    .line 45
    .line 46
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 47
    .line 48
    .line 49
    move-result v3

    .line 50
    check-cast p1, Lym4;

    .line 51
    .line 52
    iget v4, p1, Lym4;->d:F

    .line 53
    .line 54
    cmpg-float v3, v3, v4

    .line 55
    .line 56
    if-nez v3, :cond_3

    .line 57
    .line 58
    goto :goto_0

    .line 59
    :cond_3
    invoke-virtual {p0, v4}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 60
    .line 61
    .line 62
    :goto_0
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeCap()Landroid/graphics/Paint$Cap;

    .line 63
    .line 64
    .line 65
    move-result-object v3

    .line 66
    const/4 v4, -0x1

    .line 67
    if-nez v3, :cond_4

    .line 68
    .line 69
    move v3, v4

    .line 70
    goto :goto_1

    .line 71
    :cond_4
    sget-object v5, Lhc;->a:[I

    .line 72
    .line 73
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 74
    .line 75
    .line 76
    move-result v3

    .line 77
    aget v3, v5, v3

    .line 78
    .line 79
    :goto_1
    const/4 v5, 0x3

    .line 80
    const/4 v6, 0x2

    .line 81
    if-eq v3, v2, :cond_7

    .line 82
    .line 83
    if-eq v3, v6, :cond_6

    .line 84
    .line 85
    if-eq v3, v5, :cond_5

    .line 86
    .line 87
    goto :goto_2

    .line 88
    :cond_5
    move v3, v6

    .line 89
    goto :goto_3

    .line 90
    :cond_6
    move v3, v2

    .line 91
    goto :goto_3

    .line 92
    :cond_7
    :goto_2
    move v3, v1

    .line 93
    :goto_3
    iget v7, p1, Lym4;->f:I

    .line 94
    .line 95
    if-ne v3, v7, :cond_8

    .line 96
    .line 97
    goto :goto_5

    .line 98
    :cond_8
    if-ne v7, v6, :cond_9

    .line 99
    .line 100
    sget-object v3, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 101
    .line 102
    goto :goto_4

    .line 103
    :cond_9
    if-ne v7, v2, :cond_a

    .line 104
    .line 105
    sget-object v3, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_a
    if-nez v7, :cond_b

    .line 109
    .line 110
    sget-object v3, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 111
    .line 112
    goto :goto_4

    .line 113
    :cond_b
    sget-object v3, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 114
    .line 115
    :goto_4
    invoke-virtual {p0, v3}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 116
    .line 117
    .line 118
    :goto_5
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeMiter()F

    .line 119
    .line 120
    .line 121
    move-result v3

    .line 122
    iget v7, p1, Lym4;->e:F

    .line 123
    .line 124
    cmpg-float v3, v3, v7

    .line 125
    .line 126
    if-nez v3, :cond_c

    .line 127
    .line 128
    goto :goto_6

    .line 129
    :cond_c
    invoke-virtual {p0, v7}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 130
    .line 131
    .line 132
    :goto_6
    invoke-virtual {p0}, Landroid/graphics/Paint;->getStrokeJoin()Landroid/graphics/Paint$Join;

    .line 133
    .line 134
    .line 135
    move-result-object v3

    .line 136
    if-nez v3, :cond_d

    .line 137
    .line 138
    goto :goto_7

    .line 139
    :cond_d
    sget-object v4, Lhc;->b:[I

    .line 140
    .line 141
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 142
    .line 143
    .line 144
    move-result v3

    .line 145
    aget v4, v4, v3

    .line 146
    .line 147
    :goto_7
    if-eq v4, v2, :cond_10

    .line 148
    .line 149
    if-eq v4, v6, :cond_f

    .line 150
    .line 151
    if-eq v4, v5, :cond_e

    .line 152
    .line 153
    goto :goto_8

    .line 154
    :cond_e
    move v1, v2

    .line 155
    goto :goto_8

    .line 156
    :cond_f
    move v1, v6

    .line 157
    :cond_10
    :goto_8
    iget p1, p1, Lym4;->g:I

    .line 158
    .line 159
    if-ne v1, p1, :cond_11

    .line 160
    .line 161
    return-object v0

    .line 162
    :cond_11
    if-nez p1, :cond_12

    .line 163
    .line 164
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 165
    .line 166
    goto :goto_9

    .line 167
    :cond_12
    if-ne p1, v6, :cond_13

    .line 168
    .line 169
    sget-object p1, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 170
    .line 171
    goto :goto_9

    .line 172
    :cond_13
    if-ne p1, v2, :cond_14

    .line 173
    .line 174
    sget-object p1, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 175
    .line 176
    goto :goto_9

    .line 177
    :cond_14
    sget-object p1, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 178
    .line 179
    :goto_9
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 180
    .line 181
    .line 182
    return-object v0

    .line 183
    :cond_15
    invoke-static {}, Ler1;->n()V

    .line 184
    .line 185
    .line 186
    const/4 p0, 0x0

    .line 187
    return-object p0
.end method

.method public final d(Lnc;Luo;FLq05;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lmz;->n:Llz;

    .line 2
    .line 3
    iget-object v0, v0, Llz;->c:Ljz;

    .line 4
    .line 5
    const/4 v5, 0x0

    .line 6
    const/4 v6, 0x1

    .line 7
    move-object v1, p0

    .line 8
    move-object v2, p2

    .line 9
    move v4, p3

    .line 10
    move-object v3, p4

    .line 11
    invoke-virtual/range {v1 .. v6}, Lmz;->b(Luo;Lq05;FLdt;I)Lgc;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    invoke-interface {v0, p1, p0}, Ljz;->c(Lnc;Lgc;)V

    .line 16
    .line 17
    .line 18
    return-void
.end method

.method public final g()F
    .locals 0

    .line 1
    iget-object p0, p0, Lmz;->n:Llz;

    .line 2
    .line 3
    iget-object p0, p0, Llz;->a:Loo0;

    .line 4
    .line 5
    invoke-interface {p0}, Loo0;->g()F

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method

.method public final getLayoutDirection()Lr62;
    .locals 0

    .line 1
    iget-object p0, p0, Lmz;->n:Llz;

    .line 2
    .line 3
    iget-object p0, p0, Llz;->b:Lr62;

    .line 4
    .line 5
    return-object p0
.end method
