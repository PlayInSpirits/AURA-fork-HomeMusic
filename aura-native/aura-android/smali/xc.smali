.class public final Lxc;
.super Landroid/text/TextPaint;
.source "r8-map-id-c94d3a8396624b0fca5ed6d968a7de7d9963d9466fdd82d32aef401cc7c21189"


# instance fields
.field public a:Lgc;

.field public b:Lsr4;

.field public c:I

.field public d:Lxb4;

.field public e:Lx40;

.field public f:Luo;

.field public g:Ldp0;

.field public h:Lqf4;

.field public i:Lq05;


# virtual methods
.method public final a()Lgc;
    .locals 1

    .line 1
    iget-object v0, p0, Lxc;->a:Lgc;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    return-object v0

    .line 6
    :cond_0
    new-instance v0, Lgc;

    .line 7
    .line 8
    invoke-direct {v0, p0}, Lgc;-><init>(Landroid/graphics/Paint;)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lxc;->a:Lgc;

    .line 12
    .line 13
    return-object v0
.end method

.method public final b(I)V
    .locals 1

    .line 1
    iget v0, p0, Lxc;->c:I

    .line 2
    .line 3
    if-ne p1, v0, :cond_0

    .line 4
    .line 5
    return-void

    .line 6
    :cond_0
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 7
    .line 8
    .line 9
    move-result-object v0

    .line 10
    invoke-virtual {v0, p1}, Lgc;->e(I)V

    .line 11
    .line 12
    .line 13
    iput p1, p0, Lxc;->c:I

    .line 14
    .line 15
    return-void
.end method

.method public final c(Luo;JF)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    iput-object v0, p0, Lxc;->g:Ldp0;

    .line 5
    .line 6
    iput-object v0, p0, Lxc;->f:Luo;

    .line 7
    .line 8
    iput-object v0, p0, Lxc;->h:Lqf4;

    .line 9
    .line 10
    invoke-virtual {p0, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 11
    .line 12
    .line 13
    return-void

    .line 14
    :cond_0
    instance-of v1, p1, Lzh4;

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    check-cast p1, Lzh4;

    .line 19
    .line 20
    iget-wide p1, p1, Lzh4;->u:J

    .line 21
    .line 22
    invoke-static {p1, p2, p4}, Lrr2;->M(JF)J

    .line 23
    .line 24
    .line 25
    move-result-wide p1

    .line 26
    invoke-virtual {p0, p1, p2}, Lxc;->d(J)V

    .line 27
    .line 28
    .line 29
    return-void

    .line 30
    :cond_1
    instance-of v1, p1, Lpv;

    .line 31
    .line 32
    if-eqz v1, :cond_6

    .line 33
    .line 34
    iget-object v1, p0, Lxc;->f:Luo;

    .line 35
    .line 36
    invoke-static {v1, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    .line 38
    .line 39
    move-result v1

    .line 40
    if-eqz v1, :cond_3

    .line 41
    .line 42
    iget-object v1, p0, Lxc;->h:Lqf4;

    .line 43
    .line 44
    if-nez v1, :cond_2

    .line 45
    .line 46
    const/4 v1, 0x0

    .line 47
    goto :goto_0

    .line 48
    :cond_2
    iget-wide v1, v1, Lqf4;->a:J

    .line 49
    .line 50
    invoke-static {v1, v2, p2, p3}, Lqf4;->a(JJ)Z

    .line 51
    .line 52
    .line 53
    move-result v1

    .line 54
    :goto_0
    if-nez v1, :cond_4

    .line 55
    .line 56
    :cond_3
    const-wide v1, 0x7fc000007fc00000L    # 2.247117487993712E307

    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    cmp-long v1, p2, v1

    .line 62
    .line 63
    if-eqz v1, :cond_4

    .line 64
    .line 65
    iput-object p1, p0, Lxc;->f:Luo;

    .line 66
    .line 67
    new-instance v1, Lqf4;

    .line 68
    .line 69
    invoke-direct {v1, p2, p3}, Lqf4;-><init>(J)V

    .line 70
    .line 71
    .line 72
    iput-object v1, p0, Lxc;->h:Lqf4;

    .line 73
    .line 74
    new-instance v1, Lwc;

    .line 75
    .line 76
    invoke-direct {v1, p1, p2, p3}, Lwc;-><init>(Luo;J)V

    .line 77
    .line 78
    .line 79
    sget-object p1, Lph4;->a:Lz05;

    .line 80
    .line 81
    new-instance p1, Ldp0;

    .line 82
    .line 83
    invoke-direct {p1, v1, v0}, Ldp0;-><init>(Lgf1;Lrv2;)V

    .line 84
    .line 85
    .line 86
    iput-object p1, p0, Lxc;->g:Ldp0;

    .line 87
    .line 88
    :cond_4
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 89
    .line 90
    .line 91
    move-result-object p1

    .line 92
    iget-object p2, p0, Lxc;->g:Ldp0;

    .line 93
    .line 94
    if-eqz p2, :cond_5

    .line 95
    .line 96
    invoke-virtual {p2}, Ldp0;->getValue()Ljava/lang/Object;

    .line 97
    .line 98
    .line 99
    move-result-object p2

    .line 100
    check-cast p2, Landroid/graphics/Shader;

    .line 101
    .line 102
    goto :goto_1

    .line 103
    :cond_5
    move-object p2, v0

    .line 104
    :goto_1
    iput-object p2, p1, Lgc;->c:Ljava/lang/Object;

    .line 105
    .line 106
    iget-object p1, p1, Lgc;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast p1, Landroid/graphics/Paint;

    .line 109
    .line 110
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 111
    .line 112
    .line 113
    iput-object v0, p0, Lxc;->e:Lx40;

    .line 114
    .line 115
    invoke-static {p0, p4}, Lgh0;->C(Landroid/text/TextPaint;F)V

    .line 116
    .line 117
    .line 118
    return-void

    .line 119
    :cond_6
    invoke-static {}, Ler1;->n()V

    .line 120
    .line 121
    .line 122
    return-void
.end method

.method public final d(J)V
    .locals 2

    .line 1
    iget-object v0, p0, Lxc;->e:Lx40;

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    const/4 v0, 0x0

    .line 6
    goto :goto_0

    .line 7
    :cond_0
    iget-wide v0, v0, Lx40;->a:J

    .line 8
    .line 9
    invoke-static {v0, v1, p1, p2}, Lx40;->c(JJ)Z

    .line 10
    .line 11
    .line 12
    move-result v0

    .line 13
    :goto_0
    if-nez v0, :cond_1

    .line 14
    .line 15
    const-wide/16 v0, 0x10

    .line 16
    .line 17
    cmp-long v0, p1, v0

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    new-instance v0, Lx40;

    .line 22
    .line 23
    invoke-direct {v0, p1, p2}, Lx40;-><init>(J)V

    .line 24
    .line 25
    .line 26
    iput-object v0, p0, Lxc;->e:Lx40;

    .line 27
    .line 28
    invoke-static {p1, p2}, Le35;->U(J)I

    .line 29
    .line 30
    .line 31
    move-result p1

    .line 32
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    .line 34
    .line 35
    const/4 p1, 0x0

    .line 36
    iput-object p1, p0, Lxc;->g:Ldp0;

    .line 37
    .line 38
    iput-object p1, p0, Lxc;->f:Luo;

    .line 39
    .line 40
    iput-object p1, p0, Lxc;->h:Lqf4;

    .line 41
    .line 42
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 43
    .line 44
    .line 45
    :cond_1
    return-void
.end method

.method public final e(Lq05;)V
    .locals 4

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto/16 :goto_2

    .line 4
    .line 5
    :cond_0
    iget-object v0, p0, Lxc;->i:Lq05;

    .line 6
    .line 7
    invoke-static {v0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 8
    .line 9
    .line 10
    move-result v0

    .line 11
    if-nez v0, :cond_9

    .line 12
    .line 13
    iput-object p1, p0, Lxc;->i:Lq05;

    .line 14
    .line 15
    sget-object v0, Lc71;->d:Lc71;

    .line 16
    .line 17
    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    sget-object p1, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 24
    .line 25
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 26
    .line 27
    .line 28
    return-void

    .line 29
    :cond_1
    instance-of v0, p1, Lym4;

    .line 30
    .line 31
    if-eqz v0, :cond_8

    .line 32
    .line 33
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    const/4 v1, 0x1

    .line 38
    invoke-virtual {v0, v1}, Lgc;->h(I)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 42
    .line 43
    .line 44
    move-result-object v0

    .line 45
    check-cast p1, Lym4;

    .line 46
    .line 47
    iget v2, p1, Lym4;->d:F

    .line 48
    .line 49
    iget-object v0, v0, Lgc;->b:Ljava/lang/Object;

    .line 50
    .line 51
    check-cast v0, Landroid/graphics/Paint;

    .line 52
    .line 53
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 57
    .line 58
    .line 59
    move-result-object v0

    .line 60
    iget v2, p1, Lym4;->e:F

    .line 61
    .line 62
    iget-object v0, v0, Lgc;->b:Ljava/lang/Object;

    .line 63
    .line 64
    check-cast v0, Landroid/graphics/Paint;

    .line 65
    .line 66
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeMiter(F)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 70
    .line 71
    .line 72
    move-result-object v0

    .line 73
    iget v2, p1, Lym4;->g:I

    .line 74
    .line 75
    iget-object v0, v0, Lgc;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v0, Landroid/graphics/Paint;

    .line 78
    .line 79
    const/4 v3, 0x2

    .line 80
    if-nez v2, :cond_2

    .line 81
    .line 82
    sget-object v2, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 83
    .line 84
    goto :goto_0

    .line 85
    :cond_2
    if-ne v2, v3, :cond_3

    .line 86
    .line 87
    sget-object v2, Landroid/graphics/Paint$Join;->BEVEL:Landroid/graphics/Paint$Join;

    .line 88
    .line 89
    goto :goto_0

    .line 90
    :cond_3
    if-ne v2, v1, :cond_4

    .line 91
    .line 92
    sget-object v2, Landroid/graphics/Paint$Join;->ROUND:Landroid/graphics/Paint$Join;

    .line 93
    .line 94
    goto :goto_0

    .line 95
    :cond_4
    sget-object v2, Landroid/graphics/Paint$Join;->MITER:Landroid/graphics/Paint$Join;

    .line 96
    .line 97
    :goto_0
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setStrokeJoin(Landroid/graphics/Paint$Join;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 101
    .line 102
    .line 103
    move-result-object v0

    .line 104
    iget p1, p1, Lym4;->f:I

    .line 105
    .line 106
    iget-object v0, v0, Lgc;->b:Ljava/lang/Object;

    .line 107
    .line 108
    check-cast v0, Landroid/graphics/Paint;

    .line 109
    .line 110
    if-ne p1, v3, :cond_5

    .line 111
    .line 112
    sget-object p1, Landroid/graphics/Paint$Cap;->SQUARE:Landroid/graphics/Paint$Cap;

    .line 113
    .line 114
    goto :goto_1

    .line 115
    :cond_5
    if-ne p1, v1, :cond_6

    .line 116
    .line 117
    sget-object p1, Landroid/graphics/Paint$Cap;->ROUND:Landroid/graphics/Paint$Cap;

    .line 118
    .line 119
    goto :goto_1

    .line 120
    :cond_6
    if-nez p1, :cond_7

    .line 121
    .line 122
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 123
    .line 124
    goto :goto_1

    .line 125
    :cond_7
    sget-object p1, Landroid/graphics/Paint$Cap;->BUTT:Landroid/graphics/Paint$Cap;

    .line 126
    .line 127
    :goto_1
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setStrokeCap(Landroid/graphics/Paint$Cap;)V

    .line 128
    .line 129
    .line 130
    invoke-virtual {p0}, Lxc;->a()Lgc;

    .line 131
    .line 132
    .line 133
    move-result-object p0

    .line 134
    iget-object p0, p0, Lgc;->b:Ljava/lang/Object;

    .line 135
    .line 136
    check-cast p0, Landroid/graphics/Paint;

    .line 137
    .line 138
    const/4 p1, 0x0

    .line 139
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 140
    .line 141
    .line 142
    return-void

    .line 143
    :cond_8
    invoke-static {}, Ler1;->n()V

    .line 144
    .line 145
    .line 146
    :cond_9
    :goto_2
    return-void
.end method

.method public final f(Lxb4;)V
    .locals 5

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lxc;->d:Lxb4;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iput-object p1, p0, Lxc;->d:Lxb4;

    .line 13
    .line 14
    sget-object v0, Lxb4;->d:Lxb4;

    .line 15
    .line 16
    invoke-virtual {p1, v0}, Lxb4;->equals(Ljava/lang/Object;)Z

    .line 17
    .line 18
    .line 19
    move-result p1

    .line 20
    if-eqz p1, :cond_1

    .line 21
    .line 22
    invoke-virtual {p0}, Landroid/graphics/Paint;->clearShadowLayer()V

    .line 23
    .line 24
    .line 25
    return-void

    .line 26
    :cond_1
    iget-object p1, p0, Lxc;->d:Lxb4;

    .line 27
    .line 28
    iget v0, p1, Lxb4;->c:F

    .line 29
    .line 30
    const/4 v1, 0x0

    .line 31
    cmpg-float v1, v0, v1

    .line 32
    .line 33
    if-nez v1, :cond_2

    .line 34
    .line 35
    const/4 v0, 0x1

    .line 36
    :cond_2
    iget-wide v1, p1, Lxb4;->b:J

    .line 37
    .line 38
    const/16 p1, 0x20

    .line 39
    .line 40
    shr-long/2addr v1, p1

    .line 41
    long-to-int p1, v1

    .line 42
    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 43
    .line 44
    .line 45
    move-result p1

    .line 46
    iget-object v1, p0, Lxc;->d:Lxb4;

    .line 47
    .line 48
    iget-wide v1, v1, Lxb4;->b:J

    .line 49
    .line 50
    const-wide v3, 0xffffffffL

    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    and-long/2addr v1, v3

    .line 56
    long-to-int v1, v1

    .line 57
    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    .line 58
    .line 59
    .line 60
    move-result v1

    .line 61
    iget-object v2, p0, Lxc;->d:Lxb4;

    .line 62
    .line 63
    iget-wide v2, v2, Lxb4;->a:J

    .line 64
    .line 65
    invoke-static {v2, v3}, Le35;->U(J)I

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    invoke-virtual {p0, v0, p1, v1, v2}, Landroid/graphics/Paint;->setShadowLayer(FFFI)V

    .line 70
    .line 71
    .line 72
    :cond_3
    :goto_0
    return-void
.end method

.method public final g(Lsr4;)V
    .locals 3

    .line 1
    if-nez p1, :cond_0

    .line 2
    .line 3
    goto :goto_1

    .line 4
    :cond_0
    iget-object v0, p0, Lxc;->b:Lsr4;

    .line 5
    .line 6
    invoke-static {v0, p1}, Lh12;->c(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 7
    .line 8
    .line 9
    move-result v0

    .line 10
    if-nez v0, :cond_3

    .line 11
    .line 12
    iput-object p1, p0, Lxc;->b:Lsr4;

    .line 13
    .line 14
    iget p1, p1, Lsr4;->a:I

    .line 15
    .line 16
    or-int/lit8 v0, p1, 0x1

    .line 17
    .line 18
    const/4 v1, 0x0

    .line 19
    const/4 v2, 0x1

    .line 20
    if-ne v0, p1, :cond_1

    .line 21
    .line 22
    move p1, v2

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move p1, v1

    .line 25
    :goto_0
    invoke-virtual {p0, p1}, Landroid/graphics/Paint;->setUnderlineText(Z)V

    .line 26
    .line 27
    .line 28
    iget-object p1, p0, Lxc;->b:Lsr4;

    .line 29
    .line 30
    iget p1, p1, Lsr4;->a:I

    .line 31
    .line 32
    or-int/lit8 v0, p1, 0x2

    .line 33
    .line 34
    if-ne v0, p1, :cond_2

    .line 35
    .line 36
    move v1, v2

    .line 37
    :cond_2
    invoke-virtual {p0, v1}, Landroid/graphics/Paint;->setStrikeThruText(Z)V

    .line 38
    .line 39
    .line 40
    :cond_3
    :goto_1
    return-void
.end method
